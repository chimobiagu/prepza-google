package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Official JAMB Physics Historical Examination Series (1994 - 2004).
 * Verified options, calculations, answers and pedagogical explanations.
 */
object JambPhysicsHistorical1994to2004Bank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "phy_1994_01",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1994",
                questionText = "An object is projected with a velocity of 80 m/s at an angle of 30° to the horizontal. The maximum height reached is: (g = 10 m/s²)",
                optionA = "20 m",
                optionB = "80 m",
                optionC = "160 m",
                optionD = "320 m",
                correctAnswerIndex = 1,
                explanation = "H_max = (u sin θ)² / (2g) = (80 sin 30°)² / (2 × 10) = (80 × 0.5)² / 20 = 40² / 20 = 1600 / 20 = 80 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1994_02",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1994",
                questionText = "A motor vehicle is brought to rest from a speed of 15 m/s in 20 seconds. Calculate the retardation.",
                optionA = "0.75 m/s²",
                optionB = "1.33 m/s²",
                optionC = "5.00 m/s²",
                optionD = "7.50 m/s²",
                correctAnswerIndex = 0,
                explanation = "Retardation a = (u - v) / t = (15 - 0) / 20 = 0.75 m/s².",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1994_03",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1994",
                questionText = "An object of mass 50 kg is released from a height of 2 m. Find its kinetic energy just before it strikes the ground. (g = 10 m/s²)",
                optionA = "250 J",
                optionB = "1000 J",
                optionC = "10000 J",
                optionD = "500 J",
                correctAnswerIndex = 1,
                explanation = "By conservation of mechanical energy: Final KE = Initial PE = mgh = 50 × 10 × 2 = 1000 Joules.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1994_04",
                subject = "Physics",
                topic = "Simple Harmonic Motion and Elasticity",
                year = "1994",
                questionText = "A spring of length 25 cm is extended to 30 cm by a load of 150 N attached to one of its ends. What is the elastic potential energy stored in the spring?",
                optionA = "3750 J",
                optionB = "2500 J",
                optionC = "3.75 J",
                optionD = "2.50 J",
                correctAnswerIndex = 2,
                explanation = "Extension e = 30 cm - 25 cm = 5 cm = 0.05 m. Energy stored = 1/2 Fe = 1/2 × 150 × 0.05 = 3.75 Joules.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1994_05",
                subject = "Physics",
                topic = "Thermal Physics and Gas Laws",
                year = "1994",
                questionText = "The melting point of naphthalene is 78 °C. What is this temperature on the Kelvin absolute scale?",
                optionA = "100 K",
                optionB = "315 K",
                optionC = "351 K",
                optionD = "378 K",
                correctAnswerIndex = 2,
                explanation = "T(K) = θ(°C) + 273.15 = 78 + 273.15 = 351.15 K ≈ 351 K.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1994_06",
                subject = "Physics",
                topic = "Waves and Sound Resonance",
                year = "1994",
                questionText = "A sound wave from a ship's sonar travels to the bottom of the sea and the echo is received 4 s later. If the speed of sound in seawater is 1500 m/s, what is the depth of the sea?",
                optionA = "6000 m",
                optionB = "3000 m",
                optionC = "1500 m",
                optionD = "375 m",
                correctAnswerIndex = 1,
                explanation = "Depth d = (v × t) / 2 = (1500 × 4) / 2 = 3000 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1994_07",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "1994",
                questionText = "Two resistors R₁ = 4 Ω and R₂ = 5 Ω are connected in parallel across a potential difference V. If P₁ and P₂ represent the power dissipated in R₁ and R₂ respectively, the ratio P₁ : P₂ is:",
                optionA = "4 : 5",
                optionB = "5 : 4",
                optionC = "16 : 25",
                optionD = "25 : 16",
                correctAnswerIndex = 1,
                explanation = "In parallel, P = V² / R. Therefore, P₁ / P₂ = (V² / R₁) / (V² / R₂) = R₂ / R₁ = 5 / 4 (5 : 4).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1995_01",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1995",
                questionText = "Which of the following is the correct dimensional representation of pressure?",
                optionA = "ML⁻¹T⁻²",
                optionB = "MLT⁻²",
                optionC = "ML²T⁻³",
                optionD = "ML⁻³",
                correctAnswerIndex = 0,
                explanation = "Pressure = Force / Area = (MLT⁻²) / (L²) = ML⁻¹T⁻².",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1995",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1995_02",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1995",
                questionText = "An electric kettle rated at 2000 W contains 2.0 kg of water. How long will it take the temperature of the water to rise from 20 °C to 100 °C? (Specific heat capacity of water = 4200 J·kg⁻¹·K⁻¹)",
                optionA = "420 s",
                optionB = "336 s",
                optionC = "168 s",
                optionD = "84 s",
                correctAnswerIndex = 1,
                explanation = "Heat required Q = mcΔθ = 2.0 × 4200 × (100 - 20) = 2.0 × 4200 × 80 = 672,000 J. Time t = Q / P = 672,000 / 2000 = 336 s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1995",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1995_03",
                subject = "Physics",
                topic = "Waves and Sound Resonance",
                year = "1995",
                questionText = "Which of the following wave phenomena is EXCLUSIVE to transverse waves and cannot occur in longitudinal waves?",
                optionA = "Diffraction",
                optionB = "Refraction",
                optionC = "Interference",
                optionD = "Polarization",
                correctAnswerIndex = 3,
                explanation = "Polarization occurs only when wave oscillations are perpendicular to the direction of propagation (transverse waves). Longitudinal waves (like sound) oscillate along the direction of propagation and cannot be polarized.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1995",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1997_01",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1997",
                questionText = "The distance x in metres travelled by a particle in time t seconds is described by x = 10 + 12t². Find the average speed of the particle between t = 2 s and t = 5 s.",
                optionA = "60 m/s",
                optionB = "72 m/s",
                optionC = "84 m/s",
                optionD = "108 m/s",
                correctAnswerIndex = 2,
                explanation = "At t = 2 s: x₁ = 10 + 12(4) = 58 m. At t = 5 s: x₂ = 10 + 12(25) = 310 m. Average speed = Δx / Δt = (310 - 58) / (5 - 2) = 252 / 3 = 84 m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1997",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1997_02",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1997",
                questionText = "An electric water pump rated 1.5 kW lifts 200 kg of water through a vertical height of 6 metres in 10 seconds. What is the efficiency of the pump? (g = 10 m/s²)",
                optionA = "90.0%",
                optionB = "85.0%",
                optionC = "80.0%",
                optionD = "65.0%",
                correctAnswerIndex = 2,
                explanation = "Work output = mgh = 200 × 10 × 6 = 12,000 J. Power output = 12,000 / 10 = 1200 W. Efficiency = (Power Output / Power Input) × 100% = (1200 / 1500) × 100% = 80.0%.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1997",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1998_01",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1998",
                questionText = "The physical quantity that has the same dimensions as impulse is:",
                optionA = "Energy",
                optionB = "Momentum",
                optionC = "Surface tension",
                optionD = "Pressure",
                correctAnswerIndex = 1,
                explanation = "Impulse = Force × time = (MLT⁻²)(T) = MLT⁻¹. Momentum = Mass × velocity = M(LT⁻¹) = MLT⁻¹. Both share identical dimensions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1998",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1998_02",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1998",
                questionText = "A ball is moving at 18 m/s in a direction inclined at 60° to the horizontal. The horizontal component of its velocity is:",
                optionA = "9√3 m/s",
                optionB = "6√3 m/s",
                optionC = "9 m/s",
                optionD = "18 m/s",
                correctAnswerIndex = 2,
                explanation = "Horizontal component v_x = v cos θ = 18 cos 60° = 18 × 0.5 = 9 m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1998",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1999_01",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1999",
                questionText = "A car of mass 800 kg accelerates uniformly from rest to a speed of 25 m/s in 20 seconds. The average power developed by the engine is:",
                optionA = "1.25 × 10⁴ W",
                optionB = "2.50 × 10⁴ W",
                optionC = "1.25 × 10⁶ W",
                optionD = "2.50 × 10⁶ W",
                correctAnswerIndex = 0,
                explanation = "Work done = Final KE = 1/2 mv² = 1/2 × 800 × (25)² = 400 × 625 = 250,000 J. Power = Work / t = 250,000 / 20 = 12,500 W = 1.25 × 10⁴ W.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1999",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1999_02",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1999",
                questionText = "A lead bullet of mass 0.05 kg is fired with a velocity of 200 m/s into a stationary lead block of mass 0.95 kg. If the bullet embeds in the block and they move together freely, what is the common velocity after impact?",
                optionA = "10 m/s",
                optionB = "20 m/s",
                optionC = "50 m/s",
                optionD = "100 m/s",
                correctAnswerIndex = 0,
                explanation = "By conservation of linear momentum: m₁u₁ = (m₁ + m₂)v => 0.05 × 200 = (0.05 + 0.95) v => 10 = 1.0 v => v = 10 m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1999",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_2000_01",
                subject = "Physics",
                topic = "Waves and Sound Resonance",
                year = "2000",
                questionText = "A sonometer wire is vibrating at frequency f₀. If the tension in the wire is quadrupled while the length and mass per unit length remain constant, the new frequency of vibration is:",
                optionA = "f₀ / 2",
                optionB = "2 f₀",
                optionC = "4 f₀",
                optionD = "f₀ / 4",
                correctAnswerIndex = 1,
                explanation = "Frequency f = (1 / 2L) √(T / μ). When tension T becomes 4T, f' = f₀ × √4 = 2 f₀.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 2000",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_2001_01",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "2001",
                questionText = "A ray of light strikes a plane mirror at an angle of incidence of 35°. If the mirror is rotated through an angle of 10°, through what angle is the reflected ray rotated?",
                optionA = "10°",
                optionB = "20°",
                optionC = "35°",
                optionD = "70°",
                correctAnswerIndex = 1,
                explanation = "When a reflecting plane mirror is rotated through an angle θ, the reflected ray rotates through twice that angle (2θ = 2 × 10° = 20°).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 2001",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_2002_01",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "2002",
                questionText = "An electric iron is rated 1000 W, 230 V. What is the electrical resistance of its heating element?",
                optionA = "57.6 Ω",
                optionB = "55.9 Ω",
                optionC = "52.9 Ω",
                optionD = "23.0 Ω",
                correctAnswerIndex = 2,
                explanation = "P = V² / R => R = V² / P = (230)² / 1000 = 52,900 / 1000 = 52.9 Ω.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 2002",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_2003_01",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "2003",
                questionText = "A concave mirror of radius of curvature 40 cm forms a real image twice as large as the object (magnification m = 2). The object distance is:",
                optionA = "10 cm",
                optionB = "20 cm",
                optionC = "30 cm",
                optionD = "60 cm",
                correctAnswerIndex = 2,
                explanation = "Focal length f = r / 2 = 20 cm. For a real image in a concave mirror, m = f / (u - f) => 2 = 20 / (u - 20) => 2(u - 20) = 20 => 2u - 40 = 20 => 2u = 60 => u = 30 cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 2003",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_2004_01",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "2004",
                questionText = "A wire of 5 Ω resistance is drawn out uniformly so that its new length is twice the original length. If the resistivity and volume remain unchanged, the new resistance of the wire is:",
                optionA = "10 Ω",
                optionB = "15 Ω",
                optionC = "20 Ω",
                optionD = "40 Ω",
                correctAnswerIndex = 2,
                explanation = "When length is doubled (L' = 2L) at constant volume, cross-sectional area is halved (A' = A/2). New resistance R' = ρ(2L) / (A/2) = 4(ρL/A) = 4 × 5 = 20 Ω.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 2004",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
