package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB All-Subjects Master Revision Bank Volume 3 - Part 2 (100 Questions)
 * Subjects: Economics, Government, Literature in English, Christian Religious Studies (CRS), Financial Accounting
 * Standardized 4-Option CBT format with comprehensive pedagogical explanations.
 */
object JambAllSubjectMasterRevisionVol3Part2QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 6. ECONOMICS (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_001",
                subject = "Economics",
                topic = "Basic Concepts: Opportunity Cost",
                year = "1983",
                questionText = "Which of the following is the fundamental reason why the problem of opportunity cost arises in an economy?",
                optionA = "Money is scarce",
                optionB = "Human wants are unlimited while resources are limited",
                optionC = "Producers aim only at maximizing profit",
                optionD = "Prices of commodities always fluctuate",
                correctAnswerIndex = 1,
                explanation = "Opportunity cost (the alternative forgone) arises fundamentally because human wants are unlimited and recurring, whereas available productive resources are strictly scarce and have alternative uses.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_002",
                subject = "Economics",
                topic = "Production Possibility Curve",
                year = "1983",
                questionText = "A point located strictly inside a society's Production Possibility Curve (PPC) indicates:",
                optionA = "Attainable production with full employment of resources",
                optionB = "Unattainable production with current technology",
                optionC = "Inefficient utilization or underemployment of resources",
                optionD = "A state of economic growth",
                correctAnswerIndex = 2,
                explanation = "Points along the PPC represent full, efficient employment of resources; points outside are unattainable with existing technology; and points inside indicate idle, misallocated, or underutilized resources.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_003",
                subject = "Economics",
                topic = "Price Theory: Demand and Supply",
                year = "1983",
                questionText = "An increase in the equilibrium price of a commodity alongside an increase in equilibrium quantity is caused by:",
                optionA = "A rightward shift of the demand curve",
                optionB = "A leftward shift of the demand curve",
                optionC = "A rightward shift of the supply curve",
                optionD = "A leftward shift of the supply curve",
                correctAnswerIndex = 0,
                explanation = "When demand increases (shifts rightward) while supply remains unchanged, both equilibrium price and equilibrium quantity rise.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_004",
                subject = "Economics",
                topic = "Elasticity of Demand: Calculation",
                year = "1983",
                questionText = "When the price of a good falls from ₦20 to ₦15, quantity demanded increases from 100 units to 150 units. What is the price elasticity of demand?",
                optionA = "0.5",
                optionB = "1.0",
                optionC = "2.0",
                optionD = "1.5",
                correctAnswerIndex = 2,
                explanation = "% change in quantity demanded = (50 / 100) * 100% = 50%. % change in price = (-5 / 20) * 100% = -25%. Price elasticity of demand = |50% / -25%| = 2.0.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_005",
                subject = "Economics",
                topic = "Theory of Production: Diminishing Returns",
                year = "1983",
                questionText = "The Law of Diminishing Marginal Returns states that as successive units of a variable factor are added to a fixed factor:",
                optionA = "Total product will continually decline from the beginning",
                optionB = "Marginal product will eventually begin to decline",
                optionC = "Average product will always exceed total product",
                optionD = "Fixed costs will increase exponentially",
                correctAnswerIndex = 1,
                explanation = "The Law of Diminishing Returns asserts that holding at least one input fixed, adding successive units of a variable factor will eventually cause marginal product to diminish.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_006",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "1983",
                questionText = "In a perfectly competitive market, the individual firm's demand curve is:",
                optionA = "Downward sloping from left to right",
                optionB = "Infinitely elastic (horizontal line)",
                optionC = "Completely inelastic (vertical line)",
                optionD = "Upward sloping",
                correctAnswerIndex = 1,
                explanation = "In perfect competition, individual sellers are price takers facing an infinitely (perfectly) elastic horizontal demand curve where Price = Marginal Revenue = Average Revenue.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_007",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "1983",
                questionText = "A monopolist maximizes total profit at the output level where:",
                optionA = "Marginal Cost equals Average Revenue",
                optionB = "Marginal Cost equals Marginal Revenue",
                optionC = "Price equals Average Total Cost",
                optionD = "Total Revenue is at minimum",
                correctAnswerIndex = 1,
                explanation = "Under all market structures, profit maximization occurs strictly at the output level where Marginal Cost (MC) equals Marginal Revenue (MR) with MC cutting MR from below.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_008",
                subject = "Economics",
                topic = "Money and Banking: Central Bank Functions",
                year = "1983",
                questionText = "Which of the following is an exclusive traditional function of the Central Bank?",
                optionA = "Granting personal loans to the general public",
                optionB = "Issuing legal tender currency notes and coins",
                optionC = "Accepting savings deposits from retail customers",
                optionD = "Underwriting retail insurance policies",
                correctAnswerIndex = 1,
                explanation = "The Central Bank holds the exclusive constitutional monopoly to issue legal tender currency and act as banker to the government and commercial banks.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_009",
                subject = "Economics",
                topic = "National Income: Net National Product",
                year = "1983",
                questionText = "Net National Product (NNP) at market prices is mathematically calculated as:",
                optionA = "Gross National Product minus Depreciation",
                optionB = "Gross Domestic Product plus Net Export",
                optionC = "Gross National Product plus Subsidies",
                optionD = "National Income minus Indirect Taxes",
                correctAnswerIndex = 0,
                explanation = "Net National Product (NNP) is obtained by deducting capital consumption allowance (depreciation) from Gross National Product (GNP): NNP = GNP - Depreciation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_011",
                subject = "Economics",
                topic = "Inflation: Types and Causes",
                year = "1983",
                questionText = "Inflation caused by sustained increases in the costs of raw materials and wages is termed:",
                optionA = "Demand-pull inflation",
                optionB = "Cost-push inflation",
                optionC = "Hyperinflation",
                optionD = "Creeping inflation",
                correctAnswerIndex = 1,
                explanation = "Cost-push inflation occurs when rising production costs (wages, raw materials, energy, imported inputs) shift the aggregate supply curve leftward, driving up price levels.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_012",
                subject = "Economics",
                topic = "Public Finance: Direct Taxes",
                year = "1983",
                questionText = "A tax system where the tax rate increases as the taxpayer's income increases is known as:",
                optionA = "Regressive tax",
                optionB = "Proportional tax",
                optionC = "Progressive tax",
                optionD = "Ad valorem tax",
                correctAnswerIndex = 2,
                explanation = "In a progressive tax system, higher income earners pay a higher percentage/proportion of their income in tax, serving to reduce wealth inequality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_013",
                subject = "Economics",
                topic = "International Trade: Comparative Advantage",
                year = "1983",
                questionText = "The Principle of Comparative Advantage was originally propounded by:",
                optionA = "Adam Smith",
                optionB = "David Ricardo",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 1,
                explanation = "David Ricardo formulated the Law of Comparative Advantage (1817), demonstrating that nations gain by specializing in goods with lowest opportunity costs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_014",
                subject = "Economics",
                topic = "International Trade: Balance of Payments",
                year = "1983",
                questionText = "The difference between the value of a country's visible exports and visible imports over a given year is the:",
                optionA = "Balance of Payments",
                optionB = "Balance of Trade",
                optionC = "Terms of Trade",
                optionD = "Current Account Balance",
                correctAnswerIndex = 1,
                explanation = "The Balance of Trade strictly measures the net monetary difference between visible exports (goods) and visible imports of merchandise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_015",
                subject = "Economics",
                topic = "Population: Malthusian Theory",
                year = "1983",
                questionText = "According to Thomas Malthus, human population tends to increase in _______ while food production increases in _______.",
                optionA = "Arithmetic progression; Geometric progression",
                optionB = "Geometric progression; Arithmetic progression",
                optionC = "Exponential progression; Logarithmic progression",
                optionD = "Constant progression; Variable progression",
                correctAnswerIndex = 1,
                explanation = "Malthus postulated that population grows geometrically (1, 2, 4, 8, 16...) while food supply increases arithmetically (1, 2, 3, 4, 5...).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_016",
                subject = "Economics",
                topic = "Economic Systems: Mixed Economy",
                year = "1983",
                questionText = "A mixed economic system is characterized primarily by:",
                optionA = "Complete state ownership of all factors of production",
                optionB = "Sole reliance on the price mechanism without state intervention",
                optionC = "Coexistence of public and private sectors in economic decision-making",
                optionD = "Customs and traditional barter trade only",
                correctAnswerIndex = 2,
                explanation = "A mixed economy combines private enterprise guided by the price mechanism alongside public sector ownership and state regulatory intervention.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_017",
                subject = "Economics",
                topic = "Business Organizations: Public Limited Company",
                year = "1983",
                questionText = "A major distinct advantage of a Public Limited Company over a Partnership is:",
                optionA = "Ease of formation without legal formalities",
                optionB = "Limited liability of shareholders and easy transferability of shares",
                optionC = "Direct personal contact with all customers",
                optionD = "Non-publication of audited financial statements",
                correctAnswerIndex = 1,
                explanation = "Shareholders in a public limited company enjoy limited financial liability up to their shareholdings and can freely trade quoted shares on the stock exchange.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_018",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "1983",
                questionText = "To curb inflation, the Central Bank can reduce commercial banks' lending reserves through:",
                optionA = "Buying treasury bills in the open market",
                optionB = "Selling government securities in the open market (OMO)",
                optionC = "Lowering the cash reserve ratio",
                optionD = "Reducing the discount rediscount rate",
                correctAnswerIndex = 1,
                explanation = "Selling treasury bills and bonds through Open Market Operations (OMO) siphons liquid cash out of commercial banks, contracting credit and curbing inflation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_019",
                subject = "Economics",
                topic = "Theory of Costs: Fixed and Variable Costs",
                year = "1983",
                questionText = "In the short run, costs that do NOT change with changes in the level of output are known as:",
                optionA = "Variable costs",
                optionB = "Marginal costs",
                optionC = "Fixed (overhead) costs",
                optionD = "Average costs",
                correctAnswerIndex = 2,
                explanation = "Fixed costs (such as factory rent, machinery depreciation, insurance) are incurred regardless of output volume, even at zero production.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_020",
                subject = "Economics",
                topic = "Economic Development: Indicators",
                year = "1983",
                questionText = "Economic growth is best measured quantitatively by continuous growth in:",
                optionA = "Nominal money supply",
                optionB = "Real Gross Domestic Product (Real GDP) per capita",
                optionC = "Total population count",
                optionD = "General consumer price index",
                correctAnswerIndex = 1,
                explanation = "Real GDP per capita adjusts nominal output for inflation and population changes, serving as the standard quantitative measure of economic growth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_vol3_1983_023",
                subject = "Economics",
                topic = "Petroleum and Agriculture in Nigeria",
                year = "1983",
                questionText = "The discovery and export boom of crude petroleum in Nigeria during the 1970s resulted in:",
                optionA = "Rapid growth of traditional agricultural exports",
                optionB = "Neglect of the agricultural sector (Dutch Disease)",
                optionC = "Immediate total industrial self-sufficiency",
                optionD = "Complete eradication of external public debt",
                correctAnswerIndex = 1,
                explanation = "The oil windfall shifted labor, investment, and policy attention away from agriculture, resulting in Dutch Disease and making Nigeria a net food importer.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q23"
            )
        )

        // =========================================================================
        // 7. GOVERNMENT (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "govt_vol3_2012_002",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2012",
                questionText = "Political sovereignty resides with:",
                optionA = "the electorate",
                optionB = "the military",
                optionC = "the parliament",
                optionD = "the judiciary",
                correctAnswerIndex = 0,
                explanation = "Political sovereignty in a democratic system ultimately belongs to the electorate (the citizens/voters) who delegate authority to elected officials via universal adult suffrage.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_1983_023",
                subject = "Government",
                topic = "Colonial Administration: Indirect Rule",
                year = "1983",
                questionText = "The primary reason why British Indirect Rule was highly successful in Northern Nigeria was:",
                optionA = "The absence of traditional chiefs",
                optionB = "The presence of a centralized authoritarian emirate administrative system",
                optionC = "Direct taxation was universally hated",
                optionD = "The strong opposition from educated elites",
                correctAnswerIndex = 1,
                explanation = "Lord Lugard's Indirect Rule succeeded in Northern Nigeria because the preexisting Sokoto Caliphate had a deeply entrenched, centralized administrative and judicial hierarchy under Emirs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1983 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2010_001",
                subject = "Government",
                topic = "Basic Concepts: Definition of State",
                year = "2010",
                questionText = "A political entity possessing a defined territory, permanent population, government, and sovereignty is defined as a:",
                optionA = "Nation",
                optionB = "State",
                optionC = "Society",
                optionD = "Community",
                correctAnswerIndex = 1,
                explanation = "In political science, a State is characterized by four fundamental prerequisites: defined territory, permanent population, functioning government, and sovereign independence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2010_005",
                subject = "Government",
                topic = "Forms of Government: Federal System",
                year = "2010",
                questionText = "A major feature that distinguishes a federal state from a unitary state is:",
                optionA = "The presence of a single unwritten constitution",
                optionB = "Constitutional division of powers between central and regional governments",
                optionC = "The total absence of local administrative councils",
                optionD = "Concentration of all legislative authority in the national assembly only",
                correctAnswerIndex = 1,
                explanation = "A federal system is defined by a rigid, written constitution dividing sovereign powers between a central government and federating sub-national units (states/provinces).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2010_010",
                subject = "Government",
                topic = "Constitutional Law: Rule of Law",
                year = "2010",
                questionText = "The doctrine of the Rule of Law formulated by A.V. Dicey implies:",
                optionA = "Absolute power for the executive head of state",
                optionB = "Supremacy of regular law, equality before the law, and protection of individual rights",
                optionC = "Military tribunal supremacy over civil courts",
                optionD = "Immunity of civil servants from judicial prosecution",
                correctAnswerIndex = 1,
                explanation = "A.V. Dicey identified three core tenets: supremacy of ordinary law over arbitrary power, equality of all citizens before regular courts, and constitutional protection of civil liberties.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2011_015",
                subject = "Government",
                topic = "Organs of Government: Separation of Powers",
                year = "2011",
                questionText = "The principle of Checks and Balances is designed primarily to:",
                optionA = "Prevent any single organ of government from abusing its power",
                optionB = "Merge the judiciary and the legislature into one body",
                optionC = "Give supreme dominance to the executive",
                optionD = "Abolish judicial review of executive orders",
                correctAnswerIndex = 0,
                explanation = "Checks and balances empower each distinct branch (Legislature, Executive, Judiciary) to scrutinize, restrain, and counterbalance the other branches, safeguarding against tyranny.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2011_018",
                subject = "Government",
                topic = "Electoral Systems: Simple Majority",
                year = "2011",
                questionText = "The electoral system where the candidate with the highest number of valid votes is declared winner is the:",
                optionA = "Proportional representation system",
                optionB = "First-Past-The-Post (Plurality) system",
                optionC = "Alternative vote system",
                optionD = "Second ballot system",
                correctAnswerIndex = 1,
                explanation = "In the simple majority or First-Past-The-Post system, the candidate securing more votes than any other individual contender wins the seat, regardless of an absolute majority.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2011_025",
                subject = "Government",
                topic = "Colonial Constitutional History: Clifford Constitution",
                year = "2011",
                questionText = "The Clifford Constitution of 1922 is historic in Nigeria because it introduced:",
                optionA = "Federalism",
                optionB = "The Elective Principle",
                optionC = "A bicameral legislature",
                optionD = "Universal adult suffrage for all women",
                correctAnswerIndex = 1,
                explanation = "The 1922 Clifford Constitution introduced the elective principle for the first time in British West Africa, providing 4 elected seats (3 for Lagos, 1 for Calabar).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2012_030",
                subject = "Government",
                topic = "Pre-Colonial Administration: Oyo Empire",
                year = "2012",
                questionText = "In the pre-colonial Oyo empire, the checks on the powers of the Alaafin were exercised primarily by the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society only",
                optionC = "Are-Ona-Kakanfo",
                optionD = "Baale",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi (council of seven kingmakers led by the Bashorun) held the supreme constitutional check on the Alaafin, possessing power to demand his abdication/suicide.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2012_035",
                subject = "Government",
                topic = "Constitutional History: Richards Constitution",
                year = "2012",
                questionText = "A major objective of the Richards Constitution of 1946 in Nigeria was to:",
                optionA = "Grant immediate full political independence",
                optionB = "Promote national unity and integrate Northern and Southern Nigeria in one council",
                optionC = "Establish a military command structure",
                optionD = "Abolish the House of Chiefs",
                correctAnswerIndex = 1,
                explanation = "Sir Arthur Richards formulated the 1946 Constitution to secure greater participation, create regional councils (North, West, East), and unify Northern and Southern representatives in the Legislative Council.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2013_001",
                subject = "Government",
                topic = "Public Administration: Civil Service Neutrality",
                year = "2013",
                questionText = "An essential characteristic of the Civil Service is:",
                optionA = "Political partisanship",
                optionB = "Political neutrality and anonymity",
                optionC = "Temporary tenure tied to presidential terms",
                optionD = "Immunity from government audits",
                correctAnswerIndex = 1,
                explanation = "Civil servants must maintain political neutrality, impartiality, permanence of career tenure, and administrative anonymity (speaking through the Minister/Commissioner).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2013_012",
                subject = "Government",
                topic = "Local Government: Purpose",
                year = "2013",
                questionText = "Local governments are established primarily to:",
                optionA = "Take over the military duties of the federal government",
                optionB = "Bring governance closer to the grassroots people and stimulate local development",
                optionC = "Manage international diplomatic relations",
                optionD = "Issue national passports and visas",
                correctAnswerIndex = 1,
                explanation = "Local government is the third tier of government created to decentralize power, encourage grassroots participation, and cater to localized community needs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2013_015",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2013",
                questionText = "The Economic Community of West African States (ECOWAS) was established in 1975 under the Treaty of:",
                optionA = "Abuja",
                optionB = "Lagos",
                optionC = "Accra",
                optionD = "Dakar",
                correctAnswerIndex = 1,
                explanation = "ECOWAS was officially founded on May 28, 1975, through the signing of the Treaty of Lagos by 15 West African heads of state.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2014_008",
                subject = "Government",
                topic = "Political Parties: Functions",
                year = "2014",
                questionText = "A primary constitutional function of political parties in a democracy is:",
                optionA = "Recruiting political leaders and contesting elections",
                optionB = "Commanding the national armed forces",
                optionC = "Conducting population censuses",
                optionD = "Interpreting laws in supreme courts",
                correctAnswerIndex = 0,
                explanation = "Political parties exist to aggregate interests, socialize citizens politically, nominate candidates, contest elections, and form governments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2014_021",
                subject = "Government",
                topic = "Constitutional History: Macpherson Constitution",
                year = "2014",
                questionText = "The 1951 Macpherson Constitution was unique because it was drafted after:",
                optionA = "A bloody civil war",
                optionB = "Nationwide grassroots consultations from village to national levels",
                optionC = "A decree by the British Monarch without local input",
                optionD = "An advisory referendum in Cameroon only",
                correctAnswerIndex = 1,
                explanation = "Unlike previous colonial constitutions imposed from London, Sir John Macpherson instituted extensive consultations at village, district, provincial, and regional levels.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2014_025",
                subject = "Government",
                topic = "Constitutional History: Independence 1960",
                year = "2014",
                questionText = "Under Nigeria's 1960 Independence Constitution, the formal Head of State was:",
                optionA = "The Prime Minister",
                optionB = "The Queen of Great Britain (represented by the Governor-General)",
                optionC = "The President of the Senate",
                optionD = "The Chief Justice of the Federation",
                correctAnswerIndex = 1,
                explanation = "Under the 1960 parliamentary constitution, Nigeria was a constitutional monarchy with Queen Elizabeth II as titular Head of State represented by Governor-General Nnamdi Azikiwe.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2015_030",
                subject = "Government",
                topic = "Constitutional History: 1963 Republican Constitution",
                year = "2015",
                questionText = "The 1963 Republican Constitution of Nigeria replaced the British Monarch as Head of State with:",
                optionA = "An Executive Prime Minister",
                optionB = "A Ceremonial President",
                optionC = "A Military Supreme Commander",
                optionD = "A Secretary-General",
                correctAnswerIndex = 1,
                explanation = "The 1963 Republican Constitution severed constitutional links to the British crown, establishing a Republic with a ceremonial President (Dr. Nnamdi Azikiwe) elected by Parliament.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2015_035",
                subject = "Government",
                topic = "Foreign Policy: Non-Alignment",
                year = "2015",
                questionText = "The policy of Non-Alignment adopted by Nigeria during the Cold War meant:",
                optionA = "Refusal to join the United Nations Organization",
                optionB = "Maintaining independent foreign policy without formal military alignment to Western or Eastern power blocs",
                optionC = "Establishing embassies exclusively in African nations",
                optionD = "Declining international trade and foreign loans",
                correctAnswerIndex = 1,
                explanation = "Non-alignment allowed post-colonial developing nations to pursue sovereign foreign policy decisions on merit rather than being coerced into Western (NATO) or Eastern (Warsaw Pact) alliances.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2015_040",
                subject = "Government",
                topic = "International Organizations: African Union",
                year = "2015",
                questionText = "The Organization of African Unity (OAU) transformed into the African Union (AU) in:",
                optionA = "1999 (Sirte)",
                optionB = "2002 (Durban)",
                optionC = "1963 (Addis Ababa)",
                optionD = "1975 (Lagos)",
                correctAnswerIndex = 1,
                explanation = "The OAU was formally officially launched as the African Union (AU) at the Durban Summit in South Africa in July 2002.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "govt_vol3_2015_045",
                subject = "Government",
                topic = "Foreign Policy: Afrocentric Policy",
                year = "2015",
                questionText = "Nigeria's foreign policy has consistently maintained that _______ is the centerpiece of its diplomatic engagements.",
                optionA = "Asia",
                optionB = "Europe",
                optionC = "Africa",
                optionD = "North America",
                correctAnswerIndex = 2,
                explanation = "Since independence, successive Nigerian administrations have maintained an 'Afrocentric' foreign policy, prioritizing African decolonization, anti-apartheid struggles, and regional integration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Q45"
            )
        )

        // =========================================================================
        // 8. LITERATURE IN ENGLISH (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_vol3_2010_008",
                subject = "Literature in English",
                topic = "Literary Appreciation: Figures of Speech",
                year = "2010",
                questionText = "A figure of speech in which a part of something is used to represent the whole, or the whole represents a part, is called:",
                optionA = "Metaphor",
                optionB = "Synecdoche",
                optionC = "Metonymy",
                optionD = "Hyperbole",
                correctAnswerIndex = 1,
                explanation = "Synecdoche is a trope where a part stands for the whole (e.g., 'all hands on deck' where 'hands' means crew members) or the whole for a part.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2010 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_018",
                subject = "Literature in English",
                topic = "Poetry: Poetic Form",
                year = "2012",
                questionText = "A lyric poem of fourteen lines with a strict rhyme scheme and iambic pentameter meter is a:",
                optionA = "Ballad",
                optionB = "Sonnet",
                optionC = "Ode",
                optionD = "Elegy",
                correctAnswerIndex = 1,
                explanation = "A sonnet is a 14-line poem written in iambic pentameter, traditionally divided into Petrarchan (octave + sestet) or Shakespearean (three quatrains + couplet) forms.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_028",
                subject = "Literature in English",
                topic = "Dramatic Techniques: Soliloquy",
                year = "2012",
                questionText = "In drama, when a character speaks their innermost thoughts aloud while alone on stage, the convention is called a:",
                optionA = "Dialogue",
                optionB = "Soliloquy",
                optionC = "Aside",
                optionD = "Monologue delivered to chorus",
                correctAnswerIndex = 1,
                explanation = "A soliloquy is a dramatic speech delivered by an actor alone on stage to reveal internal emotional states, dilemmas, and motives directly to the audience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_029",
                subject = "Literature in English",
                topic = "Dramatic Conventions: Aside",
                year = "2012",
                questionText = "A short speech delivered by a dramatic character intended only for the audience and presumed unheard by other characters on stage is an:",
                optionA = "Aside",
                optionB = "Epilogue",
                optionC = "Prologue",
                optionD = "Interlude",
                correctAnswerIndex = 0,
                explanation = "An aside is a brief remark directed exclusively to the audience while other characters remain onstage under the theatrical convention that they cannot hear it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_030",
                subject = "Literature in English",
                topic = "Tragedy: Tragic Flaw",
                year = "2012",
                questionText = "The internal fatal defect or error in judgment that leads to the downfall of a tragic hero is termed:",
                optionA = "Catharsis",
                optionB = "Hamartia",
                optionC = "Anagnorisis",
                optionD = "Peripeteia",
                correctAnswerIndex = 1,
                explanation = "Hamartia is Aristotle's term for the tragic flaw, character vulnerability, or fateful error in judgment that causes the protagonist's downfall.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_031",
                subject = "Literature in English",
                topic = "Dramatic Appreciation: Catharsis",
                year = "2012",
                questionText = "The emotional release and purification of pity and fear experienced by an audience at the climax of a classical tragedy is called:",
                optionA = "Catharsis",
                optionB = "Hubris",
                optionC = "Nemesis",
                optionD = "Deus ex machina",
                correctAnswerIndex = 0,
                explanation = "Catharsis represents the purgation and therapeutic emotional resolution of intense pity and terror evoked by the hero's tragic suffering.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_039",
                subject = "Literature in English",
                topic = "Literary Devices: Oxymoron",
                year = "2012",
                questionText = "The phrase 'cruel kindness' or 'deafening silence' is an example of:",
                optionA = "Paradox",
                optionB = "Oxymoron",
                optionC = "Irony",
                optionD = "Pun",
                correctAnswerIndex = 1,
                explanation = "An oxymoron is a compact figure of speech that pairs two adjacent contradictory terms to produce a poignant rhetorical effect.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_040",
                subject = "Literature in English",
                topic = "Literary Devices: Onomatopoeia",
                year = "2012",
                questionText = "The literary device where words phonetically imitate the actual sound of the action they describe (e.g. 'buzz', 'hiss', 'splash') is:",
                optionA = "Alliteration",
                optionB = "Assonance",
                optionC = "Onomatopoeia",
                optionD = "Consonance",
                correctAnswerIndex = 2,
                explanation = "Onomatopoeia is the naming of a thing or action by a vocal imitation of the sound associated with it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_041",
                subject = "Literature in English",
                topic = "Prescribed Drama: Wole Soyinka's King Baabu",
                year = "2012",
                questionText = "In Wole Soyinka's satirical play King Baabu, the eponymous character Baabu is an allegory for:",
                optionA = "Corrupt academic administrators",
                optionB = "Brutal, self-aggrandizing military dictators in post-colonial Africa",
                optionC = "Benevolent traditional monarchs",
                optionD = "Foreign colonial governors",
                correctAnswerIndex = 1,
                explanation = "Soyinka's King Baabu is a political satire modeled on Alfred Jarry's Ubu Roi, lampooning grotesque military dictatorship (particularly General Sani Abacha's regime).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2013_021",
                subject = "Literature in English",
                topic = "Poetry: Types of Poems",
                year = "2013",
                questionText = "A poem written to lament and mourn the death of a specific individual is an:",
                optionA = "Ode",
                optionB = "Elegy",
                optionC = "Epic",
                optionD = "Epigram",
                correctAnswerIndex = 1,
                explanation = "An elegy is a mournful, contemplative poem expressing sorrow, grief, and reflection for someone deceased.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2013 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2014_042",
                subject = "Literature in English",
                topic = "Poetic Devices: Metre",
                year = "2014",
                questionText = "A metrical foot consisting of one unstressed syllable followed by a stressed syllable (da-DUM) is an:",
                optionA = "Trochee",
                optionB = "Iamb",
                optionC = "Anapest",
                optionD = "Dactyl",
                correctAnswerIndex = 1,
                explanation = "An iamb (or iambic foot) consists of an unaccented short syllable followed by an accented long/stressed syllable (e.g., 'to-DAY').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2014_043",
                subject = "Literature in English",
                topic = "Prose Appreciation: Point of View",
                year = "2014",
                questionText = "When a narrator knows all thoughts, motivations, actions, and secrets of every character in a novel, the point of view is:",
                optionA = "First-person subjective",
                optionB = "Third-person omniscient",
                optionC = "Second-person limited",
                optionD = "Epistolary narrative",
                correctAnswerIndex = 1,
                explanation = "Third-person omniscient narration employs an all-knowing narrator with unrestricted insight into the minds, feelings, and actions of all characters.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2014_020",
                subject = "Literature in English",
                topic = "Literary Devices: Personification",
                year = "2014",
                questionText = "The line 'The merciless wind whipped through the crying forest' exhibits:",
                optionA = "Personification and pathetic fallacy",
                optionB = "Understatement",
                optionC = "Simile",
                optionD = "Irony",
                correctAnswerIndex = 0,
                explanation = "Attributing human emotions ('merciless', 'crying') to inanimate natural elements (wind, forest) is personification and pathetic fallacy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2015_019",
                subject = "Literature in English",
                topic = "Drama Appreciation: Farce",
                year = "2015",
                questionText = "A dramatic work characterized by exaggerated physical humor, absurd situations, and improbable plot twists is a:",
                optionA = "Melodrama",
                optionB = "Farce",
                optionC = "Tragicomedy",
                optionD = "Pantomime",
                correctAnswerIndex = 1,
                explanation = "Farce is a light, comedic theatrical genre relying on slapstick physical buffoonery, highly exaggerated characters, and improbable comedic dilemmas.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2015_020",
                subject = "Literature in English",
                topic = "Literary Terms: Hubris",
                year = "2015",
                questionText = "Excessive pride, insolence, or overconfidence that leads a tragic character to defy the gods or moral law is termed:",
                optionA = "Nemesis",
                optionB = "Hubris",
                optionC = "Mimesis",
                optionD = "Pathos",
                correctAnswerIndex = 1,
                explanation = "Hubris (arrogant overweening pride) causes a tragic protagonist to overstep moral boundaries, triggering retribution from nemesis/fate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2015_021",
                subject = "Literature in English",
                topic = "Poetry: Ballad Stanza",
                year = "2015",
                questionText = "A traditional folk ballad stanza typically consists of:",
                optionA = "Two rhyming hexameter couplets",
                optionB = "A four-line quatrain rhyming ABCB or ABAB with alternating 4 and 3 beats",
                optionC = "Fourteen unrhymed heroic lines",
                optionD = "Three lines rhyming AAA",
                correctAnswerIndex = 1,
                explanation = "The classic ballad meter is a quatrain of alternating iambic tetrameter (4 beats) and iambic trimeter (3 beats) with an ABCB or ABAB rhyme scheme.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2015_022",
                subject = "Literature in English",
                topic = "Literary Devices: Alliteration",
                year = "2015",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "Alliteration",
                optionB = "Assonance",
                optionC = "Rhyme",
                optionD = "Meter",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the literary device where initial consonant sounds are repeated in proximate words (e.g., 'Peter Piper picked a peck...').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2011_019",
                subject = "Literature in English",
                topic = "Literary Appreciation: Irony",
                year = "2011",
                questionText = "When the actual outcome of an event is completely the opposite of what was reasonably expected, it is an instance of:",
                optionA = "Dramatic irony",
                optionB = "Situational irony",
                optionC = "Verbal irony",
                optionD = "Sarcasm",
                correctAnswerIndex = 1,
                explanation = "Situational irony occurs when there is an incongruous discrepancy between the anticipated outcome and the actual reality that unfolds.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2011 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2011_020",
                subject = "Literature in English",
                topic = "Literary Appreciation: Dramatic Irony",
                year = "2011",
                questionText = "Dramatic irony occurs when:",
                optionA = "The reader/audience knows crucial facts that the character on stage does not know",
                optionB = "A character tells a blatant lie to save another",
                optionC = "The author expresses direct regret in a footnote",
                optionD = "A poem fails to rhyme correctly",
                correctAnswerIndex = 0,
                explanation = "Dramatic irony exists when the audience is aware of hidden information or impending fate that the character in the play remains ignorant of.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2011 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_vol3_2012_041b",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Kofi Awoonor's The Cathedral",
                year = "2012",
                questionText = "In Kofi Awoonor's poem 'The Cathedral', the towering cathedral built on the destroyed sacred ground represents:",
                optionA = "Universal spiritual enlightenment",
                optionB = "Western cultural and religious imperialism destroying traditional African heritage",
                optionC = "Technological agricultural advancement",
                optionD = "The beauty of architectural modernism",
                correctAnswerIndex = 1,
                explanation = "Awoonor's 'The Cathedral' uses the mud-brick cathedral erected over the felled primordial tree to symbolize the destructive imposition of Western colonial religion on African roots.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Q41b"
            )
        )

        // =========================================================================
        // 9. CHRISTIAN RELIGIOUS STUDIES (CRS) (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_001",
                subject = "CRS",
                topic = "Creation & Sovereignty of God",
                year = "1983",
                questionText = "According to the Genesis account of creation, God created man in His own image on the:",
                optionA = "Fourth day",
                optionB = "Fifth day",
                optionC = "Sixth day",
                optionD = "Seventh day",
                correctAnswerIndex = 2,
                explanation = "According to Genesis 1:26-31, God created land animals and culminated His creative works by creating mankind (male and female) on the sixth day.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_002",
                subject = "CRS",
                topic = "Patriarchs: Abraham's Call & Faith",
                year = "1983",
                questionText = "When God called Abram to leave Haran for the land of Canaan, Abram was aged:",
                optionA = "50 years",
                optionB = "75 years",
                optionC = "99 years",
                optionD = "100 years",
                correctAnswerIndex = 1,
                explanation = "Genesis 12:4 states: 'So Abram departed, as the Lord had spoken unto him... and Abram was seventy and five years old when he departed out of Haran.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_003",
                subject = "CRS",
                topic = "Moses & The Exodus: The Burning Bush",
                year = "1983",
                questionText = "When God appeared to Moses in the burning bush at Mount Horeb, God revealed His name as:",
                optionA = "El-Shaddai",
                optionB = "I AM WHO I AM (Yahweh)",
                optionC = "Jehovah-Jireh",
                optionD = "Adonai",
                correctAnswerIndex = 1,
                explanation = "In Exodus 3:14, God declared to Moses: 'I AM THAT I AM: and he said, Thus shalt thou say unto the children of Israel, I AM hath sent me unto you.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_004",
                subject = "CRS",
                topic = "The Passover: Ritual & Significance",
                year = "1983",
                questionText = "During the first Passover in Egypt, the Israelites were commanded to apply the blood of the unblemished lamb to:",
                optionA = "The altar in the temple",
                optionB = "The two side doorposts and the lintel of their houses",
                optionC = "The foreheads of their firstborn children",
                optionD = "Their garments and footwear",
                correctAnswerIndex = 1,
                explanation = "Exodus 12:7 instructs the Israelites to take the lamb's blood and strike it on the two side posts and the upper doorpost (lintel) so the destroyer would pass over.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_005",
                subject = "CRS",
                topic = "The Wilderness Journey: Provision of Manna",
                year = "1983",
                questionText = "In the wilderness of Sin, God miraculously provided food for the complaining Israelites by sending:",
                optionA = "Manna in the morning and quails in the evening",
                optionB = "Bread from olive trees and milk",
                optionC = "Fish from the sand and honey",
                optionD = "Locusts and wild figs",
                correctAnswerIndex = 0,
                explanation = "Exodus 16 records that in the evening quails came up and covered the camp, and in the morning dew lay round about which became bread-like manna.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_006",
                subject = "CRS",
                topic = "The Decalogue: The Ten Commandments",
                year = "1983",
                questionText = "Which commandment in the Decalogue comes with a specific promise of long life?",
                optionA = "Remember the Sabbath day, to keep it holy",
                optionB = "Honour thy father and thy mother",
                optionC = "Thou shalt not covet",
                optionD = "Thou shalt have no other gods before me",
                correctAnswerIndex = 1,
                explanation = "Exodus 20:12 states: 'Honour thy father and thy mother: that thy days may be long upon the land which the Lord thy God giveth thee' (Ephesians 6:2).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_007",
                subject = "CRS",
                topic = "The Era of Judges: Deborah",
                year = "1983",
                questionText = "The female judge and prophetess who accompanied Barak to defeat Sisera, commander of Jabin's army, was:",
                optionA = "Huldah",
                optionB = "Deborah",
                optionC = "Miriam",
                optionD = "Hannah",
                correctAnswerIndex = 1,
                explanation = "Judges 4:4-14 relates that Deborah, the prophetess judging Israel under the palm tree of Deborah, accompanied Barak in the decisive victory against Sisera at Mount Tabor.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_008",
                subject = "CRS",
                topic = "The Monarchy: Samuel and Saul",
                year = "1983",
                questionText = "Saul was rejected by God as King of Israel because he:",
                optionA = "Built high places for Baal worship",
                optionB = "Disobeyed God's command regarding the total destruction of the Amalekites",
                optionC = "Taxed the Israelites excessively",
                optionD = "Refused to fight the Philistine giants",
                correctAnswerIndex = 1,
                explanation = "In 1 Samuel 15, Saul spared King Agag and the best sheep and oxen of Amalek, prompting Samuel's declaration that 'to obey is better than sacrifice.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_009",
                subject = "CRS",
                topic = "Davidic Reign: Sin and Repentance",
                year = "1983",
                questionText = "The prophet sent by God to confront and convict King David after his adultery with Bathsheba and the murder of Uriah was:",
                optionA = "Gad",
                optionB = "Nathan",
                optionC = "Ahijah",
                optionD = "Elijah",
                correctAnswerIndex = 1,
                explanation = "In 2 Samuel 12, Prophet Nathan used the parable of the poor man's ewe lamb to convict David: 'Thou art the man.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_010",
                subject = "CRS",
                topic = "Solomonic Era: Wisdom and Temple",
                year = "1983",
                questionText = "When God appeared to King Solomon in a dream at Gibeon and offered him any gift, Solomon requested:",
                optionA = "Long life and victory over military foes",
                optionB = "An understanding heart (wisdom) to govern and judge the people",
                optionC = "Boundless silver and golden treasures",
                optionD = "A vast multinational empire",
                correctAnswerIndex = 1,
                explanation = "In 1 Kings 3:9, Solomon asked: 'Give therefore thy servant an understanding heart to judge thy people, that I may discern between good and bad.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_011",
                subject = "CRS",
                topic = "Prophetic Ministry: Elijah on Mount Carmel",
                year = "1983",
                questionText = "On Mount Carmel, Elijah proved that Yahweh is the true God when:",
                optionA = "An earthquake swallowed the altar of Baal",
                optionB = "Fire fell from heaven and consumed the burnt sacrifice and water in the trench",
                optionC = "A heavy thunderstorm struck down the prophets of Baal immediately",
                optionD = "The sun stood still for twelve hours",
                correctAnswerIndex = 1,
                explanation = "1 Kings 18:38 records that the fire of the Lord fell and consumed the burnt sacrifice, wood, stones, and dust, and licked up the water in the trench.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_012",
                subject = "CRS",
                topic = "Prophetic Ministry: Amos on Social Justice",
                year = "1983",
                questionText = "The 8th-century prophet Amos was primarily concerned with condemning Israel for:",
                optionA = "Social injustice, oppression of the poor, and empty ceremonial worship",
                optionB = "Refusing to build the temple in Jerusalem",
                optionC = "Failure to pay circumcision dues",
                optionD = "Refusal to go to war against Assyria",
                correctAnswerIndex = 0,
                explanation = "Prophet Amos vehemently denounced economic exploitation of the vulnerable, corrupt courts, and religious hypocrisy: 'Let judgment run down as waters, and righteousness as a mighty stream' (Amos 5:24).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_013",
                subject = "CRS",
                topic = "Prophetic Ministry: Hosea on Divine Love",
                year = "1983",
                questionText = "Prophet Hosea's marriage to unfaithful Gomer symbolized:",
                optionA = "The military alliance between Judah and Egypt",
                optionB = "God's unconditional, redeeming love for unfaithful, idolatrous Israel",
                optionC = "The commercial trade treaty with Tyre",
                optionD = "The permanent destruction of the Levitical priesthood",
                correctAnswerIndex = 1,
                explanation = "Hosea's painful marriage to Gomer served as an enacted prophetic metaphor of Yahweh's steadfast covenant love (Hesed) pursuing unfaithful Israel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_014",
                subject = "CRS",
                topic = "Synoptic Gospels: The Baptism of Jesus",
                year = "1983",
                questionText = "When Jesus was baptized by John in the River Jordan, the Holy Spirit descended upon Him in the form of a:",
                optionA = "Tongue of fire",
                optionB = "Dove",
                optionC = "Mighty rushing wind",
                optionD = "Cloud of glory",
                correctAnswerIndex = 1,
                explanation = "Matthew 3:16 records: 'the heavens were opened unto him, and he saw the Spirit of God descending like a dove, and lighting upon him.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_015",
                subject = "CRS",
                topic = "Synoptic Gospels: The Temptation of Jesus",
                year = "1983",
                questionText = "To the devil's temptation to turn stones into bread, Jesus responded by quoting Scripture stating that:",
                optionA = "The Lord will provide our daily food",
                optionB = "Man shall not live by bread alone, but by every word that proceedeth out of the mouth of God",
                optionC = "Thou shalt not tempt the Lord thy God",
                optionD = "Fast and pray without ceasing",
                correctAnswerIndex = 1,
                explanation = "In Matthew 4:4 (quoting Deuteronomy 8:3), Jesus replied: 'It is written, Man shall not live by bread alone, but by every word that proceedeth out of the mouth of God.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_016",
                subject = "CRS",
                topic = "Synoptic Gospels: The Good Samaritan",
                year = "1983",
                questionText = "In the parable of the Good Samaritan, the religious figures who saw the wounded traveler and passed by on the other side were a:",
                optionA = "Pharisee and a Scribe",
                optionB = "Priest and a Levite",
                optionC = "Sadducee and a Roman Centurion",
                optionD = "Tax collector and a Zealot",
                correctAnswerIndex = 1,
                explanation = "In Luke 10:31-32, Jesus narrated that first a priest and then a Levite arrived at the scene and walked by on the opposite side before the compassionate Samaritan stopped.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_017",
                subject = "CRS",
                topic = "Synoptic Gospels: The Transfiguration",
                year = "1983",
                questionText = "At the Transfiguration of Jesus on the mountain, the two Old Testament figures who appeared talking with Him were:",
                optionA = "Abraham and David",
                optionB = "Moses and Elijah",
                optionC = "Samuel and Isaiah",
                optionD = "Noah and Enoch",
                correctAnswerIndex = 1,
                explanation = "Matthew 17:3 recounts: 'And, behold, there appeared unto them Moses and Elias talking with him,' representing the Law and the Prophets.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_018",
                subject = "CRS",
                topic = "Passion & Resurrection: The Trial of Jesus",
                year = "1983",
                questionText = "The Roman Governor who sentenced Jesus to crucifixion despite declaring finding no guilt in Him was:",
                optionA = "Herod Antipas",
                optionB = "Pontius Pilate",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 1,
                explanation = "Pontius Pilate was the Roman prefect of Judaea who presided over Jesus' civil trial and, yielding to mob pressure, condemned Him to crucifixion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_020",
                subject = "CRS",
                topic = "Early Church: The Day of Pentecost",
                year = "1983",
                questionText = "On the Day of Pentecost in Acts 2, the Holy Spirit descended upon the gathered disciples in the Upper Room accompanied by:",
                optionA = "An earthquake and a pillar of cloud",
                optionB = "A sound from heaven as of a rushing mighty wind and cloven tongues like as of fire",
                optionC = "A solar eclipse and trumpet sound",
                optionD = "Thunderstorms and falling manna",
                correctAnswerIndex = 1,
                explanation = "Acts 2:2-3 describes: 'suddenly there came a sound from heaven as of a rushing mighty wind... and there appeared unto them cloven tongues like as of fire, and it sat upon each of them.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "crs_vol3_1983_021",
                subject = "CRS",
                topic = "Early Church: The First Christian Martyr",
                year = "1983",
                questionText = "The first Christian deacon who was stoned to death for preaching Christ in Jerusalem was:",
                optionA = "Philip",
                optionB = "Stephen",
                optionC = "Barnabas",
                optionD = "Silas",
                correctAnswerIndex = 1,
                explanation = "Acts 7 relates the trial and martyrdom of Stephen, who saw Jesus standing at the right hand of God before being stoned by the Sanhedrin.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 1983 • Q21"
            )
        )

        // =========================================================================
        // 10. FINANCIAL ACCOUNTING / PRINCIPLES OF ACCOUNTS (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_001",
                subject = "Financial Accounting",
                topic = "Introduction: Bookkeeping Definition",
                year = "1994",
                questionText = "The systematic art of recording monetary business transactions in the books of accounts is known as:",
                optionA = "Auditing",
                optionB = "Bookkeeping",
                optionC = "Cost Accounting",
                optionD = "Management",
                correctAnswerIndex = 1,
                explanation = "Bookkeeping is defined as the activity and systematic process of recording day-to-day financial transactions in double-entry books of account.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_002",
                subject = "Financial Accounting",
                topic = "Accounting Equation",
                year = "1994",
                questionText = "The fundamental accounting equation is expressed as:",
                optionA = "Assets = Liabilities + Capital",
                optionB = "Capital = Assets + Liabilities",
                optionC = "Liabilities = Assets + Capital",
                optionD = "Assets = Capital - Liabilities",
                correctAnswerIndex = 0,
                explanation = "The fundamental balance sheet equation establishes that total resources owned (Assets) equal the total claims against them (Liabilities + Owner's Equity/Capital).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_003",
                subject = "Financial Accounting",
                topic = "Double Entry Principle",
                year = "1994",
                questionText = "Under the double entry system of accounting, every debit entry in an account must have a corresponding:",
                optionA = "Cash entry",
                optionB = "Credit entry in another account",
                optionC = "Invoice number",
                optionD = "Audit voucher",
                correctAnswerIndex = 1,
                explanation = "The golden rule of double-entry bookkeeping requires that for every debit transaction, there must be an equal and corresponding credit transaction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_004",
                subject = "Financial Accounting",
                topic = "Books of Prime Entry: Sales Day Book",
                year = "1994",
                questionText = "Credit sales of inventory are initially recorded in the:",
                optionA = "Cash Book",
                optionB = "Sales Day Book (Sales Journal)",
                optionC = "Purchases Journal",
                optionD = "General Journal",
                correctAnswerIndex = 1,
                explanation = "The Sales Day Book is the book of prime/original entry used exclusively to record goods sold on credit to trade customers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_005",
                subject = "Financial Accounting",
                topic = "Books of Prime Entry: Purchases Day Book",
                year = "1994",
                questionText = "Credit purchases of merchandise for resale are first entered in the:",
                optionA = "Purchases Day Book",
                optionB = "Purchases Ledger",
                optionC = "Cash Book",
                optionD = "Petty Cash Book",
                correctAnswerIndex = 0,
                explanation = "Credit purchases of inventory are first entered chronologically in the Purchases Day Book (Purchases Journal) before posting to individual ledger accounts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_006",
                subject = "Financial Accounting",
                topic = "Trial Balance: Purpose",
                year = "1994",
                questionText = "A Trial Balance is prepared primarily to:",
                optionA = "Determine net profit or loss for the trading year",
                optionB = "Test the arithmetical accuracy of ledger postings",
                optionC = "Show the exact cash balance at the bank",
                optionD = "Prevent employee fraud and theft",
                correctAnswerIndex = 1,
                explanation = "A Trial Balance lists debit and credit ledger balances to verify that total debits equal total credits, confirming arithmetical consistency.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_007",
                subject = "Financial Accounting",
                topic = "Trial Balance: Errors not Revealed",
                year = "1994",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance totals?",
                optionA = "Error of original entry",
                optionB = "Single entry of a debit without a credit",
                optionC = "Incorrect summation of a ledger account",
                optionD = "Entering a debit balance on the credit column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of original entry (entering an incorrect figure on both debit and credit sides) maintains equal debit and credit sums, leaving the Trial Balance in agreement.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_008",
                subject = "Financial Accounting",
                topic = "Cash Book: Three-Column Cash Book",
                year = "1994",
                questionText = "The discount column on the debit side of a Three-Column Cash Book represents:",
                optionA = "Discount Received",
                optionB = "Discount Allowed to customers",
                optionC = "Trade Discount",
                optionD = "Quantity Rebate",
                correctAnswerIndex = 1,
                explanation = "The debit side of the Cash Book records receipts from debtors; the accompanying discount column records 'Discount Allowed' for prompt payment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_009",
                subject = "Financial Accounting",
                topic = "Petty Cash: Imprest System",
                year = "1994",
                questionText = "Under the imprest system of petty cash, the petty cashier is reimbursed with:",
                optionA = "A fixed arbitrary bonus each week",
                optionB = "The exact total amount spent during the period to restore the float",
                optionC = "The maximum balance remaining in the main bank account",
                optionD = "Half the initial float",
                correctAnswerIndex = 1,
                explanation = "Under the imprest system, the petty cashier presents vouchers for expenditures incurred and receives a cheque for that exact amount, restoring the float to its agreed limit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_010",
                subject = "Financial Accounting",
                topic = "Bank Reconciliation: Uncredited Cheques",
                year = "1994",
                questionText = "In a Bank Reconciliation Statement, cheques paid into the bank but not yet entered on the bank statement are termed:",
                optionA = "Unpresented cheques",
                optionB = "Uncredited (lodgements not credited) cheques",
                optionC = "Dishonoured cheques",
                optionD = "Standing orders",
                correctAnswerIndex = 1,
                explanation = "Uncredited lodgements are deposits/cheques received and recorded on the debit side of the cash book but awaiting bank clearing and crediting on the bank statement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_011",
                subject = "Financial Accounting",
                topic = "Bank Reconciliation: Unpresented Cheques",
                year = "1994",
                questionText = "Cheques drawn and issued to suppliers but not yet presented at the bank for payment are called:",
                optionA = "Uncredited cheques",
                optionB = "Unpresented cheques",
                optionC = "Cancelled cheques",
                optionD = "Post-dated cheques",
                correctAnswerIndex = 1,
                explanation = "Unpresented cheques are cheques issued by a business and credited in the cash book, but which payees have not yet presented to the bank for payment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_012",
                subject = "Financial Accounting",
                topic = "Final Accounts: Trading Account",
                year = "1994",
                questionText = "The primary purpose of preparing a Trading Account is to calculate:",
                optionA = "Net profit or loss",
                optionB = "Gross profit or loss",
                optionC = "Working capital",
                optionD = "Total liquid assets",
                correctAnswerIndex = 1,
                explanation = "The Trading Account matches sales revenue against the cost of goods sold (COGS) to determine the Gross Profit or Gross Loss of the enterprise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_013",
                subject = "Financial Accounting",
                topic = "Cost of Goods Sold: Calculation",
                year = "1994",
                questionText = "Given: Opening Stock ₦5,000, Purchases ₦20,000, Carriage Inwards ₦1,000, Closing Stock ₦4,000. Calculate Cost of Goods Sold.",
                optionA = "₦20,000",
                optionB = "₦22,000",
                optionC = "₦26,000",
                optionD = "₦18,000",
                correctAnswerIndex = 1,
                explanation = "Cost of Goods Sold = Opening Stock (₦5,000) + Purchases (₦20,000) + Carriage Inwards (₦1,000) - Closing Stock (₦4,000) = 26,000 - 4,000 = ₦22,000.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_014",
                subject = "Financial Accounting",
                topic = "Depreciation: Straight Line Method",
                year = "1994",
                questionText = "A motor vehicle costing ₦100,000 has an estimated lifespan of 5 years and a scrap value of ₦10,000. Annual depreciation using the straight-line method is:",
                optionA = "₦20,000",
                optionB = "₦18,000",
                optionC = "₦22,000",
                optionD = "₦15,000",
                correctAnswerIndex = 1,
                explanation = "Annual Depreciation = (Cost - Scrap Value) / Useful Life = (100,000 - 10,000) / 5 = 90,000 / 5 = ₦18,000.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1994_015",
                subject = "Financial Accounting",
                topic = "Accruals and Prepayments",
                year = "1994",
                questionText = "Rent paid in advance at the end of an accounting period is classified on the Balance Sheet as a:",
                optionA = "Current Liability",
                optionB = "Current Asset",
                optionC = "Fixed Asset",
                optionD = "Long-term Liability",
                correctAnswerIndex = 1,
                explanation = "Prepaid expenses represent future economic benefits already paid for; hence they are classified as Current Assets on the balance sheet.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1994 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1995_001",
                subject = "Financial Accounting",
                topic = "Accounting Concepts: Going Concern",
                year = "1995",
                questionText = "The accounting concept which assumes that an enterprise will continue its operational existence for the foreseeable future is the:",
                optionA = "Entity concept",
                optionB = "Going concern concept",
                optionC = "Periodicity concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 1,
                explanation = "The Going Concern concept presumes that the business entity will not liquidate or curtail operations drastically in the foreseeable future.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1995 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1995_002",
                subject = "Financial Accounting",
                topic = "Accounting Concepts: Business Entity",
                year = "1995",
                questionText = "The Business Entity concept dictates that:",
                optionA = "The business transactions and the owner's personal affairs must be treated as completely separate",
                optionB = "All profits belong solely to the government",
                optionC = "The business must not borrow money from commercial banks",
                optionD = "Accounts must be prepared every five years",
                correctAnswerIndex = 0,
                explanation = "The Business Entity concept strictly treats the business organization as an independent economic and legal unit distinct from its owners.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1995 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1995_003",
                subject = "Financial Accounting",
                topic = "Capital and Revenue Expenditure",
                year = "1995",
                questionText = "Expenditure incurred to acquire, install, or permanently improve a fixed asset is classified as:",
                optionA = "Revenue expenditure",
                optionB = "Capital expenditure",
                optionC = "Deferred revenue expenditure",
                optionD = "Operational expense",
                correctAnswerIndex = 1,
                explanation = "Capital expenditure benefits the business over multiple accounting periods by acquiring or extending the capacity/life of non-current fixed assets.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1995 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1995_004",
                subject = "Financial Accounting",
                topic = "Capital and Revenue Expenditure",
                year = "1995",
                questionText = "Which of the following is an example of Revenue Expenditure?",
                optionA = "Purchase of delivery van",
                optionB = "Cost of painting and routine servicing of existing delivery van",
                optionC = "Construction of an extension to a factory",
                optionD = "Legal fees incurred on acquiring freehold land",
                correctAnswerIndex = 1,
                explanation = "Routine maintenance, painting, and fuel for a van are recurrent expenses incurred in everyday business operations (Revenue Expenditure).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1995 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_vol3_1995_005",
                subject = "Financial Accounting",
                topic = "Control Accounts: Sales Ledger Control Account",
                year = "1995",
                questionText = "The Sales Ledger Control Account is also known as the:",
                optionA = "Total Creditors Account",
                optionB = "Total Debtors Account",
                optionC = "General Ledger Control Account",
                optionD = "Private Ledger Account",
                correctAnswerIndex = 1,
                explanation = "The Sales Ledger Control Account (Total Debtors Account) summarizes all individual accounts in the sales ledger, maintaining a check on trade debtors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Financial Accounting 1995 • Q5"
            )
        )

        return list
    }
}
