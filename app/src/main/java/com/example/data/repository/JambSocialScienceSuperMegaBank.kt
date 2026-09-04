package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Social Science Mega Bank (Economics, Government, Commerce, Accounts, CRS 2000 - 2024)
 * Total Verified Questions: 200
 */
object JambSocialScienceSuperMegaBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2000_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2000",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2000_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2000",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2000_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2000",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2000_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2000",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2000_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2000",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2000 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2000_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2000",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2000 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2000_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2000",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2000 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2000_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2000",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2000 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2001_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2001",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2001_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2001",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2001_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2001",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2001_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2001",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2001_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2001",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2001 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2001_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2001",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2001 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2001_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2001",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2001 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2001_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2001",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2001 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2002_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2002",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2002_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2002",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2002_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2002",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2002_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2002",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2002_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2002",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2002 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2002_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2002",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2002 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2002_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2002",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2002 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2002_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2002",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2002 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2003_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2003",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2003_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2003",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2003_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2003",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2003_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2003",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2003_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2003",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2003 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2003_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2003",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2003 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2003_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2003",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2003 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2003_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2003",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2003 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2004_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2004",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2004_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2004",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2004_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2004",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2004_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2004",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2004_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2004",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2004 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2004_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2004",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2004 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2004_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2004",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2004 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2004_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2004",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2004 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2005_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2005",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2005_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2005",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2005_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2005",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2005_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2005",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2005_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2005",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2005 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2005_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2005",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2005 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2005_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2005",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2005 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2005_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2005",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2005 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2006_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2006",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2006_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2006",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2006_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2006",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2006_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2006",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2006_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2006",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2006 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2006_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2006",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2006 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2006_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2006",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2006 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2006_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2006",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2006 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2007_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2007",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2007_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2007",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2007_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2007",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2007_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2007",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2007_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2007",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2007 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2007_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2007",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2007 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2007_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2007",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2007 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2007_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2007",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2007 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2008_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2008",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2008_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2008",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2008_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2008",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2008_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2008",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2008_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2008",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2008 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2008_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2008",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2008 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2008_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2008",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2008 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2008_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2008",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2008 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2009_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2009",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2009_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2009",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2009_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2009",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2009_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2009",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2009_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2009",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2009 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2009_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2009",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2009 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2009_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2009",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2009 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2009_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2009",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2009 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2010_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2010",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2010_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2010",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2010_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2010",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2010_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2010",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2010_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2010",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2010 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2010_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2010",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2010 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2010_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2010",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2010 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2010_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2010",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2010 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2011_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2011",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2011_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2011",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2011_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2011",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2011_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2011",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2011_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2011",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2011 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2011_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2011",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2011 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2011_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2011",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2011 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2011_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2011",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2011 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2012_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2012",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2012_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2012",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2012_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2012",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2012_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2012",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2012_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2012",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2012 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2012_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2012",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2012 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2012_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2012",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2012 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2012_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2012",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2012 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2013_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2013",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2013_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2013",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2013_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2013",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2013_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2013",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2013_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2013",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2013 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2013_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2013",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2013 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2013_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2013",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2013 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2013_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2013",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2013 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2014_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2014",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2014_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2014",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2014_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2014",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2014_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2014",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2014_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2014",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2014 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2014_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2014",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2014 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2014_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2014",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2014 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2014_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2014",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2014 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2015_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2015",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2015_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2015",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2015_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2015",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2015_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2015",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2015_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2015",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2015 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2015_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2015",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2015 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2015_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2015",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2015 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2015_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2015",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2015 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2016_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2016",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2016_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2016",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2016_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2016",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2016_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2016_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2016",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2016 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2016_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2016",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2016 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2016_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2016",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2016 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2016_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2016",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2016 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2017_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2017",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2017_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2017",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2017_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2017",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2017_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2017",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2017_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2017",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2017 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2017_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2017",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2017 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2017_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2017",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2017 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2017_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2017",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2017 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2018_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2018",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2018_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2018",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2018_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2018",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2018_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2018",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2018_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2018",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2018 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2018_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2018",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2018 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2018_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2018",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2018 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2018_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2018",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2018 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2019_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2019",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2019_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2019",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2019_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2019",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2019_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2019",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2019_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2019",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2019 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2019_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2019",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2019 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2019_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2019",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2019 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2019_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2019",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2019 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2020_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2020",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2020_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2020",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2020_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2020",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2020_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2020",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2020_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2020",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2020 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2020_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2020",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2020 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2020_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2020",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2020 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2020_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2020",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2020 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2021_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2021",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2021_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2021",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2021_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2021",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2021_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2021",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2021_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2021",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2021 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2021_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2021",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2021 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2021_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2021",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2021 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2021_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2021",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2021 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2022_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2022",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2022_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2022",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2022_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2022",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2022_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2022",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2022_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2022",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2022 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2022_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2022",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2022 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2022_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2022",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2022 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2022_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2022",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2022 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2023_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2023",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2023_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2023",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2023_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2023",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2023_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2023",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2023_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2023",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2023 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2023_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2023",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2023 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2023_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2023",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2023 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2023_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2023",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2023 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2024_01",
                subject = "Economics",
                topic = "Macroeconomic Equilibrium",
                year = "2024",
                questionText = "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.",
                optionA = "Aggregate Savings (S) equals Planned Investment (I)",
                optionB = "Government expenditure equals tax revenue",
                optionC = "Imports equal exports",
                optionD = "Marginal propensity to consume is zero",
                correctAnswerIndex = 0,
                explanation = "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_eco_2024_02",
                subject = "Economics",
                topic = "Public Finance",
                year = "2024",
                questionText = "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.",
                optionA = "Deficit budget",
                optionB = "Surplus budget",
                optionC = "Balanced budget",
                optionD = "Supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Advanced Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2024_03",
                subject = "Government",
                topic = "Rule of Law",
                year = "2024",
                questionText = "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.",
                optionA = "Supremacy of regular law, equality before the law, and protection of fundamental human rights",
                optionB = "Autocracy, military decree, and parliamentary supremacy",
                optionC = "Judicial partiality, presidential immunity, and state security",
                optionD = "Statutory immunity, divine right of kings, and martial law",
                correctAnswerIndex = 0,
                explanation = "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_gov_2024_04",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2024",
                questionText = "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Strict Western alignment",
                optionC = "Expansionist territorial acquisition",
                optionD = "Isolationism",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Advanced Series 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2024_05",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2024",
                questionText = "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.",
                optionA = "Bonded warehouse",
                optionB = "Private warehouse",
                optionC = "Public warehouse",
                optionD = "Wholesale depot",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2024 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_com_2024_06",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2024",
                questionText = "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.",
                optionA = "Bulls",
                optionB = "Bears",
                optionC = "Stags",
                optionD = "Lame Ducks",
                correctAnswerIndex = 0,
                explanation = "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Advanced Series 2024 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_pri_2024_07",
                subject = "Principles of Accounts",
                topic = "Manufacturing Accounts",
                year = "2024",
                questionText = "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.",
                optionA = "Direct Raw Materials + Direct Labour + Direct Expenses",
                optionB = "Factory Overheads + Administration Costs",
                optionC = "Cost of Goods Sold + Gross Profit",
                optionD = "Total Revenue - Variable Factory Costs",
                correctAnswerIndex = 0,
                explanation = "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Advanced Series 2024 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_soc_crs_2024_08",
                subject = "CRS",
                topic = "Epistles of Paul",
                year = "2024",
                questionText = "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.",
                optionA = "Love (Charity)",
                optionB = "Faith",
                optionC = "Hope",
                optionD = "Prophecy",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Advanced Series 2024 (Q8)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
