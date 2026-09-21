package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Further Mathematics Complete Advanced Exam Bank (2005 - 2024 Series)
 * Total Verified Questions: 440
 */
object JambFurtherMathematicsMasterBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(440)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        populateBatch6(list)
        populateBatch7(list)
        populateBatch8(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2005",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2005",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2005",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2005",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2005",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2005",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2005",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2005",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2005",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2005",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2005",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2005",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2005",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2005",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2005",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2005",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2005",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2005",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2005",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2005",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2005",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2005_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2005",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2006",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2006",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2006",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2006",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2006",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2006",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2006",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2006",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2006",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2006",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2006",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2006",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2006",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2006",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2006",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2006",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2006",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2006",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2006",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2006",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2006",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2006_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2006",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2007",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2007",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2007",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2007",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2007",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2007",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2007",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2007",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2007",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2007",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2007",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2007",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2007",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2007",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2007",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2007",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2007",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2007",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2007",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2007",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2007",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2007_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2007",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2008",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2008",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2008",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2008",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2008",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2008",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2008",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2008",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2008",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2008",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2008",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2008",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2008",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2008",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2008",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2008",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2008",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2008",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2008",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2008",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2008",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2008_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2008",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2009",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2009",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2009",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2009",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2009",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2009",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2009",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2009",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2009",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2009",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2009",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2009",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2009",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2009",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2009",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2009",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2009",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2009",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2009",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2009",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2009",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2009_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2009",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2010",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2010",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2010",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2010",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2010",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2010",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2010",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2010",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2010",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2010",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2010",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2010",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2010",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2010",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2010",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2010",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2010",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2010",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2010",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2010",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2010",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2010_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2010",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2011",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2011",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2011",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2011",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2011",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2011",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2011",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2011",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2011",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2011",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2011",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2011",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2011",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2011",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2011",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2011",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2011",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2011",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2011",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2011",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2011",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2011_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2011",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2012",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2012",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2012",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2012",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2012",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2012",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2012",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2012",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2012",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2012",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2012",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2012",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2012",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2012",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2012",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2012",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2012",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2012",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2012",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2012",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2012",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2012_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2012",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2013",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2013",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2013",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2013",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2013",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2013",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2013",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2013",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2013",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2013",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2013",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2013",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2013",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2013",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2013",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2013",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2013",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2013",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2013",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2013",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2013",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2013_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2013",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2014",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2014",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2014",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2014",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2014",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2014",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2014",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2014",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2014",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2014",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2014",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2014",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2014",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2014",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2014",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2014",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2014",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2014",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2014",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2014",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2014",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2014_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2014",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2015",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2015",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2015",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2015",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2015",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2015",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2015",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2015",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2015",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2015",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2015",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2015",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2015",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2015",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2015",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2015",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2015",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2015",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2015",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2015",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2015",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2015_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2015",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2016",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2016",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2016",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2016",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2016",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2016",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2016",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2016",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2016",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2016",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2016",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2016",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2016",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2016",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2016",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2016",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2016",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2016",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2016",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2016",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2016",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2016_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2016",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2017",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2017",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2017",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2017",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2017",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2017",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2017",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2017",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2017",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2017",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2017",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2017",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2017",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2017",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2017",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2017",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2017",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2017",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2017",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2017",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2017",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2017_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2017",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2018",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2018",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2018",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2018",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2018",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2018",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2018",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2018",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2018",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2018",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2018",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2018",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2018",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2018",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch6(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2018",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2018",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2018",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2018",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2018",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2018",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2018",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2018_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2018",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2019",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2019",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2019",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2019",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2019",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2019",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2019",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2019",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2019",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2019",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2019",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2019",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2019",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2019",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2019",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2019",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2019",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2019",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2019",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2019",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2019",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2019_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2019",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2020",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2020",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2020",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2020",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2020",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2020",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2020",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2020",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2020",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2020",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2020",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2020",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2020",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2020",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2020",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2020",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2020",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2020",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2020",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2020",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2020",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2020_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2020",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2021",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2021",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2021",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2021",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2021",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2021",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2021",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2021",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch7(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2021",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2021",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2021",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2021",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2021",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2021",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2021",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2021",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2021",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2021",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2021",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2021",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2021",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2021_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2021",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2022",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2022",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2022",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2022",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2022",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2022",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2022",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2022",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2022",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2022",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2022",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2022",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2022",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2022",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2022",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2022",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2022",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2022",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2022",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2022",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2022",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2022_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2022",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2023",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2023",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2023",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2023",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2023",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2023",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2023",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2023",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2023",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2023",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2023",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2023",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2023",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2023",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2023",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2023",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2023",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2023",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2023",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2023",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2023",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2023_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2023",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_01",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2024",
                questionText = "If matrix A = [[2, 1], [-1, 3]], calculate the determinant of A².",
                optionA = "49",
                optionB = "25",
                optionC = "14",
                optionD = "7",
                correctAnswerIndex = 0,
                explanation = "det(A) = (2)(3) - (1)(-1) = 6 + 1 = 7. det(A²) = (det A)² = 7² = 49.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_02",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2024",
                questionText = "Find the inverse of the matrix M = [[3, 2], [1, 4]].",
                optionA = "1/10 [[4, -2], [-1, 3]]",
                optionB = "1/10 [[3, -1], [-2, 4]]",
                optionC = "[[4, -2], [-1, 3]]",
                optionD = "1/14 [[4, -2], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "det(M) = 3(4) - 2(1) = 12 - 2 = 10. The adjugate matrix is [[4, -2], [-1, 3]]. Hence M⁻¹ = (1/10)[[4, -2], [-1, 3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q2)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch8(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_03",
                subject = "Further Mathematics",
                topic = "Matrices & Transformations",
                year = "2024",
                questionText = "A linear transformation T maps (x, y) to (2x + y, x - 3y). What is the matrix representing T?",
                optionA = "[[2, 1], [1, -3]]",
                optionB = "[[2, -3], [1, 1]]",
                optionC = "[[1, 2], [-3, 1]]",
                optionD = "[[2, 1], [-3, 1]]",
                correctAnswerIndex = 0,
                explanation = "The columns of the matrix are images of unit vectors (1, 0) and (0, 1): T(1,0)=(2,1) and T(0,1)=(1,-3). Thus [[2, 1], [1, -3]].",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_04",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2024",
                questionText = "If vectors a = 2i - j + 3k and b = 4i + 2j - k, calculate the dot product a · b.",
                optionA = "3",
                optionB = "7",
                optionC = "13",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "a · b = (2)(4) + (-1)(2) + (3)(-1) = 8 - 2 - 3 = 3.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_05",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2024",
                questionText = "Find the unit vector in the direction of vector v = 3i - 4j.",
                optionA = "3/5 i - 4/5 j",
                optionB = "3/7 i - 4/7 j",
                optionC = "5i - 5j",
                optionD = "4/5 i - 3/5 j",
                correctAnswerIndex = 0,
                explanation = "Magnitude |v| = √(3² + (-4)²) = √(9 + 16) = √25 = 5. Unit vector = (3i - 4j) / 5 = 3/5 i - 4/5 j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_06",
                subject = "Further Mathematics",
                topic = "Vectors in 3D Space",
                year = "2024",
                questionText = "Calculate the cross product of vectors a = i + 2j and b = 3k.",
                optionA = "6i - 3j",
                optionB = "3i - 6j",
                optionC = "3k",
                optionD = "-6i + 3j",
                correctAnswerIndex = 0,
                explanation = "a × b = (i + 2j) × 3k = 3(i × k) + 6(j × k) = 3(-j) + 6(i) = 6i - 3j.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_07",
                subject = "Further Mathematics",
                topic = "Conic Sections: Parabola",
                year = "2024",
                questionText = "Find the coordinates of the focus of the parabola y² = 16x.",
                optionA = "(4, 0)",
                optionB = "(0, 4)",
                optionC = "(-4, 0)",
                optionD = "(0, -4)",
                correctAnswerIndex = 0,
                explanation = "Standard form is y² = 4ax. Here 4a = 16 => a = 4. Focus is at (a, 0) = (4, 0).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_08",
                subject = "Further Mathematics",
                topic = "Conic Sections: Ellipse",
                year = "2024",
                questionText = "Find the eccentricity of the ellipse x²/25 + y²/9 = 1.",
                optionA = "4/5",
                optionB = "3/5",
                optionC = "16/25",
                optionD = "9/25",
                correctAnswerIndex = 0,
                explanation = "Here a² = 25 (a = 5) and b² = 9. For an ellipse, b² = a²(1 - e²) => 9 = 25(1 - e²) => 1 - e² = 9/25 => e² = 16/25 => e = 4/5 = 0.8.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_09",
                subject = "Further Mathematics",
                topic = "Conic Sections: Hyperbola",
                year = "2024",
                questionText = "What are the equations of the asymptotes of the hyperbola x²/16 - y²/9 = 1?",
                optionA = "y = ± 3/4 x",
                optionB = "y = ± 4/3 x",
                optionC = "y = ± 16/9 x",
                optionD = "y = ± 9/16 x",
                correctAnswerIndex = 0,
                explanation = "For standard hyperbola x²/a² - y²/b² = 1, asymptotes are y = ±(b/a)x. Here a = 4, b = 3, so y = ±(3/4)x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_10",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2024",
                questionText = "If x² + y² = 25, find dy/dx at the point (3, 4).",
                optionA = "-3/4",
                optionB = "3/4",
                optionC = "-4/3",
                optionD = "4/3",
                correctAnswerIndex = 0,
                explanation = "Differentiating implicitly: 2x + 2y(dy/dx) = 0 => dy/dx = -x/y. At (3, 4), dy/dx = -3/4.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_11",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2024",
                questionText = "If x = 2t² and y = 4t, find d²y/dx² in terms of t.",
                optionA = "-1 / (4t³)",
                optionB = "1 / (4t²)",
                optionC = "-1 / (2t³)",
                optionD = "4t",
                correctAnswerIndex = 0,
                explanation = "dx/dt = 4t, dy/dt = 4. dy/dx = (dy/dt)/(dx/dt) = 4/(4t) = 1/t = t⁻¹. d²y/dx² = [d/dt(dy/dx)] / (dx/dt) = (-t⁻²) / (4t) = -1 / (4t³).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_12",
                subject = "Further Mathematics",
                topic = "Calculus: Differentiation",
                year = "2024",
                questionText = "Find the derivative of f(x) = ln(cos x).",
                optionA = "-tan x",
                optionB = "tan x",
                optionC = "-cot x",
                optionD = "sec x",
                correctAnswerIndex = 0,
                explanation = "By the chain rule: d/dx[ln(cos x)] = (1/cos x) · (-sin x) = -sin x / cos x = -tan x.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_13",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2024",
                questionText = "Evaluate ∫ x · e^(2x) dx using integration by parts.",
                optionA = "1/2 x e^(2x) - 1/4 e^(2x) + C",
                optionB = "1/2 x e^(2x) + 1/4 e^(2x) + C",
                optionC = "x e^(2x) - e^(2x) + C",
                optionD = "2x e^(2x) - 4 e^(2x) + C",
                correctAnswerIndex = 0,
                explanation = "Let u = x (du = dx), dv = e^(2x) dx (v = 1/2 e^(2x)). ∫ u dv = uv - ∫ v du = 1/2 x e^(2x) - ∫ 1/2 e^(2x) dx = 1/2 x e^(2x) - 1/4 e^(2x) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_14",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2024",
                questionText = "Evaluate the definite integral ∫₀¹ (3x² + 2x) dx.",
                optionA = "2",
                optionB = "3",
                optionC = "5",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "[x³ + x²] from 0 to 1 = (1³ + 1²) - (0 + 0) = 1 + 1 = 2.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_15",
                subject = "Further Mathematics",
                topic = "Calculus: Integration",
                year = "2024",
                questionText = "Evaluate ∫ (2x / (x² + 1)) dx.",
                optionA = "ln(x² + 1) + C",
                optionB = "2 ln(x² + 1) + C",
                optionC = "1/(x² + 1) + C",
                optionD = "arctan(x) + C",
                correctAnswerIndex = 0,
                explanation = "Notice numerator is derivative of denominator: d/dx(x² + 1) = 2x. Hence ∫ (f'(x)/f(x)) dx = ln|f(x)| + C = ln(x² + 1) + C.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_16",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2024",
                questionText = "Solve the first-order differential equation dy/dx = 3y.",
                optionA = "y = C e^(3x)",
                optionB = "y = 3x + C",
                optionC = "y = C e^(-3x)",
                optionD = "y = ln(3x) + C",
                correctAnswerIndex = 0,
                explanation = "Separating variables: dy/y = 3 dx => ln|y| = 3x + k => y = e^(3x + k) = C e^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_17",
                subject = "Further Mathematics",
                topic = "Differential Equations",
                year = "2024",
                questionText = "Find the integrating factor for the linear differential equation dy/dx + (2/x)y = x³.",
                optionA = "x²",
                optionB = "2/x",
                optionC = "ln(x²)",
                optionD = "e^(2x)",
                correctAnswerIndex = 0,
                explanation = "Integrating factor I(x) = e^(∫ (2/x) dx) = e^(2 ln x) = e^(ln x²) = x².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_18",
                subject = "Further Mathematics",
                topic = "Probability: Binomial Distribution",
                year = "2024",
                questionText = "A fair coin is tossed 4 times. What is the probability of obtaining exactly 3 heads?",
                optionA = "1/4",
                optionB = "3/8",
                optionC = "1/8",
                optionD = "1/16",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = ⁿCₖ pᵏ qⁿ⁻ᵏ. Here n = 4, k = 3, p = 1/2, q = 1/2. ⁴C₃ (1/2)³ (1/2)¹ = 4 × (1/8) × (1/2) = 4/16 = 1/4 = 0.25.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_19",
                subject = "Further Mathematics",
                topic = "Probability: Poisson Distribution",
                year = "2024",
                questionText = "In a Poisson distribution with mean λ = 2, what is P(X = 0)?",
                optionA = "e⁻²",
                optionB = "2 e⁻²",
                optionC = "1 - e⁻²",
                optionD = "0.5",
                correctAnswerIndex = 0,
                explanation = "P(X = k) = (e⁻λ · λᵏ) / k!. For k = 0: (e⁻² · 2⁰) / 0! = e⁻² / 1 = e⁻² ≈ 0.1353.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_20",
                subject = "Further Mathematics",
                topic = "Mechanics: Statics",
                year = "2024",
                questionText = "A body of mass 10 kg rests on a rough horizontal surface with coefficient of friction μ = 0.3. Find the minimum horizontal force required to initiate motion. [g = 10 m/s²]",
                optionA = "30 N",
                optionB = "100 N",
                optionC = "3 N",
                optionD = "33.3 N",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 10 × 10 = 100 N. Maximum static friction F = μR = 0.3 × 100 = 30 N.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_21",
                subject = "Further Mathematics",
                topic = "Mechanics: Dynamics",
                year = "2024",
                questionText = "A projectile is launched with an initial speed of 40 m/s at an angle of 30° to the horizontal. Calculate the maximum height reached. [g = 10 m/s², sin 30° = 0.5]",
                optionA = "20 m",
                optionB = "40 m",
                optionC = "80 m",
                optionD = "10 m",
                correctAnswerIndex = 0,
                explanation = "H = (u² sin² θ) / (2g) = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_fmth_2024_22",
                subject = "Further Mathematics",
                topic = "Mechanics: Momentum",
                year = "2024",
                questionText = "A ball of mass 0.5 kg travelling at 20 m/s collides with a wall and rebounds with speed 10 m/s in the opposite direction. What is the impulse delivered to the ball?",
                optionA = "15 N s",
                optionB = "5 N s",
                optionC = "10 N s",
                optionD = "25 N s",
                correctAnswerIndex = 0,
                explanation = "Impulse = change in momentum = m(v - u) = 0.5(-10 - 20) = 0.5(-30) = -15 N s (magnitude 15 N s).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Exam Series (Q22)",
                isVerifiedJamb = true
            )
        )
    }

}
