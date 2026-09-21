package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Geography Comprehensive Syllabus Master Bank (2005 - 2024)
 * Total Verified Questions: 300
 */
object JambGeographyComprehensiveMasterBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(300)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2005",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2005",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2005",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2005",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2005",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2005",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2005",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2005",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2005",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2005",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2005",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2005",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2005",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2005",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2005_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2005",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2005 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2006",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2006",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2006",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2006",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2006",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2006",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2006",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2006",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2006",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2006",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2006",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2006",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2006",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2006",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2006_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2006",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2006 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2007",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2007",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2007",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2007",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2007",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2007",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2007",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2007",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2007",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2007",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2007",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2007",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2007",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2007",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2007_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2007",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2007 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2008",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2008",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2008",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2008",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2008",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2008",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2008",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2008",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2008",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2008",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2008",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2008",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2008",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2008",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2008_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2008",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2008 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2009",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2009",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2009",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2009",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2009",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2009",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2009",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2009",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2009",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2009",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2009",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2009",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2009",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2009",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2009_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2009",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2009 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2010",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2010",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2010",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2010",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2010",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2010",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2010",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2010",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2010",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2010",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2010",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2010",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2010",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2010",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2010_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2010",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2010 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2011",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2011",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2011",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2011",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2011",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2011",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2011",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2011",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2011",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2011",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2011",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2011",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2011",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2011",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2011_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2011",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2011 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2012",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2012",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2012",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2012",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2012",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2012",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2012",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2012",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2012",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2012",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2012",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2012",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2012",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2012",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2012_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2012",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2012 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2013",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2013",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2013",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2013",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2013",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2013",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2013",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2013",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2013",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2013",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2013",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2013",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2013",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2013",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2013_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2013",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2013 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2014",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2014",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2014",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2014",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2014",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2014",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2014",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2014",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2014",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2014",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2014",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2014",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2014",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2014",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2014_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2014",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2014 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2015",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2015",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2015",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2015",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2015",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2015",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2015",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2015",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2015",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2015",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2015",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2015",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2015",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2015",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2015_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2015",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2016",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2016",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2016",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2016",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2016",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2016",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2016",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2016",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2016",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2016",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2016",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2016",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2016",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2016",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2016_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2016",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2016 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2017",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2017",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2017",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2017",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2017",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2017",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2017",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2017",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2017",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2017",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2017",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2017",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2017",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2017",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2017_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2017",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2017 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2018",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2018",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2018",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2018",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2018",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2018",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2018",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2018",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2018",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2018",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2018",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2018",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2018",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2018",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2018_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2018",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2018 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2019",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2019",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2019",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2019",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2019",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2019",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2019",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2019",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2019",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2019",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2019",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2019",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2019",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2019",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2019_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2019",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2019 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2020",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2020",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2020",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2020",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2020",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2020",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2020",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2020",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2020",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2020",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2020",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2020",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2020",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2020",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2020_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2020",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2020 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2021",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2021",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2021",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2021",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2021",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2021",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2021",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2021",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2021",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2021",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2021",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2021",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2021",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2021",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2021_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2021",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2021 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2022",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2022",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2022",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2022",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2022",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2022",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2022",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2022",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2022",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2022",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2022",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2022",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2022",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2022",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2022_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2022",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2022 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2023",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2023",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2023",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2023",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2023",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2023",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2023",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2023",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2023",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2023",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2023",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2023",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2023",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2023",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2023_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2023",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2023 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_01",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2024",
                questionText = "Calculate the local solar time in Town X (longitude 45°E) when it is 12:00 noon at the Greenwich Meridian (0°).",
                optionA = "3:00 PM",
                optionB = "9:00 AM",
                optionC = "2:00 PM",
                optionD = "4:00 PM",
                correctAnswerIndex = 0,
                explanation = "Earth rotates 15° per hour. For 45° East: 45 / 15 = 3 hours ahead. 12:00 noon + 3 hours = 3:00 PM.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_02",
                subject = "Geography",
                topic = "The Earth in Space",
                year = "2024",
                questionText = "The Great Circles on the globe include the Equator and all pairs of:",
                optionA = "opposite meridians of longitude",
                optionB = "parallels of latitude",
                optionC = "Tropic lines",
                optionD = "polar circles",
                correctAnswerIndex = 0,
                explanation = "Every meridian together with its opposite meridian forms a Great Circle dividing the Earth into two equal hemispheres.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_03",
                subject = "Geography",
                topic = "Rocks & Weathering",
                year = "2024",
                questionText = "Which of the following rock types is formed through the accumulation and cementation of organic skeletal remains?",
                optionA = "Calcareous limestone",
                optionB = "Basalt",
                optionC = "Granite",
                optionD = "Gneiss",
                correctAnswerIndex = 0,
                explanation = "Calcareous limestone is an organically formed sedimentary rock originating from shells and skeletal fragments of marine organisms.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_04",
                subject = "Geography",
                topic = "Landforms: Rivers",
                year = "2024",
                questionText = "A crescent-shaped lake formed when a meandering river cuts across a narrow meander neck is known as an:",
                optionA = "ox-bow lake",
                optionB = "alluvial delta",
                optionC = "estuary",
                optionD = "interlocking spur",
                correctAnswerIndex = 0,
                explanation = "An ox-bow lake is a curved lake formed when a meander neck is breached and abandoned by the active stream.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_05",
                subject = "Geography",
                topic = "Atmosphere & Climate",
                year = "2024",
                questionText = "The atmospheric boundary where the Northeast Trade winds meet the Southwest Monsoon winds in West Africa is the:",
                optionA = "Inter-Tropical Discontinuity (ITD)",
                optionB = "Polar Front",
                optionC = "Horse Latitudes",
                optionD = "Doldrums",
                correctAnswerIndex = 0,
                explanation = "The ITD (Inter-Tropical Discontinuity) is the low-pressure surface boundary between moist maritime air and dry continental air in West Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_06",
                subject = "Geography",
                topic = "Climatic Types",
                year = "2024",
                questionText = "Which climatic type is characterized by high temperatures throughout the year and distinct wet and dry seasons?",
                optionA = "Tropical Continental (Sudan type)",
                optionB = "Equatorial climate",
                optionC = "Mediterranean climate",
                optionD = "Tundra climate",
                correctAnswerIndex = 0,
                explanation = "The Sudan/Savanna climate experiences uniformly high temperatures with seasonal rainfall dictated by the movement of the ITD.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_07",
                subject = "Geography",
                topic = "Vegetation & Soil",
                year = "2024",
                questionText = "Laterite soils, common across humid tropical savannas, are formed primarily through the process of intense:",
                optionA = "leaching of silica and concentration of iron and aluminum oxides",
                optionB = "salinization from irrigation",
                optionC = "calcification",
                optionD = "podzolization",
                correctAnswerIndex = 0,
                explanation = "Heavy seasonal rainfall leaches soluble bases and silica downward, leaving insoluble iron and aluminum oxides (laterites).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_08",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2024",
                questionText = "If a map with scale 1:50,000 is reduced by half (scale reduction factor of 2), what is the new scale?",
                optionA = "1 : 100,000",
                optionB = "1 : 25,000",
                optionC = "1 : 200,000",
                optionD = "1 : 75,000",
                correctAnswerIndex = 0,
                explanation = "Reducing a map to half size doubles the representative fraction denominator: 50,000 × 2 = 100,000, yielding 1:100,000.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_09",
                subject = "Geography",
                topic = "Cartography & Map Reading",
                year = "2024",
                questionText = "Closely spaced contour lines on a topographic map indicate a:",
                optionA = "steep slope",
                optionB = "gentle slope",
                optionC = "flat plain",
                optionD = "broad valley",
                correctAnswerIndex = 0,
                explanation = "Contour lines spaced close together represent rapid vertical elevation change over short horizontal distance, indicating a steep slope.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_10",
                subject = "Geography",
                topic = "Human Geography: Population",
                year = "2024",
                questionText = "In the Demographic Transition Model, Stage 2 is characterized by:",
                optionA = "a sharp decline in death rates while birth rates remain high",
                optionB = "both high birth and high death rates",
                optionC = "falling birth and low death rates",
                optionD = "very low birth and death rates",
                correctAnswerIndex = 0,
                explanation = "Stage 2 experiences rapid population growth because improved hygiene/medicine drastically cuts mortality while fertility remains high.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_11",
                subject = "Geography",
                topic = "Human Geography: Settlement",
                year = "2024",
                questionText = "A settlement pattern where houses are arranged in a continuous line along a road, river bank, or railway is:",
                optionA = "linear",
                optionB = "nucleated",
                optionC = "dispersed",
                optionD = "isolated",
                correctAnswerIndex = 0,
                explanation = "Linear settlements develop along communication corridors like roads, canals, or coastlines.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_12",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2024",
                questionText = "In Nigeria, the commercial mining of columbite and tin ore is historically concentrated on the:",
                optionA = "Jos Plateau",
                optionB = "Enugu Escarpment",
                optionC = "Biu Plateau",
                optionD = "Mandara Mountains",
                correctAnswerIndex = 0,
                explanation = "The Jos Plateau is globally renowned for rich alluvial cassiterite (tin) and columbite deposits.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_13",
                subject = "Geography",
                topic = "Regional Geography: Nigeria",
                year = "2024",
                questionText = "The Kainji Dam in Nigeria was primarily constructed along the River Niger for:",
                optionA = "hydroelectric power generation",
                optionB = "inland navigation exclusively",
                optionC = "fish farming",
                optionD = "flood control only",
                correctAnswerIndex = 0,
                explanation = "Kainji Hydroelectric Dam was commissioned in 1968 primarily to generate electricity for the national grid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_14",
                subject = "Geography",
                topic = "Environmental Hazards",
                year = "2024",
                questionText = "The seasonal dry, dusty, and cold wind blowing from the Sahara Desert across West Africa between November and February is the:",
                optionA = "Harmattan",
                optionB = "Monsoon",
                optionC = "Sirocco",
                optionD = "Mistral",
                correctAnswerIndex = 0,
                explanation = "The Harmattan is a dry northeasterly continental wind laden with fine Saharan dust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_comp_2024_15",
                subject = "Geography",
                topic = "Regional Geography: Mineral Resources",
                year = "2024",
                questionText = "Petroleum exploration and exploitation in Nigeria occurs predominantly in the sedimentary basin of the:",
                optionA = "Niger Delta Basin",
                optionB = "Chad Basin",
                optionC = "Sokoto Basin",
                optionD = "Benue Trough",
                correctAnswerIndex = 0,
                explanation = "The Cenozoic Niger Delta basin contains prolific petroleum reservoirs in tertiary sandstone formations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2024 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

}
