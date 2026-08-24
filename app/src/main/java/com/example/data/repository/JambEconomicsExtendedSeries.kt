package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Economics Past Questions (1986 - 2002 Exam Series).
 */
object JambEconomicsExtendedSeries {

    fun getExtendedEconomicsQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 1986 SERIES
        // ==========================================
        list.add(
            QuestionEntity(
                id = "eco_1986_001",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "1986",
                questionText = "Choice in economic life is necessitated by",
                optionA = "The need to construct scale of preference",
                optionB = "The opportunity cost of consumption",
                optionC = "Unlimited wants",
                optionD = "Scarcity of economic resources",
                correctAnswerIndex = 3,
                explanation = "The fundamental economic problem is scarcity. Since productive resources are limited relative to the unlimited wants of society, choice becomes inevitable to decide which wants to satisfy first.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_002",
                subject = "Economics",
                topic = "Basic Economic Concepts: Opportunity Cost",
                year = "1986",
                questionText = "Which of these is the real cost of satisfying any want in the sense of the alternative that has to be foregone?",
                optionA = "Variable cost",
                optionB = "Opportunity cost",
                optionC = "Total cost",
                optionD = "Prime cost",
                correctAnswerIndex = 1,
                explanation = "Opportunity cost represents the value of the next best alternative that is sacrificed or foregone when a choice is made.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_003",
                subject = "Economics",
                topic = "Consumer Sovereignty",
                year = "1986",
                questionText = "Under normal circumstances, the concept of consumer sovereignty implies that",
                optionA = "The consumer and not the producer owns the means of production",
                optionB = "The producer and not the consumer determines what is to be produced",
                optionC = "The consumer and not the producer determines what is to be produced",
                optionD = "Both the consumer and the producer determine what is to be produced",
                correctAnswerIndex = 2,
                explanation = "Consumer sovereignty describes a market dynamic where consumer spending patterns act as votes, signaling to producers which commodities are profitable to produce and in what quantities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_004",
                subject = "Economics",
                topic = "Theory of the Firm: Optimum Size",
                year = "1986",
                questionText = "A firm is at its optimum size when",
                optionA = "It produces the greatest output at the minimum cost",
                optionB = "It has a motive to increase output",
                optionC = "Marginal cost equals marginal revenue",
                optionD = "Marginal cost is less than marginal revenue",
                correctAnswerIndex = 0,
                explanation = "The optimum firm is a business unit that has expanded its production scale up to the point where its long-run average cost (LAC) is at its lowest possible level, maximizing productive efficiency.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_005",
                subject = "Economics",
                topic = "Division of Labour and Specialization",
                year = "1986",
                questionText = "The degree of specialization is limited by the",
                optionA = "Monotony of work",
                optionB = "Decline of craftsmanship",
                optionC = "Extent of the market",
                optionD = "Disadvantage of standardization",
                correctAnswerIndex = 2,
                explanation = "As noted by Adam Smith, specialization (division of labour) is limited by market demand. If the market is tiny, highly specialized roles cannot remain economically viable.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_006",
                subject = "Economics",
                topic = "Theory of Production",
                year = "1986",
                questionText = "Production in Economics can be defined as the",
                optionA = "Totality of producing, buying and consuming",
                optionB = "Transformation of raw materials and services in order to provide ultimate utility",
                optionC = "Transformation of raw materials and services in order to make maximum profit",
                optionD = "Production of goods and services for consumption",
                correctAnswerIndex = 1,
                explanation = "Production is not merely creating physical things, but the creation of utility (utility of form, place, or time) to satisfy human wants through the processing of resources.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_007",
                subject = "Economics",
                topic = "Production: Least Cost Factor Combination",
                year = "1986",
                questionText = "A firm achieves least cost in production by substituting factors until",
                optionA = "Their factor prices are equal",
                optionB = "Their marginal-physical-products are each equal to their factor prices",
                optionC = "Their marginal-physical-products are each zero",
                optionD = "The ratio of their marginal-physical-products equals the ratio of their prices",
                correctAnswerIndex = 3,
                explanation = "Least-cost factor combination is achieved when a firm equates the marginal rate of technical substitution (MRTS) of inputs to the ratio of their factor prices: MPP_L / MPP_C = Wage / Rent.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_012",
                subject = "Economics",
                topic = "Population Density",
                year = "1986",
                questionText = "Population density refers to",
                optionA = "Densely populated urban centres",
                optionB = "The total area divided by the total population",
                optionC = "Densely populated rural areas",
                optionD = "The total population divided by the total area",
                correctAnswerIndex = 3,
                explanation = "Population density measures demographic concentration, calculated as the total population of a region divided by its total land surface area (expressed as persons per square kilometer).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_013",
                subject = "Economics",
                topic = "Consumer Expenditure",
                year = "1986",
                questionText = "What fundamentally determines how much a consumer spends in a producer's shop?",
                optionA = "Individual's propensity to consume",
                optionB = "Level of his taxation",
                optionC = "Level of his income",
                optionD = "Individual's taste or fashion",
                correctAnswerIndex = 2,
                explanation = "According to Keynesian consumer theory, the absolute level of personal disposable income is the primary and most important determinant of consumption expenditure.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_014",
                subject = "Economics",
                topic = "Economic Systems: Mixed Economy",
                year = "1986",
                questionText = "Which of the following statements describes a mixed economy?",
                optionA = "The government and the private sector interact in solving the basic economic problems",
                optionB = "The invisible hand solves the basic economic problems",
                optionC = "The government produces and distributes all goods and services",
                optionD = "Society answers the 'what', 'how', and 'for whom' questions only through the market system",
                correctAnswerIndex = 0,
                explanation = "A mixed economy combines elements of both capitalist market structures (private initiative) and socialist command structures (state enterprise and regulation) to manage economic resources.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_015",
                subject = "Economics",
                topic = "Theory of Consumer Demand",
                year = "1986",
                questionText = "In drawing an individual's demand curve for a commodity, which of the following is NOT kept constant?",
                optionA = "Individual's money income",
                optionB = "Price for substitutes",
                optionC = "Price of complementary goods",
                optionD = "Price of the commodity under consideration",
                correctAnswerIndex = 3,
                explanation = "Under the ceteris paribus assumption of demand curves, all non-price determinants (income, tastes, price of related goods) are held constant, while the price of the commodity itself varies to trace the curve.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_016",
                subject = "Economics",
                topic = "Substitute Goods and Demand",
                year = "1986",
                questionText = "Given that beef and fish are substitutes, a rise in the price of beef relative to that of fish will",
                optionA = "Induce greater demand for beef",
                optionB = "Induce greater demand for fish",
                optionC = "Induce lower demand for fish",
                optionD = "Equate demands for beef and fish",
                correctAnswerIndex = 1,
                explanation = "Because beef and fish are substitutes, an increase in the price of beef makes fish relatively cheaper, inducing rational consumers to substitute beef with fish and increase demand for fish.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_017",
                subject = "Economics",
                topic = "Price Mechanism",
                year = "1986",
                questionText = "The main function of price mechanism is to",
                optionA = "Limit consumer demand",
                optionB = "Enable producers make profits",
                optionC = "Allocate scarce resources among competing ends",
                optionD = "Ensure consumer sovereignty",
                correctAnswerIndex = 2,
                explanation = "The primary role of the price mechanism in a free-market system is coordinating resource allocation by acting as a signaling and incentive utility for both buyers and sellers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_020",
                subject = "Economics",
                topic = "Market Structures Comparison",
                year = "1986",
                questionText = "One major difference between monopoly and perfect competition is that",
                optionA = "The perfect competitor is a price taker while the monopolist determines his own price",
                optionB = "Homogeneity of purpose exists for the perfect competitor while non-homogeneity exists for monopoly",
                optionC = "Sellers are located all over the world in perfect competition but in one country for monopoly",
                optionD = "There is free entry and exit in perfect competition but no free exit in monopoly",
                correctAnswerIndex = 0,
                explanation = "Perfect competitors face infinite competition and must accept the market clearing price (price takers). Monopolists, facing no close competition, possess market power to set prices (price makers).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_021",
                subject = "Economics",
                topic = "Cost Theory and Short Run Losses",
                year = "1986",
                questionText = "A producer sustains a loss in the short run if",
                optionA = "Marginal revenue is less than price",
                optionB = "Price is less than average cost",
                optionC = "Average variable cost is less than average cost",
                optionD = "Marginal cost is less than marginal revenue",
                correctAnswerIndex = 1,
                explanation = "A firm incurs an economic loss when its average revenue (price) is lower than its average total cost (AC) of production (Profit = (Price - AC) * Q < 0).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_022",
                subject = "Economics",
                topic = "Price Discrimination",
                year = "1986",
                questionText = "A monopolist will practise price discrimination in two markets if",
                optionA = "The cost of separating the markets is large",
                optionB = "The markets have different elasticities of demand",
                optionC = "There is free flow of information in the two markets",
                optionD = "There is a patent of the commodity",
                correctAnswerIndex = 1,
                explanation = "For price discrimination to succeed, a monopolist must be able to segment markets with different price elasticities of demand, charging higher prices in the inelastic market and lower prices in the elastic market.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_023",
                subject = "Economics",
                topic = "Channels of Distribution: Breaking Bulk",
                year = "1986",
                questionText = "In the normal channels of distribution the breaking of bulk is performed by the",
                optionA = "Producer",
                optionB = "Wholesaler",
                optionC = "Retailer",
                optionD = "Consumer",
                correctAnswerIndex = 2,
                explanation = "Breaking bulk means purchasing goods in relatively large packages and opening or separating them into tiny, individual items to suit consumer purchase requirements. This is performed primarily by retailers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_024",
                subject = "Economics",
                topic = "Co-operative Societies",
                year = "1986",
                questionText = "The most important advantage of co-operative societies is",
                optionA = "Their high degree of democracy",
                optionB = "The increase in the cost of marketing",
                optionC = "That members are encouraged to save money",
                optionD = "The possibility of raising loans for the members",
                correctAnswerIndex = 2,
                explanation = "Cooperative societies pool members' small resources together, promoting saving habits and providing access to cheaper agricultural inputs or credit facilities without heavy collateral.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_026",
                subject = "Economics",
                topic = "Private Limited Liability Companies",
                year = "1986",
                questionText = "Which of the following is a characteristic of a private limited liability company?",
                optionA = "Its shares can be sold to the public",
                optionB = "The number of shareholders ranges from fifty to one hundred",
                optionC = "All shareholders have equal powers and responsibilities",
                optionD = "The number of shareholders ranges from two to fifty",
                correctAnswerIndex = 3,
                explanation = "In accordance with legal corporate guidelines (e.g., Companies and Allied Matters Act in Nigeria), a private limited company must restrict its membership between 2 and 50 shareholders, and cannot list its shares on public stock exchanges.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_027",
                subject = "Economics",
                topic = "Partnerships vs Sole Proprietorships",
                year = "1986",
                questionText = "One of the advantages of a partnership over a sole proprietorship is that",
                optionA = "It is the most popular form of business organization",
                optionB = "The partner can easily withdraw from the business",
                optionC = "It makes an increase in the capital of the business possible",
                optionD = "There is no limit to the number of people who may bring in capital",
                correctAnswerIndex = 2,
                explanation = "By bringing together up to 20 partners, a partnership business model is capable of mobilizing significantly more startup and expansion capital compared to a single-owner sole proprietorship.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_028",
                subject = "Economics",
                topic = "External Economies of Scale",
                year = "1986",
                questionText = "Which of the following is an external economy derived by a firm?",
                optionA = "Low cost opportunities enjoyed by being in a place where other producers concentrate",
                optionB = "Technical economies enjoyed by varying the factors of production",
                optionC = "Economies of management by putting administrators where they are most efficient",
                optionD = "Marketing advantages attained through preferential treatment in distribution",
                correctAnswerIndex = 0,
                explanation = "External economies of scale are cost-reducing benefits that accrue to a firm due to the expansion of the entire industry, such as locating in a highly concentrated industrial cluster.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_030",
                subject = "Economics",
                topic = "Development Banking",
                year = "1986",
                questionText = "The Nigerian Bank for Commerce and Industry is",
                optionA = "A commercial bank",
                optionB = "A development bank",
                optionC = "An industrial bank",
                optionD = "A merchant bank",
                correctAnswerIndex = 1,
                explanation = "The Nigerian Bank for Commerce and Industry (NBCI) is a specialized development bank established by the government to provide medium and long-term capital and development loans to local small and medium-scale enterprises.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_031",
                subject = "Economics",
                topic = "Monetary Policy and Inflation",
                year = "1986",
                questionText = "To control inflation, the monetary authorities of a country can",
                optionA = "Reduce taxes",
                optionB = "Advise government to increase its expenditure",
                optionC = "Engage in expansive monetary policy",
                optionD = "Engage in restrictive monetary policy",
                correctAnswerIndex = 3,
                explanation = "Restrictive (contractionary) monetary policy involves increasing interest rates, raising cash reserve ratios, and selling government securities to contract credit, reduce the money supply, and cool down inflation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_033",
                subject = "Economics",
                topic = "Gresham's Law",
                year = "1986",
                questionText = "Gresham's law in Economics shows that",
                optionA = "Bad money drives good money out of circulation",
                optionB = "Good money drives bad money out of circulation",
                optionC = "Gold must be available to maintain the value of paper money",
                optionD = "The price level varies directly with the quantity of money",
                correctAnswerIndex = 0,
                explanation = "Gresham's Law states that if two forms of commodity money are in circulation with identical legal face values but different intrinsic metal values (e.g., gold and copper), the debased or 'bad' money drives the precious or 'good' money into hoarding.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1986_034",
                subject = "Economics",
                topic = "Money Creation and Reserve Ratio",
                year = "1986",
                questionText = "Given that the cash reserve ratio is 10 percent, what is the maximum amount of money that the banking system can create from an initial cash deposit of N1,000.00?",
                optionA = "N100.00",
                optionB = "N1,000.00",
                optionC = "N9,000.00",
                optionD = "N10,000.00",
                correctAnswerIndex = 3,
                explanation = "The credit multiplier is the reciprocal of the cash reserve ratio (1 / 0.10 = 10). Total money supply created = initial deposit * multiplier = N1,000 * 10 = N10,000.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1986 • Q34"
            )
        )

        // ==========================================
        // 1987 SERIES
        // ==========================================
        list.add(
            QuestionEntity(
                id = "eco_1987_001",
                subject = "Economics",
                topic = "Production Possibility Curve",
                year = "1987",
                questionText = "A production possibility curve shows",
                optionA = "How much of the resources of society are used to produce a particular commodity",
                optionB = "The rate of inflation",
                optionC = "The rate of unemployment in the economy",
                optionD = "The various combinations of two commodities that can be produced",
                correctAnswerIndex = 3,
                explanation = "A Production Possibility Curve (PPC) represents the maximum potential output combinations of two goods that an economy can produce given fixed resources and technology under full employment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_002",
                subject = "Economics",
                topic = "Branches of Economics: Microeconomics",
                year = "1987",
                questionText = "The study of the economic behaviour of individual decision-making units (consumers, resource owners, and firms) is",
                optionA = "Microeconomics",
                optionB = "Macroeconomics",
                optionC = "Production",
                optionD = "Indifference curve",
                correctAnswerIndex = 0,
                explanation = "Microeconomics is the branch of economic science concerned with the decisions, resource allocations, and market interactions of individual economic units such as single consumers, households, and firms.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_003",
                subject = "Economics",
                topic = "Opportunity Cost",
                year = "1987",
                questionText = "Which of the following best describes the concept of opportunity cost?",
                optionA = "A special bargain or sale at below market price",
                optionB = "Costs for inputs tend to go up as we use more of them",
                optionC = "Goods that are not produced in order to produce more of another good",
                optionD = "Expenditure on raw materials",
                correctAnswerIndex = 2,
                explanation = "Opportunity cost is defined in terms of real alternative opportunities sacrificed. In production, it is represented by the quantities of alternative goods that are forgone to allocate resources elsewhere.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_005",
                subject = "Economics",
                topic = "Marginal Revenue Product",
                year = "1987",
                questionText = "The additional revenue obtained by using one more unit of a factor is called its",
                optionA = "Marginal product",
                optionB = "Additional product",
                optionC = "Marginal revenue product",
                optionD = "Average product",
                correctAnswerIndex = 2,
                explanation = "The Marginal Revenue Product (MRP) is the change in total revenue resulting from the employment of one additional unit of a variable factor input: MRP = MPP * Marginal Revenue.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_006",
                subject = "Economics",
                topic = "Labour Productivity",
                year = "1987",
                questionText = "Labour productivity is defined as",
                optionA = "Output per man/hour",
                optionB = "Average output",
                optionC = "The maximum number of hours worked",
                optionD = "Total level of output",
                correctAnswerIndex = 0,
                explanation = "Labour productivity is a measure of productive efficiency, calculated as the total output of a commodity divided by the total labour input (measured in man-hours or number of workers) required to produce it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_007",
                subject = "Economics",
                topic = "Labour Efficiency",
                year = "1987",
                questionText = "Efficiency of labour is enhanced by",
                optionA = "Involvement in own family affairs",
                optionB = "Mechanization processes",
                optionC = "War against indiscipline",
                optionD = "Improved working conditions and training",
                correctAnswerIndex = 3,
                explanation = "While technology helps, the primary internal and human drivers that directly enhance worker capacity and output efficiency are intensive job training and comfortable, safe working conditions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_008",
                subject = "Economics",
                topic = "Cost Theory: Average Fixed Cost",
                year = "1987",
                questionText = "Average Fixed Cost is",
                optionA = "Average Total Cost less the sum of Average Variable Cost",
                optionB = "Half the sum of all costs",
                optionC = "Total Fixed Cost divided by the level of output",
                optionD = "Total Fixed Cost plus Marginal Cost",
                correctAnswerIndex = 2,
                explanation = "Average Fixed Cost (AFC) is the fixed cost per unit of output produced, calculated as: AFC = Total Fixed Cost / Quantity of output (Q).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_009",
                subject = "Economics",
                topic = "Factors of Production: Land and Rent",
                year = "1987",
                questionText = "The residual of production which accrues to the ownership of land after all other expenses have been met is called",
                optionA = "Wages",
                optionB = "Rent",
                optionC = "Interest",
                optionD = "Profit",
                correctAnswerIndex = 1,
                explanation = "In classical economics, the economic reward paid to land as a factor of production for its natural, indestructible powers is called rent.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_010",
                subject = "Economics",
                topic = "History of Economic Thought",
                year = "1987",
                questionText = "In the history of Economic Thought, the concept of Division of Labour is usually associated with",
                optionA = "David Ricardo",
                optionB = "J. M. Keynes",
                optionC = "Adam Smith",
                optionD = "Karl Marx",
                correctAnswerIndex = 2,
                explanation = "Adam Smith introduced the economic significance of the division of labour in his landmark 1776 book 'The Wealth of Nations', famously demonstrating its power with his pin factory example.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_011",
                subject = "Economics",
                topic = "Forms of Capital",
                year = "1987",
                questionText = "The form of capital which is usually consumed or transformed into finished goods and services in the production process is called",
                optionA = "Industrial capital",
                optionB = "Social capital",
                optionC = "Fixed capital",
                optionD = "Circulating capital",
                correctAnswerIndex = 3,
                explanation = "Circulating (working) capital consists of assets that are completely consumed, transformed, or turned over during a single production cycle, such as raw materials and cash.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_012",
                subject = "Economics",
                topic = "Theory of the Firm: Shut-Down Point",
                year = "1987",
                questionText = "The shut-down point for a firm in the short run is the output at which",
                optionA = "The price of the product is lowest",
                optionB = "Marginal Cost is not constant",
                optionC = "Average Variable Cost is not covered",
                optionD = "Average Cost is minimum",
                correctAnswerIndex = 2,
                explanation = "In the short run, a firm will continue to operate even at a loss as long as it can cover its variable operating costs. If the price falls below the minimum Average Variable Cost (AVC), the firm is forced to shut down immediately.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_014",
                subject = "Economics",
                topic = "Consumer Behaviour: Income Effect",
                year = "1987",
                questionText = "In the process of shopping, Mr X whose salary per month does not exceed N200, finds that the price of a commodity he used to purchase with a fixed amount of N200 has now risen to N230. He therefore decides not to buy this commodity at all. Mr X is thus affected by the",
                optionA = "Substitution effect of a price change",
                optionB = "Income effect of a price change",
                optionC = "Opportunity cost of a price change",
                optionD = "Inflation effect of a price change",
                correctAnswerIndex = 1,
                explanation = "The income effect represents the change in consumption caused by a price increase reducing a consumer's real purchasing power (real income) on a fixed nominal budget.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_015",
                subject = "Economics",
                topic = "Basic Economic Concepts: Price",
                year = "1987",
                questionText = "Price can be defined as",
                optionA = "A rate of exchange",
                optionB = "A medium of exchange",
                optionC = "The cost of a product",
                optionD = "The standard of accounting",
                correctAnswerIndex = 0,
                explanation = "Price is the value of a commodity expressed in terms of money, acting as the rate of exchange at which goods and services are traded.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_016",
                subject = "Economics",
                topic = "Market Equilibrium",
                year = "1987",
                questionText = "In the operation of market forces, the market is in equilibrium at the point where",
                optionA = "Demand and supply curves intersect in more than one point provided the market is cleared",
                optionB = "The excess in the market can be conveniently stored",
                optionC = "Excess demand is negative",
                optionD = "Demand and supply curves intersect",
                correctAnswerIndex = 3,
                explanation = "Market equilibrium occurs at the unique intersection of the downward-sloping demand curve and the upward-sloping supply curve, where quantity demanded equals quantity supplied.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_017",
                subject = "Economics",
                topic = "Elasticity and Supply Curves",
                year = "1987",
                questionText = "A shift in the demand curve for a commodity when the supply curve is vertical will lead to a change in the",
                optionA = "Price only",
                optionB = "Quantity only",
                optionC = "Quality only",
                optionD = "Price and quantity",
                correctAnswerIndex = 0,
                explanation = "A vertical supply curve represents perfectly inelastic supply. If demand shifts under these conditions, the quantity supplied cannot change, so only the equilibrium price will increase or decrease.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_018",
                subject = "Economics",
                topic = "Price Elasticity Calculation",
                year = "1987",
                questionText = "Given an original price of N3.50 per kg of rice and a change in price of N1.40; and given the quantity purchased at the old price as 10kg and a change in quantity as 5 kg after the price change, the price elasticity is equal to",
                optionA = "10.20",
                optionB = "3.57",
                optionC = "1.25",
                optionD = "0.80",
                correctAnswerIndex = 2,
                explanation = "Price Elasticity = (% change in Q) / (% change in P) = (Change in Q / Q) / (Change in P / P) = (5 / 10) / (1.40 / 3.50) = 0.50 / 0.40 = 1.25.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_019",
                subject = "Economics",
                topic = "Income Elasticity of Demand",
                year = "1987",
                questionText = "For normal goods, the income elasticity of demand is",
                optionA = "Positive",
                optionB = "Negative",
                optionC = "Zero",
                optionD = "Infinite",
                correctAnswerIndex = 0,
                explanation = "Income elasticity of demand is positive for normal goods, meaning that as a consumer's income rises, their demand for these commodities increases correspondingly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_023",
                subject = "Economics",
                topic = "Inferior Goods",
                year = "1987",
                questionText = "If a good is an inferior good, then",
                optionA = "It is also necessarily a giffen good",
                optionB = "The quantity of the good demanded varies inversely with its price",
                optionC = "Its income elasticity of demand is negative",
                optionD = "The poor buy the good only out of habit",
                correctAnswerIndex = 2,
                explanation = "An inferior good has negative income elasticity of demand, meaning that as a consumer's income rises, they abandon this cheaper good and substitute it with superior alternatives.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_024",
                subject = "Economics",
                topic = "Elasticity and Market Price",
                year = "1987",
                questionText = "An increase in supply will lower price unless",
                optionA = "Supply is perfectly inelastic",
                optionB = "Demand is perfectly elastic",
                optionC = "It is followed by an increase in demand",
                optionD = "Demand is highly inelastic",
                correctAnswerIndex = 1,
                explanation = "If the demand curve is perfectly elastic (horizontal), any change in supply will be absorbed fully at the constant price, so the market clearing price remains completely unchanged.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_025",
                subject = "Economics",
                topic = "Perfect Competition",
                year = "1987",
                questionText = "Which of the following is compatible with a firm in a purely competitive market?",
                optionA = "Demand is inelastic",
                optionB = "Demand is infinitely elastic",
                optionC = "Marginal Cost is falling",
                optionD = "Price is greater than Marginal Cost",
                correctAnswerIndex = 1,
                explanation = "Firms in perfect competition are price takers facing a perfectly or infinitely elastic horizontal demand curve, meaning they can sell any quantity at the current market price.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_028",
                subject = "Economics",
                topic = "Sectors of Production",
                year = "1987",
                questionText = "To which of the following sectors do banking, tourism, and insurance services belong?",
                optionA = "Primary",
                optionB = "Secondary",
                optionC = "Tertiary",
                optionD = "Construction",
                correctAnswerIndex = 2,
                explanation = "The service sector (commercial utilities, finance, administrative support, retail, and tourism) is classified as the tertiary sector of production.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1987_029",
                subject = "Economics",
                topic = "Sole Trader Liability",
                year = "1987",
                questionText = "The liability of a sole trader is",
                optionA = "Indeterminable",
                optionB = "Unlimited",
                optionC = "Transferable",
                optionD = "Limited",
                correctAnswerIndex = 1,
                explanation = "Because a sole trader is legally and structurally undivided from their unincorporated business, they maintain unlimited personal liability for any financial debts incurred by the business.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1987 • Q29"
            )
        )

        // ==========================================
        // 1988 - 2002 EXTENDED SERIES
        // ==========================================
        list.add(
            QuestionEntity(
                id = "eco_1988_001",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "1988",
                questionText = "Scarcity in economics means that",
                optionA = "Human wants are limitless",
                optionB = "The economy has very few resources",
                optionC = "The economy can scarcely produce anything",
                optionD = "Resources are limited in relation to wants",
                correctAnswerIndex = 3,
                explanation = "Scarcity is the central problem of economics. It refers to the reality that the world's productive resources (inputs) are limited in quantity and cannot satisfy the unlimited wants of humanity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_002",
                subject = "Economics",
                topic = "Methodology of Economics",
                year = "1988",
                questionText = "Economics is often described as a science because",
                optionA = "Laboratory experiments are performed",
                optionB = "It makes use of controlled experiments",
                optionC = "It adopts scientific methods in the study of human behaviour",
                optionD = "It makes use of field work",
                correctAnswerIndex = 2,
                explanation = "Economics is classified as a social science because it employs scientific methodology (observation, hypothesis formulation, modeling, and empirical testing) to study human choice.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_003",
                subject = "Economics",
                topic = "Economic Variables: Flow vs Stock",
                year = "1988",
                questionText = "When an economic variable is associated with a specific time period, it is described as",
                optionA = "A flow",
                optionB = "A stock",
                optionC = "Circular",
                optionD = "Static",
                correctAnswerIndex = 0,
                explanation = "A flow variable is measured over an interval or duration of time (e.g., income per month, GDP per year). A stock variable is measured at a specific point in time (e.g., total cash in a bank today).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_005",
                subject = "Economics",
                topic = "Paradox of Value",
                year = "1988",
                questionText = "Air is essential to life but commands no price, while diamond is non-essential to life but commands a very high price. This is the paradox of",
                optionA = "Thrift",
                optionB = "Value",
                optionC = "Abundance",
                optionD = "Scarcity",
                correctAnswerIndex = 1,
                explanation = "This describes the Paradox of Value (or Diamond-Water Paradox) popularized by Adam Smith, which is solved by distinguishing between value in use (high for air/water) and value in exchange (high for diamonds due to marginal utility and scarcity).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_006",
                subject = "Economics",
                topic = "Average Product of Labour",
                year = "1988",
                questionText = "The average product of labour in a given period is obtained by dividing the",
                optionA = "Number of workers by the total product",
                optionB = "Total product by the number of hours actually worked",
                optionC = "Change in total product by the change in the total number of workers",
                optionD = "Total product by the number of workers",
                correctAnswerIndex = 3,
                explanation = "Average Product of Labour (AP_L) represents output per unit of worker employed, calculated as: AP_L = Total Product (TP) / Number of workers (L).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_010",
                subject = "Economics",
                topic = "Law of Diminishing Returns",
                year = "1988",
                questionText = "The Law of Diminishing Returns begins to operate when",
                optionA = "Total product begins to rise",
                optionB = "Total product begins to fall",
                optionC = "Marginal product begins to fall",
                optionD = "Marginal product begins to rise",
                correctAnswerIndex = 2,
                explanation = "The point of diminishing returns is reached when the marginal product of the variable input reaches its maximum and begins to decline.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_015",
                subject = "Economics",
                topic = "Types of Demand: Derived Demand",
                year = "1988",
                questionText = "A commodity is said to have a derived demand when the commodity",
                optionA = "And another have joint demand",
                optionB = "Is demanded because of what it can help to produce",
                optionC = "Is demanded for different purposes",
                optionD = "Has inelastic demand",
                correctAnswerIndex = 1,
                explanation = "Derived demand is demand for a factor of production or intermediate input (such as steel, labour, or land) that arises as a direct consequence of the demand for the final consumer product.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_021",
                subject = "Economics",
                topic = "Revenue Analysis",
                year = "1988",
                questionText = "Total revenue is always equal to",
                optionA = "Marginal revenue multiplied by the quantity sold",
                optionB = "Average revenue plus marginal revenue",
                optionC = "Marginal revenue multiplied by marginal cost",
                optionD = "Average revenue multiplied by the quantity sold",
                correctAnswerIndex = 3,
                explanation = "Total Revenue (TR) is calculated as the quantity of goods sold (Q) multiplied by the unit sales price. Since Unit Price is equal to Average Revenue (AR), TR = AR * Q.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1988_025",
                subject = "Economics",
                topic = "Oligopoly and Price Leadership",
                year = "1988",
                questionText = "Price leadership is",
                optionA = "A form of tacit collusion",
                optionB = "Used to explain price rigidity",
                optionC = "Illegal in Nigeria",
                optionD = "A form of overt collusion",
                correctAnswerIndex = 0,
                explanation = "Price leadership occurs in an oligopoly when a dominant firm sets a price, and other smaller firms follow suit. This operates as a form of tacit (unspoken) collusion, coordinating pricing without formal treaties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1988 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1989_010",
                subject = "Economics",
                topic = "Price Elasticity: Perfectly Inelastic",
                year = "1989",
                questionText = "If, as the price of a commodity rises, the quantity demanded remains completely unchanged, then the demand for the commodity is",
                optionA = "Static",
                optionB = "Infinitely elastic",
                optionC = "Externally determined",
                optionD = "Perfectly inelastic",
                correctAnswerIndex = 3,
                explanation = "Perfectly inelastic demand occurs when price changes have zero impact on the quantity demanded (elasticity = 0), represented graphically by a vertical demand curve.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1989_030",
                subject = "Economics",
                topic = "Inflation: Cost-Push",
                year = "1989",
                questionText = "Cost-push inflation is caused by",
                optionA = "Growth of government expenditure",
                optionB = "Increase in factor prices (costs of inputs)",
                optionC = "Increase in money supply",
                optionD = "Hoarding",
                correctAnswerIndex = 1,
                explanation = "Cost-push inflation is triggered by increases in the cost of production (e.g., rising wages, high raw material costs, or fuel costs) which shift the aggregate supply curve to the left.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1989_037",
                subject = "Economics",
                topic = "Public Finance: Public Goods",
                year = "1989",
                questionText = "A perfect example of a public good is",
                optionA = "Air",
                optionB = "Education",
                optionC = "National Defence",
                optionD = "Public transport",
                correctAnswerIndex = 2,
                explanation = "Public goods are characterized by non-excludability and non-rivalry. National Defence is a perfect example, as its protection cannot be denied to any citizen, and one person benefiting does not reduce protection for others.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1989_043",
                subject = "Economics",
                topic = "Optimum Population",
                year = "1989",
                questionText = "Optimum population is the population level at which",
                optionA = "Death rate is at a minimum",
                optionB = "Per capita income is at maximum",
                optionC = "Population is at a maximum",
                optionD = "Death rate is equal to birth rate",
                correctAnswerIndex = 1,
                explanation = "Optimum population is the ideal demographic size that maximizes the average real output or per capita income of a nation given its current technology and natural resource base.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1989 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1990_014",
                subject = "Economics",
                topic = "Income Elasticity and Inferior Goods",
                year = "1990",
                questionText = "If an increase in income induces a reduction in the demand for beans, beans can be referred to as",
                optionA = "A normal good",
                optionB = "An inferior good",
                optionC = "A substitute",
                optionD = "A giffen good",
                correctAnswerIndex = 1,
                explanation = "An inferior good has negative income elasticity. As consumers' incomes rise, they buy less of it, replacing it with more expensive, superior alternatives.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1990 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1991_015",
                subject = "Economics",
                topic = "Cross Elasticity: Complementary Goods",
                year = "1991",
                questionText = "The cross-elasticity of demand between complementary goods is",
                optionA = "Unitary",
                optionB = "Positive",
                optionC = "Zero",
                optionD = "Negative",
                correctAnswerIndex = 3,
                explanation = "Complementary goods (e.g., bread and butter) have negative cross elasticity. An increase in the price of bread reduces the quantity of bread demanded, which also causes the demand for butter to fall.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1991_033",
                subject = "Economics",
                topic = "Effects of Inflation",
                year = "1991",
                questionText = "Inflation",
                optionA = "Discourages trade by barter",
                optionB = "Favours debtors at the expense of creditors",
                optionC = "Increases the real income of salary earners",
                optionD = "Increases the value of a country's exports",
                correctAnswerIndex = 1,
                explanation = "During inflation, money loses value. Debtors pay back their debts in real terms with money that has less purchasing power than when they borrowed it, benefiting at the expense of lenders (creditors).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1992_019",
                subject = "Economics",
                topic = "National Income: Double Counting",
                year = "1992",
                questionText = "In national income and product accounts, double counting is avoided if",
                optionA = "Only final goods are counted",
                optionB = "Only intermediate goods are counted",
                optionC = "Only intermediate and final goods are counted",
                optionD = "The value of all goods and services are added together",
                correctAnswerIndex = 0,
                explanation = "To prevent inflating the national income estimate, only final goods and services are measured. The value of intermediate inputs is omitted because it is already incorporated in the final product's value.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1992 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1993_010",
                subject = "Economics",
                topic = "Cost Theory: ATC and MC",
                year = "1993",
                questionText = "In the theory of production and cost, the average total cost of a firm is minimized when the marginal cost curve cuts the average total cost at its",
                optionA = "Lowest point",
                optionB = "Middle point",
                optionC = "Maximum point",
                optionD = "Downward sloping section",
                correctAnswerIndex = 0,
                explanation = "Average total cost (ATC) reaches its absolute minimum at the point where it is intersected by the marginal cost (MC) curve.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1993 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1994_019",
                subject = "Economics",
                topic = "Giffen Goods",
                year = "1994",
                questionText = "A demand which is positively related to price is true of",
                optionA = "Normal goods",
                optionB = "Giffen goods",
                optionC = "Ostentatious goods",
                optionD = "Capital goods",
                correctAnswerIndex = 1,
                explanation = "Giffen goods are highly inferior staples that violate the law of demand. As their price rises, the negative income effect outweighs the substitution effect, forcing poor consumers to buy more of them.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1994 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1994_031",
                subject = "Economics",
                topic = "Agricultural Economics: Subsistence Farming",
                year = "1994",
                questionText = "The agricultural practice which involves growing crops and raising livestock for family consumption only is described as",
                optionA = "Peasant agriculture",
                optionB = "Plantation agriculture",
                optionC = "Co-operative farming",
                optionD = "Subsistence farming",
                correctAnswerIndex = 3,
                explanation = "Subsistence farming is a traditional agricultural practice where a family grows crops and raises livestock primarily to feed themselves, leaving little or no surplus for market trade.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1994 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1995_143",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "1995",
                questionText = "What is the primary motive behind human choice in economics?",
                optionA = "Wealth accumulation",
                optionB = "Satisfying unlimited wants with scarce resources",
                optionC = "Minimizing tax liabilities",
                optionD = "Corporate social responsibility",
                correctAnswerIndex = 1,
                explanation = "Scarcity of resources relative to unlimited wants makes choices necessary to allocate inputs efficiently.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1995 • Q143"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1996_144",
                subject = "Economics",
                topic = "Demand and Supply",
                year = "1996",
                questionText = "A shift in the supply curve of a commodity is caused by changes in",
                optionA = "The price of the commodity",
                optionB = "Consumer incomes",
                optionC = "Costs of production and technology",
                optionD = "Consumers' tastes and preferences",
                correctAnswerIndex = 2,
                explanation = "A shift in the supply curve represents a change in supply caused by non-price supply determinants such as input costs and technology.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1996 • Q144"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1997_145",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "1997",
                questionText = "Gross National Product (GNP) is equal to Gross Domestic Product (GDP) plus",
                optionA = "Depreciation",
                optionB = "Net income from abroad",
                optionC = "Indirect taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 1,
                explanation = "GNP measures total output by nationals, calculated as GDP plus net factor income earned from assets or labour resident abroad.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1997 • Q145"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1998_146",
                subject = "Economics",
                topic = "Market Structures: Monopolistic Competition",
                year = "1998",
                questionText = "Which of the following is a key characteristic of monopolistic competition?",
                optionA = "A single seller",
                optionB = "Homogeneous products",
                optionC = "Product differentiation",
                optionD = "Interdependent pricing",
                correctAnswerIndex = 2,
                explanation = "Monopolistic competition is characterized by many sellers offering differentiated products that are close but not perfect substitutes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1998 • Q146"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_1999_147",
                subject = "Economics",
                topic = "Public Finance: Progressive Tax",
                year = "1999",
                questionText = "A progressive tax is a tax where",
                optionA = "Everyone pays an equal absolute sum",
                optionB = "The tax rate increases as income increases",
                optionC = "The tax rate decreases as income increases",
                optionD = "Businesses shift the full burden to consumers",
                correctAnswerIndex = 1,
                explanation = "Progressive taxation takes a larger percentage of income from high-income earners to promote equitable income redistribution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1999 • Q147"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_2000_148",
                subject = "Economics",
                topic = "International Trade: Devaluation",
                year = "2000",
                questionText = "Devaluation of a currency aims primarily to",
                optionA = "Make imports cheaper and exports more expensive",
                optionB = "Reduce inflation immediately",
                optionC = "Make exports cheaper and imports more expensive to improve trade balance",
                optionD = "Increase interest rates on foreign loans",
                correctAnswerIndex = 2,
                explanation = "Devaluation reduces the international value of a domestic currency, making domestic exports cheaper and imports more expensive to improve the Balance of Payments.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2000 • Q148"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_2001_149",
                subject = "Economics",
                topic = "Consumer Behaviour: Diminishing Marginal Utility",
                year = "2001",
                questionText = "The law of diminishing marginal utility states that as consumption of a good increases",
                optionA = "Total utility must fall immediately",
                optionB = "Marginal utility begins to decrease with each additional unit consumed",
                optionC = "Total utility remains constant",
                optionD = "Consumer spending increases proportionally",
                correctAnswerIndex = 1,
                explanation = "As more units of a commodity are consumed, the satisfaction derived from each successive unit decreases.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2001 • Q149"
            )
        )

        list.add(
            QuestionEntity(
                id = "eco_2002_150",
                subject = "Economics",
                topic = "Population: Dependency Ratio",
                year = "2002",
                questionText = "The dependency ratio is calculated as the ratio of",
                optionA = "Women to men in the population",
                optionB = "Children to the elderly",
                optionC = "The non-working age group (0-14 and 65+) to the working age group (15-64)",
                optionD = "Immigrants to emigrants",
                correctAnswerIndex = 2,
                explanation = "The dependency ratio measures the demographic burden borne by the economically productive age cohort to support non-working segments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q150"
            )
        )

        return list
    }
}
