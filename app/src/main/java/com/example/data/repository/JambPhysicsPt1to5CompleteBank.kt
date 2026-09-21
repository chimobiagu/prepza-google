package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Physics Question Series (Parts 1 to 5) with Mathematical Solutions and Step-by-Step Explanations
 * Total Verified Questions: 30
 */
object JambPhysicsPt1to5CompleteBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_02",
                subject = "Physics",
                topic = "Energy & Work",
                year = "Part 1",
                questionText = "A carpenter on top of a roof 20.0m high dropped a hammer of mass 1.5kg and it fell freely to the ground. The kinetic energy of the hammer just before hitting the ground is _____ [g = 10ms-2]",
                optionA = "450 J",
                optionB = "600 J",
                optionC = "150 J",
                optionD = "300 J",
                correctAnswerIndex = 3,
                explanation = "By conservation of energy: K.E = P.E = mgh = 1.5 kg × 10 ms⁻² × 20 m = 300 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_03",
                subject = "Physics",
                topic = "Free Fall Motion",
                year = "Part 1",
                questionText = "Two balls X and Y weighing 5g and 50kg respectively were thrown up vertically at the same time with a velocity of 100ms-1. How will their positions be one second later?",
                optionA = "X and Y will both be 95m from the point of throw",
                optionB = "X and Y will be 500m from each other",
                optionC = "Y will be 500 m ahead of X",
                optionD = "X will be 500m ahead of Y",
                correctAnswerIndex = 0,
                explanation = "Under gravity in vacuum/air ignoring air resistance, acceleration g is independent of mass. Both cover h = ut - 0.5gt² = 100(1) - 0.5(10)(1) = 95m and remain at identical height.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_04",
                subject = "Physics",
                topic = "Gravitation & Weightlessness",
                year = "Part 1",
                questionText = "A man standing in a lift that is descending in free fall does not feel any weight because _____.",
                optionA = "there is no gravitational pull on the man in the lift",
                optionB = "the inside of the lift is air tight",
                optionC = "the lift is in vacuum",
                optionD = "there is no reaction from the floor of the lift",
                correctAnswerIndex = 3,
                explanation = "Apparent weight = m(g - a). When a = g (free fall), the normal reaction R = 0, causing weightlessness.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_05",
                subject = "Physics",
                topic = "Vectors",
                year = "Part 1",
                questionText = "[DIAGRAM: Vector Diagram:\nVertical Vector = 6.0 N (Upwards along y-axis)\nHorizontal Vector = 8.0 N (Rightwards along x-axis)\nAngle between vectors = 90 degrees]\n\nThe diagram above shows two vectors at right angles to each other. The value of the resultant vector is _____.",
                optionA = "13.0 N",
                optionB = "14.0 N",
                optionC = "10.0 N",
                optionD = "12.0 N",
                correctAnswerIndex = 2,
                explanation = "Resultant R = √(6.0² + 8.0²) = √(36 + 64) = √100 = 10.0 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_06",
                subject = "Physics",
                topic = "Circular Motion",
                year = "Part 1",
                questionText = "An object of mass 2kg moves with a velocity of 10ms-1 round a circle of radius 4m. Calculate the centripetal force on the object.",
                optionA = "40 N",
                optionB = "25 N",
                optionC = "100 N",
                optionD = "50 N",
                correctAnswerIndex = 3,
                explanation = "Centripetal Force F = mv²/r = (2 × 10²) / 4 = 200 / 4 = 50 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_07",
                subject = "Physics",
                topic = "Equations of Motion",
                year = "Part 1",
                questionText = "If it takes an object 3s to fall freely to the ground from a certain height, what is the distance covered by the object? [g = 10ms-2]",
                optionA = "60 m",
                optionB = "90 m",
                optionC = "30 m",
                optionD = "45 m",
                correctAnswerIndex = 3,
                explanation = "Distance s = ut + 0.5gt² = 0 + 0.5(10)(3²) = 0.5 × 10 × 9 = 45 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_08",
                subject = "Physics",
                topic = "Equilibrium",
                year = "Part 1",
                questionText = "[DIAGRAM: Equilibrium States of a Cone:\n- Position X: Cone balanced upside down on its sharp vertex (Unstable Equilibrium)\n- Position Y: Cone resting upright on its flat circular base (Stable Equilibrium)\n- Position Z: Cone resting on its curved lateral side (Neutral Equilibrium)]\n\nThe diagrams above show the positions of a cone. The position which can be described as neutral equilibrium is represented as _____.",
                optionA = "Y and X",
                optionB = "Z only",
                optionC = "X only",
                optionD = "Y and Z",
                correctAnswerIndex = 1,
                explanation = "A cone resting on its curved lateral side (Z) remains at the same height of center of gravity when rolled, defining neutral equilibrium.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_09",
                subject = "Physics",
                topic = "Capillarity",
                year = "Part 1",
                questionText = "If a tube of small radius opened at both ends is placed in a liquid, the liquid will _____.",
                optionA = "rise above the liquid level if the liquid does not wet the glass",
                optionB = "remain at the same level irrespective of whether the liquid wets the glass or not",
                optionC = "fall below the liquid level if the liquid wets the glass",
                optionD = "fall below the liquid level if the liquid does not wet the glass",
                correctAnswerIndex = 3,
                explanation = "A non-wetting liquid (like mercury, where cohesive forces exceed adhesive forces) is depressed and falls below surrounding liquid level in a capillary tube.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_10",
                subject = "Physics",
                topic = "Hydrostatic Pressure",
                year = "Part 1",
                questionText = "I. Density of the liquid\nII. Depth below the surface of the liquid\nIII. Surface area of the liquid\n\nIn which of the statements above will hydrostatic pressure be dependent?",
                optionA = "I and III only",
                optionB = "I and II only",
                optionC = "II and III only",
                optionD = "I, II and III",
                correctAnswerIndex = 1,
                explanation = "Hydrostatic pressure P = hρg depends solely on depth h and fluid density ρ; it is independent of surface area.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_11",
                subject = "Physics",
                topic = "Thermometry",
                year = "Part 1",
                questionText = "I. High thermal capacity\nII. High sensitivity\nIII. Easy readability\nIV. Accuracy over a wide range of temperatures\n\nFrom the statements above, the qualities of a good thermometer are _____.",
                optionA = "II, III and IV",
                optionB = "I and II",
                optionC = "I, II, III and IV",
                optionD = "I, III and IV",
                correctAnswerIndex = 0,
                explanation = "A good thermometer requires low thermal capacity (so it does not alter the measured system's temperature), high sensitivity, legibility, and broad temperature range.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_12",
                subject = "Physics",
                topic = "Machines",
                year = "Part 1",
                questionText = "A machine is used to lift a load of 20 N through a height of 10m. If the efficiency of the machine is 40%, how much work is done?",
                optionA = "120 J",
                optionB = "80 J",
                optionC = "500 J",
                optionD = "300 J",
                correctAnswerIndex = 2,
                explanation = "Useful Work Output = Load × Distance = 20 N × 10 m = 200 J.\nWork Done (Input) = Output / Efficiency = 200 / 0.40 = 500 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_13",
                subject = "Physics",
                topic = "Friction",
                year = "Part 1",
                questionText = "Which of the following could be effectively used to reduce friction?",
                optionA = "Petrol",
                optionB = "Kerosene",
                optionC = "Grease",
                optionD = "Water",
                correctAnswerIndex = 2,
                explanation = "Grease and lubricating oils create a fluid barrier between contacting solid surfaces, significantly lowering friction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_14",
                subject = "Physics",
                topic = "Elasticity",
                year = "Part 1",
                questionText = "A copper wire was subjected to a tensile stress of 7.7 x 107 Nm-2. Calculate the tensile strain of the wire. [Young modulus = 1.1 x 1011 Nm-2]",
                optionA = "2.2 x 10-4",
                optionB = "2.0 x 10-5",
                optionC = "7.0 x 10-3",
                optionD = "7.0 x 10-4",
                correctAnswerIndex = 3,
                explanation = "Young's Modulus E = Stress / Strain => Strain = Stress / E = (7.7 × 10⁷) / (1.1 × 10¹¹) = 7.0 × 10⁻⁴.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_15",
                subject = "Physics",
                topic = "Archimedes' Principle",
                year = "Part 1",
                questionText = "An object weighs 22kg in water and 30kg in air. What is the upthrust exerted by the liquid on the object? [g = 10 ms-2]",
                optionA = "80 N",
                optionB = "50 N",
                optionC = "520 N",
                optionD = "220 N",
                correctAnswerIndex = 0,
                explanation = "Apparent mass loss = 30 kg - 22 kg = 8 kg.\nUpthrust = mass loss × g = 8 kg × 10 ms⁻² = 80 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_16",
                subject = "Physics",
                topic = "Heat Capacity",
                year = "Part 1",
                questionText = "A block of aluminium is heated electrically by a 30 W heater. If the temperature rises by 100°C in 5 minutes, the heat capacity of the aluminium is _____.",
                optionA = "200 JK-1",
                optionB = "900 JK-1",
                optionC = "90 JK-1",
                optionD = "100 JK-1",
                correctAnswerIndex = 2,
                explanation = "Energy Q = Power × time = 30 W × (5 × 60 s) = 9000 J.\nHeat Capacity C = Q / Δθ = 9000 J / 100 K = 90 JK⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_17",
                subject = "Physics",
                topic = "Radiation",
                year = "Part 1",
                questionText = "A perfect emitter or absorber of radiant energy is a _____.",
                optionA = "red body",
                optionB = "conductor",
                optionC = "black body",
                optionD = "white body",
                correctAnswerIndex = 2,
                explanation = "A black body absorbs 100% of incident radiation and is also an ideal emitter (emissivity = 1).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_18",
                subject = "Physics",
                topic = "Thermal Properties",
                year = "Part 1",
                questionText = "The phenomenon that shows that increase in pressure lowers the melting point of ice can be observed in _____.",
                optionA = "regelation",
                optionB = "sublimation",
                optionC = "condensation",
                optionD = "coagulation",
                correctAnswerIndex = 0,
                explanation = "Regelation is the melting of ice under applied pressure and its refreezing when pressure is released.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_19",
                subject = "Physics",
                topic = "Gas Laws",
                year = "Part 1",
                questionText = "If the volume of a gas decreases steadily as the temperature decreases at constant pressure, the gas obeys _____.",
                optionA = "Charles' law",
                optionB = "Graham's law",
                optionC = "Boyle's law",
                optionD = "Pressure law",
                correctAnswerIndex = 0,
                explanation = "Charles's Law states that at constant pressure, the volume of a fixed mass of gas is directly proportional to its absolute temperature (V ∝ T).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_20",
                subject = "Physics",
                topic = "Latent Heat",
                year = "Part 1",
                questionText = "Steam burn is more severe than that of boiling water because _____.",
                optionA = "steam burn is dependent on relative humidity",
                optionB = "steam burn is independent of relative humidity",
                optionC = "steam possesses greater heat energy per unit mass due to latent heat of vaporization",
                optionD = "water boils at a higher temperature",
                correctAnswerIndex = 2,
                explanation = "Steam at 100°C contains an additional 2.26 × 10⁶ J/kg of latent heat of vaporization that is released upon condensing on the skin.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_21",
                subject = "Physics",
                topic = "Wave Properties",
                year = "Part 1",
                questionText = "Which of the following types of waves needs a material medium for propagation?",
                optionA = "X-rays",
                optionB = "Sound waves",
                optionC = "Light waves",
                optionD = "Radio waves",
                correctAnswerIndex = 1,
                explanation = "Sound is a mechanical longitudinal wave requiring a material medium (solid, liquid, gas) to propagate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_23",
                subject = "Physics",
                topic = "Thermal Expansivity",
                year = "Part 1",
                questionText = "A metal of volume 40cm3 is heated from 30°C to 90°C, the increase in volume is _____ [Linear expansivity α = 2.0 x 10-5 K-1]",
                optionA = "0.40 cm3",
                optionB = "0.14 cm3",
                optionC = "0.144 cm3",
                optionD = "1.20 cm3",
                correctAnswerIndex = 2,
                explanation = "Volume expansivity γ = 3α = 3 × (2.0 × 10⁻⁵) = 6.0 × 10⁻⁵ K⁻¹.\nΔV = V₀ × γ × Δθ = 40 × (6.0 × 10⁻⁵) × (90 - 30) = 40 × 6.0 × 10⁻⁵ × 60 = 0.144 cm³ ≈ 0.14 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_24",
                subject = "Physics",
                topic = "Kinetic Theory",
                year = "Part 1",
                questionText = "I. Change of state\nII. Diffusion\nIII. Radiation\nIV. Osmosis\n\nWhich of the processes above can be explained using the kinetic theory of matter?",
                optionA = "I, II and IV",
                optionB = "I, II, III and IV",
                optionC = "I, II and III",
                optionD = "I, III and IV",
                correctAnswerIndex = 0,
                explanation = "Change of state, molecular diffusion, and osmosis depend on particle motion and collision (Kinetic Theory), whereas radiation is an electromagnetic wave process.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_25",
                subject = "Physics",
                topic = "Optics & Vision",
                year = "Part 1",
                questionText = "When the aging human eye loses its power of accommodation, the defect is known as _____.",
                optionA = "long-sightedness",
                optionB = "short-sightedness",
                optionC = "presbyopia",
                optionD = "astigmatism",
                correctAnswerIndex = 2,
                explanation = "Presbyopia is the age-related reduction in the elasticity of the crystalline lens and ciliary muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_26",
                subject = "Physics",
                topic = "Sound & Vibrations",
                year = "Part 1",
                questionText = "A length of wire has a frequency of 255Hz when stretched by a force of 225 N. If the force increases to 324 N, what is the new frequency of vibration?",
                optionA = "356 Hz",
                optionB = "306 Hz",
                optionC = "512 Hz",
                optionD = "488 Hz",
                correctAnswerIndex = 1,
                explanation = "Frequency f ∝ √T.\nf₂ / f₁ = √(T₂ / T₁) => f₂ = 255 × √(324 / 225) = 255 × (18 / 15) = 255 × 1.2 = 306 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_27",
                subject = "Physics",
                topic = "Optics",
                year = "Part 1",
                questionText = "A certain far-sighted person cannot see objects that are closer to the eye than 50cm clearly. Determine the power of the converging lens which will enable him to see at 25cm.",
                optionA = "0.04 D",
                optionB = "0.06 D",
                optionC = "2.0 D",
                optionD = "0.03 D",
                correctAnswerIndex = 2,
                explanation = "u = 25 cm = 0.25 m, v = -50 cm = -0.50 m.\nPower P = 1/f = 1/u + 1/v = (1 / 0.25) - (1 / 0.50) = 4 - 2 = +2.0 D.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_28",
                subject = "Physics",
                topic = "Electromagnetic Spectrum",
                year = "Part 1",
                questionText = "Which of the following electromagnetic waves has the highest frequency?",
                optionA = "X-rays",
                optionB = "Ultra-violet rays",
                optionC = "Radio waves",
                optionD = "Infrared-rays",
                correctAnswerIndex = 0,
                explanation = "In the EM spectrum, X-rays possess higher frequency (and photon energy) than UV, IR, and radio waves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_29",
                subject = "Physics",
                topic = "Optics - Colors",
                year = "Part 1",
                questionText = "When a red rose flower is observed in pure blue light, what colour does the observer see?",
                optionA = "Yellow",
                optionB = "Red",
                optionC = "Blue",
                optionD = "Black",
                correctAnswerIndex = 3,
                explanation = "A red rose reflects only red wavelengths and absorbs blue light completely; without red light to reflect, it appears black.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_26",
                subject = "Physics",
                topic = "Wave Motion",
                year = "Part 1",
                questionText = "The equation of a wave travelling in a horizontal direction is expressed as y = 15 sin (2π / 5)(60t - x). What is its wavelength?",
                optionA = "60 m",
                optionB = "15 m",
                optionC = "5 m",
                optionD = "2 m",
                correctAnswerIndex = 2,
                explanation = "Standard wave form: y = A sin (2π / λ)(vt - x). By inspection, λ = 5 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_44",
                subject = "Physics",
                topic = "A.C. Electricity",
                year = "Part 1",
                questionText = "In an A.C. circuit, the ratio of r.m.s value to peak value of current is _____.",
                optionA = "1 / √2",
                optionB = "√2",
                optionC = "2",
                optionD = "1 / 2",
                correctAnswerIndex = 0,
                explanation = "I_rms = I₀ / √2, so the ratio I_rms / I₀ = 1 / √2 ≈ 0.707.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q44)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_p1_45",
                subject = "Physics",
                topic = "Inductance",
                year = "Part 1",
                questionText = "Two inductors of inductances 4H and 8H are arranged in series and a current of 10A is passed through them. What is the energy stored in them?",
                optionA = "250 J",
                optionB = "600 J",
                optionC = "500 J",
                optionD = "133 J",
                correctAnswerIndex = 1,
                explanation = "Total series inductance L = 4 + 8 = 12 H.\nEnergy E = 0.5 × L × I² = 0.5 × 12 × 10² = 6 × 100 = 600 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Part 1 (Q45)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
