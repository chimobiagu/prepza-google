package com.example.data.repository

import com.example.data.db.QuestionEntity

object JambFurtherMathematicsQuestionBank {
    fun getQuestions(): List<QuestionEntity> {
        return listOf(
            QuestionEntity(
                id = "fmth_001",
                subject = "Further Mathematics",
                topic = "Matrices & Determinants",
                year = "2024",
                questionText = "If matrix M = [[3, 2], [1, 4]], the determinant |M| is equal to:",
                optionA = "10",
                optionB = "14",
                optionC = "12",
                optionD = "8",
                correctAnswerIndex = 0,
                explanation = "|M| = (ad - bc) = (3 * 4) - (2 * 1) = 12 - 2 = 10.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2024",
                isVerifiedJamb = true
            ),
            QuestionEntity(
                id = "fmth_002",
                subject = "Further Mathematics",
                topic = "Vectors",
                year = "2023",
                questionText = "Two non-zero vectors a and b are perpendicular (orthogonal) if and only if their dot product a · b is:",
                optionA = "1",
                optionB = "0",
                optionC = "-1",
                optionD = "Equal to |a||b|",
                correctAnswerIndex = 1,
                explanation = "Vectors are orthogonal when cos(90°) = 0, meaning a · b = |a||b|cos(90°) = 0.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2023",
                isVerifiedJamb = true
            ),
            QuestionEntity(
                id = "fmth_003",
                subject = "Further Mathematics",
                topic = "Calculus",
                year = "2024",
                questionText = "Evaluate the definite integral ∫ from 0 to 2 of (3x² + 2x) dx:",
                optionA = "10",
                optionB = "12",
                optionC = "16",
                optionD = "8",
                correctAnswerIndex = 1,
                explanation = "∫(3x² + 2x)dx = [x³ + x²] from 0 to 2 = (2³ + 2²) - 0 = 8 + 4 = 12.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2024",
                isVerifiedJamb = true
            ),
            QuestionEntity(
                id = "fmth_004",
                subject = "Further Mathematics",
                topic = "Conic Sections",
                year = "2023",
                questionText = "The standard equation of a parabola with vertex at the origin opening along the positive x-axis with focus (a, 0) is:",
                optionA = "y² = 4ax",
                optionB = "x² = 4ay",
                optionC = "y² = -4ax",
                optionD = "x² / a² + y² / b² = 1",
                correctAnswerIndex = 0,
                explanation = "The Cartesian equation of a rightward horizontal parabola centered at (0,0) is y² = 4ax.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2023",
                isVerifiedJamb = true
            ),
        )
    }
}