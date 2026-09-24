package com.example.data.repository

import com.example.data.db.QuestionEntity

object Geography2015Ingestion {
    fun getQuestions(): List<QuestionEntity> {
        val rawQuestions = listOf(
            RawQuestionData(
                sourceDocument = "Geography_2015",
                sourceYear = "2015",
                pageNumber = 2,
                questionNumber = 1,
                subject = "Geography",
                topic = "Natural Resources",
                questionText = "The following are natural resources except",
                options = listOf("rubber", "soil", "water", "cellphane"),
                sourceAnswerLetter = "D",
                explanation = "Cellophane is a synthetic material, not a natural resource.",
                difficulty = "Easy"
            ),
            RawQuestionData(
                sourceDocument = "Geography_2015",
                sourceYear = "2015",
                pageNumber = 2,
                questionNumber = 2,
                subject = "Geography",
                topic = "Landforms",
                questionText = "all these are examples of fold mountains except",
                options = listOf("Himalayas", "Rockies", "Andes", "Voges Mountain"),
                sourceAnswerLetter = "D",
                explanation = "Voges Mountain is a block mountain (horst).",
                difficulty = "Medium"
            )
        )
        
        val (_, entities) = QuestionIngestionPipeline.processBatch(
            sourceName = "Geography 2015 (Initial)",
            rawList = rawQuestions
        )
        return entities
    }
}
