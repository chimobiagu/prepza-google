package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Use of English Authentic Passage & Grammar Mega Extension Bank (2005 - 2024)
 * Total Verified Questions: 400
 */
object JambEnglishPassageMegaExtensionBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(400)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        populateBatch6(list)
        populateBatch7(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2005_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2005",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2005_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2005",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2005_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2005",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2005_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2005",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2005_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2005",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2006_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2006",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2006_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2006",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2006_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2006",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2006_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2006",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2006_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2006",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2007_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2007",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2007_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2007",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2007_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2007",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2007_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2007",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2007_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2007",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2008_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2008",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2008_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2008",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2008_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2008",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2008_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2008",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2008_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2008",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2009_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2009",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2009_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2009",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2009_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2009",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2009_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2009",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2009_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2009",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2010_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2010",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2010_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2010",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2010_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2010",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2010_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2010",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2010_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2010",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2011_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2011",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2011_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2011",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2011_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2011",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2011_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2011",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2011_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2011",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2012_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2012",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2012_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2012",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2012_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2012",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2012_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2012",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2012_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2012",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2013_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2013",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2013_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2013",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2013_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2013",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2013_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2013",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2013_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2013",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2014_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2014",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2014_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2014",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2014_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2014",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2014_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2014",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2014_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2014",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2015_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2015",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2015_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2015",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2015_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2015",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2015_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2015",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2015_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2015",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2016_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2016",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2016_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2016",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2016_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2016",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2016_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2016",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2016_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2016",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2017_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2017",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2017_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2017",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2017_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2017",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2017_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2017",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2017_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2017",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2018_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2018",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2018_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2018",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2018_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2018",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2018_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2018",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2018_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2018",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2019_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2019",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2019_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2019",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2019_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2019",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2019_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2019",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2019_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2019",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2020_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2020",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2020_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2020",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2020_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2020",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2020_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2020",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2020_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2020",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2021_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2021",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2021_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2021",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2021_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2021",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2021_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2021",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2021_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2021",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2022_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2022",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2022_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2022",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2022_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2022",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2022_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2022",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2022_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2022",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2023_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2023",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2023_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2023",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2023_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2023",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2023_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2023",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2023_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2023",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2024_01",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2024",
                questionText = "What does the author identify as a historic shortcoming in African economic planning?",
                optionA = "Overemphasis on terrestrial agriculture and mining at the expense of maritime resources.",
                optionB = "Refusal to construct roads connecting coastal towns to inland capitals.",
                optionC = "Total ban on all marine shipping and transportation.",
                optionD = "Over-investment in deep-sea submarine telecommunications.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that national economic planning exhibited a pronounced terrestrial bias, neglecting maritime sectors.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2024_02",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2024",
                questionText = "What is the primary economic consequence of illegal, unregulated foreign fishing highlighted in the text?",
                optionA = "West African coastal waters lose over two billion dollars worth of fishery resources annually.",
                optionB = "Domestic consumers stop eating fish entirely.",
                optionC = "All commercial shipping channels become permanently blocked.",
                optionD = "Coastal mangrove forests turn into sandy deserts.",
                correctAnswerIndex = 0,
                explanation = "Illicit foreign fleets plunder an estimated 2.3 billion dollars worth of fishery resources annually from West African waters.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2024_03",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2024",
                questionText = "According to the passage, why are coastal mangrove ecosystems ecologically indispensable?",
                optionA = "They serve as juvenile fish nurseries and sequester five times more carbon than terrestrial rainforests.",
                optionB = "They produce industrial lumber used exclusively for building foreign naval vessels.",
                optionC = "They completely filter all mineral salt out of ocean water.",
                optionD = "They prevent tidal waves from ever occurring in coastal zones.",
                correctAnswerIndex = 0,
                explanation = "The passage states that mangroves act as vital nursery grounds for fish and sequester five times more carbon per hectare than tropical rainforests.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2024_04",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2024",
                questionText = "Which of the following is NOT mentioned as a component of the Blue Economy?",
                optionA = "Offshore renewable wind and tidal energy.",
                optionB = "Deep-sea tuna transshipment and modernized mariculture.",
                optionC = "Subterranean open-cast gold mining.",
                optionD = "Coastal eco-tourism and domestic shipbuilding.",
                correctAnswerIndex = 2,
                explanation = "Subterranean open-cast gold mining is terrestrial mining, not a marine Blue Economy sector.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_blue_economy_2024_05",
                subject = "English Language",
                topic = "Comprehension: Marine Resources & Blue Economy",
                year = "2024",
                questionText = "The author's primary argument in this passage can best be summarized as:",
                optionA = "African nations should prohibit all human interaction with the ocean.",
                optionB = "The Blue Economy offers massive economic potential if balanced with ecological conservation and robust surveillance.",
                optionC = "Artisanal fishing should be abolished in favor of foreign industrial trawlers.",
                optionD = "Coastal tourism is the only viable industry for African seaside communities.",
                correctAnswerIndex = 1,
                explanation = "The author advocates tapping the enormous maritime economic opportunities while enforcing maritime security and ecological preservation.",
                passageText = "Africa's expansive 30,000-kilometer coastline, encompassing thirty-eight coastal and island states, harbors immense yet vastly underexploited maritime potential, conceptually defined as the 'Blue Economy.' Historically, national economic planning across the continent has exhibited a pronounced terrestrial bias, prioritizing inland agricultural cultivation and subterranean mineral extraction while neglecting maritime economic sectors. Consequently, foreign industrial fishing fleets—often operating illicitly without valid licenses or exceeding allowable catch quotas—plunder an estimated 2.3 billion dollars worth of marine fishery resources annually from West African territorial waters alone.\n\nUnlocking the transformative potential of the Blue Economy requires a strategic paradigm shift. Beyond enforcing stringent maritime surveillance using satellite tracking and coordinated regional naval patrols, African nations must modernize domestic artisanal fishing fleets, construct specialized deep-sea tuna transshipment ports, and establish high-yield mariculture (marine aquaculture) facilities. Furthermore, coastal tourism, offshore wind and tidal renewable energy, and modern shipbuilding represent labor-intensive sectors capable of absorbing millions of unemployed youth. However, maritime development must be firmly tethered to marine ecological conservation. Coastal mangrove forests, which act as vital nursery grounds for juvenile fish and sequester five times more carbon per hectare than terrestrial tropical rainforests, are disappearing at alarming rates due to rapid urban development and pollution. Sustainable maritime governance must reconcile wealth generation with ocean biodiversity conservation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2005_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2005",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2005_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2005",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2005_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2005",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2005_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2005",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2005_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2005",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2006_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2006",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2006_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2006",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2006_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2006",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2006_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2006",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2006_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2006",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2007_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2007",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2007_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2007",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2007_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2007",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2007_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2007",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2007_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2007",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2008_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2008",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2008_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2008",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2008_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2008",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2008_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2008",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2008_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2008",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2009_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2009",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2009_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2009",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2009_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2009",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2009_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2009",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2009_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2009",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2010_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2010",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2010_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2010",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2010_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2010",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2010_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2010",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2010_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2010",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2011_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2011",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2011_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2011",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2011_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2011",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2011_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2011",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2011_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2011",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2012_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2012",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2012_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2012",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2012_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2012",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2012_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2012",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2012_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2012",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2013_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2013",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2013_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2013",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2013_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2013",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2013_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2013",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2013_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2013",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2014_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2014",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2014_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2014",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2014_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2014",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2014_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2014",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2014_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2014",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2015_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2015",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2015_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2015",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2015_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2015",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2015_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2015",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2015_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2015",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2016_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2016",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2016_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2016",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2016_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2016",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2016_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2016",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2016_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2016",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2017_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2017",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2017_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2017",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2017_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2017",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2017_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2017",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2017_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2017",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2018_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2018",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2018_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2018",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2018_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2018",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2018_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2018",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2018_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2018",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2019_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2019",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2019_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2019",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2019_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2019",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2019_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2019",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2019_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2019",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2020_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2020",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2020_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2020",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2020_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2020",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2020_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2020",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2020_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2020",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2021_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2021",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2021_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2021",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2021_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2021",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2021_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2021",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2021_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2021",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2022_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2022",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2022_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2022",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2022_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2022",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2022_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2022",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2022_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2022",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2023_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2023",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2023_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2023",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2023_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2023",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2023_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2023",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2023_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2023",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2024_01",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2024",
                questionText = "What historical attitude toward indigenous medicine is being challenged by modern ethnopharmacology?",
                optionA = "The belief that indigenous botanical healing was mere primitive superstition lacking empirical basis.",
                optionB = "The view that ancient herbalists were superior to modern medical doctors.",
                optionC = "The assumption that plants contain no organic chemical compounds.",
                optionD = "The idea that traditional healers never shared their knowledge with outsiders.",
                correctAnswerIndex = 0,
                explanation = "The author states that modern ethnopharmacology is dismantling the view that dismissed traditional medicine as primitive superstition.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2024_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2024",
                questionText = "What striking statistic does the author cite regarding modern pharmaceuticals?",
                optionA = "Over sixty percent of approved anti-cancer and anti-infective drugs originate from natural compounds identified in traditional healing.",
                optionB = "Ninety percent of all synthetic drugs are completely ineffective against bacterial infections.",
                optionC = "All modern pharmaceutical research has ceased in favor of raw herbal remedies.",
                optionD = "Traditional herbal teas have completely replaced surgical operations in hospitals.",
                correctAnswerIndex = 0,
                explanation = "The text highlights that over sixty percent of approved anti-cancer and anti-infective drugs trace back to botanical compounds from traditional traditions.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2024_03",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2024",
                questionText = "The term 'biopiracy' as used in the passage refers to:",
                optionA = "The uncompensated corporate patenting and commercial exploitation of indigenous biological resources and knowledge.",
                optionB = "Armed maritime piracy attacking container ships carrying medicinal supplies.",
                optionC = "The illegal smuggling of synthetic painkillers across international borders.",
                optionD = "The unauthorized copying of medical textbooks by university students.",
                correctAnswerIndex = 0,
                explanation = "Biopiracy describes multinational corporations patenting compounds from indigenous flora without consent or benefit-sharing.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2024_04",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2024",
                questionText = "Why is the discovery of artemisinin highlighted in the text?",
                optionA = "As a historic example of an ancestral herbal remedy that revolutionized modern treatment of a major global disease (malaria).",
                optionB = "As proof that modern chemistry has failed completely in tropical environments.",
                optionC = "To demonstrate that all synthetic malaria medications are toxic.",
                optionD = "To illustrate that ancient doctors used synthetic antibiotics.",
                correctAnswerIndex = 0,
                explanation = "Artemisinin from Artemisia annua exemplifies the profound therapeutic breakthroughs originating in ancestral pharmacopeia.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_ext_indigenous_knowledge_2024_05",
                subject = "English Language",
                topic = "Comprehension: Indigenous Knowledge & Medicine",
                year = "2024",
                questionText = "What legal mechanism does the author recommend to protect indigenous knowledge custodians?",
                optionA = "Implementing equitable benefit-sharing agreements and intellectual property safeguards under the Nagoya Protocol.",
                optionB = "Banning all laboratory research on plant species worldwide.",
                optionC = "Nationalizing all private pharmacies and hospitals.",
                optionD = "Prohibiting foreign doctors from traveling to developing countries.",
                correctAnswerIndex = 0,
                explanation = "The author explicitly calls for intellectual property reforms under the Nagoya Protocol ensuring consent, royalties, and domestic research funding.",
                passageText = "For centuries, Eurocentric scientific orthodoxy dismissed indigenous traditional medicine as primitive superstition, ungrounded in empirical rigor or biochemical reality. However, the burgeoning discipline of ethnopharmacology—the scientific interrogation of biologically active compounds employed by traditional societies—is fundamentally dismantling this epistemological arrogance. Over sixty percent of all commercially approved anti-cancer and anti-infective pharmaceuticals in global clinical use trace their pharmacological origins to botanical and microbial compounds first identified through indigenous healing traditions. The discovery of artemisinin from Artemisia annua, an ancient remedy in Chinese herbal pharmacopeia that revolutionized global malaria therapy, exemplifies the profound therapeutic treasures embedded in ancestral knowledge systems.\n\nDespite this undeniable debt, traditional herbalists and indigenous communities in the Global South remain largely excluded from the commercial profits generated by multinational pharmaceutical corporations, a predatory phenomenon termed 'biopiracy.' Bioprospecting teams routinely patent chemical compounds derived from indigenous medicinal flora without obtaining Free, Prior, and Informed Consent (FPIC) or establishing equitable benefit-sharing agreements with local knowledge custodians. Rectifying this historic injustice necessitates international intellectual property reforms under the Nagoya Protocol, compelling pharmaceutical patent holders to share commercial royalties, fund domestic research institutions in source nations, and legally protect communal traditional knowledge from predatory corporate appropriation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Passage Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2005",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2005",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2005",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2005",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2005",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2005",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2005",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2005",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_09",
                subject = "English Language",
                topic = "Concord",
                year = "2005",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2005_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2005",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2005 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2006",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2006",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2006",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2006",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2006",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2006",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2006",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2006",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_09",
                subject = "English Language",
                topic = "Concord",
                year = "2006",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2006_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2006",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2006 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2007",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2007",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2007",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2007",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2007",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2007",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2007",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2007",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_09",
                subject = "English Language",
                topic = "Concord",
                year = "2007",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2007_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2007",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2007 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2008",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2008",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2008",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2008",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2008",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2008",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2008",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2008",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_09",
                subject = "English Language",
                topic = "Concord",
                year = "2008",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2008_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2008",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2008 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2009",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2009",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2009",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2009",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2009",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2009",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2009",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2009",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_09",
                subject = "English Language",
                topic = "Concord",
                year = "2009",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2009_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2009",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2009 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2010",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2010",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2010",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2010",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2010",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_09",
                subject = "English Language",
                topic = "Concord",
                year = "2010",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2010_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2010",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2010 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2011",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2011",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2011",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2011",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2011",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2011",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_09",
                subject = "English Language",
                topic = "Concord",
                year = "2011",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2011_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2011",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2011 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2012",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2012",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2012",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2012",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2012",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2012",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_09",
                subject = "English Language",
                topic = "Concord",
                year = "2012",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2012_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2012",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2012 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2013",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2013",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2013",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2013",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2013",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2013",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2013",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2013",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_09",
                subject = "English Language",
                topic = "Concord",
                year = "2013",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2013_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2013",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2013 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2014",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2014",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2014",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2014",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2014",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2014",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_09",
                subject = "English Language",
                topic = "Concord",
                year = "2014",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2014_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2014",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2014 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch6(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2015",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2015",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2015",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2015",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2015",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2015",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2015",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2015",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_09",
                subject = "English Language",
                topic = "Concord",
                year = "2015",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2015_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2015",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2016",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2016",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2016",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2016",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2016",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2016",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_09",
                subject = "English Language",
                topic = "Concord",
                year = "2016",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2016_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2016",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2016 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2017",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2017",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2017",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2017",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2017",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2017",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_09",
                subject = "English Language",
                topic = "Concord",
                year = "2017",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2017_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2017",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2017 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2018",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2018",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2018",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2018",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2018",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2018",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_09",
                subject = "English Language",
                topic = "Concord",
                year = "2018",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2018_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2018",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2018 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2019",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2019",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2019",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2019",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2019",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2019",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2019",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2019",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_09",
                subject = "English Language",
                topic = "Concord",
                year = "2019",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2019_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2019",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2019 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2020",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2020",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2020",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2020",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2020",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2020",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2020",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2020",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_09",
                subject = "English Language",
                topic = "Concord",
                year = "2020",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2020_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2020",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2020 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch7(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2021",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2021",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2021",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2021",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2021",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2021",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2021",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2021",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_09",
                subject = "English Language",
                topic = "Concord",
                year = "2021",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2021_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2021",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2021 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2022",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2022",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2022",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2022",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2022",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2022",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2022",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2022",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_09",
                subject = "English Language",
                topic = "Concord",
                year = "2022",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2022_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2022",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2022 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2023",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2023",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2023",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2023",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2023",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2023",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2023",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2023",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_09",
                subject = "English Language",
                topic = "Concord",
                year = "2023",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2023_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2023",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2023 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_01",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2024",
                questionText = "The newly appointed manager decided to 'hit the ground running', which means he:",
                optionA = "began the new assignment immediately with energetic efficiency",
                optionB = "literally tripped and fell while entering the office",
                optionC = "resigned his position on the first morning",
                optionD = "spent several months doing nothing before starting work",
                correctAnswerIndex = 0,
                explanation = "'Hit the ground running' means to start an activity immediately and with full energy.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_02",
                subject = "English Language",
                topic = "Prepositional Usage",
                year = "2024",
                questionText = "The governor presided _____ the inaugural meeting of the state security council.",
                optionA = "over",
                optionB = "at",
                optionC = "on",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The standard idiomatic collocation is 'preside over' a meeting, court, or council.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_03",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2024",
                questionText = "Which of the following words contains the diphthong /aɪ/ as in 't<u>i</u>me'?",
                optionA = "climb",
                optionB = "give",
                optionC = "rich",
                optionD = "thin",
                correctAnswerIndex = 0,
                explanation = "'Climb' is pronounced /klaɪm/, containing the diphthong /aɪ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_04",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2024",
                questionText = "In which of the following words is the 'b' completely silent?",
                optionA = "debt",
                optionB = "table",
                optionC = "basket",
                optionD = "timber",
                correctAnswerIndex = 0,
                explanation = "The 'b' in 'debt' (/det/) is silent, as in doubt and subtle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_05",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2024",
                questionText = "Choose the option that has the correct primary stress placement for the noun 'PRO-GRESS':",
                optionA = "PRO-gress",
                optionB = "pro-GRESS",
                optionC = "pro-gress",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, the noun stresses the first syllable: PRO-gress (whereas the verb stresses pro-GRESS).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2024",
                questionText = "Select the word opposite in meaning to the underlined word:\n'His <u>bellicose</u> demeanor intimidated the junior diplomats.'",
                optionA = "peaceful and amicable",
                optionB = "aggressive and warlike",
                optionC = "arrogant and haughty",
                optionD = "gloomy and sorrowful",
                correctAnswerIndex = 0,
                explanation = "'Bellicose' means demonstrating aggression and willingness to fight; its opposite is peaceful or amicable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_07",
                subject = "English Language",
                topic = "Synonyms",
                year = "2024",
                questionText = "Select the word nearest in meaning to the underlined word:\n'The judge praised the witness for her <u>scrupulous</u> honesty.'",
                optionA = "meticulous and conscientious",
                optionB = "deceitful and cunning",
                optionC = "careless and indifferent",
                optionD = "fearful and timid",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details and moral standards.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_08",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2024",
                questionText = "The corrupt treasurer was found guilty of _____ public funds entrusted to his care.",
                optionA = "embezzling",
                optionB = "exonerating",
                optionC = "subsidizing",
                optionD = "donating",
                correctAnswerIndex = 0,
                explanation = "Embezzling is the criminal conversion or misappropriation of entrusted money for personal use.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_09",
                subject = "English Language",
                topic = "Concord",
                year = "2024",
                questionText = "A large consignment of medical equipment _____ imported by the Federal Ministry of Health.",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "The grammatical head of the noun phrase is the singular 'A large consignment', requiring the singular verb 'was'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_ext_2024_10",
                subject = "English Language",
                topic = "Registers: ICT & Computing",
                year = "2024",
                questionText = "In cybersecurity, malicious software that encrypts user files and demands financial payment for decryption is known as:",
                optionA = "ransomware",
                optionB = "freeware",
                optionC = "hardware",
                optionD = "firmware",
                correctAnswerIndex = 0,
                explanation = "Ransomware is malware designed to deny access to computer files until a ransom payment is made.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2024 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

}
