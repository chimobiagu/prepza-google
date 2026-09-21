package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Economics Past Questions - Volume 2 (Part 1: 1983 - 1991 Series).
 * Cleaned, standardized 4-option format, balanced answer keys, and detailed pedagogical explanations.
 */
object JambEconomicsVolume2Part1QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1983 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1983_018",
                subject = "Economics",
                topic = "Business Organizations",
                year = "1983",
                questionText = "In a sole proprietorship, the business decisions are made solely by the",
                optionA = "Government",
                optionB = "Board of directors",
                optionC = "Management committee",
                optionD = "Owner",
                correctAnswerIndex = 3,
                explanation = "A sole proprietorship is an unincorporated business owned and run by a single individual. Thus, all administrative and financial decisions are made solely by the owner.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_019",
                subject = "Economics",
                topic = "Public Enterprises",
                year = "1983",
                questionText = "Which of the following enterprises does NOT pursue the sole objective of profit maximization?",
                optionA = "Roads Nigeria Ltd.",
                optionB = "Union Bank of Nigeria Ltd.",
                optionC = "Nigerian Electric Power Authority (NEPA)",
                optionD = "Volkswagen (VW) Nigeria Ltd.",
                correctAnswerIndex = 2,
                explanation = "NEPA is a public utility corporation owned by the government. Its primary mandate is to provide essential electricity services to citizens at a subsidized rate rather than maximizing profits.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_020",
                subject = "Economics",
                topic = "Public Finance and Fiscal Policy",
                year = "1983",
                questionText = "Public expenditure creates expansionary effects in the economy when it is",
                optionA = "In excess of government revenue",
                optionB = "Channelled into capital projects",
                optionC = "Diverted into imports",
                optionD = "Completely financed through taxes",
                correctAnswerIndex = 0,
                explanation = "When public expenditure exceeds government revenue (deficit budgeting), it injects net purchasing power into the economy, thereby stimulating aggregate demand and creating expansionary effects.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_021",
                subject = "Economics",
                topic = "Macroeconomic Policy and Fiscal Stability",
                year = "1983",
                questionText = "The maintenance of general economic stability in a country necessarily relies heavily on",
                optionA = "Federal fiscal policy alone",
                optionB = "Coordinated federal, state and local fiscal policies",
                optionC = "Tax and revenue policies of state governments",
                optionD = "Federal grants to state and local governments",
                correctAnswerIndex = 1,
                explanation = "Macroeconomic stability requires a unified approach. Coordinated fiscal policies across all levels of government ensure that spending and taxation do not work at cross-purposes.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_023",
                subject = "Economics",
                topic = "Taxation Systems",
                year = "1983",
                questionText = "Which of the following are direct taxes?",
                optionA = "Sales taxes",
                optionB = "Excise duties",
                optionC = "Income and company taxes",
                optionD = "Tariff and customs duties",
                correctAnswerIndex = 2,
                explanation = "Direct taxes are levied directly on the income, wealth, or profits of individuals and corporate companies, and the tax burden cannot be shifted to another person.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_024",
                subject = "Economics",
                topic = "Division of Labour",
                year = "1983",
                questionText = "Division of labour has many advantages. Notwithstanding, it is greatly limited by",
                optionA = "Monotony of work",
                optionB = "Decline of craftsmanship",
                optionC = "Risk of unemployment",
                optionD = "Extent of market demand",
                correctAnswerIndex = 3,
                explanation = "According to Adam Smith, the division of labour is limited by the extent of the market. If demand for a product is small, high specialization cannot be economically justified.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_025",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "1983",
                questionText = "If a supply curve for a manufactured good starts from a positive price axis, it shows that",
                optionA = "When price is zero, quantity supplied is infinitely elastic",
                optionB = "The higher the price, the lower the quantity supplied",
                optionC = "No supply is made below a minimum positive price",
                optionD = "When price is zero, quantity supplied is zero",
                correctAnswerIndex = 2,
                explanation = "A supply curve intercepting the vertical price axis above the origin indicates that producers require a minimum threshold price to cover their basic marginal costs before offering any output.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_026",
                subject = "Economics",
                topic = "Limited Liability Companies",
                year = "1983",
                questionText = "In the event of a limited liability company going into liquidation, each",
                optionA = "Shareholder may lose the maximum of the amount he has invested",
                optionB = "Shareholder loses nothing",
                optionC = "Shareholder loses everything including his house",
                optionD = "Shareholder's liability becomes unlimited",
                correctAnswerIndex = 0,
                explanation = "Limited liability means that if a company fails, a shareholder's personal assets are protected, and their loss is strictly capped at the amount they invested in buying the company's shares.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_027",
                subject = "Economics",
                topic = "Tax Incidence",
                year = "1983",
                questionText = "A greater burden of the taxes on essential goods is borne by the",
                optionA = "Middle income group",
                optionB = "Higher income group",
                optionC = "Lower income group",
                optionD = "Top richest citizens",
                correctAnswerIndex = 2,
                explanation = "Since essential goods have highly inelastic demand, any tax levied is passed on to consumers. This places a disproportionate regressive burden on low-income groups who spend a larger share of their income on essentials.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_028",
                subject = "Economics",
                topic = "International Trade",
                year = "1983",
                questionText = "The comparative cost doctrine of international trade recommends specialization in production based on",
                optionA = "Absolute cost advantage",
                optionB = "Absolute cost disadvantages",
                optionC = "Relative cost advantage",
                optionD = "The availability of labour",
                correctAnswerIndex = 2,
                explanation = "David Ricardo's comparative cost doctrine states that countries should specialize in producing goods where they have the lowest opportunity cost or greatest relative advantage.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_029",
                subject = "Economics",
                topic = "International Trade: Commercial Policy",
                year = "1983",
                questionText = "The meaning of 'Dumping' is selling goods in a foreign market at",
                optionA = "A price below that received in the home market",
                optionB = "A price higher than that received in the home market",
                optionC = "A price equal to the cost price in the home market",
                optionD = "A price that encourages indigenous producers",
                correctAnswerIndex = 0,
                explanation = "Dumping is an international pricing strategy where a firm exports a product to a foreign country at a price lower than the price it charges in its domestic home market.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_030",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "1983",
                questionText = "Disequilibrium in the balance of payments means",
                optionA = "Imports of the country exceeding its exports",
                optionB = "Overall deficit or surplus in the current and capital accounts of the balance of payments",
                optionC = "Capital flowing out of the country exceeding capital flowing in",
                optionD = "Deficit in the trade balance",
                correctAnswerIndex = 1,
                explanation = "Balance of payments disequilibrium refers to a persistent mismatch where a country experiences either an overall deficit or an overall surplus in its combined current and capital accounts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_031",
                subject = "Economics",
                topic = "Petroleum Economics",
                year = "1983",
                questionText = "Petroleum 'glut' in international trade means",
                optionA = "A fall in petroleum production",
                optionB = "An over-supply of petroleum",
                optionC = "A higher petroleum price offered by the buyer",
                optionD = "A higher petroleum price demanded by the seller",
                correctAnswerIndex = 1,
                explanation = "A market glut occurs when there is an excess supply of a product relative to consumer demand, causing prices to plummet.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_032",
                subject = "Economics",
                topic = "International Trade Foundations",
                year = "1983",
                questionText = "International trade is primarily necessary because",
                optionA = "No country can live in economic isolation",
                optionB = "Different countries are differently endowed in natural and man-made resources",
                optionC = "World demand and supply of commodities is expanding",
                optionD = "Countries want to build up their foreign exchange reserves",
                correctAnswerIndex = 1,
                explanation = "The foundational driver of international trade is the unequal distribution of natural resources, climates, and technological capabilities across different sovereign nations.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_033",
                subject = "Economics",
                topic = "Structure of Nigerian Economy",
                year = "1983",
                questionText = "Mono-product economies are those that",
                optionA = "Have a rich cultural heritage",
                optionB = "Produce only raw materials",
                optionC = "Produce and rely on one main commodity",
                optionD = "Specialize in agricultural industries",
                correctAnswerIndex = 2,
                explanation = "A mono-product economy relies heavily on a single primary commodity (such as crude oil in Nigeria) for its national budget and export earnings, making it highly vulnerable to global price shocks.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_035",
                subject = "Economics",
                topic = "Economic Growth Theory",
                year = "1983",
                questionText = "If an economy is growing at 7% annually and 4% is due to improvements in labour and capital combined, the remaining 3% is usually attributed to",
                optionA = "Land and related factors",
                optionB = "Abundance of natural resources",
                optionC = "Level of human capital",
                optionD = "Technical progress or other residual factors",
                correctAnswerIndex = 3,
                explanation = "In economic growth accounting (Solow Residual), any output growth that cannot be explained by accumulation of capital and labour is attributed to technological progress and efficiency gains.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_036",
                subject = "Economics",
                topic = "Channels of Distribution",
                year = "1983",
                questionText = "A major economic function of middlemen in Nigeria is the distribution of",
                optionA = "Commodities to all consumers regardless of income",
                optionB = "Commodities to consuming centres and collection of money income to producing centres",
                optionC = "Economic welfare to all",
                optionD = "Wealth to all",
                correctAnswerIndex = 1,
                explanation = "Middlemen bridge the spatial gap between producers and consumers by transporting products to buying hubs and returning revenue to the manufacturers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_037",
                subject = "Economics",
                topic = "Public Enterprises",
                year = "1983",
                questionText = "Which of the following is NOT an advantage of government-owned enterprises?",
                optionA = "More capital is provided",
                optionB = "Pricing policy may be in the interest of consumers",
                optionC = "Government workers may be indifferent towards the public",
                optionD = "Infrastructures are rapidly developed",
                correctAnswerIndex = 2,
                explanation = "Worker indifference and lack of bureaucratic accountability are classic operational disadvantages (inefficiencies) of state enterprises, not advantages.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_038",
                subject = "Economics",
                topic = "Location of Industries",
                year = "1983",
                questionText = "Which of the following is NOT an advantage of localization of industries?",
                optionA = "Reaping of external economies",
                optionB = "Development of a pool of skilled labour",
                optionC = "Development of subsidiary industries",
                optionD = "Growth of conurbations and urban congestion",
                correctAnswerIndex = 3,
                explanation = "While localization creates skilled labour pools and subsidiary markets, it also drives massive urban conurbation, congestion, and pollution, which are social costs (disadvantages).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_039",
                subject = "Economics",
                topic = "Money and Banking: Barter",
                year = "1983",
                questionText = "The monetary system that requires a double coincidence of wants is known as",
                optionA = "The gold standard",
                optionB = "Barter",
                optionC = "The commodity system",
                optionD = "The cheque system",
                correctAnswerIndex = 1,
                explanation = "Barter is a system of direct exchange where goods are traded directly for other goods. It relies on the highly restrictive requirement of a double coincidence of wants.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_040",
                subject = "Economics",
                topic = "Population and Demography",
                year = "1983",
                questionText = "The effect of emigration on a country's population, all other things remaining equal, is to",
                optionA = "Increase its size",
                optionB = "Cause overpopulation",
                optionC = "Increase its growth rate",
                optionD = "Reduce its size",
                correctAnswerIndex = 3,
                explanation = "Emigration is the movement of people out of their home country to settle in another, which directly reduces the total size of the remaining domestic population.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_041",
                subject = "Economics",
                topic = "Functions of Money",
                year = "1983",
                questionText = "Because money serves as a store of value, it makes it possible for individuals to",
                optionA = "Carry out daily transactions easily",
                optionB = "Compare the values of different commodities",
                optionC = "Put aside wealth to provide for old age",
                optionD = "Buy goods on credit",
                correctAnswerIndex = 2,
                explanation = "The store of value function of money enables individuals to defer their consumption to the future by saving purchasing power securely.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_042",
                subject = "Economics",
                topic = "Agriculture in West Africa",
                year = "1983",
                questionText = "Which of the following statements is true of agriculture in West Africa?",
                optionA = "The Green Revolution is West Africa's only agricultural practice",
                optionB = "It supplies all the foodstuff consumed in West Africa",
                optionC = "There are large plantations of cocoa, groundnut and palm oil exclusively",
                optionD = "It employs more than 50% of the total labour force in West Africa",
                correctAnswerIndex = 3,
                explanation = "Agriculture remains the primary source of livelihood and employment in West Africa, engaging over half of the region's total working population.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_043",
                subject = "Economics",
                topic = "Definition of Economics",
                year = "1983",
                questionText = "Which of the following defines Economics most comprehensively?",
                optionA = "Buying and selling of commodities",
                optionB = "Organization of industrial production",
                optionC = "Study of human behaviour in the allocation of scarce resources",
                optionD = "National development planning and budgeting",
                correctAnswerIndex = 2,
                explanation = "Economics is a social science focused on how individuals, businesses, and governments make choices to allocate scarce resources to satisfy unlimited wants.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_044",
                subject = "Economics",
                topic = "Demography and Labour Force",
                year = "1983",
                questionText = "The working age-group in Nigeria is conventionally defined as the years",
                optionA = "1-15",
                optionB = "15-65",
                optionC = "30-40",
                optionD = "65 and above",
                correctAnswerIndex = 1,
                explanation = "The economically active cohort of a population (the labour force) falls within the age bracket of 15 to 65 years, with those younger or older classed as dependents.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_045",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "1983",
                questionText = "The National Electric Power Authority (NEPA) as a public corporation is a",
                optionA = "Firm in a perfectly competitive market",
                optionB = "Duopoly",
                optionC = "Monopolistically competitive industry",
                optionD = "Monopoly",
                correctAnswerIndex = 3,
                explanation = "NEPA (now unbundled) was a statutory public corporation that held exclusive legal monopoly rights over the generation, transmission, and retail of electricity in Nigeria.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_046",
                subject = "Economics",
                topic = "Employment and Macroeconomics",
                year = "1983",
                questionText = "Full employment is a macroeconomic situation in which",
                optionA = "Every single adult is employed",
                optionB = "All adults who can work are employed",
                optionC = "All those who are able and eligible to work can find employment at current wages",
                optionD = "Only the disabled are not employed",
                correctAnswerIndex = 2,
                explanation = "Full employment does not mean 0% unemployment, but rather a state where everyone who is willing and physically capable of working at prevailing wages can secure a job.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q46"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_047",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "1983",
                questionText = "When demand is described as price elastic, it means that consumers",
                optionA = "React more than proportionately to price changes",
                optionB = "Are not sensitive to price changes",
                optionC = "Will stop buying entirely when price increases",
                optionD = "React less than proportionately to price changes",
                correctAnswerIndex = 0,
                explanation = "Elastic demand (coefficient > 1) indicates that a given percentage change in price leads to a larger percentage change in the quantity demanded.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_048",
                subject = "Economics",
                topic = "Theory of Demand: Derived Demand",
                year = "1983",
                questionText = "The demand for a factor of production is",
                optionA = "A composite demand",
                optionB = "A joint demand",
                optionC = "A derived demand",
                optionD = "A cross-elastic demand",
                correctAnswerIndex = 2,
                explanation = "Factors of production are not demanded for direct consumption, but rather because they are required to produce other final goods and services.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1983_049",
                subject = "Economics",
                topic = "Market Structures: Monopolistic Competition",
                year = "1983",
                questionText = "Differentiated products are the characteristic feature of",
                optionA = "Perfect competition",
                optionB = "Pure competition",
                optionC = "Monopolistic competition",
                optionD = "Monopoly",
                correctAnswerIndex = 2,
                explanation = "Monopolistic competition features many sellers who offer similar but differentiated products, using branding, design, and marketing to gain minor price-making power.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q49"
            )
        )

        // =========================================================================
        // 1985 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1985_038",
                subject = "Economics",
                topic = "Central Banking and Foreign Exchange",
                year = "1985",
                questionText = "Foreign exchange control in Nigeria is administered and managed by the",
                optionA = "United Bank for Africa",
                optionB = "Union Bank of Nigeria",
                optionC = "Central Bank of Nigeria",
                optionD = "First Bank of Nigeria",
                correctAnswerIndex = 2,
                explanation = "The Central Bank of Nigeria (CBN) has statutory power to manage foreign exchange reserves and enforce exchange control regulations in the country.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1985_042",
                subject = "Economics",
                topic = "Industrialization Strategies",
                year = "1985",
                questionText = "The industrialization strategy where local firms are encouraged to produce goods formerly imported is",
                optionA = "Export promotion",
                optionB = "Import substitution",
                optionC = "Commercialization",
                optionD = "Economic integration",
                correctAnswerIndex = 1,
                explanation = "Import Substitution Industrialization (ISI) aims to reduce foreign dependency by cultivating local manufacturing capacity to produce consumer goods domestically.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1985 • Q42"
            )
        )

        // =========================================================================
        // 1986 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1986_035",
                subject = "Economics",
                topic = "Commercial Banking Credit Creation",
                year = "1986",
                questionText = "The most important economic characteristic differentiating commercial banks from other financial institutions is their",
                optionA = "Function as a safe depository for savings",
                optionB = "Role in financing international balance of payments deficits",
                optionC = "Intermediary status between savers and borrowers",
                optionD = "Ability to actively create and destroy deposit money",
                correctAnswerIndex = 3,
                explanation = "Commercial banks are unique because they can expand the money supply through the fractional reserve credit creation process, creating checkable deposits.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q35"
            )
        )

        // =========================================================================
        // 1987 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1987_037",
                subject = "Economics",
                topic = "Taxation: Ad Valorem",
                year = "1987",
                questionText = "An 'ad valorem' tax is defined as a tax levied",
                optionA = "As a fixed flat rate per physical unit of a good",
                optionB = "As a percentage of the value of the commodity",
                optionC = "On the personal income of workers only",
                optionD = "On corporate profits before dividends are shared",
                correctAnswerIndex = 1,
                explanation = "An ad valorem tax is an indirect tax calculated as a set percentage of the assessed commercial value of the taxed transaction or import.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1987_039",
                subject = "Economics",
                topic = "Public Finance: Budgets",
                year = "1987",
                questionText = "A government budget with projected revenue in excess of its planned expenditure is a",
                optionA = "Balanced budget",
                optionB = "Surplus budget",
                optionC = "Deficit budget",
                optionD = "Inflationary budget",
                correctAnswerIndex = 1,
                explanation = "A surplus budget occurs when government expectations for tax and non-tax revenues exceed planned public expenditures for the fiscal year.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1987_040",
                subject = "Economics",
                topic = "Public Expenditure",
                year = "1987",
                questionText = "The annual public money spent by government on the maintenance of state schools is part of its",
                optionA = "Personal emoluments",
                optionB = "Capital expenditure",
                optionC = "Recurrent expenditure",
                optionD = "Development allocation",
                correctAnswerIndex = 2,
                explanation = "Recurrent expenditures are ongoing, short-term operational expenses (like teachers' salaries, utilities, and school supplies) required to run public services.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1987_045",
                subject = "Economics",
                topic = "National Income: Transfer Payments",
                year = "1987",
                questionText = "Transfer payments are economically defined as",
                optionA = "Payments for transport services",
                optionB = "Money moved from domestic to foreign bank accounts",
                optionC = "Unearned incomes for which no productive service is rendered in return",
                optionD = "Money shifted between government department accounts",
                correctAnswerIndex = 2,
                explanation = "Transfer payments (e.g., pensions, unemployment benefits, student grants) are public handouts of cash without any current reciprocal exchange of productive services.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1987_047",
                subject = "Economics",
                topic = "Personal Income and Disposable Income",
                year = "1987",
                questionText = "The difference between personal income and personal disposable income is",
                optionA = "Personal income tax (direct taxes)",
                optionB = "Private investment income",
                optionC = "Personal savings in bank accounts",
                optionD = "Household consumption expenditure",
                correctAnswerIndex = 0,
                explanation = "Disposable income is the actual money available for household consumption and saving, calculated by subtracting direct personal income taxes from gross personal income.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q47"
            )
        )

        // =========================================================================
        // 1988 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1988_007",
                subject = "Economics",
                topic = "Economies of Scale",
                year = "1988",
                questionText = "Developments outside a given firm which lead to reductions in the firm's average costs are",
                optionA = "Internal economies of scale",
                optionB = "External economies of scale",
                optionC = "External diseconomies of scale",
                optionD = "Optimum industry effects",
                correctAnswerIndex = 1,
                explanation = "External economies occur when the overall growth of an entire industry or region benefits individual firms within it by reducing their costs (e.g., specialized infrastructure).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_008",
                subject = "Economics",
                topic = "Theory of Production: Production Function",
                year = "1988",
                questionText = "Which of the following best describes the 'production function'?",
                optionA = "It indicates the best output level to produce to maximize profits",
                optionB = "It relates money inputs to total money outputs",
                optionC = "It displays the technological relationship between physical inputs and physical outputs",
                optionD = "It dictates the absolute price of factor inputs",
                correctAnswerIndex = 2,
                explanation = "The production function is a purely technical relationship showing the maximum output that can be produced with any given combination of physical factor inputs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_012",
                subject = "Economics",
                topic = "Cost Theory: Fixed Costs",
                year = "1988",
                questionText = "Total fixed cost measures the cost of",
                optionA = "All plant and machinery utilized by a firm",
                optionB = "Productive assets whose quantities cannot be varied in the short run",
                optionC = "Factor inputs whose costs are determined by state regulation",
                optionD = "The minimum level of variable materials",
                correctAnswerIndex = 1,
                explanation = "Fixed costs (sunk costs) are overhead expenses (like rent or factory depreciation) that do not vary with the volume of output and must be paid even if output is zero.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_023",
                subject = "Economics",
                topic = "Cost Theory: Minimum Average Cost",
                year = "1988",
                questionText = "Which of the following is true when the Average Cost (AC) of a firm is at its minimum?",
                optionA = "Average Variable Cost equals Fixed Cost",
                optionB = "Marginal Cost is equal to Average Cost",
                optionC = "Marginal Cost is at its minimum level",
                optionD = "Average Cost equals Average Fixed Cost",
                correctAnswerIndex = 1,
                explanation = "When average cost is falling, MC is below it. When average cost is rising, MC is above it. Consequently, MC must intersect the AC curve exactly at its minimum point.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_031",
                subject = "Economics",
                topic = "Monetary Policy Instruments",
                year = "1988",
                questionText = "Central Bank control over commercial bank credit creation can be achieved by raising the",
                optionA = "Overdraft allowance",
                optionB = "Cash reserve and liquidity ratios",
                optionC = "Total value of customer loans",
                optionD = "Savings interest rates",
                correctAnswerIndex = 1,
                explanation = "By raising statutory reserve requirements, the Central Bank locks up more bank assets, reducing the excess reserves available for credit expansion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_038",
                subject = "Economics",
                topic = "Balance of Payments Surplus",
                year = "1988",
                questionText = "A nation experiencing a balance of payments surplus is in a strong position to",
                optionA = "Increase its holdings of foreign exchange reserves",
                optionB = "Increase its total liabilities to foreign creditors",
                optionC = "Drain its national central bank gold reserves",
                optionD = "Devalue its domestic currency immediately",
                correctAnswerIndex = 0,
                explanation = "A balance of payments surplus means net inflows of foreign money, allowing the country to expand its official foreign exchange reserves.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_039",
                subject = "Economics",
                topic = "Balance of Payments: Invisible Trade",
                year = "1988",
                questionText = "In national balance of payments accounts, shipping, tourism, and insurance are classed as",
                optionA = "Visible trade items",
                optionB = "Invisible trade items",
                optionC = "Capital account transactions",
                optionD = "Unilateral transfers",
                correctAnswerIndex = 1,
                explanation = "Services (like shipping, civil aviation, tourism, and banking) do not involve physical goods. They are tracked as invisible exports and imports on the current account.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_041",
                subject = "Economics",
                topic = "Malthusian Population Theory",
                year = "1988",
                questionText = "The Malthusian population theory predicts that food production will",
                optionA = "Grow at an exponential geometric rate",
                optionB = "Outpace population growth under all conditions",
                optionC = "Grow at an arithmetic rate while population grows geometrically",
                optionD = "Remain static unless technology improves",
                correctAnswerIndex = 2,
                explanation = "Thomas Malthus argued that food supply increases arithmetically (1, 2, 3, 4, 5) while population expands geometrically (1, 2, 4, 8, 16), leading to inevitable crises.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1988_042",
                subject = "Economics",
                topic = "National Income: Consumption Propensities",
                year = "1988",
                questionText = "If aggregate national income is N500.00 and aggregate consumption is N400.00, the Average Propensity to Consume (APC) is",
                optionA = "0.20",
                optionB = "0.80",
                optionC = "1.25",
                optionD = "2.00",
                correctAnswerIndex = 1,
                explanation = "Average Propensity to Consume (APC) is the fraction of total income spent on consumption, calculated as: APC = Consumption / Income = 400 / 500 = 0.80.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q42"
            )
        )

        // =========================================================================
        // 1989 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1989_001",
                subject = "Economics",
                topic = "Circular Flow of Income",
                year = "1989",
                questionText = "In its basic form, the concept of the circular flow of income shows",
                optionA = "Real resource and monetary transaction flows between households and firms",
                optionB = "Only physical goods moving between companies",
                optionC = "Government distribution of taxes to rural areas",
                optionD = "The total accumulation of capital in the central bank",
                correctAnswerIndex = 0,
                explanation = "The circular flow model diagrams the continuous exchange of goods, services, factors of production, and money payments between businesses and households.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_005",
                subject = "Economics",
                topic = "Technical Efficiency",
                year = "1989",
                questionText = "Technical efficiency in production is achieved when a firm produces a given output with",
                optionA = "The absolute minimum number of manual workers",
                optionB = "The lowest cost combination of productive factor inputs",
                optionC = "Fully imported capital-intensive technology",
                optionD = "No fixed costs of production",
                correctAnswerIndex = 1,
                explanation = "Economic and technical efficiency requires combining inputs in a way that minimizes total cost for a specific target output level.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_007",
                subject = "Economics",
                topic = "Diseconomies of Scale",
                year = "1989",
                questionText = "If a firm's unit cost of production continues to increase as its output scale expands, it experiences",
                optionA = "Economies of scale",
                optionB = "Diseconomies of scale",
                optionC = "Law of variable proportions",
                optionD = "Technical efficiency",
                correctAnswerIndex = 1,
                explanation = "Diseconomies of scale occur when a firm grows too large, leading to management difficulties, communication gaps, and rising long-run average costs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_008",
                subject = "Economics",
                topic = "Capital Markets and Interest Rates",
                year = "1989",
                questionText = "In a perfectly competitive financial market, the opportunity cost of capital is reflected by",
                optionA = "The market rate of interest",
                optionB = "The absolute capital profits earned",
                optionC = "The shadow exchange rate",
                optionD = "Direct government subsidies",
                correctAnswerIndex = 0,
                explanation = "The prevailing market interest rate is the standard opportunity cost of capital, as it represents the guaranteed return forgone by choosing a private investment over saving.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_015",
                subject = "Economics",
                topic = "Monopoly Power",
                year = "1989",
                questionText = "To increase its total profits, a pure monopolist has the power to manipulate",
                optionA = "Both price and quantity simultaneously",
                optionB = "Either price or quantity but not both independently",
                optionC = "Only price, quantity being determined by state decree",
                optionD = "Only the quality of the good",
                correctAnswerIndex = 1,
                explanation = "A monopolist can choose the price OR the output quantity, but cannot set both independently because they are constrained by consumer demand on the market curve.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_016",
                subject = "Economics",
                topic = "Perfect Competition Demand Curve",
                year = "1989",
                questionText = "For a purely competitive firm, the demand curve it faces is",
                optionA = "Downward-sloping and highly inelastic",
                optionB = "Perfectly price elastic (horizontal)",
                optionC = "Perfectly price inelastic (vertical)",
                optionD = "Upward-sloping",
                correctAnswerIndex = 1,
                explanation = "Since a perfect competitor is a price taker selling a homogeneous product, they face a perfectly elastic horizontal demand curve at the market equilibrium price.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_018",
                subject = "Economics",
                topic = "Retailing Functions",
                year = "1989",
                questionText = "An important economic function of the retailer is to",
                optionA = "Grant long-term credit to wholesalers",
                optionB = "Break bulk and sell products in small units to consumers",
                optionC = "Eliminate all shipping and advertising costs",
                optionD = "Set maximum price legislation",
                correctAnswerIndex = 1,
                explanation = "Retailers buy in bulk from wholesalers and break it down into small units, aligning packaging and quantities with final consumer desires.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_020",
                subject = "Economics",
                topic = "Advertising and Marketing",
                year = "1989",
                questionText = "The main economic purpose of commercial advertising is to",
                optionA = "Increase the physical quality of the product",
                optionB = "Shift the demand curve for the product to the right",
                optionC = "Directly reduce total production costs",
                optionD = "Satisfy maximum price legislation rules",
                correctAnswerIndex = 1,
                explanation = "Advertising aims to increase brand loyalty and demand, shifting the product's demand curve to the right and making it more price inelastic.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_026",
                subject = "Economics",
                topic = "Corporate Finance: Capital Gearing",
                year = "1989",
                questionText = "A limited liability company is described as 'highly geared' if the",
                optionA = "Ratio of fixed-interest debenture loans is high relative to equity share capital",
                optionB = "Ratio of common shares is high relative to loans",
                optionC = "Annual dividend payout rate is extremely high",
                optionD = "Interest rate charged by commercial banks is low",
                correctAnswerIndex = 0,
                explanation = "Gearing (leverage) measures capital structure. High gearing means a company relies heavily on fixed-interest debt (loans/debentures) relative to share capital.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_033",
                subject = "Economics",
                topic = "Taxation: Regressive Tax",
                year = "1989",
                questionText = "A tax is defined as regressive if the percentage of income paid as tax",
                optionA = "Increases as the income level increases",
                optionB = "Decreases as the income level increases",
                optionC = "Remains constant across all income levels",
                optionD = "Is paid only by business corporations",
                correctAnswerIndex = 1,
                explanation = "A regressive tax takes a larger percentage of income from low-income groups than from high-income earners (e.g., flat consumption taxes).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_041",
                subject = "Economics",
                topic = "International Trade: Comparative Advantage",
                year = "1989",
                questionText = "The law of comparative advantage recommends that a country specialize in producing the good",
                optionA = "For which domestic consumer demand is highest",
                optionB = "For which its opportunity cost of production is lowest compared to trade partners",
                optionC = "For which it has an absolute monopoly in raw inputs",
                optionD = "That requires the most capital-intensive techniques",
                correctAnswerIndex = 1,
                explanation = "Comparative advantage requires specializing in goods where a nation has a lower opportunity cost, enabling mutual gains from trade.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_045",
                subject = "Economics",
                topic = "National Income: GNP vs NNP",
                year = "1989",
                questionText = "The difference between Gross National Product (GNP) and Net National Product (NNP) is equal to",
                optionA = "Net foreign factor income",
                optionB = "Direct company taxes",
                optionC = "Capital depreciation (capital consumption allowance)",
                optionD = "Total personal savings",
                correctAnswerIndex = 2,
                explanation = "Net National Product is calculated by subtracting capital depreciation (the wear and tear cost of capital equipment) from the Gross National Product.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1989_046",
                subject = "Economics",
                topic = "National Income: GDP",
                year = "1989",
                questionText = "The value of total output produced within the borders of Nigeria by all residents (citizens and foreign nationals) is the",
                optionA = "Gross National Product",
                optionB = "Disposable Personal Income",
                optionC = "National Income at factor cost",
                optionD = "Gross Domestic Product",
                correctAnswerIndex = 3,
                explanation = "Gross Domestic Product (GDP) measures the total value of all goods and services produced within a country's geographic borders, regardless of the nationality of the producers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q46"
            )
        )

        // =========================================================================
        // 1990 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1990_001",
                subject = "Economics",
                topic = "Opportunity Cost Calculation",
                year = "1990",
                questionText = "If one orange costs 20k and one kilogram of beef costs N10.00, the opportunity cost of one kilogram of beef is",
                optionA = "50 oranges",
                optionB = "10 oranges",
                optionC = "5 oranges",
                optionD = "N9.80",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the alternative forgone. To purchase N10.00 worth of beef, a consumer sacrifices the opportunity to buy 50 oranges (10.00 / 0.20 = 50).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_005",
                subject = "Economics",
                topic = "Division of Labour Benefits",
                year = "1990",
                questionText = "A major economic benefit of labor specialization is that",
                optionA = "Workers become passive tenders of machinery",
                optionB = "It increases general employment opportunities",
                optionC = "Less machinery is required to start factories",
                optionD = "Workers waste less time moving between tasks",
                correctAnswerIndex = 3,
                explanation = "Specialization increases efficiency because workers focus on a single task, saving the transition time required to switch tools and setups.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_006",
                subject = "Economics",
                topic = "Factors of Production: Entrepreneurship",
                year = "1990",
                questionText = "Which reward is specifically associated with entrepreneurship as a factor of production?",
                optionA = "Salaries",
                optionB = "Profits",
                optionC = "Interest",
                optionD = "Rent",
                correctAnswerIndex = 1,
                explanation = "The entrepreneur bears risk and coordinates land, labor, and capital. Their reward for this risk-bearing and management is profit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_008",
                subject = "Economics",
                topic = "Economies of Scale",
                year = "1990",
                questionText = "Economies of scale operate when a firm experiences",
                optionA = "Falling marginal costs of inputs",
                optionB = "Falling average cost as output expands",
                optionC = "Constant fixed costs of production",
                optionD = "Higher variable costs than fixed costs",
                correctAnswerIndex = 1,
                explanation = "Economies of scale occur when a firm's long-run average cost (LRAC) declines as its total volume of production increases.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_009",
                subject = "Economics",
                topic = "Profit Maximization Condition",
                year = "1990",
                questionText = "At the point of profit maximization, a firm's marginal cost must be",
                optionA = "At its minimum",
                optionB = "Falling rapidly",
                optionC = "Constant",
                optionD = "Rising",
                correctAnswerIndex = 3,
                explanation = "For profit maximization, marginal cost must equal marginal revenue (MC = MR) and the MC curve must cut the MR curve from below, meaning MC must be rising.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_012",
                subject = "Economics",
                topic = "Law of Diminishing Marginal Utility",
                year = "1990",
                questionText = "The Law of Diminishing Marginal Utility states that as consumption of a good increases continuously,",
                optionA = "Total utility must fall immediately",
                optionB = "Marginal utility must eventually fall",
                optionC = "Marginal utility rises while total utility falls",
                optionD = "Total utility remains constant",
                correctAnswerIndex = 1,
                explanation = "As a consumer consumes more of a specific good, the additional satisfaction (marginal utility) derived from each successive unit decreases.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_015",
                subject = "Economics",
                topic = "Price Inelastic Demand",
                year = "1990",
                questionText = "The demand for a product is described as price inelastic if its price elasticity coefficient is",
                optionA = "Less than one",
                optionB = "Greater than one",
                optionC = "Equal to one",
                optionD = "Infinite",
                correctAnswerIndex = 0,
                explanation = "Inelastic demand (coefficient < 1) means that consumers are relatively insensitive to price changes; a change in price results in a smaller percentage change in quantity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_018",
                subject = "Economics",
                topic = "Market Structures: Monopsony",
                year = "1990",
                questionText = "An imperfect market structure featuring only a single buyer of a product is a",
                optionA = "Monopsony",
                optionB = "Oligopoly",
                optionC = "Monopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market structure defined by a single buyer who exercises immense control over the prices of suppliers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_021",
                subject = "Economics",
                topic = "Wholesaling Functions",
                year = "1990",
                questionText = "A major economic function of the wholesaler is",
                optionA = "Breaking bulk into tiny retail units",
                optionB = "Providing warehousing and bulk-storage facilities for manufacturers",
                optionC = "Providing after-sales services directly to consumers",
                optionD = "Enforcing government maximum price controls",
                correctAnswerIndex = 1,
                explanation = "Wholesalers buy in large quantities from manufacturers, absorbing storage and inventory costs, and providing critical warehousing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_024",
                subject = "Economics",
                topic = "Public Enterprises vs Private Firms",
                year = "1990",
                questionText = "A major difference between a state-owned public enterprise and a private enterprise is that the former",
                optionA = "Is not expected to cover its production costs",
                optionB = "Is not primarily expected to maximize profits",
                optionC = "Has no shareholders or capital equity",
                optionD = "Lacks a board of directors",
                correctAnswerIndex = 1,
                explanation = "State parastatals are created to provide affordable public services, prioritizing public welfare over profit maximization.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_025",
                subject = "Economics",
                topic = "Joint-Stock Company Characteristics",
                year = "1990",
                questionText = "The divorce of business ownership from administrative control is a defining feature of a",
                optionA = "Sole proprietorship",
                optionB = "Limited liability joint-stock company",
                optionC = "Ordinary partnership",
                optionD = "Private family firm",
                correctAnswerIndex = 1,
                explanation = "In public companies, shareholders own the business but elect a Board of Directors and hire professional managers to run daily operations.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_026",
                subject = "Economics",
                topic = "Corporate Finance: Equity Capital",
                year = "1990",
                questionText = "The business capital provided by individuals who purchase shares of stock is",
                optionA = "Debt capital",
                optionB = "Fixed capital",
                optionC = "Circulating capital",
                optionD = "Equity capital",
                correctAnswerIndex = 3,
                explanation = "Equity capital represents the ownership interest in a firm raised by issuing common or preferred stock to shareholders.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_031",
                subject = "Economics",
                topic = "Monetary Policy: Reserve Requirements",
                year = "1990",
                questionText = "The legal reserve requirements imposed on commercial banks are designed to",
                optionA = "Assure the profitability of retail banks",
                optionB = "Provide a mechanism to control credit creation and money supply",
                optionC = "Balance earning and non-earning assets",
                optionD = "Provide working capital to the central bank",
                correctAnswerIndex = 1,
                explanation = "By raising or lowering reserve requirements, the central bank directly alters the credit-creation capacity of the banking system.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_032",
                subject = "Economics",
                topic = "Money Creation Calculation",
                year = "1990",
                questionText = "If the primary cash deposit is N100.00 and the cash reserve ratio is 20%, calculate the total credit the banking system can create.",
                optionA = "N700.00",
                optionB = "N600.00",
                optionC = "N500.00",
                optionD = "N400.00",
                correctAnswerIndex = 2,
                explanation = "The credit multiplier is 1 / Cash Ratio = 1 / 0.20 = 5. The total deposit is: 5 * N100.00 = N500.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_033",
                subject = "Economics",
                topic = "Commercial Banking Balance Sheet",
                year = "1990",
                questionText = "Which of the following is recorded as a liability for a commercial bank?",
                optionA = "Customer deposits in the bank",
                optionB = "Loans granted by the bank to individuals",
                optionC = "Treasury bills purchased by the bank",
                optionD = "Corporate bonds owned by the bank",
                correctAnswerIndex = 0,
                explanation = "Customer deposits are liabilities because they represent money that the bank owes and must return to depositors on demand.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_034",
                subject = "Economics",
                topic = "Tax Incidence on Inelastic Supply",
                year = "1990",
                questionText = "A tax levied on a commodity whose supply is perfectly inelastic is",
                optionA = "Shifted entirely to the consumer",
                optionB = "Borne completely by the supplier",
                optionC = "Divided 60:40 between consumer and supplier",
                optionD = "Divided equally between consumer and producer",
                correctAnswerIndex = 1,
                explanation = "When supply is perfectly inelastic (vertical supply curve), producers cannot adjust output or escape the tax, forcing them to absorb the entire tax burden.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_038",
                subject = "Economics",
                topic = "Balance of Trade",
                year = "1990",
                questionText = "The balance of trade is defined as the difference between",
                optionA = "Exports and imports of services only",
                optionB = "Capital inflows and capital outflows",
                optionC = "Visible exports and invisible imports",
                optionD = "Visible exports and visible imports (merchandise goods)",
                correctAnswerIndex = 3,
                explanation = "The balance of trade is the net difference between the monetary value of a country's exports and imports of physical, tangible goods.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_040",
                subject = "Economics",
                topic = "Commercial Policy: Tariffs",
                year = "1990",
                questionText = "A tariff is economically defined as a/an",
                optionA = "Absolute limit on the volume of imported goods",
                optionB = "Subsidy paid to local producers of exports",
                optionC = "Tax levied on imported goods",
                optionD = "Interest rate charge on foreign loans",
                correctAnswerIndex = 2,
                explanation = "A tariff is a customs duty or tax imposed by a government on imported goods to raise revenue and protect domestic industries.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_044",
                subject = "Economics",
                topic = "Keynesian Multiplier Calculation",
                year = "1990",
                questionText = "If a government invests N1,000.00 and the Marginal Propensity to Consume (MPC) is 0.75, calculate the total change in national income.",
                optionA = "N1,000.00",
                optionB = "N4,000.00",
                optionC = "N6,000.00",
                optionD = "N14,000.00",
                correctAnswerIndex = 1,
                explanation = "The multiplier K is calculated as: 1 / (1 - MPC) = 1 / (1 - 0.75) = 4. The change in income is: 4 * N1,000 = N4,000.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1990_047",
                subject = "Economics",
                topic = "National Income Equilibrium",
                year = "1990",
                questionText = "In national income equilibrium, planned economic injections must equal",
                optionA = "Economic withdrawals (leakages)",
                optionB = "Surplus of imports over exports",
                optionC = "Total public government spending",
                optionD = "Total wages paid to households",
                correctAnswerIndex = 0,
                explanation = "Equilibrium in national income accounting requires that injections (Investment, Government spending, Exports) equal leakages (Saving, Taxes, Imports).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q47"
            )
        )

        // =========================================================================
        // 1991 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1991_001",
                subject = "Economics",
                topic = "Market Economy Decision Making",
                year = "1991",
                questionText = "In a market-driven economy, the questions of what, how, and for whom to produce are solved by the",
                optionA = "Elected representatives of the people",
                optionB = "Central planning committee",
                optionC = "Price mechanism (invisible hand)",
                optionD = "State government decrees",
                correctAnswerIndex = 2,
                explanation = "A market economy relies on the price system to transmit consumer preferences and coordinate resource allocation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_002",
                subject = "Economics",
                topic = "Scarcity of Economic Goods",
                year = "1991",
                questionText = "Economic goods are defined as scarce goods because they",
                optionA = "Are not physically available in local markets",
                optionB = "Are not available in sufficient quantities to satisfy all human wants",
                optionC = "Are of premium luxurious quality",
                optionD = "Are essential for basic survival",
                correctAnswerIndex = 1,
                explanation = "In economics, scarcity means that resources are limited relative to the insatiable wants of human society, requiring choices to be made.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_003",
                subject = "Economics",
                topic = "Opportunity Cost",
                year = "1991",
                questionText = "A student needs a textbook and a mirror, each costing N5.00. Since she cannot afford both, she buys the book. The opportunity cost of the book is",
                optionA = "The N5.00 spent on the book",
                optionB = "The cash value of the book",
                optionC = "The mirror",
                optionD = "The book",
                correctAnswerIndex = 2,
                explanation = "The opportunity cost is the valued alternative sacrificed. By choosing the book, she forgives the opportunity to own the mirror.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_004",
                subject = "Economics",
                topic = "Macroeconomics Scope",
                year = "1991",
                questionText = "Macroeconomics is defined as the study of economic science from the perspective of",
                optionA = "Individual resource markets and consumers",
                optionB = "Individual firms and factories",
                optionC = "Aggregate or general national variables",
                optionD = "Competitive market pricing structures",
                correctAnswerIndex = 2,
                explanation = "Macroeconomics deals with aggregate economic performance, studying variables like GDP, national income, inflation, and unemployment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_006",
                subject = "Economics",
                topic = "Theory of Production: Increasing Returns",
                year = "1991",
                questionText = "If units of a variable input are added to a fixed factor and the marginal physical product continues to rise, the firm operates under",
                optionA = "Increasing returns to the variable factor",
                optionB = "Increasing returns to scale",
                optionC = "Constant returns to the variable factor",
                optionD = "External economies of scale",
                correctAnswerIndex = 0,
                explanation = "When the addition of variable inputs increases marginal output, the firm is in the initial stage of increasing marginal returns.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_007",
                subject = "Economics",
                topic = "Cost Theory: Total Cost",
                year = "1991",
                questionText = "At any output level, the Total Cost (TC) of a firm is equal to the",
                optionA = "Marginal cost plus average variable cost",
                optionB = "Total fixed cost plus total variable cost",
                optionC = "Average cost multiplied by the output quantity",
                optionD = "Economic costs multiplied by total assets",
                correctAnswerIndex = 2,
                explanation = "Average Cost (AC) is Total Cost (TC) divided by quantity (Q). Therefore, Total Cost can be calculated as: TC = AC * Q (or TC = TFC + TVC).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_008",
                subject = "Economics",
                topic = "Cost Theory: Total Variable Cost",
                year = "1991",
                questionText = "At any output level, a firm's Total Variable Cost (TVC) is equal to",
                optionA = "Total cost less marginal cost",
                optionB = "Total cost less total fixed cost",
                optionC = "Total cost divided by average cost",
                optionD = "Average variable cost multiplied by output",
                correctAnswerIndex = 1,
                explanation = "Since Total Cost is the sum of fixed and variable costs (TC = TFC + TVC), Total Variable Cost is: TVC = TC - TFC.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_010",
                subject = "Economics",
                topic = "Point Elasticity Calculation",
                year = "1991",
                questionText = "If the price of a pen falls from N1.00 to N0.60 and quantity demanded increases from 200 to 300, calculate the point elasticity of demand.",
                optionA = "1.25",
                optionB = "0.80",
                optionC = "0.50",
                optionD = "0.40",
                correctAnswerIndex = 0,
                explanation = "Elasticity = (% Change in Q) / (% Change in P) = (100 / 200) / (0.40 / 1.00) = 0.50 / 0.40 = 1.25.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_012",
                subject = "Economics",
                topic = "Market Disequilibrium",
                year = "1991",
                questionText = "A competitive market is in disequilibrium when",
                optionA = "Quantity purchased exceeds quantity sold",
                optionB = "Quantity demanded differs from quantity supplied",
                optionC = "Price falls and sales expand",
                optionD = "Sellers compete against each other",
                correctAnswerIndex = 1,
                explanation = "Market equilibrium occurs where quantity demanded equals quantity supplied. Any mismatch between demand and supply creates disequilibrium (shortage or surplus).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_016",
                subject = "Economics",
                topic = "Allocative Efficiency",
                year = "1991",
                questionText = "Allocative efficiency is achieved when a firm produces at the output level where market price equals",
                optionA = "Marginal revenue",
                optionB = "Average variable cost",
                optionC = "Marginal cost",
                optionD = "Total cost",
                correctAnswerIndex = 2,
                explanation = "Socially optimal resource allocation occurs where price equals marginal cost (P = MC), aligning consumer value with production cost.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_017",
                subject = "Economics",
                topic = "Market Structures Comparison",
                year = "1991",
                questionText = "Comparing pricing and output under perfect competition versus pure monopoly shows that",
                optionA = "The monopolist charges a lower price than the perfect competitor",
                optionB = "The perfect competitor charges a lower price and produces a larger output",
                optionC = "The perfect competitor produces a smaller output than the monopolist",
                optionD = "The monopolist charges a lower price and produces more",
                correctAnswerIndex = 1,
                explanation = "Because monopolists restrict output to raise prices, a perfectly competitive market yields a lower price and higher output.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_023",
                subject = "Economics",
                topic = "Partnership Liabilities",
                year = "1991",
                questionText = "An ordinary partner in a standard business partnership has",
                optionA = "No active role in managing the business",
                optionB = "Limited liability for company debts",
                optionC = "Unlimited personal liability for business debts",
                optionD = "Absolute protection against personal lawsuits",
                correctAnswerIndex = 2,
                explanation = "Ordinary (general) partners have unlimited joint and several liability, meaning their personal assets can be seized to pay company debts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_026",
                subject = "Economics",
                topic = "Joint-Stock Company Disadvantages",
                year = "1991",
                questionText = "A major disadvantage of the joint-stock company form of business is the",
                optionA = "Unlimited liability of shareholders",
                optionB = "Legal continuity of the business",
                optionC = "Loss of direct controlling interest by individual owners",
                optionD = "Difficulty in raising capital",
                correctAnswerIndex = 2,
                explanation = "Because ownership is spread across thousands of shareholders, individual owners lose direct control, which is delegated to directors.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_027",
                subject = "Economics",
                topic = "Corporate Debentures",
                year = "1991",
                questionText = "A key characteristic of corporate debentures is that they",
                optionA = "Pay yields based on annual corporate profits",
                optionB = "Pay a fixed rate of interest regardless of profit levels",
                optionC = "Have no specified maturity or redemption date",
                optionD = "Grant voting rights to holders at annual meetings",
                correctAnswerIndex = 1,
                explanation = "Debentures are debt instruments. Holders are creditors who receive a guaranteed, fixed interest payment before shareholders are paid.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_029",
                subject = "Economics",
                topic = "Trade by Barter Limitations",
                year = "1991",
                questionText = "A major economic disadvantage of trade by barter is",
                optionA = "It increases the cost of manufacturing goods",
                optionB = "It requires a double coincidence of wants",
                optionC = "One trading partner is always cheated",
                optionD = "It prevents specialization of labor",
                correctAnswerIndex = 1,
                explanation = "Barter requires that both parties want what the other is offering, a condition that is rare and increases search costs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_030",
                subject = "Economics",
                topic = "Development Banking Functions",
                year = "1991",
                questionText = "The primary function of development banks is to",
                optionA = "Print and distribute currency notes",
                optionB = "Provide short-term loans to commercial banks",
                optionC = "Provide medium- and long-term capital for development projects",
                optionD = "Act as bank of deposit for retail customers",
                correctAnswerIndex = 2,
                explanation = "Development banks (like the Bank of Industry) focus on industrialization, providing long-term funding for capital-intensive projects.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_036",
                subject = "Economics",
                topic = "Taxation Systems: Regressive",
                year = "1991",
                questionText = "A tax that takes an increasing percentage of income as income decreases is a",
                optionA = "Proportional tax",
                optionB = "Regressive tax",
                optionC = "Progressive tax",
                optionD = "Direct tax",
                correctAnswerIndex = 1,
                explanation = "Regressive taxes impose a higher relative burden on low-income earners because they pay a larger share of their income in tax.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1991_037",
                subject = "Economics",
                topic = "Government Budget Deficits",
                year = "1991",
                questionText = "A government budget deficit occurs when",
                optionA = "Total public expenditure exceeds total revenue",
                optionB = "Recurrent expenditure exceeds total tax revenues",
                optionC = "Capital expenditure exceeds available reserves",
                optionD = "Imports exceed exports",
                correctAnswerIndex = 0,
                explanation = "A budget deficit is the excess of total government spending over total tax and non-tax revenues during a fiscal year.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q37"
            )
        )

        return list
    }
}
