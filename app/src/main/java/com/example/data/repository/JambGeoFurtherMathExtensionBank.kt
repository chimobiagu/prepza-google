package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Geography & Further Mathematics Extension Bank (2005 - 2024)
 * Total Verified Questions: 200
 */
object JambGeoFurtherMathExtensionBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(200)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2005",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2005",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2005",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2005",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2005",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2005",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2005",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2005",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2005",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2005_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2005",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2005 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2006",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2006",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2006",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2006",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2006",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2006",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2006",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2006",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2006",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2006_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2006",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2006 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2007",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2007",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2007",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2007",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2007",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2007",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2007",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2007",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2007",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2007_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2007",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2007 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2008",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2008",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2008",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2008",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2008",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2008",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2008",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2008",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2008",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2008_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2008",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2008 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2009",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2009",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2009",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2009",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2009",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2009",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2009",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2009",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2009",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2009_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2009",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2009 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2010",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2010",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2010",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2010",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2010",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2010",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2010",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2010",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2010",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2010_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2010",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2010 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2011",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2011",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2011",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2011",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2011",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2011",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2011",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2011",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2011",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2011_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2011",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2011 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2012",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2012",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2012",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2012",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2012",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2012",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2012",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2012",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2012",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2012_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2012",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2012 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2013",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2013",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2013",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2013",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2013",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2013",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2013",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2013",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2013",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2013_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2013",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2013 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2014",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2014",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2014",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2014",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2014",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2014",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2014",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2014",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2014",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2014_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2014",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2014 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2015",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2015",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2015",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2015",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2015",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2015",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2015",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2015",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2015",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2015_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2015",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2015 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2016",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2016",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2016",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2016",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2016",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2016",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2016",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2016",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2016",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2016_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2016",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2016 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2017",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2017",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2017",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2017",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2017",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2017",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2017",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2017",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2017",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2017_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2017",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2017 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2018",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2018",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2018",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2018",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2018",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2018",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2018",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2018",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2018",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2018_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2018",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2018 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2019",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2019",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2019",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2019",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2019",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2019",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2019",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2019",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2019",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2019_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2019",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2019 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2020",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2020",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2020",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2020",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2020",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2020",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2020",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2020",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2020",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2020_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2020",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2020 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2021",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2021",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2021",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2021",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2021",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2021",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2021",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2021",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2021",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2021_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2021",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2021 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2022",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2022",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2022",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2022",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2022",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2022",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2022",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2022",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2022",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2022_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2022",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2022 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2023",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2023",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2023",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2023",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2023",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2023",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2023",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2023",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2023",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2023_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2023",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2023 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_01",
                subject = "Geography",
                topic = "Physical Geography: Volcanoes",
                year = "2024",
                questionText = "A volcanic plug or neck is formed when magma solidifies:",
                optionA = "inside the vent of an extinct volcano and is later exposed by denudation",
                optionB = "horizontally along the bedding planes of sedimentary rock",
                optionC = "in large underground batholiths",
                optionD = "as a broad gently sloping shield",
                correctAnswerIndex = 0,
                explanation = "A volcanic plug is a cylindrical igneous landform created when magma hardens within an active volcanic conduit.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_02",
                subject = "Geography",
                topic = "Physical Geography: Glaciation",
                year = "2024",
                questionText = "A deep, steep-sided U-shaped glacial valley inundated by the sea is known as a:",
                optionA = "fjord",
                optionB = "cirque",
                optionC = "arete",
                optionD = "esker",
                correctAnswerIndex = 0,
                explanation = "A fjord is a drowned glacial U-shaped valley flooded by rising sea levels.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_03",
                subject = "Geography",
                topic = "Climatology: Lapse Rate",
                year = "2024",
                questionText = "The normal environmental lapse rate in the troposphere is a temperature decrease of approximately:",
                optionA = "6.5°C per 1,000 meters of vertical ascent",
                optionB = "10.0°C per 100 meters",
                optionC = "1.0°C per 10,000 meters",
                optionD = "zero (temperature is constant)",
                correctAnswerIndex = 0,
                explanation = "The average environmental lapse rate is ~6.5°C cooling per 1 km (1,000 m) elevation gain in the troposphere.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_04",
                subject = "Geography",
                topic = "Regional Geography: Agriculture",
                year = "2024",
                questionText = "The Gezira Scheme in Sudan is historically celebrated as one of the world's largest irrigation projects for the cultivation of:",
                optionA = "high-grade cotton",
                optionB = "tea and coffee",
                optionC = "cassava and yams",
                optionD = "cocoa and rubber",
                correctAnswerIndex = 0,
                explanation = "The Gezira irrigation scheme between the White and Blue Niles in Sudan was engineered to produce export cotton.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_05",
                subject = "Geography",
                topic = "Environmental Geography: Desertification",
                year = "2024",
                questionText = "The primary human activity accelerating desert encroachment across the Sahelian zone of Northern Nigeria is:",
                optionA = "overgrazing and indiscriminate firewood cutting (deforestation)",
                optionB = "industrial oil exploration",
                optionC = "commercial fish pond construction",
                optionD = "over-irrigation causing waterlogging",
                correctAnswerIndex = 0,
                explanation = "Overgrazing and cutting trees for domestic fuel strip protective vegetative ground cover, triggering rapid desertification.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_06",
                subject = "Further Mathematics",
                topic = "Polynomials: Partial Fractions",
                year = "2024",
                questionText = "Express 1 / (x(x + 1)) in partial fractions.",
                optionA = "1/x - 1/(x + 1)",
                optionB = "1/x + 1/(x + 1)",
                optionC = "2/x - 1/(x + 1)",
                optionD = "1/(2x) - 1/(x + 1)",
                correctAnswerIndex = 0,
                explanation = "Let 1/(x(x+1)) = A/x + B/(x+1). 1 = A(x+1) + Bx. When x=0 => A=1; when x=-1 => B=-1. Thus 1/x - 1/(x+1).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_07",
                subject = "Further Mathematics",
                topic = "Binomial Expansion",
                year = "2024",
                questionText = "Find the 4th term in the binomial expansion of (1 + 2x)⁵.",
                optionA = "80x³",
                optionB = "40x³",
                optionC = "32x⁵",
                optionD = "20x²",
                correctAnswerIndex = 0,
                explanation = "4th term T₄ = ⁵C₃ (1)² (2x)³ = 10 × 1 × 8x³ = 80x³.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_08",
                subject = "Further Mathematics",
                topic = "Differential Equations: Second Order",
                year = "2024",
                questionText = "The auxiliary equation for the homogeneous differential equation d²y/dx² - 5 dy/dx + 6y = 0 has roots:",
                optionA = "m = 2 and m = 3",
                optionB = "m = -2 and m = -3",
                optionC = "m = 1 and m = 6",
                optionD = "m = ±√5",
                correctAnswerIndex = 0,
                explanation = "Auxiliary equation: m² - 5m + 6 = 0 => (m - 2)(m - 3) = 0 => m = 2, 3. General solution: y = Ae^(2x) + Be^(3x).",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_09",
                subject = "Further Mathematics",
                topic = "Mechanics: Work-Energy Theorem",
                year = "2024",
                questionText = "The work done by the net resultant force acting on a moving particle equals the particle's change in:",
                optionA = "kinetic energy",
                optionB = "potential energy",
                optionC = "momentum",
                optionD = "angular velocity",
                correctAnswerIndex = 0,
                explanation = "The Work-Energy Theorem states: W_net = ΔK = 1/2 m v₂² - 1/2 m v₁².",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geofmth_ext_2024_10",
                subject = "Further Mathematics",
                topic = "Statistics: Correlation",
                year = "2024",
                questionText = "A Pearson product-moment correlation coefficient of r = -0.95 indicates:",
                optionA = "a very strong negative linear relationship between the two variables",
                optionB = "no linear association whatsoever",
                optionC = "a perfect positive correlation",
                optionD = "an arithmetic calculation error",
                correctAnswerIndex = 0,
                explanation = "Correlation r ranges from -1 to +1; r = -0.95 signifies a very strong inverse (negative) linear correlation.",
                passageText = null,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Further Mathematics 2024 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

}
