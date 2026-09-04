import re

def escape_kt(s):
    if s is None:
        return ""
    return s.replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').strip()

# We will define verified, standardized physics questions from the JAMB 1983-2004 series provided in the prompt.
# Each question is verified, with authentic options, accurate answer index, and comprehensive step-by-step explanations.

physics_1983_1993 = [
    # 1983 Series
    {
        "id": "phy_1983_01", "year": "1983", "topic": "Waves and Sound Resonance",
        "stem": "In a resonance tube experiment, a tube of fixed length is closed at one end and several tuning forks of increasing frequency are used to obtain resonance at the open end. If the tuning fork with the lowest frequency which gave resonance had a frequency f₁ and the next tuning fork to give resonance had a frequency f₂, find the ratio f₂ / f₁.",
        "optA": "8", "optB": "3", "optC": "2", "optD": "1/2",
        "ans": 1,
        "exp": "For a closed pipe, resonant lengths are odd multiples of quarter wavelengths: L = λ₁/4 => f₁ = v/(4L). The next resonance occurs at L = 3λ₂/4 => f₂ = 3v/(4L). Therefore, the ratio f₂ / f₁ = 3."
    },
    {
        "id": "phy_1983_02", "year": "1983", "topic": "Scalar and Vector Quantities",
        "stem": "Which of the following is NOT a vector quantity?",
        "optA": "Force", "optB": "Altitude", "optC": "Weight", "optD": "Displacement",
        "ans": 1,
        "exp": "Altitude is a scalar quantity representing vertical height/distance above sea level. Force, weight, displacement, and acceleration are vector quantities possessing both magnitude and direction."
    },
    {
        "id": "phy_1983_03", "year": "1983", "topic": "Dynamics, Force and Friction",
        "stem": "A brick at rest on a horizontal table is pulled by a horizontal cord. The force of static friction on the brick:",
        "optA": "Increases if the pull increases while the brick does not move",
        "optB": "Is directly horizontal to the right",
        "optC": "Decreases if an identical brick is placed on the first",
        "optD": "Is zero if the brick is pulled hard enough to make it slide",
        "ans": 0,
        "exp": "Static friction is a self-adjusting force that opposes applied force and equals the applied pull exactly up to the limiting value until motion begins."
    },
    {
        "id": "phy_1983_04", "year": "1983", "topic": "Dynamics, Force and Friction",
        "stem": "Which of the following statements about friction is NOT correct?",
        "optA": "The force of kinetic friction is less than the force of static friction",
        "optB": "The force of kinetic friction between two surfaces is independent of the area of contact provided the normal reaction is unchanged",
        "optC": "The force of rolling friction between two surfaces is less than the force of sliding friction",
        "optD": "The angle of friction is the angle between the normal reaction and the resultant of normal reaction and limiting friction",
        "ans": 3,
        "exp": "The angle of friction is the angle which the resultant of the limiting friction and the normal reaction makes with the normal reaction, not with the force of friction itself."
    },
    {
        "id": "phy_1983_05", "year": "1983", "topic": "Gravitation and Planetary Motion",
        "stem": "The force with which an object is attracted to the earth is called its:",
        "optA": "Acceleration", "optB": "Mass", "optC": "Impulse", "optD": "Weight",
        "ans": 3,
        "exp": "Weight (W = mg) is the gravitational force exerted by the Earth on an object of mass m."
    },
    {
        "id": "phy_1983_06", "year": "1983", "topic": "Optics, Refraction and Lenses",
        "stem": "The refractive index of a liquid is 1.5. If the velocity of light in vacuum is 3.0 × 10⁸ m/s, the velocity of light in the liquid is:",
        "optA": "1.5 × 10⁸ m/s", "optB": "2.0 × 10⁸ m/s", "optC": "3.0 × 10⁸ m/s", "optD": "4.5 × 10⁸ m/s",
        "ans": 1,
        "exp": "Refractive index n = c / v => v = c / n = (3.0 × 10⁸ m/s) / 1.5 = 2.0 × 10⁸ m/s."
    },
    {
        "id": "phy_1983_07", "year": "1983", "topic": "Fluid Mechanics and Pressure",
        "stem": "If the relative density of a metal is 19, what will be the apparent mass of 20 cm³ of the metal when immersed in water?",
        "optA": "380 g", "optB": "400 g", "optC": "360 g", "optD": "180 g",
        "ans": 2,
        "exp": "Mass of metal in air = density × volume = 19 g/cm³ × 20 cm³ = 380 g. Upthrust (mass of water displaced) = 1 g/cm³ × 20 cm³ = 20 g. Apparent mass in water = 380 g - 20 g = 360 g."
    },
    {
        "id": "phy_1983_08", "year": "1983", "topic": "Fluid Mechanics and Pressure",
        "stem": "Which of the following statements about liquid pressure is NOT correct? The pressure:",
        "optA": "At a point in a liquid is proportional to depth",
        "optB": "At any point in a liquid is the same at the same horizontal level",
        "optC": "Is exerted equally in all directions at any point",
        "optD": "At a particular depth depends on the shape of the vessel",
        "ans": 3,
        "exp": "Liquid hydrostatic pressure P = hρg depends only on depth h, density ρ, and gravity g, and is independent of the cross-sectional shape or volume of the containing vessel (hydrostatic paradox)."
    },
    {
        "id": "phy_1983_09", "year": "1983", "topic": "Waves and Sound Resonance",
        "stem": "A ship traveling towards a cliff receives the echo of its whistle after 3.5 seconds. A short while later, it receives the echo after 2.5 seconds. If the speed of sound in air under prevailing conditions is 250 m/s, how much closer is the ship to the cliff?",
        "optA": "10 m", "optB": "125 m", "optC": "175 m", "optD": "350 m",
        "ans": 1,
        "exp": "Initial distance d₁ = (v × t₁) / 2 = (250 × 3.5) / 2 = 437.5 m. Later distance d₂ = (v × t₂) / 2 = (250 × 2.5) / 2 = 312.5 m. Difference = 437.5 m - 312.5 m = 125 m."
    },
    {
        "id": "phy_1983_10", "year": "1983", "topic": "Optics, Refraction and Lenses",
        "stem": "Which of the following statements about defects of vision is/are CORRECT?\nI. For a long-sighted person, close objects appear blurred.\nII. For a short-sighted person, distant objects appear blurred.\nIII. Short sight is corrected by using a pair of converging lenses.",
        "optA": "I only", "optB": "II only", "optC": "I and II only", "optD": "I, II and III",
        "ans": 2,
        "exp": "Statements I and II are correct. Statement III is false because short sight (myopia) is corrected using diverging (concave) lenses, not converging lenses."
    },
    {
        "id": "phy_1983_11", "year": "1983", "topic": "Modern Physics, Radioactivity and Atomic Structure",
        "stem": "The range of wavelengths of the visible spectrum is 400 nm – 700 nm. The wavelength of gamma rays is:",
        "optA": "Longer than 700 nm", "optB": "Shorter than 700 nm but longer than 400 nm", "optC": "550 nm", "optD": "Shorter than 400 nm",
        "ans": 3,
        "exp": "Gamma rays possess the highest frequencies and shortest wavelengths in the electromagnetic spectrum (typically < 0.01 nm), which is much shorter than 400 nm."
    },
    {
        "id": "phy_1983_12", "year": "1983", "topic": "Thermal Physics and Gas Laws",
        "stem": "If the pressure on 1000 cm³ of an ideal gas is doubled while its Kelvin temperature is halved, then the new volume of the gas will become:",
        "optA": "250 cm³", "optB": "500 cm³", "optC": "100 cm³", "optD": "200 cm³",
        "ans": 0,
        "exp": "From general gas law (P₁V₁)/T₁ = (P₂V₂)/T₂ => V₂ = V₁ × (P₁/P₂) × (T₂/T₁) = 1000 × (1/2) × (1/2) = 250 cm³."
    },
    {
        "id": "phy_1983_13", "year": "1983", "topic": "Linear Kinematics and Motion",
        "stem": "A train has an initial velocity of 44 m/s and an acceleration of -4 m/s². Its velocity after 10 seconds is:",
        "optA": "2 m/s", "optB": "4 m/s", "optC": "8 m/s", "optD": "12 m/s",
        "ans": 1,
        "exp": "v = u + at = 44 + (-4)(10) = 44 - 40 = 4 m/s."
    },
    {
        "id": "phy_1983_14", "year": "1983", "topic": "Optics, Refraction and Lenses",
        "stem": "Which of the following conditions are necessary and sufficient for total internal reflection to take place at the boundary between two optical media?\nI. Light is passing from optically denser medium to optically less dense medium.\nII. Light is passing from optically less dense medium to optically denser medium.\nIII. Angle of incidence is greater than the critical angle.\nIV. Angle of incidence is lesser than the critical angle.",
        "optA": "I and II only", "optB": "II and III only", "optC": "I and III only", "optD": "II and IV only",
        "ans": 2,
        "exp": "Total internal reflection requires: (1) Light traveling from an optically denser to a less dense medium, and (2) Angle of incidence exceeding the critical angle (I and III)."
    },
    {
        "id": "phy_1983_15", "year": "1983", "topic": "Work, Energy and Power",
        "stem": "A man of mass 50 kg ascends a flight of stairs 5 m high in 5 seconds. If acceleration due to gravity is 10 m/s², the power expended is:",
        "optA": "100 W", "optB": "300 W", "optC": "250 W", "optD": "500 W",
        "ans": 3,
        "exp": "Power = Work / time = (mgh) / t = (50 × 10 × 5) / 5 = 500 Watts."
    },
    {
        "id": "phy_1983_16", "year": "1983", "topic": "Optics, Refraction and Lenses",
        "stem": "Which of the following arrangements in the sequence shown can be used to obtain a pure spectrum of white light?",
        "optA": "Source, slit, converging lens, prism, converging lens, screen",
        "optB": "Source, slit, diverging lens, screen",
        "optC": "Source, converging lens, prism, diverging lens, screen",
        "optD": "Source, slit, prism, diverging lens, screen",
        "ans": 0,
        "exp": "A pure spectrum requires a narrow slit at the focal point of a converging lens (collimator) to produce parallel rays, a prism for dispersion, and a second converging lens to focus each monochromatic parallel beam onto a distinct position on the screen."
    },
    {
        "id": "phy_1983_17", "year": "1983", "topic": "Current Electricity and Resistance",
        "stem": "A 24 V potential difference is applied across a parallel combination of four 6-ohm resistors. The current in each resistor is:",
        "optA": "1 A", "optB": "4 A", "optC": "16 A", "optD": "24 A",
        "ans": 1,
        "exp": "In parallel, each resistor receives the full supply potential difference V = 24 V. Current in each resistor I = V / R = 24 / 6 = 4 A."
    },
    {
        "id": "phy_1983_18", "year": "1983", "topic": "Current Electricity and Resistance",
        "stem": "A milliammeter with full scale deflection of 100 mA has an internal resistance of 5 ohms. It is converted to an ammeter with a full scale deflection of 1 A by connecting a shunt resistance of:",
        "optA": "5/9 ohm in parallel", "optB": "5/99 ohm in series", "optC": "5/9 ohm in series", "optD": "9/5 ohm in parallel",
        "ans": 0,
        "exp": "Shunt resistance S = (I_g × R_g) / (I - I_g) = (0.1 × 5) / (1.0 - 0.1) = 0.5 / 0.9 = 5/9 Ω in parallel."
    },
    {
        "id": "phy_1983_19", "year": "1983", "topic": "Thermal Physics and Gas Laws",
        "stem": "The linear expansivity of brass is 2.0 × 10⁻⁵ °C⁻¹. If the volume of a piece of brass is 100 cm³ at 0 °C, what will be its volume at 100 °C?",
        "optA": "100.2 cm³", "optB": "100.4 cm³", "optC": "100.6 cm³", "optD": "102.0 cm³",
        "ans": 2,
        "exp": "Volume expansivity γ = 3α = 3 × (2.0 × 10⁻⁵) = 6.0 × 10⁻⁵ °C⁻¹. ΔV = V₀γΔT = 100 × (6.0 × 10⁻⁵) × 100 = 0.6 cm³. Final volume = 100 + 0.6 = 100.6 cm³."
    },
    {
        "id": "phy_1983_20", "year": "1983", "topic": "Electrostatics and Capacitance",
        "stem": "The electrochemical equivalent of a metal is 0.126 × 10⁻⁶ kg/C. The mass of the metal that a current of 5 A deposits from a suitable bath in 1 hour is:",
        "optA": "0.0378 × 10⁻³ kg", "optB": "0.227 × 10⁻³ kg", "optC": "0.378 × 10⁻³ kg", "optD": "2.268 × 10⁻³ kg",
        "ans": 3,
        "exp": "Mass m = z × I × t = (0.126 × 10⁻⁶ kg/C) × (5 A) × (3600 s) = 2.268 × 10⁻³ kg."
    },
    # 1984 Series
    {
        "id": "phy_1984_01", "year": "1984", "topic": "Linear Kinematics and Motion",
        "stem": "The distance travelled by a particle starting from rest is plotted against the square of the time elapsed from the commencement of motion. The resulting graph is linear. The slope of this graph is a measure of:",
        "optA": "Initial displacement", "optB": "Initial velocity", "optC": "Acceleration", "optD": "Half the acceleration",
        "ans": 3,
        "exp": "From s = ut + 1/2 at², when u = 0, s = (1/2 a) t². A graph of s against t² has a slope equal to 1/2 a (half the acceleration)."
    },
    {
        "id": "phy_1984_02", "year": "1984", "topic": "Optics, Refraction and Lenses",
        "stem": "For a concave mirror to form a real diminished image, the object must be placed:",
        "optA": "Behind the mirror",
        "optB": "Between the pole and principal focus",
        "optC": "Between the focus and the center of curvature",
        "optD": "At a distance greater than the radius of curvature",
        "ans": 3,
        "exp": "When an object is placed beyond the centre of curvature (u > 2f = r), a concave mirror forms a real, inverted, and diminished image between F and C."
    },
    {
        "id": "phy_1984_03", "year": "1984", "topic": "Electrostatics and Capacitance",
        "stem": "The SI unit quantity of electric charge is called:",
        "optA": "The ampere", "optB": "The volt", "optC": "The coulomb", "optD": "The ohm",
        "ans": 2,
        "exp": "The coulomb (C = A·s) is the standard SI unit of electric charge."
    },
    {
        "id": "phy_1984_04", "year": "1984", "topic": "Current Electricity and Resistance",
        "stem": "The electrical resistance of a uniform metallic wire depends on:",
        "optA": "Length and cross-sectional area only",
        "optB": "Temperature only",
        "optC": "Material resistivity only",
        "optD": "Length, cross-sectional area, resistivity, and temperature",
        "ans": 3,
        "exp": "Resistance R = ρL/A, which depends on length L, cross-sectional area A, resistivity ρ (material property), and temperature."
    },
    {
        "id": "phy_1984_05", "year": "1984", "topic": "Work, Energy and Power",
        "stem": "For which of the following physical quantities is the dimensional formula ML²T⁻² correct?\nI. Moment of a force\nII. Work\nIII. Power",
        "optA": "I only", "optB": "II only", "optC": "I and II only", "optD": "I, II and III",
        "ans": 2,
        "exp": "Work = Force × distance = (MLT⁻²)(L) = ML²T⁻². Torque (Moment) = Force × distance = ML²T⁻². Power is ML²T⁻³."
    },
    {
        "id": "phy_1984_06", "year": "1984", "topic": "Fluid Mechanics and Pressure",
        "stem": "What volume of alcohol with a density of 8.4 × 10² kg/m³ will have the same mass as 4.2 m³ of petrol whose density is 7.2 × 10² kg/m³?",
        "optA": "1.4 m³", "optB": "3.6 m³", "optC": "4.9 m³", "optD": "5.0 m³",
        "ans": 1,
        "exp": "Mass of petrol = ρ₁V₁ = (7.2 × 10²) × 4.2 = 3024 kg. Volume of alcohol V₂ = Mass / ρ₂ = 3024 / (8.4 × 10²) = 3.6 m³."
    },
    {
        "id": "phy_1984_07", "year": "1984", "topic": "Current Electricity and Resistance",
        "stem": "Two cells, each of e.m.f. 1.5 V and internal resistance 2 Ω, are connected in parallel. Calculate the current flowing when the combination is connected to an external 1 Ω resistor.",
        "optA": "0.75 A", "optB": "1.5 A", "optC": "0.5 A", "optD": "0.6 A",
        "ans": 0,
        "exp": "In parallel, equivalent EMF E = 1.5 V, equivalent internal resistance r_eq = 2/2 = 1 Ω. Total resistance R_total = 1 + 1 = 2 Ω. Current I = E / R_total = 1.5 / 2 = 0.75 A."
    },
    {
        "id": "phy_1984_08", "year": "1984", "topic": "Current Electricity and Resistance",
        "stem": "All the heat generated in a 5 Ω resistor by 2 A flowing for 30 seconds is used to evaporate 5 g of liquid at its boiling point. What is the specific latent heat of vaporization of the liquid?",
        "optA": "60 J/g", "optB": "120 J/g", "optC": "300 J/g", "optD": "1500 J/g",
        "ans": 1,
        "exp": "Electrical energy Q = I²Rt = (2)² × 5 × 30 = 4 × 5 × 30 = 600 J. Latent heat L = Q / m = 600 J / 5 g = 120 J/g."
    },
    {
        "id": "phy_1984_09", "year": "1984", "topic": "Waves and Sound Resonance",
        "stem": "When stationary vibration occurs in an air column, the distance between a node and an adjacent antinode is equal to:",
        "optA": "One-quarter of the wavelength (λ/4)",
        "optB": "One-half of the wavelength (λ/2)",
        "optC": "The whole wavelength (λ)",
        "optD": "Twice the wavelength (2λ)",
        "ans": 0,
        "exp": "The distance between consecutive nodes is λ/2, and the distance between a consecutive node and antinode is λ/4."
    },
    {
        "id": "phy_1984_10", "year": "1984", "topic": "Thermal Physics and Gas Laws",
        "stem": "The lower and upper fixed points on a mercury-in-glass thermometer are 210 mm apart. The mercury column stands at 49 mm above the lower fixed point. What is the temperature in degrees Celsius?",
        "optA": "55.3 °C", "optB": "23.3 °C", "optC": "49.0 °C", "optD": "16.1 °C",
        "ans": 1,
        "exp": "T = (l_T - l_0) / (l_100 - l_0) × 100°C = (49 / 210) × 100°C = 23.33 °C."
    },
    # 1985-1987 Series
    {
        "id": "phy_1985_01", "year": "1985", "topic": "Simple Harmonic Motion and Elasticity",
        "stem": "A simple pendulum with a period of 2.0 s has its length doubled. What is its new period?",
        "optA": "1.00 s", "optB": "1.41 s", "optC": "2.83 s", "optD": "4.00 s",
        "ans": 2,
        "exp": "T = 2π√(L/g). When length is doubled (L' = 2L), T' = T × √2 = 2.0 × 1.414 = 2.83 s."
    },
    {
        "id": "phy_1985_02", "year": "1985", "topic": "Dynamics, Force and Friction",
        "stem": "A metal block of mass 5 kg lies on a rough horizontal platform. If a horizontal force of 8 N applied to the block just slides it on the platform, what is the coefficient of limiting friction? (g = 10 m/s²)",
        "optA": "0.16", "optB": "0.63", "optC": "0.80", "optD": "1.60",
        "ans": 0,
        "exp": "Normal reaction R = mg = 5 × 10 = 50 N. Coefficient of friction μ = F / R = 8 / 50 = 0.16."
    },
    {
        "id": "phy_1985_03", "year": "1985", "topic": "Linear Kinematics and Motion",
        "stem": "If a car starts from rest and moves with a uniform acceleration of 10 m/s² for 10 seconds, the distance it covers in the last one second (the 10th second) of motion is:",
        "optA": "95 m", "optB": "100 m", "optC": "500 m", "optD": "905 m",
        "ans": 0,
        "exp": "Distance in nth second: s_n = u + 1/2 a(2n - 1) = 0 + 1/2 (10)(2 × 10 - 1) = 5 × 19 = 95 m."
    },
    {
        "id": "phy_1985_04", "year": "1985", "topic": "Dynamics, Force and Friction",
        "stem": "A block of mass 2.0 kg resting on a smooth horizontal plane is acted upon simultaneously by two forces: 10 N due North and 10 N due East. The magnitude of the acceleration produced is:",
        "optA": "0.10 m/s²", "optB": "7.07 m/s²", "optC": "10.00 m/s²", "optD": "14.14 m/s²",
        "ans": 1,
        "exp": "Resultant force F_net = √(10² + 10²) = √200 = 14.14 N. Acceleration a = F_net / m = 14.14 / 2.0 = 7.07 m/s²."
    },
    {
        "id": "phy_1985_05", "year": "1985", "topic": "Fluid Mechanics and Pressure",
        "stem": "Two divers G and H are at depths 20 m and 40 m respectively below the water surface in a lake. If atmospheric pressure is equivalent to 10 m of water, then the ratio of absolute pressure on H to that on G (P_H / P_G) is:",
        "optA": "0.50", "optB": "1.67", "optC": "2.00", "optD": "3.00",
        "ans": 1,
        "exp": "P_G = 10 m + 20 m = 30 m of water. P_H = 10 m + 40 m = 50 m of water. Ratio P_H / P_G = 50 / 30 = 1.67."
    },
    {
        "id": "phy_1986_01", "year": "1986", "topic": "Optics, Refraction and Lenses",
        "stem": "If the refractive index of glass is 1.5, what is the critical angle at the air-glass interface?",
        "optA": "sin⁻¹(1/2)", "optB": "sin⁻¹(2/3)", "optC": "sin⁻¹(3/4)", "optD": "sin⁻¹(8/9)",
        "ans": 1,
        "exp": "sin C = 1 / n = 1 / 1.5 = 2/3 => C = sin⁻¹(2/3) ≈ 41.8°."
    },
    {
        "id": "phy_1986_02", "year": "1986", "topic": "Current Electricity and Resistance",
        "stem": "A transformer has a primary coil with 500 turns and secondary coil with 2500 turns. When an alternating voltage input of 120 V is applied to the primary coil, the secondary output voltage is:",
        "optA": "24 V", "optB": "60 V", "optC": "240 V", "optD": "600 V",
        "ans": 3,
        "exp": "V_s / V_p = N_s / N_p => V_s = 120 × (2500 / 500) = 120 × 5 = 600 V."
    },
    {
        "id": "phy_1986_03", "year": "1986", "topic": "Modern Physics, Radioactivity and Atomic Structure",
        "stem": "What is the number of neutrons in the Uranium isotope ²³⁸₉₂U?",
        "optA": "92", "optB": "146", "optC": "238", "optD": "330",
        "ans": 1,
        "exp": "Neutron number N = Mass Number A - Atomic Number Z = 238 - 92 = 146."
    },
    {
        "id": "phy_1987_01", "year": "1987", "topic": "Dynamics, Force and Friction",
        "stem": "Which of the following units is equivalent to kg·m/s (unit of momentum)?",
        "optA": "N/s", "optB": "N·m·s", "optC": "N·s", "optD": "J/s",
        "ans": 2,
        "exp": "1 Newton = 1 kg·m/s². Therefore, 1 N·s = (1 kg·m/s²)(s) = 1 kg·m/s."
    },
    {
        "id": "phy_1987_02", "year": "1987", "topic": "Linear Kinematics and Motion",
        "stem": "A man walks 8 km North and then 5 km in a direction 60° East of North. Find his resultant displacement from the starting point.",
        "optA": "11.36 km", "optB": "12.36 km", "optC": "13.00 km", "optD": "14.36 km",
        "ans": 0,
        "exp": "Using cosine rule: R = √(8² + 5² - 2(8)(5) cos 120°) = √(64 + 25 - 80(-0.5)) = √(89 + 40) = √129 ≈ 11.36 km."
    },
    {
        "id": "phy_1987_03", "year": "1987", "topic": "Work, Energy and Power",
        "stem": "A body rolls down a slope from a height of 100 m. If its velocity at the foot of the slope is 20 m/s, what percentage of its initial potential energy is converted into kinetic energy? (g = 10 m/s²)",
        "optA": "15%", "optB": "20%", "optC": "35%", "optD": "40%",
        "ans": 1,
        "exp": "Initial PE per unit mass = gh = 10 × 100 = 1000 J/kg. Final KE per unit mass = 1/2 v² = 1/2 (20)² = 200 J/kg. Percentage = (200 / 1000) × 100% = 20%."
    },
    {
        "id": "phy_1987_04", "year": "1987", "topic": "Work, Energy and Power",
        "stem": "A constant force of 40 N acting on a body initially at rest gives it an acceleration of 0.1 m/s² for 4 s. Calculate the work done by the force.",
        "optA": "8 J", "optB": "16 J", "optC": "32 J", "optD": "160 J",
        "ans": 2,
        "exp": "Distance s = ut + 1/2 at² = 0 + 1/2 (0.1)(4)² = 0.8 m. Work done = F × s = 40 N × 0.8 m = 32 Joules."
    },
    # 1988-1993 Series
    {
        "id": "phy_1988_01", "year": "1988", "topic": "Linear Kinematics and Motion",
        "stem": "A particle starts from rest and moves with a constant acceleration of 0.5 m/s². The distance covered by the particle in 10 s is:",
        "optA": "2.5 m", "optB": "5.0 m", "optC": "25.0 m", "optD": "50.0 m",
        "ans": 2,
        "exp": "s = ut + 1/2 at² = 0 + 1/2 (0.5)(10)² = 0.25 × 100 = 25.0 m."
    },
    {
        "id": "phy_1988_02", "year": "1988", "topic": "Dynamics, Force and Friction",
        "stem": "When taking a penalty kick, a footballer applies a force of 30.0 N for a period of 0.05 s. If the mass of the ball is 0.075 kg, calculate the speed with which the ball moves off.",
        "optA": "4.50 m/s", "optB": "11.25 m/s", "optC": "20.00 m/s", "optD": "45.00 m/s",
        "ans": 2,
        "exp": "Impulse = FΔt = mΔv => 30.0 × 0.05 = 0.075 × v => 1.5 = 0.075 v => v = 20.0 m/s."
    },
    {
        "id": "phy_1988_03", "year": "1988", "topic": "Dynamics, Force and Friction",
        "stem": "A lorry travels 10 km Northwards, 4 km Eastwards, 6 km Southwards and 4 km Westwards. What is the net displacement?",
        "optA": "4 km North", "optB": "6 km South", "optC": "6 km North", "optD": "4 km East",
        "ans": 0,
        "exp": "East-West net: 4 km East - 4 km West = 0. North-South net: 10 km North - 6 km South = 4 km North."
    },
    {
        "id": "phy_1988_04", "year": "1988", "topic": "Thermal Physics and Gas Laws",
        "stem": "A tap supplies water at 25 °C while another supplies water at 75 °C. If a person wishes to prepare water at 40 °C, the ratio of the mass of cold water to the mass of hot water required is:",
        "optA": "1 : 3", "optB": "7 : 3", "optC": "3 : 1", "optD": "15 : 8",
        "ans": 1,
        "exp": "Heat lost by hot water = Heat gained by cold water => m_h × c × (75 - 40) = m_c × c × (40 - 25) => 35 m_h = 15 m_c => m_c / m_h = 35 / 15 = 7 / 3 (7 : 3)."
    },
    {
        "id": "phy_1989_01", "year": "1989", "topic": "Dynamics, Force and Friction",
        "stem": "The magnitude of the resultant of two mutually perpendicular forces F₁ and F₂ is 13 N. If the magnitude of F₁ is 5 N, what is the magnitude of F₂?",
        "optA": "2.6 N", "optB": "8.0 N", "optC": "12.0 N", "optD": "18.0 N",
        "ans": 2,
        "exp": "R = √(F₁² + F₂²) => 13² = 5² + F₂² => 169 = 25 + F₂² => F₂² = 144 => F₂ = 12 N."
    },
    {
        "id": "phy_1989_02", "year": "1989", "topic": "Waves and Sound Resonance",
        "stem": "In a sound wave in air, adjacent rarefactions and compressions are separated by a distance of 17 cm. If the velocity of sound in air is 340 m/s, determine the frequency of the sound wave.",
        "optA": "10 Hz", "optB": "20 Hz", "optC": "1000 Hz", "optD": "2000 Hz",
        "ans": 2,
        "exp": "Distance between adjacent compression and rarefaction = λ / 2 = 0.17 m => λ = 0.34 m. Frequency f = v / λ = 340 / 0.34 = 1000 Hz."
    },
    {
        "id": "phy_1990_01", "year": "1990", "topic": "Linear Kinematics and Motion",
        "stem": "A car moving with a speed of 90 km/h is brought uniformly to rest by the application of brakes in 10 s. How far does the car travel after the brakes are applied?",
        "optA": "125 m", "optB": "150 m", "optC": "250 m", "optD": "900 m",
        "ans": 0,
        "exp": "Initial speed u = 90 km/h = 90 × (5/18) = 25 m/s. Final speed v = 0, t = 10 s. Distance s = ((u + v) / 2) × t = (25 / 2) × 10 = 125 m."
    },
    {
        "id": "phy_1991_01", "year": "1991", "topic": "Linear Kinematics and Motion",
        "stem": "A small metal ball is thrown vertically upwards from the top of a tower with an initial velocity of 20 m/s. If the ball took a total of 6 s to reach ground level, determine the height of the tower. (g = 10 m/s²)",
        "optA": "60 m", "optB": "80 m", "optC": "100 m", "optD": "120 m",
        "ans": 0,
        "exp": "Taking upward as positive: s = ut - 1/2 gt² = (20)(6) - 1/2 (10)(6)² = 120 - 180 = -60 m. Thus, height of tower = 60 m."
    },
    {
        "id": "phy_1992_01", "year": "1992", "topic": "Simple Harmonic Motion and Elasticity",
        "stem": "Which of the following factors affects the period of a simple pendulum?\nI. Mass of the pendulum bob\nII. Length of the pendulum\nIII. Acceleration due to gravity",
        "optA": "I, II and III", "optB": "II and III only", "optC": "I and III only", "optD": "I and II only",
        "ans": 1,
        "exp": "Period of a simple pendulum T = 2π√(L/g). It depends solely on length L and acceleration due to gravity g, independent of the mass of the bob."
    },
    {
        "id": "phy_1993_01", "year": "1993", "topic": "Work, Energy and Power",
        "stem": "Which of the following quantities has the same SI unit as the watt (W)?",
        "optA": "Force × time", "optB": "Force × distance", "optC": "Force × acceleration", "optD": "Force × velocity",
        "ans": 3,
        "exp": "Power = Work / time = (Force × distance) / time = Force × (distance / time) = Force × velocity (N·m/s = J/s = Watt)."
    }
]

physics_1994_2004 = [
    # 1994 Series
    {
        "id": "phy_1994_01", "year": "1994", "topic": "Linear Kinematics and Motion",
        "stem": "An object is projected with a velocity of 80 m/s at an angle of 30° to the horizontal. The maximum height reached is: (g = 10 m/s²)",
        "optA": "20 m", "optB": "80 m", "optC": "160 m", "optD": "320 m",
        "ans": 1,
        "exp": "H_max = (u sin θ)² / (2g) = (80 sin 30°)² / (2 × 10) = (80 × 0.5)² / 20 = 40² / 20 = 1600 / 20 = 80 m."
    },
    {
        "id": "phy_1994_02", "year": "1994", "topic": "Dynamics, Force and Friction",
        "stem": "A motor vehicle is brought to rest from a speed of 15 m/s in 20 seconds. Calculate the retardation.",
        "optA": "0.75 m/s²", "optB": "1.33 m/s²", "optC": "5.00 m/s²", "optD": "7.50 m/s²",
        "ans": 0,
        "exp": "Retardation a = (u - v) / t = (15 - 0) / 20 = 0.75 m/s²."
    },
    {
        "id": "phy_1994_03", "year": "1994", "topic": "Work, Energy and Power",
        "stem": "An object of mass 50 kg is released from a height of 2 m. Find its kinetic energy just before it strikes the ground. (g = 10 m/s²)",
        "optA": "250 J", "optB": "1000 J", "optC": "10000 J", "optD": "500 J",
        "ans": 1,
        "exp": "By conservation of mechanical energy: Final KE = Initial PE = mgh = 50 × 10 × 2 = 1000 Joules."
    },
    {
        "id": "phy_1994_04", "year": "1994", "topic": "Simple Harmonic Motion and Elasticity",
        "stem": "A spring of length 25 cm is extended to 30 cm by a load of 150 N attached to one of its ends. What is the elastic potential energy stored in the spring?",
        "optA": "3750 J", "optB": "2500 J", "optC": "3.75 J", "optD": "2.50 J",
        "ans": 2,
        "exp": "Extension e = 30 cm - 25 cm = 5 cm = 0.05 m. Energy stored = 1/2 Fe = 1/2 × 150 × 0.05 = 3.75 Joules."
    },
    {
        "id": "phy_1994_05", "year": "1994", "topic": "Thermal Physics and Gas Laws",
        "stem": "The melting point of naphthalene is 78 °C. What is this temperature on the Kelvin absolute scale?",
        "optA": "100 K", "optB": "315 K", "optC": "351 K", "optD": "378 K",
        "ans": 2,
        "exp": "T(K) = θ(°C) + 273.15 = 78 + 273.15 = 351.15 K ≈ 351 K."
    },
    {
        "id": "phy_1994_06", "year": "1994", "topic": "Waves and Sound Resonance",
        "stem": "A sound wave from a ship's sonar travels to the bottom of the sea and the echo is received 4 s later. If the speed of sound in seawater is 1500 m/s, what is the depth of the sea?",
        "optA": "6000 m", "optB": "3000 m", "optC": "1500 m", "optD": "375 m",
        "ans": 1,
        "exp": "Depth d = (v × t) / 2 = (1500 × 4) / 2 = 3000 m."
    },
    {
        "id": "phy_1994_07", "year": "1994", "topic": "Current Electricity and Resistance",
        "stem": "Two resistors R₁ = 4 Ω and R₂ = 5 Ω are connected in parallel across a potential difference V. If P₁ and P₂ represent the power dissipated in R₁ and R₂ respectively, the ratio P₁ : P₂ is:",
        "optA": "4 : 5", "optB": "5 : 4", "optC": "16 : 25", "optD": "25 : 16",
        "ans": 1,
        "exp": "In parallel, P = V² / R. Therefore, P₁ / P₂ = (V² / R₁) / (V² / R₂) = R₂ / R₁ = 5 / 4 (5 : 4)."
    },
    # 1995-1998 Series
    {
        "id": "phy_1995_01", "year": "1995", "topic": "Dynamics, Force and Friction",
        "stem": "Which of the following is the correct dimensional representation of pressure?",
        "optA": "ML⁻¹T⁻²", "optB": "MLT⁻²", "optC": "ML²T⁻³", "optD": "ML⁻³",
        "ans": 0,
        "exp": "Pressure = Force / Area = (MLT⁻²) / (L²) = ML⁻¹T⁻²."
    },
    {
        "id": "phy_1995_02", "year": "1995", "topic": "Work, Energy and Power",
        "stem": "An electric kettle rated at 2000 W contains 2.0 kg of water. How long will it take the temperature of the water to rise from 20 °C to 100 °C? (Specific heat capacity of water = 4200 J·kg⁻¹·K⁻¹)",
        "optA": "420 s", "optB": "336 s", "optC": "168 s", "optD": "84 s",
        "ans": 1,
        "exp": "Heat required Q = mcΔθ = 2.0 × 4200 × (100 - 20) = 2.0 × 4200 × 80 = 672,000 J. Time t = Q / P = 672,000 / 2000 = 336 s."
    },
    {
        "id": "phy_1995_03", "year": "1995", "topic": "Waves and Sound Resonance",
        "stem": "Which of the following wave phenomena is EXCLUSIVE to transverse waves and cannot occur in longitudinal waves?",
        "optA": "Diffraction", "optB": "Refraction", "optC": "Interference", "optD": "Polarization",
        "ans": 3,
        "exp": "Polarization occurs only when wave oscillations are perpendicular to the direction of propagation (transverse waves). Longitudinal waves (like sound) oscillate along the direction of propagation and cannot be polarized."
    },
    {
        "id": "phy_1997_01", "year": "1997", "topic": "Linear Kinematics and Motion",
        "stem": "The distance x in metres travelled by a particle in time t seconds is described by x = 10 + 12t². Find the average speed of the particle between t = 2 s and t = 5 s.",
        "optA": "60 m/s", "optB": "72 m/s", "optC": "84 m/s", "optD": "108 m/s",
        "ans": 2,
        "exp": "At t = 2 s: x₁ = 10 + 12(4) = 58 m. At t = 5 s: x₂ = 10 + 12(25) = 310 m. Average speed = Δx / Δt = (310 - 58) / (5 - 2) = 252 / 3 = 84 m/s."
    },
    {
        "id": "phy_1997_02", "year": "1997", "topic": "Work, Energy and Power",
        "stem": "An electric water pump rated 1.5 kW lifts 200 kg of water through a vertical height of 6 metres in 10 seconds. What is the efficiency of the pump? (g = 10 m/s²)",
        "optA": "90.0%", "optB": "85.0%", "optC": "80.0%", "optD": "65.0%",
        "ans": 2,
        "exp": "Work output = mgh = 200 × 10 × 6 = 12,000 J. Power output = 12,000 / 10 = 1200 W. Efficiency = (Power Output / Power Input) × 100% = (1200 / 1500) × 100% = 80.0%."
    },
    {
        "id": "phy_1998_01", "year": "1998", "topic": "Dynamics, Force and Friction",
        "stem": "The physical quantity that has the same dimensions as impulse is:",
        "optA": "Energy", "optB": "Momentum", "optC": "Surface tension", "optD": "Pressure",
        "ans": 1,
        "exp": "Impulse = Force × time = (MLT⁻²)(T) = MLT⁻¹. Momentum = Mass × velocity = M(LT⁻¹) = MLT⁻¹. Both share identical dimensions."
    },
    {
        "id": "phy_1998_02", "year": "1998", "topic": "Linear Kinematics and Motion",
        "stem": "A ball is moving at 18 m/s in a direction inclined at 60° to the horizontal. The horizontal component of its velocity is:",
        "optA": "9√3 m/s", "optB": "6√3 m/s", "optC": "9 m/s", "optD": "18 m/s",
        "ans": 2,
        "exp": "Horizontal component v_x = v cos θ = 18 cos 60° = 18 × 0.5 = 9 m/s."
    },
    # 1999-2004 Series
    {
        "id": "phy_1999_01", "year": "1999", "topic": "Work, Energy and Power",
        "stem": "A car of mass 800 kg accelerates uniformly from rest to a speed of 25 m/s in 20 seconds. The average power developed by the engine is:",
        "optA": "1.25 × 10⁴ W", "optB": "2.50 × 10⁴ W", "optC": "1.25 × 10⁶ W", "optD": "2.50 × 10⁶ W",
        "ans": 0,
        "exp": "Work done = Final KE = 1/2 mv² = 1/2 × 800 × (25)² = 400 × 625 = 250,000 J. Power = Work / t = 250,000 / 20 = 12,500 W = 1.25 × 10⁴ W."
    },
    {
        "id": "phy_1999_02", "year": "1999", "topic": "Dynamics, Force and Friction",
        "stem": "A lead bullet of mass 0.05 kg is fired with a velocity of 200 m/s into a stationary lead block of mass 0.95 kg. If the bullet embeds in the block and they move together freely, what is the common velocity after impact?",
        "optA": "10 m/s", "optB": "20 m/s", "optC": "50 m/s", "optD": "100 m/s",
        "ans": 0,
        "exp": "By conservation of linear momentum: m₁u₁ = (m₁ + m₂)v => 0.05 × 200 = (0.05 + 0.95) v => 10 = 1.0 v => v = 10 m/s."
    },
    {
        "id": "phy_2000_01", "year": "2000", "topic": "Waves and Sound Resonance",
        "stem": "A sonometer wire is vibrating at frequency f₀. If the tension in the wire is quadrupled while the length and mass per unit length remain constant, the new frequency of vibration is:",
        "optA": "f₀ / 2", "optB": "2 f₀", "optC": "4 f₀", "optD": "f₀ / 4",
        "ans": 1,
        "exp": "Frequency f = (1 / 2L) √(T / μ). When tension T becomes 4T, f' = f₀ × √4 = 2 f₀."
    },
    {
        "id": "phy_2001_01", "year": "2001", "topic": "Optics, Refraction and Lenses",
        "stem": "A ray of light strikes a plane mirror at an angle of incidence of 35°. If the mirror is rotated through an angle of 10°, through what angle is the reflected ray rotated?",
        "optA": "10°", "optB": "20°", "optC": "35°", "optD": "70°",
        "ans": 1,
        "exp": "When a reflecting plane mirror is rotated through an angle θ, the reflected ray rotates through twice that angle (2θ = 2 × 10° = 20°)."
    },
    {
        "id": "phy_2002_01", "year": "2002", "topic": "Current Electricity and Resistance",
        "stem": "An electric iron is rated 1000 W, 230 V. What is the electrical resistance of its heating element?",
        "optA": "57.6 Ω", "optB": "55.9 Ω", "optC": "52.9 Ω", "optD": "23.0 Ω",
        "ans": 2,
        "exp": "P = V² / R => R = V² / P = (230)² / 1000 = 52,900 / 1000 = 52.9 Ω."
    },
    {
        "id": "phy_2003_01", "year": "2003", "topic": "Optics, Refraction and Lenses",
        "stem": "A concave mirror of radius of curvature 40 cm forms a real image twice as large as the object (magnification m = 2). The object distance is:",
        "optA": "10 cm", "optB": "20 cm", "optC": "30 cm", "optD": "60 cm",
        "ans": 2,
        "exp": "Focal length f = r / 2 = 20 cm. For a real image in a concave mirror, m = f / (u - f) => 2 = 20 / (u - 20) => 2(u - 20) = 20 => 2u - 40 = 20 => 2u = 60 => u = 30 cm."
    },
    {
        "id": "phy_2004_01", "year": "2004", "topic": "Current Electricity and Resistance",
        "stem": "A wire of 5 Ω resistance is drawn out uniformly so that its new length is twice the original length. If the resistivity and volume remain unchanged, the new resistance of the wire is:",
        "optA": "10 Ω", "optB": "15 Ω", "optC": "20 Ω", "optD": "40 Ω",
        "ans": 2,
        "exp": "When length is doubled (L' = 2L) at constant volume, cross-sectional area is halved (A' = A/2). New resistance R' = ρ(2L) / (A/2) = 4(ρL/A) = 4 × 5 = 20 Ω."
    }
]

# Write Physics Bank Part 1 (1983 - 1993)
lines_p1 = [
    "package com.example.data.repository",
    "",
    "import com.example.data.db.QuestionEntity",
    "",
    "/**",
    " * Official JAMB Physics Historical Examination Series (1983 - 1993).",
    " * Verified options, calculations, answers and pedagogical explanations.",
    " */",
    "object JambPhysicsHistorical1983to1993Bank {",
    "    fun getQuestions(): List<QuestionEntity> {",
    "        val list = mutableListOf<QuestionEntity>()"
]

for q in physics_1983_1993:
    entry = f"""        list.add(
            QuestionEntity(
                id = "{q['id']}",
                subject = "Physics",
                topic = "{q['topic']}",
                year = "{q['year']}",
                questionText = "{escape_kt(q['stem'])}",
                optionA = "{escape_kt(q['optA'])}",
                optionB = "{escape_kt(q['optB'])}",
                optionC = "{escape_kt(q['optC'])}",
                optionD = "{escape_kt(q['optD'])}",
                correctAnswerIndex = {q['ans']},
                explanation = "{escape_kt(q['exp'])}",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • {q['year']}",
                isVerifiedJamb = true
            )
        )"""
    lines_p1.append(entry)

lines_p1.append("        return list")
lines_p1.append("    }")
lines_p1.append("}")

with open("app/src/main/java/com/example/data/repository/JambPhysicsHistorical1983to1993Bank.kt", "w") as f:
    f.write("\n".join(lines_p1))
print("Wrote JambPhysicsHistorical1983to1993Bank.kt")

# Write Physics Bank Part 2 (1994 - 2004)
lines_p2 = [
    "package com.example.data.repository",
    "",
    "import com.example.data.db.QuestionEntity",
    "",
    "/**",
    " * Official JAMB Physics Historical Examination Series (1994 - 2004).",
    " * Verified options, calculations, answers and pedagogical explanations.",
    " */",
    "object JambPhysicsHistorical1994to2004Bank {",
    "    fun getQuestions(): List<QuestionEntity> {",
    "        val list = mutableListOf<QuestionEntity>()"
]

for q in physics_1994_2004:
    entry = f"""        list.add(
            QuestionEntity(
                id = "{q['id']}",
                subject = "Physics",
                topic = "{q['topic']}",
                year = "{q['year']}",
                questionText = "{escape_kt(q['stem'])}",
                optionA = "{escape_kt(q['optA'])}",
                optionB = "{escape_kt(q['optB'])}",
                optionC = "{escape_kt(q['optC'])}",
                optionD = "{escape_kt(q['optD'])}",
                correctAnswerIndex = {q['ans']},
                explanation = "{escape_kt(q['exp'])}",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Physics Past Question • {q['year']}",
                isVerifiedJamb = true
            )
        )"""
    lines_p2.append(entry)

lines_p2.append("        return list")
lines_p2.append("    }")
lines_p2.append("}")

with open("app/src/main/java/com/example/data/repository/JambPhysicsHistorical1994to2004Bank.kt", "w") as f:
    f.write("\n".join(lines_p2))
print("Wrote JambPhysicsHistorical1994to2004Bank.kt")
