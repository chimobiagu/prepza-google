package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Physics past examination series
 * covering historical papers from 1983 through 2004.
 * Formatted into standard 4-option structure (A-D) with verified keys, topics,
 * and detailed step-by-step educational explanations.
 */
object JambPhysicsHistoricalQuestionBank {

    fun getHistoricalPhysicsQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 1983 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q1
        list.add(
            QuestionEntity(
                id = "phy_1983_01",
                subject = "Physics",
                topic = "Waves & Sound (Resonance in Closed Pipes)",
                year = "1983",
                questionText = "In a resonance tube experiment, a tube of fixed length is closed at one end and several tuning forks of increasing frequency are used to obtain resonance at the open end. If the tuning fork with the lowest frequency which gave resonance had a frequency f₁ and the next tuning fork to give resonance had a frequency f₂, find the ratio f₂ / f₁.",
                optionA = "8",
                optionB = "3",
                optionC = "2",
                optionD = "1/2",
                correctAnswerIndex = 1,
                explanation = "For a closed pipe of fixed length, resonance occurs only at odd harmonics: L = λ₁ / 4 ⇒ f₁ = v / (4L) (first harmonic / fundamental). The next resonance occurs at the third harmonic: L = 3λ₂ / 4 ⇒ f₂ = 3v / (4L). Therefore, the frequency ratio f₂ / f₁ = 3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "phy_1983_02",
                subject = "Physics",
                topic = "Scalars & Vectors",
                year = "1983",
                questionText = "Which of the following physical quantities is NOT a vector quantity?",
                optionA = "Force",
                optionB = "Altitude",
                optionC = "Weight",
                optionD = "Displacement",
                correctAnswerIndex = 1,
                explanation = "Altitude represents vertical height above a reference level (sea level) and is a scalar quantity described completely by magnitude alone. Force, weight, and displacement are all vector quantities requiring both magnitude and direction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "phy_1983_03",
                subject = "Physics",
                topic = "Friction & Equilibrium",
                year = "1983",
                questionText = "A brick at rest on a horizontal table is pulled by a horizontal cord. The force of friction on the brick:",
                optionA = "Increases if the pull increases but the brick does not move",
                optionB = "Is directly horizontal in the direction of the pull",
                optionC = "Decreases if an identical brick is placed on top of the first",
                optionD = "Is zero if the brick is pulled hard enough",
                correctAnswerIndex = 0,
                explanation = "As long as the brick remains stationary, static friction acts to balance the applied pulling force. Therefore, as the pull increases, the static frictional force increases correspondingly until it reaches its limiting value (f_s = μ_s · R).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "phy_1983_04",
                subject = "Physics",
                topic = "Gravitational Fields & Weight",
                year = "1983",
                questionText = "The force with which an object is attracted to the earth is called its:",
                optionA = "Acceleration",
                optionB = "Mass",
                optionC = "Impulse",
                optionD = "Weight",
                correctAnswerIndex = 3,
                explanation = "Weight (W = m · g) is defined as the downward gravitational force exerted by the Earth on an object of mass m.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "phy_1983_05",
                subject = "Physics",
                topic = "Optics & Refraction",
                year = "1983",
                questionText = "The refractive index of a liquid is 1.5. If the velocity of light in vacuum is 3.0 × 10⁸ m s⁻¹, find the velocity of light in the liquid.",
                optionA = "1.5 × 10⁸ m s⁻¹",
                optionB = "2.0 × 10⁸ m s⁻¹",
                optionC = "3.0 × 10⁸ m s⁻¹",
                optionD = "4.5 × 10⁸ m s⁻¹",
                correctAnswerIndex = 1,
                explanation = "The refractive index n is defined as n = c / v. Rearranging for velocity in the medium yields v = c / n = (3.0 × 10⁸ m/s) / 1.5 = 2.0 × 10⁸ m s⁻¹.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q6
        list.add(
            QuestionEntity(
                id = "phy_1983_06",
                subject = "Physics",
                topic = "Density & Upthrust",
                year = "1983",
                questionText = "If the relative density of a metal is 19, what will be the true mass of 20 cm³ of the metal when immersed in water?",
                optionA = "380 g",
                optionB = "400 g",
                optionC = "360 g",
                optionD = "180 g",
                correctAnswerIndex = 0,
                explanation = "The true mass of an object is an invariant property and remains constant regardless of immersion. Mass = density × volume = (19 g/cm³) × (20 cm³) = 380 g.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q7
        list.add(
            QuestionEntity(
                id = "phy_1983_07",
                subject = "Physics",
                topic = "Gas Laws & Kinetic Theory",
                year = "1983",
                questionText = "If the pressure on 1000 cm³ of an ideal gas is doubled while its absolute Kelvin temperature is halved, then the new volume of the gas will become:",
                optionA = "250 cm³",
                optionB = "500 cm³",
                optionC = "100 cm³",
                optionD = "200 cm³",
                correctAnswerIndex = 0,
                explanation = "Using the General Gas Law: (P₁ · V₁) / T₁ = (P₂ · V₂) / T₂. Since P₂ = 2P₁ and T₂ = 0.5T₁, substituting gives: (P₁ × 1000) / T₁ = (2P₁ × V₂) / (0.5T₁) ⇒ 1000 = 4V₂ ⇒ V₂ = 250 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q8
        list.add(
            QuestionEntity(
                id = "phy_1983_08",
                subject = "Physics",
                topic = "Linear Motion & Kinematics",
                year = "1983",
                questionText = "A train has an initial velocity of 44 m/s and a constant retardation (acceleration) of -4 m/s². Its velocity after 10 seconds is:",
                optionA = "2 m/s",
                optionB = "4 m/s",
                optionC = "8 m/s",
                optionD = "12 m/s",
                correctAnswerIndex = 1,
                explanation = "Applying the first equation of linear motion: v = u + at. Here, u = 44 m/s, a = -4 m/s², and t = 10 s. Thus, v = 44 + (-4 × 10) = 44 - 40 = 4 m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q9
        list.add(
            QuestionEntity(
                id = "phy_1983_09",
                subject = "Physics",
                topic = "Dynamics & Newton's Laws",
                year = "1983",
                questionText = "A resultant horizontal force of 16 N is applied to a 4.0 kg block that is initially at rest on a smooth horizontal surface. What is the velocity of the block at t = 5 seconds?",
                optionA = "4 m/s",
                optionB = "10 m/s",
                optionC = "20 m/s",
                optionD = "50 m/s",
                correctAnswerIndex = 2,
                explanation = "Using Newton's Second Law to calculate acceleration: a = F / m = 16 N / 4.0 kg = 4 m/s². Since the block starts from rest (u = 0), its final velocity is: v = u + at = 0 + (4 × 5) = 20 m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "phy_1983_10",
                subject = "Physics",
                topic = "Molecular Theory & Surface Film",
                year = "1983",
                questionText = "1,000 identical drops of oil of density 5000 kg/m³ have a total mass of 5 × 10⁻⁴ kg. One of the drops forms a thin circular film of area 0.5 m² on water. The thickness of the film is:",
                optionA = "2 × 10⁻⁸ m",
                optionB = "2 × 10⁻¹⁰ m",
                optionC = "2 × 10⁻⁷ m",
                optionD = "3 × 10⁻⁹ m",
                correctAnswerIndex = 1,
                explanation = "Mass of a single drop m = (5 × 10⁻⁴ kg) / 1000 = 5 × 10⁻⁷ kg. Volume V = m / ρ = (5 × 10⁻⁷) / 5000 = 1 × 10⁻¹⁰ m³. Since Volume = Area × thickness, thickness = (1 × 10⁻¹⁰) / 0.5 = 2 × 10⁻¹⁰ m.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q11
        list.add(
            QuestionEntity(
                id = "phy_1983_11",
                subject = "Physics",
                topic = "Elasticity & Hooke's Law",
                year = "1983",
                questionText = "The total length of a spring when a mass of 200 g is hung from its end is 14 cm, while its total length is 16 cm when a mass of 300 g is hung from the same end. Calculate the unstretched length of the spring assuming Hooke's law is obeyed.",
                optionA = "9.33 cm",
                optionB = "10.00 cm",
                optionC = "10.66 cm",
                optionD = "12.00 cm",
                correctAnswerIndex = 1,
                explanation = "Let the unstretched length be L₀. By Hooke's law: L = L₀ + e = L₀ + k·m. For 200 g: 14 = L₀ + 200k. For 300 g: 16 = L₀ + 300k. Subtracting yields 2 = 100k ⇒ k = 0.02 cm/g. Substituting back: 14 = L₀ + 200(0.02) ⇒ 14 = L₀ + 4 ⇒ L₀ = 10.00 cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q12
        list.add(
            QuestionEntity(
                id = "phy_1983_12",
                subject = "Physics",
                topic = "Atomic Structure & Nuclear Physics",
                year = "1983",
                questionText = "Which of the following statements regarding atomic structure is CORRECT?\nI. The mass number is equal to the total number of protons and electrons in an atom.\nII. The atomic number is equal to the number of protons in an atom.\nIII. The number of electrons in an atom is equal to the total number of protons and neutrons in the nucleus.",
                optionA = "I only",
                optionB = "II only",
                optionC = "III only",
                optionD = "I and II only",
                correctAnswerIndex = 1,
                explanation = "Statement II is correct because the atomic number (Z) is defined as the number of protons in the nucleus. Statement I is incorrect because mass number (A) = protons + neutrons. Statement III is incorrect because in a neutral atom, electrons equal protons.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q13
        list.add(
            QuestionEntity(
                id = "phy_1983_13",
                subject = "Physics",
                topic = "Optics & Refractive Index",
                year = "1983",
                questionText = "The speed of light in vacuum is 3.0 × 10⁸ m/s. If the refractive index of a transparent liquid is 4/3, then the speed of light in the liquid is:",
                optionA = "0.44 × 10⁸ m/s",
                optionB = "2.25 × 10⁸ m/s",
                optionC = "3.0 × 10⁸ m/s",
                optionD = "4.0 × 10⁸ m/s",
                correctAnswerIndex = 1,
                explanation = "The refractive index is n = c / v. Rearranging for v gives: v = c / n = (3.0 × 10⁸) / (4/3) = 3.0 × 10⁸ × (3/4) = 2.25 × 10⁸ m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // Q14
        list.add(
            QuestionEntity(
                id = "phy_1983_14",
                subject = "Physics",
                topic = "Electrostatics & Electric Fields",
                year = "1983",
                questionText = "If the electrostatic force on a test charge of 0.2 coulombs in an electric field is 4 N, then the electric field intensity of the field is:",
                optionA = "0.8 N/C",
                optionB = "20.0 N/C",
                optionC = "4.2 N/C",
                optionD = "8.0 N/C",
                correctAnswerIndex = 1,
                explanation = "Electric field intensity E is defined as force per unit positive charge: E = F / q = 4 N / 0.2 C = 20.0 N/C.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1983"
            )
        )

        // ==========================================
        // 1984 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q15
        list.add(
            QuestionEntity(
                id = "phy_1984_15",
                subject = "Physics",
                topic = "Kinematics & Graphical Analysis",
                year = "1984",
                questionText = "The distance travelled by a particle starting from rest is plotted against the square of the time elapsed (t²) from the commencement of motion. The resulting graph is linear. The slope of this graph is a measure of:",
                optionA = "Initial displacement",
                optionB = "Initial velocity",
                optionC = "Acceleration",
                optionD = "Half the acceleration",
                correctAnswerIndex = 3,
                explanation = "From the kinematic equation s = ut + ½at², with initial velocity u = 0, we have s = (½a)·t². In a graph of s against t², comparing to y = mx yields slope m = ½a (half the acceleration).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1984"
            )
        )

        // Q16
        list.add(
            QuestionEntity(
                id = "phy_1984_16",
                subject = "Physics",
                topic = "Current Electricity & Units",
                year = "1984",
                questionText = "The fundamental S.I. unit quantity of electric charge is called:",
                optionA = "The Ampere",
                optionB = "The Volt",
                optionC = "The Coulomb",
                optionD = "The Ohm",
                correctAnswerIndex = 2,
                explanation = "The Coulomb (C) is the SI unit of electric charge (quantity of electricity). One Coulomb is the charge transported by a constant current of one Ampere in one second (Q = I·t).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1984"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "phy_1984_17",
                subject = "Physics",
                topic = "Thermal Physics & Phase Changes",
                year = "1984",
                questionText = "If a solid changes directly into a gas without passing through an intermediate liquid state when heat is applied, the process is called:",
                optionA = "Vaporization",
                optionB = "Evaporation",
                optionC = "Sublimation",
                optionD = "Condensation",
                correctAnswerIndex = 2,
                explanation = "Sublimation is the direct phase transition of a substance from solid to gas without entering a liquid state (e.g., iodine, dry ice, ammonium chloride, naphthalene).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1984"
            )
        )

        // Q18
        list.add(
            QuestionEntity(
                id = "phy_1984_18",
                subject = "Physics",
                topic = "Vectors & Newton's Laws",
                year = "1984",
                questionText = "A body of mass 5 kg initially at rest is acted upon simultaneously by two mutually perpendicular forces of 12 N and 5 N. Calculate the magnitude of the acceleration produced.",
                optionA = "0.40 m s⁻²",
                optionB = "1.40 m s⁻²",
                optionC = "2.60 m s⁻²",
                optionD = "3.40 m s⁻²",
                correctAnswerIndex = 2,
                explanation = "Since the forces are perpendicular, resultant force F_R = √(12² + 5²) = √(144 + 25) = √169 = 13 N. By Newton's second law: a = F_R / m = 13 N / 5 kg = 2.60 m s⁻².",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1984"
            )
        )

        // Q19
        list.add(
            QuestionEntity(
                id = "phy_1984_19",
                subject = "Physics",
                topic = "Momentum & Collisions",
                year = "1984",
                questionText = "A gun of mass 2.0 kg fires a bullet of mass 1.6 × 10⁻² kg due East with a muzzle velocity of 150 m/s. What is the recoil velocity of the gun?",
                optionA = "1.2 m/s due West",
                optionB = "1.2 × 10⁻⁴ m/s due West",
                optionC = "1.2 m/s due East",
                optionD = "150 m/s due West",
                correctAnswerIndex = 0,
                explanation = "By the principle of conservation of linear momentum: m_gun · v_gun + m_bullet · v_bullet = 0 ⇒ v_gun = -(1.6 × 10⁻² kg × 150 m/s) / 2.0 kg = -1.2 m/s. The negative sign denotes motion opposite to East, which is 1.2 m/s due West.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1984"
            )
        )

        // ==========================================
        // 1985 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q20
        list.add(
            QuestionEntity(
                id = "phy_1985_20",
                subject = "Physics",
                topic = "Units & Dimensions",
                year = "1985",
                questionText = "Which of the following is NOT one of the seven base fundamental S.I. units?",
                optionA = "Metre",
                optionB = "Ampere",
                optionC = "Kelvin",
                optionD = "Radian",
                correctAnswerIndex = 3,
                explanation = "The seven fundamental SI base units are the metre, kilogram, second, ampere, kelvin, mole, and candela. The radian is a supplementary/derived unit used for plane angular measurement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1985"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "phy_1985_21",
                subject = "Physics",
                topic = "Simple Harmonic Motion (Pendulum)",
                year = "1985",
                questionText = "A simple pendulum with a period of 2.0 s has its length doubled. What is its new period?",
                optionA = "1.00 s",
                optionB = "1.41 s",
                optionC = "2.83 s",
                optionD = "4.00 s",
                correctAnswerIndex = 2,
                explanation = "The period of a simple pendulum is T = 2π√(L/g), meaning T ∝ √L. When length is doubled (L₂ = 2L₁), the new period is T₂ = T₁ × √2 = 2.0 × 1.414 = 2.83 s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1985"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "phy_1985_22",
                subject = "Physics",
                topic = "Kinematics & Motion Equations",
                year = "1985",
                questionText = "If a car starts from rest and moves with a uniform acceleration of 10 m s⁻² for 10 seconds, what distance does it cover in the last one second of the motion?",
                optionA = "95 m",
                optionB = "100 m",
                optionC = "500 m",
                optionD = "405 m",
                correctAnswerIndex = 0,
                explanation = "Total distance in 10 s: s₁₀ = ½ × 10 × 10² = 500 m. Distance in first 9 s: s₉ = ½ × 10 × 9² = 405 m. Distance covered in the 10th (last) second = s₁₀ - s₉ = 500 - 405 = 95 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1985"
            )
        )

        // Q23
        list.add(
            QuestionEntity(
                id = "phy_1985_23",
                subject = "Physics",
                topic = "Friction & Statics",
                year = "1985",
                questionText = "A metal block of mass 5 kg lies on a rough horizontal platform. If a horizontal force of 8 N applied to the block just causes it to slide, what is the coefficient of limiting friction between the block and the platform? [g = 10 m/s²]",
                optionA = "0.16",
                optionB = "0.63",
                optionC = "0.80",
                optionD = "1.60",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 5 × 10 = 50 N. Limiting friction F_L = 8 N. Coefficient of limiting friction μ = F_L / R = 8 / 50 = 0.16.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1985"
            )
        )

        // Q24
        list.add(
            QuestionEntity(
                id = "phy_1985_24",
                subject = "Physics",
                topic = "Mechanics & Types of Forces",
                year = "1985",
                questionText = "Which of the following physical quantities is NOT a force?",
                optionA = "Friction",
                optionB = "Tension",
                optionC = "Upthrust",
                optionD = "Impulse",
                correctAnswerIndex = 3,
                explanation = "Impulse is defined as Force × time (equal to change in momentum, with units N·s or kg·m/s). Friction, tension, upthrust, and weight are all direct forces measured in Newtons.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1985"
            )
        )

        // Q25
        list.add(
            QuestionEntity(
                id = "phy_1985_25",
                subject = "Physics",
                topic = "Optics & Curved Mirrors",
                year = "1985",
                questionText = "An object is placed 15 cm in front of a concave mirror of radius of curvature 40 cm. The image formed is:",
                optionA = "Virtual and 60 cm behind the mirror",
                optionB = "Real and 60 cm in front of the mirror",
                optionC = "Virtual and at infinity",
                optionD = "Real and 40 cm from the mirror",
                correctAnswerIndex = 0,
                explanation = "Focal length f = r / 2 = 40 / 2 = 20 cm. Using the mirror formula 1/f = 1/u + 1/v: 1/20 = 1/15 + 1/v ⇒ 1/v = 1/20 - 1/15 = -1/60 ⇒ v = -60 cm. The negative sign denotes a virtual image situated 60 cm behind the mirror.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1985"
            )
        )

        // Q26
        list.add(
            QuestionEntity(
                id = "phy_1985_26",
                subject = "Physics",
                topic = "Nuclear Physics & Isotopes",
                year = "1985",
                questionText = "What is the number of neutrons in the Uranium isotope ²³⁸₉₂U?",
                optionA = "92",
                optionB = "146",
                optionC = "238",
                optionD = "119",
                correctAnswerIndex = 1,
                explanation = "Mass number A = 238 and atomic number (proton count) Z = 92. Number of neutrons N = A - Z = 238 - 92 = 146.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1985"
            )
        )

        // ==========================================
        // 1986 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q27
        list.add(
            QuestionEntity(
                id = "phy_1986_27",
                subject = "Physics",
                topic = "Units & Dimensions",
                year = "1986",
                questionText = "Which of the following is a derived S.I. unit?",
                optionA = "Kilogramme",
                optionB = "Metre",
                optionC = "Kelvin",
                optionD = "Newton",
                correctAnswerIndex = 3,
                explanation = "The Newton (N = kg·m·s⁻²) is a derived unit of force, whereas the kilogramme, metre, and kelvin are fundamental base SI units.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1986"
            )
        )

        // Q28
        list.add(
            QuestionEntity(
                id = "phy_1986_28",
                subject = "Physics",
                topic = "Vertical Projectile & Kinematics",
                year = "1986",
                questionText = "A ball is thrown vertically upwards into the air with an initial velocity u. What is the maximum height reached? [g = acceleration due to gravity]",
                optionA = "u / g",
                optionB = "u² / (2g)",
                optionC = "u² / g",
                optionD = "3u² / (2g)",
                correctAnswerIndex = 1,
                explanation = "At maximum height, final velocity v = 0. Using v² = u² - 2gh ⇒ 0 = u² - 2gh ⇒ h = u² / (2g).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1986"
            )
        )

        // Q29
        list.add(
            QuestionEntity(
                id = "phy_1986_29",
                subject = "Physics",
                topic = "Thermal Physics & Heat Transfer",
                year = "1986",
                questionText = "The mode of thermal heat transfer which does NOT require a material medium is:",
                optionA = "Conduction",
                optionB = "Radiation",
                optionC = "Convection",
                optionD = "Diffusion",
                correctAnswerIndex = 1,
                explanation = "Thermal radiation transfers energy through electromagnetic waves (infrared photons), which can propagate through a vacuum without requiring any physical material medium.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1986"
            )
        )

        // ==========================================
        // 1987 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q30
        list.add(
            QuestionEntity(
                id = "phy_1987_30",
                subject = "Physics",
                topic = "Dimensional Analysis & Units",
                year = "1987",
                questionText = "Which of the following units is dimensionally equivalent to kg·m·s⁻¹?",
                optionA = "N·s⁻¹",
                optionB = "N·m·s",
                optionC = "N·s",
                optionD = "J·s⁻¹",
                correctAnswerIndex = 2,
                explanation = "1 Newton (N) = 1 kg·m·s⁻². Therefore, N·s = (kg·m·s⁻²) × s = kg·m·s⁻¹, which represents momentum and impulse.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1987"
            )
        )

        // Q31
        list.add(
            QuestionEntity(
                id = "phy_1987_31",
                subject = "Physics",
                topic = "Optics & Plane Mirrors",
                year = "1987",
                questionText = "If an object is placed between two plane mirrors inclined at an angle of 90°, how many images will be formed?",
                optionA = "Five",
                optionB = "Four",
                optionC = "Three",
                optionD = "Two",
                correctAnswerIndex = 2,
                explanation = "The number of images formed by two inclined mirrors is given by n = (360° / θ) - 1. For θ = 90°: n = (360 / 90) - 1 = 4 - 1 = 3 images.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1987"
            )
        )

        // ==========================================
        // 1988 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q32
        list.add(
            QuestionEntity(
                id = "phy_1988_32",
                subject = "Physics",
                topic = "Vectors & Displacement",
                year = "1988",
                questionText = "A lorry travels 10 km North, 4 km East, 6 km South, and 4 km West. What is the magnitude and direction of the total resultant displacement?",
                optionA = "6 km South",
                optionB = "4 km North",
                optionC = "6 km North",
                optionD = "4 km East",
                correctAnswerIndex = 1,
                explanation = "East-West net displacement = 4 km East - 4 km West = 0 km. North-South net displacement = 10 km North - 6 km South = 4 km North. Total displacement is 4 km North.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1988"
            )
        )

        // Q33
        list.add(
            QuestionEntity(
                id = "phy_1988_33",
                subject = "Physics",
                topic = "Sound & Vibrations",
                year = "1988",
                questionText = "Slightly loading the prongs of a vibrating tuning fork with wax has the direct effect of:",
                optionA = "Decreasing its amplitude",
                optionB = "Increasing its amplitude",
                optionC = "Decreasing its frequency",
                optionD = "Increasing its frequency",
                correctAnswerIndex = 2,
                explanation = "Loading mass onto the prongs increases the inertia of the tuning fork, slowing down its oscillations and decreasing its natural frequency of vibration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1988"
            )
        )

        // ==========================================
        // 1989 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q34
        list.add(
            QuestionEntity(
                id = "phy_1989_34",
                subject = "Physics",
                topic = "Vectors & Statics",
                year = "1989",
                questionText = "The magnitude of the resultant of two mutually perpendicular forces F₁ and F₂ is 13 N. If the magnitude of F₁ is 5 N, what is the magnitude of F₂?",
                optionA = "2.6 N",
                optionB = "8.0 N",
                optionC = "12.0 N",
                optionD = "18.0 N",
                correctAnswerIndex = 2,
                explanation = "For perpendicular forces: F_R² = F₁² + F₂² ⇒ 13² = 5² + F₂² ⇒ 169 = 25 + F₂² ⇒ F₂² = 144 ⇒ F₂ = 12.0 N.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1989"
            )
        )

        // ==========================================
        // 1990 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q35
        list.add(
            QuestionEntity(
                id = "phy_1990_35",
                subject = "Physics",
                topic = "Units & Dimensions",
                year = "1990",
                questionText = "Which of the following is a fundamental S.I. unit?",
                optionA = "Newton",
                optionB = "Watt",
                optionC = "Joule",
                optionD = "Second",
                correctAnswerIndex = 3,
                explanation = "The second is the SI base unit of time. The Newton (force), Watt (power), and Joule (work/energy) are all derived units.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1990"
            )
        )

        // Q36
        list.add(
            QuestionEntity(
                id = "phy_1990_36",
                subject = "Physics",
                topic = "Linear Motion & Kinematics",
                year = "1990",
                questionText = "A car moving with a speed of 90 km/h was brought uniformly to rest by the application of brakes in 10 s. How far did the car travel after the brakes were applied?",
                optionA = "125 m",
                optionB = "150 m",
                optionC = "250 m",
                optionD = "100 m",
                correctAnswerIndex = 0,
                explanation = "Convert velocity: u = 90 km/h = 90 × (5/18) = 25 m/s. With uniform deceleration to rest (v = 0), distance s = ((u + v) / 2) × t = ((25 + 0) / 2) × 10 = 12.5 × 10 = 125 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1990"
            )
        )

        // ==========================================
        // 1991 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q37
        list.add(
            QuestionEntity(
                id = "phy_1991_37",
                subject = "Physics",
                topic = "Momentum & Impulse",
                year = "1991",
                questionText = "A body of mass 100 g moving with a velocity of 10.0 m/s collides with a wall. If after the collision it moves with a velocity of 2.0 m/s in the opposite direction, calculate the magnitude of the change in momentum.",
                optionA = "0.8 N s",
                optionB = "1.2 N s",
                optionC = "12.0 N s",
                optionD = "8.0 N s",
                correctAnswerIndex = 1,
                explanation = "Mass m = 100 g = 0.1 kg. Initial velocity u = +10.0 m/s, rebound velocity v = -2.0 m/s. Change in momentum Δp = m(v - u) = 0.1 × (-2.0 - 10.0) = 0.1 × (-12.0) = -1.2 kg·m/s (magnitude of 1.2 N s).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1991"
            )
        )

        // Q38
        list.add(
            QuestionEntity(
                id = "phy_1991_38",
                subject = "Physics",
                topic = "Radioactivity & Half-Life",
                year = "1991",
                questionText = "4.0 g of a radioactive material of half-life 10 days is spilled on a laboratory floor. How long would it take to disintegrate 3.5 g of the material?",
                optionA = "1¼ days",
                optionB = "8¾ days",
                optionC = "30 days",
                optionD = "80 days",
                correctAnswerIndex = 2,
                explanation = "Initial mass N₀ = 4.0 g. Disintegrated mass = 3.5 g, so remaining mass N = 4.0 - 3.5 = 0.5 g. Remaining fraction = 0.5 / 4.0 = 1/8 = (1/2)³, which equals 3 half-lives. Total time elapsed = 3 × 10 days = 30 days.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1991"
            )
        )

        // ==========================================
        // 1992 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q39
        list.add(
            QuestionEntity(
                id = "phy_1992_39",
                subject = "Physics",
                topic = "Simple Harmonic Motion",
                year = "1992",
                questionText = "Which of the following physical factors affects the period of oscillation of a simple pendulum?\nI. Mass of the pendulum bob\nII. Length of the pendulum\nIII. Acceleration due to gravity",
                optionA = "I, II, and III",
                optionB = "II and III only",
                optionC = "I and III only",
                optionD = "I and II only",
                correctAnswerIndex = 1,
                explanation = "The period of a simple pendulum is given by T = 2π√(L/g). It depends solely on the length of the pendulum string (L) and the acceleration due to gravity (g), and is independent of the mass of the bob.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1992"
            )
        )

        // ==========================================
        // 1993 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q40
        list.add(
            QuestionEntity(
                id = "phy_1993_40",
                subject = "Physics",
                topic = "Work, Energy & Power",
                year = "1993",
                questionText = "Which of the following physical quantities has the exact same unit as the Watt?",
                optionA = "Force × time",
                optionB = "Force × distance",
                optionC = "Force × acceleration",
                optionD = "Force × velocity",
                correctAnswerIndex = 3,
                explanation = "Power (Watt) = Work / time = (Force × distance) / time = Force × (distance / time) = Force × velocity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1993"
            )
        )

        // ==========================================
        // 1994 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q41
        list.add(
            QuestionEntity(
                id = "phy_1994_41",
                subject = "Physics",
                topic = "Thermal Physics & Temperature Scales",
                year = "1994",
                questionText = "The melting point of naphthalene is 78°C. What is this temperature on the absolute Kelvin scale?",
                optionA = "100 K",
                optionB = "351 K",
                optionC = "378 K",
                optionD = "444 K",
                correctAnswerIndex = 1,
                explanation = "Converting from Celsius to Kelvin: T(K) = T(°C) + 273 = 78 + 273 = 351 K.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1994"
            )
        )

        // ==========================================
        // 1995 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q42
        list.add(
            QuestionEntity(
                id = "phy_1995_42",
                subject = "Physics",
                topic = "Dimensional Analysis",
                year = "1995",
                questionText = "Which of the following is the dimensional formula of pressure?",
                optionA = "M L⁻¹ T⁻²",
                optionB = "M L T⁻²",
                optionC = "M L² T⁻³",
                optionD = "M L⁻³",
                correctAnswerIndex = 0,
                explanation = "Pressure = Force / Area = (Mass × Acceleration) / Area = (M · L T⁻²) / L² = M L⁻¹ T⁻².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1995"
            )
        )

        // ==========================================
        // 1997 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q43
        list.add(
            QuestionEntity(
                id = "phy_1997_43",
                subject = "Physics",
                topic = "Dimensional Analysis",
                year = "1997",
                questionText = "At what respective values of exponents X, Y, and Z is the unit of force, the Newton, dimensionally represented by Mˣ Lʸ Tᶻ?",
                optionA = "-1, 1, 2",
                optionB = "1, 1, -2",
                optionC = "1, -1, 2",
                optionD = "-1, 1, -2",
                correctAnswerIndex = 1,
                explanation = "Force = Mass × Acceleration = M¹ L¹ T⁻². Therefore, X = 1, Y = 1, and Z = -2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1997"
            )
        )

        // ==========================================
        // 1998 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q44
        list.add(
            QuestionEntity(
                id = "phy_1998_44",
                subject = "Physics",
                topic = "Momentum & Impulse",
                year = "1998",
                questionText = "The physical quantity that has the exact same dimensions as impulse is:",
                optionA = "Energy",
                optionB = "Momentum",
                optionC = "Surface tension",
                optionD = "Pressure",
                correctAnswerIndex = 1,
                explanation = "Impulse is defined as Force × time, which is equal to the change in linear momentum (Δp). Both share the dimensions M L T⁻¹.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1998"
            )
        )

        // ==========================================
        // 1999 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q45
        list.add(
            QuestionEntity(
                id = "phy_1999_45",
                subject = "Physics",
                topic = "Conservation of Energy",
                year = "1999",
                questionText = "A ball of mass 0.1 kg is thrown vertically upwards with a speed of 10 m/s from the top of a tower 10 m high. Neglecting air resistance, what is its total mechanical energy just before hitting the ground? [g = 10 m/s²]",
                optionA = "5 J",
                optionB = "10 J",
                optionC = "15 J",
                optionD = "20 J",
                correctAnswerIndex = 2,
                explanation = "By conservation of mechanical energy, Total Energy = Initial Kinetic Energy + Initial Potential Energy = ½(0.1)(10²) + (0.1)(10)(10) = 5 J + 10 J = 15 J. The total mechanical energy remains 15 J throughout the motion until impact.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 1999"
            )
        )

        // ==========================================
        // 2000 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q46
        list.add(
            QuestionEntity(
                id = "phy_2000_46",
                subject = "Physics",
                topic = "Kinematics & Calculus in Physics",
                year = "2000",
                questionText = "The velocity v of a particle in time t is given by the equation v = 10 + 2t². Find the instantaneous acceleration after 5 seconds.",
                optionA = "10 m/s²",
                optionB = "15 m/s²",
                optionC = "20 m/s²",
                optionD = "60 m/s²",
                correctAnswerIndex = 2,
                explanation = "Instantaneous acceleration is the derivative of velocity with respect to time: a = dv/dt = d/dt(10 + 2t²) = 4t. At t = 5 s: a = 4(5) = 20 m/s².",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 2000"
            )
        )

        // ==========================================
        // 2001 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q47
        list.add(
            QuestionEntity(
                id = "phy_2001_47",
                subject = "Physics",
                topic = "Work, Energy & Power",
                year = "2001",
                questionText = "A stone of mass 1 kg is dropped from a height of 10 m above the ground and falls freely under gravity. Its kinetic energy when it is 5 m above the ground is equal to: [g = 10 m/s²]",
                optionA = "Its kinetic energy on the ground",
                optionB = "Twice its initial potential energy",
                optionC = "Its initial potential energy",
                optionD = "Half its initial potential energy",
                correctAnswerIndex = 3,
                explanation = "Initial potential energy PE₀ = mgh = 1 × 10 × 10 = 100 J. At height 5 m, potential energy is PE = 1 × 10 × 5 = 50 J. By conservation of energy, KE = PE₀ - PE = 100 - 50 = 50 J, which is exactly half of its initial potential energy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 2001"
            )
        )

        // ==========================================
        // 2002 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q48
        list.add(
            QuestionEntity(
                id = "phy_2002_48",
                subject = "Physics",
                topic = "Gravitational Fields",
                year = "2002",
                questionText = "If the distance between two spherical masses of 10 kg each is tripled, the gravitational force of attraction between them becomes:",
                optionA = "One-ninth of the original force",
                optionB = "One-quarter of the original force",
                optionC = "One-third of the original force",
                optionD = "One-half of the original force",
                correctAnswerIndex = 0,
                explanation = "According to Newton's law of universal gravitation, F ∝ 1 / r². Tripling the distance (r' = 3r) reduces the gravitational force to 1 / (3²) = 1/9 of its original value.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 2002"
            )
        )

        // ==========================================
        // 2003 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q49
        list.add(
            QuestionEntity(
                id = "phy_2003_49",
                subject = "Physics",
                topic = "Friction & Inclined Planes",
                year = "2003",
                questionText = "If a solid block just begins to slide down a surface inclined at an angle of 30° to the horizontal, what is the coefficient of static friction?",
                optionA = "1 / 3",
                optionB = "√3",
                optionC = "3 / √3",
                optionD = "√3 / 3",
                correctAnswerIndex = 3,
                explanation = "At the angle of repose (verge of sliding on an inclined plane), the coefficient of friction μ = tan θ = tan 30° = 1 / √3 = √3 / 3 ≈ 0.577.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 2003"
            )
        )

        // ==========================================
        // 2004 PHYSICS UTME EXAMINATION
        // ==========================================

        // Q50
        list.add(
            QuestionEntity(
                id = "phy_2004_50",
                subject = "Physics",
                topic = "Optics & Laws of Reflection",
                year = "2004",
                questionText = "An incident ray of light makes an angle of 35° with the reflective surface of a plane mirror. What is the angle of reflection?",
                optionA = "55°",
                optionB = "35°",
                optionC = "70°",
                optionD = "65°",
                correctAnswerIndex = 0,
                explanation = "The glancing angle is 35°. The angle of incidence i is measured with respect to the normal: i = 90° - 35° = 55°. By the law of reflection, the angle of reflection r = angle of incidence i = 55°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Past Question • 2004"
            )
        )

        return list
    }
}
