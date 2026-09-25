package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Verified JAMB Geography 2015 Complete Past Paper Bank (81 Questions).
 * Complete questions, verified options, answers, and geographic explanations.
 */
object JambGeography2015CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_01",
                subject = "Geography",
                topic = "Natural Resources",
                year = "2015",
                questionText = "The following are natural resources except",
                optionA = "rubber",
                optionB = "soil",
                optionC = "water",
                optionD = "cellphane",
                correctAnswerIndex = 3,
                explanation = "Cellophane is an artificial/synthetic material made from cellulose, whereas rubber, soil, and water are naturally occurring natural resources.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_02",
                subject = "Geography",
                topic = "Landforms: Mountains",
                year = "2015",
                questionText = "All these are examples of fold mountains except",
                optionA = "Himalayas",
                optionB = "Rockies",
                optionC = "Andes",
                optionD = "Voges Mountain",
                correctAnswerIndex = 3,
                explanation = "Vosges Mountain in France is an example of a block mountain (horst) formed by faulting, while Himalayas, Rockies, and Andes are fold mountains formed by compressional forces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_03",
                subject = "Geography",
                topic = "Plains and Landforms",
                year = "2015",
                questionText = "All the following are fertile plains except",
                optionA = "loess plains",
                optionB = "alluvial plains",
                optionC = "erosional plains",
                optionD = "flood plain",
                correctAnswerIndex = 2,
                explanation = "Erosional plains are formed as a result of the washing away (denudation) of fertile topsoil, leaving behind poorer subsoil, unlike fertile depositional plains.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_04",
                subject = "Geography",
                topic = "World Population",
                year = "2015",
                questionText = "The current world population is estimated at about",
                optionA = "2.0 billion",
                optionB = "7.0 billion",
                optionC = "6.0 billion",
                optionD = "4.0 billion",
                correctAnswerIndex = 1,
                explanation = "Global human population crossed 7 billion in 2011 and is estimated around 7.3+ billion in modern past examinations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_05",
                subject = "Geography",
                topic = "Ecology & Soil",
                year = "2015",
                questionText = "Soil factors in an ecosystem are referred to as",
                optionA = "topographic",
                optionB = "climatic",
                optionC = "biotic",
                optionD = "edaphic",
                correctAnswerIndex = 3,
                explanation = "Edaphic factors relate to the structure and chemical composition of the soil in an ecosystem.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_06",
                subject = "Geography",
                topic = "Weathering",
                year = "2015",
                questionText = "Which of the following is associated with physical weathering?",
                optionA = "carbonation of limestone",
                optionB = "hydrolysis of feldspar",
                optionC = "alternating wet and dry land/rock",
                optionD = "oxidation of iron",
                correctAnswerIndex = 2,
                explanation = "Alternating wetting and drying causes rock expansion and contraction leading to disintegration by physical/mechanical weathering.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_07",
                subject = "Geography",
                topic = "Earth in Space",
                year = "2015",
                questionText = "The axis of the earth is inclined to the plane of the ecliptic at an angle of",
                optionA = "66°",
                optionB = "23.5°",
                optionC = "90°",
                optionD = "45°",
                correctAnswerIndex = 0,
                explanation = "The earth's axis of rotation is inclined at an angle of 66.5° (approx. 66°) to the plane of the earth's orbit (the ecliptic plane).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_08",
                subject = "Geography",
                topic = "Geography of West Africa",
                year = "2015",
                questionText = "West Africa is located between latitudes",
                optionA = "4° N and 20° N",
                optionB = "3° N and 15° N",
                optionC = "2° N and 10° N",
                optionD = "10° N and 15° N",
                correctAnswerIndex = 0,
                explanation = "West Africa extends latitudinally from approximately 4°N (near the Gulf of Guinea) to 20°N (in the Sahara desert).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_09",
                subject = "Geography",
                topic = "Agriculture",
                year = "2015",
                questionText = "All the following crops are involved in plantation agriculture except",
                optionA = "rubber",
                optionB = "wheat",
                optionC = "cocoa",
                optionD = "oil palm",
                correctAnswerIndex = 1,
                explanation = "Wheat is grown extensively as a cereal grain on temperate grasslands/farms rather than as a tropical tree crop in plantation agriculture.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_10",
                subject = "Geography",
                topic = "Ecosystem & Environment",
                year = "2015",
                questionText = "In a food chain, the position occupied by an organism is called",
                optionA = "the trophic level",
                optionB = "energy level",
                optionC = "the feeding level",
                optionD = "the habitat level",
                correctAnswerIndex = 0,
                explanation = "The trophic level of an organism is the position it occupies in a food web/chain (e.g., primary producer, primary consumer).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_11",
                subject = "Geography",
                topic = "Environmental Conservation",
                year = "2015",
                questionText = "Tropical rainforest can be conserved by the following practices except",
                optionA = "agroforestry",
                optionB = "deforestation",
                optionC = "selective logging",
                optionD = "crop rotation",
                correctAnswerIndex = 1,
                explanation = "Deforestation (indiscriminate felling of trees) destroys forest ecosystems rather than conserving them.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_12",
                subject = "Geography",
                topic = "Population Geography",
                year = "2015",
                questionText = "Population growth rate may be defined as the",
                optionA = "mortality rate per unit area over a period",
                optionB = "number of times an organism occurs within a given period",
                optionC = "number of particular species per unit area",
                optionD = "net rate of mortality rate per unit area over a period",
                correctAnswerIndex = 3,
                explanation = "Population growth rate represents the net rate at which the population increases or decreases over a specified time interval.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_13",
                subject = "Geography",
                topic = "Vegetation Belts",
                year = "2015",
                questionText = "Tall trees with buttress roots are associated with",
                optionA = "rainforest",
                optionB = "guinea savanna",
                optionC = "Sudan savanna",
                optionD = "Sahel savanna",
                correctAnswerIndex = 0,
                explanation = "Large emergent trees in tropical rainforests develop wide buttress roots to provide mechanical support in shallow, nutrient-poor soils.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_14",
                subject = "Geography",
                topic = "Natural Resources",
                year = "2015",
                questionText = "Which of the following resources is renewable?",
                optionA = "livestock",
                optionB = "mineral",
                optionC = "crude petroleum",
                optionD = "coal",
                correctAnswerIndex = 0,
                explanation = "Livestock and biomass are biological resources capable of natural reproduction and replenishment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_15",
                subject = "Geography",
                topic = "Earth in Space",
                year = "2015",
                questionText = "The solar system comprises the sun and its",
                optionA = "seven planets",
                optionB = "eight planets",
                optionC = "nine planets",
                optionD = "six planet",
                correctAnswerIndex = 2,
                explanation = "Under historic JAMB syllabi questions, the solar system comprises the sun and its nine planets (including Pluto).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_16",
                subject = "Geography",
                topic = "Equinox & Solstice",
                year = "2015",
                questionText = "On September 23rd, all towns or cities in the northern hemisphere experience",
                optionA = "equal length of day and night",
                optionB = "complete daylight",
                optionC = "longer nights and shorter days",
                optionD = "longer days and shorter nights",
                correctAnswerIndex = 0,
                explanation = "During the Autumnal Equinox on September 23rd, the sun is vertical at the equator, producing equal 12-hour day and night worldwide.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_17",
                subject = "Geography",
                topic = "Population Geography",
                year = "2015",
                questionText = "Density, mortality, and birth rate are factors that affect",
                optionA = "population",
                optionB = "dominance",
                optionC = "cover",
                optionD = "habitat",
                correctAnswerIndex = 0,
                explanation = "Population dynamics are fundamentally governed by birth rate (natality), death rate (mortality), and spatial density.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_18",
                subject = "Geography",
                topic = "Agricultural Systems",
                year = "2015",
                questionText = "The predominant system of agriculture among rural farmers in Nigeria is",
                optionA = "terrace farming",
                optionB = "irrigation farming",
                optionC = "plantation agriculture",
                optionD = "bush fallowing",
                correctAnswerIndex = 3,
                explanation = "Bush fallowing involves clearing and farming a piece of land for some years and leaving it fallow to naturally restore soil fertility.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_19",
                subject = "Geography",
                topic = "Landforms: Mountains",
                year = "2015",
                questionText = "What type of mountain is associated with synclines and anticlines?",
                optionA = "Block mountain",
                optionB = "fold mountain",
                optionC = "volcanic mountain",
                optionD = "residual mountain",
                correctAnswerIndex = 1,
                explanation = "Fold mountains are formed by lateral compressional forces causing rock strata to bend into upfolds (anticlines) and downfolds (synclines).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_20",
                subject = "Geography",
                topic = "Earthquakes & Volcanism",
                year = "2015",
                questionText = "The instrument used for recording the vibrations and intensity of an earthquake is called",
                optionA = "Epicenter",
                optionB = "Ismograph",
                optionC = "thermometer",
                optionD = "seismograph",
                correctAnswerIndex = 3,
                explanation = "A seismograph is the scientific instrument that detects and records seismic vibrations produced by earthquakes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_21",
                subject = "Geography",
                topic = "Industrial Geography of Nigeria",
                year = "2015",
                questionText = "All of these are major industrial zones in Nigeria except",
                optionA = "the western industrial zones",
                optionB = "the south east industrial zone",
                optionC = "the north central industrial zone",
                optionD = "the south/south industrial zone",
                correctAnswerIndex = 3,
                explanation = "The recognized manufacturing industrial agglomerations in traditional geography texts are the Western, South-Eastern, and North-Central zones.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_22",
                subject = "Geography",
                topic = "Latitude and Longitude",
                year = "2015",
                questionText = "Lines of longitude can best be described as",
                optionA = "imaginary line on the earth's surface joining the north and the south pole",
                optionB = "the distance of a place east or west of Greenwich meridian",
                optionC = "the angular distance of a place north or south of the equator",
                optionD = "great circles number from 0 to 90",
                correctAnswerIndex = 0,
                explanation = "Lines of longitude (meridians) are great semicircles running from the North Pole to the South Pole.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_23",
                subject = "Geography",
                topic = "The Solar System",
                year = "2015",
                questionText = "The planet with prominent circular atmospheric light and dark bands is called",
                optionA = "mercury",
                optionB = "Neptune",
                optionC = "Jupiter",
                optionD = "Mars",
                correctAnswerIndex = 2,
                explanation = "Jupiter is the largest planet in our solar system, composed largely of gases with prominent atmospheric bands.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_24",
                subject = "Geography",
                topic = "Drainage Systems of Nigeria",
                year = "2015",
                questionText = "Which is the largest and longest river in Nigeria?",
                optionA = "River Niger",
                optionB = "River Benue",
                optionC = "River Ogun",
                optionD = "River Osun",
                correctAnswerIndex = 0,
                explanation = "River Niger originates in the Fouta Djallon highlands of Guinea and is the largest and longest river in Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_25",
                subject = "Geography",
                topic = "Map Work & Cartography",
                year = "2015",
                questionText = "All these are ways of representing relief on maps except",
                optionA = "contour",
                optionB = "form lines",
                optionC = "dot map",
                optionD = "hachures",
                correctAnswerIndex = 2,
                explanation = "Dot maps represent distribution and density of quantitative data (like population), not physical relief.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_26",
                subject = "Geography",
                topic = "Rivers of West Africa",
                year = "2015",
                questionText = "Which is the longest river in West Africa?",
                optionA = "river Benue",
                optionB = "river Niger",
                optionC = "river Volta",
                optionD = "river Senegal",
                correctAnswerIndex = 1,
                explanation = "River Niger is the longest river in West Africa and the third longest in Africa after the Nile and Congo rivers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_27",
                subject = "Geography",
                topic = "Conservation of Natural Resources",
                year = "2015",
                questionText = "Which of the following is not a way of conserving natural resources?",
                optionA = "adopting good farming practices",
                optionB = "establishing forest reserves",
                optionC = "establishing game reserves",
                optionD = "encouraging poaching",
                correctAnswerIndex = 3,
                explanation = "Poaching (illegal hunting and capturing of wildlife) destroys fauna and depletes natural resources.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_28",
                subject = "Geography",
                topic = "Mass Wasting",
                year = "2015",
                questionText = "The movement of weathered materials or regolith down a slope under the force of gravity is called",
                optionA = "weathering",
                optionB = "mass movement",
                optionC = "catastrophe",
                optionD = "mountains",
                correctAnswerIndex = 1,
                explanation = "Mass movement (or mass wasting) is the downslope movement of rock debris and soil under gravity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_29",
                subject = "Geography",
                topic = "Volcanicity and Igneous Features",
                year = "2015",
                questionText = "An intrusion of magma made horizontally along a bedding plane is called a",
                optionA = "batholith",
                optionB = "dyke",
                optionC = "lava plain",
                optionD = "sill",
                correctAnswerIndex = 3,
                explanation = "A sill is a concordant horizontal sheet of igneous rock intruded along the bedding planes of sedimentary rock.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_30",
                subject = "Geography",
                topic = "Earth Rotation and Seasons",
                year = "2015",
                questionText = "In the southern hemisphere, the autumnal equinox occurs on",
                optionA = "21st March",
                optionB = "23rd September",
                optionC = "22nd December",
                optionD = "21st June",
                correctAnswerIndex = 1,
                explanation = "In the southern hemisphere, seasonal designations are reversed, and autumnal conditions correspond to the September 23rd equinox.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_31",
                subject = "Geography",
                topic = "The Earth and Solar System",
                year = "2015",
                questionText = "The satellite of the earth is the",
                optionA = "sun",
                optionB = "moon",
                optionC = "mars",
                optionD = "Saturn",
                correctAnswerIndex = 1,
                explanation = "The Moon is the natural satellite of the Earth revolving around it.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_32",
                subject = "Geography",
                topic = "Environmental Degradation",
                year = "2015",
                questionText = "The following are the effects of overgrazing except",
                optionA = "depletion of useful fodder crops",
                optionB = "soil and wind erosion of pasture land",
                optionC = "epidemic of cattle diseases",
                optionD = "scarcity of good pasture land",
                correctAnswerIndex = 2,
                explanation = "Epidemics of cattle diseases are biological pathological events, whereas erosion, forage loss, and pasture degradation are physical effects of overgrazing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_33",
                subject = "Geography",
                topic = "Karst Limestone Features",
                year = "2015",
                questionText = "Sharp, slender, and downward growing pinnacles hanging from cave roofs in underground limestone are called",
                optionA = "limestone gorge",
                optionB = "uvala",
                optionC = "polje",
                optionD = "stalactites",
                correctAnswerIndex = 3,
                explanation = "Stalactites hang downward from the roof of limestone caves, formed by calcium carbonate deposition.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_34",
                subject = "Geography",
                topic = "Geography of West Africa",
                year = "2015",
                questionText = "Which of the following is referred to as a landlocked country?",
                optionA = "Burkina Faso",
                optionB = "Guinea",
                optionC = "Nigeria",
                optionD = "Ghana",
                correctAnswerIndex = 0,
                explanation = "Burkina Faso (formerly Upper Volta) is landlocked in West Africa with no maritime coastline.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_35",
                subject = "Geography",
                topic = "African Agriculture",
                year = "2015",
                questionText = "The most important cash crop grown in the irrigated Nile Basin (Gezira) is",
                optionA = "cotton",
                optionB = "millet",
                optionC = "sugarcane",
                optionD = "groundnut",
                correctAnswerIndex = 0,
                explanation = "Cotton (particularly long-staple cotton) is the premier cash crop produced in the irrigated Nile Basin.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_36",
                subject = "Geography",
                topic = "Structure of the Earth",
                year = "2015",
                questionText = "The density of the earth's continental crust (SIAL) is approximately",
                optionA = "2.0 g/cm³",
                optionB = "2.7 g/cm³",
                optionC = "3.0 g/cm³",
                optionD = "5.0 g/cm³",
                correctAnswerIndex = 1,
                explanation = "The continental crust (Sial: silica and alumina) has an average density of approximately 2.7 g/cm³ (2700-2800 kg/m³).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_37",
                subject = "Geography",
                topic = "Latitude and Longitude",
                year = "2015",
                questionText = "The angular distance of a point on the earth's surface measured in degrees from the Centre of the earth north or south of the equator is known as",
                optionA = "orbit",
                optionB = "latitude",
                optionC = "axis",
                optionD = "longitude",
                correctAnswerIndex = 1,
                explanation = "Latitude is the angular distance north or south of the equator measured in degrees from the earth's centre.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_38",
                subject = "Geography",
                topic = "Regional Geography of West Africa",
                year = "2015",
                questionText = "True desert in West Africa is found in",
                optionA = "Southern coast",
                optionB = "northern Mali",
                optionC = "northern Nigeria",
                optionD = "Senegal",
                correctAnswerIndex = 1,
                explanation = "Northern Mali lies inside the hyper-arid zone of the Sahara Desert.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_39",
                subject = "Geography",
                topic = "Weather and Climate",
                year = "2015",
                questionText = "All of these are elements of weather and climate except",
                optionA = "temperature",
                optionB = "altitude",
                optionC = "Rainfall",
                optionD = "sunshine",
                correctAnswerIndex = 1,
                explanation = "Altitude is a climatic control/factor influencing climate, not an element like temperature or rainfall.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_40",
                subject = "Geography",
                topic = "Population Distribution",
                year = "2015",
                questionText = "Which of the following is a primary reason for high population density in river basins?",
                optionA = "fertile soil",
                optionB = "unemployment",
                optionC = "unfavorable climate",
                optionD = "presence of some insects",
                correctAnswerIndex = 0,
                explanation = "Fertile alluvial soils along river valleys encourage intensive agriculture and dense human settlement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_41",
                subject = "Geography",
                topic = "Map Scale Calculations",
                year = "2015",
                questionText = "A given map of scale 1:150,000 is enlarged 3 times its original size. What will be the new scale?",
                optionA = "1 : 50,000",
                optionB = "1 : 75,000",
                optionC = "1 : 100,000",
                optionD = "1 : 450,000",
                correctAnswerIndex = 0,
                explanation = "When enlarged 3 times, the representative fraction denominator is divided by 3: 150,000 / 3 = 50,000, giving 1:50,000.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_42",
                subject = "Geography",
                topic = "Ecology & Ecosystems",
                year = "2015",
                questionText = "Which of the following is not a biotic factor in an ecosystem?",
                optionA = "parasite",
                optionB = "predator",
                optionC = "grazer",
                optionD = "pressure",
                correctAnswerIndex = 3,
                explanation = "Atmospheric pressure is an abiotic (non-living physical) factor.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_43",
                subject = "Geography",
                topic = "Environmental Pollution",
                year = "2015",
                questionText = "Water pollution in rivers is caused by all the following except",
                optionA = "increased silt load",
                optionB = "sewage deposit",
                optionC = "sand filling",
                optionD = "industrial effluent",
                correctAnswerIndex = 2,
                explanation = "Sand filling along river embankments is an engineering activity rather than a chemical/biological water pollutant.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_44",
                subject = "Geography",
                topic = "Denudation",
                year = "2015",
                questionText = "Which of the following represents the correct sequence in which denudation occurs?",
                optionA = "Weathering -> deposition -> erosion",
                optionB = "weathering -> erosion -> deposition",
                optionC = "erosion -> weathering -> deposition",
                optionD = "deposition -> erosion -> weathering",
                correctAnswerIndex = 1,
                explanation = "Denudation begins with in-situ rock breakdown (weathering), followed by transport (erosion), and finally settling (deposition).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_45",
                subject = "Geography",
                topic = "Shape and Size of the Earth",
                year = "2015",
                questionText = "Because of its shape (flattened poles and equatorial bulge), the earth is best described as a",
                optionA = "geoid (oblate spheroid)",
                optionB = "geosphere",
                optionC = "sphere",
                optionD = "circle",
                correctAnswerIndex = 0,
                explanation = "The earth's true geometric shape is an oblate spheroid or geoid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_46",
                subject = "Geography",
                topic = "Ecosystem Components",
                year = "2015",
                questionText = "The following are abiotic components of the ecosystem except",
                optionA = "bacteria",
                optionB = "topography",
                optionC = "water",
                optionD = "wind",
                correctAnswerIndex = 0,
                explanation = "Bacteria are living microorganisms (biotic decomposers).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_47",
                subject = "Geography",
                topic = "Soil Conservation",
                year = "2015",
                questionText = "Which of the following human activities has a beneficial effect on soil conservation?",
                optionA = "grazing",
                optionB = "strip-cultivation (crop rotation)",
                optionC = "bush burning",
                optionD = "over-cropping",
                correctAnswerIndex = 1,
                explanation = "Strip-cultivation and crop rotation preserve topsoil nutrients and minimize erosion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_48",
                subject = "Geography",
                topic = "Oceans and Seas",
                year = "2015",
                questionText = "The degree of saltiness or concentration of salt solution in oceans or seas is referred to as",
                optionA = "ocean deep",
                optionB = "ocean ridge",
                optionC = "deep sea plain",
                optionD = "salinity of the ocean",
                correctAnswerIndex = 3,
                explanation = "Ocean salinity is the concentration of dissolved mineral salts measured in parts per thousand.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_49",
                subject = "Geography",
                topic = "Rocks & Minerals",
                year = "2015",
                questionText = "Stratified rocks are typically",
                optionA = "metamorphic rock",
                optionB = "plutonic rocks",
                optionC = "igneous rock",
                optionD = "sedimentary rocks",
                correctAnswerIndex = 3,
                explanation = "Sedimentary rocks are formed in layers (strata) separated by bedding planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_50",
                subject = "Geography",
                topic = "Soil Science",
                year = "2015",
                questionText = "Which of the following is not a physical property used in defining soil texture?",
                optionA = "color",
                optionB = "capillary (power to retain water)",
                optionC = "permeability",
                optionD = "texture",
                correctAnswerIndex = 1,
                explanation = "Capillarity refers to water-holding ability, which depends on texture rather than defining texture itself.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_51",
                subject = "Geography",
                topic = "The Biosphere",
                year = "2015",
                questionText = "The area around the earth where life activities go on is referred to as the",
                optionA = "biosphere",
                optionB = "lithosphere",
                optionC = "habitat",
                optionD = "ecosystem",
                correctAnswerIndex = 0,
                explanation = "The biosphere is the global zone of land, air, and water that supports life.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q51",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_52",
                subject = "Geography",
                topic = "Geography of Nigeria",
                year = "2015",
                questionText = "Nigeria is situated geographically in",
                optionA = "east Africa",
                optionB = "north Africa",
                optionC = "west Africa",
                optionD = "south Africa",
                correctAnswerIndex = 2,
                explanation = "Nigeria is located on the Atlantic coast in West Africa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q52",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_53",
                subject = "Geography",
                topic = "Transportation & Communication",
                year = "2015",
                questionText = "The type of transport that is mostly affected by adverse climatic conditions (like dense fog) is",
                optionA = "land transport",
                optionB = "water transport",
                optionC = "road transport",
                optionD = "air transport",
                correctAnswerIndex = 3,
                explanation = "Air transport is most sensitive to low visibility, fog, and thunderstorms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q53",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_54",
                subject = "Geography",
                topic = "Great Circles and Small Circles",
                year = "2015",
                questionText = "A great circle can best be described as",
                optionA = "a circle whose plane passes through Centre of the globe",
                optionB = "a line of longitude",
                optionC = "the equator",
                optionD = "the shortest distance between two points",
                correctAnswerIndex = 3,
                explanation = "A great circle arc represents the shortest distance between any two points on a spherical surface.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q54",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_55",
                subject = "Geography",
                topic = "Earthquakes and Faulting",
                year = "2015",
                questionText = "Major tectonic earthquakes destroy communities primarily due to",
                optionA = "volcanic gas release",
                optionB = "lunar gravity",
                optionC = "deep ocean current flow",
                optionD = "violent crustal fault movement and shockwave release",
                correctAnswerIndex = 3,
                explanation = "Crustal fault movements release stored elastic strain energy as destructive seismic shockwaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q55",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_56",
                subject = "Geography",
                topic = "Location and Position of Nigeria",
                year = "2015",
                questionText = "The longitudinal extent of Nigeria is approximately",
                optionA = "0°",
                optionB = "11°",
                optionC = "20°",
                optionD = "12°",
                correctAnswerIndex = 3,
                explanation = "Nigeria extends between longitudes 3°E and 15°E, giving an extent of 15° - 3° = 12°.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q56",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_57",
                subject = "Geography",
                topic = "Structure of the Earth",
                year = "2015",
                questionText = "The liquid portion of the earth's crust and surface is called the",
                optionA = "biosphere",
                optionB = "hydrosphere",
                optionC = "mesosphere",
                optionD = "atmosphere",
                correctAnswerIndex = 1,
                explanation = "The hydrosphere comprises all surface water, seas, rivers, lakes, and oceans.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q57",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_58",
                subject = "Geography",
                topic = "World Agricultural Regions",
                year = "2015",
                questionText = "In which of the following areas is Mediterranean fruit farming least important?",
                optionA = "Morocco",
                optionB = "Egypt",
                optionC = "Algeria",
                optionD = "Uganda",
                correctAnswerIndex = 3,
                explanation = "Uganda has an equatorial/tropical climate and does not possess a Mediterranean climate suitable for citrus/grape orchards.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q58",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_59",
                subject = "Geography",
                topic = "World Trade Routes & Canals",
                year = "2015",
                questionText = "A major domestic shipping and trade route between the east and west coasts of the U.S.A. is the",
                optionA = "Suez canal",
                optionB = "Panama Canal",
                optionC = "the North Pacific Route",
                optionD = "Cape Route",
                correctAnswerIndex = 1,
                explanation = "The Panama Canal links the Atlantic and Pacific oceans, serving as a primary route between the east and west coasts of the Americas.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q59",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_60",
                subject = "Geography",
                topic = "Settlement & Urbanization in Nigeria",
                year = "2015",
                questionText = "The most urbanized part of Nigeria with extensive cities like Lagos, Ibadan, and Akure is the",
                optionA = "North/central",
                optionB = "north/east",
                optionC = "south/west",
                optionD = "south/south",
                correctAnswerIndex = 2,
                explanation = "The South-West geopolitical zone is the most urbanized part of Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q60",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_61",
                subject = "Geography",
                topic = "Drainage & Hydrology of Nigeria",
                year = "2015",
                questionText = "All these are characteristic features of Nigerian rivers except",
                optionA = "seasonal flooding",
                optionB = "development of rapids and cataracts",
                optionC = "shallowness",
                optionD = "presence of misfit streams",
                correctAnswerIndex = 3,
                explanation = "Misfit streams are characteristic of glaciated valleys, not typical Nigerian tropical drainage networks.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q61",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_62",
                subject = "Geography",
                topic = "Agricultural Systems",
                year = "2015",
                questionText = "All the following are forms of traditional subsistence farming in West Africa except",
                optionA = "rotational bush farming",
                optionB = "permanent cultivation",
                optionC = "plantation agriculture",
                optionD = "mixed farming",
                correctAnswerIndex = 2,
                explanation = "Plantation agriculture is large-scale commercial intensive farming for profit and export, not subsistence farming.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q62",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_63",
                subject = "Geography",
                topic = "Vegetation Adaptations",
                year = "2015",
                questionText = "Desert plants that have adaptations to withstand prolonged dry seasons are usually called",
                optionA = "hydrophytes",
                optionB = "mesophytes",
                optionC = "xerophytes",
                optionD = "sporophytes",
                correctAnswerIndex = 2,
                explanation = "Xerophytes have specialized structures (sunken stomata, thick cuticles, fleshy stems) to survive drought.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q63",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_64",
                subject = "Geography",
                topic = "World Climates: Deserts",
                year = "2015",
                questionText = "Very low annual rainfall, sparse vegetation, high day temperature and cold nights are the characteristics of the",
                optionA = "a swamp",
                optionB = "tropical forest",
                optionC = "southern guinea savanna",
                optionD = "desert",
                correctAnswerIndex = 3,
                explanation = "Deserts are characterized by extreme aridity, sparse drought-resistant vegetation, and wide diurnal temperature fluctuations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q64",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_65",
                subject = "Geography",
                topic = "Mass Wasting",
                year = "2015",
                questionText = "A type of mass movement or mass wasting involving sudden downward sliding of large rock debris is a",
                optionA = "steep slope",
                optionB = "landslides",
                optionC = "hills",
                optionD = "tableland",
                correctAnswerIndex = 1,
                explanation = "Landslides involve the rapid movement of rock debris and soil down a slope.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q65",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_66",
                subject = "Geography",
                topic = "Mining in Nigeria",
                year = "2015",
                questionText = "The method of mining crude petroleum oil from underground formations is the",
                optionA = "open cast",
                optionB = "underground shaft",
                optionC = "adit method",
                optionD = "drilling method",
                correctAnswerIndex = 3,
                explanation = "Crude petroleum is extracted by sinking wells using drilling rigs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q66",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_67",
                subject = "Geography",
                topic = "Weather Instruments",
                year = "2015",
                questionText = "The instrument used in the meteorological measurement of rainfall is the",
                optionA = "raingauge",
                optionB = "thermometer",
                optionC = "hydrometer",
                optionD = "barometer",
                correctAnswerIndex = 0,
                explanation = "A rain gauge measures rainfall depth in millimetres.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q67",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_68",
                subject = "Geography",
                topic = "Vegetation and Biomes",
                year = "2015",
                questionText = "The factors which determine the type of natural vegetation a habitat will support include the following except",
                optionA = "nature of the soil particles",
                optionB = "amount of rainfall",
                optionC = "farming activities",
                optionD = "depth of the water-table",
                correctAnswerIndex = 3,
                explanation = "Depth of the water-table alone is less decisive compared to macro-climatic rainfall and soil profile.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q68",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_69",
                subject = "Geography",
                topic = "Drainage Systems",
                year = "2015",
                questionText = "The term that refers to surface water bodies like streams, dams, seas, oceans, and rivers is",
                optionA = "canal",
                optionB = "ditch",
                optionC = "Drainage",
                optionD = "ocean",
                correctAnswerIndex = 2,
                explanation = "Drainage refers to the network of water bodies draining a land area.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q69",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_70",
                subject = "Geography",
                topic = "Lumbering in Africa",
                year = "2015",
                questionText = "All the following are important timber-producing countries in Africa except",
                optionA = "Ghana",
                optionB = "Cote d'Ivoire",
                optionC = "Nigeria",
                optionD = "Mauritania",
                correctAnswerIndex = 3,
                explanation = "Mauritania is an arid/desert country with no tropical timber forests.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q70",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_71",
                subject = "Geography",
                topic = "River Action & Landforms",
                year = "2015",
                questionText = "All of these are features of the lower course of a river except",
                optionA = "flood plain",
                optionB = "V shaped valley",
                optionC = "levees",
                optionD = "ox-bow lake",
                correctAnswerIndex = 1,
                explanation = "V-shaped valleys are formed in the upper course of a river by vertical erosion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q71",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_72",
                subject = "Geography",
                topic = "Earthquakes",
                year = "2015",
                questionText = "The point inside the crust where an earthquake shock wave originates is called the",
                optionA = "focus",
                optionB = "vent",
                optionC = "caldera",
                optionD = "crater",
                correctAnswerIndex = 0,
                explanation = "The focus (or hypocentre) is the underground point of seismic origin.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q72",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_73",
                subject = "Geography",
                topic = "Population Geography",
                year = "2015",
                questionText = "Density, mortality, and birth rate are primary demographic factors that affect",
                optionA = "population",
                optionB = "dominance",
                optionC = "cover",
                optionD = "habitat",
                correctAnswerIndex = 0,
                explanation = "Population totals and growth rates depend on birth rate, mortality, and density.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q73",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_74",
                subject = "Geography",
                topic = "Underground Water",
                year = "2015",
                questionText = "A natural outlet through which underground water in limestone or permeable strata emerges onto the surface is a",
                optionA = "streams in karst region",
                optionB = "rain water",
                optionC = "spring (artesian spring)",
                optionD = "rivers",
                correctAnswerIndex = 2,
                explanation = "A spring is a point where groundwater flows out naturally onto the surface.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q74",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_75",
                subject = "Geography",
                topic = "Soils & Agriculture",
                year = "2015",
                questionText = "Loam is the best type of soil for crop production because",
                optionA = "it has a high percentage of clay which prevents leaching",
                optionB = "it has a high humus content and balanced water retention capacity",
                optionC = "porous and has good water retention capacity",
                optionD = "gravels which obstruct implements are absent from it",
                correctAnswerIndex = 1,
                explanation = "Loam contains balanced sand, silt, and clay enriched with humus for optimal aeration and water retention.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q75",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_76",
                subject = "Geography",
                topic = "The Solar System",
                year = "2015",
                questionText = "Which of the following planets has no natural satellite (moon)?",
                optionA = "Venus",
                optionB = "Uranus",
                optionC = "Neptune",
                optionD = "Jupiter",
                correctAnswerIndex = 0,
                explanation = "Venus and Mercury are the two planets in the solar system without natural satellites.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q76",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_77",
                subject = "Geography",
                topic = "Longitude and Time Calculations",
                year = "2015",
                questionText = "When it is 9:00 am in Munich, Western Germany (longitude 11°E), the standard time in Calcutta, India (longitude 96°E) is",
                optionA = "4:20 am",
                optionB = "2:40 am",
                optionC = "2:40 pm",
                optionD = "5:40 pm",
                correctAnswerIndex = 2,
                explanation = "Longitudinal difference = 96° - 11° = 85°E. Time difference = 85° / 15° = 5 hrs 40 mins ahead. 9:00 am + 5 hrs 40 mins = 2:40 pm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q77",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_78",
                subject = "Geography",
                topic = "The Solar System",
                year = "2015",
                questionText = "Which of the following statements is NOT true about the solar system?",
                optionA = "the ray of the sun gives energy to the system",
                optionB = "the planets do not rotate around their axes",
                optionC = "the planets revolve around the sun",
                optionD = "the sun is at the Centre of the system",
                correctAnswerIndex = 1,
                explanation = "All planets in the solar system rotate on their own axes while revolving around the sun.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q78",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_79",
                subject = "Geography",
                topic = "Earth Movements: Rotation",
                year = "2015",
                questionText = "The earth's movement from west to east on its own axis every 24 hours is known as",
                optionA = "friction",
                optionB = "revolution",
                optionC = "gravitation",
                optionD = "rotation",
                correctAnswerIndex = 3,
                explanation = "Rotation is the daily spinning of the earth on its axis from West to East.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q79",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_80",
                subject = "Geography",
                topic = "Weather Instruments",
                year = "2015",
                questionText = "Which of the following meteorological instruments is used to measure wind speed?",
                optionA = "thermometer",
                optionB = "barometer",
                optionC = "hygrometer",
                optionD = "anemometer",
                correctAnswerIndex = 3,
                explanation = "An anemometer measures wind speed/velocity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q80",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_81",
                subject = "Geography",
                topic = "Settlement Geography",
                year = "2015",
                questionText = "All these are examples of urban settlements except",
                optionA = "towns",
                optionB = "village",
                optionC = "conurbation",
                optionD = "megalopolis",
                correctAnswerIndex = 1,
                explanation = "A village is a rural settlement, unlike towns, conurbations, and megalopolises which are urban.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q81",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
