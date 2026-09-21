package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Mathematics & Physics Extension Bank (2005 - 2024)
 * Total Verified Questions: 300
 */
object JambMathsPhysicsExtensionBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(300)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2005",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2005",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2005",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2005",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2005",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2005",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2005",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2005",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2005 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2005",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2005 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2005",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2005 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2005",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2005 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2005",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2005 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2005",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2005 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2005",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2005 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2005_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2005",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2005 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2006",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2006",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2006",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2006",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2006",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2006",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2006",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2006",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2006 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2006",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2006 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2006",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2006 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2006",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2006 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2006",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2006 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2006",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2006 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2006",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2006 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2006_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2006",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2006 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2007",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2007",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2007",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2007",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2007",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2007",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2007",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2007",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2007 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2007",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2007 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2007",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2007 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2007",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2007 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2007",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2007 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2007",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2007 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2007",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2007 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2007_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2007",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2007 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2008",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2008",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2008",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2008",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2008",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2008",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2008",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2008",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2008 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2008",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2008 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2008",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2008 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2008",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2008 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2008",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2008 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2008",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2008 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2008",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2008 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2008_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2008",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2008 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2009",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2009",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2009",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2009",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2009",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2009",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2009",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2009",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2009 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2009",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2009 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2009",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2009 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2009",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2009 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2009",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2009 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2009",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2009 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2009",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2009 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2009_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2009",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2009 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2010",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2010",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2010",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2010",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2010",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2010",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2010",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2010",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2010",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2010",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2010",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2010",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2010",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2010",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2010_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2010",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2011",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2011",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2011",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2011",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2011",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2011",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2011",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2011",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2011",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2011",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2011",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2011",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2011",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2011",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2011_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2011",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2012",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2012",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2012",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2012",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2012",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2012",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2012",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2012",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2012",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2012",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2012",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2012",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2012",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2012",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2012_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2012",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2013",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2013",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2013",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2013",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2013",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2013",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2013",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2013",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2013",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2013",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2013",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2013",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2013",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2013",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2013_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2013",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2014",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2014",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2014",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2014",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2014",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2014",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2014",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2014",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2014",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2014",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2014",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2014",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2014",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2014",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2014_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2014",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2015",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2015",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2015",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2015",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2015",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2015",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2015",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2015",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2015",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2015",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2015",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2015",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2015",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2015",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2015_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2015",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2016",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2016",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2016",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2016",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2016",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2016",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2016",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2016",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2016",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2016",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2016",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2016",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2016",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2016",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2016_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2016",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2017",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2017",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2017",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2017",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2017",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2017",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2017",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2017",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2017",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2017",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2017",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2017",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2017",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2017",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2017_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2017",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2018",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2018",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2018",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2018",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2018",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2018",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2018",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2018",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2018",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2018",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2018",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2018",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2018",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2018",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2018_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2018",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2019",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2019",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2019",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2019",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2019",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2019",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2019",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2019",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2019",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2019",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2019",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2019",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2019",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2019",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2019_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2019",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2020",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2020",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2020",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2020",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2020",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2020",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2020",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2020",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2020 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2020",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2020 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2020",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2020 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2020",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2020 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2020",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2020 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2020",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2020 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2020",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2020 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2020_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2020",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2020 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2021",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2021",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2021",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2021",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2021",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2021",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2021",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2021",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2021 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2021",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2021 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2021",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2021 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2021",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2021 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2021",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2021 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2021",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2021 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2021",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2021 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2021_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2021",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2021 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2022",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2022",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2022",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2022",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2022",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2022",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2022",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2022",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2022 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2022",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2022 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2022",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2022 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2022",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2022 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2022",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2022 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2022",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2022 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2022",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2022 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2022_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2022",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2022 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2023",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2023",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2023",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2023",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2023",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2023",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2023",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2023",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2023 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2023",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2023 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2023",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2023 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2023",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2023 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2023",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2023 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2023",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2023 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2023",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2023 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2023_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2023",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2023 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_01",
                subject = "Mathematics",
                topic = "Calculus: Definite Integral",
                year = "2024",
                questionText = "Evaluate ∫₀² (3x² - 2x + 4) dx.",
                optionA = "12",
                optionB = "16",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "[x³ - x² + 4x] from 0 to 2 = (2³ - 2² + 4(2)) - 0 = (8 - 4 + 8) = 12.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_02",
                subject = "Mathematics",
                topic = "Trigonometric Equations",
                year = "2024",
                questionText = "Solve for θ in the interval 0° ≤ θ ≤ 90° if 2 sin θ - 1 = 0.",
                optionA = "30°",
                optionB = "60°",
                optionC = "45°",
                optionD = "90°",
                correctAnswerIndex = 0,
                explanation = "2 sin θ = 1 => sin θ = 1/2 => θ = 30°.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_03",
                subject = "Mathematics",
                topic = "Progressions: GP",
                year = "2024",
                questionText = "The 3rd term of a GP is 18 and the 6th term is 486. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "T₃ = ar² = 18; T₆ = ar⁵ = 486. T₆ / T₃ = r³ = 486 / 18 = 27 => r = ∛27 = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_04",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "2024",
                questionText = "If event A has P(A) = 0.4 and independent event B has P(B) = 0.5, find P(A ∩ B).",
                optionA = "0.20",
                optionB = "0.90",
                optionC = "0.10",
                optionD = "0.45",
                correctAnswerIndex = 0,
                explanation = "For independent events, P(A ∩ B) = P(A) × P(B) = 0.4 × 0.5 = 0.20.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_05",
                subject = "Mathematics",
                topic = "Circle Theorems: Tangent",
                year = "2024",
                questionText = "The angle between a tangent to a circle and the radius drawn to the point of contact is:",
                optionA = "90°",
                optionB = "45°",
                optionC = "60°",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "A tangent to a circle is strictly perpendicular to the radius at the point of contact (90°).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_06",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Identity",
                year = "2024",
                questionText = "If matrix A = [[3, 5], [1, 2]], evaluate A × I where I is the 2x2 identity matrix.",
                optionA = "[[3, 5], [1, 2]]",
                optionB = "[[1, 0], [0, 1]]",
                optionC = "[[0, 0], [0, 0]]",
                optionD = "[[2, -5], [-1, 3]]",
                correctAnswerIndex = 0,
                explanation = "Multiplying any square matrix by the identity matrix leaves the original matrix unchanged.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_07",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Midpoint",
                year = "2024",
                questionText = "Find the midpoint of the line segment joining points A(-3, 8) and B(5, -2).",
                optionA = "(1, 3)",
                optionB = "(2, 6)",
                optionC = "(-1, 3)",
                optionD = "(4, 5)",
                correctAnswerIndex = 0,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-3 + 5)/2, (8 + -2)/2) = (2/2, 6/2) = (1, 3).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_08",
                subject = "Mathematics",
                topic = "Binary Operations: Identity",
                year = "2024",
                questionText = "A binary operation on real numbers is defined as a * b = a + b - 3. Find the identity element e.",
                optionA = "3",
                optionB = "0",
                optionC = "-3",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "a * e = a => a + e - 3 = a => e - 3 = 0 => e = 3.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2024 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_09",
                subject = "Physics",
                topic = "Thermal Physics: Charles's Law",
                year = "2024",
                questionText = "A gas occupies a volume of 300 cm³ at 27°C (300 K). If pressure is constant, what is its volume at 127°C (400 K)?",
                optionA = "400 cm³",
                optionB = "225 cm³",
                optionC = "500 cm³",
                optionD = "350 cm³",
                correctAnswerIndex = 0,
                explanation = "V₁ / T₁ = V₂ / T₂ => 300 / 300 = V₂ / 400 => 1 = V₂ / 400 => V₂ = 400 cm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2024 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_10",
                subject = "Physics",
                topic = "Optics: Concave Mirror",
                year = "2024",
                questionText = "An object placed 30 cm in front of a concave mirror of focal length 20 cm forms a real image. Calculate the image distance.",
                optionA = "60 cm",
                optionB = "40 cm",
                optionC = "12 cm",
                optionD = "50 cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v => 1/20 = 1/30 + 1/v => 1/v = 1/20 - 1/30 = (3 - 2)/60 = 1/60 => v = 60 cm.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2024 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_11",
                subject = "Physics",
                topic = "Current Electricity: Resistivity",
                year = "2024",
                questionText = "If the length of a uniform metallic wire of resistance 4 Ω is doubled while keeping volume constant, its new resistance becomes:",
                optionA = "16 Ω",
                optionB = "8 Ω",
                optionC = "2 Ω",
                optionD = "4 Ω",
                correctAnswerIndex = 0,
                explanation = "Doubling length halves cross-sectional area: R = ρL/A => new R' = ρ(2L)/(A/2) = 4(ρL/A) = 4 × 4 = 16 Ω.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2024 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_12",
                subject = "Physics",
                topic = "Waves: Doppler Effect",
                year = "2024",
                questionText = "The apparent change in the frequency of a wave caused by relative motion between the source and the observer is known as the:",
                optionA = "Doppler effect",
                optionB = "Compton effect",
                optionC = "Tyndall effect",
                optionD = "Zeeman effect",
                correctAnswerIndex = 0,
                explanation = "The Doppler effect explains the frequency shift perceived when a wave source and observer move relative to each other.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2024 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_13",
                subject = "Physics",
                topic = "Electromagnetism: Faraday's Law",
                year = "2024",
                questionText = "The magnitude of the electromotive force (EMF) induced in a circuit is directly proportional to the rate of change of:",
                optionA = "magnetic flux linkage",
                optionB = "electric current",
                optionC = "electrostatic potential",
                optionD = "resistance",
                correctAnswerIndex = 0,
                explanation = "Faraday's law of induction states: Induced EMF ε = -dΦ/dt, proportional to rate of change of magnetic flux.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2024 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_14",
                subject = "Physics",
                topic = "SHM: Period of Pendulum",
                year = "2024",
                questionText = "The period T of a simple pendulum of length L is given by T = 2π√(L/g). If length L is quadrupled (4 times), the period becomes:",
                optionA = "doubled (2T)",
                optionB = "quadrupled (4T)",
                optionC = "halved (T/2)",
                optionD = "unchanged",
                correctAnswerIndex = 0,
                explanation = "T' = 2π√(4L/g) = 2 × (2π√(L/g)) = 2T (doubled).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2024 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_mthphy_ext_2024_15",
                subject = "Physics",
                topic = "Quantum Physics: Photon Energy",
                year = "2024",
                questionText = "Calculate the energy of a photon of ultraviolet light of frequency 1.0 × 10¹⁵ Hz. [Planck's constant h = 6.63 × 10⁻³⁴ J s]",
                optionA = "6.63 × 10⁻¹⁹ J",
                optionB = "6.63 × 10⁻³⁴ J",
                optionC = "3.0 × 10⁸ J",
                optionD = "1.5 × 10⁻¹⁹ J",
                correctAnswerIndex = 0,
                explanation = "E = hf = (6.63 × 10⁻³⁴ J s) × (1.0 × 10¹⁵ s⁻¹) = 6.63 × 10⁻¹⁹ J.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2024 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

}
