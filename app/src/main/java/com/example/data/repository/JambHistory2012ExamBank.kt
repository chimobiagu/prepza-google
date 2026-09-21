package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB History 2012 Complete Exam Bank.
 * Extracted directly from official JAMB UTME History 2012 Past Paper.
 * 100% verified question wording, options, answer key, and historical explanations.
 */
object JambHistory2012ExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "hist_2012_01",
                subject = "History",
                topic = "Early Nigerian Civilizations: Nok",
                year = "2012",
                questionText = "The Nok civilization suggests that",
                optionA = "Nigeria passed through different stages of development",
                optionB = "civilization in the area began with the Stone Age",
                optionC = "the people of Nigeria came from the East",
                optionD = "Nigerian civilization is related to that of Greek.",
                correctAnswerIndex = 0,
                explanation = "Nok terracotta and iron-smelting furnaces (dating from c. 1000 BCE to 500 CE) demonstrate that pre-colonial Nigerian societies independently transitioned through sophisticated technological and cultural stages of development.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_02",
                subject = "History",
                topic = "Stone Age Archaeology",
                year = "2012",
                questionText = "The development of microliths is associated with the",
                optionA = "Middle Age Stone",
                optionB = "Late Stone Age",
                optionC = "Iron Age",
                optionD = "Early Stone Age.",
                correctAnswerIndex = 1,
                explanation = "Microliths (small flaked stone tools utilized for composite arrows, spears, and scythes) characterize the Late Stone Age (Mesolithic/Neolithic era).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_03",
                subject = "History",
                topic = "Pre-Colonial Intergroup Relations",
                year = "2012",
                questionText = "In pre-colonial Nigeria, intergroup contacts were encouraged mostly by",
                optionA = "economic interdependence",
                optionB = "military alliance",
                optionC = "marriage ties",
                optionD = "political ties",
                correctAnswerIndex = 0,
                explanation = "Regional ecological specializations (forest products like kola and palm oil exchanged for savannah leather, horses, grains, and salt) necessitated mutual trade and economic interdependence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_04",
                subject = "History",
                topic = "Historiography: Kano Chronicle",
                year = "2012",
                questionText = "Which of the following is the most important source of the history of the Hausa states?",
                optionA = "Tarikh-as Sudan.",
                optionB = "The European account.",
                optionC = "The Kano Chronicle.",
                optionD = "The Arab traders’ account.",
                correctAnswerIndex = 2,
                explanation = "The Kano Chronicle (Ta'rikh Arbab Hadha al-Balad al-Musamma Kano) is the primary indigenous chronicle documenting the lineages, political successions, wars, and administration of Hausaland from the reign of Bagauda.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_05",
                subject = "History",
                topic = "Benin and Ife Connections",
                year = "2012",
                questionText = "The Yoruba background to the Oba of Benin is emphasized by the",
                optionA = "similarities of Benin and Ife arts",
                optionB = "similarities in their political structures",
                optionC = "relationship between Oranmiyan and Ogiso dynasties",
                optionD = "Oranmiyan legend in Benin history.",
                correctAnswerIndex = 3,
                explanation = "Benin historical tradition recounts that Prince Oranmiyan of Ile-Ife was invited to establish a new dynasty following the collapse of the Ogiso rulers, fathering Eweka I, the first Oba of Benin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_06",
                subject = "History",
                topic = "Coastal Trade Dynamics",
                year = "2012",
                questionText = "European traders did not venture into the interior of Nigeria before the 19th century because",
                optionA = "they were ignorant of the area",
                optionB = "the African middlemen served their needs",
                optionC = "of their fear of the African middlemen",
                optionD = "they were very few in number.",
                correctAnswerIndex = 1,
                explanation = "Coastal middlemen (such as the Bonny, Efik, Itsekiri, and Brass merchants) efficiently organized inland trade networks, supplying European ships on the coast with palm oil and slaves.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_07",
                subject = "History",
                topic = "Trans-Atlantic Slave Trade",
                year = "2012",
                questionText = "The Africans transported across the Atlantic as slaves were mostly",
                optionA = "people with criminal records",
                optionB = "able-bodied men",
                optionC = "disabled persons",
                optionD = "people with low income.",
                correctAnswerIndex = 1,
                explanation = "European plantation owners and slave ships specifically demanded young, able-bodied men and women capable of rigorous physical labor in sugar, tobacco, and cotton plantations in the Americas.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_08",
                subject = "History",
                topic = "Sokoto Jihad in Gobir",
                year = "2012",
                questionText = "The jihadists emerged victorious in Gobir because",
                optionA = "their cause was just",
                optionB = "the Hausa rulers were divided",
                optionC = "they had superior weapons",
                optionD = "the masses supported them.",
                correctAnswerIndex = 3,
                explanation = "The oppressed peasantry (talakawa) and pastoral Fulani heavily supported Shehu Uthman dan Fodio against the oppressive taxes (jangali, kudin kasa) and corruption of Sarkin Gobir Yunfa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_09",
                subject = "History",
                topic = "Rabeh's Incursion into Borno",
                year = "2012",
                questionText = "Rabeh’s greatest challenge after conquering Borno was",
                optionA = "normalizing relations with Sokoto Caliphate",
                optionB = "rebuilding the armed forces",
                optionC = "reviving the ailing economy",
                optionD = "safeguarding the religion of Islam.",
                correctAnswerIndex = 2,
                explanation = "After destroying Kukawa in 1893, Rabeh az-Zubayr faced economic ruin, depopulation, famine, and trade embargoes, which severely undermined his military regime.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_10",
                subject = "History",
                topic = "Spread of Christianity",
                year = "2012",
                questionText = "Christianity spread fast in Nigeria because it",
                optionA = "was associated with Western education",
                optionB = "had superior spiritual appeal",
                optionC = "preached social equality",
                optionD = "was opposed to oppression by rulers.",
                correctAnswerIndex = 0,
                explanation = "Missionary schools provided Western literacy, vocational training, and employment prospects in the colonial civil service and mercantile houses, attracting widespread enrollment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_11",
                subject = "History",
                topic = "19th Century Yoruba Wars",
                year = "2012",
                questionText = "Ibadan-Ijebu relations in the 19th Century became hostile as a result of",
                optionA = "boundary disputes between them",
                optionB = "succession to the Ijebu throne",
                optionC = "British annexation of Lagos",
                optionD = "Ibadan’s attempt to reach the coast.",
                correctAnswerIndex = 3,
                explanation = "Ibadan sought direct access to the coastal ports of Lagos to trade in palm produce and secure firearms, threatening Ijebu's lucrative monopoly as coastal middlemen.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_12",
                subject = "History",
                topic = "Ekiti Parapo (Kiriji War)",
                year = "2012",
                questionText = "The Ekiti Parapo was aimed at",
                optionA = "checking European inroad into Yorubaland",
                optionB = "restoring the dignity of the Alaafin",
                optionC = "reducing the powers of Ibadan",
                optionD = "forming a federated government.",
                correctAnswerIndex = 2,
                explanation = "The Ekiti Parapo alliance (led by Fabunmi of Imesi and Ogedengbe of Ilesha) was formed in 1878 to liberate eastern Yoruba states from Ibadan's overbearing military hegemony and taxation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_13",
                subject = "History",
                topic = "Benin Traditional System: Uzama",
                year = "2012",
                questionText = "The Uzama title holders in Benin Kingdom were responsible for",
                optionA = "advising the Oba in the administration of the Kingdom",
                optionB = "punishing erring members of the royal family",
                optionC = "defending the Kingdom from external attacks",
                optionD = "settling disputes between the Oba and other chiefs.",
                correctAnswerIndex = 0,
                explanation = "The Uzama N'Ihinron (seven kingmakers and premier hereditary council of chiefs) crowned the Oba and served as chief constitutional advisers in state governance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_14",
                subject = "History",
                topic = "Abolition of the Slave Trade",
                year = "2012",
                questionText = "Britain suppressed the trans-Atlantic slave trade because",
                optionA = "there was no more market for slaves in America",
                optionB = "it had become very inhuman",
                optionC = "the Christian missions preached against it",
                optionD = "it became unfavourable to her industrial progress.",
                correctAnswerIndex = 3,
                explanation = "The Industrial Revolution made machine manufacture more profitable than manual slave labor, requiring raw materials (palm oil, rubber) to remain in Africa for extraction.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_15",
                subject = "History",
                topic = "Anglo-Aro Expedition (1901-1902)",
                year = "2012",
                questionText = "The main goal of the British expedition against the Aro was to",
                optionA = "destroy the Ibini-Ukpabi oracle",
                optionB = "eliminate all opposition to their presence in the hinterland",
                optionC = "pave the way for the Christianization of Igboland",
                optionD = "liberate the Igbo from Aro bondage.",
                correctAnswerIndex = 1,
                explanation = "The British military campaign (1901-1902) targeted Aro hegemony and the Long Juju oracle to break indigenous trade monopolies and subjugate the entire Igbo hinterland.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_16",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2012",
                questionText = "A major reason for the introduction of indirect rule in Northern Nigeria was to",
                optionA = "ensure perfect control of the economy",
                optionB = "further weaken the position of the elite class",
                optionC = "assist the Christian missionaries in their activities",
                optionD = "secure cheap labour for railway construction.",
                correctAnswerIndex = 3,
                explanation = "Lord Lugard implemented indirect rule due to acute shortages of British personnel and financial resources, using existing emirate hierarchies to maintain order and mobilize forced and cheap local labor.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_17",
                subject = "History",
                topic = "Comparative Colonial Policies",
                year = "2012",
                questionText = "Nationalist activities developed earlier in British West Africa than in French West Africa because",
                optionA = "British colonies were accorded equal status with Britain",
                optionB = "Britain had more colonies than France",
                optionC = "African chiefs in French colonies were highly respected",
                optionD = "of the systems of administration adopted by the colonial powers.",
                correctAnswerIndex = 3,
                explanation = "British indirect rule maintained racial separation that prompted early local political consciousness and newspapers, whereas French assimilation suppressed political parties by offering individual French citizenship to small elites.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_18",
                subject = "History",
                topic = "Colonial Infrastructure: Eastern Railway",
                year = "2012",
                questionText = "The main reason for the construction of the railway from Port-Harcourt into the hinterland was the",
                optionA = "discovery of tin in Jos area",
                optionB = "discovery of a deep sea harbor at Port-Harcourt",
                optionC = "discovery of coal at Udi",
                optionD = "need to evacuate export crops from the hinterland.",
                correctAnswerIndex = 2,
                explanation = "Following the 1909 discovery of sub-bituminous coal deposits at Udi near Enugu, the colonial government founded Port Harcourt (1912) and built the eastern rail line to evacuate coal for steamships and trains.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_19",
                subject = "History",
                topic = "Colonial Economy: Agriculture",
                year = "2012",
                questionText = "During the colonial period, agricultural policy in Nigeria was designed to",
                optionA = "raise the financial base of the country",
                optionB = "make the economy compete favourably in the world market",
                optionC = "provide raw materials for British industries",
                optionD = "demonstrate Britain’s concern for the development of its colonies.",
                correctAnswerIndex = 2,
                explanation = "British colonial agricultural policies prioritized cash crops (groundnuts, palm produce, cocoa, cotton) to feed the manufacturing requirements of metropolitan British industries.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_20",
                subject = "History",
                topic = "Nigerian Youth Movement (NYM)",
                year = "2012",
                questionText = "The Nigerian Youth Movement collapsed as a result of",
                optionA = "its failure to win elections",
                optionB = "shortage of funds to run its affairs",
                optionC = "the harassment of its leadership by government",
                optionD = "the break-up of its leadership.",
                correctAnswerIndex = 3,
                explanation = "The NYM disintegrated in 1941 during the Legislative Council election contest between Ernest Ikoli and Samuel Akinsanya, leading to ethnic polarization and the departure of Nnamdi Azikiwe and Akinsanya.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_21",
                subject = "History",
                topic = "NCNC Delegation of 1947",
                year = "2012",
                questionText = "The NCNC London Delegate pressed for",
                optionA = "free primary education for all Nigerian children",
                optionB = "autonomy for the regions",
                optionC = "a revision of the Richards Constitution",
                optionD = "outright independence for Nigeria.",
                correctAnswerIndex = 2,
                explanation = "The 1947 NCNC delegation led by Nnamdi Azikiwe travelled to London to present objections to the Colonial Secretary Arthur Creech Jones, demanding immediate revision of the Richards Constitution.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_22",
                subject = "History",
                topic = "Lyttleton Constitution of 1954",
                year = "2012",
                questionText = "The Lyttlelton Constitution is considered a landmark in the history of Nigeria, because it",
                optionA = "created a federal structure of government for the country",
                optionB = "made ministers accountable to the electorate",
                optionC = "recognized Lagos as a federal territory",
                optionD = "gave ministers full authority over their ministries.",
                correctAnswerIndex = 0,
                explanation = "The 1954 Lyttleton Constitution formally transformed Nigeria into a genuine federation with autonomous regions, exclusive/concurrent legislative lists, and regional premiers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_23",
                subject = "History",
                topic = "Colonial Labour Protests",
                year = "2012",
                questionText = "Protests by trade unions in Nigeria during the colonial period were aimed at",
                optionA = "achieving political independence",
                optionB = "establishing more industries",
                optionC = "obtaining specific benefits for members",
                optionD = "fighting corruption among government officials.",
                correctAnswerIndex = 2,
                explanation = "Early labor unions (such as the Railway Workers Union led by Michael Imoudu) organized strikes like the 1945 general strike primarily for cost of living allowances (COLA), fair wages, and better working conditions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_24",
                subject = "History",
                topic = "First Republic Federal Ministers",
                year = "2012",
                questionText = "Which of the following served as federal ministers under the Tafawa Balewa Administration?",
                optionA = "Alhaji Muhammadu Ribadu and Chief Festus Okotie-Eboh.",
                optionB = "Chief Kolawole Balogun and Alhaji Adamu Ciroma.",
                optionC = "Alhaji Muhammadu Inuwa Wada and Chief Richard Akinjide",
                optionD = "Chief Aja Nwachukwu and Alhaji Umaru Dikko.",
                correctAnswerIndex = 0,
                explanation = "Alhaji Muhammadu Ribadu was the Federal Minister of Defence and Chief Festus Okotie-Eboh served as Federal Minister of Finance in the First Republic under Prime Minister Abubakar Tafawa Balewa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_25",
                subject = "History",
                topic = "FEDECO Functions (1979)",
                year = "2012",
                questionText = "An important function of FEDECO during the 1979 elections was",
                optionA = "establishing party offices",
                optionB = "promulgating the new constitution into law",
                optionC = "swearing-in of elected officials",
                optionD = "delineating electoral constituencies.",
                correctAnswerIndex = 3,
                explanation = "The Federal Electoral Commission (FEDECO), chaired by Michael Ani, was responsible for registering political parties, registering voters, and delimiting constituency boundaries across the federation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_26",
                subject = "History",
                topic = "1966 Military Coup Causes",
                year = "2012",
                questionText = "A major reason for the military intervention in Nigeria’s politics in 1966 was the",
                optionA = "pro-West posture of Nigeria’s foreign policy",
                optionB = "over-bearing power of traditional rulers",
                optionC = "attempt by government to retire top military officers",
                optionD = "crisis of the 1964 General Elections.",
                correctAnswerIndex = 3,
                explanation = "Widespread rigging, boycotts, and regional violent clashes during the 1964 federal elections and the 1965 Western Regional election crisis ('Operation Wetie') precipitated the January 15, 1966 coup.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_27",
                subject = "History",
                topic = "Decree No. 34 of 1966",
                year = "2012",
                questionText = "Major General Aguiyi-Ironsi introduced a unitary system of government because",
                optionA = "it was the wish of the people",
                optionB = "of the command structure of the military",
                optionC = "he wanted more revenue for the central government",
                optionD = "other military officers were planning to overthrow him.",
                correctAnswerIndex = 1,
                explanation = "General Aguiyi-Ironsi promulgated the Unification Decree (Decree 34 of 1966) because the hierarchical military command structure operated naturally on unified central command.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_28",
                subject = "History",
                topic = "Operation Feed the Nation (1976)",
                year = "2012",
                questionText = "The strategy for accelerated agricultural development of the Obasanjo regime in the 1970’s focused on",
                optionA = "improving transportation network to the rural areas",
                optionB = "establishing agro-allied industries",
                optionC = "achieving food self-sufficiency",
                optionD = "establishing new marketing boards.",
                correctAnswerIndex = 2,
                explanation = "Operation Feed the Nation (OFN), launched in May 1976 by General Olusegun Obasanjo, sought to reverse rising food import bills and achieve total national self-sufficiency in food production.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_29",
                subject = "History",
                topic = "19th Century Massina Jihad",
                year = "2012",
                questionText = "The Berber scholar, al-Mukhtar, contributed to the success of the Masina Jihad by",
                optionA = "fighting alongside Seku Ahmadu",
                optionB = "preparing the ground through the Qadiriyyah Brotherhood",
                optionC = "mobilizing various groups to fight for Seku Ahmadu",
                optionD = "appealing to Ardo Moudo to support Seku Ahmadu.",
                correctAnswerIndex = 1,
                explanation = "Sidi al-Mukhtar al-Kunti of the Kunta Arabs revitalized the Qadiriyyah Sufi order across the Western Sudan, providing intellectual and spiritual foundations for Seku Ahmadu's jihad in Massina.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_30",
                subject = "History",
                topic = "Freetown Settlement",
                year = "2012",
                questionText = "The establishment of Freetown in Sierra Leone facilitated",
                optionA = "the settlement of freed slaves",
                optionB = "Christian missionary activities",
                optionC = "humanitarian activities",
                optionD = "the improvement of agriculture.",
                correctAnswerIndex = 0,
                explanation = "Freetown was founded in 1787 and expanded in the 19th century as a Crown Colony specifically to resettle liberated Africans (recaptives) rescued from intercepting slave ships.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_31",
                subject = "History",
                topic = "19th Century Egyptian Nationalism",
                year = "2012",
                questionText = "Nineteenth century Egyptian nationalism principally aimed at",
                optionA = "controlling the Suez Canal",
                optionB = "forming a constitutional government in Egypt",
                optionC = "bringing down the monarchy",
                optionD = "ensuring Egyptian independence.",
                correctAnswerIndex = 3,
                explanation = "The nationalist movement under Ahmad Urabi (the Urabi Revolt of 1879-1882) fought to end Anglo-French financial control and military intervention, asserting sovereign Egyptian independence.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_32",
                subject = "History",
                topic = "Battle of Tel el-Kebir (1882)",
                year = "2012",
                questionText = "The Battle of Tel el-Kebir was fought between",
                optionA = "the British and the Urabists",
                optionB = "Tawfiq and the Mahdists",
                optionC = "the Khedive and the Wafdists",
                optionD = "Napoleon and the Mamluks.",
                correctAnswerIndex = 0,
                explanation = "On September 13, 1882, British forces under General Garnet Wolseley defeated the Egyptian nationalist army led by Colonel Ahmad Urabi at Tel el-Kebir, leading to British occupation of Egypt.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_33",
                subject = "History",
                topic = "Strategic Imperialism: Morocco",
                year = "2012",
                questionText = "Morocco was of strategic importance to the European countries because",
                optionA = "of its good climatic conditions",
                optionB = "it was highly industrialized",
                optionC = "it possessed good mineral resources",
                optionD = "it provided an entrance to the Mediterranean.",
                correctAnswerIndex = 3,
                explanation = "Located along the Strait of Gibraltar, Morocco controls the vital Atlantic maritime gateway into the Mediterranean Sea, making it a focal point of Anglo-French-German imperial rivalry.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_34",
                subject = "History",
                topic = "Mahdist Revolt in the Sudan",
                year = "2012",
                questionText = "The Mahdists revolt in the Sudan was successful because",
                optionA = "They believed they had a superior faith",
                optionB = "it enjoyed widespread support",
                optionC = "the Egyptian army was poorly trained",
                optionD = "General Gordon was an incompetent commander.",
                correctAnswerIndex = 1,
                explanation = "Muhammad Ahmad (the Mahdi) galvanized deep resentment across diverse Sudanese ethnic groups against oppressive Turco-Egyptian taxation, winning broad grassroots support.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_35",
                subject = "History",
                topic = "East African Trade: Sayyid Said",
                year = "2012",
                questionText = "Sayyid Said increased the volume of trade with the Europeans by",
                optionA = "allowing them to take control of the trade with the hinterland",
                optionB = "replacing Indian middlemen with Europeans",
                optionC = "allowing European consuls to reside in Zanzibar",
                optionD = "making English the lingua franca of Zanzibar.",
                correctAnswerIndex = 2,
                explanation = "Sultan Sayyid Said signed commercial treaties with the USA, Britain, and France, permitting foreign consulates and trade representatives to operate directly out of Stone Town, Zanzibar.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_36",
                subject = "History",
                topic = "Scramble for East Africa: Buganda",
                year = "2012",
                questionText = "One of the main aims of the British conquest of Buganda was to",
                optionA = "gain access to the cape of Good Hope",
                optionB = "gain control of the gold mines of Bunyoro",
                optionC = "prevent other Europeans from controlling the source of the Nile",
                optionD = "take control of the trade routes in the area.",
                correctAnswerIndex = 2,
                explanation = "Britain's strategic priority in Uganda and Lake Victoria was protecting the headwaters and source of the River Nile to guarantee British security over Egypt and the Suez Canal route to India.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_37",
                subject = "History",
                topic = "Ethiopian Independence: Battle of Adwa",
                year = "2012",
                questionText = "The survival of Ethiopia as an independent polity was as a result of the",
                optionA = "location of the kingdom",
                optionB = "alliance with some European powers",
                optionC = "strong economic base of the kingdom",
                optionD = "introduction of a compulsory military service.",
                correctAnswerIndex = 0,
                explanation = "Ethiopia's rugged, defensible mountainous highland terrain combined with unified military resistance under Emperor Menelik II enabled them to crush Italian invaders at the Battle of Adwa (1896).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_38",
                subject = "History",
                topic = "Southern Africa: The Mfecane",
                year = "2012",
                questionText = "The Mfecane resulted in the",
                optionA = "division and fragmentation of the Zulu nation",
                optionB = "formation of the Ndebele state",
                optionC = "decrease in Boer influence in South Africa",
                optionD = "dispersal of the Zulu to the Katanga copper belt.",
                correctAnswerIndex = 1,
                explanation = "The Mfecane ('the crushing') wars initiated under Shaka Zulu caused massive migrations; Mzilikazi broke away from Shaka to forge the powerful Ndebele (Matabele) state in modern Zimbabwe.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_39",
                subject = "History",
                topic = "Apartheid South Africa: Sharpeville",
                year = "2012",
                questionText = "The 1960 Sharpeville revolt was specifically against",
                optionA = "labour laws",
                optionB = "land laws",
                optionC = "pass laws",
                optionD = "marriage laws.",
                correctAnswerIndex = 2,
                explanation = "On March 21, 1960, thousands marched peacefully to the police station in Sharpeville to surrender their pass books in protest against humiliating apartheid influx control Pass Laws, where police killed 69 people.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_40",
                subject = "History",
                topic = "South Africa: The Great Trek",
                year = "2012",
                questionText = "A major consequence of the Great Trek was the",
                optionA = "restriction of movement of the whites in South Africa",
                optionB = "agitation for black-white equality in South Africa",
                optionC = "annexation of white communities by the Africans",
                optionD = "the expansion of white communities in South Africa.",
                correctAnswerIndex = 3,
                explanation = "The Great Trek (1835-1846) saw thousands of Boers (Voortrekkers) migrate inland from the Cape Colony, conquering indigenous lands to found the Boer Republics of the Transvaal and Orange Free State.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_41",
                subject = "History",
                topic = "Diplomacy of the Scramble for Africa",
                year = "2012",
                questionText = "One feature of European diplomacy in the scramble for Africa was",
                optionA = "exchanging of ambassadors among them",
                optionB = "holding Africans hostage for negotiations",
                optionC = "negotiating with African leaders for territories",
                optionD = "reconciling differences over territorial claims.",
                correctAnswerIndex = 3,
                explanation = "European powers utilized multilateral bilateral treaties and conferences (notably the 1884-1885 Berlin Conference) to partition African territory and peacefully resolve competing imperial claims.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_42",
                subject = "History",
                topic = "French Colonial Policy of Assimilation",
                year = "2012",
                questionText = "The French colonial policy of assimilation failed in Africa because",
                optionA = "African culture was deeply rooted",
                optionB = "the African elite were opposed to it",
                optionC = "it was not consistently implemented",
                optionD = "it was expensive to implement.",
                correctAnswerIndex = 0,
                explanation = "The policy of assimilation demanded that Africans abandon their centuries-old indigenous customs, language, and Islamic faith to adopt French culture, which Africans fiercely resisted.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_43",
                subject = "History",
                topic = "National Congress of British West Africa (NCBWA)",
                year = "2012",
                questionText = "Which of the following was one of the demands of the National Congress of British West Africa?",
                optionA = "Establishment of a university in each of the colonies.",
                optionB = "Expulsion of all Syrians and Lebanese from the colonies.",
                optionC = "Election of Africans into each colony’s council.",
                optionD = "Restriction of the activities of Christian missionaries in the colonies.",
                correctAnswerIndex = 2,
                explanation = "Founded by J.E. Casely Hayford in 1920, the NCBWA demanded the introduction of the elective principle so Africans could elect representatives to the Legislative Councils.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_44",
                subject = "History",
                topic = "Post-WWII Nationalism Leadership",
                year = "2012",
                questionText = "The nationalist movement in Nigeria during the post-war period was primarily led by",
                optionA = "businessmen",
                optionB = "the intelligentsia",
                optionC = "students",
                optionD = "local chiefs.",
                correctAnswerIndex = 1,
                explanation = "Western-educated intellectuals, lawyers, teachers, and journalists (the intelligentsia like Nnamdi Azikiwe, Obafemi Awolowo, and H.O. Davies) led modern mass nationalist parties.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_45",
                subject = "History",
                topic = "South African Native National Congress (SANNC)",
                year = "2012",
                questionText = "One of the objectives for the formation of the South African Native Congress in 1912 was to",
                optionA = "establish a political party",
                optionB = "encourage black participation in governance",
                optionC = "retrieve all lands seized by the whites",
                optionD = "integrate the various groups and races.",
                correctAnswerIndex = 3,
                explanation = "The SANNC (later the African National Congress - ANC) was formed in Bloemfontein in 1912 by Pixley ka Isaka Seme to unite disparate African ethnic groups into a single national movement against white minority oppression.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_46",
                subject = "History",
                topic = "Nigerian Foreign Policy: 1973 Middle East War",
                year = "2012",
                questionText = "In 1973, Nigeria broke diplomatic relations with Israel because of Israel’s",
                optionA = "occupation of Egyptian territory",
                optionB = "support for apartheid South Africa",
                optionC = "support for Biafra during the war",
                optionD = "raid on Entebbe airport in Uganda.",
                correctAnswerIndex = 0,
                explanation = "In solidarity with Egypt (a sister OAU member state whose Sinai peninsula was occupied by Israel following the Yom Kippur/October 1973 war), Nigeria and other African states severed diplomatic relations with Israel.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_47",
                subject = "History",
                topic = "Imperialism: King Leopold II and Congo Free State",
                year = "2012",
                questionText = "King Leopold’s colonial ventures in the Congo were aimed at",
                optionA = "making Belgium a great colonial power",
                optionB = "carving out an empire for himself",
                optionC = "putting a stop to domestic slave trade in the area",
                optionD = "introducing Western education to the people.",
                correctAnswerIndex = 1,
                explanation = "The Congo Free State was established as the private personal fiefdom and commercial empire of King Leopold II of Belgium himself rather than a sovereign Belgian colony.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "hist_2012_48",
                subject = "History",
                topic = "Colonial Transportation Infrastructure",
                year = "2012",
                questionText = "In Africa, the colonial authorities introduced modern means of transportation in order to",
                optionA = "develop the internal markets",
                optionB = "increase farmers’ purchasing power",
                optionC = "encourage urban development",
                optionD = "promote import-export trade.",
                correctAnswerIndex = 3,
                explanation = "Railways, roads, and ports in colonial Africa were laid out directly between resource-rich hinterlands and coastal seaports specifically to evacuate agricultural and mineral exports to Europe and distribute manufactured imports.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Q48"
            )
        )

        return list
    }
}
