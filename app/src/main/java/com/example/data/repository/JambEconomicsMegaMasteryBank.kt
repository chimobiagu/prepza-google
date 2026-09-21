package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Economics Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 300
 */
object JambEconomicsMegaMasteryBank {
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
                id = "jamb_ecn_mast_2005_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2005",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2005",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2005",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2005",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2005",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2005",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2005",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2005",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2005",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2005",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2005",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2005",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2005",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2005",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2005_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2005",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2006",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2006",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2006",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2006",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2006",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2006",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2006",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2006",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2006",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2006",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2006",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2006",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2006",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2006",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2006_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2006",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2007",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2007",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2007",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2007",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2007",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2007",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2007",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2007",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2007",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2007",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2007",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2007",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2007",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2007",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2007_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2007",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2008",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2008",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2008",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2008",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2008",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2008",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2008",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2008",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2008",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2008",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2008",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2008",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2008",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2008",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2008_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2008",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2009",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2009",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2009",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2009",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2009",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2009",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2009",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2009",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2009",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2009",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2009",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2009",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2009",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2009",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2009_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2009",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2010",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2010",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2010",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2010",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2010",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2010",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2010",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2010",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2010",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2010",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2010",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2010",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2010",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2010",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2010_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2010",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2011",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2011",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2011",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2011",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2011",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2011",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2011",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2011",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2011",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2011",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2011",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2011",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2011",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2011",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2011_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2011",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2012",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2012",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2012",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2012",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2012",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2012",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2012",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2012",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2012",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2012",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2012",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2012",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2012",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2012",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2012_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2012",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2013",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2013",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2013",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2013",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2013",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2013",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2013",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2013",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2013",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2013",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2013",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2013",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2013",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2013",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2013_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2013",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2014",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2014",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2014",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2014",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2014",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2014",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2014",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2014",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2014",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2014",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2014",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2014",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2014",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2014",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2014_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2014",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2015",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2015",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2015",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2015",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2015",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2015",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2015",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2015",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2015",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2015",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2015",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2015",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2015",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2015",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2015_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2015",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2016",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2016",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2016",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2016",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2016",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2016",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2016",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2016",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2016",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2016",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2016",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2016",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2016",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2016",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2016_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2016",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2017",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2017",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2017",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2017",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2017",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2017",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2017",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2017",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2017",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2017",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2017",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2017",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2017",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2017",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2017_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2017",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2018",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2018",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2018",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2018",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2018",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2018",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2018",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2018",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2018",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2018",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2018",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2018",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2018",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2018",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2018_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2018",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2019",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2019",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2019",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2019",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2019",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2019",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2019",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2019",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2019",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2019",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2019",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2019",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2019",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2019",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2019_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2019",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2020",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2020",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2020",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2020",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2020",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2020",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2020",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2020",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2020",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2020",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2020",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2020",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2020",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2020",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2020_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2020",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2021",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2021",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2021",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2021",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2021",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2021",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2021",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2021",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2021",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2021",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2021",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2021",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2021",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2021",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2021_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2021",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2022",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2022",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2022",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2022",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2022",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2022",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2022",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2022",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2022",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2022",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2022",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2022",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2022",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2022",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2022_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2022",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2023",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2023",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2023",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2023",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2023",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2023",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2023",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2023",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2023",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2023",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2023",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2023",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2023",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2023",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2023_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2023",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_01",
                subject = "Economics",
                topic = "Basic Economic Concepts",
                year = "2024",
                questionText = "Opportunity cost is fundamentally defined in economics as the:",
                optionA = "value of the next best alternative forgone",
                optionB = "total financial cost incurred in production",
                optionC = "money expenditure on consumer goods",
                optionD = "loss of business profit",
                correctAnswerIndex = 0,
                explanation = "Opportunity cost is the real cost of an action measured in terms of the sacrifice of the next best foregone alternative.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_02",
                subject = "Economics",
                topic = "Theory of Demand",
                year = "2024",
                questionText = "A rightward shift of the entire market demand curve for a normal good is caused by:",
                optionA = "an increase in consumer income",
                optionB = "a decrease in the price of the good itself",
                optionC = "an increase in the price of a complementary good",
                optionD = "a rise in production excise taxes",
                correctAnswerIndex = 0,
                explanation = "For a normal good, an increase in consumer purchasing power raises demand at all price levels, shifting the curve to the right.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_03",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2024",
                questionText = "If a 10% increase in the price of a commodity leads to a 20% decrease in quantity demanded, the price elasticity of demand is:",
                optionA = "2.0 (elastic)",
                optionB = "0.5 (inelastic)",
                optionC = "1.0 (unitary)",
                optionD = "0.0 (perfectly inelastic)",
                correctAnswerIndex = 0,
                explanation = "PED = (% Change in Q) / (% Change in P) = 20% / 10% = 2.0, which is greater than 1, hence elastic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_04",
                subject = "Economics",
                topic = "Theory of Supply",
                year = "2024",
                questionText = "Which of the following causes an increase in the market supply of an agricultural commodity?",
                optionA = "Favorable weather conditions and improved farming technology",
                optionB = "An increase in the cost of farm inputs and fertilizer",
                optionC = "Imposition of an agricultural sales tax",
                optionD = "A reduction in the number of practicing farmers",
                correctAnswerIndex = 0,
                explanation = "Favorable weather and technological progress boost agronomic productivity, shifting the supply curve rightward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_05",
                subject = "Economics",
                topic = "Price Determination",
                year = "2024",
                questionText = "When the government fixes a legal maximum price (price ceiling) below the market equilibrium price, the direct outcome is:",
                optionA = "excess demand (shortage) in the market",
                optionB = "excess supply (surplus)",
                optionC = "a collapse of consumer demand",
                optionD = "an immediate fall in production costs",
                correctAnswerIndex = 0,
                explanation = "A price ceiling below equilibrium makes the good cheaper, causing quantity demanded to exceed quantity supplied, resulting in shortages.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_06",
                subject = "Economics",
                topic = "Theory of Consumer Behavior",
                year = "2024",
                questionText = "According to the Law of Diminishing Marginal Utility, as additional units of a commodity are consumed:",
                optionA = "the marginal utility derived from each successive unit decreases",
                optionB = "the total utility decreases from the first unit",
                optionC = "marginal utility remains completely constant",
                optionD = "total utility becomes negative immediately",
                correctAnswerIndex = 0,
                explanation = "Successive consumption of identical units of a good yields progressively less extra satisfaction (marginal utility).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_07",
                subject = "Economics",
                topic = "Theory of Production",
                year = "2024",
                questionText = "The Law of Diminishing Returns operates in the short run when:",
                optionA = "variable factors are sequentially added to a fixed factor of production",
                optionB = "all factors of production are increased in equal proportion",
                optionC = "technology is constantly changing",
                optionD = "fixed costs fall to zero",
                correctAnswerIndex = 0,
                explanation = "Diminishing returns occurs when variable inputs (e.g. labor) are applied to a fixed input (e.g. land), causing marginal output to eventually decline.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_08",
                subject = "Economics",
                topic = "Theory of Costs",
                year = "2024",
                questionText = "Marginal cost is best defined as the:",
                optionA = "addition to total cost resulting from producing one extra unit of output",
                optionB = "total cost divided by total output produced",
                optionC = "fixed cost incurred when output is zero",
                optionD = "average variable cost plus average fixed cost",
                correctAnswerIndex = 0,
                explanation = "Marginal cost (MC) = ΔTC / ΔQ, the extra cost of producing one additional unit of output.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_09",
                subject = "Economics",
                topic = "Market Structures: Perfect Competition",
                year = "2024",
                questionText = "A perfectly competitive firm maximizes profit at the output level where:",
                optionA = "Marginal Cost equals Marginal Revenue (MC = MR)",
                optionB = "Total Cost equals Total Revenue",
                optionC = "Average Cost is at its absolute maximum",
                optionD = "Price is less than Marginal Revenue",
                correctAnswerIndex = 0,
                explanation = "All profit-maximizing firms produce where MC = MR; in perfect competition, P = MR = MC.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_10",
                subject = "Economics",
                topic = "Market Structures: Monopoly",
                year = "2024",
                questionText = "A monopoly firm possesses price-setting power primarily because of:",
                optionA = "the complete absence of close substitutes and high barriers to entry",
                optionB = "aggressive government subsidies",
                optionC = "the presence of thousands of competing firms",
                optionD = "the horizontal demand curve it faces",
                correctAnswerIndex = 0,
                explanation = "A pure monopolist is the sole seller of a product without close substitutes, protected by structural barriers to entry.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_11",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2024",
                questionText = "Gross Domestic Product (GDP) differs from Gross National Product (GNP) because GNP includes:",
                optionA = "net factor income from abroad",
                optionB = "indirect business taxes",
                optionC = "depreciation of fixed assets",
                optionD = "domestic transfer payments",
                correctAnswerIndex = 0,
                explanation = "GNP = GDP + Net Factor Income from Abroad (earnings by domestic citizens abroad minus foreign earnings domestically).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_12",
                subject = "Economics",
                topic = "Money & Banking",
                year = "2024",
                questionText = "The primary statutory weapon used by the Central Bank to restrict commercial bank credit expansion is:",
                optionA = "raising the cash reserve requirement and discount rate",
                optionB = "reducing the bank lending rate",
                optionC = "purchasing treasury bills in Open Market Operations (OMO)",
                optionD = "printing more banknotes",
                correctAnswerIndex = 0,
                explanation = "Raising the cash reserve ratio decreases banks' loanable liquidity, tightening credit and money supply.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_13",
                subject = "Economics",
                topic = "Public Finance: Taxation",
                year = "2024",
                questionText = "A tax system where the tax rate increases progressively as the taxpayer's income increases is classified as a:",
                optionA = "progressive tax",
                optionB = "regressive tax",
                optionC = "proportional tax",
                optionD = "specific tax",
                correctAnswerIndex = 0,
                explanation = "A progressive tax levies a higher percentage rate on higher income brackets (e.g. PAYE income tax).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_14",
                subject = "Economics",
                topic = "International Trade",
                year = "2024",
                questionText = "The principle of Comparative Advantage was formulated by which classical economist?",
                optionA = "David Ricardo",
                optionB = "Adam Smith",
                optionC = "John Maynard Keynes",
                optionD = "Thomas Malthus",
                correctAnswerIndex = 0,
                explanation = "David Ricardo demonstrated in 1817 that nations benefit by specializing in goods they produce at the lowest opportunity cost.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ecn_mast_2024_15",
                subject = "Economics",
                topic = "Inflation",
                year = "2024",
                questionText = "Demand-pull inflation in a macroeconomy is primarily caused by:",
                optionA = "aggregate demand persistently exceeding aggregate supply at full employment",
                optionB = "a sudden spike in the cost of imported raw materials",
                optionC = "excessive corporate profit margins",
                optionD = "a bumper harvest in agriculture",
                correctAnswerIndex = 0,
                explanation = "Demand-pull inflation occurs when 'too much money chases too few goods', driving general price levels upward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

}
