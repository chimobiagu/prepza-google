package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Official JAMB Physics Historical Examination Series (1983 - 1993).
 * Verified options, calculations, answers and pedagogical explanations.
 */
object JambPhysicsHistorical1983to1993Bank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "phy_1983_01",
                subject = "Physics",
                topic = "Waves and Sound Resonance",
                year = "1983",
                questionText = "In a resonance tube experiment, a tube of fixed length is closed at one end and several tuning forks of increasing frequency are used to obtain resonance at the open end. If the tuning fork with the lowest frequency which gave resonance had a frequency f₁ and the next tuning fork to give resonance had a frequency f₂, find the ratio f₂ / f₁.",
                optionA = "8",
                optionB = "3",
                optionC = "2",
                optionD = "1/2",
                correctAnswerIndex = 1,
                explanation = "For a closed pipe, resonant lengths are odd multiples of quarter wavelengths: L = λ₁/4 => f₁ = v/(4L). The next resonance occurs at L = 3λ₂/4 => f₂ = 3v/(4L). Therefore, the ratio f₂ / f₁ = 3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_02",
                subject = "Physics",
                topic = "Scalar and Vector Quantities",
                year = "1983",
                questionText = "Which of the following is NOT a vector quantity?",
                optionA = "Force",
                optionB = "Altitude",
                optionC = "Weight",
                optionD = "Displacement",
                correctAnswerIndex = 1,
                explanation = "Altitude is a scalar quantity representing vertical height/distance above sea level. Force, weight, displacement, and acceleration are vector quantities possessing both magnitude and direction.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_03",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1983",
                questionText = "A brick at rest on a horizontal table is pulled by a horizontal cord. The force of static friction on the brick:",
                optionA = "Increases if the pull increases while the brick does not move",
                optionB = "Is directly horizontal to the right",
                optionC = "Decreases if an identical brick is placed on the first",
                optionD = "Is zero if the brick is pulled hard enough to make it slide",
                correctAnswerIndex = 0,
                explanation = "Static friction is a self-adjusting force that opposes applied force and equals the applied pull exactly up to the limiting value until motion begins.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_04",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1983",
                questionText = "Which of the following statements about friction is NOT correct?",
                optionA = "The force of kinetic friction is less than the force of static friction",
                optionB = "The force of kinetic friction between two surfaces is independent of the area of contact provided the normal reaction is unchanged",
                optionC = "The force of rolling friction between two surfaces is less than the force of sliding friction",
                optionD = "The angle of friction is the angle between the normal reaction and the resultant of normal reaction and limiting friction",
                correctAnswerIndex = 3,
                explanation = "The angle of friction is the angle which the resultant of the limiting friction and the normal reaction makes with the normal reaction, not with the force of friction itself.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_05",
                subject = "Physics",
                topic = "Gravitation and Planetary Motion",
                year = "1983",
                questionText = "The force with which an object is attracted to the earth is called its:",
                optionA = "Acceleration",
                optionB = "Mass",
                optionC = "Impulse",
                optionD = "Weight",
                correctAnswerIndex = 3,
                explanation = "Weight (W = mg) is the gravitational force exerted by the Earth on an object of mass m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_06",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "1983",
                questionText = "The refractive index of a liquid is 1.5. If the velocity of light in vacuum is 3.0 × 10⁸ m/s, the velocity of light in the liquid is:",
                optionA = "1.5 × 10⁸ m/s",
                optionB = "2.0 × 10⁸ m/s",
                optionC = "3.0 × 10⁸ m/s",
                optionD = "4.5 × 10⁸ m/s",
                correctAnswerIndex = 1,
                explanation = "Refractive index n = c / v => v = c / n = (3.0 × 10⁸ m/s) / 1.5 = 2.0 × 10⁸ m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_07",
                subject = "Physics",
                topic = "Fluid Mechanics and Pressure",
                year = "1983",
                questionText = "If the relative density of a metal is 19, what will be the apparent mass of 20 cm³ of the metal when immersed in water?",
                optionA = "380 g",
                optionB = "400 g",
                optionC = "360 g",
                optionD = "180 g",
                correctAnswerIndex = 2,
                explanation = "Mass of metal in air = density × volume = 19 g/cm³ × 20 cm³ = 380 g. Upthrust (mass of water displaced) = 1 g/cm³ × 20 cm³ = 20 g. Apparent mass in water = 380 g - 20 g = 360 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_08",
                subject = "Physics",
                topic = "Fluid Mechanics and Pressure",
                year = "1983",
                questionText = "Which of the following statements about liquid pressure is NOT correct? The pressure:",
                optionA = "At a point in a liquid is proportional to depth",
                optionB = "At any point in a liquid is the same at the same horizontal level",
                optionC = "Is exerted equally in all directions at any point",
                optionD = "At a particular depth depends on the shape of the vessel",
                correctAnswerIndex = 3,
                explanation = "Liquid hydrostatic pressure P = hρg depends only on depth h, density ρ, and gravity g, and is independent of the cross-sectional shape or volume of the containing vessel (hydrostatic paradox).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_09",
                subject = "Physics",
                topic = "Waves and Sound Resonance",
                year = "1983",
                questionText = "A ship traveling towards a cliff receives the echo of its whistle after 3.5 seconds. A short while later, it receives the echo after 2.5 seconds. If the speed of sound in air under prevailing conditions is 250 m/s, how much closer is the ship to the cliff?",
                optionA = "10 m",
                optionB = "125 m",
                optionC = "175 m",
                optionD = "350 m",
                correctAnswerIndex = 1,
                explanation = "Initial distance d₁ = (v × t₁) / 2 = (250 × 3.5) / 2 = 437.5 m. Later distance d₂ = (v × t₂) / 2 = (250 × 2.5) / 2 = 312.5 m. Difference = 437.5 m - 312.5 m = 125 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_10",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "1983",
                questionText = "Which of the following statements about defects of vision is/are CORRECT?\n I. For a long-sighted person, close objects appear blurred.\n II. For a short-sighted person, distant objects appear blurred.\n III. Short sight is corrected by using a pair of converging lenses.",
                optionA = "I only",
                optionB = "II only",
                optionC = "I and II only",
                optionD = "I, II and III",
                correctAnswerIndex = 2,
                explanation = "Statements I and II are correct. Statement III is false because short sight (myopia) is corrected using diverging (concave) lenses, not converging lenses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_11",
                subject = "Physics",
                topic = "Modern Physics, Radioactivity and Atomic Structure",
                year = "1983",
                questionText = "The range of wavelengths of the visible spectrum is 400 nm – 700 nm. The wavelength of gamma rays is:",
                optionA = "Longer than 700 nm",
                optionB = "Shorter than 700 nm but longer than 400 nm",
                optionC = "550 nm",
                optionD = "Shorter than 400 nm",
                correctAnswerIndex = 3,
                explanation = "Gamma rays possess the highest frequencies and shortest wavelengths in the electromagnetic spectrum (typically < 0.01 nm), which is much shorter than 400 nm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_12",
                subject = "Physics",
                topic = "Thermal Physics and Gas Laws",
                year = "1983",
                questionText = "If the pressure on 1000 cm³ of an ideal gas is doubled while its Kelvin temperature is halved, then the new volume of the gas will become:",
                optionA = "250 cm³",
                optionB = "500 cm³",
                optionC = "100 cm³",
                optionD = "200 cm³",
                correctAnswerIndex = 0,
                explanation = "From general gas law (P₁V₁)/T₁ = (P₂V₂)/T₂ => V₂ = V₁ × (P₁/P₂) × (T₂/T₁) = 1000 × (1/2) × (1/2) = 250 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_13",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1983",
                questionText = "A train has an initial velocity of 44 m/s and an acceleration of -4 m/s². Its velocity after 10 seconds is:",
                optionA = "2 m/s",
                optionB = "4 m/s",
                optionC = "8 m/s",
                optionD = "12 m/s",
                correctAnswerIndex = 1,
                explanation = "v = u + at = 44 + (-4)(10) = 44 - 40 = 4 m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_14",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "1983",
                questionText = "Which of the following conditions are necessary and sufficient for total internal reflection to take place at the boundary between two optical media?\n I. Light is passing from optically denser medium to optically less dense medium.\n II. Light is passing from optically less dense medium to optically denser medium.\n III. Angle of incidence is greater than the critical angle.\n IV. Angle of incidence is lesser than the critical angle.",
                optionA = "I and II only",
                optionB = "II and III only",
                optionC = "I and III only",
                optionD = "II and IV only",
                correctAnswerIndex = 2,
                explanation = "Total internal reflection requires: (1) Light traveling from an optically denser to a less dense medium, and (2) Angle of incidence exceeding the critical angle (I and III).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_15",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1983",
                questionText = "A man of mass 50 kg ascends a flight of stairs 5 m high in 5 seconds. If acceleration due to gravity is 10 m/s², the power expended is:",
                optionA = "100 W",
                optionB = "300 W",
                optionC = "250 W",
                optionD = "500 W",
                correctAnswerIndex = 3,
                explanation = "Power = Work / time = (mgh) / t = (50 × 10 × 5) / 5 = 500 Watts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_16",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "1983",
                questionText = "Which of the following arrangements in the sequence shown can be used to obtain a pure spectrum of white light?",
                optionA = "Source, slit, converging lens, prism, converging lens, screen",
                optionB = "Source, slit, diverging lens, screen",
                optionC = "Source, converging lens, prism, diverging lens, screen",
                optionD = "Source, slit, prism, diverging lens, screen",
                correctAnswerIndex = 0,
                explanation = "A pure spectrum requires a narrow slit at the focal point of a converging lens (collimator) to produce parallel rays, a prism for dispersion, and a second converging lens to focus each monochromatic parallel beam onto a distinct position on the screen.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_17",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "1983",
                questionText = "A 24 V potential difference is applied across a parallel combination of four 6-ohm resistors. The current in each resistor is:",
                optionA = "1 A",
                optionB = "4 A",
                optionC = "16 A",
                optionD = "24 A",
                correctAnswerIndex = 1,
                explanation = "In parallel, each resistor receives the full supply potential difference V = 24 V. Current in each resistor I = V / R = 24 / 6 = 4 A.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_18",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "1983",
                questionText = "A milliammeter with full scale deflection of 100 mA has an internal resistance of 5 ohms. It is converted to an ammeter with a full scale deflection of 1 A by connecting a shunt resistance of:",
                optionA = "5/9 ohm in parallel",
                optionB = "5/99 ohm in series",
                optionC = "5/9 ohm in series",
                optionD = "9/5 ohm in parallel",
                correctAnswerIndex = 0,
                explanation = "Shunt resistance S = (I_g × R_g) / (I - I_g) = (0.1 × 5) / (1.0 - 0.1) = 0.5 / 0.9 = 5/9 Ω in parallel.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_19",
                subject = "Physics",
                topic = "Thermal Physics and Gas Laws",
                year = "1983",
                questionText = "The linear expansivity of brass is 2.0 × 10⁻⁵ °C⁻¹. If the volume of a piece of brass is 100 cm³ at 0 °C, what will be its volume at 100 °C?",
                optionA = "100.2 cm³",
                optionB = "100.4 cm³",
                optionC = "100.6 cm³",
                optionD = "102.0 cm³",
                correctAnswerIndex = 2,
                explanation = "Volume expansivity γ = 3α = 3 × (2.0 × 10⁻⁵) = 6.0 × 10⁻⁵ °C⁻¹. ΔV = V₀γΔT = 100 × (6.0 × 10⁻⁵) × 100 = 0.6 cm³. Final volume = 100 + 0.6 = 100.6 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1983_20",
                subject = "Physics",
                topic = "Electrostatics and Capacitance",
                year = "1983",
                questionText = "The electrochemical equivalent of a metal is 0.126 × 10⁻⁶ kg/C. The mass of the metal that a current of 5 A deposits from a suitable bath in 1 hour is:",
                optionA = "0.0378 × 10⁻³ kg",
                optionB = "0.227 × 10⁻³ kg",
                optionC = "0.378 × 10⁻³ kg",
                optionD = "2.268 × 10⁻³ kg",
                correctAnswerIndex = 3,
                explanation = "Mass m = z × I × t = (0.126 × 10⁻⁶ kg/C) × (5 A) × (3600 s) = 2.268 × 10⁻³ kg.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1983",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_01",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1984",
                questionText = "The distance travelled by a particle starting from rest is plotted against the square of the time elapsed from the commencement of motion. The resulting graph is linear. The slope of this graph is a measure of:",
                optionA = "Initial displacement",
                optionB = "Initial velocity",
                optionC = "Acceleration",
                optionD = "Half the acceleration",
                correctAnswerIndex = 3,
                explanation = "From s = ut + 1/2 at², when u = 0, s = (1/2 a) t². A graph of s against t² has a slope equal to 1/2 a (half the acceleration).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_02",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "1984",
                questionText = "For a concave mirror to form a real diminished image, the object must be placed:",
                optionA = "Behind the mirror",
                optionB = "Between the pole and principal focus",
                optionC = "Between the focus and the center of curvature",
                optionD = "At a distance greater than the radius of curvature",
                correctAnswerIndex = 3,
                explanation = "When an object is placed beyond the centre of curvature (u > 2f = r), a concave mirror forms a real, inverted, and diminished image between F and C.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_03",
                subject = "Physics",
                topic = "Electrostatics and Capacitance",
                year = "1984",
                questionText = "The SI unit quantity of electric charge is called:",
                optionA = "The ampere",
                optionB = "The volt",
                optionC = "The coulomb",
                optionD = "The ohm",
                correctAnswerIndex = 2,
                explanation = "The coulomb (C = A·s) is the standard SI unit of electric charge.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_04",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "1984",
                questionText = "The electrical resistance of a uniform metallic wire depends on:",
                optionA = "Length and cross-sectional area only",
                optionB = "Temperature only",
                optionC = "Material resistivity only",
                optionD = "Length, cross-sectional area, resistivity, and temperature",
                correctAnswerIndex = 3,
                explanation = "Resistance R = ρL/A, which depends on length L, cross-sectional area A, resistivity ρ (material property), and temperature.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_05",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1984",
                questionText = "For which of the following physical quantities is the dimensional formula ML²T⁻² correct?\n I. Moment of a force\n II. Work\n III. Power",
                optionA = "I only",
                optionB = "II only",
                optionC = "I and II only",
                optionD = "I, II and III",
                correctAnswerIndex = 2,
                explanation = "Work = Force × distance = (MLT⁻²)(L) = ML²T⁻². Torque (Moment) = Force × distance = ML²T⁻². Power is ML²T⁻³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_06",
                subject = "Physics",
                topic = "Fluid Mechanics and Pressure",
                year = "1984",
                questionText = "What volume of alcohol with a density of 8.4 × 10² kg/m³ will have the same mass as 4.2 m³ of petrol whose density is 7.2 × 10² kg/m³?",
                optionA = "1.4 m³",
                optionB = "3.6 m³",
                optionC = "4.9 m³",
                optionD = "5.0 m³",
                correctAnswerIndex = 1,
                explanation = "Mass of petrol = ρ₁V₁ = (7.2 × 10²) × 4.2 = 3024 kg. Volume of alcohol V₂ = Mass / ρ₂ = 3024 / (8.4 × 10²) = 3.6 m³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_07",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "1984",
                questionText = "Two cells, each of e.m.f. 1.5 V and internal resistance 2 Ω, are connected in parallel. Calculate the current flowing when the combination is connected to an external 1 Ω resistor.",
                optionA = "0.75 A",
                optionB = "1.5 A",
                optionC = "0.5 A",
                optionD = "0.6 A",
                correctAnswerIndex = 0,
                explanation = "In parallel, equivalent EMF E = 1.5 V, equivalent internal resistance r_eq = 2/2 = 1 Ω. Total resistance R_total = 1 + 1 = 2 Ω. Current I = E / R_total = 1.5 / 2 = 0.75 A.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_08",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "1984",
                questionText = "All the heat generated in a 5 Ω resistor by 2 A flowing for 30 seconds is used to evaporate 5 g of liquid at its boiling point. What is the specific latent heat of vaporization of the liquid?",
                optionA = "60 J/g",
                optionB = "120 J/g",
                optionC = "300 J/g",
                optionD = "1500 J/g",
                correctAnswerIndex = 1,
                explanation = "Electrical energy Q = I²Rt = (2)² × 5 × 30 = 4 × 5 × 30 = 600 J. Latent heat L = Q / m = 600 J / 5 g = 120 J/g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_09",
                subject = "Physics",
                topic = "Waves and Sound Resonance",
                year = "1984",
                questionText = "When stationary vibration occurs in an air column, the distance between a node and an adjacent antinode is equal to:",
                optionA = "One-quarter of the wavelength (λ/4)",
                optionB = "One-half of the wavelength (λ/2)",
                optionC = "The whole wavelength (λ)",
                optionD = "Twice the wavelength (2λ)",
                correctAnswerIndex = 0,
                explanation = "The distance between consecutive nodes is λ/2, and the distance between a consecutive node and antinode is λ/4.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1984_10",
                subject = "Physics",
                topic = "Thermal Physics and Gas Laws",
                year = "1984",
                questionText = "The lower and upper fixed points on a mercury-in-glass thermometer are 210 mm apart. The mercury column stands at 49 mm above the lower fixed point. What is the temperature in degrees Celsius?",
                optionA = "55.3 °C",
                optionB = "23.3 °C",
                optionC = "49.0 °C",
                optionD = "16.1 °C",
                correctAnswerIndex = 1,
                explanation = "T = (l_T - l_0) / (l_100 - l_0) × 100°C = (49 / 210) × 100°C = 23.33 °C.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1984",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1985_01",
                subject = "Physics",
                topic = "Simple Harmonic Motion and Elasticity",
                year = "1985",
                questionText = "A simple pendulum with a period of 2.0 s has its length doubled. What is its new period?",
                optionA = "1.00 s",
                optionB = "1.41 s",
                optionC = "2.83 s",
                optionD = "4.00 s",
                correctAnswerIndex = 2,
                explanation = "T = 2π√(L/g). When length is doubled (L' = 2L), T' = T × √2 = 2.0 × 1.414 = 2.83 s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1985",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1985_02",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1985",
                questionText = "A metal block of mass 5 kg lies on a rough horizontal platform. If a horizontal force of 8 N applied to the block just slides it on the platform, what is the coefficient of limiting friction? (g = 10 m/s²)",
                optionA = "0.16",
                optionB = "0.63",
                optionC = "0.80",
                optionD = "1.60",
                correctAnswerIndex = 0,
                explanation = "Normal reaction R = mg = 5 × 10 = 50 N. Coefficient of friction μ = F / R = 8 / 50 = 0.16.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1985",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1985_03",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1985",
                questionText = "If a car starts from rest and moves with a uniform acceleration of 10 m/s² for 10 seconds, the distance it covers in the last one second (the 10th second) of motion is:",
                optionA = "95 m",
                optionB = "100 m",
                optionC = "500 m",
                optionD = "905 m",
                correctAnswerIndex = 0,
                explanation = "Distance in nth second: s_n = u + 1/2 a(2n - 1) = 0 + 1/2 (10)(2 × 10 - 1) = 5 × 19 = 95 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1985",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1985_04",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1985",
                questionText = "A block of mass 2.0 kg resting on a smooth horizontal plane is acted upon simultaneously by two forces: 10 N due North and 10 N due East. The magnitude of the acceleration produced is:",
                optionA = "0.10 m/s²",
                optionB = "7.07 m/s²",
                optionC = "10.00 m/s²",
                optionD = "14.14 m/s²",
                correctAnswerIndex = 1,
                explanation = "Resultant force F_net = √(10² + 10²) = √200 = 14.14 N. Acceleration a = F_net / m = 14.14 / 2.0 = 7.07 m/s².",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1985",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1985_05",
                subject = "Physics",
                topic = "Fluid Mechanics and Pressure",
                year = "1985",
                questionText = "Two divers G and H are at depths 20 m and 40 m respectively below the water surface in a lake. If atmospheric pressure is equivalent to 10 m of water, then the ratio of absolute pressure on H to that on G (P_H / P_G) is:",
                optionA = "0.50",
                optionB = "1.67",
                optionC = "2.00",
                optionD = "3.00",
                correctAnswerIndex = 1,
                explanation = "P_G = 10 m + 20 m = 30 m of water. P_H = 10 m + 40 m = 50 m of water. Ratio P_H / P_G = 50 / 30 = 1.67.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1985",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1986_01",
                subject = "Physics",
                topic = "Optics, Refraction and Lenses",
                year = "1986",
                questionText = "If the refractive index of glass is 1.5, what is the critical angle at the air-glass interface?",
                optionA = "sin⁻¹(1/2)",
                optionB = "sin⁻¹(2/3)",
                optionC = "sin⁻¹(3/4)",
                optionD = "sin⁻¹(8/9)",
                correctAnswerIndex = 1,
                explanation = "sin C = 1 / n = 1 / 1.5 = 2/3 => C = sin⁻¹(2/3) ≈ 41.8°.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1986",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1986_02",
                subject = "Physics",
                topic = "Current Electricity and Resistance",
                year = "1986",
                questionText = "A transformer has a primary coil with 500 turns and secondary coil with 2500 turns. When an alternating voltage input of 120 V is applied to the primary coil, the secondary output voltage is:",
                optionA = "24 V",
                optionB = "60 V",
                optionC = "240 V",
                optionD = "600 V",
                correctAnswerIndex = 3,
                explanation = "V_s / V_p = N_s / N_p => V_s = 120 × (2500 / 500) = 120 × 5 = 600 V.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1986",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1986_03",
                subject = "Physics",
                topic = "Modern Physics, Radioactivity and Atomic Structure",
                year = "1986",
                questionText = "What is the number of neutrons in the Uranium isotope ²³⁸₉₂U?",
                optionA = "92",
                optionB = "146",
                optionC = "238",
                optionD = "330",
                correctAnswerIndex = 1,
                explanation = "Neutron number N = Mass Number A - Atomic Number Z = 238 - 92 = 146.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1986",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1987_01",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1987",
                questionText = "Which of the following units is equivalent to kg·m/s (unit of momentum)?",
                optionA = "N/s",
                optionB = "N·m·s",
                optionC = "N·s",
                optionD = "J/s",
                correctAnswerIndex = 2,
                explanation = "1 Newton = 1 kg·m/s². Therefore, 1 N·s = (1 kg·m/s²)(s) = 1 kg·m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1987",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1987_02",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1987",
                questionText = "A man walks 8 km North and then 5 km in a direction 60° East of North. Find his resultant displacement from the starting point.",
                optionA = "11.36 km",
                optionB = "12.36 km",
                optionC = "13.00 km",
                optionD = "14.36 km",
                correctAnswerIndex = 0,
                explanation = "Using cosine rule: R = √(8² + 5² - 2(8)(5) cos 120°) = √(64 + 25 - 80(-0.5)) = √(89 + 40) = √129 ≈ 11.36 km.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1987",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1987_03",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1987",
                questionText = "A body rolls down a slope from a height of 100 m. If its velocity at the foot of the slope is 20 m/s, what percentage of its initial potential energy is converted into kinetic energy? (g = 10 m/s²)",
                optionA = "15%",
                optionB = "20%",
                optionC = "35%",
                optionD = "40%",
                correctAnswerIndex = 1,
                explanation = "Initial PE per unit mass = gh = 10 × 100 = 1000 J/kg. Final KE per unit mass = 1/2 v² = 1/2 (20)² = 200 J/kg. Percentage = (200 / 1000) × 100% = 20%.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1987",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1987_04",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1987",
                questionText = "A constant force of 40 N acting on a body initially at rest gives it an acceleration of 0.1 m/s² for 4 s. Calculate the work done by the force.",
                optionA = "8 J",
                optionB = "16 J",
                optionC = "32 J",
                optionD = "160 J",
                correctAnswerIndex = 2,
                explanation = "Distance s = ut + 1/2 at² = 0 + 1/2 (0.1)(4)² = 0.8 m. Work done = F × s = 40 N × 0.8 m = 32 Joules.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1987",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1988_01",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1988",
                questionText = "A particle starts from rest and moves with a constant acceleration of 0.5 m/s². The distance covered by the particle in 10 s is:",
                optionA = "2.5 m",
                optionB = "5.0 m",
                optionC = "25.0 m",
                optionD = "50.0 m",
                correctAnswerIndex = 2,
                explanation = "s = ut + 1/2 at² = 0 + 1/2 (0.5)(10)² = 0.25 × 100 = 25.0 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1988",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1988_02",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1988",
                questionText = "When taking a penalty kick, a footballer applies a force of 30.0 N for a period of 0.05 s. If the mass of the ball is 0.075 kg, calculate the speed with which the ball moves off.",
                optionA = "4.50 m/s",
                optionB = "11.25 m/s",
                optionC = "20.00 m/s",
                optionD = "45.00 m/s",
                correctAnswerIndex = 2,
                explanation = "Impulse = FΔt = mΔv => 30.0 × 0.05 = 0.075 × v => 1.5 = 0.075 v => v = 20.0 m/s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1988",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1988_03",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1988",
                questionText = "A lorry travels 10 km Northwards, 4 km Eastwards, 6 km Southwards and 4 km Westwards. What is the net displacement?",
                optionA = "4 km North",
                optionB = "6 km South",
                optionC = "6 km North",
                optionD = "4 km East",
                correctAnswerIndex = 0,
                explanation = "East-West net: 4 km East - 4 km West = 0. North-South net: 10 km North - 6 km South = 4 km North.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1988",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1988_04",
                subject = "Physics",
                topic = "Thermal Physics and Gas Laws",
                year = "1988",
                questionText = "A tap supplies water at 25 °C while another supplies water at 75 °C. If a person wishes to prepare water at 40 °C, the ratio of the mass of cold water to the mass of hot water required is:",
                optionA = "1 : 3",
                optionB = "7 : 3",
                optionC = "3 : 1",
                optionD = "15 : 8",
                correctAnswerIndex = 1,
                explanation = "Heat lost by hot water = Heat gained by cold water => m_h × c × (75 - 40) = m_c × c × (40 - 25) => 35 m_h = 15 m_c => m_c / m_h = 35 / 15 = 7 / 3 (7 : 3).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1988",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1989_01",
                subject = "Physics",
                topic = "Dynamics, Force and Friction",
                year = "1989",
                questionText = "The magnitude of the resultant of two mutually perpendicular forces F₁ and F₂ is 13 N. If the magnitude of F₁ is 5 N, what is the magnitude of F₂?",
                optionA = "2.6 N",
                optionB = "8.0 N",
                optionC = "12.0 N",
                optionD = "18.0 N",
                correctAnswerIndex = 2,
                explanation = "R = √(F₁² + F₂²) => 13² = 5² + F₂² => 169 = 25 + F₂² => F₂² = 144 => F₂ = 12 N.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1989",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1989_02",
                subject = "Physics",
                topic = "Waves and Sound Resonance",
                year = "1989",
                questionText = "In a sound wave in air, adjacent rarefactions and compressions are separated by a distance of 17 cm. If the velocity of sound in air is 340 m/s, determine the frequency of the sound wave.",
                optionA = "10 Hz",
                optionB = "20 Hz",
                optionC = "1000 Hz",
                optionD = "2000 Hz",
                correctAnswerIndex = 2,
                explanation = "Distance between adjacent compression and rarefaction = λ / 2 = 0.17 m => λ = 0.34 m. Frequency f = v / λ = 340 / 0.34 = 1000 Hz.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1989",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1990_01",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1990",
                questionText = "A car moving with a speed of 90 km/h is brought uniformly to rest by the application of brakes in 10 s. How far does the car travel after the brakes are applied?",
                optionA = "125 m",
                optionB = "150 m",
                optionC = "250 m",
                optionD = "900 m",
                correctAnswerIndex = 0,
                explanation = "Initial speed u = 90 km/h = 90 × (5/18) = 25 m/s. Final speed v = 0, t = 10 s. Distance s = ((u + v) / 2) × t = (25 / 2) × 10 = 125 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1990",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1991_01",
                subject = "Physics",
                topic = "Linear Kinematics and Motion",
                year = "1991",
                questionText = "A small metal ball is thrown vertically upwards from the top of a tower with an initial velocity of 20 m/s. If the ball took a total of 6 s to reach ground level, determine the height of the tower. (g = 10 m/s²)",
                optionA = "60 m",
                optionB = "80 m",
                optionC = "100 m",
                optionD = "120 m",
                correctAnswerIndex = 0,
                explanation = "Taking upward as positive: s = ut - 1/2 gt² = (20)(6) - 1/2 (10)(6)² = 120 - 180 = -60 m. Thus, height of tower = 60 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1991",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1992_01",
                subject = "Physics",
                topic = "Simple Harmonic Motion and Elasticity",
                year = "1992",
                questionText = "Which of the following factors affects the period of a simple pendulum?\n I. Mass of the pendulum bob\n II. Length of the pendulum\n III. Acceleration due to gravity",
                optionA = "I, II and III",
                optionB = "II and III only",
                optionC = "I and III only",
                optionD = "I and II only",
                correctAnswerIndex = 1,
                explanation = "Period of a simple pendulum T = 2π√(L/g). It depends solely on length L and acceleration due to gravity g, independent of the mass of the bob.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1992",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_1993_01",
                subject = "Physics",
                topic = "Work, Energy and Power",
                year = "1993",
                questionText = "Which of the following quantities has the same SI unit as the watt (W)?",
                optionA = "Force × time",
                optionB = "Force × distance",
                optionC = "Force × acceleration",
                optionD = "Force × velocity",
                correctAnswerIndex = 3,
                explanation = "Power = Work / time = (Force × distance) / time = Force × (distance / time) = Force × velocity (N·m/s = J/s = Watt).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • 1993",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
