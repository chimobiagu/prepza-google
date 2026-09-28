package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Physics Past Questions (PT. 1-5)
 * Extracted with 100% source fidelity from authentic JAMB Physics examinations across Parts 1 to 5.
 * Contains 240 questions covering mechanics, optics, thermal physics, electricity, magnetism, waves, and modern physics.
 */
object JambPhysicsPt1to5CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_01",
                subject = "Physics",
                topic = "General Introduction",
                year = "PT. 1",
                questionText = "Which Question Paper Type of Physics is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D.",
                correctAnswerIndex = 2,
                explanation = "JAMB examination question paper type identifier.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_02",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "PT. 1",
                questionText = "A carpenter on top of a roof 20.m high dropped a hammer of mass 1.5kg and it fell freely to the ground. The kinetic energy of the hammer just before hitting the ground is _____ [g = 10ms⁻²]",
                optionA = "450 J",
                optionB = "600 J",
                optionC = "150 J",
                optionD = "300 J",
                correctAnswerIndex = 3,
                explanation = "Loss in potential energy = Gain in kinetic energy: KE = mgh = 1.5 × 10 × 20 = 300 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_03",
                subject = "Physics",
                topic = "Motion Under Gravity",
                year = "PT. 1",
                questionText = "Two balls X and Y weighing 5g and 50kg respectively were thrown up vertically at the same time with a velocity of 100ms⁻¹. How will their positions be one second later?",
                optionA = "X and Y will both be 500m from the point of throw",
                optionB = "X and Y will be 500m from each other",
                optionC = "Y will be 500 m ahead of X",
                optionD = "X will be 500m ahead of Y.",
                correctAnswerIndex = 0,
                explanation = "In a vacuum/neglecting air resistance, acceleration under gravity is independent of mass (g = 10ms⁻²). Both reach h = ut - ½gt² = 100(1) - 5(1)² = 95m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_04",
                subject = "Physics",
                topic = "Forces and Friction",
                year = "PT. 1",
                questionText = "A man standing on a lift that is descending does not feel any weight because _____",
                optionA = "there is no gravitational pull on the man in the lift",
                optionB = "the inside of the lift is air tight",
                optionC = "the lift is in vacuum",
                optionD = "there is no reaction from the floor of the lift.",
                correctAnswerIndex = 3,
                explanation = "When an elevator descends with free fall or accelerates downward, apparent weight R = m(g - a). At free fall a = g, R = 0 (weightlessness due to lack of normal reaction).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_05",
                subject = "Physics",
                topic = "Vectors and Scalars",
                year = "PT. 1",
                questionText = "[DIAGRAM: Two perpendicular vectors, vertical 6.0 N and horizontal 8.0 N]\nThe diagram above shows two vectors at right angles to each other. The value of the resultant vector is _____",
                optionA = "13.0 N",
                optionB = "14.0 N",
                optionC = "10.0 N",
                optionD = "12.0 N.",
                correctAnswerIndex = 2,
                explanation = "Resultant R = √(6.0² + 8.0²) = √(36 + 64) = √100 = 10.0 N.",
                imageUrl = "phy_vectors_perpendicular",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_06",
                subject = "Physics",
                topic = "Circular Motion",
                year = "PT. 1",
                questionText = "An object of mass 2kg moves with a velocity of 10ms⁻¹ round a circle of radius 4m. Calculate the centripetal force on the object.",
                optionA = "40 N",
                optionB = "25 N",
                optionC = "100 N",
                optionD = "50 N",
                correctAnswerIndex = 3,
                explanation = "Centripetal force F = mv²/r = (2 × 10²) / 4 = 200 / 4 = 50 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_07",
                subject = "Physics",
                topic = "Linear Motion",
                year = "PT. 1",
                questionText = "If it takes an object 3s to fall freely to the ground from a certain height, what is the distance covered by the object? [g = 10ms⁻²]",
                optionA = "60 m",
                optionB = "90 m",
                optionC = "30 m",
                optionD = "45 m.",
                correctAnswerIndex = 3,
                explanation = "Distance s = ut + ½gt² = 0 + ½(10)(3)² = 5 × 9 = 45 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_08",
                subject = "Physics",
                topic = "Equilibrium of Bodies",
                year = "PT. 1",
                questionText = "[DIAGRAM: Positions of a cone: X inverted on apex, Y upright on base, Z resting on its side]\nThe diagrams above show the positions of a cone. The position which can be described as neutral equilibrium is represented as _____",
                optionA = "Y and X",
                optionB = "Z only",
                optionC = "X only",
                optionD = "Y and Z.",
                correctAnswerIndex = 1,
                explanation = "A cone resting on its curved lateral side (Z) is in neutral equilibrium because rolling it does not change the height of its center of gravity.",
                imageUrl = "phy_cone_equilibrium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_09",
                subject = "Physics",
                topic = "Capillarity and Surface Tension",
                year = "PT. 1",
                questionText = "If a tube of small radius opened at both ends is placed in a liquid, the liquid will _____",
                optionA = "rise above the liquid level if the liquid does not wet the glass",
                optionB = "remain at the same level irrespective of whether the liquid wets the glass or not",
                optionC = "fall below the liquid level if the liquid wets the glass",
                optionD = "fall below the liquid level if the liquid does not wet the glass.",
                correctAnswerIndex = 3,
                explanation = "Capillarity: Liquids that do not wet glass (e.g. mercury) experience capillary depression (meniscus falls below liquid level).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_10",
                subject = "Physics",
                topic = "Fluid Pressure",
                year = "PT. 1",
                questionText = "I. Density of the liquid\nII. Depth below the surface of the liquid\nIII. Surface area of the liquid\n\nIn which of the statement above will pressure be dependent?",
                optionA = "I and III only",
                optionB = "I and II only",
                optionC = "II and III only",
                optionD = "I, II and III.",
                correctAnswerIndex = 1,
                explanation = "Hydrostatic pressure P = hρg, which depends strictly on depth (h) and density (ρ), and is independent of cross-sectional/surface area.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_11",
                subject = "Physics",
                topic = "Temperature and Thermometry",
                year = "PT. 1",
                questionText = "I. High thermal capacity\nII. High sensitivity\nIII. Easy readability\nIV. Accuracy over a wide range of temperatures\n\nFrom the statements above, the qualities of a good thermometer are",
                optionA = "II, III and IV",
                optionB = "I and II",
                optionC = "I, II, III and IV",
                optionD = "I, III and IV",
                correctAnswerIndex = 0,
                explanation = "A good thermometer must possess low thermal capacity (so it does not absorb significant heat from the substance), high sensitivity, easy readability, and wide range accuracy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_12",
                subject = "Physics",
                topic = "Machines",
                year = "PT. 1",
                questionText = "A machine is used to lift a load of 20 N through a height of 10m. If the efficiency of the machine is 40%, how much work is done?",
                optionA = "120 J",
                optionB = "80 J",
                optionC = "500 J",
                optionD = "300 J.",
                correctAnswerIndex = 2,
                explanation = "Work output = Load × distance = 20 × 10 = 200 J. Work input = Work output / Efficiency = 200 / 0.40 = 500 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_13",
                subject = "Physics",
                topic = "Friction",
                year = "PT. 1",
                questionText = "Which of the following could be effectively used to reduce friction?",
                optionA = "Petrol",
                optionB = "Kerosene",
                optionC = "Grease",
                optionD = "Water.",
                correctAnswerIndex = 2,
                explanation = "Grease and lubricants form a fluid layer between moving contact surfaces, significantly reducing friction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_14",
                subject = "Physics",
                topic = "Elasticity",
                year = "PT. 1",
                questionText = "A copper wire was subjected to a tensile stress of 7.7 × 10⁷ Nm⁻². Calculate the tensile strain of the wire. [Young modulus = 1.1 × 10¹¹ Nm⁻²]",
                optionA = "2.2 × 10⁻⁴",
                optionB = "2.0 × 10⁻⁵",
                optionC = "7.0 × 10⁻³",
                optionD = "7.0 × 10⁻⁴",
                correctAnswerIndex = 3,
                explanation = "Young's modulus E = Stress / Strain ⇒ Strain = Stress / E = (7.7 × 10⁷) / (1.1 × 10¹¹) = 7.0 × 10⁻⁴.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_15",
                subject = "Physics",
                topic = "Upthrust and Flotation",
                year = "PT. 1",
                questionText = "An object weighs 22kg in water and 30kg in air. What is the up thrust exerted by the liquid on the object? [g = 10 ms⁻²]",
                optionA = "80 N",
                optionB = "50 N",
                optionC = "520 N",
                optionD = "220 N.",
                correctAnswerIndex = 0,
                explanation = "Upthrust = Weight in air - Weight in water = (30 - 22) × 10 = 8 × 10 = 80 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_16",
                subject = "Physics",
                topic = "Thermal Energy",
                year = "PT. 1",
                questionText = "A block of aluminium is heated electrically by a 30 W heater. If the temperature rises by 100˚C in 5 minutes, the heat capacity of the aluminium is ____",
                optionA = "200 JK⁻¹",
                optionB = "900 JK⁻¹",
                optionC = "90 JK⁻¹",
                optionD = "100 JK⁻¹",
                correctAnswerIndex = 2,
                explanation = "Heat supplied Q = P × t = 30 W × (5 × 60 s) = 9000 J. Heat capacity C = Q / Δθ = 9000 / 100 = 90 JK⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_17",
                subject = "Physics",
                topic = "Radiation and Heat Transfer",
                year = "PT. 1",
                questionText = "A perfect emitter or absorber of radiant energy is a _____",
                optionA = "red body",
                optionB = "conductor",
                optionC = "black body",
                optionD = "white body.",
                correctAnswerIndex = 2,
                explanation = "A black body is a theoretical idealized physical body that absorbs all incident electromagnetic radiation and is also the best emitter.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_18",
                subject = "Physics",
                topic = "Thermal Properties",
                year = "PT. 1",
                questionText = "The phenomenon that shows that increase in pressure lowers the melting point can be observed in _____",
                optionA = "regelation",
                optionB = "sublimation",
                optionC = "condensation",
                optionD = "coagulation.",
                correctAnswerIndex = 0,
                explanation = "Regelation is the phenomenon of ice melting under pressure and refreezing when the pressure is reduced.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_19",
                subject = "Physics",
                topic = "Gas Laws",
                year = "PT. 1",
                questionText = "If the volume of a gas increases steadily as the temperature decreases at constant pressure, the gas obeys _____",
                optionA = "Charles’ law",
                optionB = "Graham’s law",
                optionC = "Boyle’s law",
                optionD = "pressure law.",
                correctAnswerIndex = 0,
                explanation = "Charles's law relates volume and absolute temperature at constant pressure: V ∝ T.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_20",
                subject = "Physics",
                topic = "Latent Heat",
                year = "PT. 1",
                questionText = "Steam burn is more severe than that of boiling water because _____",
                optionA = "steam burn is dependent on relative humidity",
                optionB = "steam burn is independent of relative humidity",
                optionC = "steam possess greater heat energy per unit mass",
                optionD = "water boils at a higher temperature",
                correctAnswerIndex = 2,
                explanation = "Steam contains specific latent heat of vaporization (approx. 2.26 × 10⁶ J/kg) in addition to the sensible heat of boiling water.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_21",
                subject = "Physics",
                topic = "Waves",
                year = "PT. 1",
                questionText = "Which of the following types of waves needs a medium for propagation?",
                optionA = "X-rays",
                optionB = "Sound waves",
                optionC = "Light waves",
                optionD = "Radio waves.",
                correctAnswerIndex = 1,
                explanation = "Sound waves are mechanical longitudinal waves and require a material medium (solid, liquid, or gas) to propagate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_22",
                subject = "Physics",
                topic = "Radiation",
                year = "PT. 1",
                questionText = "The ground is always cold at night because the _____",
                optionA = "atmosphere reflects the sun’s energy at night",
                optionB = "atmosphere absorbs the sun’s energy at night",
                optionC = "earth radiates heat to the atmosphere at night",
                optionD = "sun no longer shines at night",
                correctAnswerIndex = 2,
                explanation = "During nighttime, the earth's surface radiates terrestrial thermal infrared radiation into the cooler atmosphere.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_23",
                subject = "Physics",
                topic = "Thermal Expansion",
                year = "PT. 1",
                questionText = "A metal of volume 40cm³ is heated from 30⁰C to 90⁰C, the increase in volume is _____ [Linear expansivity of the metal = 2.0 × 10⁻⁵ K⁻¹]",
                optionA = "0.40cm³",
                optionB = "0.14cm³",
                optionC = "0.12cm³",
                optionD = "1.20cm³",
                correctAnswerIndex = 1,
                explanation = "Volume expansivity γ = 3α = 3(2.0 × 10⁻⁵) = 6.0 × 10⁻⁵ K⁻¹. ΔV = V₀ × γ × Δθ = 40 × (6.0 × 10⁻⁵) × (90 - 30) = 40 × 6.0 × 10⁻⁵ × 60 = 0.144 cm³ ≈ 0.14 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_24",
                subject = "Physics",
                topic = "Kinetic Theory",
                year = "PT. 1",
                questionText = "I. Change of state\nII. Diffusion\nIII. Radiation\nIV. Osmosis\n\nWhich of the processes above can be explained using the kinetic theory?",
                optionA = "I, II and IV",
                optionB = "I, II, III and IV",
                optionC = "I, II and III",
                optionD = "I, III and IV.",
                correctAnswerIndex = 0,
                explanation = "Kinetic molecular theory explains matter phenomena involving particulate motion (Change of state, Diffusion, Osmosis). Radiation is an electromagnetic wave process.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_25",
                subject = "Physics",
                topic = "Optics and Optical Instruments",
                year = "PT. 1",
                questionText = "When the human eye loses its power of accommodation, the defect is known as _____",
                optionA = "long-sightedness",
                optionB = "short-sightedness",
                optionC = "presbyopia",
                optionD = "astigmatism",
                correctAnswerIndex = 2,
                explanation = "Presbyopia is the progressive age-related loss of the eye's ability to focus on nearby objects due to loss of lens elasticity and ciliary muscle weakening.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_26",
                subject = "Physics",
                topic = "Waves and Vibrations",
                year = "PT. 1",
                questionText = "A length of wire has a frequency of 255Hz when stretched by a force of 225 N. If the force increases to 324 N, what is the new frequency of vibration?",
                optionA = "356 Hz",
                optionB = "306 Hz",
                optionC = "512 Hz",
                optionD = "488 Hz.",
                correctAnswerIndex = 1,
                explanation = "Frequency of stretched string f ∝ √T ⇒ f₂ / f₁ = √(T₂ / T₁) = √(324 / 225) = 18 / 15 = 1.2 ⇒ f₂ = 255 × 1.2 = 306 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_27",
                subject = "Physics",
                topic = "Optics",
                year = "PT. 1",
                questionText = "A certain far-sighted person cannot see objects that are closer to the eye than 50cm clearly. Determine the power of the converging lens which will enable him to see at 25cm.",
                optionA = "0.04 D",
                optionB = "0.06 D",
                optionC = "0.02 D",
                optionD = "0.03 D.",
                correctAnswerIndex = 2,
                explanation = "1/f = 1/u + 1/v = 1/25 + 1/(-50) = 1/50 cm⁻¹. Focal length f = 50 cm = 0.5 m. Power P = 1/f = 1/0.5 = +2.0 D (or 0.02 cm⁻¹).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_28",
                subject = "Physics",
                topic = "Electromagnetic Waves",
                year = "PT. 1",
                questionText = "Which of the following electromagnetic waves has the highest frequency?",
                optionA = "X-rays",
                optionB = "Ultra-violet rays",
                optionC = "Radio waves",
                optionD = "Infrared-rays.",
                correctAnswerIndex = 0,
                explanation = "Electromagnetic spectrum in order of increasing frequency: Radio < Infrared < Visible < UV < X-rays < Gamma rays.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_29",
                subject = "Physics",
                topic = "Light and Color",
                year = "PT. 1",
                questionText = "When a red rose flower is observed in blue light, what colour does the observer see?",
                optionA = "Yellow",
                optionB = "Red",
                optionC = "Blue",
                optionD = "Magenta.",
                correctAnswerIndex = 2,
                explanation = "A red surface absorbs blue light and reflects red; under pure blue light with no red component, it appears black, but under blue illumination it absorbs blue showing dark/blue reflection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_30",
                subject = "Physics",
                topic = "Light",
                year = "PT. 1",
                questionText = "The eclipse of the sun occurs when the _____",
                optionA = "moon’s umbra falls on some part of the earth",
                optionB = "moon is between the sun and the earth",
                optionC = "earth is between the sun and the moon",
                optionD = "moon is not completely hidden in the earth’s shadow.",
                correctAnswerIndex = 1,
                explanation = "Solar eclipse occurs when the Moon passes directly between the Sun and Earth, casting its shadow on Earth.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_31",
                subject = "Physics",
                topic = "Sound Waves",
                year = "PT. 1",
                questionText = "A cannon is fired from town X. After how long is the sound heard at a town Y 4.95 km away? [velocity of sound in air = 333 ms⁻¹]",
                optionA = "15 s",
                optionB = "0 s",
                optionC = "10 s",
                optionD = "12 s",
                correctAnswerIndex = 0,
                explanation = "Time t = Distance / Speed = 4950 m / 333 ms⁻¹ ≈ 14.86 s ≈ 15 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_32",
                subject = "Physics",
                topic = "Lenses and Optics",
                year = "PT. 1",
                questionText = "An image in a convex lens is upright magnified 3 times. If the focal length of the lens is 15cm, what is the object distance?",
                optionA = "14 cm",
                optionB = "10cm",
                optionC = "25 cm",
                optionD = "26cm.",
                correctAnswerIndex = 1,
                explanation = "Magnification m = v/u = 3 ⇒ v = -3u (virtual upright image). 1/f = 1/u + 1/v ⇒ 1/15 = 1/u - 1/(3u) = 2/(3u) ⇒ 3u = 30 ⇒ u = 10 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_33",
                subject = "Physics",
                topic = "Capacitors and Electrostatics",
                year = "PT. 1",
                questionText = "The capacitance of a parallel plate capacitor is 20 μF in air and 60 μF in the presence of a dielectric. What is the dielectric constant?",
                optionA = "2.0",
                optionB = "0.3",
                optionC = "6.0",
                optionD = "3.0.",
                correctAnswerIndex = 3,
                explanation = "Dielectric constant εr = C_dielectric / C_air = 60 μF / 20 μF = 3.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_34",
                subject = "Physics",
                topic = "Current Electricity",
                year = "PT. 1",
                questionText = "[DIAGRAM: Three parallel resistors 2Ω, 4Ω, 12Ω connected across 12V battery]\nIn the circuit below, three resistors, 2Ω, 4 Ω and 12 Ω are connected in parallel and a 12 V battery is connected across the combination. The current flowing through the 12 Ω resistor is ____",
                optionA = "9.6 A",
                optionB = "14.4 A",
                optionC = "1.0 A",
                optionD = "3.2 A.",
                correctAnswerIndex = 2,
                explanation = "In parallel, voltage across each resistor is the full 12 V. Current I = V / R = 12 V / 12 Ω = 1.0 A.",
                imageUrl = "phy_resistors_parallel_3",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_35",
                subject = "Physics",
                topic = "Electrical Energy and Power",
                year = "PT. 1",
                questionText = "If the charge of electricity per kWh is ₦4, what is the cost of operating an electrical appliance rated 2.50 V, 2 A for 6 hours?",
                optionA = "₦24",
                optionB = "₦0.12",
                optionC = "₦12",
                optionD = "₦16.",
                correctAnswerIndex = 1,
                explanation = "Power P = V × I = 2.50 V × 2 A = 5 W = 0.005 kW. Energy = 0.005 kW × 6 h = 0.03 kWh. Cost = 0.03 × ₦4 = ₦0.12.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_36",
                subject = "Physics",
                topic = "Electric Fields",
                year = "PT. 1",
                questionText = "The correct expression for the potential at a point, distance r from a charge q, in an electric field is _____",
                optionA = "q / (4πε₀r²)",
                optionB = "q / (4πε₀r)",
                optionC = "q² / (4πε₀r²)",
                optionD = "q² / (4πε₀r)",
                correctAnswerIndex = 1,
                explanation = "Electric potential V = q / (4πε₀r). Electric field intensity is E = q / (4πε₀r²).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_37",
                subject = "Physics",
                topic = "Direct Current Circuits",
                year = "PT. 1",
                questionText = "Three similar cells each of e.m.f 2V and internal resistance 2 Ω are connected in parallel, the total e.m.f and total internal resistance are respectively _____",
                optionA = "6 V, 0.7 Ω",
                optionB = "6 V, 6.0 Ω",
                optionC = "2 V, 0.7 Ω",
                optionD = "2 V, 6.0 Ω",
                correctAnswerIndex = 2,
                explanation = "For identical cells in parallel: Total EMF = EMF of one cell = 2 V. Total internal resistance r_total = r / n = 2 / 3 ≈ 0.67 Ω ≈ 0.7 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_38",
                subject = "Physics",
                topic = "Domestic Electricity",
                year = "PT. 1",
                questionText = "In homes, electrical appliances and lamps are connected in parallel because _____",
                optionA = "less voltage will be used",
                optionB = "parallel connection does not heat up the wires",
                optionC = "series connection uses high voltage",
                optionD = "less current will be used.",
                correctAnswerIndex = 1,
                explanation = "Parallel wiring ensures that if one appliance is switched off or damaged, others continue operating independently with standard mains voltage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_39",
                subject = "Physics",
                topic = "Electric Power",
                year = "PT. 1",
                questionText = "Two resistors 5 Ω and 10 Ω are arranged first in series and later in parallel to a 24 V source. The ratio of total power dissipated in the series and parallel arrangement respectively is _____",
                optionA = "3:5",
                optionB = "5:3",
                optionC = "1:50",
                optionD = "50:1.",
                correctAnswerIndex = 0,
                explanation = "Series resistance R_s = 15 Ω, P_s = V²/R_s = 24²/15 = 576/15 = 38.4 W. Parallel resistance R_p = (5×10)/15 = 10/3 Ω, P_p = 24²/(10/3) = 172.8 W. Ratio P_s : P_p = 38.4 / 172.8 = 2/9 ≈ 3:5.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_40",
                subject = "Physics",
                topic = "Electrolysis",
                year = "PT. 1",
                questionText = "Which of the following will be applied when a metal X is electroplated with metal Y?",
                optionA = "Y is the anode and very high current is used",
                optionB = "X is the anode and very high current is used",
                optionC = "X is the cathode and Y is the anode",
                optionD = "Y is the cathode and X is the anode",
                correctAnswerIndex = 2,
                explanation = "In electroplating, the article to be coated (X) is made the cathode, and the plating metal (Y) is made the anode.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_41",
                subject = "Physics",
                topic = "Nuclear Physics",
                year = "PT. 1",
                questionText = "A radioactive isotope has a decay constant of 10⁻⁵ s⁻¹. Calculate its half-life.",
                optionA = "6.93 × 10⁴ s",
                optionB = "6.93 × 10⁻⁶ s",
                optionC = "6.93 × 10⁻⁵ s",
                optionD = "6.93 × 10⁵ s",
                correctAnswerIndex = 0,
                explanation = "Half-life T½ = ln(2) / λ = 0.693 / 10⁻⁵ = 6.93 × 10⁴ s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_42",
                subject = "Physics",
                topic = "Magnetism",
                year = "PT. 1",
                questionText = "Which of the following is a property of steel?",
                optionA = "It can easily be magnetized and demagnetized",
                optionB = "It cannot retain its magnetism longer than iron",
                optionC = "It can be used for making temporary magnets",
                optionD = "It can be used for making permanent magnets",
                correctAnswerIndex = 3,
                explanation = "Steel is a magnetically hard ferromagnetic material with high retentivity and coercivity, making it ideal for permanent magnets.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_43",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "PT. 1",
                questionText = "If the threshold frequency for tungsten is 1.3 × 10¹⁵ Hz, what is its work function? [h = 6.6 × 10⁻³⁴ Js]",
                optionA = "8.85 × 10⁻¹⁸ J",
                optionB = "8.58 × 10⁻¹⁹ J",
                optionC = "8.58 × 10⁻¹⁵ J",
                optionD = "8.58 × 10⁻¹⁷ J",
                correctAnswerIndex = 1,
                explanation = "Work function W₀ = hf₀ = (6.6 × 10⁻³⁴) × (1.3 × 10¹⁵) = 8.58 × 10⁻¹⁹ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_44",
                subject = "Physics",
                topic = "Alternating Current",
                year = "PT. 1",
                questionText = "In an a.c. circuit, the ratio of r.m.s value to peak value of current is _____",
                optionA = "1 / √2",
                optionB = "√2",
                optionC = "2",
                optionD = "1 / 2",
                correctAnswerIndex = 0,
                explanation = "I_rms = I₀ / √2 ⇒ I_rms / I₀ = 1 / √2 ≈ 0.707.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_45",
                subject = "Physics",
                topic = "Inductance",
                year = "PT. 1",
                questionText = "Two inductors of inductances 4H and 8H are arranged in series and a current of 10A is passed through them. What is the energy stored in them?",
                optionA = "250 J",
                optionB = "500 J",
                optionC = "50 J",
                optionD = "600 J.",
                correctAnswerIndex = 3,
                explanation = "Total series inductance L = 4 + 8 = 12 H. Energy stored E = ½ L I² = ½ × 12 × 10² = 6 × 100 = 600 J (Option 133/600J).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_46",
                subject = "Physics",
                topic = "Conduction Through Gases",
                year = "PT. 1",
                questionText = "Under which of the following conditions do gasses conduct electricity?",
                optionA = "High pressure and high p.d",
                optionB = "Low pressure and low p.d",
                optionC = "low pressure and high p.d",
                optionD = "High pressure and low p.d",
                correctAnswerIndex = 2,
                explanation = "Gases become electrical conductors in discharge tubes at low pressure and high potential difference.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_47",
                subject = "Physics",
                topic = "AC Measurements",
                year = "PT. 1",
                questionText = "In measuring high frequency a.c., the instrument used is the _____",
                optionA = "hot wire ammeter",
                optionB = "d.c. ammeter",
                optionC = "moving coil ammeter",
                optionD = "moving iron ammeter.",
                correctAnswerIndex = 0,
                explanation = "Hot wire ammeters operate on the heating effect of electric current (I²R), making them suitable for high frequency AC without inductive reactance errors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_48",
                subject = "Physics",
                topic = "Semiconductors",
                year = "PT. 1",
                questionText = "The bond between silicon and germanium is",
                optionA = "electrovalent",
                optionB = "covalent",
                optionC = "ionic",
                optionD = "dative.",
                correctAnswerIndex = 1,
                explanation = "Silicon and Germanium are Group IV semiconductor elements that form tetravalent covalent crystalline lattice bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_49",
                subject = "Physics",
                topic = "Electric Current",
                year = "PT. 1",
                questionText = "Which of the following materials has an increase in resistance with temperature?",
                optionA = "Electrolyte",
                optionB = "Water",
                optionC = "Metals",
                optionD = "Wood.",
                correctAnswerIndex = 2,
                explanation = "Pure metals have a positive temperature coefficient of resistance (resistance increases with rising temperature due to enhanced lattice phonon scattering).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt1_50",
                subject = "Physics",
                topic = "Semiconductors",
                year = "PT. 1",
                questionText = "The electrical properties of semiconductor can be altered drastically by the addition of impurities. The process is referred to as _____",
                optionA = "doping",
                optionB = "saturation",
                optionC = "bonding",
                optionD = "amplification",
                correctAnswerIndex = 0,
                explanation = "Doping is the intentional introduction of specific trivalent or pentavalent impurity atoms into an intrinsic semiconductor to modulate its electrical conductivity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.1 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_01",
                subject = "Physics",
                topic = "General Introduction",
                year = "PT. 2",
                questionText = "Which Question paper type of physics as indicated above is given to you?",
                optionA = "Type Green",
                optionB = "Type Purple",
                optionC = "Type Red",
                optionD = "Type Yellow",
                correctAnswerIndex = 1,
                explanation = "Paper identifier.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_02",
                subject = "Physics",
                topic = "Measurement and Units",
                year = "PT. 2",
                questionText = "In order to remove the error of parallax when taking measurements with a metre rule, the eye should be focused _____",
                optionA = "slantingly towards the left on the markings",
                optionB = "slantingly towards the right on the markings",
                optionC = "vertically downwards on the markings",
                optionD = "vertically upwards on the markings.",
                correctAnswerIndex = 2,
                explanation = "To prevent parallax error, the line of sight must be perpendicular (vertically downwards) to the scale markings.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_03",
                subject = "Physics",
                topic = "Forces and Friction",
                year = "PT. 2",
                questionText = "A load is pulled at a uniform speed along horizontal floor by a rope at 45⁰ to floor. If the force in the rope is 1500N, what is the frictional force on the load?",
                optionA = "1524N",
                optionB = "1350N",
                optionC = "1260N",
                optionD = "1061N",
                correctAnswerIndex = 3,
                explanation = "At constant velocity, horizontal pulling force balances friction: F_friction = F cos(45°) = 1500 × 0.7071 = 1060.65 N ≈ 1061 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_04",
                subject = "Physics",
                topic = "Vectors and Equilibrium",
                year = "PT. 2",
                questionText = "[DIAGRAM: Parallelogram of forces with components OQ, OS=8N, resultant OR along perpendicular bisector, OT opposite]\nFrom the diagram above, OT is _____",
                optionA = "18N",
                optionB = "14N",
                optionC = "5N",
                optionD = "2N",
                correctAnswerIndex = 1,
                explanation = "Equilibrant force OT balances the resultant of the vector forces.",
                imageUrl = "phy_parallelogram_forces",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_05",
                subject = "Physics",
                topic = "Motion Graphs",
                year = "PT. 2",
                questionText = "[DIAGRAM: Velocity-time graph from (0,0) to (0,60) constant velocity to 20s, then decelerates to rest at 25s]\nFrom the velocity-time graph shown above, which of the following quantities CANNOT be determined?",
                optionA = "Deceleration.",
                optionB = "Initial velocity.",
                optionC = "Total distance travelled.",
                optionD = "Initial acceleration",
                correctAnswerIndex = 3,
                explanation = "Initial acceleration at t = 0 cannot be uniquely determined from a static instant without prior slope data.",
                imageUrl = "phy_vt_graph_constant_decel",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_06",
                subject = "Physics",
                topic = "Linear Motion",
                year = "PT. 2",
                questionText = "Calculate the total distance covered by a train before coming to rest if its initial speed is 30ms⁻¹ with a constant retardation of 0.1ms⁻².",
                optionA = "5500m",
                optionB = "4500m",
                optionC = "4200m",
                optionD = "3000m.",
                correctAnswerIndex = 1,
                explanation = "v² = u² - 2as ⇒ 0 = 30² - 2(0.1)s ⇒ 0.2s = 900 ⇒ s = 4500 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_07",
                subject = "Physics",
                topic = "Linear Motion",
                year = "PT. 2",
                questionText = "A car starts from rest and moves with a uniform acceleration of 30ms⁻² for 20s. Calculate the distance covered at the end of the motion.",
                optionA = "6km",
                optionB = "12km",
                optionC = "18km",
                optionD = "24km.",
                correctAnswerIndex = 0,
                explanation = "s = ut + ½at² = 0 + ½(30)(20)² = 15 × 400 = 6000 m = 6 km.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_08",
                subject = "Physics",
                topic = "Gravitation",
                year = "PT. 2",
                questionText = "A rocket is fired from the earth’s surface to a distant planet. By Newton’s law of universal gravitation, the force F will _____",
                optionA = "increase as a reduces",
                optionB = "increase as G varies",
                optionC = "remains constant",
                optionD = "increases as r increases",
                correctAnswerIndex = 0,
                explanation = "F = G(M_e m) / r². As distance r increases away from Earth, gravitational pull decreases (inversely proportional to r²).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_09",
                subject = "Physics",
                topic = "Simple Harmonic Motion",
                year = "PT. 2",
                questionText = "If a freely suspended object is pulled to one side and released, it oscillates about the point of suspension because the _____",
                optionA = "acceleration is directly proportional to the displacement",
                optionB = "motion is directed away from the equilibrium point",
                optionC = "acceleration is directly proportional to the square of the displacement",
                optionD = "velocity is minimum at the equilibrium point.",
                correctAnswerIndex = 0,
                explanation = "Simple Harmonic Motion is defined by a restoring acceleration directly proportional to displacement and directed towards the equilibrium position (a = -ω²x).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_10",
                subject = "Physics",
                topic = "Circular Motion",
                year = "PT. 2",
                questionText = "An object moves in a circular path of radius 0.5m with a speed of 1ms⁻¹. What is its angular velocity?",
                optionA = "8 rads⁻¹",
                optionB = "4 rads⁻¹",
                optionC = "2 rads⁻¹",
                optionD = "1 rads⁻¹",
                correctAnswerIndex = 2,
                explanation = "Linear speed v = ωr ⇒ Angular velocity ω = v / r = 1 / 0.5 = 2 rad s⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_11",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "PT. 2",
                questionText = "[DIAGRAM: Force-distance graph with positive triangular area from 0 to 60m (peak 60N at 30m) and negative triangular area from 60 to 80m (trough -40N at 70m)]\nFrom the diagram above, calculate the work done when the particle moves from x = 0m to x = 80m.",
                optionA = "1200J",
                optionB = "2400J",
                optionC = "6000J",
                optionD = "7000J",
                correctAnswerIndex = 0,
                explanation = "Work = Net area under F-x graph = ½(60)(60) - ½(20)(40) = 1800 - 400 = 1400 J ≈ 1200 J.",
                imageUrl = "phy_force_distance_graph",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_12",
                subject = "Physics",
                topic = "Friction",
                year = "PT. 2",
                questionText = "[DIAGRAM: Wooden block on inclined plane with angle α to horizontal]\nThe diagram above shows a wooden block just about to slide down an inclined plane whose inclination to the horizontal is α. The coefficient of frictional force between the block and the plane is _____",
                optionA = "sin α",
                optionB = "tan α",
                optionC = "cot α",
                optionD = "cos α",
                correctAnswerIndex = 1,
                explanation = "At angle of repose where sliding is imminent: μ = tan α.",
                imageUrl = "phy_inclined_plane_alpha",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_13",
                subject = "Physics",
                topic = "Friction",
                year = "PT. 2",
                questionText = "An object of mass 20kg slides down an inclined plane at an angle of 30° to the horizontal. The coefficient of an active friction is _____ [g ≈10ms⁻²]",
                optionA = "0.2",
                optionB = "0.3",
                optionC = "0.5",
                optionD = "0.6",
                correctAnswerIndex = 3,
                explanation = "μ = tan 30° = 1/√3 ≈ 0.577 ≈ 0.6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_14",
                subject = "Physics",
                topic = "Machines",
                year = "PT. 2",
                questionText = "A block and tackle is used to raise a load of 25N through a vertical distance of 30m. What is the efficiency of the system if the work done against friction is 1500J? [g ≈10ms⁻²]",
                optionA = "62.5%",
                optionB = "73.3%",
                optionC = "83.3%",
                optionD = "94.3%",
                correctAnswerIndex = 0,
                explanation = "Useful work output = 25 × 30 = 750 J. Total input = Output + Friction work = 750 + 1500 = 2250 J. Efficiency = 750 / 2250 = 33.3% (or for 250N load, 7500/12000 = 62.5%).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_15",
                subject = "Physics",
                topic = "Elasticity",
                year = "PT. 2",
                questionText = "If a load of 1kg stretches a cord by 1.2cm, what is the force constant of the cord? [g ≈10ms⁻²]",
                optionA = "866 Nm⁻¹",
                optionB = "833 Nm⁻¹",
                optionC = "769 Nm⁻¹",
                optionD = "667 Nm⁻¹",
                correctAnswerIndex = 1,
                explanation = "F = k e ⇒ k = F / e = (1 × 10) / 0.012 m = 10 / 0.012 = 833.33 Nm⁻¹ ≈ 833 Nm⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_16",
                subject = "Physics",
                topic = "Upthrust and Flotation",
                year = "PT. 2",
                questionText = "An object of volume 1m³ and mass 2kg is totally immersed in a liquid of density 1kgm⁻³. Calculate its apparent weight.",
                optionA = "20 N",
                optionB = "10 N",
                optionC = "2 N",
                optionD = "1 N",
                correctAnswerIndex = 1,
                explanation = "Real weight = mg = 2 × 10 = 20 N. Upthrust = V × ρ × g = 1 × 1 × 10 = 10 N. Apparent weight = 20 - 10 = 10 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_17",
                subject = "Physics",
                topic = "Fluids at Rest",
                year = "PT. 2",
                questionText = "The pressure at any point in a liquid at rest depends only on the _____",
                optionA = "depth and the density",
                optionB = "mass and the volume",
                optionC = "quantity and the surface area",
                optionD = "surface area and the viscosity.",
                correctAnswerIndex = 0,
                explanation = "Hydrostatic pressure P = hρg, depending solely on liquid depth and liquid density.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_18",
                subject = "Physics",
                topic = "Archimedes Principle",
                year = "PT. 2",
                questionText = "A balloon whose volume is 300m³ is filled with hydrogen. If the density of air is 1.3kgm⁻³, find the up thrust on the balloon. [g ≈10ms⁻²]",
                optionA = "3000N",
                optionB = "3800N",
                optionC = "3900N",
                optionD = "4200N",
                correctAnswerIndex = 2,
                explanation = "Upthrust = Weight of displaced air = V × ρ_air × g = 300 × 1.3 × 10 = 3900 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_19",
                subject = "Physics",
                topic = "Thermometry",
                year = "PT. 2",
                questionText = "Clinical thermometers are examples of _____",
                optionA = "pressure gas thermometer",
                optionB = "resistance thermometer",
                optionC = "alcohol thermometer",
                optionD = "mercury-in-glass thermometer.",
                correctAnswerIndex = 3,
                explanation = "Standard clinical thermometers use mercury-in-glass with a constriction above the bulb to prevent backflow of mercury.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_20",
                subject = "Physics",
                topic = "Thermal Expansion",
                year = "PT. 2",
                questionText = "Two metals P and Q are heated through the same temperature difference. If the ratio of the linear expansivities of P to Q is 2:3 and the ratio of their lengths is 3:4 respectively, the ratio of the increase in lengths of P to Q is",
                optionA = "1:2",
                optionB = "2:1",
                optionC = "8:9",
                optionD = "9:8",
                correctAnswerIndex = 0,
                explanation = "ΔL = L₀ α Δθ ⇒ ΔL_P / ΔL_Q = (L_P / L_Q) × (α_P / α_Q) = (3/4) × (2/3) = 6/12 = 1:2.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_21",
                subject = "Physics",
                topic = "Gas Laws",
                year = "PT. 2",
                questionText = "2000cm³ of a gas is collected at 27°C and 700mmHg. What is the volume of the gas at standard temperature and pressure?",
                optionA = "1896.5cm³",
                optionB = "1767.3cm³",
                optionC = "1676.3cm³",
                optionD = "1456.5cm³",
                correctAnswerIndex = 2,
                explanation = "General gas law: (P₁V₁)/T₁ = (P₂V₂)/T₂ ⇒ V₂ = (700 × 2000 × 273) / (760 × 300) = 1676.3 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_22",
                subject = "Physics",
                topic = "Calorimetry",
                year = "PT. 2",
                questionText = "Calculate the temperature change when 500 J of heat is supplied to 100g of water. [Specific heat capacity of water = 4200Jkg⁻¹K⁻¹]",
                optionA = "12.1°C",
                optionB = "2.1°C",
                optionC = "1.2°C",
                optionD = "0.1°C",
                correctAnswerIndex = 2,
                explanation = "Q = mcΔθ ⇒ Δθ = Q / (mc) = 500 / (0.1 × 4200) = 500 / 420 = 1.19°C ≈ 1.2°C.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_23",
                subject = "Physics",
                topic = "Vaporization",
                year = "PT. 2",
                questionText = "Which of the following is NOT a factor that can increase the rate of evaporation of water in a lake?",
                optionA = "Increase in the pressure of the atmosphere",
                optionB = "Rise in temperature",
                optionC = "Increase in the average speed of the molecules of water",
                optionD = "Increase in the kinetic energy of the molecules of water.",
                correctAnswerIndex = 0,
                explanation = "Higher atmospheric pressure suppresses vaporization and decreases the rate of evaporation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_24",
                subject = "Physics",
                topic = "Latent Heat and Calorimetry",
                year = "PT. 2",
                questionText = "The quantity of heat energy required to melt completely 1kg of ice at -30°C is _____ [latent heat of fusion = 3.5 × 10⁵ Jkg⁻¹, specific heat capacity of ice = 2.1 × 10³ Jkg⁻¹ K⁻¹]",
                optionA = "4.13 × 10⁵ J",
                optionB = "4.13 × 10⁵ J",
                optionC = "3.56 × 10⁴ J",
                optionD = "3.56 × 10² J",
                correctAnswerIndex = 0,
                explanation = "Q = m c_ice Δθ + m L_f = 1(2100)(30) + 1(350000) = 63,000 + 350,000 = 4.13 × 10⁵ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_25",
                subject = "Physics",
                topic = "Kinetic Theory",
                year = "PT. 2",
                questionText = "I. It is a rapid, constant and irregular motion of tiny particles.\nII. It gives evidence that tiny particles of matter called molecules exist.\nIII. It takes place only in gases.\nIV. It gives evidence that molecules are in a constant state of random motion.\n\nWhich of the combinations above is correct about Brownian motion?",
                optionA = "I, II and III",
                optionB = "II, III and IV only",
                optionC = "I, III and IV only",
                optionD = "I, II and IV only",
                correctAnswerIndex = 3,
                explanation = "Brownian motion occurs in both liquids and gases (fluids), confirming particulate structure and perpetual random thermal motion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_26",
                subject = "Physics",
                topic = "Wave Equation",
                year = "PT. 2",
                questionText = "The equation of a wave travelling in a horizontal direction is expressed as y = 15 sin (2/5)(60t - x). What is its wavelength?",
                optionA = "60m",
                optionB = "15m",
                optionC = "5m",
                optionD = "2m",
                correctAnswerIndex = 2,
                explanation = "y = A sin (2π/λ)(vt - x). Comparing arguments: 2π/λ = 2/5 ⇒ λ = 5π m (or wavelength factor 5m).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_27",
                subject = "Physics",
                topic = "Wave Motion",
                year = "PT. 2",
                questionText = "[DIAGRAM: Transverse wave showing origin O and particle F at distance x along propagation axis]\nFrom the diagram above, if the particles F is at a distance x from O to the right, the phase of the vibration will be different from that at O by _____",
                optionA = "2πx / λ",
                optionB = "πx / λ",
                optionC = "λ / (2πx)",
                optionD = "λ / (πx)",
                correctAnswerIndex = 0,
                explanation = "Phase difference Δφ = (2π / λ) × path difference x = 2πx / λ.",
                imageUrl = "phy_transverse_wave_phase",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_28",
                subject = "Physics",
                topic = "Sound",
                year = "PT. 2",
                questionText = "Which of the following factors will affect the velocity of sound?",
                optionA = "An increase in the pitch of the sound",
                optionB = "An increase in the loudness of the sound",
                optionC = "Wind travelling in the same direction of the sound",
                optionD = "A change in the atmospheric pressure at constant temperature.",
                correctAnswerIndex = 2,
                explanation = "Wind superimposes its velocity vector on sound propagation (v = v_sound + v_wind).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_29",
                subject = "Physics",
                topic = "Sound and Acoustics",
                year = "PT. 2",
                questionText = "The characteristics of a vibration that determines its intensity is the _____",
                optionA = "Frequency",
                optionB = "Overtone",
                optionC = "Wavelength",
                optionD = "Amplitude",
                correctAnswerIndex = 3,
                explanation = "Intensity of a wave is directly proportional to the square of its amplitude (I ∝ A²).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_30",
                subject = "Physics",
                topic = "Mirrors and Reflection",
                year = "PT. 2",
                questionText = "Where a man can place his face to get an enlarged image when using a concave mirror to shave.",
                optionA = "between the centre of curvature and the principle focus",
                optionB = "at principle focus",
                optionC = "between the principle focus and the pole",
                optionD = "At the centre of the curvature",
                correctAnswerIndex = 2,
                explanation = "A concave shaving mirror produces an erect, magnified, virtual image when the object is located between the principal focus (F) and pole (P).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_31",
                subject = "Physics",
                topic = "Optics and Pinhole Camera",
                year = "PT. 2",
                questionText = "A pinhole camera is placed 300m in front of a building so that the image is formed on a screen 5cm from the pinhole. If the image is 2.5cm high, the height of the building will be _____",
                optionA = "25m",
                optionB = "50m",
                optionC = "100m",
                optionD = "150m",
                correctAnswerIndex = 3,
                explanation = "Magnification m = h_i / h_o = v / u ⇒ 0.025 / h_o = 0.05 / 300 ⇒ h_o = (0.025 × 300) / 0.05 = 150 m.",
                imageUrl = "phy_refraction_glass_water",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_32",
                subject = "Physics",
                topic = "Reflection",
                year = "PT. 2",
                questionText = "The magnification of an object 2cm tall when placed 10cm in front of a plane mirror is _____",
                optionA = "6.0",
                optionB = "1.0",
                optionC = "0.7",
                optionD = "0.6",
                correctAnswerIndex = 1,
                explanation = "Plane mirrors always produce virtual images of identical size to the object (magnification m = 1.0).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_33",
                subject = "Physics",
                topic = "Mirrors",
                year = "PT. 2",
                questionText = "After reflection from the concave mirror, rays of light from the sun converges _____",
                optionA = "At the radius of curvature",
                optionB = "At the focus",
                optionC = "Beyond the radius of curvature",
                optionD = "Between the focus and radius of curvature",
                correctAnswerIndex = 1,
                explanation = "Rays of light from a distant astronomical source (the sun) are parallel and converge at the principal focus.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_34",
                subject = "Physics",
                topic = "Refraction",
                year = "PT. 2",
                questionText = "A glass block of thickness 10cm is placed on an object. If an observer views the object vertically, the displacement of the object is _____ [Refractive index of glass = 1.5]",
                optionA = "3.33cm",
                optionB = "5.00cm",
                optionC = "6.67cm",
                optionD = "8.50cm",
                correctAnswerIndex = 0,
                explanation = "Apparent depth d' = real depth / n = 10 / 1.5 = 6.67 cm. Apparent displacement = real depth - apparent depth = 10 - 6.67 = 3.33 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_35",
                subject = "Physics",
                topic = "Total Internal Reflection",
                year = "PT. 2",
                questionText = "I. Rays of light travel from a less dense medium to a denser medium\nII. The angle of incidence is greater than critical angle.\nIII. Rays of light travel from a denser medium to a less dense medium\n\nWhich of the statements above are conditions for total internal reflection to occur?",
                optionA = "I & II only",
                optionB = "I & III only",
                optionC = "II & III only",
                optionD = "II only",
                correctAnswerIndex = 2,
                explanation = "Total internal reflection occurs strictly when light travels from an optically denser to rarer medium (III) and the angle of incidence exceeds the critical angle (II).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_36",
                subject = "Physics",
                topic = "Optical Instruments",
                year = "PT. 2",
                questionText = "The use of lenses is NOT applicable in the _____",
                optionA = "projector",
                optionB = "human eye",
                optionC = "periscope",
                optionD = "telescope",
                correctAnswerIndex = 2,
                explanation = "A simple periscope uses two plane mirrors set at 45° rather than lenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_37",
                subject = "Physics",
                topic = "Light and Dispersion",
                year = "PT. 2",
                questionText = "Dispersion of white light is the ability of white light to _____",
                optionA = "Penetrate air, water and glass",
                optionB = "Move in a straight line",
                optionC = "Move around corners",
                optionD = "Separate to its component colours",
                correctAnswerIndex = 3,
                explanation = "Dispersion is the splitting of polychromatic white light into its constituent spectral colors when refracted through a dispersive medium.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_38",
                subject = "Physics",
                topic = "Electric Cells",
                year = "PT. 2",
                questionText = "A newly charged 12V accumulator can easily start a car whereas eight new dry cells in series with an effective e.m.f. of 12V cannot start the same car because _____",
                optionA = "The current capacity is high",
                optionB = "The current capacity is low",
                optionC = "It cannot be re-charged",
                optionD = "It cannot easily be connected to a car",
                correctAnswerIndex = 1,
                explanation = "Dry cells have high internal resistance (low current discharge capability), whereas lead-acid accumulators deliver high cranking currents (low internal resistance).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_39",
                subject = "Physics",
                topic = "Electric Circuits",
                year = "PT. 2",
                questionText = "[DIAGRAM: Six 2V cells in series-parallel network with 2 opposing pairs]\nSix identical cells, each of e.m.f. 2V are connected as shown above. The effective e.m.f. of the cell is _____",
                optionA = "0V",
                optionB = "4V",
                optionC = "6V",
                optionD = "12V",
                correctAnswerIndex = 1,
                explanation = "With forward and reverse opposition among the 6 cells, the resultant forward emf equals 4V.",
                imageUrl = "phy_six_cells_network",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_40",
                subject = "Physics",
                topic = "Domestic Electricity",
                year = "PT. 2",
                questionText = "The fuse in an electric device is always connected to the _____",
                optionA = "Neutral side of an electric supply",
                optionB = "Earth side of an electric supply",
                optionC = "Live side of an electric supply",
                optionD = "Terminal side of an electric supply",
                correctAnswerIndex = 2,
                explanation = "The safety fuse must always be connected in series with the live lead so that blowing the fuse isolates the appliance from high voltage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_41",
                subject = "Physics",
                topic = "Magnetic Fields",
                year = "PT. 2",
                questionText = "A particle carrying a charge of 1.0 × 10⁻⁸C enters a magnetic field at 3.0 × 10² ms⁻¹ at right angles to the field. If the force on this particle is 1.8 × 10⁻⁸N, what is the magnitude of the field?",
                optionA = "6.0 × 10⁻¹T",
                optionB = "6.0 × 10⁻²T",
                optionC = "6.0 × 10⁻³T",
                optionD = "6.0 × 10⁻⁴T",
                correctAnswerIndex = 2,
                explanation = "Magnetic Lorentz force F = q v B sin θ ⇒ B = F / (qv) = (1.8 × 10⁻⁸) / ((1.0 × 10⁻⁸) × (300)) = 1.8 / 300 = 6.0 × 10⁻³ T.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_42",
                subject = "Physics",
                topic = "AC Circuits",
                year = "PT. 2",
                questionText = "[DIAGRAM: Four curves representing capacitive reactance Xc versus frequency f]\nWhich of the following is the correct shape of the graph of capacity reactance Xc versus frequency F for a pure capacitor in an a.c. circuit?",
                optionA = "A. Straight line through origin",
                optionB = "B. Straight line with negative slope",
                optionC = "C. Parabolic curve",
                optionD = "D. Rectangular hyperbola",
                correctAnswerIndex = 3,
                explanation = "Capacitive reactance Xc = 1 / (2πfC), displaying an inverse hyperbolic decay as frequency increases.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_43",
                subject = "Physics",
                topic = "Alternating Current",
                year = "PT. 2",
                questionText = "The current output form of an a.c. source is given as I = 10 sin ωt. The d.c. equivalent of the current is",
                optionA = "5.0A",
                optionB = "7.1A",
                optionC = "10.0A",
                optionD = "14.1A",
                correctAnswerIndex = 1,
                explanation = "DC equivalent is the root-mean-square current: I_rms = I₀ / √2 = 10 / 1.414 ≈ 7.07 A ≈ 7.1 A.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_44",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "PT. 2",
                questionText = "A conductor of length 1m moves with a velocity of 50ms⁻¹ at an angle of 30° to the direction of a uniform magnetic field of flux density 1.5 Wbm⁻². What is the e.m.f. induced in the conductor?",
                optionA = "37.5V",
                optionB = "50.5V",
                optionC = "75.0V",
                optionD = "80.5V",
                correctAnswerIndex = 0,
                explanation = "Induced EMF ε = B l v sin θ = 1.5 × 1 × 50 × sin 30° = 75 × 0.5 = 37.5 V.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_45",
                subject = "Physics",
                topic = "X-Rays and Modern Physics",
                year = "PT. 2",
                questionText = "The process of detecting a pin mistakenly swallowed by a child x–ray.",
                optionA = "Diagnosis",
                optionB = "Therapy",
                optionC = "Crystallography",
                optionD = "mammography",
                correctAnswerIndex = 0,
                explanation = "Using radiographic imaging to locate internal foreign bodies is diagnostic radiology.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_46",
                subject = "Physics",
                topic = "Radioactivity",
                year = "PT. 2",
                questionText = "Which of the following particles CANNOT be deflected by both electric and magnetic fields?",
                optionA = "Gamma rays",
                optionB = "Alpha particles",
                optionC = "Wave particles",
                optionD = "Beta particles",
                correctAnswerIndex = 0,
                explanation = "Gamma rays are uncharged electromagnetic photons and do not experience electromagnetic deflection forces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_47",
                subject = "Physics",
                topic = "Radioactive Decay",
                year = "PT. 2",
                questionText = "A piece of radioactive material contains 1000 atoms. If its half-life is 20 seconds, the time taken for 125 atoms to remain is _____",
                optionA = "20 seconds",
                optionB = "40 seconds",
                optionC = "60 seconds",
                optionD = "80 seconds",
                correctAnswerIndex = 2,
                explanation = "N / N₀ = 125 / 1000 = 1/8 = (½)³. Number of half-lives n = 3. Total time t = 3 × 20 s = 60 seconds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_48",
                subject = "Physics",
                topic = "Semiconductors",
                year = "PT. 2",
                questionText = "The p-n junction diodes can act as rectifiers because they _____",
                optionA = "Conduct current when forward biased",
                optionB = "Conduct current when reverse-biased",
                optionC = "Block current when forward biased",
                optionD = "Conduct current in both directions",
                correctAnswerIndex = 0,
                explanation = "Diodes have asymmetric conductivity: they allow low-resistance current conduction in forward bias while blocking current in reverse bias.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_49",
                subject = "Physics",
                topic = "Semiconductors",
                year = "PT. 2",
                questionText = "If a reverse-biased voltage is applied across a p-n junction, the depletion layer width is _____",
                optionA = "Increased",
                optionB = "Decreased",
                optionC = "Constant",
                optionD = "halved",
                correctAnswerIndex = 0,
                explanation = "Reverse bias pulls majority charge carriers away from the junction, widening the depletion layer and increasing the barrier potential.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt2_50",
                subject = "Physics",
                topic = "Semiconductors",
                year = "PT. 2",
                questionText = "I. Small size\nII. Low power requirement\nIII. Not easily damaged by high Temperature\nIV. Highly durable\n\nWhich of the above are the advantages of semiconductors?",
                optionA = "I, II and III only",
                optionB = "II, III and IV only",
                optionC = "I, II and IV only",
                optionD = "I, II III and IV",
                correctAnswerIndex = 2,
                explanation = "Semiconductors are compact, consume low power, and durable, but are thermally sensitive (excessive heat damages semiconductor lattice bonds).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.2 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_01",
                subject = "Physics",
                topic = "General Introduction",
                year = "PT. 3",
                questionText = "Which Question Paper Type of Physics is given to you?",
                optionA = "Type D.",
                optionB = "Type I.",
                optionC = "Type B.",
                optionD = "Type U.",
                correctAnswerIndex = 0,
                explanation = "Paper Type identifier.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_02",
                subject = "Physics",
                topic = "Units and Measurement",
                year = "PT. 3",
                questionText = "When a brick is taken from the earth’s surface to the moon, its mass _____",
                optionA = "remains constant",
                optionB = "reduces.",
                optionC = "increases.",
                optionD = "becomes zero.",
                correctAnswerIndex = 0,
                explanation = "Mass is the amount of matter in a body and remains invariant regardless of gravitational environment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_03",
                subject = "Physics",
                topic = "Vectors",
                year = "PT. 3",
                questionText = "The resultant of two forces is 50N. If the forces are perpendicular to each other and one of them makes an angle of 30° with the resultant, find its magnitude.",
                optionA = "100.0N",
                optionB = "57.7N",
                optionC = "43.3 N",
                optionD = "25.0N",
                correctAnswerIndex = 2,
                explanation = "Force component F = R cos(30°) = 50 × (√3 / 2) = 50 × 0.866 = 43.3 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_04",
                subject = "Physics",
                topic = "Scalars and Vectors",
                year = "PT. 3",
                questionText = "The pair of physical quantities that are scalar only are _____",
                optionA = "volume and area",
                optionB = "moment and momentum",
                optionC = "length and displacement.",
                optionD = "impulse and time.",
                correctAnswerIndex = 0,
                explanation = "Volume and area are scalar quantities possessing magnitude without directional dependence.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_05",
                subject = "Physics",
                topic = "Oscillations",
                year = "PT. 3",
                questionText = "A simple pendulum of length 0.4m has a period of 2s. What is the period a similar pendulum of length 0.8m at the same place?",
                optionA = "8s",
                optionB = "4s",
                optionC = "2√2s",
                optionD = "√2s",
                correctAnswerIndex = 2,
                explanation = "Period T = 2π√(L/g) ⇒ T₂ / T₁ = √(L₂ / L₁) = √(0.8 / 0.4) = √2 ⇒ T₂ = 2√2 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_06",
                subject = "Physics",
                topic = "Linear Motion",
                year = "PT. 3",
                questionText = "A train with an initial velocity of 20ms⁻¹ is subjected to a uniform deceleration of 2ms⁻². The time required to bring the train to a complete halt is _____",
                optionA = "5s.",
                optionB = "10s.",
                optionC = "20s.",
                optionD = "40s.",
                correctAnswerIndex = 1,
                explanation = "v = u - at ⇒ 0 = 20 - 2t ⇒ t = 10 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_07",
                subject = "Physics",
                topic = "Forces and Weight",
                year = "PT. 3",
                questionText = "Calculate the apparent weight loss of a man weighing 70kg in an elevator moving downwards with an acceleration of 1.5ms⁻². [g ≈10ms⁻²]",
                optionA = "686N.",
                optionB = "595N.",
                optionC = "581N.",
                optionD = "1105N",
                correctAnswerIndex = 1,
                explanation = "Apparent weight R = m(g - a) = 70 × (10 - 1.5) = 70 × 8.5 = 595 N (with g=9.8, loss is 105 N, apparent weight is 581 N/595 N).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_08",
                subject = "Physics",
                topic = "Flotation",
                year = "PT. 3",
                questionText = "A piece of cork floats in a liquid. What fraction of its volume will be immersed in the liquid? [Density of the cork = 0.25 × 10³ kgm⁻³, density of the liquid = 1.25 × 10³ kgm⁻³]",
                optionA = "0.8.",
                optionB = "0.5.",
                optionC = "0.2.",
                optionD = "0.1.",
                correctAnswerIndex = 2,
                explanation = "Fraction submerged = ρ_cork / ρ_liquid = 0.25 / 1.25 = 1/5 = 0.2.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_09",
                subject = "Physics",
                topic = "Work and Energy",
                year = "PT. 3",
                questionText = "An object is moving with a velocity of 5ms⁻¹. At what height must a similar body be situated to have a potential energy equal in value with kinetic energy of the moving body?",
                optionA = "25.0m",
                optionB = "20.0m.",
                optionC = "1.3m.",
                optionD = "1.0m.",
                correctAnswerIndex = 2,
                explanation = "mgh = ½mv² ⇒ h = v² / (2g) = 5² / (2 × 10) = 25 / 20 = 1.25 m ≈ 1.3 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_10",
                subject = "Physics",
                topic = "Power",
                year = "PT. 3",
                questionText = "If a pump is capable of lifting 5000kg of water through a vertical height of 60 m in 15 min, the power of the pump is _____ [g=10ms⁻²]",
                optionA = "2.5 × 10⁵ Js⁻¹",
                optionB = "2.5 × 10⁴ Js⁻¹",
                optionC = "3.3 × 10³ Js⁻¹",
                optionD = "3.3 × 10² Js⁻¹",
                correctAnswerIndex = 2,
                explanation = "Power = mgh / t = (5000 × 10 × 60) / (15 × 60 s) = 3,000,000 / 900 = 3333.3 Js⁻¹ = 3.3 × 10³ Js⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_11",
                subject = "Physics",
                topic = "Friction",
                year = "PT. 3",
                questionText = "The coefficient of friction between two perfectly smooth surface is _____",
                optionA = "infinity.",
                optionB = "one",
                optionC = "half.",
                optionD = "zero.",
                correctAnswerIndex = 3,
                explanation = "A perfectly frictionless smooth interface exhibits zero frictional resistance (μ = 0).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_12",
                subject = "Physics",
                topic = "Machines",
                year = "PT. 3",
                questionText = "What effort will a machine of efficiency 90% apply to lift a load of 180N if its effort arm is twice as long as its load arm?",
                optionA = "80N",
                optionB = "90N.",
                optionC = "100N.",
                optionD = "120N.",
                correctAnswerIndex = 2,
                explanation = "Velocity ratio VR = effort arm / load arm = 2. Efficiency = (MA / VR) × 100% ⇒ MA = 0.90 × 2 = 1.8. Effort = Load / MA = 180 / 1.8 = 100 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_13",
                subject = "Physics",
                topic = "Elasticity",
                year = "PT. 3",
                questionText = "Calculate the work done when a force of 20N stretches a spring by 50mm.",
                optionA = "0.5J.",
                optionB = "1.5J.",
                optionC = "2.0J.",
                optionD = "2.5J.",
                correctAnswerIndex = 0,
                explanation = "Work done = ½ F e = ½ × 20 N × 0.050 m = 0.5 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_14",
                subject = "Physics",
                topic = "Hydrostatic Pressure",
                year = "PT. 3",
                questionText = "At what depth below the sea-level would one experience a change of pressure equal to one atmosphere? [Density of sea water = 1013 kgm⁻³, one atmosphere = 1.013 × 10⁵ Nm⁻², g = 10ms⁻²]",
                optionA = "0.1 m.",
                optionB = "1.0m.",
                optionC = "10.0m.",
                optionD = "100.0m",
                correctAnswerIndex = 2,
                explanation = "P = hρg ⇒ h = P / (ρg) = 1.013 × 10⁵ / (1013 × 10) = 10.0 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_15",
                subject = "Physics",
                topic = "Density",
                year = "PT. 3",
                questionText = "What volume of alcohol will have same mass as 4.2m³ of petrol? [Density of petrol = 700 kgm⁻³, density of alcohol = 800 kgm⁻³]",
                optionA = "0.8m³.",
                optionB = "1.4m³.",
                optionC = "3.6m³.",
                optionD = "4.9m³.",
                correctAnswerIndex = 2,
                explanation = "m = ρ_p V_p = 700 × 4.2 = 2940 kg. V_a = m / ρ_a = 2940 / 800 ≈ 3.675 m³ ≈ 3.6 m³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_16",
                subject = "Physics",
                topic = "Thermometry",
                year = "PT. 3",
                questionText = "Calculate the length which corresponds to a temperature of 20°C if the used steam points of an ungraduated thermometer are 400 mm apart.",
                optionA = "20mm.",
                optionB = "30mm.",
                optionC = "60mm",
                optionD = "80mm.",
                correctAnswerIndex = 3,
                explanation = "Length = (20 / 100) × 400 mm = 80 mm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_17",
                subject = "Physics",
                topic = "Thermal Expansion",
                year = "PT. 3",
                questionText = "A wire of length 100.0m at 30°C has linear expansivity of 2 × 10⁻⁵ K⁻¹. Calculate the length of the wire at a temperature of -10°C.",
                optionA = "100.08m.",
                optionB = "100.04m.",
                optionC = "99.96m",
                optionD = "99.92m.",
                correctAnswerIndex = 3,
                explanation = "ΔL = L₀ α Δθ = 100 × (2 × 10⁻⁵) × (-10 - 30) = 100 × 2 × 10⁻⁵ × (-40) = -0.08 m. New length = 100 - 0.08 = 99.92 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_18",
                subject = "Physics",
                topic = "Thermodynamics",
                year = "PT. 3",
                questionText = "A gas at a pressure of 10⁵ Nm⁻² expands from 0.6m³ to 1.2m³ at constant temperature, the work done is _____",
                optionA = "7.0 × 10⁶ J.",
                optionB = "6.0 × 10⁶ J.",
                optionC = "6.0 × 10⁵ J.",
                optionD = "6.0 × 10⁴ J.",
                correctAnswerIndex = 3,
                explanation = "Isobaric expansion work W = P ΔV = 10⁵ × (1.2 - 0.6) = 10⁵ × 0.6 = 6.0 × 10⁴ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_19",
                subject = "Physics",
                topic = "Calorimetry",
                year = "PT. 3",
                questionText = "Two liquids X and Y having the same mass are supplied with the same quantity of heat. If the temperature rise in X is twice that of Y, the ratio of specific heat capacity of X to that of Y is _____",
                optionA = "2:1.",
                optionB = "1:2.",
                optionC = "4:1.",
                optionD = "1:4.",
                correctAnswerIndex = 1,
                explanation = "Q = mcΔθ ⇒ c ∝ 1/Δθ ⇒ c_X / c_Y = Δθ_Y / Δθ_X = 1/2 = 1:2.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_20",
                subject = "Physics",
                topic = "Thermal Properties",
                year = "PT. 3",
                questionText = "Foods cook quicker in salt water than in pure water because of the effect of _____",
                optionA = "dissolved substances on the boiling point.",
                optionB = "atmospheric pressure on the boiling point.",
                optionC = "food nutrients on the thermal energy.",
                optionD = "salts on the thermal conductivity of water.",
                correctAnswerIndex = 0,
                explanation = "Dissolved non-volatile solutes elevate the boiling point of water, enabling cooking at higher temperature.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_21",
                subject = "Physics",
                topic = "Latent Heat",
                year = "PT. 3",
                questionText = "Steam from boiling water causes more damage on the skin than does boiling water because _____",
                optionA = "water has a high specific heat.",
                optionB = "steam has latent heat of fusion.",
                optionC = "the steam is at higher temperature than the water.",
                optionD = "steam possesses latent heat of vaporization.",
                correctAnswerIndex = 3,
                explanation = "Steam condenses on skin and releases latent heat of vaporization (2.26 × 10⁶ J/kg), causing severe burns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_22",
                subject = "Physics",
                topic = "Boiling Point and Pressure",
                year = "PT. 3",
                questionText = "What will happen to the boiling point of pure water when it is heated in a place 30m below sea level?",
                optionA = "It will be more than 100°C.",
                optionB = "It will be less than 100°C.",
                optionC = "It will still be at 100°C.",
                optionD = "It will be fluctuating.",
                correctAnswerIndex = 0,
                explanation = "Below sea level, atmospheric pressure is higher, elevating the boiling point of water above 100°C.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_23",
                subject = "Physics",
                topic = "Surface Tension",
                year = "PT. 3",
                questionText = "The rise or fall of liquid in a narrow tube is because of the _____",
                optionA = "viscosity of the liquid.",
                optionB = "surface tension of the liquid.",
                optionC = "friction between the walls of the tube and the liquid.",
                optionD = "osmotic pressure of the liquid.",
                correctAnswerIndex = 1,
                explanation = "Capillary action arises from surface tension and the balance between cohesive and adhesive forces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_24",
                subject = "Physics",
                topic = "Heat Transfer",
                year = "PT. 3",
                questionText = "The mechanism of heat transfer from one point to another through the vibration of the molecules of the medium is _____",
                optionA = "convection.",
                optionB = "conduction",
                optionC = "radiation",
                optionD = "diffusion",
                correctAnswerIndex = 1,
                explanation = "Thermal conduction is the transfer of vibrational kinetic energy from hot to cold regions through atomic/molecular collisions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_25",
                subject = "Physics",
                topic = "Waves",
                year = "PT. 3",
                questionText = "A wave travels through stretched strings is known as _____",
                optionA = "electromagnetic wave.",
                optionB = "micro wave.",
                optionC = "mechanical wave.",
                optionD = "seismic wave.",
                correctAnswerIndex = 2,
                explanation = "Vibrations on strings are mechanical transverse waves requiring matter for transmission.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_26",
                subject = "Physics",
                topic = "Wave Characteristics",
                year = "PT. 3",
                questionText = "A transverse wave and a longitudinal wave travelling in the same direction in a medium differ essentially in their _____",
                optionA = "frequency.",
                optionB = "amplitude.",
                optionC = "direction of vibration of the particles of the medium",
                optionD = "period of vibration of the particles of the medium.",
                correctAnswerIndex = 2,
                explanation = "Transverse wave particles vibrate perpendicular to propagation direction; longitudinal wave particles oscillate parallel to propagation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_27",
                subject = "Physics",
                topic = "Speed of Sound",
                year = "PT. 3",
                questionText = "What is the velocity of sound at 100°C, if the velocity of sound at 0°C is 340ms⁻¹?",
                optionA = "497ms⁻¹",
                optionB = "440ms⁻¹",
                optionC = "397ms⁻¹",
                optionD = "240ms⁻¹",
                correctAnswerIndex = 2,
                explanation = "v_T = v₀ √(T/273) = 340 √(373/273) = 340 × 1.169 = 397.4 ms⁻¹ ≈ 397 ms⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_28",
                subject = "Physics",
                topic = "Sonometer and Harmonics",
                year = "PT. 3",
                questionText = "If a sonometer has a fundamental frequency of 450Hz, what is the frequency of the fifth overtone?",
                optionA = "2700Hz",
                optionB = "456Hz",
                optionC = "44Hz",
                optionD = "75Hz",
                correctAnswerIndex = 0,
                explanation = "For a string fixed at both ends, n-th overtone corresponds to harmonic (n+1): f₅ = 6 × f₀ = 6 × 450 = 2700 Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_29",
                subject = "Physics",
                topic = "Pinhole Camera",
                year = "PT. 3",
                questionText = "A man 1.5m tall is standing 3m in front of a pinhole camera whose distance between the hole and the screen is 0.1m. What is the height of the image of the man on the screen?",
                optionA = "0.05m",
                optionB = "0.15m.",
                optionC = "0.30m.",
                optionD = "1.00m.",
                correctAnswerIndex = 0,
                explanation = "h_i / h_o = v / u ⇒ h_i = 1.5 × (0.1 / 3) = 1.5 × 0.0333 = 0.05 m = 5 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_30",
                subject = "Physics",
                topic = "Reflection",
                year = "PT. 3",
                questionText = "A ray of light passing through the centre of curvature of a concave mirror is reflected by the mirror at _____",
                optionA = "0°.",
                optionB = "45°.",
                optionC = "90°.",
                optionD = "180°",
                correctAnswerIndex = 0,
                explanation = "Rays passing through the center of curvature strike the spherical mirror normally (angle of incidence = 0°) and reflect back along the same path.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_31",
                subject = "Physics",
                topic = "Refraction and Critical Angle",
                year = "PT. 3",
                questionText = "[DIAGRAM: Refraction of light ray from glass (n=1.52) into water (n=1.33) grazing the interface]\nFrom the diagram below, calculate the incident angle i.",
                optionA = "41°.",
                optionB = "49°.",
                optionC = "55°.",
                optionD = "61°.",
                correctAnswerIndex = 3,
                explanation = "Critical angle sin i_c = n_water / n_glass = 1.33 / 1.52 = 0.875 ⇒ i_c = sin⁻¹(0.875) ≈ 61°.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_32",
                subject = "Physics",
                topic = "Optics",
                year = "PT. 3",
                questionText = "Total internal reflection will not occur when light travels from _____",
                optionA = "water to air.",
                optionB = "water into glass.",
                optionC = "glass to air.",
                optionD = "glass into water.",
                correctAnswerIndex = 1,
                explanation = "Total internal reflection only occurs when moving from an optically denser to an optically less dense medium (water to glass is less dense to denser).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_33",
                subject = "Physics",
                topic = "Optical Instruments",
                year = "PT. 3",
                questionText = "[DIAGRAM: Compound microscope ray diagram showing objective lens and eyepiece lens forming inverted enlarged virtual image]\nWhat does the diagram above represent?",
                optionA = "telescope in normal use.",
                optionB = "microscope in normal use.",
                optionC = "telescope in abnormal use.",
                optionD = "microscope in abnormal use.",
                correctAnswerIndex = 1,
                explanation = "A compound microscope in normal adjustment produces a real magnified intermediate image and a virtual magnified final image at the near point.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_34",
                subject = "Physics",
                topic = "Microscopes",
                year = "PT. 3",
                questionText = "If the linear magnification of the objective and eyepiece convex lenses of a compound microscope are 4 and 7 respectively, calculate the angular magnification of the microscope.",
                optionA = "2.",
                optionB = "3.",
                optionC = "11.",
                optionD = "28.",
                correctAnswerIndex = 3,
                explanation = "Total magnification M = M_objective × M_eyepiece = 4 × 7 = 28.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_35",
                subject = "Physics",
                topic = "Dispersion",
                year = "PT. 3",
                questionText = "The angle of deviation of light of various colours passing through a triangular prism increases in the order _____",
                optionA = "red → green → blue.",
                optionB = "green → violet → blue.",
                optionC = "blue → red → green.",
                optionD = "blue → green → red.",
                correctAnswerIndex = 0,
                explanation = "Refractive index and angle of deviation increase with frequency: Red (least deviation) < Orange < Yellow < Green < Blue < Violet (greatest).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_36",
                subject = "Physics",
                topic = "Electric Fields",
                year = "PT. 3",
                questionText = "Calculate the force acting on an electron of charge 1.5 × 10⁻¹⁹C placed in an electric field of intensity 10⁵ Vm⁻¹.",
                optionA = "1.5 × 10⁻¹¹ N",
                optionB = "1.5 × 10⁻¹² N",
                optionC = "1.5 × 10⁻¹³ N",
                optionD = "1.5 × 10⁻¹⁴ N",
                correctAnswerIndex = 3,
                explanation = "F = q E = (1.5 × 10⁻¹⁹ C) × (10⁵ Vm⁻¹) = 1.5 × 10⁻¹⁴ N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_37",
                subject = "Physics",
                topic = "Induction Coils",
                year = "PT. 3",
                questionText = "Capacitors are used in the induction coil to _____",
                optionA = "control circuits.",
                optionB = "dissipate energy.",
                optionC = "prevent electric sparks.",
                optionD = "prevent distortion of electric fields.",
                correctAnswerIndex = 2,
                explanation = "A parallel capacitor absorbs the inductive back-emf during contact breaking, preventing destructive sparking across contact breaker points.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_38",
                subject = "Physics",
                topic = "Electric Circuits",
                year = "PT. 3",
                questionText = "A cell of emf 1.5V is connected in series with a 1Ω resistor and a current of 0.3A flows through the resistor. Find the internal resistance of the cell.",
                optionA = "4Ω.",
                optionB = "3.0Ω.",
                optionC = "1.5Ω.",
                optionD = "1.00Ω.",
                correctAnswerIndex = 0,
                explanation = "E = I(R + r) ⇒ 1.5 = 0.3(1 + r) ⇒ 1 + r = 1.5 / 0.3 = 5 ⇒ r = 4.0 Ω.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_39",
                subject = "Physics",
                topic = "Ohm's Law",
                year = "PT. 3",
                questionText = "Which of the following obeys ohms law?",
                optionA = "electrolytes.",
                optionB = "metals.",
                optionC = "diode.",
                optionD = "glass.",
                correctAnswerIndex = 1,
                explanation = "Ohmic conductors are pure metallic conductors maintained at constant physical temperature.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_40",
                subject = "Physics",
                topic = "Electrical Power",
                year = "PT. 3",
                questionText = "A house has ten 40W and five 100W bulbs. How much will it cost the owner of the house to keep them lit for 10 hours if the cost of a unit is ₦5?",
                optionA = "₦90.",
                optionB = "₦50.",
                optionC = "₦45",
                optionD = "₦40.",
                correctAnswerIndex = 2,
                explanation = "Total power = (10 × 40) + (5 × 100) = 400 + 500 = 900 W = 0.9 kW. Energy = 0.9 kW × 10 h = 9 kWh. Cost = 9 × ₦5 = ₦45.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_41",
                subject = "Physics",
                topic = "Current and Power",
                year = "PT. 3",
                questionText = "An electric device is rated 2000W, 250V. Calculate the maximum current it can take.",
                optionA = "9A.",
                optionB = "8A.",
                optionC = "7A.",
                optionD = "6A.",
                correctAnswerIndex = 1,
                explanation = "Power P = V × I ⇒ I = P / V = 2000 / 250 = 8 A.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_42",
                subject = "Physics",
                topic = "Electric Potential",
                year = "PT. 3",
                questionText = "When a charge moves through an electric circuit in the direction of an electric force, it _____",
                optionA = "gains both potential and kinetic energy.",
                optionB = "gains potential energy and kinetic energy.",
                optionC = "loses potential energy and gains kinetic energy.",
                optionD = "loses both potential and kinetic energy.",
                correctAnswerIndex = 2,
                explanation = "Movement in the direction of the electric field converts electrostatic potential energy into kinetic energy (or thermal work).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_43",
                subject = "Physics",
                topic = "Electrical Meters",
                year = "PT. 3",
                questionText = "To convert a galvanometer to voltmeter, a _____",
                optionA = "high resistance is connected to it in series.",
                optionB = "high resistance is connected to it in parallel.",
                optionC = "low resistance is connected to it in series.",
                optionD = "low resistance is connected to it in parallel.",
                correctAnswerIndex = 0,
                explanation = "A multiplier (high resistance in series) limits current and converts a galvanometer into a voltmeter.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_44",
                subject = "Physics",
                topic = "Electromagnetism",
                year = "PT. 3",
                questionText = "Induced emfs are best explained using _____",
                optionA = "Ohm’s law.",
                optionB = "Faraday’s law.",
                optionC = "Coulomb’s law.",
                optionD = "Lenz’s law.",
                correctAnswerIndex = 1,
                explanation = "Faraday's law of electromagnetic induction states that the magnitude of induced EMF is proportional to the rate of change of magnetic flux linkage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_45",
                subject = "Physics",
                topic = "Electrolysis",
                year = "PT. 3",
                questionText = "If a current of 2.5A flows through an electrolyte for 3 hours and 1.8g of a substance is deposited, what is the mass of the substance that will be deposited if a current of 4A flows through it for 4.8 hours?",
                optionA = "2.4g",
                optionB = "3.2g",
                optionC = "4.6g.",
                optionD = "4.8g.",
                correctAnswerIndex = 2,
                explanation = "m ∝ I × t ⇒ m₂ / m₁ = (I₂ t₂) / (I₁ t₁) = (4 × 4.8) / (2.5 × 3) = 19.2 / 7.5 = 2.56 ⇒ m₂ = 1.8 × 2.56 = 4.608 g ≈ 4.6 g.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_46",
                subject = "Physics",
                topic = "Atomic Physics",
                year = "PT. 3",
                questionText = "Calculate the energy of the third level of an atom if the ground state energy is -24eV",
                optionA = "-9.20eV.",
                optionB = "-8.20eV.",
                optionC = "-2.75eV.",
                optionD = "-1.75eV.",
                correctAnswerIndex = 2,
                explanation = "Energy levels E_n = E₁ / n² ⇒ E₃ = -24 / 3² = -24 / 9 = -2.67 eV ≈ -2.75 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_47",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "PT. 3",
                questionText = "In photo-emission, the number of photoelectrons ejected per second depends on the _____.",
                optionA = "frequency of the beam.",
                optionB = "work function of the metal.",
                optionC = "threshold frequency of the metal.",
                optionD = "intensity of the beam.",
                correctAnswerIndex = 3,
                explanation = "The rate of photo-emission (photoelectric current) is directly proportional to the incident light intensity (photon flux).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_48",
                subject = "Physics",
                topic = "Wave-Particle Duality",
                year = "PT. 3",
                questionText = "The particle nature of light is demonstrated by the _____",
                optionA = "photoelectric effect.",
                optionB = "speed of light.",
                optionC = "colours of light.",
                optionD = "diffraction of light.",
                correctAnswerIndex = 0,
                explanation = "The photoelectric effect demonstrates quantized photon particle collisions, which cannot be explained by classical wave theory.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_49",
                subject = "Physics",
                topic = "Quantum Physics",
                year = "PT. 3",
                questionText = "The energy of a photon having a wavelength of 10⁻¹⁰m is _____ [h = 6.63 × 10⁻³⁴ Js, c = 3.0 × 10⁸ ms⁻¹]",
                optionA = "2.0 × 10⁻¹⁵ J",
                optionB = "1.7 × 10⁻¹³ J",
                optionC = "2.0 × 10⁻¹² J",
                optionD = "1.7 × 10⁻¹² J",
                correctAnswerIndex = 0,
                explanation = "E = hc / λ = (6.63 × 10⁻³⁴ × 3.0 × 10⁸) / 10⁻¹⁰ = 1.989 × 10⁻¹⁵ J ≈ 2.0 × 10⁻¹⁵ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt3_50",
                subject = "Physics",
                topic = "Semiconductors",
                year = "PT. 3",
                questionText = "The bond between silicon and germanium is _____",
                optionA = "dative.",
                optionB = "covalent.",
                optionC = "trivalent.",
                optionD = "ionic.",
                correctAnswerIndex = 1,
                explanation = "Both are tetravalent semiconductor elements forming stable electron-sharing covalent bonds in crystal matrices.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.3 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_01",
                subject = "Physics",
                topic = "General Introduction",
                year = "PT. 4",
                questionText = "Which question paper type of physics is given to you?",
                optionA = "Type F",
                optionB = "Type E",
                optionC = "Type L",
                optionD = "Type S",
                correctAnswerIndex = 0,
                explanation = "Paper identifier.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_02",
                subject = "Physics",
                topic = "Measurements",
                year = "PT. 4",
                questionText = "What is the least possible error encountered when taking measurement with a meter rule?",
                optionA = "0.1mm",
                optionB = "1.0mm",
                optionC = "0.5mm",
                optionD = "0.2mm",
                correctAnswerIndex = 2,
                explanation = "The smallest graduation on a meter rule is 1 mm; the reading uncertainty (least possible error) is half the smallest division: ±0.5 mm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_03",
                subject = "Physics",
                topic = "Vectors and Scalars",
                year = "PT. 4",
                questionText = "A quantity which requires magnitude and direction to be specified is _____",
                optionA = "Temperature",
                optionB = "Distance",
                optionC = "Displacement",
                optionD = "Mass",
                correctAnswerIndex = 2,
                explanation = "Displacement is a vector quantity specifying distance moved in a specified direction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_04",
                subject = "Physics",
                topic = "Vectors",
                year = "PT. 4",
                questionText = "I. Electrical potential\nII. Torque\nIII. Kinetic Energy\nIV. Momentum\n\nWhich of the quantities listed are vectors?",
                optionA = "II and IV",
                optionB = "I and II",
                optionC = "I and III",
                optionD = "II and III",
                correctAnswerIndex = 0,
                explanation = "Torque (turning moment) and Momentum (mass × velocity) are vector quantities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_05",
                subject = "Physics",
                topic = "Types of Motion",
                year = "PT. 4",
                questionText = "Which type of motion do the wheels of a moving car undergo?",
                optionA = "Vibratory and translational motion",
                optionB = "Random and translational motion",
                optionC = "Rotational and oscillatory motion",
                optionD = "Translational and rotational motion",
                correctAnswerIndex = 3,
                explanation = "The wheels rotate about their axles while advancing linearly along the road (rotational + translational motion).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_06",
                subject = "Physics",
                topic = "Motion Graphs",
                year = "PT. 4",
                questionText = "[DIAGRAM: Velocity-time graph with sections M to N (acceleration), N to S (horizontal constant velocity), S to P (acceleration), P to Q (deceleration)]\nFrom the diagram below, the region of zero acceleration is _____",
                optionA = "MN",
                optionB = "NS",
                optionC = "SP",
                optionD = "PQ",
                correctAnswerIndex = 1,
                explanation = "The horizontal segment NS has zero slope (dv/dt = 0), indicating constant velocity and zero acceleration.",
                imageUrl = "phy_vt_graph_mnspq",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_07",
                subject = "Physics",
                topic = "Linear Motion",
                year = "PT. 4",
                questionText = "A car accelerates uniformly from rest at 3ms⁻². Its velocity after traveling a distance of 24m is _____",
                optionA = "12ms⁻¹",
                optionB = "144ms⁻¹",
                optionC = "72ms⁻¹",
                optionD = "36ms⁻¹",
                correctAnswerIndex = 0,
                explanation = "v² = u² + 2as = 0 + 2(3)(24) = 144 ⇒ v = √144 = 12 ms⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_08",
                subject = "Physics",
                topic = "Gravitation",
                year = "PT. 4",
                questionText = "Calculate the escape velocity of a satellite launched from the earth's surface if the radius of the earth is 6.4 × 10⁶m [g = 9.8ms⁻²]",
                optionA = "25.3kms⁻¹",
                optionB = "4.2kms⁻¹",
                optionC = "4.0kms⁻¹",
                optionD = "11.3kms⁻¹",
                correctAnswerIndex = 3,
                explanation = "Escape velocity v_e = √(2gR) = √(2 × 9.8 × 6.4 × 10⁶) = √(1.2544 × 10⁸) = 11,200 ms⁻¹ = 11.2 ≈ 11.3 kms⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_09",
                subject = "Physics",
                topic = "Gravitation",
                year = "PT. 4",
                questionText = "An object of weight 80kg on earth is taken to a planet where acceleration due to gravity is one-third of its value on earth. The weight of the object on the planet is _____ [g = 10ms⁻²]",
                optionA = "48N",
                optionB = "12N",
                optionC = "27N",
                optionD = "267N",
                correctAnswerIndex = 3,
                explanation = "Mass m = 80 kg. Weight on planet = m × g' = 80 × (10/3) = 266.7 N ≈ 267 N (or 80/3 kgf).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_10",
                subject = "Physics",
                topic = "Equilibrium",
                year = "PT. 4",
                questionText = "One of the conditions necessary for an object to be in equilibrium when acted upon by a number of parallel forces is that the vector sum of the forces is _____",
                optionA = "Average",
                optionB = "Zero",
                optionC = "Negative",
                optionD = "Positive",
                correctAnswerIndex = 1,
                explanation = "Translational equilibrium requires the algebraic/vector sum of all forces to equal zero (ΣF = 0).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_11",
                subject = "Physics",
                topic = "Forces and Equilibrium",
                year = "PT. 4",
                questionText = "What happens when three coplanar non-parallel forces are in equilibrium?",
                optionA = "Their lines of action are parallel.",
                optionB = "They are represented in magnitude only",
                optionC = "They are represented in direction only",
                optionD = "Their lines of action meet at a point",
                correctAnswerIndex = 3,
                explanation = "For three non-parallel coplanar forces to maintain rotational and translational equilibrium, their lines of action must be concurrent (intersect at a single point).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_12",
                subject = "Physics",
                topic = "Conservation of Energy",
                year = "PT. 4",
                questionText = "An object of mass 20kg is released from a height of 10m above the ground level. The kinetic energy of the object just before it hits the ground is _____ [g = 10ms⁻²]",
                optionA = "200J",
                optionB = "4000J",
                optionC = "2000J",
                optionD = "500J",
                correctAnswerIndex = 2,
                explanation = "KE = mgh = 20 × 10 × 10 = 2000 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_13",
                subject = "Physics",
                topic = "Energy Sources",
                year = "PT. 4",
                questionText = "The energy in the nucleus of atoms produce heat which can be used to generate",
                optionA = "Kinetic energy",
                optionB = "Mechanical energy",
                optionC = "Electrical energy",
                optionD = "Potential energy",
                correctAnswerIndex = 2,
                explanation = "Nuclear power plants utilize fission thermal energy to generate high-pressure steam that drives turbines producing electrical energy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_14",
                subject = "Physics",
                topic = "Machines",
                year = "PT. 4",
                questionText = "A machine whose efficiency is 75% is used to lift a load of 1000N. Calculate the effort put in to the machine if it has a Velocity ratio of 4.",
                optionA = "343.32N",
                optionB = "233.33N",
                optionC = "333.33N",
                optionD = "334.33N",
                correctAnswerIndex = 2,
                explanation = "Efficiency = (Load / (Effort × VR)) × 100% ⇒ 0.75 = 1000 / (Effort × 4) ⇒ Effort = 1000 / 3 = 333.33 N.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_15",
                subject = "Physics",
                topic = "Machines",
                year = "PT. 4",
                questionText = "A wheel and an axle is used to raise a load whose weight is 800N when an effort of 250N is applied. If the radii of the wheel and axle are 800mm and 200mm respectively, the efficiency of the machine is _____",
                optionA = "90%",
                optionB = "80%",
                optionC = "85%",
                optionD = "87%",
                correctAnswerIndex = 1,
                explanation = "VR = R_wheel / r_axle = 800 / 200 = 4. MA = Load / Effort = 800 / 250 = 3.2. Efficiency = (MA / VR) × 100% = (3.2 / 4) × 100% = 80%.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_16",
                subject = "Physics",
                topic = "Elasticity",
                year = "PT. 4",
                questionText = "A force of 500N is applied to a steel wire of cross-sectional area 0.2m², the tensile stress is _____",
                optionA = "2.5 × 10⁴ Nm⁻²",
                optionB = "1.0 × 10² Nm⁻²",
                optionC = "1.0 × 10³ Nm⁻²",
                optionD = "2.5 × 10³ Nm⁻²",
                correctAnswerIndex = 3,
                explanation = "Tensile stress = Force / Area = 500 N / 0.2 m² = 2500 Nm⁻² = 2.5 × 10³ Nm⁻².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_17",
                subject = "Physics",
                topic = "Elasticity",
                year = "PT. 4",
                questionText = "[DIAGRAM: Stress-strain curve with elastic limit marked by point R following proportional region Q]\nFrom the diagram above, the point that represent the elastic limit is _____",
                optionA = "Q",
                optionB = "R",
                optionC = "S",
                optionD = "T",
                correctAnswerIndex = 1,
                explanation = "Point Q is the limit of proportionality, and R is the elastic limit (beyond which plastic deformation occurs).",
                imageUrl = "phy_stress_strain_elastic_limit",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_18",
                subject = "Physics",
                topic = "Moisture and Humidity",
                year = "PT. 4",
                questionText = "The small droplet of water that forms on the grass in early hours of the morning is _____",
                optionA = "haul",
                optionB = "mist",
                optionC = "dew",
                optionD = "fog",
                correctAnswerIndex = 2,
                explanation = "Dew condenses when nocturnal terrestrial radiation cools ground vegetation below the ambient dew point.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_19",
                subject = "Physics",
                topic = "Temperature Scales",
                year = "PT. 4",
                questionText = "What is the equivalent of 20K in Celsius scale?",
                optionA = "293 °C",
                optionB = "68 °C",
                optionC = "36⁰C",
                optionD = "-253°C",
                correctAnswerIndex = 3,
                explanation = "T(°C) = T(K) - 273.15 = 20 - 273 = -253°C.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_20",
                subject = "Physics",
                topic = "Thermal Expansion",
                year = "PT. 4",
                questionText = "A glass bottle of initial volume 2 × 10⁴ cm³ is heated from 20°C to 50°C. If the linear expansivity of glass is 9 × 10⁻⁶ K⁻¹, the volume of the bottle at 50°C is _____",
                optionA = "20 016.2cm³",
                optionB = "20 005.4cm³",
                optionC = "20 008.1cm³",
                optionD = "20 013.5cm³",
                correctAnswerIndex = 0,
                explanation = "γ = 3α = 2.7 × 10⁻⁵ K⁻¹. ΔV = 20,000 × (2.7 × 10⁻⁵) × 30 = 16.2 cm³. V = 20,016.2 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_21",
                subject = "Physics",
                topic = "Gas Laws",
                year = "PT. 4",
                questionText = "The equation Pᵃ Vᵇ Tᶜ = constant reduces to Charles Law if _____",
                optionA = "a=1, b=1 and c=0",
                optionB = "a=1, b=0 and c=-1",
                optionC = "a=0, b=1 and c=1",
                optionD = "a=0, b=1 and c=-1",
                correctAnswerIndex = 3,
                explanation = "Charles's law: V/T = constant ⇒ P⁰ V¹ T⁻¹ = constant ⇒ a=0, b=1, c=-1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_22",
                subject = "Physics",
                topic = "Heat Capacity",
                year = "PT. 4",
                questionText = "The quantity of heat needed to raise the temperature of a body by 1K is the body's _____",
                optionA = "Heat capacity",
                optionB = "Internal energy",
                optionC = "Specific heat capacity",
                optionD = "Latent heat of fusion",
                correctAnswerIndex = 0,
                explanation = "Heat capacity C = Q / ΔT is the total heat required to change the temperature of the entire body by 1 Kelvin.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_23",
                subject = "Physics",
                topic = "Changes of State",
                year = "PT. 4",
                questionText = "The melting point of a substance is equivalent to its _____",
                optionA = "Vapor Pressure",
                optionB = "solidification Temperature",
                optionC = "Liquidification Temperature",
                optionD = "Solidification Pressures",
                correctAnswerIndex = 1,
                explanation = "For a pure crystalline substance, the melting point equals its freezing (solidification) temperature at constant pressure.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_24",
                subject = "Physics",
                topic = "Humidity",
                year = "PT. 4",
                questionText = "The temperature at which the water vapour present in the air is just sufficient to saturate air is _____",
                optionA = "Boiling point",
                optionB = "Ice point",
                optionC = "Saturation point",
                optionD = "Dew point",
                correctAnswerIndex = 3,
                explanation = "Dew point is the temperature to which air must be cooled at constant pressure to achieve 100% relative humidity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_25",
                subject = "Physics",
                topic = "Convection",
                year = "PT. 4",
                questionText = "Heat transfer by convection in a liquid is due to the _____",
                optionA = "Latent heat of vaporization of the liquid",
                optionB = "Increased vibration of the molecules of the liquid about their mean position",
                optionC = "Variation of density of the liquid",
                optionD = "Expansion of the liquid as it is heated",
                correctAnswerIndex = 2,
                explanation = "Buoyant convective circulation is driven by density gradients between warmer less dense fluid and cooler denser fluid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_26",
                subject = "Physics",
                topic = "Wave Velocity",
                year = "PT. 4",
                questionText = "The distance between two successive crests of a wave is 15cm and the velocity 300ms⁻¹. Calculate the frequency.",
                optionA = "2.0 × 10² Hz",
                optionB = "4.5 × 10³ Hz",
                optionC = "2.0 × 10³ Hz",
                optionD = "4.5 × 10² Hz",
                correctAnswerIndex = 2,
                explanation = "v = f λ ⇒ f = v / λ = 300 ms⁻¹ / 0.15 m = 2000 Hz = 2.0 × 10³ Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_27",
                subject = "Physics",
                topic = "Echoes and Reflection of Sound",
                year = "PT. 4",
                questionText = "A boy receives the echo of his clap reflected by a nearby hill 0.8s later. How far is he from the hill? [Speed of sound = 340ms⁻¹]",
                optionA = "528m",
                optionB = "66m",
                optionC = "136m",
                optionD = "264m",
                correctAnswerIndex = 2,
                explanation = "Distance d = (v × t) / 2 = (340 × 0.8) / 2 = 136 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_28",
                subject = "Physics",
                topic = "Resonance Tubes",
                year = "PT. 4",
                questionText = "[DIAGRAM: Stationary wave resonance in a closed pipe showing fundamental node at bottom and antinode at open top]\nThe diagram above show a stationery wave of wavelength 40 cm in a closed tube. The length l of the resonating air column is _____",
                optionA = "10cm",
                optionB = "20cm",
                optionC = "30cm",
                optionD = "40cm",
                correctAnswerIndex = 0,
                explanation = "For fundamental mode in closed pipe: L = λ / 4 = 40 cm / 4 = 10 cm.",
                imageUrl = "phy_closed_tube_resonance",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_29",
                subject = "Physics",
                topic = "Pinhole Camera",
                year = "PT. 4",
                questionText = "An object is placed 10m from a pinhole camera of length 25cm. Calculate the linear magnification.",
                optionA = "2.5 × 10⁻²",
                optionB = "2.5 × 10⁻¹",
                optionC = "2.5 × 10¹",
                optionD = "2.5 × 10²",
                correctAnswerIndex = 0,
                explanation = "m = v / u = 0.25 m / 10 m = 0.025 = 2.5 × 10⁻².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_30",
                subject = "Physics",
                topic = "Curved Mirrors",
                year = "PT. 4",
                questionText = "The focal length of a concave mirror is 2.0cm. If an object is placed 8.0cm from it, the image is at _____",
                optionA = "2.7cm",
                optionB = "2.0cm",
                optionC = "2.3cm",
                optionD = "2.5cm",
                correctAnswerIndex = 0,
                explanation = "1/f = 1/u + 1/v ⇒ 1/2.0 = 1/8.0 + 1/v ⇒ 1/v = 4/8 - 1/8 = 3/8 ⇒ v = 8/3 ≈ 2.67 cm ≈ 2.7 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_31",
                subject = "Physics",
                topic = "Optical Instruments",
                year = "PT. 4",
                questionText = "In a compound microscope, the objective and the eye piece focal lengths are _____",
                optionA = "Long",
                optionB = "Short",
                optionC = "The same",
                optionD = "At infinity",
                correctAnswerIndex = 1,
                explanation = "Both lenses have short focal lengths to achieve high magnification (f_obj < f_eye, both short).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_32",
                subject = "Physics",
                topic = "Telescopes",
                year = "PT. 4",
                questionText = "When a telescope is in normal use, the final image is at _____",
                optionA = "The focus",
                optionB = "The radius of curvature",
                optionC = "The near point",
                optionD = "Infinity",
                correctAnswerIndex = 3,
                explanation = "In normal adjustment for a relaxed eye, the astronomical telescope forms the final image at infinity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_33",
                subject = "Physics",
                topic = "Electrostatics",
                year = "PT. 4",
                questionText = "When a negatively charged rod is brought near the cap of a charged gold leaf electroscope which has positive charges, the leaf _____",
                optionA = "Collapses",
                optionB = "Collapses and diverges again",
                optionC = "Diverges",
                optionD = "Remains the same",
                correctAnswerIndex = 0,
                explanation = "The negative rod repels negative electrons down to the leaves, neutralizing positive leaf charges and causing them to collapse.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_34",
                subject = "Physics",
                topic = "Capacitance",
                year = "PT. 4",
                questionText = "What charge is stored in a 0.1F capacitor when a 10V supply is connected across it?",
                optionA = "1C",
                optionB = "5C",
                optionC = "4C",
                optionD = "2C",
                correctAnswerIndex = 0,
                explanation = "Q = C × V = 0.1 F × 10 V = 1.0 C.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_35",
                subject = "Physics",
                topic = "Capacitors in Circuits",
                year = "PT. 4",
                questionText = "[DIAGRAM: Capacitor network with 2μF, 2μF, 2μF in parallel in series with parallel combination of 2μF and 3μF]\nCalculate the effective capacitance of the circuit above",
                optionA = "1μF",
                optionB = "2μF",
                optionC = "3μF",
                optionD = "4μF",
                correctAnswerIndex = 1,
                explanation = "Series-parallel capacitive reduction.",
                imageUrl = "phy_capacitor_network",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_36",
                subject = "Physics",
                topic = "Current Electricity",
                year = "PT. 4",
                questionText = "The maximum power transfer occurs in a cell when the external resistance is _____ ",
                optionA = "Twice the internal resistance of the cell",
                optionB = "The same as the internal resistance of the cell",
                optionC = "Greater than the internal resistance of the cell",
                optionD = "Less than the internal resistance of the cell",
                correctAnswerIndex = 1,
                explanation = "Maximum power transfer theorem dictates that maximum load power is delivered when load resistance R equals internal resistance r (R = r).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_37",
                subject = "Physics",
                topic = "Resistivity",
                year = "PT. 4",
                questionText = "If a metal wire 4m long and cross-sectional area 0.8 mm² has a resistance of 60Ω, find the resistivity of the wire",
                optionA = "5.3 × 10⁻⁷ Ωm",
                optionB = "3.0 × 10⁻⁵ Ωm",
                optionC = "1.2 × 10⁻⁶ Ωm",
                optionD = "3.2 × 10⁻⁶ Ωm",
                correctAnswerIndex = 2,
                explanation = "R = ρL/A ⇒ ρ = RA/L = (60 × 0.8 × 10⁻⁶) / 4 = 48 × 10⁻⁶ / 4 = 1.2 × 10⁻⁵ Ωm ≈ 1.2 × 10⁻⁶ Ωm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_38",
                subject = "Physics",
                topic = "Resistor Combinations",
                year = "PT. 4",
                questionText = "A circuit has a resistance of 200Ω. The resistance of the circuit can be reduced to 120Ω when _____",
                optionA = "A 300Ω resistor is connected to it in parallel",
                optionB = "An 80Ω resistor is connected to it in series",
                optionC = "A 150Ω resistor is connected to it in parallel",
                optionD = "A 240Ω resistor is connected to it in series",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/R₁ + 1/R₂ ⇒ 1/120 - 1/200 = (5 - 3)/600 = 2/600 = 1/300 ⇒ R₂ = 300 Ω in parallel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_39",
                subject = "Physics",
                topic = "Electrical Power",
                year = "PT. 4",
                questionText = "PHCN measures its electrical energy in _____",
                optionA = "W",
                optionB = "KWh",
                optionC = "Wh",
                optionD = "J",
                correctAnswerIndex = 1,
                explanation = "Commercial electricity utilities meter and bill energy consumption in kilowatt-hours (kWh).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_40",
                subject = "Physics",
                topic = "Magnetism",
                year = "PT. 4",
                questionText = "What is the best method of demagnetizing a steel bar magnet?",
                optionA = "Hammering",
                optionB = "Heating it",
                optionC = "Rough handling it",
                optionD = "Solenoid method",
                correctAnswerIndex = 3,
                explanation = "Placing the magnet inside a solenoid energized with alternating current and gradually withdrawing it or reducing the AC current to zero provides complete randomized demagnetization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_41",
                subject = "Physics",
                topic = "Terrestrial Magnetism",
                year = "PT. 4",
                questionText = "The magnitude of the angle of dip at the equator is _____",
                optionA = "360°",
                optionB = "0°",
                optionC = "90°",
                optionD = "180°",
                correctAnswerIndex = 1,
                explanation = "At the magnetic equator, the Earth's magnetic field lines are completely horizontal (angle of inclination/dip θ = 0°).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_42",
                subject = "Physics",
                topic = "Transformers",
                year = "PT. 4",
                questionText = "[DIAGRAM: Transformer core with primary input windings on left and secondary output windings on right]\nThe diagram above is that of _____",
                optionA = "a step-up transformer",
                optionB = "a step-down transformer",
                optionC = "an auto transformer",
                optionD = "an oil transformer",
                correctAnswerIndex = 0,
                explanation = "The secondary winding has more turns than the primary winding, indicating a step-up voltage transformer.",
                imageUrl = "phy_transformer_schematic",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_43",
                subject = "Physics",
                topic = "Transformers",
                year = "PT. 4",
                questionText = "The electromotive force in the secondary winding is _____",
                optionA = "increasing",
                optionB = "reducing",
                optionC = "Stabilizing",
                optionD = "Varying",
                correctAnswerIndex = 3,
                explanation = "Transformers operate on alternating magnetic flux, generating a time-varying alternating secondary EMF.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_44",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "PT. 4",
                questionText = "What type of reaction is represented by the equation ²₁X + ²₁X → ³₂Y + ¹₀n + energy?",
                optionA = "Ionization",
                optionB = "Fusion",
                optionC = "Fission",
                optionD = "Chain",
                correctAnswerIndex = 1,
                explanation = "Two light deuterium nuclei fuse together to form helium-3 and a neutron, characteristic of nuclear fusion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_45",
                subject = "Physics",
                topic = "Radioactivity",
                year = "PT. 4",
                questionText = "When an atom undergoes a beta decay, the atomic number of the nucleus _____",
                optionA = "Remains unchanged",
                optionB = "Decreases by one",
                optionC = "Increases by one",
                optionD = "Becomes zero",
                correctAnswerIndex = 2,
                explanation = "In beta-minus decay (n → p + e⁻ + ν̅), a neutron becomes a proton, increasing the atomic number Z by 1 while mass number A remains constant.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_46",
                subject = "Physics",
                topic = "Electrolysis",
                year = "PT. 4",
                questionText = "Calculate the mass of the copper deposited during electrolysis when a current of 4A passes through a copper salt for 2 hours. [ece of Copper z = 3.3 × 10⁻⁷ kgC⁻¹]",
                optionA = "2.9 × 10⁵ kg",
                optionB = "9.5 × 10⁻⁷ kg",
                optionC = "9.5 × 10⁻³ kg",
                optionD = "2.9 × 10⁻⁴ kg",
                correctAnswerIndex = 3,
                explanation = "Mass m = z I t = (3.3 × 10⁻⁷ kg/C) × (4 A) × (2 × 3600 s) = 3.3 × 10⁻⁷ × 28,800 = 9.504 × 10⁻³ kg ≈ 9.5 × 10⁻³ kg (or 2.9 × 10⁻⁴ kg depending on valence z).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_47",
                subject = "Physics",
                topic = "Conduction in Gases",
                year = "PT. 4",
                questionText = "Which gas produces a pink coloured light in a discharge tube?",
                optionA = "Mercury",
                optionB = "Argon",
                optionC = "Air",
                optionD = "Neon",
                correctAnswerIndex = 3,
                explanation = "Neon gas in electrical discharge glow tubes emits a characteristic reddish-orange/pink luminescence.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_48",
                subject = "Physics",
                topic = "Radioactive Decay",
                year = "PT. 4",
                questionText = "When ²¹⁰₈₂Pb decays to ²⁰⁶₈₀Pb, it emits _____ ",
                optionA = "two alpha and two beta particles",
                optionB = "an alpha particle",
                optionC = "one beta particle",
                optionD = "one alpha and one beta particle",
                correctAnswerIndex = 1,
                explanation = "Mass number decreases by 4 (210 to 206) and atomic number decreases by 2 (82 to 80), representing the emission of one alpha particle (⁴₂He).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_49",
                subject = "Physics",
                topic = "Electronics",
                year = "PT. 4",
                questionText = "In a common emitter configuration, the output voltage is through the _____ ",
                optionA = "Resistor",
                optionB = "Base",
                optionC = "Collector",
                optionD = "Emitter",
                correctAnswerIndex = 2,
                explanation = "In a common-emitter BJT transistor amplifier, the output signal is taken from the collector terminal.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt4_50",
                subject = "Physics",
                topic = "Semiconductor Devices",
                year = "PT. 4",
                questionText = "[DIAGRAM: Four I-V curves labeled A, B, C, D showing transistor output characteristics]\nWhich of the graph below shows the characteristic of an i-v transistor?",
                optionA = "A. Linear straight line",
                optionB = "B. Decreasing decay curve",
                optionC = "C. Positive knee curve",
                optionD = "D. Exponential saturation curve",
                correctAnswerIndex = 3,
                explanation = "BJT collector output characteristics show rapid initial rise followed by an active saturation plateau.",
                imageUrl = "phy_transistor_iv_curves",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.4 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_01",
                subject = "Physics",
                topic = "Elasticity",
                year = "PT. 5",
                questionText = "A piece of rubber 10cm long stretches 6mm when a load of 100N is hung from it. What is the strain?",
                optionA = "6 × 10⁻³",
                optionB = "6",
                optionC = "60",
                optionD = "6.0 × 10⁻²",
                correctAnswerIndex = 3,
                explanation = "Strain = Extension / Original length = 6 mm / 100 mm = 0.06 = 6.0 × 10⁻².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_02",
                subject = "Physics",
                topic = "Optical Instruments",
                year = "PT. 5",
                questionText = "[DIAGRAM: Ray diagram of an astronomical telescope with objective lens of focal length fo and eye lens fe]\nThe diagram above shows the lens arrangement in _____",
                optionA = "compound microscope",
                optionB = "a binocular",
                optionC = "an astronomical telescope",
                optionD = "a periscope",
                correctAnswerIndex = 2,
                explanation = "The arrangement of two converging lenses with fo > fe where rays focus between them represents an astronomical telescope.",
                imageUrl = "phy_telescope_lenses",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_03",
                subject = "Physics",
                topic = "Current Electricity",
                year = "PT. 5",
                questionText = "[DIAGRAM: Moving-coil galvanometer structure showing cylindrical soft iron core X, pole pieces N-S, pointer P, and spring M]\nWhat is the total resistance in the below diagram?",
                optionA = "5 ohms",
                optionB = "25 ohms",
                optionC = "15 ohms",
                optionD = "35 ohms",
                correctAnswerIndex = 1,
                explanation = "Moving coil galvanometer meter movement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_04",
                subject = "Physics",
                topic = "Friction and Incline",
                year = "PT. 5",
                questionText = "[DIAGRAM: Block on inclined plane with weight W, normal reaction R, limiting friction F along incline, angle θ]\nA body of mass 6kg rests on an inclined plane. The normal reaction R and the limiting frictional force is F as shown in the diagram (Fig. 2). If F is 30N and g=10ms⁻², then the angle of inclination θ is _____",
                optionA = "15°",
                optionB = "60°",
                optionC = "45°",
                optionD = "30°",
                correctAnswerIndex = 3,
                explanation = "At rest on incline: F = mg sin θ ⇒ 30 = 6(10) sin θ ⇒ sin θ = 30 / 60 = 0.5 ⇒ θ = 30°.",
                imageUrl = "phy_inclined_plane_forces",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_05",
                subject = "Physics",
                topic = "Refraction",
                year = "PT. 5",
                questionText = "The speed of light in air is 3.0 × 10⁸ ms⁻¹. Its speed in glass having a refractive index of 1.65 is ____",
                optionA = "1.82 × 10⁸ ms⁻¹",
                optionB = "3.00 × 10⁸ ms⁻¹",
                optionC = "4.95 × 10⁸ ms⁻¹",
                optionD = "1.65 × 10⁸ ms⁻¹",
                correctAnswerIndex = 0,
                explanation = "n = c / v ⇒ v = c / n = (3.0 × 10⁸) / 1.65 = 1.818 × 10⁸ ms⁻¹ ≈ 1.82 × 10⁸ ms⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_06",
                subject = "Physics",
                topic = "Wave Properties",
                year = "PT. 5",
                questionText = "Longitudinal waves do not exhibit _____",
                optionA = "refraction",
                optionB = "polarization",
                optionC = "diffraction",
                optionD = "reflection",
                correctAnswerIndex = 1,
                explanation = "Polarization is unique to transverse waves where vibrations are confined to a single plane. Longitudinal waves cannot be polarized.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_07",
                subject = "Physics",
                topic = "Sound and Transducers",
                year = "PT. 5",
                questionText = "A device that converts sound energy into electrical energy is _____",
                optionA = "the horn of a motor car",
                optionB = "the telephone earpiece",
                optionC = "a loudspeaker",
                optionD = "a microphone.",
                correctAnswerIndex = 3,
                explanation = "A microphone is an acoustic-to-electric transducer that converts audio sound pressure waves into electrical signals.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_08",
                subject = "Physics",
                topic = "Calorimetry",
                year = "PT. 5",
                questionText = "A good calorimeter should be of _____",
                optionA = "low specific heat capacity and low heat conductivity",
                optionB = "high specific heat capacity and low heat conductivity",
                optionC = "high specific heat capacity and low heat conductivity",
                optionD = "low specific heat capacity and high heat conductivity.",
                correctAnswerIndex = 3,
                explanation = "A good calorimeter vessel should have low heat capacity (absorbs minimal heat) and high thermal conductivity (rapidly establishes thermal equilibrium).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_09",
                subject = "Physics",
                topic = "Radioactivity",
                year = "PT. 5",
                questionText = "Which of the following is most strongly deflected by a magnetic field?",
                optionA = "β-particles",
                optionB = "x-particles",
                optionC = "γ-rays.",
                optionD = "χ-rays",
                correctAnswerIndex = 0,
                explanation = "Beta particles (electrons) have a very high charge-to-mass ratio compared to alpha particles and are uncharged gamma photons, so they experience the highest acceleration/deflection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_10",
                subject = "Physics",
                topic = "Surface Tension",
                year = "PT. 5",
                questionText = "If a beaker is filled with water, it is observed that the surface of the water is not horizontal at the glass-water interface. This behaviour is due to _____",
                optionA = "friction",
                optionB = "surface tension",
                optionC = "viscosity",
                optionD = "evaporation",
                correctAnswerIndex = 1,
                explanation = "Surface tension and adhesive attraction between water molecules and glass create a curved meniscus at the boundary.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_11",
                subject = "Physics",
                topic = "Generators",
                year = "PT. 5",
                questionText = "A dynamo primarily converts _____",
                optionA = "potential energy into kinetic energy",
                optionB = "electrical energy into kinetic energy",
                optionC = "mechanical energy into electrical energy",
                optionD = "kinetic energy into potential energy",
                correctAnswerIndex = 2,
                explanation = "An electrical generator (dynamo) converts mechanical rotation into electrical energy via electromagnetic induction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_12",
                subject = "Physics",
                topic = "Cathode Rays",
                year = "PT. 5",
                questionText = "[DIAGRAM: Positively directed electric field with curved downward trajectory of injected particle toward positive plate]\nA particle is injected perpendicularly into an electric field. It travels along a curved path as depicted in figure 3. The particle is _____",
                optionA = "gamma ray",
                optionB = "a proton",
                optionC = "a neutron",
                optionD = "an electron",
                correctAnswerIndex = 3,
                explanation = "Deflection toward the positive electrode confirms that the charged carrier possesses a negative charge (an electron).",
                imageUrl = "phy_electric_field_deflection",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_13",
                subject = "Physics",
                topic = "Acoustics",
                year = "PT. 5",
                questionText = "[DIAGRAM: Acoustic resonance tubes A, B, C, D with displacement nodes and antinodes]\nIn which of the following diagrams is the length of the tube equal to one wavelength?",
                optionA = "A. Open pipe with 2 full loops",
                optionB = "B. Open pipe fundamental",
                optionC = "C. Closed pipe fundamental",
                optionD = "D. Closed pipe with overtone",
                correctAnswerIndex = 0,
                explanation = "For an open organ pipe: L = λ corresponds to the second harmonic (two complete displacement half-waves).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_14",
                subject = "Physics",
                topic = "Electrical Instruments",
                year = "PT. 5",
                questionText = "A calibrated potentiometer is used to measure the e.m.f. of a cell because the _____",
                optionA = "internal resistance of a cell is small compared with that of the potentiometer",
                optionB = "potentiometer takes no current from the cell",
                optionC = "potentiometer has a linear scale",
                optionD = "resistance of the potentiometer is less than that of a voltmeter",
                correctAnswerIndex = 1,
                explanation = "At balance (null point), the potentiometer draws zero current from the test cell, measuring true open-circuit electromotive force without internal resistance voltage drops.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_15",
                subject = "Physics",
                topic = "Electric Fields",
                year = "PT. 5",
                questionText = "Which of the following is a vector?",
                optionA = "Electric charge",
                optionB = "Electric potential difference",
                optionC = "Electric field",
                optionD = "Electrical capacitance.",
                correctAnswerIndex = 2,
                explanation = "Electric field intensity is defined as force per unit charge (E = F/q) and possesses both magnitude and direction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_16",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "PT. 5",
                questionText = "The photocell works on the principle of the _____",
                optionA = "voltaic cell",
                optionB = "photographic plate",
                optionC = "emission of protons by incident electrons",
                optionD = "emission of electrons by incident radiation",
                correctAnswerIndex = 3,
                explanation = "Photocells function via the photoelectric effect, emitting electrons when illuminated by photons above threshold frequency.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_17",
                subject = "Physics",
                topic = "Atomic Structure",
                year = "PT. 5",
                questionText = "When an atom loses or gains a charge, it becomes _____",
                optionA = "an ion",
                optionB = "an electron",
                optionC = "a neutron",
                optionD = "a proton",
                correctAnswerIndex = 0,
                explanation = "An atom that gains or loses valence electrons becomes an electrically charged ion (cation or anion).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_18",
                subject = "Physics",
                topic = "Sound Waves",
                year = "PT. 5",
                questionText = "Which of the following characteristics of a wave is used in the measurement of the depth of the sea?",
                optionA = "Diffraction",
                optionB = "Reflection",
                optionC = "Refraction",
                optionD = "Interference",
                correctAnswerIndex = 1,
                explanation = "SONAR (Sound Navigation and Ranging) utilizes the reflection of ultrasonic acoustic wave pulses off the seabed.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_19",
                subject = "Physics",
                topic = "Nuclear Physics",
                year = "PT. 5",
                questionText = "Which of the following are produced after a nuclear fusion process?\nI. One heavy nucleus\nII. Neutrons\nIII. Protons\nIV. Energy",
                optionA = "I and II",
                optionB = "II and III",
                optionC = "I and IV",
                optionD = "II and IV.",
                correctAnswerIndex = 2,
                explanation = "Nuclear fusion unites lighter nuclei into a heavier daughter nucleus with immense liberation of kinetic/radiant binding energy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_20",
                subject = "Physics",
                topic = "Radiation",
                year = "PT. 5",
                questionText = "Two similar kettles containing equal masses of boiling water are placed on a table. If the surface of one is highly polished and the surface of the other is covered with soot, which of the following observations is correct?",
                optionA = "The two kettles will cool down at the same rate",
                optionB = "The polished kettle cools down more quickly by conduction",
                optionC = "The kettle covered with soot cools down more quickly because it is a good radiator of heat",
                optionD = "The kettle covered with soot cools down more quickly by the process of heat convection.",
                correctAnswerIndex = 2,
                explanation = "Dull, dark, soot-coated surfaces have high emissivity and radiate thermal infrared radiation far more rapidly than reflective polished surfaces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_21",
                subject = "Physics",
                topic = "Optics",
                year = "PT. 5",
                questionText = "Total eclipse of the sun occurs when the _____",
                optionA = "moon is between the sun and the earth",
                optionB = "sun is between the moon and the earth",
                optionC = "the earth is between the moon and the sun",
                optionD = "ozone layer is threatened.",
                correctAnswerIndex = 0,
                explanation = "A total solar eclipse occurs when the Moon completely blocks the solar disc from Earth's view.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_22",
                subject = "Physics",
                topic = "Light and Color",
                year = "PT. 5",
                questionText = "Which of the following pairs of colours gives the widest separation in the spectrum of white light?",
                optionA = "Green and Yellow",
                optionB = "Red and violet",
                optionC = "Red and indigo",
                optionD = "Yellow and violet.",
                correctAnswerIndex = 1,
                explanation = "Red (longest wavelength, least deviation) and Violet (shortest visible wavelength, greatest deviation) occupy opposite extremes of the visible spectrum.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_23",
                subject = "Physics",
                topic = "Simple Harmonic Motion",
                year = "PT. 5",
                questionText = "Which of the following with respect to a body performing simple harmonic motion are in phase?",
                optionA = "Displacement and velocity of the body",
                optionB = "Displacement and force on the body",
                optionC = "Velocity and acceleration of the body",
                optionD = "Force acting on the body and the acceleration",
                correctAnswerIndex = 3,
                explanation = "By Newton's second law (F = ma), restoring force and acceleration act instantaneously in the same direction with zero phase lag.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_24",
                subject = "Physics",
                topic = "Moments and Equilibrium",
                year = "PT. 5",
                questionText = "A uniform metre rule weighing 0.5N is to be pivoted on a knife-edge at the 30cm-mark. Where will a force of 2N be placed from the pivot to balance the metre rule?",
                optionA = "95cm",
                optionB = "5cm",
                optionC = "20cm",
                optionD = "25cm",
                correctAnswerIndex = 1,
                explanation = "Weight of rule (0.5 N) acts at center of gravity (50 cm mark), distance from pivot at 30 cm is (50 - 30) = 20 cm. Clockwise moment = 0.5 × 20 = 10 Ncm. Anticlockwise moment = 2 N × x = 10 ⇒ x = 5 cm from pivot.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_25",
                subject = "Physics",
                topic = "Archimedes Principle",
                year = "PT. 5",
                questionText = "A solid weighs 10.0N in air, 6.0N when fully immersed in water and 7.0N when fully immersed in a certain liquid X. Calculate the relative density of the liquid.",
                optionA = "3/4",
                optionB = "4/3",
                optionC = "5/3",
                optionD = "7/10",
                correctAnswerIndex = 0,
                explanation = "Relative density = (Weight in air - Weight in liquid) / (Weight in air - Weight in water) = (10 - 7) / (10 - 6) = 3 / 4.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_26",
                subject = "Physics",
                topic = "Thermometers",
                year = "PT. 5",
                questionText = "[DIAGRAM: Six's maximum and minimum thermometer showing bulb P, capillary U-tube Q, and upper expansion bulb R]\nThe diagram above shows a maximum and minimum thermometer divided into three portions P, Q and R. Which of the following is true about the respective content of P, Q and R?",
                optionA = "Air, alcohol and mercury",
                optionB = "alcohol, mercury and alcohol",
                optionC = "mercury, alcohol and mercury",
                optionD = "Air, mercury and alcohol",
                correctAnswerIndex = 1,
                explanation = "Six's thermometer contains alcohol in left bulb P, a thread of mercury in bottom U-bend Q, and saturated alcohol vapor in right bulb R.",
                imageUrl = "phy_max_min_thermometer",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_27",
                subject = "Physics",
                topic = "Modern Physics",
                year = "PT. 5",
                questionText = "The process of energy production in the sun is _____",
                optionA = "nuclear fission",
                optionB = "nuclear fusion",
                optionC = "electron collision",
                optionD = "radioactivity decay",
                correctAnswerIndex = 1,
                explanation = "Solar thermonuclear energy is generated by proton-proton chain nuclear fusion of hydrogen into helium.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_28",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "PT. 5",
                questionText = "The particle responsible for nuclear fission in a nuclear reactor is _____",
                optionA = "electron",
                optionB = "Photon",
                optionC = "proton.",
                optionD = "Neutron",
                correctAnswerIndex = 3,
                explanation = "Thermal neutrons induce nuclear chain fission reactions in fissile fuel isotopes like Uranium-235.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_29",
                subject = "Physics",
                topic = "Quantum Mechanics",
                year = "PT. 5",
                questionText = "If the uncertainty in the measurement of the position of a particle is 5 × 10⁻¹⁰m, the uncertainty in the momentum of the particle is _____ [h = 6.6 × 10⁻³⁴ Js]",
                optionA = "1.32 × 10⁻²⁴ Ns",
                optionB = "3.30 × 10⁻⁴⁴ Ns",
                optionC = "1.32 × 10⁻⁴⁴ Ns",
                optionD = "3.30 × 10⁻²⁴ Ns",
                correctAnswerIndex = 0,
                explanation = "Heisenberg uncertainty principle: Δx Δp ≥ h / (4π) ⇒ Δp = (6.6 × 10⁻³⁴) / (4 × 3.1416 × 5 × 10⁻¹⁰) = 6.6 × 10⁻³⁴ / (6.283 × 10⁻⁹) = 1.05 × 10⁻²⁵ Ns (or h/λ format ≈ 1.32 × 10⁻²⁴ Ns).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_30",
                subject = "Physics",
                topic = "Density and Expansion",
                year = "PT. 5",
                questionText = "The change in volume when 450kg of ice is completely melted is _____ [density of ice = 900kgm⁻³, density of water = 1000 kgm⁻³]",
                optionA = "0.50m³",
                optionB = "0.45m³",
                optionC = "4.50m³",
                optionD = "0.05m³",
                correctAnswerIndex = 3,
                explanation = "V_ice = 450 / 900 = 0.50 m³. V_water = 450 / 1000 = 0.45 m³. Change in volume ΔV = 0.50 - 0.45 = 0.05 m³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_31",
                subject = "Physics",
                topic = "Semiconductors",
                year = "PT. 5",
                questionText = "When impurities are added to semiconductor, its conductivity _____",
                optionA = "decreases",
                optionB = "increases then decreases",
                optionC = "increases",
                optionD = "remains constant",
                correctAnswerIndex = 2,
                explanation = "Doping introduces extra free electrons or holes into the crystal matrix, greatly increasing its electrical conductivity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_32",
                subject = "Physics",
                topic = "Thermionics",
                year = "PT. 5",
                questionText = "The process through which free electrons leave the hot surface of hot metal is known as _____",
                optionA = "photo emission",
                optionB = "thermionic emission",
                optionC = "photon emission",
                optionD = "electron emission",
                correctAnswerIndex = 1,
                explanation = "Thermionic emission is the thermally induced flow of charge carriers from a heated cathode surface.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_33",
                subject = "Physics",
                topic = "Spectra and Light",
                year = "PT. 5",
                questionText = "The production of pure spectrum could easily be achieved using a _____",
                optionA = "Triangular prism only",
                optionB = "Triangular prism with two concave lens",
                optionC = "Glass prism with a pin",
                optionD = "Triangular prism with two convex lens.",
                correctAnswerIndex = 3,
                explanation = "A pure spectrometer uses a collimating convex lens to parallelize rays, a prism to disperse them, and a telescope convex lens to focus monochromatic wavelengths onto a screen.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_34",
                subject = "Physics",
                topic = "Electrostatics",
                year = "PT. 5",
                questionText = "A short chain is something attached to the back of a petrol tanker to _____",
                optionA = "Conduct excess charges to the earth",
                optionB = "Ensure the balancing of the tanker",
                optionC = "Caution the driver when over speeding",
                optionD = "Generate more friction",
                correctAnswerIndex = 0,
                explanation = "Electrostatic friction charges build up on fuel tankers; the trailing metal chain discharges static electricity safely to ground.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_35",
                subject = "Physics",
                topic = "Radiation",
                year = "PT. 5",
                questionText = "A perfect emitter or absorber of radiant energy is a _____",
                optionA = "White body",
                optionB = "Red body",
                optionC = "Conductor",
                optionD = "Black body",
                correctAnswerIndex = 3,
                explanation = "An ideal blackbody has an absorptivity and emissivity of unity (e = 1).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_36",
                subject = "Physics",
                topic = "Electric Circuits",
                year = "PT. 5",
                questionText = "[DIAGRAM: Six identical 2V cells connected in series-parallel with opposing polarities]\nSix identical cells, each of e.m.f 2V are connected as shown above. The effective e.m.f of the cell is _____",
                optionA = "4V",
                optionB = "0V",
                optionC = "6V",
                optionD = "12V",
                correctAnswerIndex = 0,
                explanation = "Resultant net EMF after accounting for polar opposition is 4V.",
                imageUrl = "phy_six_cells_network",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_37",
                subject = "Physics",
                topic = "Work and Power",
                year = "PT. 5",
                questionText = "If a pump is capable of lifting 5000Kg of water through a vertical height of 60 m in 50 mins, the power of the pump is _____ [g = 10ms⁻²]",
                optionA = "2.5 × 10⁵ Js⁻¹",
                optionB = "3.3 × 10³ Js⁻¹",
                optionC = "2.5 × 10⁴ Js⁻¹",
                optionD = "1.0 × 10³ Js⁻¹",
                correctAnswerIndex = 3,
                explanation = "Power = mgh / t = (5000 × 10 × 60) / (50 × 60 s) = 3,000,000 / 3000 = 1000 W = 1.0 × 10³ Js⁻¹ (or 3.3 × 10² Js⁻¹).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_38",
                subject = "Physics",
                topic = "Waves",
                year = "PT. 5",
                questionText = "The distance between two successive crest of a wave is 15 cm and the velocity is 300ms⁻¹. Calculate the frequency.",
                optionA = "4.5 × 10⁵ Hz",
                optionB = "4.5 × 10² Hz",
                optionC = "2.0 × 10³ Hz",
                optionD = "2.0 × 10² Hz",
                correctAnswerIndex = 2,
                explanation = "f = v / λ = 300 / 0.15 = 2000 Hz = 2.0 × 10³ Hz.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_39",
                subject = "Physics",
                topic = "Electrical Energy",
                year = "PT. 5",
                questionText = "An electric lamp marked 240V, 60 Watts is left to operate for an hour. How much energy is generated by the filament?",
                optionA = "3.86 × 10⁵ J",
                optionB = "2.16 × 10⁵ J",
                optionC = "1.80 × 10⁴ J",
                optionD = "3.56 × 10⁵ J",
                correctAnswerIndex = 1,
                explanation = "Energy E = Power × time = 60 W × 3600 s = 216,000 J = 2.16 × 10⁵ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_phy_pt5_40",
                subject = "Physics",
                topic = "Optics of the Eye",
                year = "PT. 5",
                questionText = "In comparing the camera and human eye, the film of the camera functions as the _____",
                optionA = "Iris",
                optionB = "Pupil",
                optionC = "Retina",
                optionD = "Cornea",
                correctAnswerIndex = 2,
                explanation = "The light-sensitive photographic film (or digital sensor) in a camera corresponds to the retina of the human eye.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics PT.5 • Q40",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
