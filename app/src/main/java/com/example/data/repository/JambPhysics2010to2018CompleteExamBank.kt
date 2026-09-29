package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Physics 2010 - 2018 Complete Exam Bank.
 * Extracted directly from official JAMB UTME Physics Past Questions (2010 - 2018 Series).
 * Covers Mechanics, Thermal Physics, Waves, Optics, Electricity & Magnetism, and Atomic/Nuclear Physics.
 */
object JambPhysics2010to2018CompleteExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2010 PHYSICS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "phys_2010_02",
                subject = "Physics",
                topic = "Relative Velocity",
                year = "2010",
                questionText = "Two cars moving in the same direction have speeds of 100 km/h and 130 km/h. What is the velocity of the faster car as measured by an observer in the slower car?",
                optionA = "130 km/h",
                optionB = "230 km/h",
                optionC = "200 km/h",
                optionD = "30 km/h",
                correctAnswerIndex = 3,
                explanation = "When two bodies move in the same direction, relative velocity is the difference between their velocities: V_rel = 130 km/h - 100 km/h = 30 km/h.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_04",
                subject = "Physics",
                topic = "Gravitational Free Fall",
                year = "2010",
                questionText = "A stone and a feather are dropped from the same height above the earth surface. Ignoring air resistance, which of the following is correct?",
                optionA = "The stone and feather will both reach the ground at the same time",
                optionB = "The stone will reach the ground first",
                optionC = "The feather will reach the ground first",
                optionD = "The feather will float while the stone falls",
                correctAnswerIndex = 0,
                explanation = "In the absence of air resistance (vacuum), all bodies fall under gravity with the same acceleration (g = 9.8 m/s²), regardless of their masses.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_05",
                subject = "Physics",
                topic = "Linear Acceleration",
                year = "2010",
                questionText = "A car moves with an initial velocity of 25 ms⁻¹ and reaches a velocity of 45 ms⁻¹ in 10s. What is the acceleration of the car?",
                optionA = "5 ms⁻²",
                optionB = "25 ms⁻²",
                optionC = "20 ms⁻²",
                optionD = "2 ms⁻²",
                correctAnswerIndex = 3,
                explanation = "Acceleration a = (v - u) / t = (45 - 25) / 10 = 20 / 10 = 2 ms⁻².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_06",
                subject = "Physics",
                topic = "Mass and Weight",
                year = "2010",
                questionText = "An object is weighed at different locations on the earth. What will be the right observation?",
                optionA = "Both the mass and weight vary",
                optionB = "The weight is constant while the mass varies",
                optionC = "The mass is constant while the weight varies",
                optionD = "Both the mass and weight are constant",
                correctAnswerIndex = 2,
                explanation = "Mass is the quantity of matter in a body and remains constant everywhere, whereas weight (W = mg) varies because acceleration due to gravity (g) varies with geographic latitude and altitude.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_08",
                subject = "Physics",
                topic = "Work, Energy & Power",
                year = "2010",
                questionText = "A bob of weight 0.1N hangs from a massless string of length 50cm. A variable horizontal force is applied to pull the bob until the string makes an angle of 60° with the vertical. The work done is:",
                optionA = "0.250 J",
                optionB = "0.025 J",
                optionC = "0.050 J",
                optionD = "0.500 J",
                correctAnswerIndex = 1,
                explanation = "Vertical height gained h = L(1 - cos 60°) = 0.50(1 - 0.5) = 0.25 m. Work done = increase in potential energy = W × h = 0.1 N × 0.25 m = 0.025 J.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_09",
                subject = "Physics",
                topic = "Friction",
                year = "2010",
                questionText = "The surfaces of conveyor belts are made rough so as to:",
                optionA = "prevent the load from slipping",
                optionB = "make them stronger",
                optionC = "enable them to carry more load",
                optionD = "protect them while carrying load",
                correctAnswerIndex = 0,
                explanation = "Roughening the surface increases the coefficient of static friction between the conveyor belt and the cargo, preventing materials from slipping during motion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_10",
                subject = "Physics",
                topic = "Simple Machines: Efficiency",
                year = "2010",
                questionText = "A machine of velocity ratio 6 requires an effort of 400N to raise a load of 800N through 1m. Find the efficiency of the machine.",
                optionA = "50%",
                optionB = "22.2%",
                optionC = "33.3%",
                optionD = "55.6%",
                correctAnswerIndex = 2,
                explanation = "Mechanical Advantage (M.A.) = Load / Effort = 800 / 400 = 2. Efficiency = (M.A. / V.R.) × 100% = (2 / 6) × 100% = 33.3%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_11",
                subject = "Physics",
                topic = "Elasticity: Strain Energy",
                year = "2010",
                questionText = "If a wire 30cm long is extended to 30.5cm by a force of 300N. Find the strain energy of the wire.",
                optionA = "7.50 J",
                optionB = "750.00 J",
                optionC = "75.00 J",
                optionD = "0.75 J",
                correctAnswerIndex = 3,
                explanation = "Extension e = 30.5 cm - 30.0 cm = 0.5 cm = 0.005 m. Strain energy = 1/2 × Force × extension = 1/2 × 300 N × 0.005 m = 0.75 J.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_12",
                subject = "Physics",
                topic = "Hydrostatics: Hydraulic Press",
                year = "2010",
                questionText = "In a hydraulic press, the pump piston exerts a pressure of 100 Pa on the liquid. What force is exerted on the second piston of cross-sectional area 3 m²?",
                optionA = "200 N",
                optionB = "100 N",
                optionC = "150 N",
                optionD = "300 N",
                correctAnswerIndex = 3,
                explanation = "By Pascal's principle, pressure is transmitted equally in all directions: F = Pressure × Area = 100 Pa × 3 m² = 300 N.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_14",
                subject = "Physics",
                topic = "Hydrostatics: Density & Flotation",
                year = "2010",
                questionText = "A hydrometer is an instrument used in measuring:",
                optionA = "density of liquid",
                optionB = "relative density of a liquid",
                optionC = "relative humidity of a liquid",
                optionD = "vapour pressure of a fluid",
                correctAnswerIndex = 1,
                explanation = "A hydrometer is calibrated to directly read the relative density (specific gravity) of liquids based on the law of flotation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_15",
                subject = "Physics",
                topic = "Thermometry",
                year = "2010",
                questionText = "One special advantage of alcohol over mercury as a thermometric liquid is its:",
                optionA = "low freezing point",
                optionB = "low boiling point",
                optionC = "high specific heat capacity",
                optionD = "low density",
                correctAnswerIndex = 0,
                explanation = "Alcohol freezes at -115°C compared to mercury's -39°C, allowing alcohol thermometers to measure much lower temperatures.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_18",
                subject = "Physics",
                topic = "Thermal Radiation",
                year = "2010",
                questionText = "Heat is radiated by all hot objects in the form of:",
                optionA = "light energy",
                optionB = "solar energy",
                optionC = "infrared rays",
                optionD = "x-rays",
                correctAnswerIndex = 2,
                explanation = "Thermal radiation consists of electromagnetic waves predominantly in the infrared region of the spectrum.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_19",
                subject = "Physics",
                topic = "Anomalous Expansion & Density",
                year = "2010",
                questionText = "If a container is filled with ice to the brim, what happens to the level of water when the ice completely melts?",
                optionA = "The water in the glass overflows",
                optionB = "The level of water drops",
                optionC = "The level of water remains unchanged",
                optionD = "The level of water goes up",
                correctAnswerIndex = 2,
                explanation = "Floating ice displaces a weight of water equal to its own weight. When melted, the resulting water occupies exactly the volume that the submerged portion previously displaced.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_24",
                subject = "Physics",
                topic = "Waves: Frequency & Period",
                year = "2010",
                questionText = "The wavelength of a wave travelling with a velocity of 420 ms⁻¹ is 42m. What is its period?",
                optionA = "1.0s",
                optionB = "0.1s",
                optionC = "0.5s",
                optionD = "1.2s",
                correctAnswerIndex = 1,
                explanation = "v = fλ => f = v / λ = 420 / 42 = 10 Hz. Period T = 1 / f = 1 / 10 = 0.1 s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_25",
                subject = "Physics",
                topic = "Sound Waves: Propagation",
                year = "2010",
                questionText = "The sound of an electric bell dies down slowly when air is slowly pumped out from a bottle because:",
                optionA = "sound cannot pass through the bottle",
                optionB = "sound can pass through a vacuum",
                optionC = "sound needs a material medium",
                optionD = "the wavelength of sound becomes greater",
                correctAnswerIndex = 2,
                explanation = "Sound is a mechanical longitudinal wave requiring a material medium (solid, liquid, or gas) to propagate, and cannot travel through a vacuum.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_26",
                subject = "Physics",
                topic = "Sound Waves: Reflection",
                year = "2010",
                questionText = "During a thunderstorm, the sound is heard over a prolonged time. This phenomenon is referred to as:",
                optionA = "refraction of sound",
                optionB = "reverberation",
                optionC = "superposition",
                optionD = "diffraction of sound",
                correctAnswerIndex = 1,
                explanation = "Reverberation is the persistence of sound due to multiple reflections from clouds, land surfaces, and hills.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_28",
                subject = "Physics",
                topic = "Optical Instruments: Human Eye vs Camera",
                year = "2010",
                questionText = "In comparing the camera and the human eye, the film of the camera functions as the:",
                optionA = "iris",
                optionB = "pupil",
                optionC = "cornea",
                optionD = "retina",
                correctAnswerIndex = 3,
                explanation = "The photosensitive chemical film in a traditional camera corresponds to the light-sensitive retina of the human eye where real, inverted images are formed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_31",
                subject = "Physics",
                topic = "Optics: Eye Defects",
                year = "2010",
                questionText = "Which of the following is used for the correction of short-sightedness (myopia)?",
                optionA = "Concave lens",
                optionB = "Concave mirror",
                optionC = "Convex mirror",
                optionD = "Convex lens",
                correctAnswerIndex = 0,
                explanation = "A diverging (concave) lens diverges incident light rays before they enter the eye, allowing them to focus accurately on the retina rather than in front of it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_35",
                subject = "Physics",
                topic = "Current Electricity: Ohm's Law",
                year = "2010",
                questionText = "A cell of emf 12V and internal resistance 4Ω is connected to an external resistor of resistance 2Ω. Find the current flow.",
                optionA = "4 A",
                optionB = "2 A",
                optionC = "3 A",
                optionD = "5 A",
                correctAnswerIndex = 1,
                explanation = "Current I = E / (R + r) = 12 / (2 + 4) = 12 / 6 = 2 A.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_48",
                subject = "Physics",
                topic = "Electronics: Semiconductor Devices",
                year = "2010",
                questionText = "Transistors are primarily used for:",
                optionA = "conversion of a.c. to d.c.",
                optionB = "conversion of d.c. to a.c.",
                optionC = "amplification of signals",
                optionD = "rectification of signals",
                correctAnswerIndex = 2,
                explanation = "Transistors are three-terminal semiconductor devices primarily employed as signal amplifiers and electronic switches.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2010_50",
                subject = "Physics",
                topic = "Semiconductors",
                year = "2010",
                questionText = "Which of the following is an intrinsic (pure) semiconductor?",
                optionA = "Silicon",
                optionB = "Phosphorus",
                optionC = "Transistor",
                optionD = "Carbon",
                correctAnswerIndex = 0,
                explanation = "Silicon and Germanium are group IV elements that form tetrahedrally bonded crystalline lattices acting as intrinsic semiconductors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2010 • Q50"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 - 2018 PHYSICS HIGHLIGHTS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "phys_2011_02",
                subject = "Physics",
                topic = "Mechanics: Kinetic Energy",
                year = "2011",
                questionText = "A carpenter on top of a roof 20m high dropped a hammer of mass 1.5kg and it fell freely to the ground. The kinetic energy of the hammer just before hitting the ground is [g = 10 ms⁻²]:",
                optionA = "450 J",
                optionB = "600 J",
                optionC = "150 J",
                optionD = "300 J",
                correctAnswerIndex = 3,
                explanation = "By conservation of mechanical energy: Final K.E. = Initial P.E. = mgh = 1.5 kg × 10 ms⁻² × 20 m = 300 J.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2011_06",
                subject = "Physics",
                topic = "Circular Motion: Centripetal Force",
                year = "2011",
                questionText = "An object of mass 2kg moves with a velocity of 10 ms⁻¹ round a circle of radius 4m. Calculate the centripetal force on the object.",
                optionA = "40 N",
                optionB = "25 N",
                optionC = "100 N",
                optionD = "50 N",
                correctAnswerIndex = 3,
                explanation = "F_c = (m · v²) / r = (2 × 10²) / 4 = (2 × 100) / 4 = 200 / 4 = 50 N.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2011_07",
                subject = "Physics",
                topic = "Equations of Motion",
                year = "2011",
                questionText = "If it takes an object 3s to fall freely to the ground from a certain height, what is the distance covered by the object? [g = 10 ms⁻²]",
                optionA = "60 m",
                optionB = "90 m",
                optionC = "30 m",
                optionD = "45 m",
                correctAnswerIndex = 3,
                explanation = "Starting from rest (u = 0): s = ut + 1/2 gt² = 0 + 1/2(10)(3²) = 5 × 9 = 45 m.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2011_15",
                subject = "Physics",
                topic = "Archimedes' Principle",
                year = "2011",
                questionText = "An object weighs 30kg in air and 22kg in water. What is the upthrust exerted by the liquid on the object? [g = 10 ms⁻²]",
                optionA = "80 N",
                optionB = "50 N",
                optionC = "520 N",
                optionD = "220 N",
                correctAnswerIndex = 0,
                explanation = "Apparent loss in weight = W_air - W_water = (30 kg - 22 kg) × 10 ms⁻² = 8 kg × 10 ms⁻² = 80 N.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2011_21",
                subject = "Physics",
                topic = "Waves: Classification",
                year = "2011",
                questionText = "Which of the following types of waves requires a material medium for propagation?",
                optionA = "X-rays",
                optionB = "Sound waves",
                optionC = "Light waves",
                optionD = "Radio waves",
                correctAnswerIndex = 1,
                explanation = "Sound waves are mechanical waves and require a physical medium to propagate, unlike electromagnetic waves (X-rays, light, radio waves).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2011 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2012_10",
                subject = "Physics",
                topic = "Circular Motion: Angular Velocity",
                year = "2012",
                questionText = "An object moves in a circular path of radius 0.5m with a speed of 1 ms⁻¹. What is its angular velocity?",
                optionA = "8 rad s⁻¹",
                optionB = "4 rad s⁻¹",
                optionC = "2 rad s⁻¹",
                optionD = "1 rad s⁻¹",
                correctAnswerIndex = 2,
                explanation = "v = ωr => ω = v / r = 1 / 0.5 = 2 rad s⁻¹.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2012_41",
                subject = "Physics",
                topic = "Magnetic Fields: Lorentz Force",
                year = "2012",
                questionText = "A particle carrying a charge of 1.0 × 10⁻⁸ C enters a magnetic field at 3.0 × 10² ms⁻¹ at right angles to the field. If the force on this particle is 1.8 × 10⁻⁸ N, what is the magnitude of the field?",
                optionA = "6.0 × 10⁻¹ T",
                optionB = "6.0 × 10⁻² T",
                optionC = "6.0 × 10⁻³ T",
                optionD = "6.0 × 10⁻⁴ T",
                correctAnswerIndex = 2,
                explanation = "F = qvB sin 90° => B = F / (qv) = (1.8 × 10⁻⁸) / (1.0 × 10⁻⁸ × 300) = 1.8 / 300 = 0.006 T = 6.0 × 10⁻³ T.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2012 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2013_02",
                subject = "Physics",
                topic = "Mass vs Gravity",
                year = "2013",
                questionText = "When a brick is taken from the earth's surface to the moon, its mass:",
                optionA = "remains constant",
                optionB = "reduces",
                optionC = "increases",
                optionD = "becomes zero",
                correctAnswerIndex = 0,
                explanation = "Mass is an intrinsic scalar property representing quantity of matter and does not change when moved to another celestial body.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2013_04",
                subject = "Physics",
                topic = "Scalars and Vectors",
                year = "2013",
                questionText = "The pair of physical quantities that are scalar only are:",
                optionA = "volume and area",
                optionB = "moment and momentum",
                optionC = "length and displacement",
                optionD = "impulse and time",
                correctAnswerIndex = 0,
                explanation = "Both volume and area possess magnitude only and no directional property, making them scalar quantities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2013 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2014_05",
                subject = "Physics",
                topic = "Types of Motion",
                year = "2014",
                questionText = "Which type of motion do the wheels of a moving car undergo?",
                optionA = "Vibratory and translational motion",
                optionB = "Random and translational motion",
                optionC = "Rotational and oscillatory motion",
                optionD = "Translational and rotational motion",
                correctAnswerIndex = 3,
                explanation = "As a vehicle travels along a roadway, its wheels rotate about their axles (rotational) and advance along the road (translational).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2014 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2015_06",
                subject = "Physics",
                topic = "Wave Properties: Polarization",
                year = "2015",
                questionText = "Longitudinal waves do not exhibit:",
                optionA = "refraction",
                optionB = "polarization",
                optionC = "diffraction",
                optionD = "reflection",
                correctAnswerIndex = 1,
                explanation = "Polarization is a unique property of transverse waves where vibrations occur in a single plane; longitudinal waves oscillate parallel to propagation and cannot be polarized.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2015_07",
                subject = "Physics",
                topic = "Energy Conversion",
                year = "2015",
                questionText = "A device that converts sound energy into electrical energy is:",
                optionA = "the horn of a motor car",
                optionB = "the telephone earpiece",
                optionC = "a loudspeaker",
                optionD = "a microphone",
                correctAnswerIndex = 3,
                explanation = "A microphone operates as an acoustic transducer that converts incoming sound wave vibrations into electric signals.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2015 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2016_01",
                subject = "Physics",
                topic = "Measurement & Errors",
                year = "2016",
                questionText = "What is the least possible error encountered when taking measurement with a meter rule?",
                optionA = "0.5 mm",
                optionB = "1.0 mm",
                optionC = "0.2 mm",
                optionD = "0.1 mm",
                correctAnswerIndex = 0,
                explanation = "The smallest division of a standard metre rule is 1 mm. The reading uncertainty/least possible error is half of the smallest division = ±0.5 mm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2017_02",
                subject = "Physics",
                topic = "Current Electricity: Commercial Power",
                year = "2017",
                questionText = "Electric distribution companies (PHCN) measure electrical energy consumption in:",
                optionA = "Wh",
                optionB = "kWh",
                optionC = "J",
                optionD = "W",
                correctAnswerIndex = 1,
                explanation = "The commercial unit of electric energy billing used by electricity distribution boards is the kilowatt-hour (kWh), where 1 kWh = 3.6 × 10⁶ J.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "phys_2018_08",
                subject = "Physics",
                topic = "Atomic Physics: Cathode Rays",
                year = "2018",
                questionText = "Cathode rays are:",
                optionA = "High-energy electromagnetic waves",
                optionB = "protons",
                optionC = "neutrons",
                optionD = "streams of electrons",
                correctAnswerIndex = 3,
                explanation = "Cathode rays are streams of fast-moving electrons emitted from the cathode in a discharge tube under high voltage and low pressure.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Q8"
            )
        )

        return list
    }
}
