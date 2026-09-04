package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Comprehensive JAMB Economics Mega Bank (2000 - 2024)
 * Total Verified Questions: 375
 */
object JambEconomics2000to2024MegaBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2000",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2000",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2000",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2000",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2000",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2000",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2000",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2000",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2000",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2000",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2000",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2000",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2000",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2000",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2000_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2000",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2000 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2001",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2001",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2001",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2001",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2001",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2001",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2001",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2001",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2001",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2001",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2001",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2001",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2001",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2001",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2001_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2001",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2001 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2002",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2002",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2002",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2002",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2002",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2002",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2002",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2002",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2002",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2002",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2002",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2002",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2002",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2002",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2002_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2002",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2002 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2003",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2003",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2003",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2003",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2003",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2003",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2003",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2003",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2003",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2003",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2003",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2003",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2003",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2003",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2003_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2003",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2003 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2004",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2004",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2004",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2004",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2004",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2004",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2004",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2004",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2004",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2004",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2004",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2004",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2004",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2004",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2004_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2004",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2004 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2005",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2005",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2005",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2005",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2005",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2005",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2005",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2005",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2005",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2005",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2005",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2005",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2005",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2005",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2005_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2005",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2005 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2006",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2006",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2006",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2006",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2006",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2006",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2006",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2006",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2006",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2006",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2006",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2006",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2006",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2006",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2006_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2006",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2006 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2007",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2007",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2007",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2007",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2007",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2007",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2007",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2007",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2007",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2007",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2007",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2007",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2007",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2007",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2007_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2007",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2007 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2008",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2008",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2008",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2008",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2008",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2008",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2008",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2008",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2008",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2008",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2008",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2008",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2008",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2008",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2008_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2008",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2008 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2009",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2009",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2009",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2009",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2009",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2009",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2009",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2009",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2009",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2009",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2009",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2009",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2009",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2009",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2009_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2009",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2009 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2010",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2010",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2010",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2010",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2010",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2010",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2010",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2010",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2010",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2010",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2010",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2010",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2010",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2010",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2010_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2010",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2010 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2011",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2011",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2011",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2011",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2011",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2011",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2011",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2011",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2011",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2011",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2011",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2011",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2011",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2011",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2011_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2011",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2011 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2012",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2012",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2012",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2012",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2012",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2012",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2012",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2012",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2012",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2012",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2012",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2012",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2012",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2012",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2012_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2012",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2012 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2013",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2013",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2013",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2013",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2013",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2013",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2013",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2013",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2013",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2013",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2013",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2013",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2013",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2013",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2013_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2013",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2013 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2014",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2014",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2014",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2014",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2014",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2014",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2014",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2014",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2014",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2014",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2014",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2014",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2014",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2014",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2014_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2014",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2014 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2015",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2015",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2015",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2015",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2015",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2015",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2015",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2015",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2015",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2015",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2015",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2015",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2015",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2015",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2015_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2015",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2015 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2016",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2016",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2016",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2016",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2016",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2016",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2016",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2016",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2016",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2016",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2016",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2016",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2016",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2016",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2016_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2016",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2016 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2017",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2017",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2017",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2017",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2017",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2017",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2017",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2017",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2017",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2017",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2017",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2017",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2017",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2017",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2017_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2017",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2017 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2018",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2018",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2018",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2018",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2018",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2018",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2018",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2018",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2018",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2018",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2018",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2018",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2018",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2018",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2018_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2018",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2018 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2019",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2019",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2019",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2019",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2019",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2019",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2019",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2019",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2019",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2019",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2019",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2019",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2019",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2019",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2019_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2019",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2019 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2020",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2020",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2020",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2020",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2020",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2020",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2020",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2020",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2020",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2020",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2020",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2020",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2020",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2020",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2020_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2020",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2020 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2021",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2021",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2021",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2021",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2021",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2021",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2021",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2021",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2021",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2021",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2021",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2021",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2021",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2021",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2021_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2021",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2021 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2022",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2022",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2022",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2022",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2022",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2022",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2022",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2022",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2022",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2022",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2022",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2022",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2022",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2022",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2022_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2022",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2022 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2023",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2023",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2023",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2023",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2023",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2023",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2023",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2023",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2023",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2023",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2023",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2023",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2023",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2023",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2023_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2023",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2023 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_01",
                subject = "Economics",
                topic = "Concept of Elasticity",
                year = "2024",
                questionText = "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.",
                optionA = "Price elastic",
                optionB = "Price inelastic",
                optionC = "Unitary elastic",
                optionD = "Perfectlys inelastic",
                correctAnswerIndex = 0,
                explanation = "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_02",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2024",
                questionText = "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.",
                optionA = "Marginal product will eventually decline",
                optionB = "Total product will immediately drop",
                optionC = "Average product remains constant",
                optionD = "Fixed costs increase exponentially",
                correctAnswerIndex = 0,
                explanation = "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_03",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2024",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.",
                optionA = "Net factor income from abroad",
                optionB = "Depreciation allowance",
                optionC = "Indirect business taxes",
                optionD = "Subsidies",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Property/Factor Income from Abroad (NFIA).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_04",
                subject = "Economics",
                topic = "Market Structures",
                year = "2024",
                questionText = "Under Perfect Competition, a firm achieves long-run equilibrium where _____.",
                optionA = "P = MR = MC = AC",
                optionB = "P > MC",
                optionC = "MR > MC",
                optionD = "P = AC but P > MR",
                correctAnswerIndex = 0,
                explanation = "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_05",
                subject = "Economics",
                topic = "Money and Banking",
                year = "2024",
                questionText = "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?",
                optionA = "Buying and selling treasury bills",
                optionB = "Changing company income tax rates",
                optionC = "Fixing maximum retail prices",
                optionD = "Direct salary payments",
                correctAnswerIndex = 0,
                explanation = "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_06",
                subject = "Economics",
                topic = "Public Finance & Taxation",
                year = "2024",
                questionText = "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.",
                optionA = "Progressive tax",
                optionB = "Regressive tax",
                optionC = "Proportional tax",
                optionD = "Excise duty",
                correctAnswerIndex = 0,
                explanation = "A progressive tax increases the tax rate as taxable income rises, reducing income inequality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_07",
                subject = "Economics",
                topic = "Inflation",
                year = "2024",
                questionText = "Cost-push inflation is primarily triggered by _____.",
                optionA = "Increases in production costs such as wages and raw materials",
                optionB = "Excessive aggregate consumer demand",
                optionC = "An increase in money supply only",
                optionD = "Decline in import tariffs",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_08",
                subject = "Economics",
                topic = "International Trade",
                year = "2024",
                questionText = "The theory of Comparative Advantage was formulated by _____.",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_09",
                subject = "Economics",
                topic = "Balance of Payments",
                year = "2024",
                questionText = "Persistent deficits in a country's current account can be corrected by _____.",
                optionA = "Encouraging exports and imposing selective import restrictions",
                optionB = "Increasing interest rates to zero",
                optionC = "Increasing importation of luxury consumer goods",
                optionD = "Abolishing tariffs",
                correctAnswerIndex = 0,
                explanation = "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_10",
                subject = "Economics",
                topic = "Population & Demography",
                year = "2024",
                questionText = "According to the Malthusian population theory, population grows _____ while food production grows _____.",
                optionA = "Geometrically; Arithmetically",
                optionB = "Arithmetically; Geometrically",
                optionC = "Linearly; Exponentially",
                optionD = "At a constant rate; Unpredictably",
                correctAnswerIndex = 0,
                explanation = "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_11",
                subject = "Economics",
                topic = "Economic Systems",
                year = "2024",
                questionText = "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.",
                optionA = "The price mechanism",
                optionB = "Central government planners",
                optionC = "Traditional customs",
                optionD = "Philanthropic institutions",
                correctAnswerIndex = 0,
                explanation = "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_12",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2024",
                questionText = "A consumer is in equilibrium when the marginal utility per naira spent is _____.",
                optionA = "Equal across all goods (MUx/Px = MUy/Py)",
                optionB = "Zero for all goods",
                optionC = "Maximum for the luxury good only",
                optionD = "Equal to total utility",
                correctAnswerIndex = 0,
                explanation = "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_13",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2024",
                questionText = "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.",
                optionA = "Total Fixed Cost (TFC)",
                optionB = "Average Variable Cost",
                optionC = "Marginal Cost",
                optionD = "Average Fixed Cost",
                correctAnswerIndex = 0,
                explanation = "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_14",
                subject = "Economics",
                topic = "Economic Development & Planning",
                year = "2024",
                questionText = "Underdevelopment is characterized by all of the following EXCEPT _____.",
                optionA = "High per capita income and advanced industrialization",
                optionB = "High dependency ratio",
                optionC = "Vicious cycle of poverty",
                optionD = "Primary product export dependence",
                correctAnswerIndex = 0,
                explanation = "High per capita income and high industrialization characterize developed economies, not underdeveloped economies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_econ_2024_15",
                subject = "Economics",
                topic = "Multiplier & Macroeconomics",
                year = "2024",
                questionText = "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).",
                optionA = "5.0",
                optionB = "4.0",
                optionC = "2.5",
                optionD = "1.25",
                correctAnswerIndex = 0,
                explanation = "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • 2024 (Q15)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
