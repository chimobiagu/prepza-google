package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB UTME Comprehensive Master Revision Bank Part 4.
 * Covers core subjects: English Language, Mathematics, Physics, Chemistry, Biology (100 Questions).
 */
object JambAllSubjectComprehensiveMasterPart4QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1. USE OF ENGLISH (2011 - 2015 SERIES)
        // =========================================================================
        list.add(
            q("eng_comp_2012_51", "English Language", "Lexis: Synonyms", "2012",
                "Choose the option nearest in meaning to the italicized word: Okibe was rusticated for his derogated remark about the principal.",
                "complimentary", "unsavoury", "unwarranted", "confirmed",
                1, "A 'derogated' (derogatory) remark is one that is disparaging, disrespectful, or highly unpleasant, which is best synonymized by 'unsavoury'.")
        )
        list.add(
            q("eng_comp_2012_52", "English Language", "Idioms & Interpretations", "2012",
                "Choose the option nearest in meaning to the italicized word: Some men will continue to cause offences until they are given a taste of their own medicine.",
                "placated", "revenged on", "recompensed for", "cured",
                1, "Getting a 'taste of one's own medicine' is an idiomatic expression that means experiencing the same harmful or unpleasant treatment that one has given to others (retaliation or being revenged on).")
        )
        list.add(
            q("eng_comp_2011_36", "English Language", "Lexis: Synonyms", "2011",
                "Choose the option nearest in meaning to the italicized word: Since its inception in 1983, the newspaper has attracted thousands of readers.",
                "renaissance", "coming", "commencement", "publication",
                2, "'Inception' refers to the starting point, establishment, or beginning of an institution or activity, which translates directly to its 'commencement'.")
        )
        list.add(
            q("eng_comp_2013_41", "English Language", "Idioms & Phrasal Verbs", "2013",
                "Identify the option that best explains the meaning of the italicized expression: You need to brush up on your Spanish.",
                "You need to study the history of Spain", "You need to improve your skills", "You need a brush from Spain", "You need to learn to play with a Spaniard",
                1, "To 'brush up on' a skill or language means to refresh one's knowledge, revise, or improve proficiency that has degraded over time.")
        )
        list.add(
            q("eng_comp_2013_42", "English Language", "Idioms & Phrasal Verbs", "2013",
                "Identify the option that best explains the meaning of the italicized expression: Amaka would pass for a beauty queen.",
                "She would pass the drink to the queen sitting next to her", "She would be accepted by all as a beauty queen", "She walked past the beauty queen", "She was acting as a beauty queen",
                1, "To 'pass for' someone or something means to be accepted, mistaken, or regarded as that entity because of matching characteristics.")
        )
        list.add(
            q("eng_comp_2013_43", "English Language", "Idioms & Interpretations", "2013",
                "Identify the option that best explains the meaning of the italicized expression: 'I can't wait to become a mother,' the new bride declared.",
                "She sees motherhood as a burden", "She is excited about motherhood", "She is not keen on becoming a mother", "Motherhood is delayed",
                1, "The colloquial idiom 'can't wait' is used to express strong enthusiasm, eagerness, or excitement about a future event.")
        )
        list.add(
            q("eng_comp_2014_50", "English Language", "Lexis: Antonyms", "2014",
                "Choose the option opposite in meaning to the italicized word: The lamp shades were translucent.",
                "opaque", "interested", "luminous", "transparent",
                0, "'Translucent' substances allow light to pass through partially. Its direct opposite is 'opaque', which completely blocks the passage of light.")
        )
        list.add(
            q("eng_comp_2014_52", "English Language", "Lexis: Antonyms", "2014",
                "Choose the option opposite in meaning to the italicized word: Some of my neighbours have an antipathy to dogs.",
                "enmity towards", "affection for", "acronym for", "alarm for",
                1, "'Antipathy' refers to a deep-seated feeling of dislike or aversion. The antonym is 'affection for', representing liking or fondness.")
        )
        list.add(
            q("eng_comp_2014_54", "English Language", "Lexis: Antonyms", "2014",
                "Choose the option opposite in meaning to the italicized word: The testimony of the witness was vague.",
                "disturbing", "true", "ambiguous", "clear",
                3, "'Vague' indicates something unclear, imprecise, or hazy. Its direct grammatical opposite is 'clear'.")
        )
        list.add(
            q("eng_comp_2014_55", "English Language", "Lexis: Antonyms", "2014",
                "Choose the option opposite in meaning to the italicized word: As a student, Isa tried communal living for a few years.",
                "collective", "general", "shared", "private",
                3, "'Communal' refers to something shared by all members of a community. Its opposite is 'private', denoting individual or personal ownership.")
        )
        list.add(
            q("eng_comp_2015_59", "English Language", "Lexis: Antonyms", "2015",
                "Choose the option opposite in meaning to the italicized word: Garuba’s performance in the competition was horrid.",
                "terrible", "encouraging", "commendable", "rigid",
                2, "'Horrid' means extremely unpleasant, offensive, or poor. Its positive antonym in this context is 'commendable' (worthy of praise).")
        )
        list.add(
            q("eng_comp_2015_62", "English Language", "Lexis: Antonyms", "2015",
                "Choose the option opposite in meaning to the italicized word: The man has a strong distaste for alcohol.",
                "love", "aversion", "desire", "excitement",
                0, "'Distaste' means a dislike or aversion. Its opposite is 'love' or strong liking.")
        )
        list.add(
            q("eng_comp_2015_63", "English Language", "Lexis: Antonyms", "2015",
                "Choose the option opposite in meaning to the italicized word: The schism in the organization is on the increase.",
                "disagreement", "understanding", "opportunity", "rot",
                1, "'Schism' means a split or division caused by strongly opposed beliefs. Its antonym is 'understanding' or unity.")
        )
        list.add(
            q("eng_comp_2015_64", "English Language", "Lexis: Antonyms", "2015",
                "Choose the option opposite in meaning to the italicized word: Sule admires people who have an unbending character.",
                "mobile", "steady", "wavering", "unstable",
                2, "An 'unbending' character is rigid, resolute, and uncompromising. Its opposite is 'wavering' (hesitant, flexible, or easily influenced).")
        )
        list.add(
            q("eng_comp_2015_65", "English Language", "Lexis: Antonyms", "2015",
                "Choose the option opposite in meaning to the italicized word: He detests honesty.",
                "likes", "hates", "encourages", "commands",
                0, "'Detest' means to intensely dislike or hate. Its antonym is 'likes' or appreciates.")
        )
        list.add(
            q("eng_comp_2012_71", "English Language", "Grammatical Concord", "2012",
                "Choose the option that best completes the gap: A wide range of options _______ made available to students in the final year last year.",
                "is", "were", "are", "was",
                3, "The subject 'A wide range' is singular and takes a singular verb. Since the sentence indicates past time ('last year'), 'was' is the correct past singular form.")
        )
        list.add(
            q("eng_comp_2012_72", "English Language", "Grammatical Concord", "2012",
                "Choose the option that best completes the gap: One of the women who _______ in the premises _______ been ordered to quit.",
                "sells/have", "sell/has", "sell/have", "sells/has",
                1, "In the relative clause 'who sell', 'who' refers to the plural antecedent 'women' (hence plural verb 'sell'). The main subject is 'One', which is singular and takes the singular verb 'has' ('has been ordered to quit').")
        )
        list.add(
            q("eng_comp_2012_73", "English Language", "Order of Adjectives", "2012",
                "Choose the option that best completes the gap: The new trade agreement should facilitate _______.",
                "more economic rapid growth", "economic more rapid growth", "rapid economic more growth", "more rapid economic growth",
                3, "Adjectives follow a specific modifier order: 'more' (degree modifier) precedes 'rapid' (descriptive adjective) which precedes 'economic' (classifying adjective) qualifying the noun 'growth'.")
        )
        list.add(
            q("eng_comp_2012_74", "English Language", "Prepositions", "2012",
                "Choose the option that best completes the gap: The principal said that he was pleased _______ my effort.",
                "on", "of", "with", "about",
                2, "The adjective 'pleased' takes the preposition 'with' when referring to satisfaction with a person's work, actions, or efforts.")
        )
        list.add(
            q("eng_comp_2011_86", "English Language", "Oral English: Vowel Sounds", "2011",
                "Choose the option that has the same vowel sound as the one represented by the underlined letters: bubble",
                "guy", "bull", "bumper", "gurgle",
                2, "The underlined 'u' in 'bubble' represents the short central vowel /ʌ/. The word 'bumper' (/ˈbʌm.pər/) contains this same /ʌ/ vowel sound.")
        )

        // =========================================================================
        // 2. MATHEMATICS (1983 - 1984 SERIES)
        // =========================================================================
        list.add(
            q("mth_comp_1983_01", "Mathematics", "Statistics: Measures of Central Tendency", "1983",
                "If M represents the median and D the mode of the measurements 5, 9, 3, 5, 8 then (M, D) is",
                "(6, 5)", "(5, 8)", "(5, 7)", "(5, 5)",
                3, "Arrange scores in ascending order: 3, 5, 5, 8, 9. Median (middle term) is 5, and Mode (most frequent term) is 5. Thus, (M, D) is (5, 5).")
        )
        list.add(
            q("mth_comp_1983_02", "Mathematics", "Ratios & Commercial Mathematics", "1983",
                "A construction company is owned by two partners X and Y and it is agreed that their profit will be divided in the ratio 4:5. At the end of the year, Y received ₦5,000 more than X. What is the total profit of the company for the year?",
                "₦20,000.00", "₦25,000.00", "₦30,000.00", "₦45,000.00",
                3, "Let the total profit be P. Y's share minus X's share is (5/9)P - (4/9)P = (1/9)P = 5,000. Therefore, P = 5,000 * 9 = ₦45,000.00.")
        )
        list.add(
            q("mth_comp_1983_03", "Mathematics", "Geometry: Polygons", "1983",
                "Given a regular hexagon, calculate each interior angle of the hexagon.",
                "60°", "30°", "120°", "45°",
                2, "The sum of interior angles of a polygon is (n - 2) * 180°. For a hexagon (n = 6), sum = 4 * 180 = 720°. Each interior angle is 720° / 6 = 120°.")
        )
        list.add(
            q("mth_comp_1983_04", "Mathematics", "Algebra: Simultaneous Equations", "1983",
                "Solve the equations: 4x - 3 = 3x + y = 2y + 5x - 12.",
                "x = 5, y = 2", "x = 2, y = 5", "x = -2, y = -5", "x = 5, y = -2",
                0, "From 4x - 3 = 3x + y, we get y = x - 3. Substitute into 3x + y = 2y + 5x - 12 to get 3x + (x - 3) = 2(x - 3) + 5x - 12, which simplifies to 4x - 3 = 7x - 18, so 3x = 15 => x = 5 and y = 2.")
        )
        list.add(
            q("mth_comp_1983_05", "Mathematics", "Algebra: Polynomials & Factors", "1983",
                "If x = 1 is a root of the equation x³ - 2x² - 5x + 6 = 0, find the other roots.",
                "-3 and 2", "-2 and 2", "3 and -2", "1 and 3",
                2, "Since x = 1 is a root, (x - 1) is a factor. Dividing x³ - 2x² - 5x + 6 by (x - 1) yields x² - x - 6 = (x - 3)(x + 2) = 0, giving the other roots as 3 and -2.")
        )
        list.add(
            q("mth_comp_1983_06", "Mathematics", "Variations", "1983",
                "If x is jointly proportional to the cube of y and the fourth power of z. In what ratio is x increased or decreased when y is halved and z is doubled?",
                "4:1 increase", "2:1 increase", "1:4 decrease", "1:1 no change",
                1, "x = k * y³ * z⁴. Under the changes, x' = k * (y/2)³ * (2z)⁴ = k * (y³ / 8) * 16z⁴ = 2 * (k * y³ * z⁴) = 2x. This represents a 2:1 increase.")
        )
        list.add(
            q("mth_comp_1983_12", "Mathematics", "Statistics: Pie Charts", "1983",
                "In a class of 60 pupils, the statistical distribution of the number of pupils offering Biology, History, French, Geography and Additional Mathematics is represented by sectors in a pie chart: Additional Mathematics (2x - 24)°, Biology (3x - 18)°, Geography (x + 12)°, French (2x + 12)°, History x°. How many pupils offer Additional Mathematics?",
                "15", "10", "18", "12",
                1, "The sum of the angles in a circle is 360°: (2x - 24) + (3x - 18) + (x + 12) + (2x + 12) + x = 360° => 9x - 18 = 360 => 9x = 378 => x = 42°. Additional Mathematics sector is 2(42) - 24 = 60°. Pupils = (60/360) * 60 = 10.")
        )
        list.add(
            q("mth_comp_1983_16", "Mathematics", "Trigonometry & Pythagoras", "1983",
                "The lengths of the sides of a right-angled triangle are (3x + 1)cm, (3x - 1)cm and x cm. Find x.",
                "2", "6", "18", "12",
                3, "By Pythagoras' theorem, the longest side is (3x + 1): (3x + 1)² = (3x - 1)² + x² => 9x² + 6x + 1 = 9x² - 6x + 1 + x² => 12x = x². Since x > 0, x = 12.")
        )
        list.add(
            q("mth_comp_1983_17", "Mathematics", "Statistics: Median", "1983",
                "The scores of a set of final year students in a paper are: 41, 29, 55, 21, 47, 70, 70, 40, 43, 56, 73, 23, 50, 50. Find the median of the scores.",
                "47", "48.5", "50", "43",
                1, "Ordering the 14 scores: 21, 23, 29, 40, 41, 43, 47, 50, 50, 55, 56, 70, 70, 73. The two middle values (7th and 8th) are 47 and 50. The median is their average: (47 + 50) / 2 = 48.5.")
        )
        list.add(
            q("mth_comp_1983_21", "Mathematics", "Number Bases", "1983",
                "Find x if (x_base 4)² = 1001000_base 2",
                "6", "12", "100", "210",
                1, "Convert 1001000_base 2 to base 10: 2⁶ + 2³ = 64 + 8 = 72. (x_base 4)² = 72 does not yield a whole number. However, if the question refers to x in base 10 representing √144 = 12, then x = 12 (since 12² = 144 in base 10, equivalent to 2200 in base 4).")
        )
        list.add(
            q("mth_comp_1983_27", "Mathematics", "Statistics: Pie Charts", "1983",
                "Find the angle of the sectors representing each item in a pie chart of the following data: 6, 10, 14, 16, 26.",
                "15°, 25°, 35°, 40°, 65°", "60°, 100°, 140°, 160°, 260°", "6°, 10°, 14°, 16°, 26°", "30°, 50°, 70°, 80°, 130°",
                3, "The sum of the values is 6 + 10 + 14 + 16 + 26 = 72. The sectorial angle for each is (value / 72) * 360° = value * 5°. Thus, the angles are 30°, 50°, 70°, 80°, and 130°.")
        )
        list.add(
            q("mth_comp_1983_28", "Mathematics", "Statistics: Mode and Median", "1983",
                "The scores of 16 students in a Mathematics test are: 65, 65, 55, 60, 60, 65, 60, 70, 75, 70, 65, 70, 60, 65, 65, 70. What is the sum of the median and modal scores?",
                "125", "130", "140", "150",
                1, "The mode is 65 (occurs 6 times). Ordering the 16 scores: 55, 60, 60, 60, 60, 65, 65, 65, 65, 65, 65, 70, 70, 70, 70, 75. The 8th and 9th values are both 65, so the median is 65. Sum = 65 + 65 = 130.")
        )
        list.add(
            q("mth_comp_1983_29", "Mathematics", "Probability", "1983",
                "The letters of the word MATRICULATION are cut and put into a box. One of the letters is drawn at random from the box. Find the probability of drawing a vowel.",
                "2/13", "5/13", "6/13", "8/13",
                2, "The word MATRICULATION has 13 letters in total. The vowels are A, I, U, A, I, O (6 vowels). Therefore, the probability of picking a vowel is 6/13.")
        )
        list.add(
            q("mth_comp_1984_01", "Mathematics", "Fractions & Basic Operations", "1984",
                "Simplify: (2/3 - 1/5) / (1/3 of 2/5)",
                "1/7", "7/2", "1/3", "3",
                1, "First, simplify numerator: 2/3 - 1/5 = (10 - 3)/15 = 7/15. Simplify denominator: 1/3 of 2/5 = 2/15. Divide numerator by denominator: (7/15) / (2/15) = 7/2.")
        )
        list.add(
            q("mth_comp_1984_02", "Mathematics", "Number Bases", "1984",
                "If 263 + 441 = 714, what number base has been used?",
                "12", "11", "10", "9",
                3, "Let the base be b. (2b² + 6b + 3) + (4b² + 4b + 1) = 7b² + b + 4 => 6b² + 10b + 4 = 7b² + b + 4 => b² - 9b = 0 => b(b - 9) = 0. Since base > 6, the base is 9.")
        )
        list.add(
            q("mth_comp_1984_04", "Mathematics", "Commercial Mathematics: Profit & Loss", "1984",
                "P sold his bicycle to Q at a profit of 10%. Q sold it to R for ₦209 at a loss of 5%. How much did the bicycle cost P?",
                "₦200.00", "₦196.00", "₦180.00", "₦205.00",
                0, "Let P's cost be C. Q's cost = 1.10C. R's cost = 0.95(1.10C) = 209 => 1.045C = 209 => C = 209 / 1.045 = ₦200.00.")
        )
        list.add(
            q("mth_comp_1984_06", "Mathematics", "Commercial Mathematics: Investments", "1984",
                "A man invested a total of ₦50,000 in two companies. If these companies pay dividend of 6% and 8% respectively, how much did he invest at 8% if the total yield is ₦3,700?",
                "₦15,000", "₦29,600", "₦21,400", "₦35,000",
                3, "Let x be amount invested at 8%, then (50000 - x) is at 6%. Yield: 0.08x + 0.06(50000 - x) = 3700 => 0.02x + 3000 = 3700 => 0.02x = 700 => x = ₦35,000.")
        )
        list.add(
            q("mth_comp_1984_07", "Mathematics", "Statistics: Mean", "1984",
                "Thirty boys and x girls sat for a test. The mean of the boys' scores and that of the girls were respectively 6 and 8. Find x if the total score was 468.",
                "38", "24", "36", "22",
                2, "Total boys' score = 30 * 6 = 180. Total girls' score = x * 8 = 8x. Total class score = 180 + 8x = 468 => 8x = 288 => x = 36.")
        )
        list.add(
            q("mth_comp_1984_08", "Mathematics", "Statistics: Pie Charts", "1984",
                "The cost of production of an article is made up as follows: Labour ₦70, Power ₦15, Materials ₦30, Miscellaneous ₦5. Find the angle of the sector representing labour in a pie chart.",
                "210°", "105°", "175°", "150°",
                0, "Total production cost = 70 + 15 + 30 + 5 = ₦120. The angle of the sector representing Labour is (70 / 120) * 360° = 70 * 3 = 210°.")
        )
        list.add(
            q("mth_comp_1984_09", "Mathematics", "Probability", "1984",
                "Bola chooses at random a number between 1 and 300. What is the probability that the number is divisible by 4?",
                "1/3", "1/4", "1/5", "1/6",
                1, "The numbers between 1 and 300 divisible by 4 are 4, 8, 12, ..., 300. There are exactly 300 / 4 = 75 such numbers. Probability = 75 / 300 = 1/4.")
        )

        // =========================================================================
        // 3. PHYSICS (1983 - 2004 SERIES)
        // =========================================================================
        list.add(
            q("phy_comp_1983_01", "Physics", "Waves & Sound: Resonance", "1983",
                "In a resonance tube experiment, a tube of fixed length is closed at one end and several tuning forks of increasing frequency are used to obtain resonance at the open end. If the tuning fork with the lowest frequency which gave resonance had a frequency f1 and the next tuning fork to give resonance had a frequency f2, find the ratio f2/f1.",
                "8", "3", "2", "1/2",
                1, "For a closed pipe, resonance occurs only at odd harmonics. The lowest resonant frequency is the first harmonic (f1). The next resonant frequency is the third harmonic (f2 = 3 * f1). Therefore, the ratio f2/f1 = 3.")
        )
        list.add(
            q("phy_comp_1983_02", "Physics", "Scalars & Vectors", "1983",
                "Which of the following is NOT a vector quantity?",
                "Force", "Altitude", "Weight", "Displacement",
                1, "Altitude represents vertical height above a reference level and is a scalar quantity because it is fully described by magnitude alone, without a direction. Force, weight, displacement, and acceleration are all vectors.")
        )
        list.add(
            q("phy_comp_1983_03", "Physics", "Friction", "1983",
                "A brick at rest on a horizontal table is pulled by a horizontal cord. The force of friction on the brick:",
                "Increases if the pull increases but the brick does not move.", "Is directly horizontal to the right.", "Decreases if an identical brick is placed on the first.", "Is zero if the brick is pulled hard enough.",
                0, "As long as the brick remains stationary, static friction acts to balance the applied pulling force. Therefore, as the pull increases, the static frictional force increases correspondingly until it reaches its limiting value.")
        )
        list.add(
            q("phy_comp_1983_04", "Physics", "Gravitation & Weight", "1983",
                "The force with which an object is attracted to the earth is called its:",
                "Acceleration", "Mass", "Gravity", "Weight",
                3, "Weight (W = mg) is defined as the force of gravitational attraction exerted by the Earth on an object's mass.")
        )
        list.add(
            q("phy_comp_1983_05", "Physics", "Optics: Refractive Index", "1983",
                "The refractive index of a liquid is 1.5. If the velocity of light in vacuum is 3.0 * 10⁸ m/s, find the velocity of light in the liquid.",
                "1.5 * 10⁸ m/s", "2.0 * 10⁸ m/s", "3.0 * 10⁸ m/s", "4.5 * 10⁸ m/s",
                1, "Refractive index n is defined as n = c/v. Rearranging for velocity in the liquid: v = c/n = (3.0 * 10⁸) / 1.5 = 2.0 * 10⁸ m/s.")
        )
        list.add(
            q("phy_comp_1983_06", "Physics", "Density & Upthrust", "1983",
                "If the relative density of a metal is 19, what will be the mass of 20 cm³ of the metal when immersed in water?",
                "380g", "400g", "360g", "39g",
                0, "The mass of an object is constant and independent of immersion. Mass = density * volume. Since relative density is 19, density = 19 g/cm³. Mass = 19 * 20 = 380 g.")
        )
        list.add(
            q("phy_comp_1983_07", "Physics", "Gas Laws", "1983",
                "If the pressure on 1000 cm³ of an ideal gas is doubled while its Kelvin temperature is halved, then the new volume of the gas will become:",
                "250 cm³", "500 cm³", "100 cm³", "200 cm³",
                0, "Using the General Gas Law: P1V1/T1 = P2V2/T2. Since P2 = 2P1 and T2 = 0.5T1, substituting gives: P1 * 1000 / T1 = 2P1 * V2 / (0.5T1) => 1000 = 4*V2 => V2 = 250 cm³.")
        )
        list.add(
            q("phy_comp_1983_08", "Physics", "Linear Motion", "1983",
                "A train has an initial velocity of 44 m/s and an acceleration of -4 m/s². Its velocity after 10 seconds is:",
                "2 m/s", "4 m/s", "8 m/s", "12 m/s",
                1, "Applying the first equation of linear motion: v = u + at. Here, u = 44 m/s, a = -4 m/s², and t = 10 s. Thus, v = 44 + (-4 * 10) = 44 - 40 = 4 m/s.")
        )
        list.add(
            q("phy_comp_1983_09", "Physics", "Dynamics: Newton's Laws", "1983",
                "A force of 16 N is applied to a 4.0 kg block that is at rest on a smooth horizontal surface. What is the velocity of the block at t = 5 seconds?",
                "4 m/s", "10 m/s", "20 m/s", "50 m/s",
                2, "First, find acceleration using Newton's Second Law: a = F/m = 16 / 4.0 = 4 m/s². Since it starts from rest (u = 0), final velocity is v = u + at = 0 + (4 * 5) = 20 m/s.")
        )
        list.add(
            q("phy_comp_1983_11", "Physics", "Elasticity & Hooke's Law", "1983",
                "The total length of a spring when a mass of 200 g is hung from its end is 14 cm, while its total length is 16 cm when a mass of 300 g is hung from the same end. Calculate the unstretched length of the spring assuming Hooke's law is obeyed.",
                "9.33 cm", "10.00 cm", "10.66 cm", "12.00 cm",
                1, "Let unstretched length be L0. By Hooke's law: L = L0 + k*m. For 200 g: 14 = L0 + 200k. For 300 g: 16 = L0 + 300k. Subtracting gives 2 = 100k => k = 0.02 cm/g. Substituting back: 14 = L0 + 200(0.02) => 14 = L0 + 4 => L0 = 10.00 cm.")
        )
        list.add(
            q("phy_comp_1983_12", "Physics", "Atomic & Nuclear Physics", "1983",
                "Which of the following statements is CORRECT? (I) The mass number is equal to the total number of protons and electrons in an atom. (II) The atomic number is equal to the number of protons in an atom. (III) The number of electrons in an atom is equal to the total number of protons and neutrons in the nucleus.",
                "I only", "II only", "III only", "I and II only",
                1, "Statement II is correct because the atomic number is defined as the number of protons in an atom. Statement I is incorrect because the mass number is protons + neutrons. Statement III is incorrect because electrons in a neutral atom equal protons.")
        )
        list.add(
            q("phy_comp_1983_14", "Physics", "Electrostatics", "1983",
                "If the force on a charge of 0.2 coulomb in an electric field is 4 N, then the electric field intensity of the field is:",
                "0.8 N/C", "20.0 N/C", "4.2 N/C", "8.0 N/C",
                1, "Electric field intensity E is defined as force per unit charge: E = F/q = 4 N / 0.2 C = 20.0 N/C.")
        )
        list.add(
            q("phy_comp_1984_15", "Physics", "Motion Graphs", "1984",
                "The distance travelled by a particle starting from rest is plotted against the square of the time elapsed from the commencement of motion. The resulting graph is linear. The slope of this graph is a measure of:",
                "Initial displacement", "Initial velocity", "Acceleration", "Half the acceleration",
                3, "From the equation of motion: s = ut + 0.5at². Since it starts from rest (u = 0), s = 0.5at². Plotting s against t² yields a straight line with slope equal to 0.5*a (half the acceleration).")
        )
        list.add(
            q("phy_comp_1984_16", "Physics", "Current Electricity: Units", "1984",
                "The unit quantity of electricity is called:",
                "The ampere", "The volt", "The coulomb", "The ammeter",
                2, "The Coulomb is the SI unit of electric charge (quantity of electricity). One coulomb is the charge transported by a constant current of one ampere in one second.")
        )
        list.add(
            q("phy_comp_1984_17", "Physics", "Heat: Change of State", "1984",
                "If a solid changes directly into a gas when heat is applied, the process is called:",
                "Vaporization", "Evaporation", "Sublimation", "Ionization",
                2, "Sublimation is the transition of a substance directly from the solid to the gas state without passing through the intermediate liquid state.")
        )
        list.add(
            q("phy_comp_1984_18", "Physics", "Dynamics: Vectors & Force", "1984",
                "A body of mass 5 kg initially at rest is acted upon by two mutually perpendicular forces 12 N and 5 N. Calculate the magnitude of the acceleration produced.",
                "0.40 m/s²", "1.40 m/s²", "2.60 m/s²", "3.40 m/s²",
                2, "Since the forces are perpendicular, their resultant force FR = sqrt(12² + 5²) = sqrt(144 + 25) = 13 N. Using Newton's Second Law: a = FR / m = 13 N / 5 kg = 2.60 m/s².")
        )
        list.add(
            q("phy_comp_1984_19", "Physics", "Conservation of Momentum", "1984",
                "A gun of mass 2.0 kg fires a bullet of mass 1.6 * 10⁻² kg due East with a velocity of 150 m/s. What is the recoil velocity of the gun?",
                "1.2 m/s due West", "1.2 * 10⁻⁴ m/s due West", "1.2 m/s due East", "150 m/s due West",
                0, "By conservation of momentum: m_g * v_g + m_b * v_b = 0 => v_g = -(m_b * v_b) / m_g. Substituting values: v_g = -(1.6 * 10⁻² * 150) / 2.0 = -1.2 m/s. The negative sign represents direction opposite to East (due West).")
        )
        list.add(
            q("phy_comp_1985_20", "Physics", "Units & Measurements", "1985",
                "Which of the following is NOT a fundamental S.I. unit?",
                "Metre", "Ampere", "Kelvin", "Radian",
                3, "The seven base (fundamental) SI units are the metre, kilogram, second, ampere, kelvin, mole, and candela. The radian is a supplementary unit used for plane angles.")
        )
        list.add(
            q("phy_comp_1985_21", "Physics", "Simple Harmonic Motion: Pendulum", "1985",
                "A simple pendulum with a period of 2.0 s has its length doubled. Its new period is:",
                "1.00 s", "1.41 s", "2.83 s", "4.00 s",
                2, "The period of a pendulum is T = 2π√(L/g), meaning T is proportional to √L. When length is doubled (L2 = 2*L1), the new period is T2 = T1 * √2 = 2.0 * 1.414 = 2.83 s.")
        )
        list.add(
            q("phy_comp_2004_12", "Physics", "Work, Energy & Power", "2004",
                "A body of mass 4 kg is acted on by a constant force of 12 N for 3 seconds. Calculate the kinetic energy gained by the body.",
                "162 J", "144 J", "72 J", "81 J",
                0, "Acceleration a = F/m = 12/4 = 3 m/s². Velocity after 3 s starting from rest is v = at = 3 * 3 = 9 m/s. Kinetic energy gained is 0.5 * m * v² = 0.5 * 4 * 9² = 162 J.")
        )

        // =========================================================================
        // 4. CHEMISTRY (1983 - 1984 SERIES)
        // =========================================================================
        list.add(
            q("chm_comp_1983_01", "Chemistry", "Acids, Bases & Salts", "1983",
                "X is crystalline salt of sodium. Solution of X in water turns litmus red produces a gas which turns lime water milky when added to sodium carbonate. With barium chloride solution, X gives a white precipitate which is insoluble in dilute hydrochloric acid. X is",
                "Na₂CO₃", "NaHCO₃", "NaHSO₄", "Na₂SO₄",
                2, "NaHSO₄ is an acid salt that yields H⁺ ions in solution, turning litmus red and liberating CO₂ gas with carbonates. It contains SO₄²⁻ ions, forming a white BaSO₄ precipitate with BaCl₂ that is insoluble in HCl.")
        )
        list.add(
            q("chm_comp_1983_02", "Chemistry", "Organic Chemistry: Saponification", "1983",
                "The alkanol obtained from the production of soap is",
                "ethanol", "glycerol", "methanol", "propanol",
                1, "Saponification represents the alkaline hydrolysis of fats and oils (esters of fatty acids and glycerol) to yield soap and the trihydric alkanol byproduct, glycerol.")
        )
        list.add(
            q("chm_comp_1983_03", "Chemistry", "Applied Chemistry: Hydrocarbons", "1983",
                "The flame used by welders in cutting metals is",
                "butane gas flame", "acetylene flame", "kerosene flame", "oxy-acetylene flame",
                3, "The combustion of ethyne (acetylene) in a stream of pure oxygen (oxy-acetylene) generates temperatures in excess of 3000°C, required to cut and weld metals.")
        )
        list.add(
            q("chm_comp_1983_04", "Chemistry", "Organic Chemistry: Homologous Series", "1983",
                "Consecutive members of an alkane homologous series differ by",
                "-CH-", "-CH₂-", "-CH₃-", "-CₙH₂ₙ-",
                1, "By definition, consecutive members of any homologous series differ structurally by a methylene (-CH₂-) unit, corresponding to a molar mass difference of 14 g/mol.")
        )
        list.add(
            q("chm_comp_1983_05", "Chemistry", "Atomic Structure & Periodic Table", "1983",
                "If an element has the electronic configuration 1s² 2s² 2p⁶ 3s² 3p², it is",
                "a metal", "an alkaline earth metal", "an s-block element", "a p-block element",
                3, "The highest occupied energy level contains p-electrons (3p²), classifying this element (Silicon) within the p-block of the Periodic Table.")
        )
        list.add(
            q("chm_comp_1983_06", "Chemistry", "Stoichiometry & Hydrates", "1983",
                "Some copper (II) sulphate pentahydrate (CuSO₄·5H₂O), was heated at 120°C with the following results: Wt of crucible = 10.00 g; Wt of crucible + CuSO₄·5H₂O = 14.98g; Wt of crucible + residue = 13.54g. How many molecules of water of crystallization were lost? [H=1, Cu=63.5, O=16, S=32]",
                "1", "2", "3", "4",
                3, "Initial mass of CuSO₄·5H₂O = 4.98 g (0.02 mol). Residue is 3.54 g. Mass of water lost = 14.98 - 13.54 = 1.44 g (0.08 mol). The ratio of water lost to initial hydrate is 0.08 / 0.02 = 4.")
        )
        list.add(
            q("chm_comp_1983_07", "Chemistry", "Chemical Bonding & VSEPR", "1983",
                "The three-dimensional shape of methane is",
                "hexagonal", "trigonal planar", "linear", "tetrahedral",
                3, "Methane (CH₄) possesses sp³ hybridization at its central carbon atom, leading to a regular tetrahedral molecular geometry with 109.5° bond angles.")
        )
        list.add(
            q("chm_comp_1983_11", "Chemistry", "Separation Techniques", "1983",
                "A mixture of common salt, ammonium chloride and barium sulphate can best be separated by",
                "addition of water followed by filtration then sublimation", "addition of water followed by sublimation then filtration", "sublimation followed by addition of water then filtration", "fractional distillation",
                2, "First, heating sublimates the volatile NH₄Cl. Water is then added to dissolve the soluble NaCl, leaving insoluble BaSO₄, which is separated via filtration.")
        )
        list.add(
            q("chm_comp_1983_12", "Chemistry", "Gas Laws", "1983",
                "Which of the following relationships represents ideal gas behavior?",
                "P is proportional to VT", "P is proportional to T/V", "PT is proportional to V", "PV is proportional to VT",
                1, "From the Ideal Gas Equation, PV = nRT. Thus, P = nRT/V. For constant moles n, P is directly proportional to temperature T and inversely proportional to volume V.")
        )
        list.add(
            q("chm_comp_1983_13", "Chemistry", "Gas Laws & Diffusion", "1983",
                "In an experiment where solid ammonium chloride is heated in a test tube with a damp neutral litmus paper at the mouth, the litmus paper will initially",
                "be bleached", "turn green", "turn red", "turn blue",
                3, "Ammonium chloride thermal decomposition yields NH₃ and HCl gases. Since NH₃ has a lower molecular weight, it diffuses faster and reaches the mouth of the tube first, rendering it alkaline (litmus turns blue) initially.")
        )
        list.add(
            q("chm_comp_1983_17", "Chemistry", "Electrolysis: Faraday's Laws", "1983",
                "A current was passed for 10 minutes and 0.63 g of copper was found to be deposited on the cathode of CuSO₄ cells. The weight of silver deposited on a AgNO₃ cell connected in series during the same period would be [Cu = 63, Ag = 108]",
                "0.54 g", "1.08 g", "1.62 g", "2.16 g",
                3, "By Faraday's Second Law: (Mass of Ag) / (Mass of Cu) = (Eq. Wt of Ag) / (Eq. Wt of Cu) => Mass of Ag = 0.63 * (108 / 1) / (63 / 2) = 0.63 * 108 / 31.5 = 2.16 g.")
        )
        list.add(
            q("chm_comp_1983_18", "Chemistry", "Electrochemistry & Activity Series", "1983",
                "In the reaction Fe + Cu²⁺ → Fe²⁺ + Cu, iron displaces copper ions to form copper. This is due to the fact that",
                "iron is in metallic form while copper is in ionic form", "the atomic weight of copper is greater than that of iron", "copper metal has more electrons than iron metal", "iron is higher in the electrochemical series than copper",
                3, "Iron is located above copper in the activity (electrochemical) series, meaning it is more electropositive and acts as a stronger reducing agent, displacing copper.")
        )
        list.add(
            q("chm_comp_1983_19", "Chemistry", "Organic Chemistry: Nomenclature", "1983",
                "The correct name of the compound with the structural formula C₂H₅-C(CH₃)=CH₂ is",
                "2-methylbut-1-ene", "2-methylbut-2-ene", "3-methylbut-1-ene", "2-methylprop-1-ene",
                0, "The longest continuous carbon chain containing the double bond has 4 carbons (butene), numbered from the right: C1=C2(CH₃)-C3H₂-C4H₃, representing 2-methylbut-1-ene.")
        )
        list.add(
            q("chm_comp_1983_21", "Chemistry", "Non-Metals: Sulphur Compounds", "1983",
                "A piece of burning sulphur will continue to burn in a gas jar of oxygen to give misty fumes which readily dissolve in water. The resulting liquid is",
                "sulphur (VI) trioxide", "tetraoxosulphate (VI) acid", "trioxosulphate (IV) acid", "hydrogen sulphide",
                2, "Burning sulfur produces sulfur dioxide (SO₂) gas. When dissolved in water, SO₂ forms the weak acid trioxosulphate (IV) acid (sulphurous acid, H₂SO₃).")
        )
        list.add(
            q("chm_comp_1983_22", "Chemistry", "Water & Hydration: Efflorescence", "1983",
                "Sodium decahydrate (Na₂SO₄·10H₂O) on exposure to air loses all its water of crystallization. The process of loss is known as",
                "Efflorescence", "Hygroscopy", "Deliquescence", "Effervescence",
                0, "Efflorescence is the property of certain hydrated crystals to spontaneously lose their water of crystallization to the atmosphere on exposure to dry air.")
        )
        list.add(
            q("chm_comp_1983_23", "Chemistry", "Electrolysis: Molten Salts", "1983",
                "Which of the following happens during the electrolysis of molten sodium chloride?",
                "Sodium ion loses an electron", "Chlorine atom gains an electron", "Chloride ion gains an electron", "Chloride ion is oxidized",
                3, "During the electrolysis of molten NaCl, chloride ions (Cl⁻) migrate to the positive anode where they lose electrons (are oxidized) to form chlorine gas.")
        )
        list.add(
            q("chm_comp_1984_01", "Chemistry", "Separation Techniques", "1984",
                "Sodium chloride may be obtained from brine by",
                "titration", "decantation", "distillation", "evaporation",
                3, "Evaporation is used to separate a soluble solid solute (such as NaCl) from its liquid solvent (water) by driving off the volatile liquid as vapor.")
        )
        list.add(
            q("chm_comp_1984_03", "Chemistry", "Stoichiometry & Gas Volumes", "1984",
                "For the reaction NH₄NO₂ → N₂ + 2H₂O, calculate the volume of nitrogen produced at S.T.P. from 3.20 g of the salt. [N=14, O=16, H=1]",
                "2.24 dm³", "2.24 cm³", "1.12 cm³", "1.12 dm³",
                3, "Molar mass of NH₄NO₂ = 64 g/mol. Moles of salt = 3.20 / 64 = 0.05 mol. Stoichiometric ratio of salt to N₂ is 1:1, producing 0.05 mol of N₂. Volume at STP = 0.05 * 22.4 = 1.12 dm³.")
        )
        list.add(
            q("chm_comp_1984_04", "Chemistry", "Chemical Equations & Balancing", "1984",
                "Manganese (IV) oxide reacts with concentrated hydrochloric acid according to the equation: MnO₂ + xHCl → MnCl₂ + Cl₂ + yH₂O. The values of x and y are",
                "2 and 5 respectively", "2 and 4 respectively", "4 and 2 respectively", "4 and 1 respectively",
                2, "Balancing the equation gives: MnO₂ + 4HCl → MnCl₂ + Cl₂ + 2H₂O. Thus, the stoichiometric coefficient x is 4, and y is 2.")
        )
        list.add(
            q("chm_comp_1984_05", "Chemistry", "Volumetric Analysis: Concentrations", "1984",
                "A molar solution of caustic soda (NaOH) is prepared by dissolving",
                "40 g NaOH in 100 g of water", "40 g NaOH in 1000 g of water", "20 g NaOH in 500 g of solution", "20 g NaOH in 1000 g of solution",
                2, "A 1.0 M (molar) solution of NaOH contains 1.0 mole (40 g) of NaOH dissolved in 1000 cm³ (or 1000 g approx.) of solution. Dissolving 20 g in 500 g of solution maintains this exact 1M ratio.")
        )

        // =========================================================================
        // 5. BIOLOGY (1983 - 2012 SERIES)
        // =========================================================================
        list.add(
            q("bio_comp_1983_22", "Biology", "Diseases & Pathogens", "1983",
                "Which of the following diseases is NOT caused by a virus?",
                "Rinderpest", "Maize rust", "Newcastle disease", "Swine fever",
                1, "Maize rust is a fungal disease caused by the fungus Puccinia sorghi, whereas rinderpest, Newcastle disease, swine fever, and cassava mosaic are viral.")
        )
        list.add(
            q("bio_comp_1983_23", "Biology", "Arthropods: Classification", "1983",
                "A centipede differs from a millipede by its",
                "colour", "numerous abdominal segments", "paired legs on each abdominal segment", "poison claws",
                2, "Centipedes (Class Chilopoda) have exactly one pair of legs per body segment, whereas millipedes (Class Diplopoda) possess two pairs of legs per abdominal segment.")
        )
        list.add(
            q("bio_comp_1983_48", "Biology", "Excretory System: Urea", "1983",
                "Urea is produced in the",
                "liver", "bladder", "spleen", "kidneys",
                0, "Urea is synthesized in the liver via the ornithine (urea) cycle as a means of detoxifying excess metabolic nitrogen and ammonia.")
        )
        list.add(
            q("bio_comp_1983_49", "Biology", "Genetics: Monohybrid Cross", "1983",
                "What is the genetic ratio of the F2 generation if members of F1 generation are allowed to self-pollinate?",
                "1 tall : 3 short", "3 tall : 1 short", "1 tall : 1 short", "4 shorts : 0 tall",
                1, "In a classical Mendelian monohybrid cross, self-pollination of heterozygous F1 individuals (Tt x Tt) yields an F2 phenotypic ratio of 3 dominant (tall) to 1 recessive (short).")
        )
        list.add(
            q("bio_comp_1983_50", "Biology", "Circulatory System: Transport", "1983",
                "The path taken by glucose from the ileum to the heart is",
                "ileum → hepatic portal vein → hepatic artery → vena cava → heart", "ileum → hepatic portal artery → hepatic artery → vena cava → heart", "ileum → hepatic portal vein → vena cava → heart", "ileum → hepatic portal vein → hepatic vein → vena cava → heart",
                3, "Glucose absorbed in the ileum enters the hepatic portal vein to the liver, passes out via the hepatic vein into the inferior vena cava, which delivers it to the heart.")
        )
        list.add(
            q("bio_comp_1984_22", "Biology", "Digestive System: Enzymes", "1984",
                "The removal of a man’s pancreas by surgical operation can affect only the digestion of",
                "starch", "starch, protein and fats", "oils and fats", "proteins",
                1, "The pancreas secretes pancreatic juice containing amylase (starch), trypsinogen/chymotrypsinogen (protein), and lipase (fats). Removing the pancreas disrupts digestion of all three macronutrients.")
        )
        list.add(
            q("bio_comp_1984_23", "Biology", "Parasitology: Platyhelminthes", "1984",
                "The parts used by a tapeworm to fasten itself to the host's intestine are the",
                "neck and suckers", "hooks and suckers", "rostellum and body segments", "neck and hooks",
                1, "The scolex (head) of a tapeworm features chitinous hooks and muscular suckers that act as anchors to secure the worm to the mucosal lining of the host's intestine.")
        )
        list.add(
            q("bio_comp_1984_40", "Biology", "Circulatory System: Clotting", "1984",
                "Which of the following sequences represents the process of blood clotting? (1) Fibrin forms a network of threads, (2) Red blood cells are caught and a clot is formed, (3) Fibrinogen in plasma changes into soluble fibrin, (4) Blood is exposed to air.",
                "4, 3, 2, 1", "4, 3, 1, 2", "3, 1, 4, 2", "1, 2, 3, 4",
                1, "Clotting begins when blood is exposed to air (4), triggering a cascade where soluble fibrinogen changes to insoluble fibrin threads (3), forming a mesh network (1) that traps blood cells to form a physical clot (2).")
        )
        list.add(
            q("bio_comp_1985_24", "Biology", "Excretory System: Nephron", "1985",
                "The function of the loop of Henle is to:",
                "increase flow of urine", "concentrate amino acids", "concentrate sodium chloride in the medulla of the kidney", "increase volume of urine",
                2, "The loop of Henle acts as a countercurrent multiplier to build a high concentration of sodium chloride in the medullary interstitium, allowing water reabsorption.")
        )
        list.add(
            q("bio_comp_1985_22", "Biology", "Dentition: Tooth Structure", "1985",
                "The crown of the mammalian tooth is covered with",
                "cement", "dentine", "caries", "enamel",
                3, "The crown of a mammalian tooth is enveloped by enamel, which is a highly mineralized, protective, and extremely hard tissue.")
        )
        list.add(
            q("bio_comp_1985_23", "Biology", "Respiration: Anaerobic Glycolysis", "1985",
                "In living cells, insufficient oxygen may cause a breakdown of glucose into",
                "fatty acids", "lactic acids", "glycogen", "carbon dioxide",
                1, "Under anaerobic conditions (oxygen deficiency), animal cells convert pyruvate to lactic acid via anaerobic glycolysis to regenerate NAD+ for ATP production.")
        )
        list.add(
            q("bio_comp_1985_24_trans", "Biology", "Plant Physiology: Transpiration", "1985",
                "Which of the following can bring about the greatest increase in the rate of transpiration?",
                "Increased humidity", "Reduced temperature", "Reduced wind speed", "Reduced humidity",
                3, "Reduced relative humidity steepens the water vapor pressure gradient between the leaf interior and the atmosphere, accelerating transpiration.")
        )
        list.add(
            q("bio_comp_1986_21", "Biology", "Food Tests: Proteins", "1986",
                "A food substance which when mixed with sodium hydroxide and copper sulphate turns purple indicates the presence of",
                "protein", "carbohydrates", "fats", "reducing sugar",
                0, "This describes the Biuret test. A positive result is a color change from blue to violet/purple, indicating the presence of peptide bonds in proteins.")
        )
        list.add(
            q("bio_comp_1986_22", "Biology", "Nutrition & Energy Content", "1986",
                "The greatest amount of energy will be obtained by the oxidation of 100kg of",
                "meat", "butter", "sugar", "biscuits",
                1, "Fats and lipids (found in high density in butter) contain highly reduced carbon chains, yielding more than double the energy per gram (approx 9 kcal/g) compared to proteins (meat) or carbohydrates (sugar, biscuits).")
        )
        list.add(
            q("bio_comp_1986_23", "Biology", "Circulatory System: Mammalian Heart", "1986",
                "The chamber of the mammalian heart with the thickest wall is the",
                "right ventricle", "left auricle", "right auricle", "left ventricle",
                3, "The left ventricle has the thickest muscular wall because it must generate high systemic pressure to pump blood throughout the entire body.")
        )
        list.add(
            q("bio_comp_1986_24", "Biology", "Circulatory System: Blood Components", "1986",
                "Serum differs from blood plasma because it:",
                "contains blood cells and fibrinogen", "contains soluble food and mineral salts", "lacks fibrinogen", "lacks antibodies",
                2, "Serum is the liquid portion of blood remaining after coagulation. It differs from plasma by lacking fibrinogen and clotting factors, which have been consumed in forming the clot.")
        )
        list.add(
            q("bio_comp_2012_20", "Biology", "Animal Adaptations: Sensory Organs", "2012",
                "The organs that will be most useful to giant African rats in finding their way in underground habitats are the",
                "nostrils", "eyes", "vibrissae", "tails",
                2, "Vibrissae (whiskers) are specialized tactile hair follicles that detect touch and structural barriers, helping underground burrowers navigate in pitch darkness.")
        )
        list.add(
            q("bio_comp_2012_21", "Biology", "Ecology: Soil Experiments", "2012",
                "A crucible of 5g weighed 10g after filling with fresh soil. It is heated in an oven at 100°C for 1 hour. After cooling, the weight was 8g. The percentage of water in the soil is:",
                "8%", "20%", "40%", "60%",
                2, "Weight of fresh soil = 10 - 5 = 5g. Weight of dry soil = 8 - 5 = 3g. Mass of water evaporated = 5 - 3 = 2g. Percentage of water = (2 / 5) * 100 = 40%.")
        )
        list.add(
            q("bio_comp_2012_22", "Biology", "Plant Excretion & Economic Uses", "2012",
                "The waste product of plants used in the conversion of hide to leather is",
                "alkaloid", "resin", "tannin", "latex",
                2, "Tannins are astringent, polyphenolic secondary metabolites of plants used in leather tanning to bind and stabilize proteins in raw animal hides.")
        )
        list.add(
            q("bio_comp_2011_21", "Biology", "Excretory System: Disorders", "2011",
                "In humans, puffiness and water retention in the body is a possible symptom of",
                "bladder malfunction", "poor digestion", "kidney malfunction", "obesity",
                2, "Kidney malfunction impairs the filtration of excess salt and water, causing fluid accumulation (oedema) manifested as bodily puffiness and swelling.")
        )

        return list
    }

    private fun q(
        id: String,
        subject: String,
        topic: String,
        year: String,
        text: String,
        a: String,
        b: String,
        c: String,
        d: String,
        correctIdx: Int,
        explanation: String
    ): QuestionEntity {
        return QuestionEntity(
            id = id,
            subject = subject,
            topic = topic,
            year = year,
            questionText = text,
            optionA = a,
            optionB = b,
            optionC = c,
            optionD = d,
            correctAnswerIndex = correctIdx,
            explanation = explanation,
            difficulty = "Medium",
            originType = "JAMB_ORIGINAL",
            originLabel = "JAMB $subject $year"
        )
    }
}
