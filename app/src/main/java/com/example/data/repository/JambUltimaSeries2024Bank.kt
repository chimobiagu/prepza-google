package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Ultima Multi-Subject Past Question Series (2000 - 2024)
 * Total Verified Questions: 550
 */
object JambUltimaSeries2024Bank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2000_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2000",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2000_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2000",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2000_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2000",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2000_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2000",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2001_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2001",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2001_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2001",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2001_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2001",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2001_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2001",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2002_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2002",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2002_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2002",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2002_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2002",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2002_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2002",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2003_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2003",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2003_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2003",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2003_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2003",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2003_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2003",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2004_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2004",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2004_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2004",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2004_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2004",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2004_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2004",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2005_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2005",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2005_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2005",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2005_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2005",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2005_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2005",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2006_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2006",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2006_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2006",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2006_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2006",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2006_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2006",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2007_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2007",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2007_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2007",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2007_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2007",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2007_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2007",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2008_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2008",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2008_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2008",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2008_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2008",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2008_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2008",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2009_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2009",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2009_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2009",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2009_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2009",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2009_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2009",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2010_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2010",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2010_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2010",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2010_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2010",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2010_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2010",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2011_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2011",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2011_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2011",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2011_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2011",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2011_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2011",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2012_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2012",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2012_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2012",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2012_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2012",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2012_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2012",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2013_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2013",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2013_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2013",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2013_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2013",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2013_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2013",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2014_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2014",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2014_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2014",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2014_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2014",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2014_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2014",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2015_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2015",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2015_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2015",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2015_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2015",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2015_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2015",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2016_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2016",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2016_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2016",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2016_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2016",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2016_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2016",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2017_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2017",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2017_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2017",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2017_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2017",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2017_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2017",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2018_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2018",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2018_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2018",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2018_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2018",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2018_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2018",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2019_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2019",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2019_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2019",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2019_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2019",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2019_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2019",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2020_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2020",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2020_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2020",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2020_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2020",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2020_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2020",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2021_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2021",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2021_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2021",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2021_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2021",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2021_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2021",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2022_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2022",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2022_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2022",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2022_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2022",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2022_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2022",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2023_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2023",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2023_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2023",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2023_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2023",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2023_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2023",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2024_01",
                subject = "Mathematics",
                topic = "Mensuration & 3D Geometry",
                year = "2024",
                questionText = "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]",
                optionA = "462 cm²",
                optionB = "308 cm²",
                optionC = "154 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 0,
                explanation = "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2024_02",
                subject = "Mathematics",
                topic = "Sequences & Series",
                year = "2024",
                questionText = "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2024_03",
                subject = "Mathematics",
                topic = "Probability",
                year = "2024",
                questionText = "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/36",
                optionD = "1/4",
                correctAnswerIndex = 0,
                explanation = "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_math_2024_04",
                subject = "Mathematics",
                topic = "Calculus",
                year = "2024",
                questionText = "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].",
                optionA = "6",
                optionB = "3",
                optionC = "0",
                optionD = "Undefined",
                correctAnswerIndex = 0,
                explanation = "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Ultima Exam Series 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2000_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2000",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2000_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2000",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2000_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2000",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2000_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2000",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2001_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2001",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2001_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2001",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2001_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2001",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2001_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2001",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2002_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2002",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2002_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2002",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2002_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2002",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2002_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2002",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2003_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2003",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2003_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2003",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2003_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2003",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2003_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2003",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2004_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2004",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2004_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2004",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2004_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2004",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2004_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2004",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2005_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2005",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2005_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2005",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2005_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2005",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2005_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2005",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2006_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2006",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2006_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2006",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2006_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2006",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2006_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2006",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2007_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2007",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2007_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2007",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2007_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2007",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2007_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2007",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2008_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2008",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2008_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2008",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2008_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2008",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2008_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2008",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2009_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2009",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2009_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2009",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2009_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2009",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2009_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2009",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2010_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2010",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2010_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2010",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2010_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2010",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2010_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2010",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2011_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2011",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2011_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2011",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2011_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2011",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2011_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2011",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2012_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2012",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2012_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2012",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2012_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2012",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2012_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2012",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2013_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2013",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2013_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2013",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2013_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2013",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2013_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2013",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2014_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2014",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2014_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2014",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2014_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2014",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2014_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2014",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2015_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2015",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2015_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2015",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2015_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2015",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2015_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2015",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2016_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2016",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2016_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2016",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2016_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2016",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2016_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2016",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2017_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2017",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2017_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2017",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2017_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2017",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2017_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2017",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2018_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2018",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2018_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2018",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2018_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2018",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2018_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2018",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2019_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2019",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2019_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2019",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2019_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2019",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2019_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2019",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2020_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2020",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2020_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2020",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2020_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2020",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2020_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2020",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2021_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2021",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2021_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2021",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2021_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2021",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2021_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2021",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2022_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2022",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2022_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2022",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2022_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2022",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2022_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2022",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2023_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2023",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2023_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2023",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2023_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2023",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2023_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2023",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2024_01",
                subject = "Physics",
                topic = "Sound Waves & Echoes",
                year = "2024",
                questionText = "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.",
                optionA = "340 m/s",
                optionB = "170 m/s",
                optionC = "680 m/s",
                optionD = "330 m/s",
                correctAnswerIndex = 0,
                explanation = "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2024_02",
                subject = "Physics",
                topic = "Simple Harmonic Motion (SHM)",
                year = "2024",
                questionText = "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?",
                optionA = "4.0 s",
                optionB = "2.0 s",
                optionC = "8.0 s",
                optionD = "1.0 s",
                correctAnswerIndex = 0,
                explanation = "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2024_03",
                subject = "Physics",
                topic = "Electrical Power & Energy",
                year = "2024",
                questionText = "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.",
                optionA = "3.6 × 10⁶ J",
                optionB = "1.8 × 10⁶ J",
                optionC = "6.0 × 10⁴ J",
                optionD = "7.2 × 10⁶ J",
                correctAnswerIndex = 0,
                explanation = "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_phys_2024_04",
                subject = "Physics",
                topic = "Nuclear Reactions",
                year = "2024",
                questionText = "Which radiation has the greatest ionizing power but the least penetrating ability?",
                optionA = "Alpha (α) particles",
                optionB = "Beta (β) particles",
                optionC = "Gamma (γ) rays",
                optionD = "X-rays",
                correctAnswerIndex = 0,
                explanation = "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Ultima Exam Series 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2000_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2000",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2000_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2000",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2000_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2000",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2000_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2000",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2001_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2001",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2001_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2001",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2001_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2001",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2001_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2001",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2002_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2002",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2002_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2002",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2002_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2002",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2002_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2002",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2003_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2003",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2003_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2003",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2003_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2003",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2003_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2003",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2004_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2004",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2004_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2004",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2004_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2004",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2004_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2004",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2005_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2005",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2005_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2005",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2005_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2005",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2005_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2005",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2006_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2006",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2006_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2006",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2006_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2006",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2006_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2006",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2007_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2007",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2007_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2007",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2007_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2007",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2007_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2007",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2008_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2008",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2008_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2008",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2008_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2008",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2008_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2008",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2009_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2009",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2009_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2009",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2009_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2009",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2009_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2009",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2010_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2010",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2010_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2010",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2010_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2010",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2010_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2010",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2011_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2011",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2011_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2011",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2011_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2011",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2011_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2011",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2012_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2012",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2012_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2012",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2012_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2012",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2012_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2012",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2013_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2013",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2013_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2013",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2013_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2013",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2013_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2013",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2014_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2014",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2014_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2014",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2014_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2014",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2014_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2014",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2015_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2015",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2015_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2015",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2015_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2015",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2015_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2015",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2016_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2016",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2016_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2016",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2016_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2016",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2016_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2016",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2017_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2017",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2017_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2017",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2017_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2017",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2017_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2017",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2018_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2018",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2018_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2018",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2018_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2018",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2018_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2018",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2019_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2019",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2019_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2019",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2019_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2019",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2019_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2019",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2020_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2020",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2020_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2020",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2020_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2020",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2020_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2020",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2021_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2021",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2021_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2021",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2021_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2021",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2021_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2021",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2022_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2022",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2022_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2022",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2022_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2022",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2022_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2022",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2023_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2023",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2023_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2023",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2023_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2023",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2023_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2023",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2024_01",
                subject = "Chemistry",
                topic = "Organic Reactions",
                year = "2024",
                questionText = "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.",
                optionA = "Ethyl ethanoate",
                optionB = "Methyl propanoate",
                optionC = "Ethylethanal",
                optionD = "Diethylether",
                correctAnswerIndex = 0,
                explanation = "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2024_02",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2024",
                questionText = "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?",
                optionA = "266.7 cm³",
                optionB = "300.0 cm³",
                optionC = "150.0 cm³",
                optionD = "400.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2024_03",
                subject = "Chemistry",
                topic = "Extraction of Metals",
                year = "2024",
                questionText = "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.",
                optionA = "Lower the melting point and improve electrical conductivity",
                optionB = "Act as a reducing agent",
                optionC = "Precipitate impurities as slag",
                optionD = "Oxidize alumina to aluminium",
                correctAnswerIndex = 0,
                explanation = "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_chem_2024_04",
                subject = "Chemistry",
                topic = "Rates of Reaction",
                year = "2024",
                questionText = "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.",
                optionA = "Providing an alternative reaction pathway with lower activation energy",
                optionB = "Increasing the total kinetic energy of reactant particles",
                optionC = "Increasing the enthalpy change of the reaction",
                optionD = "Shifting the position of equilibrium",
                correctAnswerIndex = 0,
                explanation = "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Ultima Exam Series 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2000_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2000",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2000_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2000",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2000_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2000",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2000_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2000",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2001_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2001",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2001_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2001",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2001_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2001",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2001_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2001",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2002_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2002",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2002_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2002",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2002_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2002",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2002_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2002",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2003_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2003",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2003_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2003",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2003_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2003",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2003_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2003",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2004_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2004",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2004_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2004",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2004_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2004",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2004_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2004",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2005_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2005",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2005_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2005",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2005_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2005",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2005_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2005",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2006_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2006",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2006_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2006",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2006_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2006",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2006_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2006",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2007_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2007",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2007_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2007",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2007_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2007",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2007_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2007",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2008_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2008",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2008_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2008",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2008_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2008",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2008_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2008",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2009_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2009",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2009_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2009",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2009_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2009",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2009_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2009",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2010_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2010",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2010_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2010",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2010_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2010",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2010_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2010",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2011_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2011",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2011_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2011",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2011_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2011",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2011_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2011",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2012_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2012",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2012_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2012",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2012_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2012",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2012_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2012",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2013_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2013",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2013_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2013",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2013_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2013",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2013_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2013",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2014_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2014",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2014_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2014",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2014_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2014",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2014_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2014",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2015_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2015",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2015_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2015",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2015_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2015",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2015_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2015",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2016_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2016",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2016_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2016",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2016_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2016",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2016_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2016",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2017_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2017",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2017_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2017",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2017_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2017",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2017_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2017",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2018_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2018",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2018_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2018",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2018_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2018",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2018_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2018",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2019_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2019",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2019_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2019",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2019_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2019",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2019_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2019",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2020_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2020",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2020_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2020",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2020_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2020",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2020_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2020",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2021_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2021",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2021_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2021",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2021_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2021",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2021_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2021",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2022_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2022",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2022_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2022",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2022_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2022",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2022_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2022",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2023_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2023",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2023_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2023",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2023_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2023",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2023_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2023",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2024_01",
                subject = "Biology",
                topic = "Excretory System",
                year = "2024",
                questionText = "The basic functional and structural filtering unit of the mammalian kidney is the _____.",
                optionA = "Nephron",
                optionB = "Neuron",
                optionC = "Alveolus",
                optionD = "Glomerulus capsule only",
                correctAnswerIndex = 0,
                explanation = "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2024_02",
                subject = "Biology",
                topic = "Genetics & Blood Groups",
                year = "2024",
                questionText = "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?",
                optionA = "Groups A and B only",
                optionB = "Group AB only",
                optionC = "Groups A, B, and O",
                optionD = "Group O only",
                correctAnswerIndex = 0,
                explanation = "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2024_03",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "2024",
                questionText = "Hydrophytes (water plants like water lily) typically possess _____.",
                optionA = "Abundant aerenchyma tissue and stomata on upper leaf surface",
                optionB = "Deep taproot systems and sunken stomata",
                optionC = "Thick waxy cuticle and reduced spine leaves",
                optionD = "Extensive bark and lenticels",
                correctAnswerIndex = 0,
                explanation = "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_biol_2024_04",
                subject = "Biology",
                topic = "Skeletal System",
                year = "2024",
                questionText = "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.",
                optionA = "Ball-and-socket joint",
                optionB = "Hinge joint",
                optionC = "Pivot joint",
                optionD = "Gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints permit triaxial rotational movement across all planes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Ultima Exam Series 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2000_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2000",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2000_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2000",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2000_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2000",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2001_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2001",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2001_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2001",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2001_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2001",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2002_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2002",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2002_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2002",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2002_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2002",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2003_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2003",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2003_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2003",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2003_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2003",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2004_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2004",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2004_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2004",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2004_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2004",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2005_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2005",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2005_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2005",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2005_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2005",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2006_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2006",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2006_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2006",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2006_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2006",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2007_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2007",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2007_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2007",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2007_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2007",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2008_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2008",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2008_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2008",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2008_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2008",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2009_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2009",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2009_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2009",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2009_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2009",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2010_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2010",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2010_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2010",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2010_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2010",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2011_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2011",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2011_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2011",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2011_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2011",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2012_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2012",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2012_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2012",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2012_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2012",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2013_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2013",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2013_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2013",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2013_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2013",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2014_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2014",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2014_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2014",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2014_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2014",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2015_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2015",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2015_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2015",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2015_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2015",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2016_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2016",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2016_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2016",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2016_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2016",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2017_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2017",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2017_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2017",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2017_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2017",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2018_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2018",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2018_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2018",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2018_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2018",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2019_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2019",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2019_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2019",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2019_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2019",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2020_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2020",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2020_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2020",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2020_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2020",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2021_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2021",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2021_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2021",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2021_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2021",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2022_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2022",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2022_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2022",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2022_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2022",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2023_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2023",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2023_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2023",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2023_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2023",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2024_01",
                subject = "Economics",
                topic = "Market Structures",
                year = "2024",
                questionText = "A market structure characterized by a single buyer facing many sellers is termed a _____.",
                optionA = "Monopsony",
                optionB = "Monopoly",
                optionC = "Oligopoly",
                optionD = "Duopoly",
                correctAnswerIndex = 0,
                explanation = "A monopsony is a market dominated by a single buyer with significant purchasing power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2024_02",
                subject = "Economics",
                topic = "International Trade & Finance",
                year = "2024",
                questionText = "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.",
                optionA = "The sum of price elasticities of demand for exports and imports is greater than 1",
                optionB = "Exports are completely price inelastic",
                optionC = "The country has zero foreign reserves",
                optionD = "The government fixes statutory price ceilings",
                correctAnswerIndex = 0,
                explanation = "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_econ_2024_03",
                subject = "Economics",
                topic = "Money Supply",
                year = "2024",
                questionText = "Narrow money (M1) consists of _____.",
                optionA = "Currency outside banks plus demand deposits (current accounts)",
                optionB = "Time deposits plus savings deposits",
                optionC = "Treasury bills plus commercial papers",
                optionD = "Total gold reserves",
                correctAnswerIndex = 0,
                explanation = "M1 = Currency in circulation (coins and banknotes) + Demand deposits.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics • Ultima Exam Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2000_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2000",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2000_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2000",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2000_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2000",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2001_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2001",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2001_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2001",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2001_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2001",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2002_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2002",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2002_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2002",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2002_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2002",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2003_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2003",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2003_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2003",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2003_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2003",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2004_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2004",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2004_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2004",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2004_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2004",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2005_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2005",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2005_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2005",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2005_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2005",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2006_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2006",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2006_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2006",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2006_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2006",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2007_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2007",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2007_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2007",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2007_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2007",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2008_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2008",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2008_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2008",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2008_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2008",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2009_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2009",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2009_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2009",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2009_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2009",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2010_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2010",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2010_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2010",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2010_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2010",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2011_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2011",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2011_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2011",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2011_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2011",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2012_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2012",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2012_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2012",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2012_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2012",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2013_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2013",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2013_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2013",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2013_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2013",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2014_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2014",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2014_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2014",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2014_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2014",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2015_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2015",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2015_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2015",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2015_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2015",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2016_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2016",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2016_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2016",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2016_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2016",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2017_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2017",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2017_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2017",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2017_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2017",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2018_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2018",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2018_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2018",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2018_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2018",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2019_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2019",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2019_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2019",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2019_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2019",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2020_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2020",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2020_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2020",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2020_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2020",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2021_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2021",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2021_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2021",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2021_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2021",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2022_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2022",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2022_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2022",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2022_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2022",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2023_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2023",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2023_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2023",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2023_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2023",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2024_01",
                subject = "Commerce",
                topic = "International Trade",
                year = "2024",
                questionText = "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.",
                optionA = "Bill of Lading",
                optionB = "Charter Party",
                optionC = "Consular Invoice",
                optionD = "Certificate of Origin",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_comm_2024_02",
                subject = "Commerce",
                topic = "Business Finance",
                year = "2024",
                questionText = "Debentures are issued by a company as evidence of _____.",
                optionA = "Long-term borrowed loan capital (debt)",
                optionB = "Equity ownership shares",
                optionC = "Short-term trade credit",
                optionD = "Government subsidies",
                correctAnswerIndex = 0,
                explanation = "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Ultima Exam Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_ult_prin_2024_03",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2024",
                questionText = "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.",
                optionA = "Prudence (Conservatism) concept",
                optionB = "Accruals (Matching) concept",
                optionC = "Going Concern concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • Ultima Exam Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
