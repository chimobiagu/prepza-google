package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Economics Past Questions (1983 - 1985 Exam Series).
 */
object JambEconomicsHistoricalQuestionBank {

    fun getHistoricalEconomicsQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 1983 SERIES
        // ==========================================
        list.add(
            QuestionEntity(
                id = "eco_1983_001",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "1983",
                questionText = "Which of the following items is NOT included in measuring national income by the income approach?",
                optionA = "Wages and salaries of public servants",
                optionB = "Student grants and scholarships",
                optionC = "Profits of companies",
                optionD = "Income earned by self employed persons such as lawyers",
                correctAnswerIndex = 1,
                explanation = "Student grants and scholarships are transfer payments. Since they are unearned incomes and do not involve any direct exchange of productive services, they are excluded from national income calculation to avoid double counting.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_002",
                subject = "Economics",
                topic = "Price Determination and Market Equilibrium",
                year = "1983",
                questionText = "A downward sloping demand curve intersects a fixed supply curve. A shift of this demand curve to the right implies that",
                optionA = "both price and quantity will increase",
                optionB = "only price increase",
                optionC = "only quantity increase",
                optionD = "the price remains constant",
                correctAnswerIndex = 0,
                explanation = "A rightward shift of the demand curve indicates an increase in demand. With a fixed, upward-sloping supply curve, this shift creates a shortage at the old price, bidding up both the equilibrium price and quantity.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_003",
                subject = "Economics",
                topic = "Industrialization and Location of Industries",
                year = "1983",
                questionText = "Which of the following items is NOT an argument for locating industries in rural areas?",
                optionA = "Rural areas supply agricultural raw material",
                optionB = "The pace of development will be quickened in rural areas",
                optionC = "Employment will be provided for rural inhabitants",
                optionD = "Capital is easily available in rural areas",
                correctAnswerIndex = 3,
                explanation = "While rural areas offer advantages like proximity to raw materials and cheaper land, capital is typically highly concentrated in urban financial centers, making capital scarcity a major challenge in rural areas.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_004",
                subject = "Economics",
                topic = "Theory of Supply and Subsidies",
                year = "1983",
                questionText = "The curves D0D0 and S0S0 are the demand and supply curves respectively. What happens when government subsidizes producers in order to boost output?",
                optionA = "The supply curve will shift S0S0 to S2S2",
                optionB = "The supply curve will shift from S0S0 to S1S1",
                optionC = "The supply curve will shift from S2S2 to S1S1",
                optionD = "The demand curve will shift from D0D0 to D1D1",
                correctAnswerIndex = 1,
                explanation = "Government subsidies reduce the cost of production for manufacturers. This financial assistance shifts the supply curve to the right, from S0S0 to S1S1, leading to higher equilibrium quantity and lower price.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_005",
                subject = "Economics",
                topic = "Population and Demography",
                year = "1983",
                questionText = "The natural growth rate of a population is the",
                optionA = "Sum of the birth rate and the death rate",
                optionB = "Sum of the birth rate and the net migration",
                optionC = "Birth rate minus the death rate",
                optionD = "Birth rate divided by the net migration",
                correctAnswerIndex = 2,
                explanation = "The natural growth rate measures population change strictly due to biological events (births and deaths), calculated as birth rate minus death rate. It excludes net migration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_006",
                subject = "Economics",
                topic = "Factors of Production",
                year = "1983",
                questionText = "Which of the following sets fully represents factors of production?",
                optionA = "Sunlight, machinery, man, land",
                optionB = "Land, labour, capital, enterprise",
                optionC = "Capital, technology, ideas, market, land",
                optionD = "Land, water, weather",
                correctAnswerIndex = 1,
                explanation = "The four fundamental factors of production required to produce any goods or services are Land (natural resources), Labour (human effort), Capital (man-made aids), and Enterprise (coordinating and risk-bearing factor).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_007",
                subject = "Economics",
                topic = "Production Possibility Curve and Opportunity Cost",
                year = "1983",
                questionText = "Based on the production possibilities table (P: 5 shelter, 0 food; Q: 4 shelter, 5 food; R: 3 shelter, 9 food; S: 2 shelter, 12 food; T: 0 shelter, 15 food), the real cost of a unit of food when alternative R is selected is",
                optionA = "One unit of shelter",
                optionB = "Three units of shelter",
                optionC = "One third of a unit of shelter",
                optionD = "Six units of shelter",
                correctAnswerIndex = 2,
                explanation = "Moving from alternative R (3 shelter, 9 food) to alternative S (2 shelter, 12 food) results in gaining 3 units of food by sacrificing 1 unit of shelter. The opportunity (real) cost per unit of food is therefore 1/3 of a unit of shelter.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_008",
                subject = "Economics",
                topic = "Economic Systems and Efficiency",
                year = "1983",
                questionText = "The concept of economic efficiency primarily refers to",
                optionA = "Obtaining the maximum output from available resources at the lowest possible cost",
                optionB = "Conservation of our petroleum resources",
                optionC = "Equity in the distribution of the nation's wealth",
                optionD = "Producing without waste",
                correctAnswerIndex = 0,
                explanation = "Economic efficiency is achieved when resources are allocated and utilized to maximize the total output of goods and services at the minimum average cost, ensuring no resources are wasted.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_009",
                subject = "Economics",
                topic = "Theory of Production and Diminishing Returns",
                year = "1983",
                questionText = "If successive units of labour are added to a piece of land while capital and technology remain constant, a point will be reached in the level of production when each added unit of labour will add less to the output than previous units of labour. This describes",
                optionA = "The productivity of labour",
                optionB = "The law of diminishing marginal utility",
                optionC = "The law of diminishing returns",
                optionD = "The concept of factor intensity",
                correctAnswerIndex = 2,
                explanation = "The Law of Diminishing Returns states that as equal increments of a variable input (labour) are added to a fixed factor (land), a point is reached where the marginal product of the variable factor begins to decline.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_011",
                subject = "Economics",
                topic = "Theory of Consumer Demand",
                year = "1983",
                questionText = "A Nigerian household's demand curve for semovita is downward sloping because",
                optionA = "The demand for semovita is high",
                optionB = "The local markets are flooded with semovita",
                optionC = "It is produced in Nigeria",
                optionD = "Higher prices attract lower quantities while lower prices attract larger quantities",
                correctAnswerIndex = 3,
                explanation = "The downward slope of a standard demand curve represents the law of demand: an inverse relationship where quantity demanded decreases as price increases, and increases as price falls.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_012",
                subject = "Economics",
                topic = "Market Schedule and Price Determination",
                year = "1983",
                questionText = "Based on the market schedule for semovita (N5.00: 10,000 demanded, 6,000 supplied; N6.00: 7,000 demanded, 7,000 supplied; N7.00: 5,000 demanded, 9,000 supplied), what is the market equilibrium price?",
                optionA = "N5.00",
                optionB = "N8.00",
                optionC = "N9.00",
                optionD = "N6.00",
                correctAnswerIndex = 3,
                explanation = "Market equilibrium is established at the price where quantity demanded equals quantity supplied. According to the schedule, at N6.00, both quantity demanded and supplied are exactly 7,000 bags.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_013",
                subject = "Economics",
                topic = "Cost Theory and Revenue Analysis",
                year = "1983",
                questionText = "Marginal cost curve intersects average cost curve",
                optionA = "From above at its lowest point",
                optionB = "From below before the lowest point",
                optionC = "From below at its lowest point",
                optionD = "From below after the lowest point",
                correctAnswerIndex = 2,
                explanation = "The mathematical relationship between average cost (AC) and marginal cost (MC) dictates that MC is equal to AC only when AC is at its minimum. Thus, the MC curve intersects the AC curve from below at its lowest point.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_014",
                subject = "Economics",
                topic = "Location of Industries in Nigeria",
                year = "1983",
                questionText = "Palm oil industry is located in Bendel State because the state",
                optionA = "Imports raw material for palm oil industry",
                optionB = "Is a palm tree growing area",
                optionC = "Soil is unsuitable for other crops",
                optionD = "Government does not engage land for other crops",
                correctAnswerIndex = 1,
                explanation = "Industries processing heavy, bulky agricultural raw materials are localized near the source of raw materials to minimize transportation costs. Bendel State is a natural palm tree cultivation region.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_015",
                subject = "Economics",
                topic = "Inflation and Wage-Price Spiral",
                year = "1983",
                questionText = "The meaning of 'wage-price spiral' is",
                optionA = "Wages and prices are rising at a proportional rate",
                optionB = "Higher wages lead to higher costs, which raise prices, forcing further wage demands",
                optionC = "Wages rise while prices fall",
                optionD = "Prices rise while wages are frozen",
                correctAnswerIndex = 1,
                explanation = "A wage-price spiral is a macroeconomic concept representing a feedback loop where wage increases drive up production costs, leading firms to raise prices, which in turn leads workers to demand even higher wages to maintain purchasing power.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_016",
                subject = "Economics",
                topic = "Inflation and Purchasing Power",
                year = "1983",
                questionText = "In an inflationary period which of the following statements is NOT true?",
                optionA = "Wages rise simultaneously with prices",
                optionB = "The purchasing power of money diminishes",
                optionC = "More money runs after a limited quantity of goods",
                optionD = "Money supply increases",
                correctAnswerIndex = 0,
                explanation = "During inflation, wage increases typically lag behind rising prices, which causes real wages and the purchasing power of workers to decline. Wages do not rise simultaneously with prices.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_017",
                subject = "Economics",
                topic = "Channels of Distribution",
                year = "1983",
                questionText = "Retailers in an economy perform the function of",
                optionA = "Production",
                optionB = "Exchange",
                optionC = "Distribution",
                optionD = "Hoarding",
                correctAnswerIndex = 2,
                explanation = "Retailers are the final link in the channel of distribution. They purchase goods in relatively large quantities from wholesalers and distribute them in small units to final consumers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_018",
                subject = "Economics",
                topic = "Business Organizations",
                year = "1983",
                questionText = "In a sole proprietorship the decisions are made by the",
                optionA = "Government",
                optionB = "Board of directors",
                optionC = "Management",
                optionD = "Owner",
                correctAnswerIndex = 3,
                explanation = "A sole proprietorship is owned and managed by a single individual. Consequently, the sole owner enjoys absolute decision-making authority and takes all responsibility for the business's profits and losses.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_019",
                subject = "Economics",
                topic = "Public Enterprises",
                year = "1983",
                questionText = "Which of the following enterprises does NOT pursue the sole objective of profit maximization?",
                optionA = "Roads Nigeria Ltd.",
                optionB = "Union Bank of Nigeria Ltd.",
                optionC = "Nigerian Electric Power Authority",
                optionD = "Volkswagen (VW) Nigeria Ltd.",
                correctAnswerIndex = 2,
                explanation = "The Nigerian Electric Power Authority (NEPA) is a public corporation established to provide essential utilities to citizens, prioritizing public welfare and service delivery over profit maximization.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_020",
                subject = "Economics",
                topic = "Public Finance and Fiscal Policy",
                year = "1983",
                questionText = "Public expenditure creates expansionary effects in the economy when it is",
                optionA = "In excess of government revenue",
                optionB = "Channelled into capital projects",
                optionC = "Diverted into imports",
                optionD = "Financed through oil revenue",
                correctAnswerIndex = 0,
                explanation = "When public expenditure exceeds government revenue (deficit budgeting), it injects extra purchasing power into the economy, boosting aggregate demand and creating expansionary effects.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_021",
                subject = "Economics",
                topic = "Macroeconomic Policy and Fiscal Stability",
                year = "1983",
                questionText = "The maintenance of general economic stability in the country necessarily relies heavily on",
                optionA = "Federal fiscal policy",
                optionB = "Coordinated federal, state and local fiscal policies",
                optionC = "Tax and revenue policies of state governments",
                optionD = "Federal grants to local governments",
                correctAnswerIndex = 0,
                explanation = "Because the federal government controls central monetary instruments, national taxation framework, and macro-budgetary systems, general economic stability relies heavily on Federal fiscal policy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_023",
                subject = "Economics",
                topic = "Taxation Systems",
                year = "1983",
                questionText = "Which of the following are direct taxes?",
                optionA = "Sales taxes",
                optionB = "Excise duties",
                optionC = "Income and company taxes",
                optionD = "Tariff duties",
                correctAnswerIndex = 2,
                explanation = "Direct taxes are levied directly on the income or wealth of individuals and corporate organizations. The tax burden cannot be shifted to another person, as in the cases of personal income and company taxes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_024",
                subject = "Economics",
                topic = "Division of Labour",
                year = "1983",
                questionText = "Division of labour has many advantages. Notwithstanding, it is greatly limited by",
                optionA = "Monotony of work",
                optionB = "Decline of craftsmanship",
                optionC = "Risk of unemployment",
                optionD = "Extent of market demand",
                correctAnswerIndex = 3,
                explanation = "According to Adam Smith, the division of labour is limited by the extent of the market. If demand for a product is small, highly specialized production systems cannot be sustained.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_026",
                subject = "Economics",
                topic = "Limited Liability Companies",
                year = "1983",
                questionText = "In the event of a limited liability company going into liquidation each",
                optionA = "Shareholder may lose the maximum of the amount he has invested",
                optionB = "Shareholder loses nothing",
                optionC = "Shareholder loses everything including his house",
                optionD = "Shareholder's liability becomes unlimited",
                correctAnswerIndex = 0,
                explanation = "Under limited liability, a shareholder's financial liability is restricted to the nominal value of their fully paid-up shares. They cannot lose personal assets like houses to settle corporate debts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_027",
                subject = "Economics",
                topic = "Tax Incidence and Elasticity",
                year = "1983",
                questionText = "A greater burden of the taxes on essential goods is borne by the",
                optionA = "Middle income group",
                optionB = "Higher income group",
                optionC = "Lower income group",
                optionD = "Top few richest people of the country",
                correctAnswerIndex = 2,
                explanation = "Essential goods have highly inelastic demand. Indirect taxes on these commodities are passed onto consumers in the form of higher prices. Since the poor spend a larger proportion of their income on essentials, they bear a disproportionate burden.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1983_029",
                subject = "Economics",
                topic = "International Trade and Commercial Policy",
                year = "1983",
                questionText = "The meaning of 'Dumping' is selling goods in a foreign market",
                optionA = "At a price below that received in the home market",
                optionB = "At a price higher than that received in the home market",
                optionC = "At a price equal to the cost price in the home market",
                optionD = "In order to encourage indigenous producers",
                correctAnswerIndex = 0,
                explanation = "Dumping is an international trade practice where a country exports goods to another market at a price significantly below their domestic production cost or the price charged in their home market.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q29"
            )
        )

        // ==========================================
        // 1984 SERIES
        // ==========================================
        list.add(
            QuestionEntity(
                id = "eco_1984_001",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "1984",
                questionText = "The main economic objective behind the production of goods and services in any economy is to",
                optionA = "Maximize profits",
                optionB = "Satisfy human wants",
                optionC = "Become self-reliant",
                optionD = "Create job opportunities",
                correctAnswerIndex = 1,
                explanation = "In economics, consumption is the end goal of all production activities. The primary economic objective behind producing goods and services is to satisfy the unlimited wants of humans with limited resources.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_002",
                subject = "Economics",
                topic = "Theory of Consumer Demand",
                year = "1984",
                questionText = "Demand for a commodity by a consumer is the quantity of that commodity that the consumer",
                optionA = "Demands at a given price at a point in time",
                optionB = "Demands at a given price",
                optionC = "Actually digests",
                optionD = "Produces, given its price",
                correctAnswerIndex = 0,
                explanation = "In economics, demand is defined as 'effective demand'—the willingness and ability of a consumer to purchase a specific quantity of a commodity at a given price within a specific period.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_003",
                subject = "Economics",
                topic = "Division of Labour",
                year = "1984",
                questionText = "Division of labour is limited by",
                optionA = "The size of the market",
                optionB = "The productivity of capital",
                optionC = "Cost of production",
                optionD = "The factors of production",
                correctAnswerIndex = 0,
                explanation = "The division of labour is constrained by the extent and size of the market (aggregate demand). A highly specialized workforce requires a large and stable consumer market to absorb the specialized output.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_004",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "1984",
                questionText = "The production within the domestic territory of a country is called the",
                optionA = "Net national product",
                optionB = "Gross domestic product",
                optionC = "Net income",
                optionD = "Disposable income",
                correctAnswerIndex = 1,
                explanation = "Gross Domestic Product (GDP) measures the total market value of all final goods and services produced within the geographic borders of a country during a given period, regardless of the nationality of the producers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_005",
                subject = "Economics",
                topic = "Wages and Labour Market",
                year = "1984",
                questionText = "In discussing the reasons why wages differ between occupations, which of the following should be regarded as a cardinal point that needs to be emphasized?",
                optionA = "Length and cost of training",
                optionB = "Demand and supply",
                optionC = "Attractiveness of the job",
                optionD = "Influence of trade unions",
                correctAnswerIndex = 1,
                explanation = "While training, union strength, and job hazards influence wages, the fundamental market force determining wage differentials across all occupations is the interaction of demand and supply for labour.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_006",
                subject = "Economics",
                topic = "Production Possibility Frontier",
                year = "1984",
                questionText = "A rightward shift in the production possibility frontier may be due to",
                optionA = "Use of inferior inputs",
                optionB = "Inefficiency",
                optionC = "Improvement in production techniques and practices",
                optionD = "Changes in the product mix",
                correctAnswerIndex = 2,
                explanation = "A rightward shift of the Production Possibility Frontier (PPF) represents economic growth, which is caused by technological advancements, discoveries of new resources, or improvements in production techniques.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_007",
                subject = "Economics",
                topic = "Cost Theory and Marginal Cost",
                year = "1984",
                questionText = "Based on the short-run costs table (Item 1: 750 FC, 200 VC, 950 TC; Item 2: 750 FC, 560 VC, 1310 TC; Item 3: 750 FC, 900 VC, 1650 TC), what is the firm's marginal cost for the third item produced?",
                optionA = "N340.00",
                optionB = "N349.00",
                optionC = "N360.00",
                optionD = "N370.50",
                correctAnswerIndex = 0,
                explanation = "Marginal Cost is the change in Total Cost from producing one additional unit. MC for the 3rd unit = Total Cost of 3 units (1650) - Total Cost of 2 units (1310) = N340.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_008",
                subject = "Economics",
                topic = "Economies of Scale",
                year = "1984",
                questionText = "The advantages that accrue to a firm as the size of the firm increases are known as",
                optionA = "External diseconomies",
                optionB = "Internal returns to scale",
                optionC = "Internal economies",
                optionD = "Internal diseconomies",
                correctAnswerIndex = 2,
                explanation = "Internal economies of scale are cost-saving benefits that occur within an individual firm as it expands its scale of production, leading to a fall in average cost.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_010",
                subject = "Economics",
                topic = "Economic Development",
                year = "1984",
                questionText = "Which of the following is NOT an obstacle to economic development?",
                optionA = "Low level of investment",
                optionB = "Lack of modern technology",
                optionC = "High rate of population growth",
                optionD = "Dedicated leadership",
                correctAnswerIndex = 3,
                explanation = "Dedicated and visionary leadership is a major catalyst for economic development, helping to organize resources, build institutions, and implement growth policies.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_011",
                subject = "Economics",
                topic = "Population and Demography",
                year = "1984",
                questionText = "An ageing population refers to the preponderance of",
                optionA = "Middle-aged people in the population",
                optionB = "Young people in the population",
                optionC = "Women in the population",
                optionD = "Old people in the population",
                correctAnswerIndex = 3,
                explanation = "An ageing population is characterized by an increasing proportion of elderly people (usually aged 65 and above) relative to the younger active demographic segments, often caused by falling birth rates and rising life expectancy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_015",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "1984",
                questionText = "In a demand and supply graph, when the supply curve S0S0 shifts to a new position S1S1 to the right, it indicates",
                optionA = "A drop in supply",
                optionB = "A rise in supply",
                optionC = "A supply-push inflation",
                optionD = "A stable supply curve",
                correctAnswerIndex = 1,
                explanation = "A rightward shift of the supply curve represents an increase or 'rise' in supply, meaning producers are willing and able to offer more of the commodity for sale at every price level.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_016",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "1984",
                questionText = "If X and Y are two goods, then the cross elasticity of demand for X with respect to Y is defined as the",
                optionA = "Percentage change in the quantity of X divided by the percentage change in the price of Y",
                optionB = "Percentage change in the quantity of X divided by change in the price of Y",
                optionC = "Change in the quantity of X divided by change in the price of Y",
                optionD = "Percentage change in the quantity of X divided by the price of Y",
                correctAnswerIndex = 0,
                explanation = "Cross elasticity of demand measures the responsiveness of the quantity demanded of one good (X) to a change in the price of another related good (Y).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_017",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "1984",
                questionText = "For two substitute goods, the cross elasticity of demand is",
                optionA = "Greater than one but less than two",
                optionB = "Zero",
                optionC = "Negative",
                optionD = "Positive",
                correctAnswerIndex = 3,
                explanation = "Substitute goods have positive cross-price elasticity. An increase in the price of one good (e.g., beef) leads consumers to shift to the other substitute good (e.g., fish), increasing its demand.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_018",
                subject = "Economics",
                topic = "Price Control and Legislation",
                year = "1984",
                questionText = "The control of prices by legislation usually produces a number of consequences. Which of the following is NOT an associated problem of maximum price control?",
                optionA = "Excess supply",
                optionB = "Favouritism",
                optionC = "Bribery and corruption",
                optionD = "Black marketing",
                correctAnswerIndex = 0,
                explanation = "Maximum price control (price ceiling) is set below the equilibrium price. This creates excess demand (shortage), leading to hoarding, black markets, and favoritism, rather than excess supply.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_019",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "1984",
                questionText = "For a non-discriminating monopolist in Nigeria, price at the profit maximizing output is",
                optionA = "Equal to marginal cost",
                optionB = "Greater than marginal cost",
                optionC = "Greater than average total cost",
                optionD = "Equal to marginal revenue",
                correctAnswerIndex = 1,
                explanation = "For a monopolist, the demand (AR) curve slopes downward, so Price (P) is always greater than Marginal Revenue (MR). Since profit maximization occurs where MR = MC, it follows that Price is greater than Marginal Cost at this point.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_021",
                subject = "Economics",
                topic = "Imperfect Competition",
                year = "1984",
                questionText = "An imperfectly competitive market is one where",
                optionA = "A large number of firms sell homogeneous products",
                optionB = "Input and output prices are unaffected",
                optionC = "Each firm faces a horizontal demand curve",
                optionD = "Commodities are differentiated",
                correctAnswerIndex = 3,
                explanation = "Product differentiation is a key feature of imperfectly competitive markets (like monopolistic competition), where products are similar but not perfect substitutes, allowing firms some degree of price-making power.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_022",
                subject = "Economics",
                topic = "Principles of Taxation",
                year = "1984",
                questionText = "In taxation, the benefit principle requires that",
                optionA = "Everybody must draw benefits from taxation",
                optionB = "All those who earn more income must pay more taxes",
                optionC = "Only those who derive benefits from services provided from public revenue should be taxed",
                optionD = "Taxes paid by businesses should be shifted to those consumers benefiting from such commodities",
                correctAnswerIndex = 2,
                explanation = "The benefit principle of taxation asserts that individuals should be taxed in proportion to the benefits or utility they receive from government spending on public goods and services.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_023",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "1984",
                questionText = "A perfectly competitive firm does not influence the demand for its commodities by lowering its price below the market price because",
                optionA = "It is illegal price cutting",
                optionB = "Other competitors will be angry",
                optionC = "Total revenue will decline due to its inelastic demand curve",
                optionD = "It is able to sell all it wants at the market price",
                correctAnswerIndex = 3,
                explanation = "In perfect competition, firms are price takers facing an infinitely elastic (horizontal) demand curve. They can sell any quantity at the ruling market price, so lowering price below this level would needlessly reduce their revenue.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_024",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "1984",
                questionText = "Pricing and output decisions of sellers are highly interdependent in markets known as",
                optionA = "Oligopoly",
                optionB = "Perfect competition",
                optionC = "Monopoly",
                optionD = "Monopolistic competition",
                correctAnswerIndex = 0,
                explanation = "An oligopoly is a market structure dominated by a few large firms. Since each firm has a significant market share, the pricing and output actions of one firm directly impact and trigger reactions from its competitors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_025",
                subject = "Economics",
                topic = "Business Organizations",
                year = "1984",
                questionText = "One disadvantage of sole proprietorship is its",
                optionA = "Limited liability",
                optionB = "High profits",
                optionC = "High sense of ownership",
                optionD = "Low credit rating",
                correctAnswerIndex = 3,
                explanation = "Because a sole proprietorship is unregistered, has small capital assets, and is tied strictly to a single owner, financial institutions consider it high-risk, resulting in a low credit rating.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_026",
                subject = "Economics",
                topic = "Channels of Distribution",
                year = "1984",
                questionText = "The Channel for food distribution in Nigeria consists of",
                optionA = "Farmers and their families",
                optionB = "Producers, wholesalers and retailers",
                optionC = "Producers and consumers",
                optionD = "Producers and processors",
                correctAnswerIndex = 1,
                explanation = "The standard distribution chain for agricultural and food commodities in Nigeria runs from the producers (farmers) through wholesalers (who bulk-buy) and retailers (who break bulk) to final consumers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_027",
                subject = "Economics",
                topic = "Corporate Finance and Debentures",
                year = "1984",
                questionText = "Which of the following is NOT true of debentures and debenture holders?",
                optionA = "Debentures are instruments for raising long-term capital by limited liability companies",
                optionB = "Debentures are fixed interest-bearing securities with specified maturity dates",
                optionC = "Debenture holders are creditors to the company and therefore do not share in the profits",
                optionD = "Debenture holders have voting rights and control the board of directors",
                correctAnswerIndex = 3,
                explanation = "Debenture holders are creditors, not owners, of a company. They receive fixed interest payments regardless of profits and do not possess any voting rights at annual general meetings.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_028",
                subject = "Economics",
                topic = "Public Utilities",
                year = "1984",
                questionText = "The economic goal of public utilities is to",
                optionA = "Maximize profits",
                optionB = "Expand assets",
                optionC = "Minimize cost",
                optionD = "Provide essential services",
                correctAnswerIndex = 3,
                explanation = "Public utilities are state-owned enterprises established to provide critical services (such as electricity, water, and waste disposal) to citizens at affordable rates, prioritizing public service over profit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_030",
                subject = "Economics",
                topic = "Location of Industries",
                year = "1984",
                questionText = "The most important factor determining the location of the cement industry in Nigeria today is",
                optionA = "Capital and government policy",
                optionB = "The nature of the product, infrastructure and government policy",
                optionC = "Nearness to the market and source of power",
                optionD = "Nearness to raw materials",
                correctAnswerIndex = 3,
                explanation = "Cement manufacturing requires massive, heavy raw materials like limestone. Since limestone is highly bulky and expensive to transport, cement factories are universally localized near raw material quarries.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1984_031",
                subject = "Economics",
                topic = "Money and Financial Institutions",
                year = "1984",
                questionText = "The most important characteristic of money is",
                optionA = "Portability",
                optionB = "Intrinsic value",
                optionC = "Acceptability",
                optionD = "Usefulness",
                correctAnswerIndex = 2,
                explanation = "For any commodity to function effectively as a medium of exchange, it must be generally and legally accepted by all members of the society in settlement of debts and transactions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1984 • Q31"
            )
        )

        // ==========================================
        // 1985 SERIES
        // ==========================================
        list.add(
            QuestionEntity(
                id = "eco_1985_001",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "1985",
                questionText = "One main quality of a good is that it",
                optionA = "Is sold in the market",
                optionB = "Satisfies wants",
                optionC = "Is made in the factory",
                optionD = "Is always tangible",
                correctAnswerIndex = 1,
                explanation = "In economic theory, any physical object or intangible service is classified as a 'good' if it possesses utility—the inherent capacity to satisfy human wants.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_002",
                subject = "Economics",
                topic = "Circular Flow of Income",
                year = "1985",
                questionText = "The interdependence between household and business enterprise (circular flows) is known as",
                optionA = "Market interaction",
                optionB = "Cash flow",
                optionC = "Circular flow of income",
                optionD = "Supply and demand for goods and services",
                correctAnswerIndex = 2,
                explanation = "The continuous model showing how money, resources, and final products move between households (consumers) and business firms (producers) is called the Circular Flow of Income.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_003",
                subject = "Economics",
                topic = "Basic Economic Concepts: Opportunity Cost",
                year = "1985",
                questionText = "Bisi needs a book costing N10.00 and a hat costing N10.00. If Bisi buys the book instead of the hat, the opportunity cost of his choice is the",
                optionA = "Cost of the book",
                optionB = "Cost of the hat",
                optionC = "Book itself",
                optionD = "Hat itself",
                correctAnswerIndex = 3,
                explanation = "Opportunity cost is defined as the alternative forgone when a choice is made. By choosing to buy the book, Bisi sacrificed the alternative item, which is the hat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_005",
                subject = "Economics",
                topic = "Scale of Preference",
                year = "1985",
                questionText = "The meaning of scale of preference is",
                optionA = "Preparing a list of goods and services to be purchased in order of priority",
                optionB = "Showing the monthly income",
                optionC = "Budget preparation without due regard to proper priorities",
                optionD = "Consumer preference for luxurious goods",
                correctAnswerIndex = 0,
                explanation = "A scale of preference is a list of unsatisfied wants compiled in order of their importance or intensity, allowing consumers to satisfy their most pressing wants first.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_006",
                subject = "Economics",
                topic = "Optimum Population",
                year = "1985",
                questionText = "Optimum population is desirable because it enables an economy to attain maximum",
                optionA = "Per capita income",
                optionB = "Per capita output",
                optionC = "Per capita real income",
                optionD = "Per capita revenue",
                correctAnswerIndex = 2,
                explanation = "Optimum population is the ideal population size which, when combined with available capital, resources, and technology, yields the highest possible output or real income per head.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_007",
                subject = "Economics",
                topic = "Population and Demography",
                year = "1985",
                questionText = "The age distribution of a population is NOT influenced by",
                optionA = "Birth rates",
                optionB = "Death rates",
                optionC = "Patterns of immigration",
                optionD = "School leaving age",
                correctAnswerIndex = 3,
                explanation = "While birth rates, death rates, and migration alter the population's age structure, the school leaving age is a social/legal regulation that has no biological impact on demographic age distribution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_008",
                subject = "Economics",
                topic = "Malthusian Population Theory",
                year = "1985",
                questionText = "The population theory which contends that population tends to increase geometrically while food supply increases arithmetically was propounded by",
                optionA = "Prof. Paul Samuelson",
                optionB = "Adam Smith",
                optionC = "David Ricardo",
                optionD = "Rev. Thomas Malthus",
                correctAnswerIndex = 3,
                explanation = "In 1798, the Reverend Thomas Robert Malthus published his famous essay warning that unchecked human population growth outpaces agricultural expansion, leading to eventual famine and misery.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_011",
                subject = "Economics",
                topic = "Economic Systems and Price Mechanism",
                year = "1985",
                questionText = "In market economies, resources are allocated through the",
                optionA = "Government authorities",
                optionB = "Price system",
                optionC = "Banking system",
                optionD = "Central planning bureau",
                correctAnswerIndex = 1,
                explanation = "In a free-market capitalist system, resources are allocated automatically through the price system (or price mechanism), where consumer demand and producer supply establish market clearing prices.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_013",
                subject = "Economics",
                topic = "Consumer Behaviour: Indifference Curves",
                year = "1985",
                questionText = "At every point on an indifference curve, the",
                optionA = "Total utility is decreasing",
                optionB = "Prices of all goods are constant",
                optionC = "Consumer is satiated",
                optionD = "Level of utility is constant",
                correctAnswerIndex = 3,
                explanation = "An indifference curve represents different combinations of two commodities that yield the exact same level of total satisfaction or utility to the consumer, making them indifferent between any points on the curve.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_014",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "1985",
                questionText = "Under perfect competition, the long-run equilibrium requires",
                optionA = "MR = MC",
                optionB = "MR = AC = AR",
                optionC = "MR > MC",
                optionD = "MR = MC = AR = AC",
                correctAnswerIndex = 3,
                explanation = "In long-run equilibrium under perfect competition, firms earn only normal profits. This occurs at the point where the horizontal demand curve (AR = MR = Price) is tangent to the lowest point of the long-run average cost (LAC) curve, meaning P = MR = MC = AC.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_016",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "1985",
                questionText = "If a monopoly is attempting to maximize profit, which of the following should it attempt to do?",
                optionA = "Select that output at which ATC is at minimum",
                optionB = "Set price equal to TC",
                optionC = "Maximize revenues",
                optionD = "Equate marginal cost to marginal revenue",
                correctAnswerIndex = 3,
                explanation = "To maximize profit, any business firm—whether in perfect competition, oligopoly, or monopoly—must expand production up to the exact point where Marginal Cost equals Marginal Revenue (MC = MR).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_018",
                subject = "Economics",
                topic = "Economic Underdevelopment",
                year = "1985",
                questionText = "Which of the following is NOT a feature of economic underdevelopment?",
                optionA = "Low per capita income",
                optionB = "Vicious circle of poverty",
                optionC = "Low level of industrialization",
                optionD = "High per capita income",
                correctAnswerIndex = 3,
                explanation = "High per capita income is a prominent feature of highly developed, advanced industrial nations, whereas underdeveloped countries suffer from low per capita incomes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_019",
                subject = "Economics",
                topic = "Channels of Distribution",
                year = "1985",
                questionText = "The inefficient distribution of scarce commodities in Nigeria is mostly due to the",
                optionA = "Inefficiency of the middleman",
                optionB = "Inefficiency in the production process",
                optionC = "Long chain of the distribution system",
                optionD = "Sovereignty of the consumers",
                correctAnswerIndex = 2,
                explanation = "The presence of an excessive number of middlemen in Nigeria's distribution chain delays delivery, increases spoilage of agricultural produce, and causes retail prices to inflate significantly.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_020",
                subject = "Economics",
                topic = "Wholesaling and Warehousing",
                year = "1985",
                questionText = "Warehousing facilities in the distribution and marketing of products are provided by",
                optionA = "Manufacturers",
                optionB = "Wholesalers",
                optionC = "Retailers",
                optionD = "Consumers",
                correctAnswerIndex = 1,
                explanation = "Wholesalers buy goods in massive bulk from factories. They perform the critical function of storing these goods safely in specialized warehouses before breaking bulk and selling them to retailers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_021",
                subject = "Economics",
                topic = "Capital Markets and Bonds",
                year = "1985",
                questionText = "A corporation can obtain funds by issuing bonds. A bond is a form of debt which falls due for repayment after",
                optionA = "6 months",
                optionB = "9 months",
                optionC = "2 years",
                optionD = "10 or more years",
                correctAnswerIndex = 3,
                explanation = "Bonds are formal long-term debt instruments issued by corporations or governments to raise capital. They have fixed interest rates and typically mature over long-term periods like 10, 20, or 30 years.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_023",
                subject = "Economics",
                topic = "Limited Liability",
                year = "1985",
                questionText = "Limited liability means",
                optionA = "The debts of a company can only be paid from business as well as private funds of the owners",
                optionB = "The debts of the company are paid from private funds of the owners",
                optionC = "Government cannot tax company",
                optionD = "The debts of the company must be paid from business assets only, up to the value of shareholder investment",
                correctAnswerIndex = 3,
                explanation = "Limited liability protects owners. If a joint-stock company goes bankrupt, shareholders can only lose the capital they invested in shares; creditors cannot seize their personal bank accounts or property to satisfy company debts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_024",
                subject = "Economics",
                topic = "Money and Inflation",
                year = "1985",
                questionText = "The purchasing power of the Naira will fall when",
                optionA = "The Naira is devalued",
                optionB = "Government cuts all salaries and wages",
                optionC = "There is inflation",
                optionD = "The colour of the Naira is changed",
                correctAnswerIndex = 2,
                explanation = "The purchasing power of money refers to the quantity of goods a unit of currency can buy. During inflation, prices rise persistently, meaning a single Naira buys fewer goods than before (purchasing power falls).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_025",
                subject = "Economics",
                topic = "Business Organizations: Unlimited Liability",
                year = "1985",
                questionText = "When a business has unlimited liability",
                optionA = "All its profits can be taxed away by the government",
                optionB = "All its assets are owned by the members of its board of directors",
                optionC = "The business ceases to exist at the death of one of its owners",
                optionD = "The owners are personally responsible for all its financial debts",
                correctAnswerIndex = 3,
                explanation = "Sole proprietorships and ordinary partnerships have unlimited liability, meaning if the business fails, the owners' personal properties can be legally seized to pay outstanding business debts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_028",
                subject = "Economics",
                topic = "Commercial and Central Banking",
                year = "1985",
                questionText = "One of the functions of a commercial bank is that it is",
                optionA = "Responsible for monetary policy",
                optionB = "Responsible for issuing of currency notes",
                optionC = "The lender of last resort",
                optionD = "A banker of demand and time deposits of customers",
                correctAnswerIndex = 3,
                explanation = "Unlike the Central Bank (which issues currency, coordinates monetary policy, and serves as the government's bank), commercial banks are retail financial utilities that accept checkable demand deposits and savings deposits from the public.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_029",
                subject = "Economics",
                topic = "Functions of Money",
                year = "1985",
                questionText = "Because money serves as a standard of deferred payments",
                optionA = "It serves as a store of value",
                optionB = "Goods can be bought on credit with determined value",
                optionC = "Future trade becomes impossible",
                optionD = "It prevents hyperinflation",
                correctAnswerIndex = 1,
                explanation = "The deferred payment function of money enables the credit system. It allows contracts and transactions to be made today with payments deferred to a future date using a stable, mutually agreed monetary unit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_031",
                subject = "Economics",
                topic = "Public Finance: Budgets",
                year = "1985",
                questionText = "A state budget is an outline of planned",
                optionA = "Expenditures and revenues expected within a financial year",
                optionB = "Expenditures of ministries and parastatals within a given period",
                optionC = "Recurrent and capital expenditures within a year",
                optionD = "Sources of revenue derivation for a financial year",
                correctAnswerIndex = 0,
                explanation = "A budget is a formal financial statement containing the government's estimated revenues and planned expenditures for a prospective twelve-month fiscal year.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_032",
                subject = "Economics",
                topic = "Canons of Taxation",
                year = "1985",
                questionText = "Which of the following is NOT among the canons of taxation as set out by Adam Smith?",
                optionA = "Equality",
                optionB = "Security",
                optionC = "Certainty",
                optionD = "Convenience",
                correctAnswerIndex = 1,
                explanation = "Adam Smith's four landmark principles or 'canons' of taxation are Equity (Equality), Certainty, Convenience, and Economy. Security is not one of them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_033",
                subject = "Economics",
                topic = "Taxation: Regressive Tax",
                year = "1985",
                questionText = "An example of a regressive tax is",
                optionA = "The personal income tax",
                optionB = "The graduated corporation income tax",
                optionC = "A general sales tax",
                optionD = "The inheritance tax",
                correctAnswerIndex = 2,
                explanation = "A flat sales tax on retail purchases is highly regressive because lower-income earners spend a much larger percentage of their income on consumer goods compared to high-income earners, paying a larger relative tax fraction.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_034",
                subject = "Economics",
                topic = "Taxation: Excise Duties",
                year = "1985",
                questionText = "A tax which is levied on goods manufactured, sold, or used within the country is called",
                optionA = "Sales tax",
                optionB = "Excise tax",
                optionC = "Direct tax",
                optionD = "Income tax",
                correctAnswerIndex = 1,
                explanation = "Excise duties are inland taxes levied on specific locally manufactured goods (such as alcohol, tobacco, or fuel) during their production stage within the country.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1985_035",
                subject = "Economics",
                topic = "International Trade: Terms of Trade",
                year = "1985",
                questionText = "By terms of trade, we mean the",
                optionA = "Ratio of exports to imports",
                optionB = "Difference between exports and imports",
                optionC = "Difference between current account and capital account",
                optionD = "Index of export prices to import prices expressed as a percentage",
                correctAnswerIndex = 3,
                explanation = "The Terms of Trade (TOT) measures the purchasing power of a country's exports in terms of imports. It is calculated as the ratio of the export price index to the import price index, multiplied by 100.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q35"
            )
        )

        return list
    }
}
