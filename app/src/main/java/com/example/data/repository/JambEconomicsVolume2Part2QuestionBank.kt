package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Economics Past Questions - Volume 2 (Part 2: 1992 - 2004 Series).
 * Cleaned, standardized 4-option format, balanced answer keys, and detailed pedagogical explanations.
 */
object JambEconomicsVolume2Part2QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1992 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1992_002",
                subject = "Economics",
                topic = "Scale of Preference",
                year = "1992",
                questionText = "A scale of preference is defined as",
                optionA = "A consumer's preference for luxury goods",
                optionB = "A statement of monthly household income",
                optionC = "A list of goods and services arranged in order of priority",
                optionD = "A government development plan",
                correctAnswerIndex = 2,
                explanation = "Faced with scarcity, consumers rank their desires in order of importance to ensure they satisfy their most urgent wants first.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1992 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1992_007",
                subject = "Economics",
                topic = "Demography and Population Policy",
                year = "1992",
                questionText = "The primary economic objective of family planning campaigns is to",
                optionA = "Reduce the crude death rate",
                optionB = "Limit polygamy",
                optionC = "Keep population growth at a sustainable rate to raise living standards",
                optionD = "Increase the supply of agricultural labor",
                correctAnswerIndex = 2,
                explanation = "Family planning aims to regulate birth rates to ensure that population growth does not outpace economic resources, raising per capita income.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1992 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1992_010",
                subject = "Economics",
                topic = "Factor Substitution",
                year = "1992",
                questionText = "If the price of capital rises relative to labor, production techniques should become more",
                optionA = "Labor-intensive",
                optionB = "Capital-intensive",
                optionC = "Fixed",
                optionD = "Technology-intensive",
                correctAnswerIndex = 0,
                explanation = "Firms substitute expensive inputs with cheaper ones. If capital is expensive, they will employ more labor (labor-intensive techniques).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1992 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1992_023",
                subject = "Economics",
                topic = "Public Goods and Corporations",
                year = "1992",
                questionText = "The business model used to produce public goods in Nigeria is the",
                optionA = "Sole proprietorship",
                optionB = "Private limited company",
                optionC = "Co-operative society",
                optionD = "Statutory public corporation",
                correctAnswerIndex = 3,
                explanation = "Public goods (non-rival and non-excludable) are funded by the government and provided through statutory public corporations.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1992 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1992_037",
                subject = "Economics",
                topic = "Fiscal Policy for Inflation",
                year = "1992",
                questionText = "To combat high inflation, the government should",
                optionA = "Raise taxes and run a budget surplus",
                optionB = "Raise taxes and run a budget deficit",
                optionC = "Cut taxes and run a budget deficit",
                optionD = "Cut taxes and run a balanced budget",
                correctAnswerIndex = 0,
                explanation = "Running a budget surplus by raising taxes and cutting spending cools down the economy by reducing aggregate demand.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1992 • Q37"
            )
        )

        // =========================================================================
        // 1993 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1993_007",
                subject = "Economics",
                topic = "Rural-Urban Migration",
                year = "1993",
                questionText = "Which of the following does NOT contribute to rural-urban migration in West Africa?",
                optionA = "Concentration of social infrastructure in cities",
                optionB = "Declining soil fertility in rural agricultural zones",
                optionC = "Implementation of rural electrification programs",
                optionD = "Higher wage expectations in urban industrial jobs",
                correctAnswerIndex = 2,
                explanation = "Rural electrification and development programs improve rural living standards, which helps reduce the migration of young people to cities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1993 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1993_008",
                subject = "Economics",
                topic = "Demography and Population Census",
                year = "1993",
                questionText = "An accurate demographic census is vital to a country because it",
                optionA = "Solves structural unemployment immediately",
                optionB = "Redistributes natural resources to local areas",
                optionC = "Provides an empirical basis for development policy planning",
                optionD = "Balances the gender ratio of the population",
                correctAnswerIndex = 2,
                explanation = "Accurate census data provides essential information on population size, age distribution, and growth trends, allowing the government to plan public services effectively.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1993 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1993_013",
                subject = "Economics",
                topic = "Marginal Productivity and Wage Determination",
                year = "1993",
                questionText = "To maximize profits under perfect competition, a firm must pay workers a wage rate equal to the",
                optionA = "Marginal revenue of the enterprise",
                optionB = "Marginal revenue product of labor (MRPL)",
                optionC = "Average total cost of the business",
                optionD = "Minimum wage set by the state",
                correctAnswerIndex = 1,
                explanation = "A profit-maximizing firm hires labor up to the point where the cost of the last worker (wage) equals the revenue they generate (MRPL).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1993 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1993_016",
                subject = "Economics",
                topic = "Elasticity and Total Revenue",
                year = "1993",
                questionText = "If the price elasticity of demand for a good is less than one (inelastic), a price increase will",
                optionA = "Increase the total revenue of the producer",
                optionB = "Leave the total revenue completely unchanged",
                optionC = "Decrease the total revenue of the producer",
                optionD = "Cause total revenue to drop to zero",
                correctAnswerIndex = 0,
                explanation = "For inelastic goods, the percentage drop in quantity demanded is smaller than the percentage increase in price, which increases total revenue.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1993 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1993_035",
                subject = "Economics",
                topic = "Economic Growth vs Development",
                year = "1993",
                questionText = "Economic development differs from economic growth because development also includes",
                optionA = "Higher rates of currency inflation",
                optionB = "Structural changes and more equitable distribution of wealth",
                optionC = "A decrease in capital investments",
                optionD = "Rising birth rates",
                correctAnswerIndex = 1,
                explanation = "Economic growth measures output expansion, while economic development includes structural shifts, better living standards, and more equitable wealth distribution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1993 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1993_041",
                subject = "Economics",
                topic = "Standard of Living Measurement",
                year = "1993",
                questionText = "The best index for comparing the standard of living across different nations is",
                optionA = "Gross National Product (GNP)",
                optionB = "Total Net National Income",
                optionC = "Real Per Capita Income",
                optionD = "Gross Domestic Product (GDP)",
                correctAnswerIndex = 2,
                explanation = "Real Per Capita Income (national income divided by population) measures average economic well-being, adjusting for population size differences.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1993 • Q41"
            )
        )

        // =========================================================================
        // 1994 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1994_010",
                subject = "Economics",
                topic = "Demography: Underpopulation",
                year = "1994",
                questionText = "If a country's actual population is less than its optimum population, the country is",
                optionA = "Overpopulated",
                optionB = "Underpopulated",
                optionC = "Depopulated",
                optionD = "At its maximum per capita output",
                correctAnswerIndex = 1,
                explanation = "Underpopulation occurs when a country has too few people to utilize its resources efficiently, meaning a larger population would raise per capita income.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1994 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1994_013",
                subject = "Economics",
                topic = "Theory of Production: Total vs Marginal Product",
                year = "1994",
                questionText = "When Total Product (TP) reaches its maximum point, the Marginal Product (MP) of labor is",
                optionA = "At its maximum",
                optionB = "Equal to Average Product",
                optionC = "Zero",
                optionD = "Negative",
                correctAnswerIndex = 2,
                explanation = "Marginal product measures the change in total output. When TP is maximized, the addition of another unit of input adds zero extra output (MP = 0).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1994 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1994_014",
                subject = "Economics",
                topic = "Production Time Horizons: Long Run",
                year = "1994",
                questionText = "In the long run, all factors of production are considered",
                optionA = "Fixed",
                optionB = "Semi-fixed",
                optionC = "Variable",
                optionD = "Constant",
                correctAnswerIndex = 2,
                explanation = "In the long run, there are no fixed inputs. Firms can adjust the quantities of all factors of production, including factory size and land.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1994 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1994_018",
                subject = "Economics",
                topic = "Price Elasticity and Revenue Strategy",
                year = "1994",
                questionText = "Faced with a highly elastic demand curve, a producer who wants to increase total revenue should",
                optionA = "Raise the product price slightly",
                optionB = "Lower the product price slightly",
                optionC = "Keep the price completely unchanged",
                optionD = "Restrict production output",
                correctAnswerIndex = 1,
                explanation = "For elastic goods, a percentage price cut leads to a larger percentage increase in sales, raising total revenue.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1994 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1994_030",
                subject = "Economics",
                topic = "Agricultural Supply Fluctuations",
                year = "1994",
                questionText = "The main cause of fluctuations in the supply of agricultural produce is",
                optionA = "Shifts in government pricing policies",
                optionB = "Price changes in input markets",
                optionC = "Climatic and weather variations",
                optionD = "Rural-urban migration of labor",
                correctAnswerIndex = 2,
                explanation = "Agriculture is highly dependent on natural factors like rainfall, temperature, and pests, which can cause significant fluctuations in annual crop yields.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1994 • Q30"
            )
        )

        // =========================================================================
        // 1997 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1997_001",
                subject = "Economics",
                topic = "Consumer Equilibrium: Equimarginal Principle",
                year = "1997",
                questionText = "A consumer maximizes satisfaction from a given level of money income when",
                optionA = "Total utility from each good is increasing at an increasing rate",
                optionB = "Marginal utility from each good is equal",
                optionC = "Marginal utility per naira spent is equal for all goods and services",
                optionD = "Total utility from all goods is minimized",
                correctAnswerIndex = 2,
                explanation = "Consumer equilibrium is achieved when utility is maximized, satisfying the equimarginal principle: MU_x / P_x = MU_y / P_y.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_002",
                subject = "Economics",
                topic = "Consumer Rationality and Transitivity",
                year = "1997",
                questionText = "Ike's scale of preference shows he prefers bananas to pawpaws, pawpaws to oranges, and oranges to bananas. His preferences are",
                optionA = "Inconsistent",
                optionB = "Consistent",
                optionC = "Transitive",
                optionD = "Rational",
                correctAnswerIndex = 0,
                explanation = "Rational and consistent consumer choices must be transitive (if A > B and B > C, then A > C). His circular preferences are inconsistent.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_015",
                subject = "Economics",
                topic = "Market Equilibrium Calculation",
                year = "1997",
                questionText = "Given the market demand curve Q = 120 - 2P and supply curve Q = 4P, calculate the equilibrium price and quantity.",
                optionA = "P = 20, Q = 80",
                optionB = "P = 30, Q = 120",
                optionC = "P = 40, Q = 60",
                optionD = "P = 60, Q = 240",
                correctAnswerIndex = 0,
                explanation = "At equilibrium, demand equals supply: 120 - 2P = 4P → 6P = 120 → P = 20. Substituting P: Q = 4 * 20 = 80.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_016",
                subject = "Economics",
                topic = "Supply Inelasticity and Demand Shifts",
                year = "1997",
                questionText = "If a rightward-shifting demand curve intersects a perfectly inelastic supply curve,",
                optionA = "Both equilibrium price and quantity will increase",
                optionB = "Only the equilibrium price will increase",
                optionC = "Only the equilibrium quantity will increase",
                optionD = "The equilibrium price remains constant",
                correctAnswerIndex = 1,
                explanation = "When supply is perfectly inelastic (vertical curve), any increase in demand bids up the price, while the quantity remains unchanged.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_021",
                subject = "Economics",
                topic = "Perishable Goods Distribution",
                year = "1997",
                questionText = "The best distribution channel for freshly baked bread is",
                optionA = "Wholesalers to retailers then to consumers",
                optionB = "Direct sales from producers to consumers",
                optionC = "Wholesalers directly to final consumers",
                optionD = "Retailers to bulk wholesalers",
                correctAnswerIndex = 1,
                explanation = "Highly perishable goods like bread require rapid distribution, which is best achieved through direct sales from producer to consumer.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_023",
                subject = "Economics",
                topic = "Corporate Liquidation Priority",
                year = "1997",
                questionText = "In company liquidation, which of the following shares must be redeemed first?",
                optionA = "Preference shares",
                optionB = "Non-voting ordinary shares",
                optionC = "Voting ordinary shares",
                optionD = "Deferred shares",
                correctAnswerIndex = 0,
                explanation = "Preference shareholders have a prior claim over ordinary shareholders on residual assets during company liquidation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_027",
                subject = "Economics",
                topic = "Location of Timber Industries",
                year = "1997",
                questionText = "Plywood and timber processing industries are located near the source of",
                optionA = "Finance capital",
                optionB = "Skilled factory labor",
                optionC = "Electric power grids",
                optionD = "Raw forest materials",
                correctAnswerIndex = 3,
                explanation = "Weight-losing primary industries are located near raw materials to minimize the costs of transporting heavy logs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_034",
                subject = "Economics",
                topic = "Banking Deposit Accounts",
                year = "1997",
                questionText = "In commercial banking, an account from which customers cannot withdraw funds instantly is a",
                optionA = "Demand deposit account",
                optionB = "Time (fixed) deposit account",
                optionC = "Current account",
                optionD = "Savings deposit account",
                correctAnswerIndex = 1,
                explanation = "Time deposits are held for a fixed duration and earn higher interest, requiring notice or a penalty for early withdrawal.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1997_037",
                subject = "Economics",
                topic = "Tax Avoidance vs Evasion",
                year = "1997",
                questionText = "The use of legally permissible methods to reduce tax liabilities is known as tax",
                optionA = "Evasion",
                optionB = "Avoidance",
                optionC = "Relief",
                optionD = "Exemption",
                correctAnswerIndex = 1,
                explanation = "Tax avoidance uses legal loopholes to minimize tax liabilities, whereas tax evasion is the illegal non-payment of taxes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q37"
            )
        )

        // =========================================================================
        // 1999 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_1999_003",
                subject = "Economics",
                topic = "Production Possibility Frontier",
                year = "1999",
                questionText = "The concave shape of a standard production possibility frontier (PPF) is determined by",
                optionA = "Increasing opportunity costs of production",
                optionB = "Constant returns to scale",
                optionC = "Diminishing returns to variable factors",
                optionD = "Increasing returns to labor",
                correctAnswerIndex = 0,
                explanation = "The PPF is bowed outward (concave) because resources are not equally efficient in producing both goods, leading to increasing opportunity costs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1999 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1999_004",
                subject = "Economics",
                topic = "Normative Economics",
                year = "1999",
                questionText = "Normative economics is distinguished by its focus on",
                optionA = "Objective facts and empirical models",
                optionB = "Value judgments and what ought to be",
                optionC = "Statistical calculations of inflation",
                optionD = "Mathematical proofs of market equilibria",
                correctAnswerIndex = 1,
                explanation = "Normative economics makes value judgments and prescribes policy solutions based on personal or political values, rather than objective analysis.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1999 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1999_018",
                subject = "Economics",
                topic = "Cost Curves: Average Fixed Cost",
                year = "1999",
                questionText = "A key characteristic of Average Fixed Cost (AFC) is that as output expands, AFC",
                optionA = "Rises and falls rapidly",
                optionB = "Is V-shaped and cuts the price axis",
                optionC = "Is always higher than the average variable cost",
                optionD = "Falls continuously but never reaches zero",
                correctAnswerIndex = 3,
                explanation = "Since fixed cost is constant, AFC (TFC / Q) decreases continuously as output increases, asymptotically approaching the horizontal axis.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1999 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1999_022",
                subject = "Economics",
                topic = "Agricultural Development Challenges",
                year = "1999",
                questionText = "A major barrier to rapid agricultural development in Nigeria is the",
                optionA = "Persistent use of primitive farming implements",
                optionB = "Inability of local farmers to learn modern techniques",
                optionC = "Failure of rural electrification programs",
                optionD = "Rapidly declining birth rates in rural areas",
                correctAnswerIndex = 0,
                explanation = "Nigerian agriculture is dominated by smallholder peasant farmers who rely on primitive hand tools (like hoes and cutlasses), which limits productivity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1999 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1999_038",
                subject = "Economics",
                topic = "Value of Money and Price Level",
                year = "1999",
                questionText = "The relationship between the value (purchasing power) of money and the general price level is",
                optionA = "Direct and proportional",
                optionB = "Unpredictable and random",
                optionC = "Highly positive",
                optionD = "Inverse",
                correctAnswerIndex = 3,
                explanation = "The value of money is inversely related to the price level. When prices rise (inflation), a unit of money buys fewer goods, reducing its purchasing power.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1999 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_1999_039",
                subject = "Economics",
                topic = "Keynesian Motives for Holding Money",
                year = "1999",
                questionText = "According to John Maynard Keynes, the three motives for holding money are",
                optionA = "Charity, investment, and speculation",
                optionB = "Transactions, precautionary, and speculative motives",
                optionC = "Safe-keeping, savings, and loan purposes",
                optionD = "Investment, consumption, and taxes",
                correctAnswerIndex = 1,
                explanation = "Keynes' liquidity preference theory states that people hold cash for daily transactions, unexpected emergencies (precautionary), and investment opportunities (speculative).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1999 • Q39"
            )
        )

        // =========================================================================
        // 2000 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_2000_009",
                subject = "Economics",
                topic = "Cardinal Utility Theory",
                year = "2000",
                questionText = "A central premise of the cardinal utility theory of consumer behavior is that utility is",
                optionA = "Measurable in units called 'utils'",
                optionB = "Strictly ordinal and ranked",
                optionC = "Intangible and impossible to analyze",
                optionD = "Constant across all individuals",
                correctAnswerIndex = 0,
                explanation = "Cardinal utility theory assumes that satisfaction is measurable in objective units (utils), allowing for quantitative analysis of consumer choice.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2000 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2000_024",
                subject = "Economics",
                topic = "Monopoly Total Revenue Maximization",
                year = "2000",
                questionText = "When a monopolist's marginal revenue is equal to zero, its Total Revenue (TR) is",
                optionA = "Zero",
                optionB = "Falling rapidly",
                optionC = "At its maximum point",
                optionD = "Equal to marginal cost",
                correctAnswerIndex = 2,
                explanation = "Total revenue is maximized when marginal revenue is zero. Beyond this point, MR becomes negative and TR begins to fall.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2000 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2000_028",
                subject = "Economics",
                topic = "Primary Industry Classification",
                year = "2000",
                questionText = "A primary industry is defined as an industry concerned with the",
                optionA = "Processing of finished industrial goods",
                optionB = "Extraction of natural resources in their raw state",
                optionC = "Provision of administrative services",
                optionD = "Assembly of motor vehicles",
                correctAnswerIndex = 1,
                explanation = "Primary industries (e.g., agriculture, mining, fishing) extract raw materials directly from nature.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2000 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2000_044",
                subject = "Economics",
                topic = "Capital Market vs Money Market",
                year = "2000",
                questionText = "The capital market differs from the money market because it deals in",
                optionA = "Short-term loans and liquid assets",
                optionB = "Medium- and long-term funds and securities",
                optionC = "Gold and precious metals trading",
                optionD = "Directly subsidized government grants",
                correctAnswerIndex = 1,
                explanation = "The capital market raises long-term funds through shares and bonds, while the money market deals in short-term debt instruments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2000 • Q44"
            )
        )

        // =========================================================================
        // 2001 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_2001_003",
                subject = "Economics",
                topic = "Indifference Curve and Budget Line",
                year = "2001",
                questionText = "At consumer equilibrium, the slope of the indifference curve is",
                optionA = "Equal to the slope of the budget line",
                optionB = "Half the slope of the budget line",
                optionC = "Greater than the slope of the budget line",
                optionD = "Less than the slope of the budget line",
                correctAnswerIndex = 0,
                explanation = "Consumer equilibrium is reached where the budget line is tangent to the highest possible indifference curve, meaning their slopes are equal (MRS_xy = P_x / P_y).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2001 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2001_007",
                subject = "Economics",
                topic = "Total Utility and Marginal Utility",
                year = "2001",
                questionText = "At the point where the Total Utility (TU) curve is maximized, Marginal Utility (MU) is",
                optionA = "Maximized",
                optionB = "Equal to one",
                optionC = "Falling",
                optionD = "Zero",
                correctAnswerIndex = 3,
                explanation = "When total utility is maximized, consuming another unit adds zero extra satisfaction (marginal utility = 0).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2001 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2001_008",
                subject = "Economics",
                topic = "Supply Curve Shifts",
                year = "2001",
                questionText = "A change in supply is graphically represented by a/an",
                optionA = "Movement along the supply curve",
                optionB = "Shift of the supply curve to the left or right",
                optionC = "Shift of the demand curve",
                optionD = "Adjustment in price only",
                correctAnswerIndex = 1,
                explanation = "A change in supply (caused by non-price factors like technology or input costs) shifts the entire supply curve to a new position.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2001 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2001_038",
                subject = "Economics",
                topic = "Central Bank Discount Rate Policy",
                year = "2001",
                questionText = "An increase in the discount rate by the Central Bank is a signal of a/an",
                optionA = "Expansionary monetary policy",
                optionB = "Disciplined fiscal policy",
                optionC = "Contractionary (tight) monetary policy",
                optionD = "Easy credit policy",
                correctAnswerIndex = 2,
                explanation = "Raising the discount rate increases the cost of borrowing for commercial banks, which reduces credit and slows the money supply.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2001 • Q38"
            )
        )

        // =========================================================================
        // 2002 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_2002_001",
                subject = "Economics",
                topic = "Budget Line Rotation",
                year = "2002",
                questionText = "If a consumer buys goods P and Q, a fall in the price of P (with the price of Q unchanged) will cause the budget line to",
                optionA = "Rotate outwards along the P-axis, away from the origin",
                optionB = "Shift parallel inwards",
                optionC = "Rotate inwards along the P-axis, towards the origin",
                optionD = "Shift parallel outwards",
                correctAnswerIndex = 0,
                explanation = "A price cut for good P increases the consumer's purchasing power for P, rotating the budget line outward along the P-axis.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2002_002",
                subject = "Economics",
                topic = "Exceptional Demand Curves",
                year = "2002",
                questionText = "An exceptional, upward-sloping demand curve can occur due to",
                optionA = "Easy credit facilities",
                optionB = "The availability of substitutes",
                optionC = "Price expectations of future price increases",
                optionD = "Diminishing marginal utility",
                correctAnswerIndex = 2,
                explanation = "If consumers expect prices to rise further, they will buy more at current high prices, creating an exceptional, upward-sloping demand curve.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2002_030",
                subject = "Economics",
                topic = "Market Deregulation",
                year = "2002",
                questionText = "The economic policy of market deregulation aims to encourage a/an",
                optionA = "Competitive market structure",
                optionB = "Oligopolistic market structure",
                optionC = "Duopolistic market structure",
                optionD = "Monopolistic market structure",
                correctAnswerIndex = 0,
                explanation = "Deregulation removes government barriers to entry and price controls, encouraging competition and market efficiency.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2002_032",
                subject = "Economics",
                topic = "Perfect Competition Supply Curve",
                year = "2002",
                questionText = "Under perfect competition, a firm's short-run supply curve is determined by its",
                optionA = "Fixed cost curve",
                optionB = "Variable cost curve",
                optionC = "Average cost curve",
                optionD = "Marginal cost curve above the shutdown point",
                correctAnswerIndex = 3,
                explanation = "A perfectly competitive firm's supply curve is the segment of its marginal cost curve that lies above its minimum average variable cost (shutdown point).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2002_043",
                subject = "Economics",
                topic = "Keynesian Multiplier Calculation",
                year = "2002",
                questionText = "In a closed economy, if the Marginal Propensity to Consume is 0.6, calculate the multiplier.",
                optionA = "2.7",
                optionB = "2.6",
                optionC = "2.4",
                optionD = "2.5",
                correctAnswerIndex = 3,
                explanation = "The multiplier K is calculated as: 1 / (1 - MPC) = 1 / (1 - 0.6) = 1 / 0.4 = 2.5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2002_045",
                subject = "Economics",
                topic = "NDIC Mandate",
                year = "2002",
                questionText = "The primary objective of the Nigeria Deposit Insurance Corporation (NDIC) is to",
                optionA = "Regulate financial parastatals",
                optionB = "Protect commercial banks against fraud",
                optionC = "Protect bank depositors and maintain banking stability",
                optionD = "Manage government accounts",
                correctAnswerIndex = 2,
                explanation = "The NDIC insures bank deposits, protecting depositors from losses in the event of bank failures and promoting trust in the financial system.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q45"
            )
        )

        // =========================================================================
        // 2003 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_2003_001",
                subject = "Economics",
                topic = "Price Inelastic Demand Calculation",
                year = "2003",
                questionText = "If the price of a good rises from N5 to N8 and quantity demanded falls from 200 to 190 units, the demand curve over this range is",
                optionA = "Fairly inelastic",
                optionB = "Fairly elastic",
                optionC = "Perfectly inelastic",
                optionD = "Perfectly elastic",
                correctAnswerIndex = 0,
                explanation = "The percentage change in price (60%) is larger than the percentage change in quantity demanded (5%), indicating inelastic demand (coefficient < 1).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2003 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2003_020",
                subject = "Economics",
                topic = "Non-Bank Financial Institutions",
                year = "2003",
                questionText = "Insurance companies, pension funds, and unit trusts are examples of",
                optionA = "Government regulatory agencies",
                optionB = "Non-governmental organizations",
                optionC = "Non-bank financial institutions",
                optionD = "Rural revenue mobilizers",
                correctAnswerIndex = 2,
                explanation = "Non-bank financial institutions provide financial services (such as investment or insurance) but cannot accept demand deposits withdrawable by check.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2003 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2003_028",
                subject = "Economics",
                topic = "CBN Open Market Operations",
                year = "2003",
                questionText = "The monetary policy instrument most frequently used by the Central Bank of Nigeria is",
                optionA = "The discount rate",
                optionB = "The cash reserve ratio",
                optionC = "Margin requirements",
                optionD = "Open market operations (OMO)",
                correctAnswerIndex = 3,
                explanation = "Open market operations (the buying and selling of government securities) is the most direct tool used by the CBN to manage bank reserves and liquidity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2003 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2003_029",
                subject = "Economics",
                topic = "Revenue Allocation Formula",
                year = "2003",
                questionText = "The primary objective of a national revenue allocation formula is to",
                optionA = "Share revenue between public and private sectors",
                optionB = "Maintain company profit ratios",
                optionC = "Share federally collected revenue among the different tiers of government",
                optionD = "Direct revenue to commercial banks",
                correctAnswerIndex = 2,
                explanation = "The revenue allocation formula dictates how federally collected revenues are shared among federal, state, and local governments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2003 • Q29"
            )
        )

        // =========================================================================
        // 2004 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eco_v2_2004_002",
                subject = "Economics",
                topic = "Multiplier Calculation",
                year = "2004",
                questionText = "Given that Y = C + I and C = bY where b = 0.8, calculate the multiplier.",
                optionA = "5",
                optionB = "10",
                optionC = "4",
                optionD = "2",
                correctAnswerIndex = 0,
                explanation = "The multiplier is: 1 / (1 - b) = 1 / (1 - 0.8) = 1 / 0.2 = 5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2004_012",
                subject = "Economics",
                topic = "Petroleum Downstream Activities",
                year = "2004",
                questionText = "The downstream activities of oil companies in Nigeria comprise",
                optionA = "Refining crude oil and distributing petroleum products",
                optionB = "Geological prospecting and drilling",
                optionC = "Off-shore exploration",
                optionD = "Spillage management",
                correctAnswerIndex = 0,
                explanation = "Downstream operations involve refining crude oil into petroleum products and distributing them to final markets.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2004_015",
                subject = "Economics",
                topic = "Industrial Development Bottlenecks",
                year = "2004",
                questionText = "A major cause of the slow pace of industrialization in Nigeria is the inadequacy of",
                optionA = "Raw materials",
                optionB = "Industrial landmass",
                optionC = "Basic infrastructural facilities",
                optionD = "Unskilled manual labor",
                correctAnswerIndex = 2,
                explanation = "Inadequate power supply, poor transport networks, and weak infrastructure raise operating costs, slowing industrial growth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2004_018",
                subject = "Economics",
                topic = "Commercial Policy: Input Concessions",
                year = "2004",
                questionText = "Import duty concessions on industrial inputs directly benefit",
                optionA = "Final consumers",
                optionB = "The external trade sector",
                optionC = "Retail commercial sellers",
                optionD = "Domestic manufacturers",
                correctAnswerIndex = 3,
                explanation = "Import concessions lower the cost of raw materials and machinery for domestic manufacturers, raising their competitiveness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2004_021",
                subject = "Economics",
                topic = "Demography: Natural Growth Rate",
                year = "2004",
                questionText = "The difference between the birth and death rates of a population is the",
                optionA = "Mortality rate",
                optionB = "Fertility rate",
                optionC = "Natural growth rate",
                optionD = "Linear growth rate",
                correctAnswerIndex = 2,
                explanation = "The natural growth rate measures population change due to biological factors (births and deaths), excluding migration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2004_023",
                subject = "Economics",
                topic = "International Trade: Absolute Advantage",
                year = "2004",
                questionText = "A country has an absolute advantage in producing a good if she can",
                optionA = "Produce more of the good using fewer resources than another country",
                optionB = "Sell to other countries without buying from them",
                optionC = "Has a higher opportunity cost in producing the good",
                optionD = "Has a lower opportunity cost in producing the good",
                correctAnswerIndex = 0,
                explanation = "Absolute advantage is the ability of an entity to produce a greater quantity of a good using fewer inputs or resources than competitors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2004_028",
                subject = "Economics",
                topic = "Taxation: Value Added Tax",
                year = "2004",
                questionText = "A tax levied on goods and services at each stage of production and distribution is",
                optionA = "Surtax",
                optionB = "Value-Added Tax (VAT)",
                optionC = "Ad valorem export tax",
                optionD = "PAYE tax",
                correctAnswerIndex = 1,
                explanation = "Value-Added Tax (VAT) is a multi-stage consumption tax levied on the value added to a product at each stage of production and distribution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_v2_2004_042",
                subject = "Economics",
                topic = "Cost Function and Average Cost Calculation",
                year = "2004",
                questionText = "Given the cost function C = 160 + 36Q, calculate the average cost at 20 units of output.",
                optionA = "N720.00",
                optionB = "N216.00",
                optionC = "N44.00",
                optionD = "N880.00",
                correctAnswerIndex = 2,
                explanation = "Total Cost C = 160 + 36 * 20 = 160 + 720 = 880. Average Cost (AC) = Total Cost / Q = 880 / 20 = N44.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2004 • Q42"
            )
        )

        return list
    }
}
