package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Comprehensive JAMB Physics Topic-by-Topic Revision Master Question Bank (100 Questions)
 * Covering all 32 syllabus modules from Measurement & Mechanics to Atomic Physics & Electronics.
 */
object JambPhysicsTopicMasterQuestionBank {

    fun getTopicMasterPhysicsQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Q1
        list.add(
            QuestionEntity(
                id = "phy_top_001",
                subject = "Physics",
                topic = "Measurement, Dimension, Scalar and Vector Quantities",
                year = "2005",
                questionText = "The internationally agreed system of units (SI) for physical measurement are:",
                optionA = "lb, ft, sec",
                optionB = "g, m, sec",
                optionC = "kg, m, sec",
                optionD = "cm, g, sec",
                correctAnswerIndex = 2,
                explanation = "The International System of Units (SI) specifies the kilogram (kg) for mass, metre (m) for length, and second (sec/s) for time as base units.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q1"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "phy_top_002",
                subject = "Physics",
                topic = "Measurement, Dimension, Scalar and Vector Quantities",
                year = "2005",
                questionText = "Which of the following physical quantities is NOT a vector?",
                optionA = "Velocity",
                optionB = "Force",
                optionC = "Altitude",
                optionD = "Acceleration",
                correctAnswerIndex = 2,
                explanation = "Altitude represents vertical distance above a reference level and is a scalar quantity because it is fully described by magnitude alone, without direction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q2"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "phy_top_003",
                subject = "Physics",
                topic = "Measurement, Dimension, Scalar and Vector Quantities",
                year = "2005",
                questionText = "What is the dimension of pressure?",
                optionA = "[MLT⁻²]",
                optionB = "[ML⁻¹T⁻²]",
                optionC = "[ML²T⁻³]",
                optionD = "[ML⁻²T⁻²]",
                correctAnswerIndex = 1,
                explanation = "Pressure is Force/Area. Since Force has dimensions [MLT⁻²] and Area is [L²], Pressure = [MLT⁻²] / [L²] = [ML⁻¹T⁻²].",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q3"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "phy_top_004",
                subject = "Physics",
                topic = "Linear Motion, Projectiles",
                year = "2005",
                questionText = "A palm fruit dropped to the ground from the top of a tree 45m tall. How long does it take to reach the ground? [g = 10 m/s²]",
                optionA = "9s",
                optionB = "4.5s",
                optionC = "3s",
                optionD = "6s",
                correctAnswerIndex = 2,
                explanation = "Using s = ut + ½gt² with u = 0: 45 = ½(10)t² ⇒ 45 = 5t² ⇒ t² = 9 ⇒ t = 3s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q4"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "phy_top_005",
                subject = "Physics",
                topic = "Linear Motion, Projectiles",
                year = "2005",
                questionText = "A car accelerates uniformly from rest at 4 m/s². How far will it travel in the fifth second?",
                optionA = "18m",
                optionB = "50m",
                optionC = "10m",
                optionD = "9m",
                correctAnswerIndex = 0,
                explanation = "Distance in nth second: sₙ = u + ½a(2n - 1). Here, u = 0, a = 4, n = 5: s₅ = 0 + (4/2)(2(5) - 1) = 2(9) = 18m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q5"
            )
        )

        // Q6
        list.add(
            QuestionEntity(
                id = "phy_top_006",
                subject = "Physics",
                topic = "Linear Motion, Projectiles",
                year = "2005",
                questionText = "A ball is thrown vertically into the air with an initial velocity u. What is the greatest height reached? [g = acceleration due to gravity]",
                optionA = "u² / g",
                optionB = "u² / 2g",
                optionC = "2u² / g",
                optionD = "u / 2g",
                correctAnswerIndex = 1,
                explanation = "Using v² = u² - 2gh. At maximum height v = 0, so 0 = u² - 2gh ⇒ h = u² / 2g.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q6"
            )
        )

        // Q7
        list.add(
            QuestionEntity(
                id = "phy_top_007",
                subject = "Physics",
                topic = "Newton's Laws of Motion, Conservation of Momentum",
                year = "2005",
                questionText = "A machine gun of mass 5kg fires a 50g bullet at a speed of 100 m/s. What is the recoil speed of the gun?",
                optionA = "0.5 m/s",
                optionB = "1.0 m/s",
                optionC = "2.0 m/s",
                optionD = "4.0 m/s",
                correctAnswerIndex = 1,
                explanation = "By conservation of momentum: m_g · v_g + m_b · v_b = 0 ⇒ (5 × v_g) + (0.05 × 100) = 0 ⇒ 5·v_g = -5 ⇒ v_g = -1.0 m/s (recoil speed magnitude is 1.0 m/s).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q7"
            )
        )

        // Q8
        list.add(
            QuestionEntity(
                id = "phy_top_008",
                subject = "Physics",
                topic = "Newton's Laws of Motion, Conservation of Momentum",
                year = "2005",
                questionText = "The tendency of a body to remain at rest or continue in its state of uniform motion in a straight line unless acted upon by a net external force is called:",
                optionA = "Impulse",
                optionB = "Momentum",
                optionC = "Inertia",
                optionD = "Friction",
                correctAnswerIndex = 2,
                explanation = "Inertia is the inherent property of matter by which it resists any change in its state of rest or uniform motion in a straight line.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q8"
            )
        )

        // Q9
        list.add(
            QuestionEntity(
                id = "phy_top_009",
                subject = "Physics",
                topic = "Newton's Laws of Motion, Conservation of Momentum",
                year = "2005",
                questionText = "A constant force of 10N is applied to a body of mass 0.04kg initially at rest. If the body moves 50m, what is its final velocity?",
                optionA = "158 m/s",
                optionB = "100 m/s",
                optionC = "150 m/s",
                optionD = "162 m/s",
                correctAnswerIndex = 0,
                explanation = "Acceleration a = F/m = 10 / 0.04 = 250 m/s². Using v² = u² + 2as: v² = 0 + 2(250)(50) = 25,000 ⇒ v = √25000 ≈ 158.11 m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q9"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "phy_top_010",
                subject = "Physics",
                topic = "Circular Motion, Simple Harmonic Motion",
                year = "2005",
                questionText = "The force required to make an object of mass m, travelling with velocity v, turn in a circle of radius r is:",
                optionA = "mv² / r",
                optionB = "mv / r",
                optionC = "mr² / v",
                optionD = "mv² / r²",
                correctAnswerIndex = 0,
                explanation = "Centripetal force F_c = m · a_c = m · (v²/r), which acts towards the center of the circular trajectory.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q10"
            )
        )

        // Q11
        list.add(
            QuestionEntity(
                id = "phy_top_011",
                subject = "Physics",
                topic = "Circular Motion, Simple Harmonic Motion",
                year = "2005",
                questionText = "If the length of a simple pendulum is increased by a factor of four, its period is increased by a factor of:",
                optionA = "4",
                optionB = "2",
                optionC = "8",
                optionD = "16",
                correctAnswerIndex = 1,
                explanation = "The period of a simple pendulum is T = 2π√(L/g), meaning T ∝ √L. If L is quadrupled (4L), T increases by √4 = 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q11"
            )
        )

        // Q12
        list.add(
            QuestionEntity(
                id = "phy_top_012",
                subject = "Physics",
                topic = "Circular Motion, Simple Harmonic Motion",
                year = "2005",
                questionText = "A particle performs 30 oscillations in 6 seconds. What is its angular velocity in rad/s?",
                optionA = "10π",
                optionB = "5π",
                optionC = "30π",
                optionD = "6π",
                correctAnswerIndex = 0,
                explanation = "Frequency f = 30 / 6 = 5 Hz. Angular velocity ω = 2πf = 2 × π × 5 = 10π rad/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q12"
            )
        )

        // Q13
        list.add(
            QuestionEntity(
                id = "phy_top_013",
                subject = "Physics",
                topic = "Gravitational Field, Mass and Weight",
                year = "2005",
                questionText = "A satellite moves in a circular orbit of radius 4R around the Earth (where R is the Earth's radius). Acceleration due to gravity at this height in terms of g at Earth's surface is:",
                optionA = "g/4",
                optionB = "g/16",
                optionC = "g/9",
                optionD = "g/2",
                correctAnswerIndex = 1,
                explanation = "By Newton's law of universal gravitation, g_h = g · (R / r)² = g · (R / 4R)² = g / 16.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q13"
            )
        )

        // Q14
        list.add(
            QuestionEntity(
                id = "phy_top_014",
                subject = "Physics",
                topic = "Gravitational Field, Mass and Weight",
                year = "2005",
                questionText = "The escape velocity of a body launched from the Earth's surface is given by (where R is the Earth's radius and g is acceleration due to gravity):",
                optionA = "√(gR)",
                optionB = "√(2gR)",
                optionC = "2gR",
                optionD = "gR²",
                correctAnswerIndex = 1,
                explanation = "Escape velocity is derived by equating initial kinetic energy to gravitational potential energy: ½mv_e² = GMm/R = mgR ⇒ v_e = √(2gR).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q14"
            )
        )

        // Q15
        list.add(
            QuestionEntity(
                id = "phy_top_015",
                subject = "Physics",
                topic = "Vectors, Equilibrium of Forces",
                year = "2005",
                questionText = "A man walks 1km due East and then 1km due North. What is his total resultant displacement?",
                optionA = "2km N 45° E",
                optionB = "√2km N 45° E",
                optionC = "√2km N 45° W",
                optionD = "2km S 45° E",
                correctAnswerIndex = 1,
                explanation = "Displacement magnitude = √(1² + 1²) = √2 km. Direction angle θ = tan⁻¹(1/1) = 45° East of North (N 45° E).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q15"
            )
        )

        // Q16
        list.add(
            QuestionEntity(
                id = "phy_top_016",
                subject = "Physics",
                topic = "Vectors, Equilibrium of Forces",
                year = "2005",
                questionText = "A body of mass 5kg initially at rest is acted upon by two mutually perpendicular forces of 12N and 5N. Calculate the magnitude of the acceleration produced.",
                optionA = "2.6 m/s²",
                optionB = "3.4 m/s²",
                optionC = "1.4 m/s²",
                optionD = "0.4 m/s²",
                correctAnswerIndex = 0,
                explanation = "Resultant force F_R = √(12² + 5²) = √169 = 13N. Acceleration a = F_R / m = 13 / 5 = 2.6 m/s².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q16"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "phy_top_017",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "2005",
                questionText = "A man of mass 50kg ascends a flight of stairs 5m high in 5 seconds. What is the power expended? [g = 10 m/s²]",
                optionA = "100W",
                optionB = "250W",
                optionC = "500W",
                optionD = "400W",
                correctAnswerIndex = 2,
                explanation = "Work done W = mgh = 50 × 10 × 5 = 2500 J. Power P = W / t = 2500 / 5 = 500W.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q17"
            )
        )

        // Q18
        list.add(
            QuestionEntity(
                id = "phy_top_018",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "2005",
                questionText = "A body of mass 4kg is acted on by a constant force of 12N for 3 seconds. Calculate the kinetic energy gained.",
                optionA = "162 J",
                optionB = "144 J",
                optionC = "72 J",
                optionD = "81 J",
                correctAnswerIndex = 0,
                explanation = "Acceleration a = F/m = 12 / 4 = 3 m/s². Final velocity v = u + at = 0 + (3 × 3) = 9 m/s. Kinetic energy KE = ½mv² = ½ × 4 × 9² = 2 × 81 = 162 J.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q18"
            )
        )

        // Q19
        list.add(
            QuestionEntity(
                id = "phy_top_019",
                subject = "Physics",
                topic = "Friction, Viscosity, Surface Tension",
                year = "2005",
                questionText = "A metal block of mass 5kg lies on a rough horizontal platform. If a horizontal force of 8N just slides the block, what is the coefficient of limiting friction? [g = 10 m/s²]",
                optionA = "0.16",
                optionB = "0.63",
                optionC = "0.80",
                optionD = "0.08",
                correctAnswerIndex = 0,
                explanation = "Limiting frictional force f_L = 8N. Normal reaction R = mg = 5 × 10 = 50N. Coefficient of limiting friction μ = f_L / R = 8 / 50 = 0.16.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q19"
            )
        )

        // Q20
        list.add(
            QuestionEntity(
                id = "phy_top_020",
                subject = "Physics",
                topic = "Friction, Viscosity, Surface Tension",
                year = "2005",
                questionText = "Which of the following does NOT cause a reduction of the surface tension of water?",
                optionA = "Soap solution",
                optionB = "Detergent",
                optionC = "Alcohol",
                optionD = "Grease",
                correctAnswerIndex = 3,
                explanation = "Grease is nonpolar/hydrophobic and does not dissolve in water to disrupt hydrogen bonding at the surface, whereas soaps, detergents, and alcohol act as surfactants to decrease surface tension.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q20"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "phy_top_021",
                subject = "Physics",
                topic = "Simple Machine",
                year = "2005",
                questionText = "An inclined plane of angle 30° to the horizontal has a velocity ratio of:",
                optionA = "2.0",
                optionB = "1.0",
                optionC = "0.5",
                optionD = "1.15",
                correctAnswerIndex = 0,
                explanation = "For an inclined plane, Velocity Ratio (VR) = 1 / sin(θ). For θ = 30°, sin(30°) = 0.5, so VR = 1 / 0.5 = 2.0.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q21"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "phy_top_022",
                subject = "Physics",
                topic = "Simple Machine",
                year = "2005",
                questionText = "A machine with an efficiency of 60% has a velocity ratio of 5. What effort force is required to lift a load of 150N?",
                optionA = "50N",
                optionB = "30N",
                optionC = "40N",
                optionD = "18N",
                correctAnswerIndex = 0,
                explanation = "Efficiency = (MA / VR) × 100 ⇒ 60 = (MA / 5) × 100 ⇒ MA = 3. Since MA = Load / Effort ⇒ 3 = 150 / Effort ⇒ Effort = 150 / 3 = 50N.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q22"
            )
        )

        // Q23
        list.add(
            QuestionEntity(
                id = "phy_top_023",
                subject = "Physics",
                topic = "Elasticity, Hooke's Law, Young's Modulus",
                year = "2005",
                questionText = "The total length of a spring is 14cm when a mass of 200g is hung from it, and 16cm when a mass of 300g is hung from it. What is the unstretched length of the spring?",
                optionA = "10cm",
                optionB = "12cm",
                optionC = "8cm",
                optionD = "6cm",
                correctAnswerIndex = 0,
                explanation = "Let unstretched length be L₀. 14 = L₀ + 200k and 16 = L₀ + 300k. Subtracting: 2 = 100k ⇒ k = 0.02 cm/g. Substituting back: 14 = L₀ + 200(0.02) ⇒ 14 = L₀ + 4 ⇒ L₀ = 10cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q23"
            )
        )

        // Q24
        list.add(
            QuestionEntity(
                id = "phy_top_024",
                subject = "Physics",
                topic = "Elasticity, Hooke's Law, Young's Modulus",
                year = "2005",
                questionText = "What is the work done when a force of 20N stretches an elastic spring by 50mm?",
                optionA = "0.5 J",
                optionB = "1.0 J",
                optionC = "10.0 J",
                optionD = "0.25 J",
                correctAnswerIndex = 0,
                explanation = "Work done in stretching a spring = ½ · F · e = ½ × 20 N × 0.05 m = 0.5 J.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q24"
            )
        )

        // Q25
        list.add(
            QuestionEntity(
                id = "phy_top_025",
                subject = "Physics",
                topic = "Density and Upthrust Archimedes Principle, Floatation",
                year = "2005",
                questionText = "If the relative density of a metal is 19, what will be the mass of 20 cm³ of the metal when fully immersed in water?",
                optionA = "380g",
                optionB = "360g",
                optionC = "400g",
                optionD = "180g",
                correctAnswerIndex = 0,
                explanation = "Mass is an intrinsic property of a body and does not alter when immersed. Mass = density × volume = (19 g/cm³) × 20 cm³ = 380g.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q25"
            )
        )

        // Q26
        list.add(
            QuestionEntity(
                id = "phy_top_026",
                subject = "Physics",
                topic = "Density and Upthrust Archimedes Principle, Floatation",
                year = "2005",
                questionText = "A solid weighs 45N and 15N in air and water respectively. Determine the relative density of the solid.",
                optionA = "1.5",
                optionB = "3.0",
                optionC = "0.33",
                optionD = "2.0",
                correctAnswerIndex = 0,
                explanation = "Relative Density = Weight in Air / Loss of Weight in Water = 45 / (45 - 15) = 45 / 30 = 1.5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q26"
            )
        )

        // Q27
        list.add(
            QuestionEntity(
                id = "phy_top_027",
                subject = "Physics",
                topic = "Pressure, Pascal's Principle",
                year = "2005",
                questionText = "In a hydraulic press, a force of 40N is applied on the effort piston of area 0.04 m². If the area of the load piston is 0.4 m², what is the force exerted on the load?",
                optionA = "400N",
                optionB = "40N",
                optionC = "800N",
                optionD = "1000N",
                correctAnswerIndex = 0,
                explanation = "By Pascal's Principle: F₁ / A₁ = F₂ / A₂ ⇒ 40 / 0.04 = F₂ / 0.4 ⇒ 1000 = F₂ / 0.4 ⇒ F₂ = 400N.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q27"
            )
        )

        // Q28
        list.add(
            QuestionEntity(
                id = "phy_top_028",
                subject = "Physics",
                topic = "Pressure, Pascal's Principle",
                year = "2005",
                questionText = "The hatch door of a submarine has an area of 0.5 m². If the submarine is at a depth of 200m in sea water (density = 1030 kg/m³), what is the total water force exerted on the door? [g = 10 m/s²]",
                optionA = "1.03 × 10⁶ N",
                optionB = "2.06 × 10⁶ N",
                optionC = "1.03 × 10⁵ N",
                optionD = "5.15 × 10⁵ N",
                correctAnswerIndex = 0,
                explanation = "Hydrostatic pressure P = h·ρ·g = 200 × 1030 × 10 = 2.06 × 10⁶ N/m². Force F = P × Area = (2.06 × 10⁶) × 0.5 = 1.03 × 10⁶ N.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q28"
            )
        )

        // Q29
        list.add(
            QuestionEntity(
                id = "phy_top_029",
                subject = "Physics",
                topic = "Temperature and Heat, Thermal Expansion",
                year = "2005",
                questionText = "A temperature of 20 degrees Celsius is equivalent to:",
                optionA = "68°F",
                optionB = "36°F",
                optionC = "43°F",
                optionD = "11°F",
                correctAnswerIndex = 0,
                explanation = "Conversion formula: F = (9/5)·C + 32 = (9/5)×20 + 32 = 36 + 32 = 68°F.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q29"
            )
        )

        // Q30
        list.add(
            QuestionEntity(
                id = "phy_top_030",
                subject = "Physics",
                topic = "Temperature and Heat, Thermal Expansion",
                year = "2005",
                questionText = "A brass rod 2m long is heated through a temperature rise of 100K. If the linear expansivity of brass is 1.8 × 10⁻⁵ K⁻¹, what is the increase in length?",
                optionA = "3.6mm",
                optionB = "1.8mm",
                optionC = "0.36mm",
                optionD = "3.6cm",
                correctAnswerIndex = 0,
                explanation = "Increase in length ΔL = L₀ · α · ΔT = 2 × (1.8 × 10⁻⁵) × 100 = 3.6 × 10⁻³ m = 3.6mm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q30"
            )
        )

        // Q31
        list.add(
            QuestionEntity(
                id = "phy_top_031",
                subject = "Physics",
                topic = "Structure of Matter, Kinetic Theory, Gas Laws",
                year = "2005",
                questionText = "If the pressure on 1000 cm³ of an ideal gas is doubled while its Kelvin temperature is halved, what is the new volume?",
                optionA = "250 cm³",
                optionB = "500 cm³",
                optionC = "125 cm³",
                optionD = "2000 cm³",
                correctAnswerIndex = 0,
                explanation = "General gas equation: (P₁·V₁)/T₁ = (P₂·V₂)/T₂ ⇒ (P₁ × 1000)/T₁ = (2P₁ × V₂)/(0.5T₁) ⇒ 1000 = 4V₂ ⇒ V₂ = 250 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q31"
            )
        )

        // Q32
        list.add(
            QuestionEntity(
                id = "phy_top_032",
                subject = "Physics",
                topic = "Structure of Matter, Kinetic Theory, Gas Laws",
                year = "2005",
                questionText = "According to the kinetic theory of gases, the absolute Kelvin temperature of an ideal gas is a direct measure of the average:",
                optionA = "Kinetic energy of the molecules",
                optionB = "Velocity of the molecules",
                optionC = "Potential energy of the molecules",
                optionD = "Momentum of the molecules",
                correctAnswerIndex = 0,
                explanation = "In kinetic theory, absolute temperature T is directly proportional to the average translational kinetic energy of the gas molecules (½m·v_rms² = 3/2 k·T).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q32"
            )
        )

        // Q33
        list.add(
            QuestionEntity(
                id = "phy_top_033",
                subject = "Physics",
                topic = "Quantity of Heat: Heat Capacity and Latent Heat",
                year = "2005",
                questionText = "Calculate the amount of heat required to raise the temperature of a 2kg iron block from 25°C to 45°C. [Specific heat capacity of iron = 460 J/kg/K]",
                optionA = "18,400 J",
                optionB = "9,200 J",
                optionC = "36,800 J",
                optionD = "4,600 J",
                correctAnswerIndex = 0,
                explanation = "Heat Q = m · c · ΔT = 2 × 460 × (45 - 25) = 2 × 460 × 20 = 18,400 J.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q33"
            )
        )

        // Q34
        list.add(
            QuestionEntity(
                id = "phy_top_034",
                subject = "Physics",
                topic = "Quantity of Heat: Heat Capacity and Latent Heat",
                year = "2005",
                questionText = "An electric heater rated 50W is used to vaporize 0.005kg of boiling water in 50 seconds. What is the specific latent heat of vaporization of water?",
                optionA = "5.0 × 10⁵ J/kg",
                optionB = "2.5 × 10⁵ J/kg",
                optionC = "5.0 × 10⁶ J/kg",
                optionD = "2.5 × 10⁶ J/kg",
                correctAnswerIndex = 0,
                explanation = "Electrical Energy = Heat of vaporization ⇒ P × t = m × L ⇒ 50 × 50 = 0.005 × L ⇒ 2500 = 0.005L ⇒ L = 2500 / 0.005 = 5.0 × 10⁵ J/kg.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q34"
            )
        )

        // Q35
        list.add(
            QuestionEntity(
                id = "phy_top_035",
                subject = "Physics",
                topic = "Change of State, Vapours",
                year = "2005",
                questionText = "The temperature at which the water vapour present in the air saturates the air and begins to condense into liquid water is known as:",
                optionA = "Boiling point",
                optionB = "Melting point",
                optionC = "Dew point",
                optionD = "Triple point",
                correctAnswerIndex = 2,
                explanation = "Dew point is the temperature to which moist air must be cooled at constant pressure to reach 100% relative humidity, causing condensation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q35"
            )
        )

        // Q36
        list.add(
            QuestionEntity(
                id = "phy_top_036",
                subject = "Physics",
                topic = "Change of State, Vapours",
                year = "2005",
                questionText = "If a solid changes directly into a gas when heat is applied without forming an intermediate liquid, the process is called:",
                optionA = "Sublimation",
                optionB = "Vaporization",
                optionC = "Evaporation",
                optionD = "Liquefaction",
                correctAnswerIndex = 0,
                explanation = "Sublimation is the direct phase transformation from solid state to gaseous state without passing through the liquid phase.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q36"
            )
        )

        // Q37
        list.add(
            QuestionEntity(
                id = "phy_top_037",
                subject = "Physics",
                topic = "Heat Transfer",
                year = "2005",
                questionText = "Thermal radiation from the sun reaches the earth primarily by the process of:",
                optionA = "Conduction",
                optionB = "Convection",
                optionC = "Radiation",
                optionD = "Advection",
                correctAnswerIndex = 2,
                explanation = "Electromagnetic radiation travels freely through the vacuum of outer space without requiring any material medium.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q37"
            )
        )

        // Q38
        list.add(
            QuestionEntity(
                id = "phy_top_038",
                subject = "Physics",
                topic = "Heat Transfer",
                year = "2005",
                questionText = "Why are the double glass walls of a thermos flask silvered on the inside facing the vacuum?",
                optionA = "To minimize heat loss by conduction",
                optionB = "To minimize heat loss by convection",
                optionC = "To minimize heat loss by radiation",
                optionD = "To make the flask structurally stronger",
                correctAnswerIndex = 2,
                explanation = "The silvered mirror-like surfaces reflect radiant infrared heat back into the liquid, minimizing heat transfer by thermal radiation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q38"
            )
        )

        // Q39
        list.add(
            QuestionEntity(
                id = "phy_top_039",
                subject = "Physics",
                topic = "Waves: Types, Production, Propagation, Properties",
                year = "2005",
                questionText = "A wave of frequency 10Hz forms a stationary wave pattern in a medium where the velocity of waves is 20 m/s. What is the distance between adjacent nodes?",
                optionA = "1.0m",
                optionB = "2.0m",
                optionC = "0.5m",
                optionD = "4.0m",
                correctAnswerIndex = 0,
                explanation = "Wavelength λ = v / f = 20 / 10 = 2.0m. The distance between two consecutive nodes in a standing wave is λ/2 = 2.0 / 2 = 1.0m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q39"
            )
        )

        // Q40
        list.add(
            QuestionEntity(
                id = "phy_top_040",
                subject = "Physics",
                topic = "Waves: Types, Production, Propagation, Properties",
                year = "2005",
                questionText = "Which of the following wave properties is common to all waves (both longitudinal and transverse)?",
                optionA = "Diffraction",
                optionB = "Refraction",
                optionC = "Polarization",
                optionD = "Diffraction and Refraction only",
                correctAnswerIndex = 3,
                explanation = "Diffraction, refraction, reflection, and interference occur in all wave types. Polarization is exclusive to transverse waves and cannot occur in longitudinal waves like sound.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q40"
            )
        )

        // Q41
        list.add(
            QuestionEntity(
                id = "phy_top_041",
                subject = "Physics",
                topic = "Sound Waves: Propagation and Characteristics",
                year = "2005",
                questionText = "A man hears his echo from a nearby hill 2 seconds after he shouted. If the speed of sound in air is 340 m/s, how far is the hill from him?",
                optionA = "340m",
                optionB = "680m",
                optionC = "170m",
                optionD = "510m",
                correctAnswerIndex = 0,
                explanation = "Sound travels to the reflecting cliff and returns: 2d = v × t ⇒ 2d = 340 × 2 ⇒ d = 340m.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q41"
            )
        )

        // Q42
        list.add(
            QuestionEntity(
                id = "phy_top_042",
                subject = "Physics",
                topic = "Sound Waves: Propagation and Characteristics",
                year = "2005",
                questionText = "What subjective properties of sound waves are directly determined by frequency and amplitude respectively?",
                optionA = "Pitch and Loudness",
                optionB = "Loudness and Pitch",
                optionC = "Wavelength and Speed",
                optionD = "Speed and Intensity",
                correctAnswerIndex = 0,
                explanation = "Pitch is determined by the fundamental frequency of the acoustic wave, while perceived loudness is determined by wave amplitude/intensity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q42"
            )
        )

        // Q43
        list.add(
            QuestionEntity(
                id = "phy_top_043",
                subject = "Physics",
                topic = "Light Energy, Reflections from Plane Surfaces",
                year = "2005",
                questionText = "An object is positioned between two plane mirrors inclined at an angle of 90 degrees to each other. Calculate the number of images formed.",
                optionA = "3",
                optionB = "4",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Number of images n = (360° / θ) - 1 = (360 / 90) - 1 = 4 - 1 = 3 images.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q43"
            )
        )

        // Q44
        list.add(
            QuestionEntity(
                id = "phy_top_044",
                subject = "Physics",
                topic = "Light Energy, Reflections from Plane Surfaces",
                year = "2005",
                questionText = "An object 15cm high is placed 30cm from a pinhole camera. If the image height on the film screen is 10cm, what is the length of the camera?",
                optionA = "20cm",
                optionB = "45cm",
                optionC = "15cm",
                optionD = "30cm",
                correctAnswerIndex = 0,
                explanation = "Magnification m = Image Height / Object Height = Image Distance / Object Distance ⇒ 10 / 15 = v / 30 ⇒ v = (10/15) × 30 = 20cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q44"
            )
        )

        // Q45
        list.add(
            QuestionEntity(
                id = "phy_top_045",
                subject = "Physics",
                topic = "Reflection of Light from Spherical Surfaces",
                year = "2005",
                questionText = "An object is placed 15cm in front of a concave mirror of radius of curvature 40cm. The image formed is:",
                optionA = "Virtual, 60cm behind the mirror",
                optionB = "Real, 60cm in front of the mirror",
                optionC = "Virtual, 30cm behind the mirror",
                optionD = "Real, 30cm in front of the mirror",
                correctAnswerIndex = 0,
                explanation = "Focal length f = r/2 = 40/2 = 20cm. Using 1/f = 1/u + 1/v ⇒ 1/20 = 1/15 + 1/v ⇒ 1/v = 1/20 - 1/15 = -1/60 ⇒ v = -60cm (virtual image located behind mirror).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q45"
            )
        )

        // Q46
        list.add(
            QuestionEntity(
                id = "phy_top_046",
                subject = "Physics",
                topic = "Reflection of Light from Spherical Surfaces",
                year = "2005",
                questionText = "The focal length of a convex mirror is 10cm. If an object is placed 10cm in front of it, where is the image formed?",
                optionA = "5cm behind the mirror",
                optionB = "10cm behind the mirror",
                optionC = "5cm in front of the mirror",
                optionD = "At infinity",
                correctAnswerIndex = 0,
                explanation = "For convex mirror, f = -10cm. Using 1/f = 1/u + 1/v ⇒ -1/10 = 1/10 + 1/v ⇒ 1/v = -2/10 ⇒ v = -5cm (5cm behind mirror).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q46"
            )
        )

        // Q47
        list.add(
            QuestionEntity(
                id = "phy_top_047",
                subject = "Physics",
                topic = "Refraction of Light from Plane and Spherical Surfaces",
                year = "2005",
                questionText = "The refractive index of a transparent medium is 1.5. If the speed of light in vacuum is 3.0 × 10⁸ m/s, what is the speed of light in the medium?",
                optionA = "2.0 × 10⁸ m/s",
                optionB = "1.5 × 10⁸ m/s",
                optionC = "4.5 × 10⁸ m/s",
                optionD = "2.25 × 10⁸ m/s",
                correctAnswerIndex = 0,
                explanation = "Refractive index n = c / v ⇒ 1.5 = (3.0 × 10⁸) / v ⇒ v = (3.0 × 10⁸) / 1.5 = 2.0 × 10⁸ m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q47"
            )
        )

        // Q48
        list.add(
            QuestionEntity(
                id = "phy_top_048",
                subject = "Physics",
                topic = "Refraction of Light from Plane and Spherical Surfaces",
                year = "2005",
                questionText = "What is the critical angle for a transparent medium of refractive index √2 surrounded by air?",
                optionA = "45 degrees",
                optionB = "30 degrees",
                optionC = "60 degrees",
                optionD = "90 degrees",
                correctAnswerIndex = 0,
                explanation = "sin(c) = 1 / n = 1 / √2 ⇒ critical angle c = arcsin(1/√2) = 45°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q48"
            )
        )

        // Q49
        list.add(
            QuestionEntity(
                id = "phy_top_049",
                subject = "Physics",
                topic = "Optical Instrument, Vision",
                year = "2005",
                questionText = "For the optical correction of short-sightedness (myopia) in the human eye, we require a:",
                optionA = "Concave (diverging) lens",
                optionB = "Convex (converging) lens",
                optionC = "Cylindrical lens",
                optionD = "Bifocal lens",
                correctAnswerIndex = 0,
                explanation = "In myopia, parallel rays focus in front of the retina. A diverging (concave) lens diverges incoming rays so they converge sharply on the retinal surface.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q49"
            )
        )

        // Q50
        list.add(
            QuestionEntity(
                id = "phy_top_050",
                subject = "Physics",
                topic = "Optical Instrument, Vision",
                year = "2005",
                questionText = "If the focal length of a converging camera lens is 20cm, what is the optical power of the lens in dioptres?",
                optionA = "+5.0 D",
                optionB = "-5.0 D",
                optionC = "+20.0 D",
                optionD = "+0.05 D",
                correctAnswerIndex = 0,
                explanation = "Power P = 1 / f (in metres) = 1 / 0.2m = +5.0 Dioptres.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q50"
            )
        )

        // Q51
        list.add(
            QuestionEntity(
                id = "phy_top_051",
                subject = "Physics",
                topic = "Dispersion of Light. Electromagnetic Spectrum",
                year = "2005",
                questionText = "Which of the following electromagnetic waves has the shortest wavelength and highest photon energy?",
                optionA = "Gamma rays",
                optionB = "X-rays",
                optionC = "Ultraviolet rays",
                optionD = "Radio waves",
                correctAnswerIndex = 0,
                explanation = "In the EM spectrum, gamma rays have the highest frequencies and shortest wavelengths (< 10⁻¹² m), whereas radio waves possess the longest wavelengths.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q51"
            )
        )

        // Q52
        list.add(
            QuestionEntity(
                id = "phy_top_052",
                subject = "Physics",
                topic = "Dispersion of Light. Electromagnetic Spectrum",
                year = "2005",
                questionText = "In natural daylight, a blue flower appears blue because the petal pigments:",
                optionA = "Disperse blue light",
                optionB = "Absorb blue light and reflect other colours",
                optionC = "Reflect blue light and absorb other colours",
                optionD = "Refract blue light",
                correctAnswerIndex = 2,
                explanation = "An opaque object's color is determined by the specific wavelengths it reflects into the observer's eye while absorbing all other incident spectral wavelengths.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q52"
            )
        )

        // Q53
        list.add(
            QuestionEntity(
                id = "phy_top_053",
                subject = "Physics",
                topic = "Electrostatics. Electric Field. Capacitors",
                year = "2005",
                questionText = "If the electrostatic force on a test charge of 0.2 coulombs in an electric field is 4N, what is the electric field intensity of the field?",
                optionA = "20.0 N/C",
                optionB = "0.8 N/C",
                optionC = "4.2 N/C",
                optionD = "8.0 N/C",
                correctAnswerIndex = 0,
                explanation = "Electric Field Intensity E = Force / Charge = 4N / 0.2C = 20.0 N/C.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q53"
            )
        )

        // Q54
        list.add(
            QuestionEntity(
                id = "phy_top_054",
                subject = "Physics",
                topic = "Electrostatics. Electric Field. Capacitors",
                year = "2005",
                questionText = "Three capacitors of capacitances 2 μF, 3 μF, and 6 μF are connected in series. Calculate the equivalent capacitance.",
                optionA = "1.0 μF",
                optionB = "11.0 μF",
                optionC = "3.0 μF",
                optionD = "2.0 μF",
                correctAnswerIndex = 0,
                explanation = "In series: 1/C_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1 ⇒ C_eq = 1.0 μF.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q54"
            )
        )

        // Q55
        list.add(
            QuestionEntity(
                id = "phy_top_055",
                subject = "Physics",
                topic = "Current Electricity",
                year = "2005",
                questionText = "Two resistors of resistances 4 ohms and 12 ohms are connected in parallel. What is the equivalent resistance?",
                optionA = "3.0 ohms",
                optionB = "16.0 ohms",
                optionC = "8.0 ohms",
                optionD = "4.8 ohms",
                correctAnswerIndex = 0,
                explanation = "In parallel: R_eq = (R₁ × R₂) / (R₁ + R₂) = (4 × 12) / (4 + 12) = 48 / 16 = 3.0 Ω.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q55"
            )
        )

        // Q56
        list.add(
            QuestionEntity(
                id = "phy_top_056",
                subject = "Physics",
                topic = "Current Electricity",
                year = "2005",
                questionText = "A cell has an electromotive force (e.m.f.) of 2.0V and an internal resistance of 0.5 ohms. If a 1.5 ohm resistor is connected across it, what current flows?",
                optionA = "1.0 A",
                optionB = "2.0 A",
                optionC = "4.0 A",
                optionD = "1.33 A",
                correctAnswerIndex = 0,
                explanation = "Current I = E / (R + r) = 2.0 / (1.5 + 0.5) = 2.0 / 2.0 = 1.0 A.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q56"
            )
        )

        // Q57
        list.add(
            QuestionEntity(
                id = "phy_top_057",
                subject = "Physics",
                topic = "Electrical Energy and Power",
                year = "2005",
                questionText = "A 100W light bulb is connected to a 240V mains supply. Calculate the electrical resistance of the bulb filament.",
                optionA = "576 ohms",
                optionB = "2.4 ohms",
                optionC = "24,000 ohms",
                optionD = "144 ohms",
                correctAnswerIndex = 0,
                explanation = "Power P = V² / R ⇒ R = V² / P = 240² / 100 = 57,600 / 100 = 576 Ω.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q57"
            )
        )

        // Q58
        list.add(
            QuestionEntity(
                id = "phy_top_058",
                subject = "Physics",
                topic = "Electrical Energy and Power",
                year = "2005",
                questionText = "If electricity costs ₦4.00 per kilowatt-hour, how much does it cost to run a 2000W electric heater for 6 hours?",
                optionA = "₦48.00",
                optionB = "₦24.00",
                optionC = "₦8.00",
                optionD = "₦12.00",
                correctAnswerIndex = 0,
                explanation = "Energy consumed = Power × Time = 2 kW × 6 hours = 12 kWh. Total cost = 12 kWh × ₦4.00/kWh = ₦48.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q58"
            )
        )

        // Q59
        list.add(
            QuestionEntity(
                id = "phy_top_059",
                subject = "Physics",
                topic = "Magnetic Field and Electromagnetic Induction",
                year = "2005",
                questionText = "The primary coil of a step-down transformer has 400 turns and is connected to a 240V supply. If the secondary coil has 100 turns, what is the output secondary voltage?",
                optionA = "60V",
                optionB = "960V",
                optionC = "120V",
                optionD = "15V",
                correctAnswerIndex = 0,
                explanation = "Transformer equation: V_s / V_p = N_s / N_p ⇒ V_s / 240 = 100 / 400 ⇒ V_s = 240 / 4 = 60V.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q59"
            )
        )

        // Q60
        list.add(
            QuestionEntity(
                id = "phy_top_060",
                subject = "Physics",
                topic = "Magnetic Field and Electromagnetic Induction",
                year = "2005",
                questionText = "Lenz's law of electromagnetic induction is a direct physical consequence of the conservation of:",
                optionA = "Energy",
                optionB = "Momentum",
                optionC = "Charge",
                optionD = "Mass",
                correctAnswerIndex = 0,
                explanation = "Lenz's law states that the induced current creates a magnetic field that opposes the change producing it, ensuring mechanical work done is converted into electrical energy without violating energy conservation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q60"
            )
        )

        // Q61
        list.add(
            QuestionEntity(
                id = "phy_top_061",
                subject = "Physics",
                topic = "Conduction of Electricity Through Liquids and Gases",
                year = "2005",
                questionText = "According to Faraday's first law of electrolysis, the mass m of a chemical substance deposited at an electrode is given by:",
                optionA = "m = z·I·t",
                optionB = "m = z·I / t",
                optionC = "m = z / (I·t)",
                optionD = "m = I·t / z",
                correctAnswerIndex = 0,
                explanation = "Faraday's first law states m ∝ Q ⇒ m = z·Q = z·I·t, where z is the electrochemical equivalent of the substance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q61"
            )
        )

        // Q62
        list.add(
            QuestionEntity(
                id = "phy_top_062",
                subject = "Physics",
                topic = "Conduction of Electricity Through Liquids and Gases",
                year = "2005",
                questionText = "During the electrolysis of copper(II) sulfate using copper electrodes, what reaction occurs at the anode?",
                optionA = "Copper atoms dissolve into solution as copper ions",
                optionB = "Copper ions are deposited as metallic copper",
                optionC = "Oxygen gas is liberated",
                optionD = "Hydrogen gas is liberated",
                correctAnswerIndex = 0,
                explanation = "With active copper anodes, copper metal oxidizes and dissolves into the electrolyte: Cu(s) → Cu²⁺(aq) + 2e⁻.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q62"
            )
        )

        // Q63
        list.add(
            QuestionEntity(
                id = "phy_top_063",
                subject = "Physics",
                topic = "Atomic Physics and Radio Activities",
                year = "2005",
                questionText = "What is the number of neutrons in the Uranium isotope ²³⁸₉₂U?",
                optionA = "146",
                optionB = "92",
                optionC = "238",
                optionD = "330",
                correctAnswerIndex = 0,
                explanation = "Mass number A = 238, proton count Z = 92. Neutron number N = A - Z = 238 - 92 = 146.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q63"
            )
        )

        // Q64
        list.add(
            QuestionEntity(
                id = "phy_top_064",
                subject = "Physics",
                topic = "Atomic Physics and Radio Activities",
                year = "2005",
                questionText = "A radioactive substance has a half-life of 4 days. If the initial count rate is 800 counts/min, what will be the count rate after 12 days?",
                optionA = "100 counts/min",
                optionB = "200 counts/min",
                optionC = "50 counts/min",
                optionD = "400 counts/min",
                correctAnswerIndex = 0,
                explanation = "Number of half-lives n = 12 / 4 = 3. Remaining count rate = 800 × (½)³ = 800 / 8 = 100 counts/min.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q64"
            )
        )

        // Q65
        list.add(
            QuestionEntity(
                id = "phy_top_065",
                subject = "Physics",
                topic = "Introductory Electronics",
                year = "2005",
                questionText = "A p-type semiconductor is created by doping pure intrinsic silicon with which type of impurity?",
                optionA = "Trivalent impurity (e.g. Boron, Indium, Gallium)",
                optionB = "Pentavalent impurity (e.g. Phosphorus, Arsenic)",
                optionC = "Divalent impurity",
                optionD = "Tetravalent impurity",
                correctAnswerIndex = 0,
                explanation = "Doping group 14 silicon with trivalent atoms (Group 13) creates electron vacancies (positive holes as majority carriers), forming a p-type semiconductor.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q65"
            )
        )

        // Q66
        list.add(
            QuestionEntity(
                id = "phy_top_066",
                subject = "Physics",
                topic = "Introductory Electronics",
                year = "2005",
                questionText = "The arrow head on the emitter terminal of a PNP junction transistor schematic points:",
                optionA = "Inwards towards the base",
                optionB = "Outwards away from the base",
                optionC = "Downwards into the collector",
                optionD = "Upwards into the power rail",
                correctAnswerIndex = 0,
                explanation = "In circuit diagrams, the emitter arrow shows conventional current flow. For a PNP transistor, conventional current flows from emitter inwards toward the base.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q66"
            )
        )

        // Q67
        list.add(
            QuestionEntity(
                id = "phy_top_067",
                subject = "Physics",
                topic = "Simple A.C. Circuit",
                year = "2005",
                questionText = "In alternating current theory, the root-mean-square (r.m.s.) current and peak current (I_peak) are related by:",
                optionA = "I_rms = I_peak / √2",
                optionB = "I_rms = I_peak × √2",
                optionC = "I_rms = I_peak / 2",
                optionD = "I_rms = 2 × I_peak",
                correctAnswerIndex = 0,
                explanation = "The effective (r.m.s.) current is related to maximum peak amplitude by I_rms = I_peak / √2 ≈ 0.707 · I_peak.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q67"
            )
        )

        // Q68
        list.add(
            QuestionEntity(
                id = "phy_top_068",
                subject = "Physics",
                topic = "Simple A.C. Circuit",
                year = "2005",
                questionText = "What is the inductive reactance of a 30mH inductor connected to a (1000/π) Hz AC supply?",
                optionA = "60 ohms",
                optionB = "30 ohms",
                optionC = "120 ohms",
                optionD = "15 ohms",
                correctAnswerIndex = 0,
                explanation = "Inductive Reactance X_L = 2π·f·L = 2π × (1000/π) × 0.030 H = 2 × 1000 × 0.030 = 60 Ω.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q68"
            )
        )

        // Q69
        list.add(
            QuestionEntity(
                id = "phy_top_069",
                subject = "Physics",
                topic = "Measurement, Dimension, Scalar and Vector Quantities",
                year = "2005",
                questionText = "Which of the following is a base fundamental physical quantity in SI units?",
                optionA = "Speed",
                optionB = "Luminous Intensity",
                optionC = "Force",
                optionD = "Volume",
                correctAnswerIndex = 1,
                explanation = "Luminous intensity (measured in candela, cd) is one of the seven fundamental SI base quantities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q69"
            )
        )

        // Q70
        list.add(
            QuestionEntity(
                id = "phy_top_070",
                subject = "Physics",
                topic = "Linear Motion, Projectiles",
                year = "2005",
                questionText = "Two taxis leave Benin and Agbor 80km apart at 12:00 hours. If they travel towards each other at 30km/h and 50km/h respectively, at what time will they meet?",
                optionA = "13:00 hr (1:00 PM)",
                optionB = "14:00 hr (2:00 PM)",
                optionC = "12:30 hr (12:30 PM)",
                optionD = "15:00 hr (3:00 PM)",
                correctAnswerIndex = 0,
                explanation = "Relative velocity of approach = 30 + 50 = 80 km/h. Time elapsed = distance / relative speed = 80 km / 80 km/h = 1 hour. Meeting time = 12:00 + 1 hr = 13:00 hours.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q70"
            )
        )

        // Q71
        list.add(
            QuestionEntity(
                id = "phy_top_071",
                subject = "Physics",
                topic = "Newton's Laws of Motion, Conservation of Momentum",
                year = "2005",
                questionText = "A body of mass 10kg is placed on a smooth plane inclined at 30° to the horizontal. Calculate its acceleration down the plane. [g = 10 m/s²]",
                optionA = "5.0 m/s²",
                optionB = "8.6 m/s²",
                optionC = "10.0 m/s²",
                optionD = "2.5 m/s²",
                correctAnswerIndex = 0,
                explanation = "Force down smooth incline = mg·sin(θ). Acceleration a = F/m = g·sin(30°) = 10 × 0.5 = 5.0 m/s².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q71"
            )
        )

        // Q72
        list.add(
            QuestionEntity(
                id = "phy_top_072",
                subject = "Physics",
                topic = "Circular Motion, Simple Harmonic Motion",
                year = "2005",
                questionText = "A body of mass 2kg moves with a velocity of 5 m/s in a circle of radius 10m. What is its centripetal acceleration?",
                optionA = "2.5 m/s²",
                optionB = "5.0 m/s²",
                optionC = "25.0 m/s²",
                optionD = "0.5 m/s²",
                correctAnswerIndex = 0,
                explanation = "Centripetal acceleration a_c = v² / r = 5² / 10 = 25 / 10 = 2.5 m/s².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q72"
            )
        )

        // Q73
        list.add(
            QuestionEntity(
                id = "phy_top_073",
                subject = "Physics",
                topic = "Gravitational Field, Mass and Weight",
                year = "2005",
                questionText = "If the radius of the Earth is 6.4 × 10⁶ m, calculate the escape velocity of a rocket launched from the Earth. [g = 10 m/s²]",
                optionA = "11.3 km/s",
                optionB = "8.0 km/s",
                optionC = "1.13 km/s",
                optionD = "113 km/s",
                correctAnswerIndex = 0,
                explanation = "Escape velocity v_e = √(2gR) = √(2 × 10 × 6.4 × 10⁶) = √(1.28 × 10⁸) ≈ 11,313 m/s = 11.3 km/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q73"
            )
        )

        // Q74
        list.add(
            QuestionEntity(
                id = "phy_top_074",
                subject = "Physics",
                topic = "Vectors, Equilibrium of Forces",
                year = "2005",
                questionText = "Two forces of magnitudes 6N and 8N act on a body at right angles (90°). What is the magnitude of the resultant force?",
                optionA = "10N",
                optionB = "14N",
                optionC = "2N",
                optionD = "48N",
                correctAnswerIndex = 0,
                explanation = "Resultant R = √(6² + 8²) = √(36 + 64) = √100 = 10N.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q74"
            )
        )

        // Q75
        list.add(
            QuestionEntity(
                id = "phy_top_075",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "2005",
                questionText = "A force of 40N is applied to pull a box through a horizontal distance of 10m. If the force is applied at an angle of 60° to the horizontal, calculate the work done.",
                optionA = "200 J",
                optionB = "400 J",
                optionC = "346 J",
                optionD = "173 J",
                correctAnswerIndex = 0,
                explanation = "Work done W = F · s · cos(θ) = 40 × 10 × cos(60°) = 400 × 0.5 = 200 J.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q75"
            )
        )

        // Q76
        list.add(
            QuestionEntity(
                id = "phy_top_076",
                subject = "Physics",
                topic = "Friction, Viscosity, Surface Tension",
                year = "2005",
                questionText = "Which of the following statements is true regarding kinetic (dynamic) friction compared to limiting static friction?",
                optionA = "It is always slightly less than limiting static friction",
                optionB = "It is always greater than static friction",
                optionC = "It is independent of the normal reaction",
                optionD = "It increases significantly with sliding velocity",
                correctAnswerIndex = 0,
                explanation = "Once relative sliding motion begins, microscopic surface interlocks are partially broken, making kinetic friction slightly lower than the maximum limiting static friction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q76"
            )
        )

        // Q77
        list.add(
            QuestionEntity(
                id = "phy_top_077",
                subject = "Physics",
                topic = "Simple Machine",
                year = "2005",
                questionText = "A block-and-tackle system has 6 pulleys. If an effort of 50N is used to lift a load of 240N, what is the efficiency of the machine?",
                optionA = "80%",
                optionB = "60%",
                optionC = "50%",
                optionD = "75%",
                correctAnswerIndex = 0,
                explanation = "Velocity Ratio VR = 6. Mechanical Advantage MA = Load / Effort = 240 / 50 = 4.8. Efficiency = (MA / VR) × 100 = (4.8 / 6) × 100 = 80%.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q77"
            )
        )

        // Q78
        list.add(
            QuestionEntity(
                id = "phy_top_078",
                subject = "Physics",
                topic = "Elasticity, Hooke's Law, Young's Modulus",
                year = "2005",
                questionText = "Young's Modulus of elasticity is defined as the ratio of:",
                optionA = "Tensile Stress to Tensile Strain",
                optionB = "Force to Cross-sectional Area",
                optionC = "Extension to Original Length",
                optionD = "Tensile Strain to Tensile Stress",
                correctAnswerIndex = 0,
                explanation = "Young's Modulus (E) measures tensile stiffness and is defined as Tensile Stress (F/A) divided by Tensile Strain (e/L₀).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q78"
            )
        )

        // Q79
        list.add(
            QuestionEntity(
                id = "phy_top_079",
                subject = "Physics",
                topic = "Density and Upthrust Archimedes Principle, Floatation",
                year = "2005",
                questionText = "An object floats in pure water with 20% of its volume above the water surface. What is the density of the object?",
                optionA = "800 kg/m³",
                optionB = "200 kg/m³",
                optionC = "1000 kg/m³",
                optionD = "1200 kg/m³",
                correctAnswerIndex = 0,
                explanation = "Since 20% is above water, 80% is submerged. By floatation: Density of object = 80% of water density = 0.8 × 1000 kg/m³ = 800 kg/m³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q79"
            )
        )

        // Q80
        list.add(
            QuestionEntity(
                id = "phy_top_080",
                subject = "Physics",
                topic = "Pressure, Pascal's Principle",
                year = "2005",
                questionText = "At what depth below sea level will a diver experience a total absolute pressure equal to 5 atmospheres? [1 atm = 1.0 × 10⁵ N/m², water density = 1000 kg/m³, g = 10 m/s²]",
                optionA = "40m",
                optionB = "50m",
                optionC = "30m",
                optionD = "10m",
                correctAnswerIndex = 0,
                explanation = "Total Pressure = P_atm + h·ρ·g ⇒ 5 × 10⁵ = 1.0 × 10⁵ + h × 1000 × 10 ⇒ 4 × 10⁵ = 10,000·h ⇒ h = 40m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q80"
            )
        )

        // Q81
        list.add(
            QuestionEntity(
                id = "phy_top_081",
                subject = "Physics",
                topic = "Temperature and Heat, Thermal Expansion",
                year = "2005",
                questionText = "A solid metal plate has an area of 2.0 m². If it is heated through 50K, what is the increase in surface area? [Area expansivity β = 2.4 × 10⁻⁵ K⁻¹]",
                optionA = "2.4 × 10⁻³ m²",
                optionB = "1.2 × 10⁻³ m²",
                optionC = "4.8 × 10⁻³ m²",
                optionD = "2.4 × 10⁻⁴ m²",
                correctAnswerIndex = 0,
                explanation = "Area increase ΔA = A₀ · β · ΔT = 2.0 × (2.4 × 10⁻⁵) × 50 = 2.4 × 10⁻³ m².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q81"
            )
        )

        // Q82
        list.add(
            QuestionEntity(
                id = "phy_top_082",
                subject = "Physics",
                topic = "Structure of Matter, Kinetic Theory, Gas Laws",
                year = "2005",
                questionText = "According to Charles's Law, the volume of a given mass of gas at constant pressure is directly proportional to its:",
                optionA = "Absolute Kelvin temperature",
                optionB = "Celsius temperature",
                optionC = "Density",
                optionD = "Atmospheric pressure",
                correctAnswerIndex = 0,
                explanation = "Charles's Law states V ∝ T (where T is the thermodynamic temperature in Kelvin) at constant pressure.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q82"
            )
        )

        // Q83
        list.add(
            QuestionEntity(
                id = "phy_top_083",
                subject = "Physics",
                topic = "Quantity of Heat: Heat Capacity and Latent Heat",
                year = "2005",
                questionText = "How much heat is released when 0.1kg of steam at 100°C condenses completely to liquid water at 100°C? [Specific latent heat of vaporization = 2.26 × 10⁶ J/kg]",
                optionA = "2.26 × 10⁵ J",
                optionB = "2.26 × 10⁴ J",
                optionC = "1.13 × 10⁵ J",
                optionD = "4.52 × 10⁵ J",
                correctAnswerIndex = 0,
                explanation = "Heat released Q = m · L = 0.1 kg × 2.26 × 10⁶ J/kg = 2.26 × 10⁵ J.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q83"
            )
        )

        // Q84
        list.add(
            QuestionEntity(
                id = "phy_top_084",
                subject = "Physics",
                topic = "Change of State, Vapours",
                year = "2005",
                questionText = "The boiling point of a liquid is elevated by:",
                optionA = "Increasing the external atmospheric pressure",
                optionB = "Decreasing the external atmospheric pressure",
                optionC = "Adding volatile impurities",
                optionD = "Using a wider boiling vessel",
                correctAnswerIndex = 0,
                explanation = "Boiling occurs when saturated vapour pressure equals external pressure. Higher external pressure requires a higher temperature for vapour pressure to reach that level.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q84"
            )
        )

        // Q85
        list.add(
            QuestionEntity(
                id = "phy_top_085",
                subject = "Physics",
                topic = "Heat Transfer",
                year = "2005",
                questionText = "Convection is a thermal transfer process that can ONLY occur in:",
                optionA = "Fluids (liquids and gases)",
                optionB = "Solids",
                optionC = "Vacuums",
                optionD = "Pure metals",
                correctAnswerIndex = 0,
                explanation = "Convection requires the physical mass movement of heated particles driven by density differences, which is only possible in fluid states (liquids and gases).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q85"
            )
        )

        // Q86
        list.add(
            QuestionEntity(
                id = "phy_top_086",
                subject = "Physics",
                topic = "Waves: Types, Production, Propagation, Properties",
                year = "2005",
                questionText = "What physical classification best describes light waves?",
                optionA = "Electromagnetic and Transverse",
                optionB = "Mechanical and Longitudinal",
                optionC = "Mechanical and Transverse",
                optionD = "Electromagnetic and Longitudinal",
                correctAnswerIndex = 0,
                explanation = "Light is a transverse electromagnetic wave with mutually perpendicular oscillating electric and magnetic fields propagating without requiring a material medium.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q86"
            )
        )

        // Q87
        list.add(
            QuestionEntity(
                id = "phy_top_087",
                subject = "Physics",
                topic = "Sound Waves: Propagation and Characteristics",
                year = "2005",
                questionText = "A resonance tube closed at one end of length 0.3m resonates in its fundamental mode. What is the wavelength of the sound? [Ignore end correction]",
                optionA = "1.2m",
                optionB = "0.6m",
                optionC = "0.3m",
                optionD = "2.4m",
                correctAnswerIndex = 0,
                explanation = "For fundamental resonance in a closed pipe: L = λ / 4 ⇒ λ = 4 × L = 4 × 0.3 = 1.2m.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q87"
            )
        )

        // Q88
        list.add(
            QuestionEntity(
                id = "phy_top_088",
                subject = "Physics",
                topic = "Light Energy, Reflections from Plane Surfaces",
                year = "2005",
                questionText = "An incident ray strikes a plane mirror at an angle of 35° to the mirror surface. What is the angle of reflection?",
                optionA = "55 degrees",
                optionB = "35 degrees",
                optionC = "70 degrees",
                optionD = "90 degrees",
                correctAnswerIndex = 0,
                explanation = "Angle of incidence i = 90° - 35° (glancing angle) = 55°. By the law of reflection, angle of reflection r = i = 55°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q88"
            )
        )

        // Q89
        list.add(
            QuestionEntity(
                id = "phy_top_089",
                subject = "Physics",
                topic = "Reflection of Light from Spherical Surfaces",
                year = "2005",
                questionText = "A concave mirror of focal length 15cm forms a real image twice the size of the object. How far is the object from the mirror?",
                optionA = "22.5cm",
                optionB = "30.0cm",
                optionC = "15.0cm",
                optionD = "10.0cm",
                correctAnswerIndex = 0,
                explanation = "Linear magnification m = v / u = 2 ⇒ v = 2u. Mirror formula: 1/f = 1/u + 1/v ⇒ 1/15 = 1/u + 1/2u = 3/(2u) ⇒ 2u = 45 ⇒ u = 22.5cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q89"
            )
        )

        // Q90
        list.add(
            QuestionEntity(
                id = "phy_top_090",
                subject = "Physics",
                topic = "Refraction of Light from Plane and Spherical Surfaces",
                year = "2005",
                questionText = "A beaker is filled with water of refractive index 4/3 to a depth of 12cm. What is the apparent depth of the beaker bottom?",
                optionA = "9cm",
                optionB = "16cm",
                optionC = "8cm",
                optionD = "10cm",
                correctAnswerIndex = 0,
                explanation = "Refractive index n = Real Depth / Apparent Depth ⇒ 4/3 = 12 / Apparent Depth ⇒ Apparent Depth = (12 × 3) / 4 = 9cm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q90"
            )
        )

        // Q91
        list.add(
            QuestionEntity(
                id = "phy_top_091",
                subject = "Physics",
                topic = "Optical Instrument, Vision",
                year = "2005",
                questionText = "Which lens arrangement is correct for a simple astronomical refracting telescope in normal adjustment?",
                optionA = "Objective has long focal length, Eyepiece has short focal length",
                optionB = "Objective has short focal length, Eyepiece has long focal length",
                optionC = "Both objective and eyepiece have identical focal lengths",
                optionD = "Objective is concave, Eyepiece is convex",
                correctAnswerIndex = 0,
                explanation = "Magnifying power M = f_objective / f_eyepiece. High magnification requires a large objective focal length f_o and a small eyepiece focal length f_e.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q91"
            )
        )

        // Q92
        list.add(
            QuestionEntity(
                id = "phy_top_092",
                subject = "Physics",
                topic = "Dispersion of Light. Electromagnetic Spectrum",
                year = "2005",
                questionText = "Which colour component of white light is refracted (deviated) the least when passing through a glass prism?",
                optionA = "Red",
                optionB = "Violet",
                optionC = "Yellow",
                optionD = "Green",
                correctAnswerIndex = 0,
                explanation = "Red light has the longest wavelength and fastest speed in optical glass, experiencing the smallest refractive index and therefore the least angle of deviation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q92"
            )
        )

        // Q93
        list.add(
            QuestionEntity(
                id = "phy_top_093",
                subject = "Physics",
                topic = "Electrostatics. Electric Field. Capacitors",
                year = "2005",
                questionText = "What is the equivalent capacitance of two capacitors of 4 μF and 6 μF connected in parallel?",
                optionA = "10 μF",
                optionB = "2.4 μF",
                optionC = "2.0 μF",
                optionD = "24 μF",
                correctAnswerIndex = 0,
                explanation = "In parallel: C_eq = C₁ + C₂ = 4 μF + 6 μF = 10 μF.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q93"
            )
        )

        // Q94
        list.add(
            QuestionEntity(
                id = "phy_top_094",
                subject = "Physics",
                topic = "Current Electricity",
                year = "2005",
                questionText = "Calculate the total equivalent resistance of three 15-ohm resistors connected in parallel.",
                optionA = "5 ohms",
                optionB = "45 ohms",
                optionC = "15 ohms",
                optionD = "7.5 ohms",
                correctAnswerIndex = 0,
                explanation = "In parallel: 1/R_eq = 1/15 + 1/15 + 1/15 = 3/15 = 1/5 ⇒ R_eq = 5 Ω.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q94"
            )
        )

        // Q95
        list.add(
            QuestionEntity(
                id = "phy_top_095",
                subject = "Physics",
                topic = "Electrical Energy and Power",
                year = "2005",
                questionText = "What is the appropriate standard fuse rating required for a 3kW electric kettle connected to a 240V supply?",
                optionA = "13 A",
                optionB = "5 A",
                optionC = "15 A",
                optionD = "10 A",
                correctAnswerIndex = 0,
                explanation = "Operating current I = P / V = 3000W / 240V = 12.5 A. The closest standard fuse rating above normal working current is 13 A.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q95"
            )
        )

        // Q96
        list.add(
            QuestionEntity(
                id = "phy_top_096",
                subject = "Physics",
                topic = "Magnetic Field and Electromagnetic Induction",
                year = "2005",
                questionText = "A step-down transformer has 300 turns in its primary coil and 30 turns in its secondary coil. If the output voltage is 12V, what is the input supply voltage?",
                optionA = "120V",
                optionB = "12V",
                optionC = "240V",
                optionD = "1.2V",
                correctAnswerIndex = 0,
                explanation = "Transformer formula: V_p / V_s = N_p / N_s ⇒ V_p = 12 × (300 / 30) = 12 × 10 = 120V.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q96"
            )
        )

        // Q97
        list.add(
            QuestionEntity(
                id = "phy_top_097",
                subject = "Physics",
                topic = "Conduction of Electricity Through Liquids and Gases",
                year = "2005",
                questionText = "The primary charge carriers responsible for electrical conduction through ionized gases are:",
                optionA = "Positive ions, negative ions, and free electrons",
                optionB = "Free electrons only",
                optionC = "Positive ions and protons",
                optionD = "Holes and electrons",
                correctAnswerIndex = 0,
                explanation = "In gas discharge tubes at reduced pressure, gas molecules dissociate into positive ions, negative ions, and free electrons which act as charge carriers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q97"
            )
        )

        // Q98
        list.add(
            QuestionEntity(
                id = "phy_top_098",
                subject = "Physics",
                topic = "Atomic Physics and Radio Activities",
                year = "2005",
                questionText = "In a nuclear fusion reaction, four protons of mass M_p merge to form a helium nucleus of mass M_He. Which of the following relationships is true?",
                optionA = "4 · M_p > M_He",
                optionB = "4 · M_p < M_He",
                optionC = "4 · M_p = M_He",
                optionD = "M_He = 0",
                correctAnswerIndex = 0,
                explanation = "The combined mass of the helium nucleus is less than the four constituent protons (4·M_p > M_He). The difference (mass defect Δm) is released as binding energy via E = Δm·c².",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q98"
            )
        )

        // Q99
        list.add(
            QuestionEntity(
                id = "phy_top_099",
                subject = "Physics",
                topic = "Introductory Electronics",
                year = "2005",
                questionText = "Silicon and Germanium are intrinsic semiconductors belonging to which group of the periodic table?",
                optionA = "Group 14 (IV)",
                optionB = "Group 13 (III)",
                optionC = "Group 15 (V)",
                optionD = "Group 16 (VI)",
                correctAnswerIndex = 0,
                explanation = "Silicon and Germanium each possess four valence electrons and belong to Group 14 (IV-A) of the periodic table.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q99"
            )
        )

        // Q100
        list.add(
            QuestionEntity(
                id = "phy_top_100",
                subject = "Physics",
                topic = "Simple A.C. Circuit",
                year = "2005",
                questionText = "At resonance in a series R-L-C alternating current circuit:",
                optionA = "Impedance is minimum and current is maximum",
                optionB = "Impedance is maximum and current is minimum",
                optionC = "Inductive reactance is zero",
                optionD = "Capacitive reactance is zero",
                correctAnswerIndex = 0,
                explanation = "At resonance, inductive reactance equals capacitive reactance (X_L = X_C), canceling each other out so circuit impedance Z = R (minimum), resulting in maximum current I = V/R.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics Syllabus Master • Q100"
            )
        )

        return list
    }
}
