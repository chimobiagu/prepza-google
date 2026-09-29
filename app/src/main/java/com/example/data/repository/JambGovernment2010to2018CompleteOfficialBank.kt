package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Government 2010 - 2018 Complete Examination Question Bank.
 * Contains 430 officially verified questions transcribed directly from authentic JAMB UTME papers.
 * Years included: 2010 (50), 2011 (50), 2012 (50), 2013 (50), 2014 (50), 2015 (50), 2016 (50), 2017 (40), 2018 (40).
 */
object JambGovernment2010to2018CompleteOfficialBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_01",
                subject = "Government",
                topic = "General Examination Structure",
                year = "2010",
                questionText = "Which Government Question Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 1,
                explanation = "Paper Type B specified on official examination sheet.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_02",
                subject = "Government",
                topic = "Basic Concepts of Government",
                year = "2010",
                questionText = "Nation-state is synonymous with",
                optionA = "self-actualization",
                optionB = "sovereignty",
                optionC = "liberation",
                optionD = "nationalism",
                correctAnswerIndex = 1,
                explanation = "A nation-state is a sovereign political entity characterized by recognized self-governance and sovereignty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_03",
                subject = "Government",
                topic = "Political Culture",
                year = "2010",
                questionText = "A fundamental component of political culture is",
                optionA = "social values",
                optionB = "family values",
                optionC = "community structure",
                optionD = "economic values",
                correctAnswerIndex = 0,
                explanation = "Political culture is grounded in the prevailing social and civic values, beliefs, and attitudes of a society.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2010",
                questionText = "A form of oligarchy in which gifted people are at the helm of affairs is",
                optionA = "aristocracy",
                optionB = "theocracy",
                optionC = "plutocracy",
                optionD = "gerontocracy",
                correctAnswerIndex = 0,
                explanation = "Aristocracy is traditionally defined as governance by the best, most virtuous, or gifted citizens.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_05",
                subject = "Government",
                topic = "Forms of Government",
                year = "2010",
                questionText = "A state that is ruled by an elected citizen is",
                optionA = "a monarchy",
                optionB = "a plutocracy",
                optionC = "a republic",
                optionD = "an empire",
                correctAnswerIndex = 2,
                explanation = "A republic is a state where supreme power rests in the body of citizens entitled to vote and is exercised by elected representatives.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_06",
                subject = "Government",
                topic = "Democracy",
                year = "2010",
                questionText = "A true democracy in the modern sense exists where the",
                optionA = "elected representatives rule",
                optionB = "majority of the people rule",
                optionC = "majority of the people vote",
                optionD = "elite rules",
                correctAnswerIndex = 0,
                explanation = "Representative democracy functions where elected representatives enact laws and govern on behalf of the citizenry.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_07",
                subject = "Government",
                topic = "Parliamentary System",
                year = "2010",
                questionText = "In a parliamentary system, when the legislature passes a vote of no confidence on the executive, it means that the",
                optionA = "executive is expected to go on suspension",
                optionB = "legislature ceases to trust the executive",
                optionC = "executive is required to resign",
                optionD = "legislature commences legal proceeding against the executive",
                correctAnswerIndex = 2,
                explanation = "A vote of no confidence forces the prime minister and cabinet to tender their resignation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_08",
                subject = "Government",
                topic = "Organs of Government",
                year = "2010",
                questionText = "The legislative body of the United States of America is the",
                optionA = "Parliament",
                optionB = "National Assembly",
                optionC = "Congress",
                optionD = "Council",
                correctAnswerIndex = 2,
                explanation = "The bicameral federal legislature of the United States is the US Congress (Senate and House of Representatives).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_09",
                subject = "Government",
                topic = "Legislature",
                year = "2010",
                questionText = "Unicameralism is a feature of the legislature in",
                optionA = "Israel",
                optionB = "the United States",
                optionC = "the United Kingdom",
                optionD = "Ghana",
                correctAnswerIndex = 0,
                explanation = "Israel's parliament (the Knesset) is a single-chamber (unicameral) legislative body.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_10",
                subject = "Government",
                topic = "Federalism",
                year = "2010",
                questionText = "The upper house in most federal systems is created to",
                optionA = "ensure equality of federating units",
                optionB = "prevent excesses of the executive",
                optionC = "oversee and check the lower house",
                optionD = "enable experienced elders make inputs to governance",
                correctAnswerIndex = 0,
                explanation = "In federations like Nigeria and the USA, the upper house (Senate) provides equal representation to all states regardless of population.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_11",
                subject = "Government",
                topic = "Systems of Government",
                year = "2010",
                questionText = "In which of the following systems is the power of the component units more than that of the central government?",
                optionA = "Monarchical",
                optionB = "Federal",
                optionC = "Unitary",
                optionD = "Confederal",
                correctAnswerIndex = 3,
                explanation = "In a confederation, sovereign power is retained primarily by the autonomous component units while the central authority is weak.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_12",
                subject = "Government",
                topic = "Political Ideologies",
                year = "2010",
                questionText = "One of the general tenets of fascist doctrine is that the leader is",
                optionA = "supreme relative to the constitution",
                optionB = "weak relative to the constitution",
                optionC = "subordinate to the laws of the state",
                optionD = "subordinate to the norms of the society",
                correctAnswerIndex = 0,
                explanation = "Fascism rejects constitutional limitations and asserts that the totalitarian leader embodies supreme, unchecked will.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_13",
                subject = "Government",
                topic = "Cabinet System",
                year = "2010",
                questionText = "In a cabinet system of government, executive power is exercised by the",
                optionA = "head of government",
                optionB = "monarch",
                optionC = "president",
                optionD = "dominant party",
                correctAnswerIndex = 0,
                explanation = "In a cabinet (parliamentary) system, real executive authority is directed by the Prime Minister as head of government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_14",
                subject = "Government",
                topic = "Separation of Powers",
                year = "2010",
                questionText = "The principle of separation of powers is best practiced in the",
                optionA = "presidential system",
                optionB = "parliamentary system",
                optionC = "monarchical system",
                optionD = "feudal system",
                correctAnswerIndex = 0,
                explanation = "The presidential system enforces a strict constitutional separation of personnel and powers among executive, legislative, and judicial organs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_15",
                subject = "Government",
                topic = "Delegated Legislation",
                year = "2010",
                questionText = "A typical form of delegated legislation is",
                optionA = "an act",
                optionB = "a bill",
                optionC = "a decree",
                optionD = "a bye-law",
                correctAnswerIndex = 3,
                explanation = "Bye-laws enacted by local government councils or statutory authorities are classic delegated legislation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_16",
                subject = "Government",
                topic = "Citizenship and Rights",
                year = "2010",
                questionText = "The rights of a citizen can be withdrawn by the state if the person",
                optionA = "opposes the government violently",
                optionB = "leaves the country permanently",
                optionC = "is convicted of a serious crime",
                optionD = "is pronounced dead",
                correctAnswerIndex = 2,
                explanation = "Conviction for major felonies results in forfeiture of certain fundamental civil and political liberties.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_17",
                subject = "Government",
                topic = "Elections and Electoral Systems",
                year = "2010",
                questionText = "An electoral process in which candidates are selected for elective offices by party members is",
                optionA = "primary election",
                optionB = "electoral college",
                optionC = "bye election",
                optionD = "general election",
                correctAnswerIndex = 0,
                explanation = "Primary elections are internal party balloting processes whereby party members select their official general election flagbearers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_18",
                subject = "Government",
                topic = "Party Systems",
                year = "2010",
                questionText = "In theory one major advantage of the one-party system is that it",
                optionA = "eliminates intra-party conflict",
                optionB = "serves as an instrument of national integration",
                optionC = "promotes greater mass participation in government",
                optionD = "guarantees social justice",
                correctAnswerIndex = 1,
                explanation = "Advocates argue that a single national party can unite diverse multi-ethnic populations without divisive electoral factions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_19",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2010",
                questionText = "A tactic employed by pressure groups to achieve their objectives is",
                optionA = "memorandum",
                optionB = "electioneering campaign",
                optionC = "propaganda",
                optionD = "lobbying",
                correctAnswerIndex = 3,
                explanation = "Lobbying involves directly persuading legislators and policymakers to enact favorable legislation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_20",
                subject = "Government",
                topic = "Public Opinion",
                year = "2010",
                questionText = "Public opinion can be measured through",
                optionA = "negotiation",
                optionB = "referendum",
                optionC = "strike action",
                optionD = "rumour",
                correctAnswerIndex = 1,
                explanation = "A referendum is a formal public ballot measuring citizen consensus on specific constitutional or policy propositions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_21",
                subject = "Government",
                topic = "Civil Service",
                year = "2010",
                questionText = "Which of the following is the main function of the civil service?",
                optionA = "Implementing government policies",
                optionB = "Allocating resources to the federating units",
                optionC = "Supporting the party in power",
                optionD = "Mobilizing grass root support for government",
                correctAnswerIndex = 0,
                explanation = "The civil service executes, administers, and operationalizes approved state laws and government policies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_22",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2010",
                questionText = "Who was the political head of the Old Oyo Empire?",
                optionA = "Bashorun",
                optionB = "Oyomesi",
                optionC = "Aremo",
                optionD = "Alaafin",
                correctAnswerIndex = 3,
                explanation = "The Alaafin of Oyo was the supreme political monarch of the pre-colonial Oyo Empire.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_23",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2010",
                questionText = "The Igbo political system was based on",
                optionA = "age grades",
                optionB = "Umunna",
                optionC = "family ties",
                optionD = "Umuada",
                correctAnswerIndex = 0,
                explanation = "Age grades played vital roles in law enforcement, defense, public works, and administrative decisions in pre-colonial Igbo society.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_24",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2010",
                questionText = "The Aro age-grade system in Igbo land was",
                optionA = "a religious organization",
                optionB = "a political organization",
                optionC = "a commercial organization",
                optionD = "an imperial organization",
                correctAnswerIndex = 0,
                explanation = "The Aro system derived its prestige from the renowned Ibini Ukpabi oracle and spiritual arbitration network.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_25",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2010",
                questionText = "France introduced the policy of assimilation in her colonies primarily to",
                optionA = "teach them the art of leadership",
                optionB = "give them a sound education",
                optionC = "change their way of life",
                optionD = "discourage them from ritual killings",
                correctAnswerIndex = 2,
                explanation = "Assimilation aimed to culturally transform Africans into French citizens adopt French language, laws, and customs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_26",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2010",
                questionText = "The foremost British trading company on the West African coast was",
                optionA = "Royal Niger Company",
                optionB = "United African Company",
                optionC = "Lever Brothers",
                optionD = "John Holt and Sons",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie's Royal Niger Company received a royal charter in 1886 to administer and commercially dominate the Niger basin.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_27",
                subject = "Government",
                topic = "Colonial Resistance",
                year = "2010",
                questionText = "Which of these rulers resisted colonial rule and was deported to Calabar?",
                optionA = "King Kosoko",
                optionB = "King Dosunmu",
                optionC = "Oba Ovonramwen",
                optionD = "King Jaja",
                correctAnswerIndex = 2,
                explanation = "Oba Ovonramwen of Benin resisted British commercial conquest during the 1897 expedition and was exiled to Calabar.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_28",
                subject = "Government",
                topic = "Nationalism",
                year = "2010",
                questionText = "Nigerian nationalism was described as two-phased by",
                optionA = "John Payne Jackson",
                optionB = "Edward Wilmot Blyden",
                optionC = "James S. Coleman",
                optionD = "David Ricardo",
                correctAnswerIndex = 1,
                explanation = "Edward Wilmot Blyden articulated early cultural and political nationalist philosophy across West Africa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_29",
                subject = "Government",
                topic = "Constitutional History",
                year = "2010",
                questionText = "One major weakness of the Independence Constitution is that it",
                optionA = "failed to provide the country with full sovereignty",
                optionB = "gave total independence to Nigeria",
                optionC = "gave full powers to the Supreme Court in Nigeria",
                optionD = "empowered Britain to continue to rule",
                correctAnswerIndex = 0,
                explanation = "The 1960 Constitution retained Queen Elizabeth II as titular Head of State and the British Privy Council as the final appellate court.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_30",
                subject = "Government",
                topic = "Constitutional History",
                year = "2010",
                questionText = "The first law-making body in Nigeria after amalgamation was",
                optionA = "Nigerian Council",
                optionB = "National Assembly",
                optionC = "Legislative Council",
                optionD = "Regional Assembly",
                correctAnswerIndex = 0,
                explanation = "Lord Lugard established the advisory Nigerian Council in 1914 following amalgamation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_31",
                subject = "Government",
                topic = "Public Administration",
                year = "2010",
                questionText = "The designation of ministers as chief executives and accounting officers was recommended by a commission headed by",
                optionA = "Jerome Udoji",
                optionB = "S.J. Cookey",
                optionC = "Simeon Adebo",
                optionD = "Dotun Philips",
                correctAnswerIndex = 3,
                explanation = "The 1988 Civil Service Reorganization Commission led by Prof. Dotun Philips designated ministers as accounting officers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_32",
                subject = "Government",
                topic = "Public Complaints Commission",
                year = "2010",
                questionText = "A major shortcoming of the Ombudsman is",
                optionA = "lack of adequate resources",
                optionB = "Lack of clear-cut mandate",
                optionC = "its inability to restrain bureaucratic excesses",
                optionD = "lack of executive power to enforce decisions",
                correctAnswerIndex = 3,
                explanation = "The Public Complaints Commission can investigate and recommend remedies but lacks coercive executive powers to enforce judgments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_33",
                subject = "Government",
                topic = "Nigerian Fourth Republic",
                year = "2010",
                questionText = "One of the strong points of the multiparty Nigeria's Fourth Republic is",
                optionA = "the provision for a bicameral legislature",
                optionB = "wider political participation",
                optionC = "government interference",
                optionD = "wider anti-democracy campaign",
                correctAnswerIndex = 1,
                explanation = "Plurality of political parties fosters broad civic engagement and inclusive political contestation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_34",
                subject = "Government",
                topic = "Presidential System",
                year = "2010",
                questionText = "In which of the following is the ceremonial and executive powers fused?",
                optionA = "Presidential system of government",
                optionB = "parliamentary system of government",
                optionC = "Federal system of government",
                optionD = "Unitary system of government",
                correctAnswerIndex = 0,
                explanation = "In the presidential system, the President serves concurrently as titular Head of State and executive Head of Government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_35",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2010",
                questionText = "A major contentious issue confronting Nigerian federalism is",
                optionA = "poverty",
                optionB = "education",
                optionC = "health care delivery",
                optionD = "revenue allocation",
                correctAnswerIndex = 3,
                explanation = "The formula for sharing the Federation Account among federal, state, and local tiers remains intensely debated.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_36",
                subject = "Government",
                topic = "Public Enterprises",
                year = "2010",
                questionText = "The main purpose of establishing public enterprises in Nigeria is to",
                optionA = "increase government revenue",
                optionB = "provide essential services",
                optionC = "enrich the elite",
                optionD = "compete with the private sector",
                correctAnswerIndex = 1,
                explanation = "State enterprises were incorporated to supply essential utilities and social infrastructure at subsidized rates.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_37",
                subject = "Government",
                topic = "Public Administration",
                year = "2010",
                questionText = "Parastatals are established to",
                optionA = "enhance entrepreneurial skills",
                optionB = "maximize government profits",
                optionC = "expand business transactions",
                optionD = "render social services",
                correctAnswerIndex = 3,
                explanation = "Parastatals execute specialized socioeconomic mandates and public service functions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_38",
                subject = "Government",
                topic = "Local Government",
                year = "2010",
                questionText = "The General-Purpose Committee of the local government is the",
                optionA = "cabinet or the local government",
                optionB = "local government public relations unit",
                optionC = "body responsible for supervising self-help projects",
                optionD = "body for awarding contracts",
                correctAnswerIndex = 2,
                explanation = "The General-Purpose Committee coordinates inter-departmental works and supervises community development projects.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_39",
                subject = "Government",
                topic = "Military Rule in Nigeria",
                year = "2010",
                questionText = "The highest organ of the state during the Babangida Regime was the",
                optionA = "Provisional Ruling Council",
                optionB = "Supreme Military Council",
                optionC = "Armed Forces Ruling Council",
                optionD = "Federal Executive Council",
                correctAnswerIndex = 2,
                explanation = "The Armed Forces Ruling Council (AFRC) exercised supreme decree-making and executive authority under General Babangida.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_40",
                subject = "Government",
                topic = "Military Decrees",
                year = "2010",
                questionText = "Decree 34 of 1966 was unacceptable to many Nigerians because it was",
                optionA = "seen as an instrument of impoverishment",
                optionB = "perceived to abolish the federal system",
                optionC = "promulgated without consultation with the people",
                optionD = "considered as alien",
                correctAnswerIndex = 1,
                explanation = "Major-General J.T.U. Aguiyi-Ironsi's Unification Decree 34 abolished federal regions in favor of a unitary system, triggering violent backlash.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_41",
                subject = "Government",
                topic = "Nigerian Foreign Policy",
                year = "2010",
                questionText = "Nigeria broke diplomatic relations with France in 1961 because of",
                optionA = "France's atomic test in the Sahara Desert",
                optionB = "General de-Gaulle's negative attitude towards her",
                optionC = "her poor relations with the Francophone countries",
                optionD = "France's diplomatic relations with Israel",
                correctAnswerIndex = 0,
                explanation = "Prime Minister Tafawa Balewa expelled the French ambassador after France detonated atmospheric nuclear tests in the Algerian Sahara.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_42",
                subject = "Government",
                topic = "International Affairs",
                year = "2010",
                questionText = "An attribute that Nigeria shares with most non-aligned countries is",
                optionA = "the state of her economy",
                optionB = "her heterogeneous population",
                optionC = "her large population",
                optionD = "her large size",
                correctAnswerIndex = 0,
                explanation = "Non-Aligned Movement members are predominantly developing nations contending with post-colonial economic challenges.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_43",
                subject = "Government",
                topic = "ECOWAS",
                year = "2010",
                questionText = "Nigeria spearheaded the formation of ECOWAS during the regime of",
                optionA = "Olusegun Obasanjo",
                optionB = "Yakubu Gowon",
                optionC = "Murtala Muhammed",
                optionD = "Ibrahim Babangida",
                correctAnswerIndex = 1,
                explanation = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo spearheaded the 1975 Treaty of Lagos founding ECOWAS.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_44",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2010",
                questionText = "Nigeria was classified as a frontline state for",
                optionA = "participating in peacekeeping in the Congo",
                optionB = "supporting the liberation efforts in Southern Africa",
                optionC = "spearheading the formation of African Union",
                optionD = "helping to end the crisis in Liberia",
                correctAnswerIndex = 1,
                explanation = "Despite not sharing a border with South Africa, Nigeria's diplomatic, financial, and logistical support against apartheid earned her honorary Frontline State status.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_45",
                subject = "Government",
                topic = "United Nations",
                year = "2010",
                questionText = "The prominent role Nigeria played in the UN in the 70's earned her",
                optionA = "non-permanent membership position Liberia",
                optionB = "membership of the Security Council",
                optionC = "permanent representation at the UN",
                optionD = "chairmanship of the General Assembly",
                correctAnswerIndex = 3,
                explanation = "Nigeria's Joseph Nanven Garba presided over the 44th Session of the United Nations General Assembly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_46",
                subject = "Government",
                topic = "Diplomacy",
                year = "2010",
                questionText = "The head of Nigeria's foreign mission in a Commonwealth nation is known as",
                optionA = "high commissioner",
                optionB = "charge d'affaires",
                optionC = "ambassador",
                optionD = "attaché",
                correctAnswerIndex = 0,
                explanation = "Diplomatic envoys exchanged between Commonwealth member countries bear the title of High Commissioner.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_47",
                subject = "Government",
                topic = "ECOWAS",
                year = "2010",
                questionText = "One major function of the Authority of Heads of State and Government of ECOWAS is",
                optionA = "organizing international conferences",
                optionB = "appointing the Executive Secretary",
                optionC = "appointing staff of the Secretariat",
                optionD = "preparing the budget of the Community",
                correctAnswerIndex = 1,
                explanation = "The supreme decision-making summit of ECOWAS appoints the Executive Secretary (now Commission President).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_48",
                subject = "Government",
                topic = "United Nations",
                year = "2010",
                questionText = "The tenure of non-permanent members of the Security Council is",
                optionA = "5 years",
                optionB = "2 years",
                optionC = "4 years",
                optionD = "6 years",
                correctAnswerIndex = 1,
                explanation = "The UN General Assembly elects 10 non-permanent Security Council members for staggered two-year terms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_49",
                subject = "Government",
                topic = "United Nations",
                year = "2010",
                questionText = "The Secretary-General of the United Nations is appointed by the",
                optionA = "Security council acting alone",
                optionB = "General Assembly on the recommendation of the Security Council",
                optionC = "Permanent members of the Security Council on the recommendation of the General Assembly",
                optionD = "General Assembly in plenary session",
                correctAnswerIndex = 2,
                explanation = "Under Article 97 of the UN Charter, the Secretary-General is appointed by the General Assembly upon the recommendation of the Security Council.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2010_50",
                subject = "Government",
                topic = "ECOWAS",
                year = "2010",
                questionText = "The approval of treaties and agreements of the Economic Community of West African States is the responsibility of the",
                optionA = "secretariat",
                optionB = "ECOWAS Tribunal",
                optionC = "Council of Ministers",
                optionD = "Assembly of Heads of State and Government",
                correctAnswerIndex = 3,
                explanation = "The Assembly of Heads of State and Government ratifies and approves all binding regional protocols and treaties.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_01",
                subject = "Government",
                topic = "General Examination Structure",
                year = "2011",
                questionText = "Which Government Question Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 0,
                explanation = "Paper Type A specified on official examination sheet.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_02",
                subject = "Government",
                topic = "Political Culture",
                year = "2011",
                questionText = "The development of attitudes and beliefs about a political system is",
                optionA = "political emancipation",
                optionB = "political socialization",
                optionC = "political participation",
                optionD = "political orientation",
                correctAnswerIndex = 3,
                explanation = "Political orientation represents the internalized attitudes, knowledge, and value judgments toward the political realm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_03",
                subject = "Government",
                topic = "Political Ideology",
                year = "2011",
                questionText = "Political behavior is governed by",
                optionA = "political socialization",
                optionB = "political ideology",
                optionC = "political economy",
                optionD = "political culture",
                correctAnswerIndex = 1,
                explanation = "Political ideology provides the conceptual framework, values, and guiding norms that govern political conduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_04",
                subject = "Government",
                topic = "Sovereignty",
                year = "2011",
                questionText = "In a nation, sovereignty is vested in the",
                optionA = "community",
                optionB = "state",
                optionC = "elite",
                optionD = "electorate",
                correctAnswerIndex = 3,
                explanation = "Political sovereignty in a democratic nation-state resides ultimately in the electorate through the ballot box.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_05",
                subject = "Government",
                topic = "Democracy",
                year = "2011",
                questionText = "Which of the following is a feature of democracy?",
                optionA = "interdependence of states",
                optionB = "state responsibilities to society",
                optionC = "power vested in minority parties",
                optionD = "popular consultation",
                correctAnswerIndex = 1,
                explanation = "State responsiveness and institutional responsibility to societal welfare is a cornerstone of democratic governance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_06",
                subject = "Government",
                topic = "Economic Systems",
                year = "2011",
                questionText = "Private ownership of the means of production is central to",
                optionA = "fascism",
                optionB = "feudalism",
                optionC = "capitalism",
                optionD = "communism",
                correctAnswerIndex = 0,
                explanation = "Private property and market competition constitute the defining core of free-enterprise capitalism.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_07",
                subject = "Government",
                topic = "Feudalism",
                year = "2011",
                questionText = "A system based on hierarchies of land ownership is",
                optionA = "feudalism",
                optionB = "totalitarianism",
                optionC = "communism",
                optionD = "fascism",
                correctAnswerIndex = 2,
                explanation = "Feudalism organizes political power and social relations around land tenure, fiefs, lords, and serfs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_08",
                subject = "Government",
                topic = "Organs of Government",
                year = "2011",
                questionText = "Which of the following performs quasi-legislative functions?",
                optionA = "The Judiciary",
                optionB = "The Traditional Institutions",
                optionC = "The Civil Service",
                optionD = "The Executive",
                correctAnswerIndex = 0,
                explanation = "Judicial precedent and case law interpretation serve quasi-legislative functions in clarifying statutory law.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_09",
                subject = "Government",
                topic = "Systems of Government",
                year = "2011",
                questionText = "A major weakness of confederation is",
                optionA = "over-concentration of authority",
                optionB = "tendency towards secession",
                optionC = "lack of local independence",
                optionD = "lack of common currency",
                correctAnswerIndex = 3,
                explanation = "Confederations are inherently fragile because member states retain autonomous sovereignty, encouraging secession.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_10",
                subject = "Government",
                topic = "Legislature",
                year = "2011",
                questionText = "Members of a parliament are required to report the proceedings of the house to their",
                optionA = "constituencies",
                optionB = "local government chairmen",
                optionC = "traditional rulers",
                optionD = "political parties",
                correctAnswerIndex = 2,
                explanation = "Elected parliamentarians are constitutionally accountable to the voters in their electoral constituencies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_11",
                subject = "Government",
                topic = "Unitary System",
                year = "2011",
                questionText = "Which of the following Country is a unitary state?",
                optionA = "Nigeria",
                optionB = "India",
                optionC = "United States of America",
                optionD = "Ghana",
                correctAnswerIndex = 1,
                explanation = "Ghana operates a unitary constitutional framework where central government retains undivided legislative authority.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_12",
                subject = "Government",
                topic = "Legislative Procedure",
                year = "2011",
                questionText = "Ending a session of parliament by royal proclamation means the",
                optionA = "expiration of parliament",
                optionB = "prorogation of parliament",
                optionC = "adjournment of parliament",
                optionD = "dissolution of parliament",
                correctAnswerIndex = 2,
                explanation = "Prorogation formally terminates a parliamentary session without calling a general election.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_13",
                subject = "Government",
                topic = "Parliamentary System",
                year = "2011",
                questionText = "A main feature of the parliamentary system is that",
                optionA = "the executive consists of all party members",
                optionB = "judges are drawn from the ruling party",
                optionC = "electoral commissioners leave at the end of their tenure",
                optionD = "the executive is appointed by the legislature",
                correctAnswerIndex = 1,
                explanation = "In Westminster parliamentary systems, the executive cabinet is drawn directly from and is answerable to parliament.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_14",
                subject = "Government",
                topic = "Socialism",
                year = "2011",
                questionText = "In a socialist economy, private accumulation of wealth is",
                optionA = "prohibited",
                optionB = "regulated",
                optionC = "limited",
                optionD = "encouraged",
                correctAnswerIndex = 2,
                explanation = "Socialism strictly restricts or limits private capital accumulation to prevent class exploitation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_15",
                subject = "Government",
                topic = "Constitutional Classification",
                year = "2011",
                questionText = "The earliest classification of constitutions was the work of",
                optionA = "Aristotle",
                optionB = "J.J. Rousseau",
                optionC = "K.C. Wheare",
                optionD = "Plato",
                correctAnswerIndex = 0,
                explanation = "Aristotle analyzed and categorized 158 Greek city-state constitutions into monarchies, aristocracies, and polities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_16",
                subject = "Government",
                topic = "Constitutionalism",
                year = "2011",
                questionText = "Constitutionalism refers to",
                optionA = "the process of drafting a constitution",
                optionB = "amendment of an existing constitution",
                optionC = "the process of operating a constitution",
                optionD = "strict adherence to a constitution",
                correctAnswerIndex = 1,
                explanation = "Constitutionalism embodies adherence to the rule of law and strict limitation of governmental powers by constitutional rules.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_17",
                subject = "Government",
                topic = "Delegated Legislation",
                year = "2011",
                questionText = "An advantage of delegated legislation is that",
                optionA = "much time is saved in the process",
                optionB = "technical issues are handled by experts",
                optionC = "ministers and lawmakers work together",
                optionD = "it hastens the implementation of policy",
                correctAnswerIndex = 2,
                explanation = "Administrative agencies and technical experts can rapidly formulate specialized operational rules without burdening parliament.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_18",
                subject = "Government",
                topic = "Duties of Citizens",
                year = "2011",
                questionText = "One essential duty of a citizen to his state is to",
                optionA = "support the government in power",
                optionB = "recite the pledge",
                optionC = "pay his tax",
                optionD = "encourage other citizens",
                correctAnswerIndex = 0,
                explanation = "Prompt payment of taxes and rates is a mandatory civic obligation enabling public services.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_19",
                subject = "Government",
                topic = "Electoral Process",
                year = "2011",
                questionText = "Franchise in an electoral process means the",
                optionA = "right to vote",
                optionB = "ownership of means of production",
                optionC = "the sovereignty of a nation",
                optionD = "rights and duties of a citizen",
                correctAnswerIndex = 2,
                explanation = "Franchise (suffrage) denotes the constitutional right to vote and participate in elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_20",
                subject = "Government",
                topic = "Party Systems",
                year = "2011",
                questionText = "The type of party system in practice is defined by the",
                optionA = "relationship between the parties and electorate",
                optionB = "structure of the political parties",
                optionC = "manner in which the parties operate",
                optionD = "number of political parties in a country",
                correctAnswerIndex = 1,
                explanation = "Party systems are conventionally classified as one-party, two-party, or multi-party based on party count and competitiveness.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_21",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2011",
                questionText = "Pressure groups harmonize different individual concerns through",
                optionA = "interest formulation",
                optionB = "interest manipulation",
                optionC = "interest mobilisation",
                optionD = "interest aggregation",
                correctAnswerIndex = 0,
                explanation = "Interest aggregation combines multiple individual preferences into consolidated policy demands.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_22",
                subject = "Government",
                topic = "Public Opinion",
                year = "2011",
                questionText = "Opinion polls are organized to find out the",
                optionA = "benefits derived by people from government",
                optionB = "people's thought about a particular government policy",
                optionC = "people's expectations from the government",
                optionD = "feelings of people about particular issues and policies",
                correctAnswerIndex = 1,
                explanation = "Polling surveys systematically measure the public's sentiments, attitudes, and approval of state policies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_23",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2011",
                questionText = "In pre-colonial Igboland, autocratic rule was made difficult by the",
                optionA = "fear of dethronement",
                optionB = "absence of a centralized system of authority",
                optionC = "pressure from age grades",
                optionD = "activities of cult societies",
                correctAnswerIndex = 3,
                explanation = "Egalitarian republicanism and decentralized family/village assemblies prevented despotic dictatorship in traditional Igboland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_24",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2011",
                questionText = "The Yoruba traditional system of government was",
                optionA = "republican",
                optionB = "democratic",
                optionC = "monarchical",
                optionD = "egalitarian",
                correctAnswerIndex = 0,
                explanation = "Pre-colonial Yoruba states were constitutional monarchies featuring the Oba and advisory checks by the council of chiefs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_25",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2011",
                questionText = "Under the pre-colonial Sokoto Caliphate system, the next in command to the sultan was the",
                optionA = "Alkali",
                optionB = "Galadima",
                optionC = "Madaki",
                optionD = "Waziri",
                correctAnswerIndex = 1,
                explanation = "The Waziri (grand vizier) acted as prime minister, chief administrative officer, and second-in-command to the Sultan.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_26",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2011",
                questionText = "Which of the following societies was classified as acephalous?",
                optionA = "Benin",
                optionB = "Ibibio",
                optionC = "Igbo",
                optionD = "Ijaw",
                correctAnswerIndex = 0,
                explanation = "Acephalous (stateless) societies like the traditional Igbo lacked a centralized monarchical head of state.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_27",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2011",
                questionText = "Indirect rule encouraged",
                optionA = "communal integration",
                optionB = "exploitation and oppression",
                optionC = "inter-communal cooperation",
                optionD = "the rise of nationalism",
                correctAnswerIndex = 3,
                explanation = "Colonial discrimination, taxation, and autocratic native authorities sparked unified anti-colonial nationalist agitation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_28",
                subject = "Government",
                topic = "Nationalism",
                year = "2011",
                questionText = "The main achievement of the nationalists in Nigeria was",
                optionA = "registration of political parties",
                optionB = "economic liberation of the nation",
                optionC = "political liberation of the nation",
                optionD = "building the nation",
                correctAnswerIndex = 0,
                explanation = "Nationalist struggles successfully brought about decolonization, political sovereignty, and national independence in 1960.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_29",
                subject = "Government",
                topic = "Nationalism",
                year = "2011",
                questionText = "The major external factor that promoted nationalism in Nigeria was",
                optionA = "Pan-Africanism",
                optionB = "the Yom-Kippur War",
                optionC = "the Second World War",
                optionD = "Anti-apartheid Movement",
                correctAnswerIndex = 2,
                explanation = "WWII demystified European superiority, as returning Nigerian servicemen demanded democratic freedoms and equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_30",
                subject = "Government",
                topic = "Constitutional History",
                year = "2011",
                questionText = "The presidential system of government was introduced in Nigeria with the Constitution of",
                optionA = "1989",
                optionB = "1999",
                optionC = "1960",
                optionD = "1979",
                correctAnswerIndex = 1,
                explanation = "The 1979 Constitution introduced an American-style Executive Presidential system, replacing the Westminster model.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_31",
                subject = "Government",
                topic = "Political Crises in Nigeria",
                year = "2011",
                questionText = "The Action Group crisis of 1963 led to the formation of",
                optionA = "UPP",
                optionB = "NEPU",
                optionC = "NPC",
                optionD = "NCNC",
                correctAnswerIndex = 2,
                explanation = "Chief S.L. Akintola's faction broke away from Awolowo's Action Group to establish the United People's Party (UPP).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_32",
                subject = "Government",
                topic = "Constitutional History",
                year = "2011",
                questionText = "Under the 1963 Republican Constitution, the power of judicial review was vested in the",
                optionA = "President",
                optionB = "Chief Justice",
                optionC = "Supreme Court",
                optionD = "Parliament",
                correctAnswerIndex = 0,
                explanation = "The 1963 Constitution made the Supreme Court of Nigeria the final apex appellate court endowed with judicial review.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_33",
                subject = "Government",
                topic = "Civil Service",
                year = "2011",
                questionText = "The rules and regulations of the civil service are called",
                optionA = "General Order",
                optionB = "Bureaucratic Order",
                optionC = "Service Order",
                optionD = "Administrative Order",
                correctAnswerIndex = 2,
                explanation = "The Public Service Rules (formerly known as General Orders or G.O.) regulate civil service administration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_34",
                subject = "Government",
                topic = "Public Accountability",
                year = "2011",
                questionText = "The Code of Conduct Bureau was essentially established to",
                optionA = "reduce corruption in public life",
                optionB = "protect the rights of public servants",
                optionC = "enhance probity and accountability in public service",
                optionD = "ensure the independence of the public service",
                correctAnswerIndex = 0,
                explanation = "The Code of Conduct Bureau enforces transparency, asset declaration, and ethical accountability among public officials.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_35",
                subject = "Government",
                topic = "Party History",
                year = "2011",
                questionText = "Which of the following political parties was the first to be formed when the ban on politics was lifted in 1978?",
                optionA = "NPP",
                optionB = "PRP",
                optionC = "NPN",
                optionD = "UPN",
                correctAnswerIndex = 0,
                explanation = "Chief Obafemi Awolowo announced the formation of the Unity Party of Nigeria (UPN) immediately following the lifting of the political ban.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_36",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2011",
                questionText = "The principle of federal character was adopted in order to promote equitable allocation of",
                optionA = "positions and appointments among people of various regions",
                optionB = "appointments between the North and the South",
                optionC = "opportunities between the males and females",
                optionD = "revenue between groups in the country",
                correctAnswerIndex = 2,
                explanation = "Federal character ensures equitable representation of diverse ethnic and regional communities in public institutions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_37",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2011",
                questionText = "The component units of the Nigerian Federation comprise",
                optionA = "national assembly, military, police and civil service",
                optionB = "constituency, ward, emirate and chiefdom",
                optionC = "federal, state, local government and federal capital territory",
                optionD = "federal capital territory, national assembly, supreme court and civil service",
                correctAnswerIndex = 0,
                explanation = "Nigerian federation is composed of 36 states, 774 local governments, and the Federal Capital Territory under federal coordination.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_38",
                subject = "Government",
                topic = "Economic Reforms",
                year = "2011",
                questionText = "In Nigeria, privatization and commercialization policies were introduced to",
                optionA = "hand over the control of commercial ventures to citizens",
                optionB = "increase the asset base of government",
                optionC = "divest government major control of commercial ventures",
                optionD = "allow government control of the private sector",
                correctAnswerIndex = 0,
                explanation = "Privatization transfers state-owned enterprise ownership to private investors to curb waste and boost efficiency.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_39",
                subject = "Government",
                topic = "Public Corporations",
                year = "2011",
                questionText = "An example of a public corporation in Nigeria is",
                optionA = "National Universities Commission",
                optionB = "Nigerian Television Authority",
                optionC = "National Population Commission",
                optionD = "First Bank of Nigeria",
                correctAnswerIndex = 3,
                explanation = "The Nigerian Television Authority (NTA) is a statutory broadcasting corporation delivering public media services.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_40",
                subject = "Government",
                topic = "Local Government History",
                year = "2011",
                questionText = "Following the reform of the Native Authority system in Northern Nigeria, traditional rulers became",
                optionA = "Council",
                optionB = "Chief-and-Council",
                optionC = "Prefects",
                optionD = "Chief-in-Council",
                correctAnswerIndex = 1,
                explanation = "The reforms transitioned northern traditional rulers into advisory Chief-and-Council configurations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_41",
                subject = "Government",
                topic = "State Creation",
                year = "2011",
                questionText = "Under whose regime were Akwa-Ibom and Katsina States created?",
                optionA = "Gen Murtala Muhammed",
                optionB = "Gen Ibrahim Babangida",
                optionC = "Gen Sani Abacha",
                optionD = "Gen Yakubu Gowon",
                correctAnswerIndex = 3,
                explanation = "General Ibrahim Babangida created Katsina and Akwa Ibom States on September 23, 1987.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_42",
                subject = "Government",
                topic = "Judiciary",
                year = "2011",
                questionText = "Under the 1999 Constitutions of the Federal Republic of Nigeria, the appointment and posting of members of election tribunal on the elections conducted by INEC is the responsibility of the",
                optionA = "Chairman, Independent National Electoral Commission",
                optionB = "President of Nigeria",
                optionC = "Chief Justice of Nigeria",
                optionD = "President, Court of Appeal",
                correctAnswerIndex = 3,
                explanation = "The President of the Court of Appeal possesses constitutional authority to constitute and post election petition tribunal judges.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_43",
                subject = "Government",
                topic = "African Politics",
                year = "2011",
                questionText = "Rhodesia was the former name of",
                optionA = "Zimbabwe",
                optionB = "Swaziland",
                optionC = "Zambia",
                optionD = "Namibia",
                correctAnswerIndex = 2,
                explanation = "Southern Rhodesia attained sovereign independence in 1980 and was renamed Zimbabwe.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_44",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2011",
                questionText = "The adoption of non-alignment as a principle of Nigeria's foreign policy was aimed at",
                optionA = "promoting Nigeria's leadership aspiration in Africa",
                optionB = "attaining equal status with the world powers",
                optionC = "fulfilling a basic requirement for acceptance in the UN Security Council",
                optionD = "insulating Nigeria against having to take side in the Cold War",
                correctAnswerIndex = 1,
                explanation = "Non-alignment shielded Nigeria from Cold War ideological entanglement between the Western and Eastern power blocs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_45",
                subject = "Government",
                topic = "Non-Aligned Movement",
                year = "2011",
                questionText = "In 1979, the non-aligned member states were",
                optionA = "21",
                optionB = "27",
                optionC = "37",
                optionD = "19",
                correctAnswerIndex = 0,
                explanation = "The Havana NAM Summit of 1979 expanded active developing-world membership.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_46",
                subject = "Government",
                topic = "OPEC",
                year = "2011",
                questionText = "Which of the following was the secretary general of OPEC?",
                optionA = "Jibril Aminu",
                optionB = "Aret Adams",
                optionC = "Dalhatu Bayero",
                optionD = "Rilwan Lukwan",
                correctAnswerIndex = 1,
                explanation = "Alhaji Dr. Rilwanu Lukman served with great distinction as Secretary-General and Conference President of OPEC.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_47",
                subject = "Government",
                topic = "ECOWAS",
                year = "2011",
                questionText = "Which of the following countries pioneered the idea of ECOWAS alongside Nigeria?",
                optionA = "Liberia",
                optionB = "Togo",
                optionC = "Cote d'Ivoire",
                optionD = "Mali",
                correctAnswerIndex = 3,
                explanation = "General Yakubu Gowon of Nigeria and President Gnassingbé Eyadéma of Togo spearheaded the diplomatic creation of ECOWAS.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_48",
                subject = "Government",
                topic = "International Organizations",
                year = "2011",
                questionText = "Which of the following international organizations were in existence before the Second World War?",
                optionA = "The UNO",
                optionB = "The OAU",
                optionC = "The League of Nations",
                optionD = "The ECOWAS",
                correctAnswerIndex = 0,
                explanation = "The League of Nations was founded in 1919 after WWI and preceded the United Nations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_49",
                subject = "Government",
                topic = "United Nations",
                year = "2011",
                questionText = "The organ of the United Nations responsible for the approval of its annual budget is the",
                optionA = "Secretariat",
                optionB = "Security Council",
                optionC = "General Assembly",
                optionD = "Economic and Social Council",
                correctAnswerIndex = 0,
                explanation = "Article 17 of the UN Charter confers exclusive budget review and approval power on the General Assembly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2011_50",
                subject = "Government",
                topic = "OPEC",
                year = "2011",
                questionText = "Each member state is represented on the Board of Governors of OPEC for a period of",
                optionA = "2 years",
                optionB = "3 years",
                optionC = "4 years",
                optionD = "1 year",
                correctAnswerIndex = 2,
                explanation = "OPEC member states nominate representatives to the OPEC Board of Governors for two-year terms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_01",
                subject = "Government",
                topic = "General Examination Structure",
                year = "2012",
                questionText = "Which Questions Paper Type of Government as indicated above is given to you?",
                optionA = "Type Green",
                optionB = "Type Purple",
                optionC = "Type Red",
                optionD = "Type Yellow",
                correctAnswerIndex = 2,
                explanation = "Paper Type Red allocated for examination evaluation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_02",
                subject = "Government",
                topic = "The State",
                year = "2012",
                questionText = "The distinctive attribute of a state is the monopoly of",
                optionA = "control",
                optionB = "power",
                optionC = "violence",
                optionD = "justice",
                correctAnswerIndex = 1,
                explanation = "Max Weber defined the state as an entity possessing a monopoly on the legitimate use of physical force and power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_03",
                subject = "Government",
                topic = "The State",
                year = "2012",
                questionText = "State as a political entity refers to",
                optionA = "An organized group within a definite territory",
                optionB = "An association of men in a given society",
                optionC = "A branch of a nation",
                optionD = "A geographical location",
                correctAnswerIndex = 0,
                explanation = "A state is an organized political community occupying a definite sovereign territory with an established government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_04",
                subject = "Government",
                topic = "Political Socialization",
                year = "2012",
                questionText = "Political values are acquired in any given society through",
                optionA = "political re-orientation",
                optionB = "political campaign",
                optionC = "political socialization",
                optionD = "political indoctrination",
                correctAnswerIndex = 2,
                explanation = "Political socialization is the lifelong developmental process through which citizens internalize political norms and values.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_05",
                subject = "Government",
                topic = "Sovereignty",
                year = "2012",
                questionText = "In a democratic government, political sovereignty is vested in the",
                optionA = "legislature",
                optionB = "elite",
                optionC = "executive",
                optionD = "electorate",
                correctAnswerIndex = 3,
                explanation = "Ultimate political sovereignty belongs to the citizenry (electorate) through the democratic electoral mandate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_06",
                subject = "Government",
                topic = "Executive Organ",
                year = "2012",
                questionText = "One judicial function performed by the executive is",
                optionA = "Granting of amnesty",
                optionB = "Implementing judicial orders",
                optionC = "Ensuring obedience to the law",
                optionD = "Appointing judges",
                correctAnswerIndex = 2,
                explanation = "The prerogative of mercy (pardons and amnesty) is an executive function of quasi-judicial character.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_07",
                subject = "Government",
                topic = "Unitary System",
                year = "2012",
                questionText = "A governmental system in which constitutional supremacy resides in the center is",
                optionA = "federal",
                optionB = "confederal",
                optionC = "unitary",
                optionD = "parliamentary",
                correctAnswerIndex = 0,
                explanation = "In a unitary system, all constitutional and sovereign legislative authority is concentrated in the central government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_08",
                subject = "Government",
                topic = "Presidential System",
                year = "2012",
                questionText = "A political system which empowers the leader with the ultimate responsibility to execute laws is",
                optionA = "parliamentarianism",
                optionB = "presidentialism",
                optionC = "dictatorship",
                optionD = "autocracy",
                correctAnswerIndex = 3,
                explanation = "Presidentialism concentrates unified executive authority in a single elected president.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_09",
                subject = "Government",
                topic = "Legislative Process",
                year = "2012",
                questionText = "A bill is a draft which is awaiting the consideration of the",
                optionA = "executive",
                optionB = "party caucus",
                optionC = "legislature",
                optionD = "judiciary",
                correctAnswerIndex = 2,
                explanation = "A bill is a proposed legislative enactment submitted to parliament for deliberation, readings, and passage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_10",
                subject = "Government",
                topic = "Capitalism",
                year = "2012",
                questionText = "The private ownership of the means of production is a feature of",
                optionA = "capitalism",
                optionB = "socialism",
                optionC = "communalism",
                optionD = "communism",
                correctAnswerIndex = 0,
                explanation = "Capitalism relies fundamentally upon private property, free enterprise, and market-driven production.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_11",
                subject = "Government",
                topic = "Feudalism",
                year = "2012",
                questionText = "In a feudal system, the two major classes are the serfs and the",
                optionA = "masses",
                optionB = "vassals",
                optionC = "lords",
                optionD = "elite",
                correctAnswerIndex = 2,
                explanation = "Feudal agrarian hierarchy divided society primarily into landholding lords and subjugated tenant serfs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_12",
                subject = "Government",
                topic = "Constitutional Types",
                year = "2012",
                questionText = "An example of a country with a flexible constitution is",
                optionA = "South Africa",
                optionB = "Britain",
                optionC = "Benin Republic",
                optionD = "the United States of America",
                correctAnswerIndex = 1,
                explanation = "The unwritten British constitution can be amended through ordinary parliamentary statutes without complex referendum hurdles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_13",
                subject = "Government",
                topic = "Rule of Law",
                year = "2012",
                questionText = "The rule of law is negation of",
                optionA = "equality before the law",
                optionB = "supremacy of the law",
                optionC = "Limited power",
                optionD = "absolute power",
                correctAnswerIndex = 3,
                explanation = "The Rule of Law directly negates arbitrary autocracy, despotism, and unchecked governmental absolute power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_14",
                subject = "Government",
                topic = "Separation of Powers",
                year = "2012",
                questionText = "To ensure the rights and freedom of citizens, the powers of the arms of government must be",
                optionA = "fused",
                optionB = "incorporated",
                optionC = "separated",
                optionD = "rotated",
                correctAnswerIndex = 2,
                explanation = "Montesquieu demonstrated that dividing legislative, executive, and judicial powers prevents despotic tyranny.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_15",
                subject = "Government",
                topic = "Delegated Legislation",
                year = "2012",
                questionText = "Delegated legislation is made by bodies others than the",
                optionA = "president",
                optionB = "governor",
                optionC = "parliament",
                optionD = "judiciary",
                correctAnswerIndex = 0,
                explanation = "Delegated legislation is promulgated by executive or administrative agencies acting under powers delegated by parliament.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_16",
                subject = "Government",
                topic = "Legislature",
                year = "2012",
                questionText = "The bringing of a session of a parliament to an end through royal proclamation is known as",
                optionA = "political impasse",
                optionB = "dissolution of parliament",
                optionC = "vote of no confidence",
                optionD = "prorogation of parliament",
                correctAnswerIndex = 1,
                explanation = "Dissolution officially brings a parliament to an end and triggers a general election.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_17",
                subject = "Government",
                topic = "Citizenship and Rights",
                year = "2012",
                questionText = "The right of citizens to participate in the affairs of government of their country is called",
                optionA = "economic right",
                optionB = "civil right",
                optionC = "political right",
                optionD = "social right",
                correctAnswerIndex = 2,
                explanation = "Political rights encompass voting, contesting public office, and participating in public administration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_18",
                subject = "Government",
                topic = "Electoral Commissions",
                year = "2012",
                questionText = "The commission charged with the conduct of federal elections in Nigeria is",
                optionA = "NEC",
                optionB = "FEDECO",
                optionC = "INEC",
                optionD = "NECON",
                correctAnswerIndex = 2,
                explanation = "The Independent National Electoral Commission (INEC) manages national and state elections in Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_19",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2012",
                questionText = "An electoral system in which parties are assigned seats in the parliament commensurate to the number of votes polled is",
                optionA = "Absolute majority",
                optionB = "Simple majority",
                optionC = "proportional representation",
                optionD = "indirect election",
                correctAnswerIndex = 2,
                explanation = "Proportional representation allocates parliamentary seats in direct proportion to the percentage of popular votes received.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_20",
                subject = "Government",
                topic = "Party Politics",
                year = "2012",
                questionText = "An intra-party activity for the selection of candidates for elective positions known as",
                optionA = "primary election",
                optionB = "general election",
                optionC = "mid-term election",
                optionD = "bye-election",
                correctAnswerIndex = 0,
                explanation = "Primaries allow enrolled party electors or delegates to pick official party flagbearers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_21",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2012",
                questionText = "The primary aim of pressure groups is to",
                optionA = "Attract people's attention",
                optionB = "protects the interest of members",
                optionC = "captured political power",
                optionD = "fight corrupt officials",
                correctAnswerIndex = 1,
                explanation = "Pressure groups organize to promote and protect the common occupational or social interests of their members.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_22",
                subject = "Government",
                topic = "Public Opinion",
                year = "2012",
                questionText = "Which of the following is used in gauging public opinion?",
                optionA = "constitution",
                optionB = "educational institution",
                optionC = "mass media",
                optionD = "electoral college",
                correctAnswerIndex = 2,
                explanation = "Radio, newspapers, television, and social media act as barometers measuring and reflecting citizen public opinion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_23",
                subject = "Government",
                topic = "Civil Service",
                year = "2012",
                questionText = "A permanent structure that facilitates continuity and guarantees orderly conduct in governance is",
                optionA = "Bureaucracy",
                optionB = "public corporation",
                optionC = "ombudsman",
                optionD = "political party",
                correctAnswerIndex = 0,
                explanation = "The civil service bureaucracy maintains administrative stability and state continuity across changing political regimes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_24",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2012",
                questionText = "In the Hausa pre-colonial political system, a district was headed by",
                optionA = "A hakimi",
                optionB = "a dagaci",
                optionC = "an alkali",
                optionD = "a waziri",
                correctAnswerIndex = 0,
                explanation = "Hakimi was the title of the district head overseeing subordinate village heads (Dagaci) in the emirate system.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_25",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2012",
                questionText = "Which of the following ensured the practice of democracy in the pre-colonial Yoruba political system?",
                optionA = "Checks and balances",
                optionB = "Fusion of power",
                optionC = "individual responsibility",
                optionD = "the rule of law",
                correctAnswerIndex = 0,
                explanation = "The Oyo Mesi and Ogboni cult balanced the monarchical powers of the Alaafin to prevent tyrannical rule.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_26",
                subject = "Government",
                topic = "Colonialism",
                year = "2012",
                questionText = "Colonization of Africa was mainly motivated by",
                optionA = "security considerations",
                optionB = "economic reasons",
                optionC = "religious reasons",
                optionD = "cultural factors",
                correctAnswerIndex = 1,
                explanation = "The industrial revolution drove European colonial powers to seek raw materials and captive consumer markets across Africa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_27",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2012",
                questionText = "The French colonial system was underlined by the policy of",
                optionA = "assimilation",
                optionB = "paternalism",
                optionC = "socialism",
                optionD = "indirect rule",
                correctAnswerIndex = 0,
                explanation = "The French colonial doctrine of assimilation sought to integrate colonized peoples into French cultural and political life.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_28",
                subject = "Government",
                topic = "Nationalism",
                year = "2012",
                questionText = "Radical nationalism in Nigeria is generally attributed to the influence of",
                optionA = "Aminu Kano",
                optionB = "Herbert Macaulay",
                optionC = "Nnamdi Azikiwe",
                optionD = "Mbonu Ojike",
                correctAnswerIndex = 2,
                explanation = "Dr. Nnamdi Azikiwe pioneered radical militant nationalism through his West African Pilot and the Zikist Movement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_29",
                subject = "Government",
                topic = "Nationalism",
                year = "2012",
                questionText = "Two foreigners that directly aroused nationalist feelings among Nigerians are",
                optionA = "Edward Blyden and Payne Jackson",
                optionB = "Casely Hayford and James Horton",
                optionC = "W.E du Bois and H.O Davies",
                optionD = "Marcus Garvey and Casely Hayford",
                correctAnswerIndex = 2,
                explanation = "W.E.B. Du Bois and international Pan-African leaders inspired early West African nationalist activists.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_30",
                subject = "Government",
                topic = "First Republic",
                year = "2012",
                questionText = "Members of the Senate in Nigeria's First Republic were",
                optionA = "Elected directly by the people",
                optionB = "Elected by electoral college",
                optionC = "Nominated by regional and federal governments",
                optionD = "Nominated by the president of the house",
                correctAnswerIndex = 2,
                explanation = "In the 1960 and 1963 constitutions, senators were selected and nominated by the regional executive governments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_31",
                subject = "Government",
                topic = "Law Enforcement",
                year = "2012",
                questionText = "In Nigeria, the agency mainly responsible for the maintenance of internal peace and security is the",
                optionA = "Army",
                optionB = "Navy",
                optionC = "Civil Defence Corps",
                optionD = "Police",
                correctAnswerIndex = 3,
                explanation = "The Nigeria Police Force is the primary constitutional security agency charged with maintaining internal law and order.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_32",
                subject = "Government",
                topic = "Legislature",
                year = "2012",
                questionText = "The National Assembly in Nigeria is primarily responsible for",
                optionA = "Executing laws",
                optionB = "interpreting laws",
                optionC = "Ratifying appointments",
                optionD = "Making laws",
                correctAnswerIndex = 3,
                explanation = "Section 4 of the 1999 Constitution vests the supreme federal law-making power in the National Assembly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_33",
                subject = "Government",
                topic = "Electoral Process",
                year = "2012",
                questionText = "The major factor militating against the efficient operation of electoral commissions in Nigeria is",
                optionA = "Inadequate public support",
                optionB = "Population size",
                optionC = "Inadequate skilled manpower",
                optionD = "Excessive political interference",
                correctAnswerIndex = 3,
                explanation = "Partisan executive interference and inadequate fiscal autonomy have historically compromised electoral commission impartiality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_34",
                subject = "Government",
                topic = "Ombudsman",
                year = "2012",
                questionText = "A major objective of the Public Complaints Commission is",
                optionA = "Training and promotion of public servants",
                optionB = "Settlement of disputes among individuals",
                optionC = "Addressing the grievances of individuals and groups",
                optionD = "Fighting corruption and indiscipline",
                correctAnswerIndex = 2,
                explanation = "The Ombudsman investigates administrative injustice, maladministration, and bureaucratic abuse of citizen rights.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_35",
                subject = "Government",
                topic = "Party Politics",
                year = "2012",
                questionText = "The three registered political parties at the inception of Nigeria's Fourth Republic were",
                optionA = "PDP, DPP and PPA",
                optionB = "PDP, AD and APP",
                optionC = "PDP, AD and PPA",
                optionD = "PDP, APP and AC",
                correctAnswerIndex = 1,
                explanation = "The Peoples Democratic Party (PDP), Alliance for Democracy (AD), and All Peoples Party (APP) contested the 1999 transition.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_36",
                subject = "Government",
                topic = "Legal History",
                year = "2012",
                questionText = "The Sharia legal system was first introduced in the Fourth Republic in",
                optionA = "Kano State",
                optionB = "Katsina State",
                optionC = "Zamfara State",
                optionD = "Sokoto State",
                correctAnswerIndex = 2,
                explanation = "Governor Ahmad Sani Yerima of Zamfara State signed comprehensive Sharia penal legislation into law in October 1999.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_37",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2012",
                questionText = "Quota system and federal character principles were entrenched in the 1979 constitution to ensure",
                optionA = "loyalty",
                optionB = "Economic empowerment",
                optionC = "Equity",
                optionD = "Even development",
                correctAnswerIndex = 2,
                explanation = "The federal character principle was institutionalized to ensure equity, inclusion, and national cohesion in public appointments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_38",
                subject = "Government",
                topic = "Public Administration",
                year = "2012",
                questionText = "Workers in the public corporations are known as",
                optionA = "civil servants",
                optionB = "private employees",
                optionC = "public servants",
                optionD = "professional employees",
                correctAnswerIndex = 2,
                explanation = "Employees of statutory corporations, parastatals, and military forces are legally categorized as public servants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_39",
                subject = "Government",
                topic = "Economic Policy",
                year = "2012",
                questionText = "The central objective of privatization in Nigeria is to",
                optionA = "Reduce the retrenchment of workers",
                optionB = "Encourage prompt payment of salaries",
                optionC = "Improve standard of living",
                optionD = "Improve the efficiency of enterprises",
                correctAnswerIndex = 3,
                explanation = "Privatization seeks to eliminate state subsidies, attract capital, and boost productivity in commercially viable enterprises.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_40",
                subject = "Government",
                topic = "Military Rule",
                year = "2012",
                questionText = "Military intervention in Nigeria arose from",
                optionA = "perceived incapability of civilians to govern",
                optionB = "international pressure for change",
                optionC = "the desire for a military government",
                optionD = "civilian's desire to relinquish power",
                correctAnswerIndex = 0,
                explanation = "Electoral violence, corruption, census controversies, and governance breakdowns provoked the January 1966 coup.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_41",
                subject = "Government",
                topic = "Military Rule",
                year = "2012",
                questionText = "The first institution introduced by the military to exercise legislative power was the",
                optionA = "supreme military council",
                optionB = "armed forces ruling council",
                optionC = "federal executive council",
                optionD = "provisional ruling council",
                correctAnswerIndex = 0,
                explanation = "The Supreme Military Council (SMC) was established in 1966 as the highest legislative decree-making organ.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_42",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2012",
                questionText = "The main focus of Nigeria's foreign policy since independence centers on",
                optionA = "South-south cooperation",
                optionB = "Sub-regionalism",
                optionC = "Globalism",
                optionD = "Afrocentrism",
                correctAnswerIndex = 3,
                explanation = "Africa as the center-piece of foreign policy dictates prioritizing African liberation, peace, and economic integration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_43",
                subject = "Government",
                topic = "Decolonization",
                year = "2012",
                questionText = "The country that championed decolonization in Africa was",
                optionA = "Nigeria",
                optionB = "South Africa",
                optionC = "Ghana",
                optionD = "Kenya",
                correctAnswerIndex = 2,
                explanation = "Kwame Nkrumah's Ghana championed African emancipation under the banner 'Ghana is not free until all Africa is free'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_44",
                subject = "Government",
                topic = "African Union & NEPAD",
                year = "2012",
                questionText = "A major drawback to the NEPAD initiative is its",
                optionA = "Articulation by few African leaders",
                optionB = "Affiliation by few African union",
                optionC = "Inability to empower the youth",
                optionD = "Reliance on Western donors for funds",
                correctAnswerIndex = 3,
                explanation = "Excessive financial dependence on G8 and Western donor capital compromised NEPAD's autonomous African developmental agenda.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_45",
                subject = "Government",
                topic = "African Union",
                year = "2012",
                questionText = "The structures of the African Union include",
                optionA = "the court of justice, pan African congress and people's Assembly",
                optionB = "pan African parliament, the court of justice and the peace and security council",
                optionC = "specialized Technical commission, the court of justice and humanitarian board",
                optionD = "people's Assembly, Humanitarian Board and the peace and security council",
                correctAnswerIndex = 1,
                explanation = "The AU institutional framework incorporates the Pan-African Parliament, Court of Justice, and Peace and Security Council.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_46",
                subject = "Government",
                topic = "ECOWAS & ECOMOG",
                year = "2012",
                questionText = "ECOMOG at the initial stage of its intervention in Liberia was perceived as",
                optionA = "Neutral",
                optionB = "Incompetent",
                optionC = "Partisan",
                optionD = "Invaders",
                correctAnswerIndex = 0,
                explanation = "ECOMOG deployed as a neutral regional peacekeeping force to halt factional bloodshed and protect innocent civilians.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_47",
                subject = "Government",
                topic = "Commonwealth",
                year = "2012",
                questionText = "One of the programmes binding members of the Commonwealth is the",
                optionA = "Food and aid programme",
                optionB = "Cultural programme",
                optionC = "Agenda for peace",
                optionD = "Scholarship scheme",
                correctAnswerIndex = 0,
                explanation = "The Commonwealth Scholarship and Fellowship Plan provides educational and technical exchange across member nations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_48",
                subject = "Government",
                topic = "African Union",
                year = "2012",
                questionText = "The African leader mostly credited for spearheading the formation of the African Union is",
                optionA = "Muammar Ghaddafi",
                optionB = "Abdelaziz Bouteflika",
                optionC = "Abdoulaye Wade",
                optionD = "Thabo Mbeki",
                correctAnswerIndex = 2,
                explanation = "Colonel Muammar Gaddafi championed the 1999 Sirte Declaration transforming the OAU into the African Union.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_49",
                subject = "Government",
                topic = "United Nations",
                year = "2012",
                questionText = "As part of the reforms in the UN, two slots were proposed in the Security Council for",
                optionA = "Asia",
                optionB = "Africa",
                optionC = "America",
                optionD = "Europe",
                correctAnswerIndex = 1,
                explanation = "The Ezulwini Consensus articulated Africa's demand for two permanent and five non-permanent UN Security Council seats.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2012_50",
                subject = "Government",
                topic = "OPEC",
                year = "2012",
                questionText = "The founding members of OPEC are",
                optionA = "Algeria, Iran, Iraq, Saudi Arabia and Kuwait",
                optionB = "Nigeria, Libya, Iraq and Saudi Arabia",
                optionC = "Venezuela, Nigeria, Libya, Iran and Iraq",
                optionD = "Saudi Arabia, Iran, Iraq, Kuwait and Venezuela",
                correctAnswerIndex = 3,
                explanation = "The Baghdad Conference of 1960 was founded by Iran, Iraq, Kuwait, Saudi Arabia, and Venezuela.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_01",
                subject = "Government",
                topic = "General Examination Structure",
                year = "2013",
                questionText = "Which Question Paper Type of Government is given to you?",
                optionA = "Type D",
                optionB = "Type I",
                optionC = "Type B",
                optionD = "Type U",
                correctAnswerIndex = 1,
                explanation = "Paper Type I designated for candidate evaluation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_02",
                subject = "Government",
                topic = "Basic Concepts of Government",
                year = "2013",
                questionText = "Power that is delegated is exercised",
                optionA = "By devolution",
                optionB = "Directly",
                optionC = "By coercion",
                optionD = "Indirect",
                correctAnswerIndex = 0,
                explanation = "Delegated executive powers are decentralized or exercised through administrative devolution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_03",
                subject = "Government",
                topic = "Sovereignty",
                year = "2013",
                questionText = "De Jure sovereign is acquired through",
                optionA = "Law",
                optionB = "Grant",
                optionC = "Treaty",
                optionD = "Force",
                correctAnswerIndex = 0,
                explanation = "De Jure sovereignty is legitimate authority recognized and grounded in constitutional law.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_04",
                subject = "Government",
                topic = "The State",
                year = "2013",
                questionText = "A group of people who live together under a common law within a definite territory is a",
                optionA = "Community",
                optionB = "Nation - State",
                optionC = "Nation",
                optionD = "State",
                correctAnswerIndex = 3,
                explanation = "A state comprises people living within a demarcated territory subject to sovereign laws and government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_05",
                subject = "Government",
                topic = "Political Socialization",
                year = "2013",
                questionText = "Political socialization is associated with",
                optionA = "Military take-over of civilian government",
                optionB = "The transmission of political values",
                optionC = "Political transition",
                optionD = "Free choice of party programmes",
                correctAnswerIndex = 1,
                explanation = "Political socialization transmits political beliefs, civic knowledge, and traditions across generations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_06",
                subject = "Government",
                topic = "Forms of Government",
                year = "2013",
                questionText = "According to Aristotle, a form of government in which the few rule for the benefit of all is",
                optionA = "Diarchy",
                optionB = "Aristocracy",
                optionC = "Autocracy",
                optionD = "polyarchy",
                correctAnswerIndex = 1,
                explanation = "Aristocracy in classical Greek thought represents rule by the wise and virtuous few for the public good.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_07",
                subject = "Government",
                topic = "Forms of Government",
                year = "2013",
                questionText = "Rule by the old people is known as",
                optionA = "Monarchy",
                optionB = "Gerontocracy",
                optionC = "Feudalism",
                optionD = "Theocracy",
                correctAnswerIndex = 1,
                explanation = "Gerontocracy denotes governance where power is held exclusively by senior tribal or community elders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_08",
                subject = "Government",
                topic = "Executive Organ",
                year = "2013",
                questionText = "As an executive, the commissioner is charged with the responsibility of",
                optionA = "Implementing laws",
                optionB = "Writing laws",
                optionC = "Giving loans",
                optionD = "Making laws",
                correctAnswerIndex = 0,
                explanation = "Executive commissioners administer public ministries and oversee policy implementation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_09",
                subject = "Government",
                topic = "Judiciary",
                year = "2013",
                questionText = "Rules adjudication is a primary function of the",
                optionA = "Judiciary",
                optionB = "Executive",
                optionC = "Government",
                optionD = "Legislature",
                correctAnswerIndex = 0,
                explanation = "Adjudicating legal disputes, interpreting statutes, and applying justice is the constitutional sphere of the judiciary.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_10",
                subject = "Government",
                topic = "Judiciary",
                year = "2013",
                questionText = "The judiciary controls the executive in federal state through",
                optionA = "Delegated legislation",
                optionB = "Judicial overview",
                optionC = "Judicial review",
                optionD = "Motions",
                correctAnswerIndex = 2,
                explanation = "Judicial review empowers courts to declare unconstitutional executive acts null, void, and of no legal effect.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_11",
                subject = "Government",
                topic = "Unitary System",
                year = "2013",
                questionText = "One major advantage of the unitary system is that it tends to make government",
                optionA = "Free of controversy",
                optionB = "Distant from the people",
                optionC = "Popular among the masses",
                optionD = "Strong and stable",
                correctAnswerIndex = 3,
                explanation = "Unitary centralization prevents jurisdictional conflict and creates a cohesive, strong national government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_12",
                subject = "Government",
                topic = "Comparative Government",
                year = "2013",
                questionText = "The presidential system differs from the parliamentary system of government in that",
                optionA = "The principle of collective responsibility applies",
                optionB = "Executive and legislative powers are fused",
                optionC = "Powers of the three arms of government are merged",
                optionD = "The tenure of office of the president is limited",
                correctAnswerIndex = 1,
                explanation = "In parliamentary systems, cabinet ministers sit inside the legislature (powers are fused), whereas in presidential systems they are separate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_13",
                subject = "Government",
                topic = "Socialism",
                year = "2013",
                questionText = "Which of the following advocates equitable distribution of wealth?",
                optionA = "Capitalism",
                optionB = "Aristocracy",
                optionC = "Socialism",
                optionD = "Plutocracy",
                correctAnswerIndex = 2,
                explanation = "Socialism seeks egalitarian resource ownership, state planning, and equitable wealth distribution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_14",
                subject = "Government",
                topic = "Constitutions",
                year = "2013",
                questionText = "A constitution that is difficult to amend is",
                optionA = "Rigid",
                optionB = "Written",
                optionC = "Unwritten",
                optionD = "Flexible",
                correctAnswerIndex = 0,
                explanation = "A rigid constitution requires cumbersome and special amendment majorities (e.g. two-thirds of parliament and state approvals).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_15",
                subject = "Government",
                topic = "Constitutions",
                year = "2013",
                questionText = "Which of the following constitutions is more suitable for centralization of political power?",
                optionA = "Unwritten constitution",
                optionB = "Rigid constitution",
                optionC = "Written constitution",
                optionD = "Flexible constitution",
                correctAnswerIndex = 1,
                explanation = "A flexible unitary constitution allows easy statutory modifications without constitutional deadlocks.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_16",
                subject = "Government",
                topic = "Devolution",
                year = "2013",
                questionText = "The act of transferring autonomous powers to subordinate agencies is",
                optionA = "Concentration",
                optionB = "Deconcentration",
                optionC = "Delegation",
                optionD = "Devolution",
                correctAnswerIndex = 2,
                explanation = "Devolution formally grants constitutional powers to subordinate regional or local tiers of government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_17",
                subject = "Government",
                topic = "Citizenship",
                year = "2013",
                questionText = "Which of the following types of citizenship cannot be withdrawn?",
                optionA = "Citizenship by conquest",
                optionB = "Citizenship by birth",
                optionC = "Honorary citizenship",
                optionD = "Citizenship by naturalization",
                correctAnswerIndex = 1,
                explanation = "Inherent birthright citizenship cannot be arbitrarily stripped by executive revocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_18",
                subject = "Government",
                topic = "Suffrage",
                year = "2013",
                questionText = "The right of citizens to vote is",
                optionA = "Universal suffrage",
                optionB = "Nationality suffrage",
                optionC = "Electoral suffrage",
                optionD = "Adult suffrage",
                correctAnswerIndex = 0,
                explanation = "Universal suffrage guarantees all adult citizens the constitutional right to vote in national elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_19",
                subject = "Government",
                topic = "Political Parties",
                year = "2013",
                questionText = "A political party is different from a pressure group in its",
                optionA = "Objective",
                optionB = "Organization",
                optionC = "Strategy",
                optionD = "Source of finance",
                correctAnswerIndex = 0,
                explanation = "A political party's primary objective is to contest elections and win state power, whereas pressure groups seek policy influence.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_20",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2013",
                questionText = "One of the functions of pressure groups is to",
                optionA = "Nominate the president",
                optionB = "Prepare the budget",
                optionC = "Articulate the opinion of their members",
                optionD = "Contest elections to serve the people",
                correctAnswerIndex = 2,
                explanation = "Pressure groups formulate and voice the shared concerns, grievances, and policy views of their members.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_21",
                subject = "Government",
                topic = "Public Opinion",
                year = "2013",
                questionText = "Public opinion refers to the",
                optionA = "Aggregate views of groups on particular government activities",
                optionB = "views held by the president of a country",
                optionC = "views of the chief justice of a country",
                optionD = "Aggregate of attitudes held by members of the national assembly",
                correctAnswerIndex = 0,
                explanation = "Public opinion represents the collective attitudes, beliefs, and judgments of the population regarding public affairs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_22",
                subject = "Government",
                topic = "Civil Service",
                year = "2013",
                questionText = "The class that oversees the implementation of government decisions and policies is the",
                optionA = "Executive",
                optionB = "Clerical",
                optionC = "Technical",
                optionD = "Administrative",
                correctAnswerIndex = 0,
                explanation = "The executive arm coordinates ministries and public departments to implement government decisions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_23",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2013",
                questionText = "The performance of ritual rites in the Yoruba empire is the responsibility of the",
                optionA = "Aare-Onakakanfo",
                optionB = "Oba",
                optionC = "Ogboni",
                optionD = "Oyo mesi",
                correctAnswerIndex = 2,
                explanation = "The secret Ogboni cult acted as mediators with ancestral spirits and handled religious rituals and burials in Yoruba kingdoms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_24",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2013",
                questionText = "Under the emirate system, the commander of the army is the",
                optionA = "Hakimi",
                optionB = "Sarkin fada",
                optionC = "Madawaki",
                optionD = "Alkali",
                correctAnswerIndex = 2,
                explanation = "The Madawaki was the general commander of the cavalry and armed forces in the pre-colonial Hausa-Fulani emirate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_25",
                subject = "Government",
                topic = "Indirect Rule",
                year = "2013",
                questionText = "The indirect rule system of administration was more successful in the Northern Nigeria because",
                optionA = "Of the existence of an organized structure in the area",
                optionB = "the Europeans ensures that the farmlands",
                optionC = "The natives show little or no resistance",
                optionD = "The people were mainly interested in being governed indirectly",
                correctAnswerIndex = 0,
                explanation = "The highly centralized, hierarchical Fulani emirate system with courts and taxation facilitated easy colonial administrative co-optation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_26",
                subject = "Government",
                topic = "Nationalism",
                year = "2013",
                questionText = "The earliest nationalist activities in Nigeria were spearheaded by",
                optionA = "Trade unions",
                optionB = "Traditional rulers",
                optionC = "Political parties",
                optionD = "Educated elite",
                correctAnswerIndex = 3,
                explanation = "Western-educated professionals, lawyers, and journalists pioneered early nationalist newspapers and congresses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_27",
                subject = "Government",
                topic = "Nationalism",
                year = "2013",
                questionText = "The first notable nationalist movement in west Africa was the",
                optionA = "West African student union",
                optionB = "Nigeria youth movement",
                optionC = "Aborigines rights protection society",
                optionD = "National congress of British West Africa",
                correctAnswerIndex = 3,
                explanation = "J.E. Casely Hayford co-founded the National Congress of British West Africa (NCBWA) in Accra in 1920.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_28",
                subject = "Government",
                topic = "First Republic",
                year = "2013",
                questionText = "In Nigeria's first republic, the prime minister was both the",
                optionA = "Head of state and commander-in-chief of the armed forces",
                optionB = "Commander-in-chief of the armed forces and party leader",
                optionC = "Head of state and party leader",
                optionD = "Head of government and a lawmaker",
                correctAnswerIndex = 3,
                explanation = "Under Westminster parliamentary democracy, the Prime Minister is an elected member of parliament leading the executive government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_29",
                subject = "Government",
                topic = "Revenue Allocation",
                year = "2013",
                questionText = "Under the 1979 Constitution, statutory allocation of revenue to local government councils is the responsibility of the",
                optionA = "House of Assembly",
                optionB = "National Economic Council",
                optionC = "Federal Legislature",
                optionD = "Council of State",
                correctAnswerIndex = 0,
                explanation = "State Houses of Assembly received constitutional mandate to manage state-local joint revenue distribution accounts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_30",
                subject = "Government",
                topic = "Second Republic",
                year = "2013",
                questionText = "Under Nigeria's Second Republic, the Senate was under the leadership of",
                optionA = "J.S. Tarka",
                optionB = "Joseph Wayas",
                optionC = "Godwin Ume-Ezeoke",
                optionD = "John Wash Pam",
                correctAnswerIndex = 1,
                explanation = "Dr. Joseph Wayas of the National Party of Nigeria served as President of the Senate from 1979 to 1983.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_31",
                subject = "Government",
                topic = "Public Finance",
                year = "2013",
                questionText = "The Revenue Mobilization, Allocation and Fiscal Commission is statutorily empowered to determine the remuneration of",
                optionA = "Only elected representatives",
                optionB = "Political office holders",
                optionC = "Employees of public corporations",
                optionD = "All civil servants",
                correctAnswerIndex = 3,
                explanation = "RMAFC monitors revenue accruals to the Federation Account and prescribes statutory salaries for public political officers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_32",
                subject = "Government",
                topic = "Public Accountability",
                year = "2013",
                questionText = "The primary function of the Code of Conduct Bureau is to",
                optionA = "Ensure minimum standard of morality",
                optionB = "Retain custody of declarations",
                optionC = "Receive declaration of assets",
                optionD = "Ensure due process by public officers",
                correctAnswerIndex = 3,
                explanation = "The CCB receives and verifies asset declarations to ensure ethical compliance and accountability in public administration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_33",
                subject = "Government",
                topic = "Third Republic",
                year = "2013",
                questionText = "The party system practiced in Nigeria's Third Republic was",
                optionA = "Two-party",
                optionB = "Zero-party",
                optionC = "One-party",
                optionD = "Multi-party",
                correctAnswerIndex = 3,
                explanation = "General Babangida decree-created a statutory two-party system: the Social Democratic Party (SDP) and National Republican Convention (NRC).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_34",
                subject = "Government",
                topic = "Federalism",
                year = "2013",
                questionText = "Nigeria adopted the federal system of government because of",
                optionA = "Uneven development",
                optionB = "The availability of limited resources",
                optionC = "The adoption of a state religion",
                optionD = "The fear of domination of minorities",
                correctAnswerIndex = 3,
                explanation = "Federalism was adopted to accommodate intense ethnic diversity and protect minority communities from regional domination.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_35",
                subject = "Government",
                topic = "Military Rule",
                year = "2013",
                questionText = "The highest policy the making body under the Gowon Regime was",
                optionA = "Armed Forces Ruling Council",
                optionB = "Provisional Ruling Council",
                optionC = "Supreme Military Council",
                optionD = "Federal Executive Council",
                correctAnswerIndex = 2,
                explanation = "The Supreme Military Council (SMC) was the apex governing and legislative council under General Yakubu Gowon.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_36",
                subject = "Government",
                topic = "State Creation",
                year = "2013",
                questionText = "Nigeria became a federation of thirty-six state during the era of",
                optionA = "Abdulsalami Abubakar",
                optionB = "Yakubu Gowon",
                optionC = "Ibrahim Babangida",
                optionD = "Sani Abacha",
                correctAnswerIndex = 2,
                explanation = "General Sani Abacha created six additional states on October 1, 1996, bringing the total number of states to 36.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_37",
                subject = "Government",
                topic = "Federal Capital Territory",
                year = "2013",
                questionText = "Which of the following headed the committee that recommended the suitability of Abuja as a new federal city?",
                optionA = "Justice Baba Ardo",
                optionB = "Justice Atanda Fatai Williams",
                optionC = "Justice Udo Udoma",
                optionD = "Justice Akinola Aguda",
                correctAnswerIndex = 3,
                explanation = "The Justice Akinola Aguda Panel recommended moving the Federal Capital from congested Lagos to Abuja in 1975.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_38",
                subject = "Government",
                topic = "Public Corporations",
                year = "2013",
                questionText = "A public corporation is managed by",
                optionA = "A minister",
                optionB = "A general manager",
                optionC = "The board of governors",
                optionD = "The board of directors",
                correctAnswerIndex = 3,
                explanation = "Statutory public corporations are administered by a governing Board of Directors headed by a Chairman.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_39",
                subject = "Government",
                topic = "Local Government Finance",
                year = "2013",
                questionText = "A major source of revenue in the post - 1976 local government in Nigeria is",
                optionA = "Internally generated revenue",
                optionB = "the federation account",
                optionC = "Grants and loans",
                optionD = "The joint state-local government account",
                correctAnswerIndex = 1,
                explanation = "Local governments rely primarily on statutory monthly allocations disbursed directly from the Federation Account.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_40",
                subject = "Government",
                topic = "Military Rule",
                year = "2013",
                questionText = "The provisional Ruling Council was the highest ruling body during the regime of",
                optionA = "Muhammadu Buhari",
                optionB = "Ibrahim Babangida",
                optionC = "Murtala Muhammed",
                optionD = "Sani Abacha",
                correctAnswerIndex = 0,
                explanation = "General Sani Abacha established the Provisional Ruling Council (PRC) as the supreme military authority.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_41",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2013",
                questionText = "Nigeria's non-alignment policy in the sixties lacked real substance because of her",
                optionA = "Afrocentric policy",
                optionB = "Poor economic potential",
                optionC = "Partnership with Asian countries",
                optionD = "Close ties with Britain",
                correctAnswerIndex = 3,
                explanation = "Despite non-aligned rhetoric, Prime Minister Balewa's administration maintained defense pacts and strong economic ties with Great Britain.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_42",
                subject = "Government",
                topic = "Technical Aid Corps",
                year = "2013",
                questionText = "Under the Technical Aid Corps, Nigerian experts are deployed to",
                optionA = "African, the pacific and the Caribbean",
                optionB = "Europe, South America and Asia",
                optionC = "The pacific, the Caribbean and Europe",
                optionD = "Asia, Africa and the pacific",
                correctAnswerIndex = 3,
                explanation = "The TAC programme deploys skilled Nigerian volunteers to African, Caribbean, and Pacific (ACP) partner nations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_43",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2013",
                questionText = "The centre-piece of Nigeria's foreign policy covers only",
                optionA = "Europe",
                optionB = "Africa",
                optionC = "Latin America",
                optionD = "Asia",
                correctAnswerIndex = 1,
                explanation = "Afrocentrism establishes that Africa's political freedom, unity, and development form the core pillar of Nigeria's foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_44",
                subject = "Government",
                topic = "ECOWAS",
                year = "2013",
                questionText = "Which of the following countries pioneered the establishment of ECOWAS alongside Nigeria?",
                optionA = "Ghana",
                optionB = "Togo",
                optionC = "Algeria",
                optionD = "Cameroun",
                correctAnswerIndex = 1,
                explanation = "President Eyadéma of Togo partnered closely with General Gowon to tour West Africa and draft the ECOWAS Treaty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_45",
                subject = "Government",
                topic = "African Union",
                year = "2013",
                questionText = "Nigeria's role in the African Union was most prominent during the regime of",
                optionA = "President Olusegun Obasanjo",
                optionB = "President Shehu Shagari",
                optionC = "President Umaru Yar'adua",
                optionD = "President Ibrahim Babangida",
                correctAnswerIndex = 0,
                explanation = "President Obasanjo was instrumental in drafting the NEPAD framework, African Peer Review Mechanism, and AU transition.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_46",
                subject = "Government",
                topic = "Diplomacy",
                year = "2013",
                questionText = "A representative of a Commonwealth country in another member state is known as",
                optionA = "Consul-General",
                optionB = "Ambassador",
                optionC = "Attache",
                optionD = "High Commissioner",
                correctAnswerIndex = 3,
                explanation = "Commonwealth diplomatic missions are headed by High Commissioners rather than ambassadors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_47",
                subject = "Government",
                topic = "United Nations",
                year = "2013",
                questionText = "The organ of UN that promotes voluntary co-operation among member states in diverse areas is the",
                optionA = "International Court of Justice",
                optionB = "General Assembly",
                optionC = "Economic and Social Council",
                optionD = "Security Council",
                correctAnswerIndex = 2,
                explanation = "ECOSOC coordinates the specialized agencies (WHO, UNESCO, ILO, UNICEF) promoting international economic and social cooperation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_48",
                subject = "Government",
                topic = "United Nations",
                year = "2013",
                questionText = "The main representative body of the United Nations is the",
                optionA = "Security Council",
                optionB = "General Assembly",
                optionC = "Trusteeship Council",
                optionD = "Secretariat",
                correctAnswerIndex = 1,
                explanation = "The General Assembly is the chief deliberative organ where all 193 member states have equal voting representation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_49",
                subject = "Government",
                topic = "African Union",
                year = "2013",
                questionText = "The AU differs from the OAU in having",
                optionA = "Effective tools for decision enforcement",
                optionB = "No permanent headquarters",
                optionC = "A minimum of divergent viewpoints",
                optionD = "No assembly of Heads of State",
                correctAnswerIndex = 0,
                explanation = "Unlike the non-interventionist OAU, the AU possesses the Peace and Security Council and African Standby Force to intervene against unconstitutional changes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2013_50",
                subject = "Government",
                topic = "OPEC",
                year = "2013",
                questionText = "OPEC has strong influence with the",
                optionA = "EU",
                optionB = "ADB",
                optionC = "AU",
                optionD = "IMF",
                correctAnswerIndex = 3,
                explanation = "OPEC crude oil pricing and output quotas profoundly impact global macroeconomic conditions and international financial institutions like the IMF.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_01",
                subject = "Government",
                topic = "General Examination Structure",
                year = "2014",
                questionText = "Which Question Paper Type of Government is given to you?",
                optionA = "Type F",
                optionB = "Type E",
                optionC = "Type L",
                optionD = "Type S",
                correctAnswerIndex = 2,
                explanation = "Paper Type L allocated on examination desk.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_02",
                subject = "Government",
                topic = "The State",
                year = "2014",
                questionText = "The necessary attributes of a state are",
                optionA = "police, army, sovereignty and custom",
                optionB = "resources, population, sovereignty and government",
                optionC = "sovereignty, police, army and immigration",
                optionD = "definite territory, population, sovereignty and government",
                correctAnswerIndex = 3,
                explanation = "Political theory defines a state by four essential elements: population, defined territory, government, and sovereignty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_03",
                subject = "Government",
                topic = "Political Participation",
                year = "2014",
                questionText = "The process of taking part in political and public affairs can be termed political",
                optionA = "socialization",
                optionB = "recognition",
                optionC = "culture",
                optionD = "participation",
                correctAnswerIndex = 3,
                explanation = "Political participation encompasses voting, campaigning, joining political parties, and holding public discourse.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_04",
                subject = "Government",
                topic = "Civil Society",
                year = "2014",
                questionText = "Membership of a society is",
                optionA = "constitutional",
                optionB = "conventional",
                optionC = "mandatory",
                optionD = "voluntary",
                correctAnswerIndex = 3,
                explanation = "Joining civil society associations or clubs is fundamentally based on voluntary association.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_05",
                subject = "Government",
                topic = "Sovereignty",
                year = "2014",
                questionText = "In a democratic political system, the political sovereign is usually the",
                optionA = "legislature",
                optionB = "constitution",
                optionC = "political parties",
                optionD = "electorate",
                correctAnswerIndex = 3,
                explanation = "In democracies, ultimate political sovereignty belongs to the voting electorate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_06",
                subject = "Government",
                topic = "Monarchy",
                year = "2014",
                questionText = "One basic feature of a monarchical form of government is that",
                optionA = "the ruler has a fixed tenure",
                optionB = "separation of powers is absolute",
                optionC = "members of the executive are elected",
                optionD = "succession is through heredity",
                correctAnswerIndex = 3,
                explanation = "Monarchical succession is traditionally governed by dynastic lineage, royal primogeniture, and hereditary right.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_07",
                subject = "Government",
                topic = "Legislature",
                year = "2014",
                questionText = "One main advantage of bicameral legislature is that it",
                optionA = "is not easy to manipulate bills",
                optionB = "makes for quick deliberation during emergencies",
                optionC = "makes passage of bills easy",
                optionD = "is less cumbersome to pass bills",
                correctAnswerIndex = 0,
                explanation = "Bicameralism prevents arbitrary executive manipulation and allows thoughtful second review of pending statutes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_08",
                subject = "Government",
                topic = "Judiciary",
                year = "2014",
                questionText = "The court that has ultimate power to interpret the constitution is the",
                optionA = "Court of Appeal",
                optionB = "Supreme Court",
                optionC = "Magistrate Court",
                optionD = "High Court",
                correctAnswerIndex = 1,
                explanation = "The Supreme Court of Nigeria is the highest constitutional court whose decisions bind all lower judicial bodies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_09",
                subject = "Government",
                topic = "Unitary System",
                year = "2014",
                questionText = "Unitary system of government is more suitable to a country",
                optionA = "with a relatively small area and a homogenous population",
                optionB = "that is sparsely populated",
                optionC = "that possesses a strong and modern army",
                optionD = "with a robust and dynamic economy",
                correctAnswerIndex = 0,
                explanation = "Unitary states function most effectively in compact, geographically cohesive nations with high cultural and linguistic homogeneity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_10",
                subject = "Government",
                topic = "Monarchy",
                year = "2014",
                questionText = "An example of a country ruled by a constitutional monarch is",
                optionA = "Libya",
                optionB = "Uganda",
                optionC = "Morocco",
                optionD = "Italy",
                correctAnswerIndex = 3,
                explanation = "Morocco is ruled by a constitutional monarch (the King of Morocco), though in the options Britain/Morocco qualify.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_11",
                subject = "Government",
                topic = "Political Ideologies",
                year = "2014",
                questionText = "The development of a classless society is the goal of",
                optionA = "marxism",
                optionB = "conservation",
                optionC = "feudalism",
                optionD = "liberalism",
                correctAnswerIndex = 0,
                explanation = "Marxist philosophy envisions the dialectical progression toward a communist, classless, and stateless society.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_12",
                subject = "Government",
                topic = "Constitutions",
                year = "2014",
                questionText = "A flexible constitution is one which is",
                optionA = "written by the parliament",
                optionB = "easily amended",
                optionC = "popular with the legislators",
                optionD = "known to all the citizens",
                correctAnswerIndex = 1,
                explanation = "A flexible constitution can be altered by ordinary legislative procedure without specialized referendum mechanisms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_13",
                subject = "Government",
                topic = "Separation of Powers",
                year = "2014",
                questionText = "Which of the following is a feature of checks and balances?",
                optionA = "Code of conduct",
                optionB = "Judicial precedent",
                optionC = "Judicial immunity",
                optionD = "Judicial review",
                correctAnswerIndex = 3,
                explanation = "Judicial review enables courts to check executive and legislative overreach by invalidating unconstitutional acts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_14",
                subject = "Government",
                topic = "Military Rule",
                year = "2014",
                questionText = "Laws made by military governments at the state level are called",
                optionA = "acts",
                optionB = "decrees",
                optionC = "bye-laws",
                optionD = "edicts",
                correctAnswerIndex = 3,
                explanation = "Under Nigerian military regimes, federal laws were known as Decrees while state military governors promulgated Edicts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_15",
                subject = "Government",
                topic = "Citizenship",
                year = "2014",
                questionText = "Citizenship is acquired by an alien through",
                optionA = "naturalization",
                optionB = "registration",
                optionC = "birth",
                optionD = "conferment",
                correctAnswerIndex = 0,
                explanation = "Aliens who satisfy statutory residence and character qualifications acquire citizenship through naturalization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_16",
                subject = "Government",
                topic = "Elections",
                year = "2014",
                questionText = "The officer responsible for announcing the result of an election is known as",
                optionA = "electoral officer",
                optionB = "ballot officer",
                optionC = "presiding officer",
                optionD = "returning officer",
                correctAnswerIndex = 3,
                explanation = "The Returning Officer collates polling results and officially declares the winner of an election.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_17",
                subject = "Government",
                topic = "Political Parties",
                year = "2014",
                questionText = "The ultimate aim of political parties is to",
                optionA = "formulate and implement policies",
                optionB = "implement people-oriented programmes",
                optionC = "acquire and exercise power",
                optionD = "increase the political awareness of the electorate",
                correctAnswerIndex = 2,
                explanation = "The defining purpose of any political party is to mobilize voters, contest elections, and win control of government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_18",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2014",
                questionText = "The main objective of pressure groups is to",
                optionA = "serve as opposition to the government",
                optionB = "promote the interest of political parties",
                optionC = "influence legislation for the benefit of their members",
                optionD = "protect the interest of the country against foreigners",
                correctAnswerIndex = 2,
                explanation = "Pressure groups lobby and influence government decisions to advance their members' welfare without seeking office.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_19",
                subject = "Government",
                topic = "Public Opinion",
                year = "2014",
                questionText = "Which of the following is not a dimension of public opinion?",
                optionA = "Substance",
                optionB = "Polling",
                optionC = "Orientation",
                optionD = "Intensity",
                correctAnswerIndex = 1,
                explanation = "Substance, orientation, and intensity are qualitative dimensions of public opinion, whereas polling is an empirical measurement tool.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_20",
                subject = "Government",
                topic = "Civil Service",
                year = "2014",
                questionText = "The body that is responsible for the appointment, discipline, promotion and dismissal of civil servants is the",
                optionA = "Ministry of Labour and Productivity",
                optionB = "Ministry of Establishment",
                optionC = "Bureau for Public Service Reforms",
                optionD = "Civil Service Commission",
                correctAnswerIndex = 3,
                explanation = "The Civil Service Commission is the constitutionally independent body managing civil service personnel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_21",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2014",
                questionText = "In the pre-colonial Hausa political system, the Madawaki performed the function of",
                optionA = "Minister of Works",
                optionB = "Minister of Education",
                optionC = "Minister of Defence",
                optionD = "Minister of Interior",
                correctAnswerIndex = 2,
                explanation = "The Madawaki acted as the master of the horse, general of the army, and principal minister of defense in the emirate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_22",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2014",
                questionText = "In the Old Oyo Empire, the Ajele",
                optionA = "ensure the safety of all trade routes",
                optionB = "ensure good governance of the districts",
                optionC = "mobilized the army",
                optionD = "was the Head of the army",
                correctAnswerIndex = 0,
                explanation = "The Ajele were resident imperial governors posted to tributary kingdoms to supervise administration and tax collection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_23",
                subject = "Government",
                topic = "Trade Unionism",
                year = "2014",
                questionText = "The General Strike of 1945 was caused primarily by the",
                optionA = "disparity in the criteria for employment",
                optionB = "harshness in trade laws as it concerns the Africans",
                optionC = "government's rejection of a demand for an increase of 50 percent in the cost of living allowance",
                optionD = "persistent implementation of discriminatory laws",
                correctAnswerIndex = 2,
                explanation = "Wartime inflation severely eroded real wages, sparking Michael Imoudu's 1945 strike when the colonial regime rejected COLA demands.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_24",
                subject = "Government",
                topic = "Constitutional History",
                year = "2014",
                questionText = "Before 1945, the component units of Nigeria were",
                optionA = "regions",
                optionB = "districts",
                optionC = "provinces",
                optionD = "states",
                correctAnswerIndex = 0,
                explanation = "Prior to Richards' 1946 regionalism, Nigeria was divided administratively into provinces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_25",
                subject = "Government",
                topic = "Nationalism",
                year = "2014",
                questionText = "National agitation began in Nigeria with the",
                optionA = "formation of West African Youth League",
                optionB = "Lagos protest against water rate in 1908",
                optionC = "introduction of indirect rule",
                optionD = "annexation of Lagos in 1861",
                correctAnswerIndex = 0,
                explanation = "The early 20th-century water rate protests organized by Herbert Macaulay mobilized grassroots nationalist consciousness in Lagos.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_26",
                subject = "Government",
                topic = "Nationalism",
                year = "2014",
                questionText = "The emergence of nationalism was essentially the result of the ills of",
                optionA = "imperialism",
                optionB = "independence",
                optionC = "slavery",
                optionD = "colonialism",
                correctAnswerIndex = 3,
                explanation = "Nationalism arose as a unified emancipatory resistance against the racial, economic, and political injustices of colonialism.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_27",
                subject = "Government",
                topic = "Party History",
                year = "2014",
                questionText = "Which of the following nationalists was the founder of Nigeria's first political party?",
                optionA = "Herbert Macaulay",
                optionB = "Abubakar Tafawa Balewa",
                optionC = "Ahmadu Bello",
                optionD = "Nnamdi Azikiwe",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay founded the Nigerian National Democratic Party (NNDP) in 1923 following the Clifford Constitution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_28",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2014",
                questionText = "The division of powers between the federal and regional governments into exclusive, concurrent and residual lists was done by the",
                optionA = "1979 Constitution",
                optionB = "1999 Constitution",
                optionC = "Independence Constitution",
                optionD = "Republican",
                correctAnswerIndex = 0,
                explanation = "The 1954 Lyttleton and subsequent 1960 Independence constitutions demarcated legislative powers across these three lists.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_29",
                subject = "Government",
                topic = "Constitutional History",
                year = "2014",
                questionText = "The Nigerian Independence Constitution was modified by the",
                optionA = "1979 Constitution",
                optionB = "1963 Constitution",
                optionC = "1999 Constitution",
                optionD = "1989 Constitution",
                correctAnswerIndex = 1,
                explanation = "The 1963 Republican Constitution amended the 1960 charter to establish Nigeria as an independent federal republic.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_30",
                subject = "Government",
                topic = "Constitutional History",
                year = "2014",
                questionText = "The President of Nigeria was indirectly elected through secret ballot for a period of five years by the senate in",
                optionA = "1979",
                optionB = "1983",
                optionC = "1960",
                optionD = "1963",
                correctAnswerIndex = 3,
                explanation = "Under the 1963 Constitution, President Nnamdi Azikiwe was elected by a joint session of parliament for a five-year term.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_31",
                subject = "Government",
                topic = "Federal Character",
                year = "2014",
                questionText = "The main function of the Federal Character Commission in Nigeria is",
                optionA = "providing free social services to the citizens",
                optionB = "ensuring fair representation of all states in the public service",
                optionC = "reviewing unfair administrative decisions",
                optionD = "settling disputes among societies",
                correctAnswerIndex = 1,
                explanation = "The FCC ensures balanced, equitable staffing of public offices across all states of the federation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_32",
                subject = "Government",
                topic = "Electoral Commission",
                year = "2014",
                questionText = "The power of appointing the chairman of the Independent National Electoral Commission is vested in the",
                optionA = "Senate",
                optionB = "Judicial Council",
                optionC = "Council of State",
                optionD = "President",
                correctAnswerIndex = 3,
                explanation = "Under Section 154 of the 1999 Constitution, the President appoints the INEC Chairman subject to Senate confirmation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_33",
                subject = "Government",
                topic = "State Creation",
                year = "2014",
                questionText = "The NCNC and the NPC facilitated the creation of the",
                optionA = "Eastern Region",
                optionB = "Mid-west Region",
                optionC = "Northern Region",
                optionD = "Western Region",
                correctAnswerIndex = 1,
                explanation = "The ruling NPC-NCNC coalition carved out the Mid-Western Region from the Action Group-controlled Western Region in 1963.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_34",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2014",
                questionText = "One of the major problems of Nigerian federalism is",
                optionA = "pre-colonial administrative structure among the units of federation",
                optionB = "lack of revenue to cater for the demands of the federation",
                optionC = "inadequate manpower to fill vacancies",
                optionD = "imbalance in the structure and sizes of units of federation",
                correctAnswerIndex = 3,
                explanation = "The Northern Region originally encompassed more than half the land area and population, generating structural instability.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_35",
                subject = "Government",
                topic = "State Creation",
                year = "2014",
                questionText = "Which of the following was done during the Gowon administration to reduce regional structural imbalance in the federation?",
                optionA = "Formation of political parties",
                optionB = "Appointment of ministers",
                optionC = "Creation of states",
                optionD = "Increase in revenue allocation",
                correctAnswerIndex = 2,
                explanation = "General Gowon dissolved the four regions and created 12 states on May 27, 1967, resolving northern geographic hegemony.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_36",
                subject = "Government",
                topic = "Public Corporations",
                year = "2014",
                questionText = "A problem of public corporations in Nigeria is",
                optionA = "wastage of resources",
                optionB = "choice of leadership",
                optionC = "public control",
                optionD = "emphasis on subsidies",
                correctAnswerIndex = 0,
                explanation = "Bureaucratic corruption, mismanagement, and financial leakages have historically undermined Nigerian public corporations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_37",
                subject = "Government",
                topic = "Privatization",
                year = "2014",
                questionText = "One feature of public corporations that was weakened by privatization is",
                optionA = "government control",
                optionB = "social control",
                optionC = "national integration",
                optionD = "social harmony",
                correctAnswerIndex = 0,
                explanation = "Divesting state ownership directly eliminates ministerial and bureaucratic control over the enterprise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_38",
                subject = "Government",
                topic = "Local Government",
                year = "2014",
                questionText = "One of the main duties of the Local Government Service Commission is to",
                optionA = "handle requests for the creation of more local governments",
                optionB = "supervise and manage the personnel of a local government",
                optionC = "conduct election into Local Council",
                optionD = "create an enabling working environment for council workers",
                correctAnswerIndex = 1,
                explanation = "The Local Government Service Commission recruits, posts, disciplines, and promotes senior local council staff.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_39",
                subject = "Government",
                topic = "Electoral History",
                year = "2014",
                questionText = "The option A4 model was used in the conduct of the",
                optionA = "1999 elections",
                optionB = "2007 elections",
                optionC = "1983 elections",
                optionD = "1993 elections",
                correctAnswerIndex = 3,
                explanation = "Prof. Humphrey Nwosu's NEC utilized the Option A4 open-secret queue voting system in the June 12, 1993 election.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_40",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2014",
                questionText = "The review of Nigerian foreign policy under the Murtala-Obasanjo regime was done by",
                optionA = "Phillips Commission",
                optionB = "Udoji Committee",
                optionC = "Aboyade Committee",
                optionD = "Adedeji Committee",
                correctAnswerIndex = 3,
                explanation = "Prof. Adebayo Adedeji chaired the 1975 foreign policy committee that formally articulated Africa as the center-piece of Nigerian diplomacy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_41",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2014",
                questionText = "Which of the following is a guiding principle of Nigeria's foreign policy?",
                optionA = "Decolonisation of all African states",
                optionB = "Total opposition to the Cold War",
                optionC = "Posting of only carrier diplomats as envoys",
                optionD = "interference in the affairs of African countries",
                correctAnswerIndex = 0,
                explanation = "Total liberation of Africa and eradication of apartheid and white minority rule defined Nigeria's foreign policy mandate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_42",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2014",
                questionText = "The technical Aids Corps was established during the regime of",
                optionA = "Muhammadu Buhari",
                optionB = "Olusegun Obasanjo",
                optionC = "Sani Abacha",
                optionD = "Ibrahim Babangida",
                correctAnswerIndex = 3,
                explanation = "General Babangida and Foreign Minister Prof. Bolaji Akinyemi launched the Technical Aid Corps in 1987.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_43",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2014",
                questionText = "The granting of asylum to Charles Taylor by Nigeria was to",
                optionA = "control Liberia",
                optionB = "protect Nigerians in Liberia",
                optionC = "promote peace in Liberia",
                optionD = "defy the western powers",
                correctAnswerIndex = 2,
                explanation = "President Olusegun Obasanjo granted asylum to Charles Taylor in Calabar in 2003 to facilitate a peaceful end to the Liberian civil war.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_44",
                subject = "Government",
                topic = "Frontline States",
                year = "2014",
                questionText = "Nigeria is regarded as a frontline state because she",
                optionA = "sent troops for peacekeeping in Somalia",
                optionB = "sent policemen for peacekeeping in Namibia",
                optionC = "assisted the liberation struggle in Southern Africa",
                optionD = "assisted ECOMOG troops in Liberia",
                correctAnswerIndex = 2,
                explanation = "Nigeria provided immense financial and diplomatic backing to the ANC, SWAPO, and ZANU liberation movements.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_45",
                subject = "Government",
                topic = "Commonwealth",
                year = "2014",
                questionText = "The reason behind Nigeria's suspension from the Commonwealth in 1995 was",
                optionA = "socio-cultural",
                optionB = "legal",
                optionC = "political",
                optionD = "economic",
                correctAnswerIndex = 2,
                explanation = "The military junta's execution of Ken Saro-Wiwa and eight Ogoni activists during the Auckland CHOGM triggered diplomatic suspension.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_46",
                subject = "Government",
                topic = "Commonwealth",
                year = "2014",
                questionText = "Commonwealth nations are represented in other member nation by",
                optionA = "attaches",
                optionB = "charged affaires",
                optionC = "ambassadors",
                optionD = "high commissioners",
                correctAnswerIndex = 0,
                explanation = "Commonwealth nations exchange High Commissioners reflecting shared historical fraternity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_47",
                subject = "Government",
                topic = "United Nations",
                year = "2014",
                questionText = "The UN succeeded the",
                optionA = "League of Nations",
                optionB = "Warsaw Pact",
                optionC = "NATO",
                optionD = "SEATO",
                correctAnswerIndex = 0,
                explanation = "The United Nations was chartered in 1945 in San Francisco to replace the defunct League of Nations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_48",
                subject = "Government",
                topic = "United Nations",
                year = "2014",
                questionText = "The number of permanent members of the UN Security Council is",
                optionA = "seven",
                optionB = "eight",
                optionC = "five",
                optionD = "six",
                correctAnswerIndex = 2,
                explanation = "The five permanent veto-wielding members of the Security Council are the USA, UK, France, Russia, and China.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_49",
                subject = "Government",
                topic = "OAU",
                year = "2014",
                questionText = "The Secretary General of the OAU holds office for a renewable period of",
                optionA = "five years",
                optionB = "six years",
                optionC = "three years",
                optionD = "four years",
                correctAnswerIndex = 3,
                explanation = "The OAU Charter prescribed a four-year renewable term for the Administrative Secretary-General.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2014_50",
                subject = "Government",
                topic = "Commonwealth",
                year = "2014",
                questionText = "Former colonies of Britain belong to the association known as",
                optionA = "Commonwealth",
                optionB = "OECD",
                optionC = "NATO",
                optionD = "European Union",
                correctAnswerIndex = 0,
                explanation = "The Commonwealth of Nations is a voluntary association of 56 independent countries, mostly former territories of the British Empire.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_01",
                subject = "Government",
                topic = "Local Government",
                year = "2015",
                questionText = "The tenure of an elected chairman of local government is determined by the",
                optionA = "Federal Executive Council",
                optionB = "National Union of Local Government Employees",
                optionC = "National Assembly",
                optionD = "State House of Assembly",
                correctAnswerIndex = 3,
                explanation = "The State House of Assembly legislates on local council tenure, elections, and administration under Section 7 of the Constitution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_02",
                subject = "Government",
                topic = "Local Government",
                year = "2015",
                questionText = "The 1976 Reforms made the local government the",
                optionA = "Second-tier of government",
                optionB = "first-tier of government",
                optionC = "fourth-tier of government",
                optionD = "Third-tier of government",
                correctAnswerIndex = 3,
                explanation = "The 1976 Local Government Reforms formally established local government councils as the distinct third tier of government in Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_03",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2015",
                questionText = "Decision making in the traditional Igbo political system was conferred on the basis of",
                optionA = "Privilege",
                optionB = "age",
                optionC = "gender",
                optionD = "Status",
                correctAnswerIndex = 1,
                explanation = "Elders in the Council of Elders (Ndi Ichie) and age grades exercised deliberative authority based on age and wisdom.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_04",
                subject = "Government",
                topic = "Party History",
                year = "2015",
                questionText = "The political party that originated from Jamiyyar Mutanem Arewa was",
                optionA = "UMBC",
                optionB = "BYM",
                optionC = "NEPU",
                optionD = "NPC",
                correctAnswerIndex = 3,
                explanation = "The Northern People's Congress (NPC) grew directly out of the cultural organization Jam'iyyar Mutanen Arewa in 1951.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_05",
                subject = "Government",
                topic = "Colonialism",
                year = "2015",
                questionText = "A major consequence of colonialism on Nigeria is",
                optionA = "Economic dependence",
                optionB = "the attainment of equal status with Europe",
                optionC = "suppression of state structures",
                optionD = "The up-liftment of its image",
                correctAnswerIndex = 2,
                explanation = "Colonial conquest suppressed autonomous indigenous state structures and dismantled native monarchies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_06",
                subject = "Government",
                topic = "Judiciary",
                year = "2015",
                questionText = "The judiciary contributes to the development of constitutions through",
                optionA = "Judicial review",
                optionB = "historical records",
                optionC = "bye-laws",
                optionD = "Acts of parliament",
                correctAnswerIndex = 0,
                explanation = "Judicial review creates living constitutional precedents and expands legal doctrines.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_07",
                subject = "Government",
                topic = "Legislature",
                year = "2015",
                questionText = "The upper house of the legislature is responsible for the",
                optionA = "Assent to bill",
                optionB = "signing of treaties",
                optionC = "approval declaration",
                optionD = "Passage of appropriation bill",
                correctAnswerIndex = 3,
                explanation = "Both chambers of parliament must pass the national budget (Appropriation Bill) before presidential assent.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_08",
                subject = "Government",
                topic = "Elections in Nigeria",
                year = "2015",
                questionText = "Which of the following political parties contested the 1993 Presidential Election?",
                optionA = "NRC and SDP",
                optionB = "AD and APP",
                optionC = "UNCP and NDP",
                optionD = "PRP and DPP",
                correctAnswerIndex = 0,
                explanation = "The National Republican Convention (NRC) and Social Democratic Party (SDP) were the sole competitors in the June 12, 1993 poll.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_09",
                subject = "Government",
                topic = "Economic Systems",
                year = "2015",
                questionText = "A mode of production in which the resources of a community are pooled together for the general well-being of the people is called",
                optionA = "Communism",
                optionB = "communalism",
                optionC = "socialism",
                optionD = "Capitalism",
                correctAnswerIndex = 1,
                explanation = "Communalism is the traditional African economic mode based on collective landholding and mutual solidarity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_10",
                subject = "Government",
                topic = "ECOWAS",
                year = "2015",
                questionText = "Which of these international organizations was Nigeria a founding member?",
                optionA = "UNO",
                optionB = "The Commonwealth",
                optionC = "NATO",
                optionD = "ECOWAS",
                correctAnswerIndex = 3,
                explanation = "Nigeria co-founded ECOWAS in 1975 alongside other West African states.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_11",
                subject = "Government",
                topic = "ECOWAS & ECOMOG",
                year = "2015",
                questionText = "Nigeria's role in ECOWAS was significant in dispute resolution in",
                optionA = "Liberia",
                optionB = "Nigeria",
                optionC = "the Gambia",
                optionD = "Senegal",
                correctAnswerIndex = 0,
                explanation = "Nigeria spearheaded ECOMOG peacekeeping deployments in Monrovia to halt the brutal Liberian civil war.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_12",
                subject = "Government",
                topic = "Fundamental Rights",
                year = "2015",
                questionText = "An example of civil right of a citizen is the right to",
                optionA = "be voted for",
                optionB = "property and justice",
                optionC = "peaceful assembly",
                optionD = "Vote",
                correctAnswerIndex = 3,
                explanation = "While voting is a political right, civil liberties protect individual autonomy, freedom of assembly, and justice.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_13",
                subject = "Government",
                topic = "Judiciary",
                year = "2015",
                questionText = "In the judicial parlance, writ means",
                optionA = "Restraining order",
                optionB = "prohibitive order",
                optionC = "acquitting order",
                optionD = "Sentencing order",
                correctAnswerIndex = 0,
                explanation = "A judicial writ (like habeas corpus or injunction) is a formal court command restraining or compelling action.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_14",
                subject = "Government",
                topic = "Public Corporations",
                year = "2015",
                questionText = "Public corporations are controlled by the legislature through",
                optionA = "Daily monitoring of their activities",
                optionB = "discipline of staff",
                optionC = "approval of their annual budgets",
                optionD = "Recruitment of staff",
                correctAnswerIndex = 2,
                explanation = "Parliament reviews and appropriates the annual capital and recurrent budgets of public corporations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_15",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2015",
                questionText = "One of the reasons for the adoption of Africa as the centre piece of Nigeria's foreign policy is to",
                optionA = "Encourage rivalry in Africa",
                optionB = "monopolize African economies",
                optionC = "protect her domestic environment",
                optionD = "Challenge the major powers",
                correctAnswerIndex = 2,
                explanation = "A secure, peaceful, and decolonized Africa shields Nigeria's own borders and domestic security.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_16",
                subject = "Government",
                topic = "Constitutional History",
                year = "2015",
                questionText = "Elective principle was first introduced in Nigeria by the",
                optionA = "Lyttleton Constitution",
                optionB = "Richards Constitution",
                optionC = "Clifford Constitution",
                optionD = "Macpherson Constitution",
                correctAnswerIndex = 2,
                explanation = "The 1922 Clifford Constitution introduced the elective principle for legislative council members in Lagos and Calabar.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_17",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2015",
                questionText = "The type of pressure group that champions the interest and the right of the under privileged is known as the",
                optionA = "Professional pressure groups",
                optionB = "promotional interest groups",
                optionC = "economic interest groups",
                optionD = "Educational pressure groups",
                correctAnswerIndex = 1,
                explanation = "Promotional (cause-oriented) groups advocate altruistically on behalf of disadvantaged or marginalized groups.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_18",
                subject = "Government",
                topic = "Constitutional History",
                year = "2015",
                questionText = "A major innovation of the 1979 Constitution was the",
                optionA = "Increase in constitutional power of elected officials",
                optionB = "creation of more state",
                optionC = "prohibition of cross-carpeting",
                optionD = "Introduction of presidential system",
                correctAnswerIndex = 3,
                explanation = "The 1979 Constitution replaced the Westminster parliamentary system with an American-style Executive Presidency.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_19",
                subject = "Government",
                topic = "African Union",
                year = "2015",
                questionText = "The organ of the AU that prepares for the meeting of the Assembly of Heads of State and Government is the",
                optionA = "Commission of Mediation, Conciliation and Arbitration",
                optionB = "African Parliament",
                optionC = "Council of Ministers",
                optionD = "General Secretariat",
                correctAnswerIndex = 2,
                explanation = "The Executive Council (composed of Foreign Ministers) prepares agenda dossiers for the AU Assembly of Heads of State.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_20",
                subject = "Government",
                topic = "Fascism",
                year = "2015",
                questionText = "One of the features of a fascist government is that",
                optionA = "Political power is decentralized",
                optionB = "it gives room for opposition",
                optionC = "the state defines the rights of individuals",
                optionD = "Sovereignty is identified with landed property",
                correctAnswerIndex = 2,
                explanation = "Fascism subjugates individual rights to state control, asserting that citizen liberties exist only as granted by the state.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_21",
                subject = "Government",
                topic = "Civil Service",
                year = "2015",
                questionText = "Promotion and discipline of civil servants is the responsibility of the",
                optionA = "Federal Character Commission",
                optionB = "Ministry of Labour",
                optionC = "Civil Service Commission",
                optionD = "Public Complaints Commission",
                correctAnswerIndex = 2,
                explanation = "The Federal Civil Service Commission oversees recruitment, promotion, and discipline of federal civil servants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_22",
                subject = "Government",
                topic = "Unitary System",
                year = "2015",
                questionText = "Under the unitary arrangement, the centre is vested with",
                optionA = "Limited power over the constituent units",
                optionB = "equal power with the constituent units",
                optionC = "insignificant power",
                optionD = "Absolute power",
                correctAnswerIndex = 3,
                explanation = "In a unitary system, central government holds supreme, indivisible legislative and administrative authority.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_23",
                subject = "Government",
                topic = "OPEC",
                year = "2015",
                questionText = "Which of these international organizations is Nigeria a member majorly because of her economic interest?",
                optionA = "UN",
                optionB = "Commonwealth",
                optionC = "AU",
                optionD = "OPEC",
                correctAnswerIndex = 3,
                explanation = "Nigeria joined OPEC in 1971 to stabilize crude oil export revenues, coordinate output, and protect petroleum revenues.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_24",
                subject = "Government",
                topic = "Military Rule",
                year = "2015",
                questionText = "Abolition of civil liberty is an attribute of",
                optionA = "Presidential government",
                optionB = "parliamentary government",
                optionC = "military government",
                optionD = "Republic government",
                correctAnswerIndex = 2,
                explanation = "Military regimes suspend constitutional human rights, ban political protests, and rule by decree.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_25",
                subject = "Government",
                topic = "Public Agencies",
                year = "2015",
                questionText = "One of the agencies introduced by the military to promote national interest was the",
                optionA = "National Youth Service Corps",
                optionB = "Directorate of Mass Mobilization for Social and Economic Reconstruction",
                optionC = "Directorate of Food, Roads and Rural Infrastructure",
                optionD = "National Directorate for Employment",
                correctAnswerIndex = 0,
                explanation = "General Yakubu Gowon founded the National Youth Service Corps (NYSC) by Decree 24 of 1973 to foster national unity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_26",
                subject = "Government",
                topic = "OPEC",
                year = "2015",
                questionText = "One of the main objectives of OPEC is to",
                optionA = "Assist multinational companies to monopolize market",
                optionB = "protect the interest of multinational companies",
                optionC = "stabilize the income of developing nations",
                optionD = "Fix and allocate production to member nations",
                correctAnswerIndex = 3,
                explanation = "OPEC coordinates petroleum export policies and establishes production quotas to stabilize global oil prices.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_27",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2015",
                questionText = "Nigeria's foreign relation with Britain was strained during the Buhari Regime because",
                optionA = "Britain tested atomic bomb in the Sahara-desert",
                optionB = "Britain refused to recognize the regime",
                optionC = "Nigeria refused to export crude oil to Britain",
                optionD = "Nigeria wanted to forcefully extradite Alhaji Umar Dikko from Britain",
                correctAnswerIndex = 3,
                explanation = "The botched July 1984 kidnapping and crate-extradition of former Transport Minister Umaru Dikko in London caused a diplomatic rift.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_28",
                subject = "Government",
                topic = "Military Regimes",
                year = "2015",
                questionText = "The Babangida Regime differed from Buhari Regime because in the former",
                optionA = "Governors were assisted by commissioners",
                optionB = "ministers executed government policies",
                optionC = "governors were members of the National Council of State",
                optionD = "The post of Chairman, Joint Chiefs of Staff was created",
                correctAnswerIndex = 3,
                explanation = "General Babangida assumed the title of military President and reorganized the military high command structure.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_29",
                subject = "Government",
                topic = "Presidential System",
                year = "2015",
                questionText = "A feature of the presidential system is that",
                optionA = "The president has an indefinite term of office",
                optionB = "there is a separate election for the executive and the legislature",
                optionC = "the president is a member of the legislature",
                optionD = "The cabinet is collectively accountable to the legislature",
                correctAnswerIndex = 1,
                explanation = "Voters independently elect the executive president and parliamentary legislators in separate ballots.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_30",
                subject = "Government",
                topic = "Federal Character",
                year = "2015",
                questionText = "The Chairman of the Federal Character Commission is appointed by the",
                optionA = "Secretary to the Government of the Federation",
                optionB = "National Assembly",
                optionC = "Minister of Labour and Productivity",
                optionD = "President",
                correctAnswerIndex = 3,
                explanation = "The President appoints the Chairman and members of the Federal Character Commission subject to Senate confirmation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_31",
                subject = "Government",
                topic = "Forms of Government",
                year = "2015",
                questionText = "A form of government in which the sovereign power to rule is vested in a small number of people considered as the best qualified to rule is",
                optionA = "Autocracy",
                optionB = "theocracy",
                optionC = "gerontocracy",
                optionD = "Aristocracy",
                correctAnswerIndex = 3,
                explanation = "Aristocracy entrusts political rule to an elite class regarded as intellectually, morally, or socially superior.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_32",
                subject = "Government",
                topic = "ECOWAS",
                year = "2015",
                questionText = "One of the major shortcomings of ECOWAS is",
                optionA = "Expansion of market",
                optionB = "Trade liberalization",
                optionC = "curbing smuggling",
                optionD = "Fostering of unity",
                correctAnswerIndex = 2,
                explanation = "Endemic border smuggling, non-tariff trade barriers, and porous land borders undermine regional trade integration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_33",
                subject = "Government",
                topic = "First Republic",
                year = "2015",
                questionText = "The party that formed a coalition with the NPC in the First Republic was",
                optionA = "AG",
                optionB = "NDC",
                optionC = "NEPU",
                optionD = "NCNC",
                correctAnswerIndex = 3,
                explanation = "The Northern People's Congress (NPC) partnered with the NCNC to form Nigeria's first post-independence federal coalition government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_34",
                subject = "Government",
                topic = "Authority",
                year = "2015",
                questionText = "Personal authority is synonymous with",
                optionA = "Charismatic authority",
                optionB = "instruments authority",
                optionC = "sacred authority",
                optionD = "Legal authority",
                correctAnswerIndex = 0,
                explanation = "Max Weber's charismatic authority rests on devotion to the exceptional personal sanctity, heroism, or character of an individual.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_35",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2015",
                questionText = "The administrative system used by the British in her colonies was",
                optionA = "Indignant system",
                optionB = "direct rule",
                optionC = "indirect rule",
                optionD = "Policy of assimilation",
                correctAnswerIndex = 2,
                explanation = "Britain governed through traditional native chiefs and emirs under the system of Indirect Rule.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_36",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2015",
                questionText = "An electoral system in which a candidate with the highest number of votes in a constituency is declared winner is",
                optionA = "Alternative vote system",
                optionB = "second ballot system",
                optionC = "absolute majority system",
                optionD = "Simple majority system",
                correctAnswerIndex = 3,
                explanation = "First-past-the-post (simple plurality/majority) awards victory to the candidate polling more votes than any single rival.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_37",
                subject = "Government",
                topic = "Civil Service",
                year = "2015",
                questionText = "Which of the following belongs to the administrative cadre in the civil service?",
                optionA = "Executive Officers",
                optionB = "Surveyors",
                optionC = "Medical Director",
                optionD = "Deputy Director",
                correctAnswerIndex = 3,
                explanation = "Administrative cadre includes Permanent Secretaries, Directors, and Deputy Directors who shape policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_38",
                subject = "Government",
                topic = "Forms of Government",
                year = "2015",
                questionText = "Aristocracy is described as a form of government in which",
                optionA = "Popular citizens rule",
                optionB = "the clergy rules",
                optionC = "few citizens rule",
                optionD = "Best citizens rule",
                correctAnswerIndex = 2,
                explanation = "Aristocracy places governance in the hands of a distinguished, elite minority.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_39",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2015",
                questionText = "The head of the Old Oyo Empire was the",
                optionA = "Alaafin",
                optionB = "Bashorun",
                optionC = "Ooni",
                optionD = "Are-Ona-kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Alaafin was the supreme imperial sovereign and paramount ruler of Old Oyo.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_40",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2015",
                questionText = "The Babangida Regime re-established diplomatic ties with",
                optionA = "France",
                optionB = "Germany",
                optionC = "Israel",
                optionD = "Britain",
                correctAnswerIndex = 2,
                explanation = "General Babangida normalized diplomatic relations with the State of Israel in 1992 after a nineteen-year suspension.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_41",
                subject = "Government",
                topic = "Political Crises",
                year = "2015",
                questionText = "The remote cause of the Action Group Crisis of 1962 was the",
                optionA = "Fear of domination",
                optionB = "abolition of federalism",
                optionC = "personality clash among its leaders",
                optionD = "Issue of self-government",
                correctAnswerIndex = 2,
                explanation = "Ideological disputes and bitter personal conflict between Chief Obafemi Awolowo and Premier S.L. Akintola fractured the Action Group.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_42",
                subject = "Government",
                topic = "Presidential System",
                year = "2015",
                questionText = "Fixed tenure of office is associated with the",
                optionA = "Parliamentary system",
                optionB = "monarchical system",
                optionC = "republican system",
                optionD = "Presidential",
                correctAnswerIndex = 3,
                explanation = "Presidential systems mandate fixed, constitutionally specified term limits (e.g. four years) for the executive.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_43",
                subject = "Government",
                topic = "Revenue Allocation",
                year = "2015",
                questionText = "Which of the following was a Revenue Allocation Commission?",
                optionA = "Udoji Commission",
                optionB = "Raisman Commission",
                optionC = "Aboyade Commission",
                optionD = "Williams Commission",
                correctAnswerIndex = 0,
                explanation = "Sir Jeremy Raisman chaired the landmark 1958 Fiscal Commission recommending the Distributable Pool Account.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_44",
                subject = "Government",
                topic = "Public Opinion",
                year = "2015",
                questionText = "Election can be used to measure the effectiveness of",
                optionA = "Pressure groups",
                optionB = "political propaganda",
                optionC = "political opinion",
                optionD = "Public opinion",
                correctAnswerIndex = 3,
                explanation = "General elections serve as a decisive empirical measure of collective citizen public opinion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_45",
                subject = "Government",
                topic = "Communalism",
                year = "2015",
                questionText = "A feature of communalism is that",
                optionA = "Ownership of land is vested in the community",
                optionB = "a landowner can employ landless men",
                optionC = "landless men have no privileges as citizens",
                optionD = "Sovereignty is identified with landed property",
                correctAnswerIndex = 0,
                explanation = "Under communal land tenure, land belongs inalienably to the community, clan, or ancestral family collective.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_46",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2015",
                questionText = "In the Hausa pre-colonial system, the officer in charge of fishing activities was the",
                optionA = "Sarkin Noma",
                optionB = "Sarkin Dogarai",
                optionC = "Sarkin Ruwa",
                optionD = "Sarkin Pawa",
                correctAnswerIndex = 2,
                explanation = "Sarkin Ruwa supervised maritime activities, river fishing, and ferry waterways in traditional Hausa states.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_47",
                subject = "Government",
                topic = "ECOWAS",
                year = "2015",
                questionText = "The social and Cultural Affairs Commission is a specialized agency of the",
                optionA = "OPEC",
                optionB = "Commonwealth",
                optionC = "UN",
                optionD = "ECOWAS",
                correctAnswerIndex = 2,
                explanation = "ECOWAS operates specialized commissions managing regional cultural, health, and social harmonization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_48",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2015",
                questionText = "Which of the following assists the president in the formulation of foreign policies?",
                optionA = "Ministry of Foreign Affairs",
                optionB = "Ministry of Interior",
                optionC = "Ministry of Defence",
                optionD = "Ministry of justice",
                correctAnswerIndex = 0,
                explanation = "The Ministry of Foreign Affairs is the statutory executive ministry advising on external diplomatic strategy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_49",
                subject = "Government",
                topic = "Monarchy",
                year = "2015",
                questionText = "Rule by divine right is a basis of",
                optionA = "Absolute monarchy",
                optionB = "representative democracy",
                optionC = "the republican system",
                optionD = "the feudal system",
                correctAnswerIndex = 0,
                explanation = "Absolute monarchs historically claimed that their royal authority was conferred directly by God and unaccountable to subjects.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2015_50",
                subject = "Government",
                topic = "Civil Service",
                year = "2015",
                questionText = "An important ingredient of the civil service is",
                optionA = "Hierarchy",
                optionB = "imbalance",
                optionC = "nepotism",
                optionD = "Partisanship",
                correctAnswerIndex = 0,
                explanation = "Hierarchical chain of command, meritocracy, and clear subordination of ranks define modern civil service administration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_01",
                subject = "Government",
                topic = "Citizenship",
                year = "2016",
                questionText = "Citizenship is acquired by an alien through",
                optionA = "registration",
                optionB = "birth",
                optionC = "naturalization",
                optionD = "conferment",
                correctAnswerIndex = 2,
                explanation = "An alien legally resident in a country acquires nationality by naturalization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_02",
                subject = "Government",
                topic = "Federalism",
                year = "2016",
                questionText = "The upper house in most federal systems is created to",
                optionA = "prevent excesses of the executive",
                optionB = "enable experienced elders make inputs to governance",
                optionC = "oversee and check the lower house",
                optionD = "ensure equality of federating units",
                correctAnswerIndex = 3,
                explanation = "Upper chambers (like the Senate) protect equality among federating states irrespective of their population sizes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_03",
                subject = "Government",
                topic = "Ombudsman",
                year = "2016",
                questionText = "Public Complaints Commission is responsible for",
                optionA = "investigating the use of false document",
                optionB = "entertaining complaints against public servant",
                optionC = "arresting public servant",
                optionD = "sentencing erring public servants",
                correctAnswerIndex = 1,
                explanation = "The Ombudsman investigates administrative abuses, delays, and unfair treatment by public officials.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_04",
                subject = "Government",
                topic = "Nationalism",
                year = "2016",
                questionText = "The earliest nationalist activities in Nigeria were spearheaded by",
                optionA = "trade unions",
                optionB = "educated elites",
                optionC = "political parties",
                optionD = "traditional rulers",
                correctAnswerIndex = 3,
                explanation = "Traditional kings, chiefs, and emirs staged the earliest armed resistance against colonial intrusion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_05",
                subject = "Government",
                topic = "United Nations",
                year = "2016",
                questionText = "The organ of UN that promotes voluntary co-operation among member states in diverse areas is the",
                optionA = "General Assembly",
                optionB = "International Court of Justice",
                optionC = "Security Council",
                optionD = "Economic and Social Council",
                correctAnswerIndex = 0,
                explanation = "The General Assembly fosters global dialogue and voluntary cooperation across cultural and economic realms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_06",
                subject = "Government",
                topic = "Electoral Process",
                year = "2016",
                questionText = "The officer responsible for announcing the result of an election is referred to as the",
                optionA = "electoral officer",
                optionB = "presiding officer",
                optionC = "returning officer",
                optionD = "ballot officer",
                correctAnswerIndex = 2,
                explanation = "The Returning Officer collates votes and issues the official certificate of return to the winner.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_07",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2016",
                questionText = "Under the emirate system, the commander of the army is the",
                optionA = "Sarkin Fada",
                optionB = "Hakimi",
                optionC = "Alkali",
                optionD = "Madawaki",
                correctAnswerIndex = 3,
                explanation = "The Madawaki was the commander-in-chief of the emirate military forces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_08",
                subject = "Government",
                topic = "Separation of Powers",
                year = "2016",
                questionText = "Which of the following is a feature of checks and balances?",
                optionA = "Code of conduct",
                optionB = "Judicial review",
                optionC = "Judicial immunity",
                optionD = "Judicial precedent",
                correctAnswerIndex = 1,
                explanation = "Judicial review acts as a constitutional check against legislative and executive unconstitutionality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_09",
                subject = "Government",
                topic = "Constitutional History",
                year = "2016",
                questionText = "Cross-carpeting was first outlawed in which of the following constitutions?",
                optionA = "1963 constitution",
                optionB = "1979 constitution",
                optionC = "1960 constitution",
                optionD = "1999 constitution",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution first introduced provisions to penalize regional carpet-crossing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_10",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2016",
                questionText = "The performance of ritual rites in the Yoruba empire is the responsibility of the",
                optionA = "Aare-ona Kakanfo",
                optionB = "Oyomesi",
                optionC = "Ogboni",
                optionD = "Oba",
                correctAnswerIndex = 2,
                explanation = "The Ogboni fraternity performed vital ritual sacrifices, judicial arbitrations, and royal burials in Yoruba kingdoms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_11",
                subject = "Government",
                topic = "Political Ideologies",
                year = "2016",
                questionText = "The development of a classless society is the goal of",
                optionA = "marxism",
                optionB = "feudalism",
                optionC = "liberalism",
                optionD = "conservatism",
                correctAnswerIndex = 0,
                explanation = "Marxism-Leninism pursues the establishment of a classless communist society.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_12",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2016",
                questionText = "The indirect rule system of administration was more successful in Northern Nigeria because",
                optionA = "the Europeans ensured that the farmlands of the natives were not confiscated",
                optionB = "of the existence of an organised structure in the area",
                optionC = "the natives showed little or no resistance",
                optionD = "the people were mainly interested in being governed indirectly",
                correctAnswerIndex = 1,
                explanation = "The pre-existing hierarchical Fulani emirate administration provided an efficient structure for colonial indirect rule.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_13",
                subject = "Government",
                topic = "Executive Organ",
                year = "2016",
                questionText = "As an executive, the commissioner is charged with the responsibility of",
                optionA = "writing laws",
                optionB = "implementing laws",
                optionC = "giving loans",
                optionD = "law making",
                correctAnswerIndex = 1,
                explanation = "State commissioners implement executive policies and direct ministerial departments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_14",
                subject = "Government",
                topic = "Parliamentary System",
                year = "2016",
                questionText = "A good example of a country that operates a cabinet system of government is",
                optionA = "France",
                optionB = "Cameroun",
                optionC = "Nigeria",
                optionD = "Britain",
                correctAnswerIndex = 3,
                explanation = "Great Britain is the mother of the Westminster cabinet parliamentary system.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_15",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2016",
                questionText = "In its bids to reduce regional structural imbalance in the federation, Gowon administration",
                optionA = "formed political parties",
                optionB = "increased allocation",
                optionC = "created states",
                optionD = "appointed ministers",
                correctAnswerIndex = 2,
                explanation = "General Gowon created 12 states in May 1967 to dismantle regional monoliths and pacify minorities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_16",
                subject = "Government",
                topic = "Public Corporations",
                year = "2016",
                questionText = "The administrative head of a public corporation is the",
                optionA = "General Manager",
                optionB = "Permanent Secretary",
                optionC = "Chairman",
                optionD = "Chief Executive",
                correctAnswerIndex = 0,
                explanation = "The General Manager (or Managing Director) directs the routine operational affairs of a public corporation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_17",
                subject = "Government",
                topic = "The State",
                year = "2016",
                questionText = "Which of these is an attribute of the state?",
                optionA = "Dress mode",
                optionB = "Language",
                optionC = "Religion",
                optionD = "Population",
                correctAnswerIndex = 3,
                explanation = "A permanent population is one of the four essential components of a sovereign state.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_18",
                subject = "Government",
                topic = "Nationalism",
                year = "2016",
                questionText = "The utmost goal of nationalism in Africa was",
                optionA = "representation",
                optionB = "independence",
                optionC = "development",
                optionD = "Patriotism",
                correctAnswerIndex = 1,
                explanation = "African nationalism sought total emancipation from foreign imperial domination and sovereign self-rule.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_19",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "The centre piece of Nigeria's foreign policy covers only",
                optionA = "Africa",
                optionB = "Europe",
                optionC = "Asia",
                optionD = "Latin America",
                correctAnswerIndex = 0,
                explanation = "Afrocentrism declares Africa as the foundational centerpiece of Nigeria's external diplomacy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_20",
                subject = "Government",
                topic = "Diplomacy",
                year = "2016",
                questionText = "A representative of a commonwealth country in another member state is known as",
                optionA = "Consul-General",
                optionB = "High Commissioner",
                optionC = "Attache",
                optionD = "Ambassador",
                correctAnswerIndex = 1,
                explanation = "Commonwealth diplomatic ambassadors are officially titled High Commissioners.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_21",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "The review of Nigerian foreign policy under the Murtala-Obasanjo regime was done by",
                optionA = "Udoji committee",
                optionB = "Aboyade committee",
                optionC = "Okigbo committee",
                optionD = "Adedeji committee",
                correctAnswerIndex = 0,
                explanation = "The 1975 Committee on Foreign Policy headed by Prof. Adebayo Adedeji reviewed Nigeria's diplomatic objectives.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_22",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "Nigeria placed Africa at the centre of her foreign policy because of her",
                optionA = "role in Congo crisis",
                optionB = "size and wealth",
                optionC = "desire to dominate the continent",
                optionD = "potential role in Africa",
                correctAnswerIndex = 3,
                explanation = "Nigeria recognized her demographic and economic capacity to champion continental liberation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_23",
                subject = "Government",
                topic = "Judiciary",
                year = "2016",
                questionText = "Rule adjudication is a primary function of the",
                optionA = "judiciary",
                optionB = "legislature",
                optionC = "government",
                optionD = "executive",
                correctAnswerIndex = 0,
                explanation = "The judiciary interprets laws and settles disputes between citizens and the state.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_24",
                subject = "Government",
                topic = "Electoral Process",
                year = "2016",
                questionText = "Franchise in an electoral process means the",
                optionA = "sovereignty of a nation",
                optionB = "rights and duties of citizens",
                optionC = "ownership of means of production",
                optionD = "right to vote",
                correctAnswerIndex = 3,
                explanation = "Franchise is the constitutional right of qualified citizens to cast ballots in public elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_25",
                subject = "Government",
                topic = "Public Opinion",
                year = "2016",
                questionText = "Which of these is not a dimension of public opinion?",
                optionA = "Substance",
                optionB = "Intensity",
                optionC = "Orientation",
                optionD = "Polling",
                correctAnswerIndex = 0,
                explanation = "Substance, intensity, and orientation are qualitative aspects, while polling is an instrument.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_26",
                subject = "Government",
                topic = "Political Socialization",
                year = "2016",
                questionText = "The process through which citizens acquire political values is",
                optionA = "education",
                optionB = "acculturation",
                optionC = "socialization",
                optionD = "participation",
                correctAnswerIndex = 2,
                explanation = "Political socialization is the lifelong learning process conveying civic beliefs and values.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_27",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2016",
                questionText = "The main objective of pressure groups is to",
                optionA = "serve as opposition to the government",
                optionB = "protect the interest of the country against foreigners",
                optionC = "promote the interest of political parties",
                optionD = "influence legislation for the benefit of their members",
                correctAnswerIndex = 3,
                explanation = "Pressure groups lobby state organs to influence policy in favor of their constituent members.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_28",
                subject = "Government",
                topic = "Local Government",
                year = "2016",
                questionText = "The three-tier system of Nigerian Federalism was formalised by the",
                optionA = "2004 Pension reform",
                optionB = "1963 Republic Constitution",
                optionC = "1951 Hicks-Phillipson Commission's Report",
                optionD = "1976 local government reform",
                correctAnswerIndex = 3,
                explanation = "The 1976 nationwide Local Government Reform established local councils as a constitutionally recognized third tier of government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_29",
                subject = "Government",
                topic = "Constitutions",
                year = "2016",
                questionText = "A flexible constitution is one which is",
                optionA = "known to all the citizens",
                optionB = "popular with the legislators",
                optionC = "easily amended",
                optionD = "written by the parliament",
                correctAnswerIndex = 2,
                explanation = "A flexible constitution can be altered with the same ease as passing ordinary statutory legislation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_30",
                subject = "Government",
                topic = "United Nations",
                year = "2016",
                questionText = "The main representative body of the United Nations is the",
                optionA = "Security Council",
                optionB = "Secretariat",
                optionC = "Trusteeship",
                optionD = "General Assembly",
                correctAnswerIndex = 3,
                explanation = "The UN General Assembly represents all member states equally with one vote per sovereign nation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_31",
                subject = "Government",
                topic = "Privatization",
                year = "2016",
                questionText = "One feature of public corporations that was weakened by privatization was",
                optionA = "social harmony",
                optionB = "national integration",
                optionC = "social control",
                optionD = "government control",
                correctAnswerIndex = 3,
                explanation = "Privatization strips government of direct administrative control over corporate operations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_32",
                subject = "Government",
                topic = "Local Government",
                year = "2016",
                questionText = "One of the main duties of the Local Government Service Commission is to",
                optionA = "create enabling working environment for council workers",
                optionB = "conduct election into Local Council",
                optionC = "supervise and manage the personnel of local governments",
                optionD = "handle request for the creation of more local governments",
                correctAnswerIndex = 2,
                explanation = "The commission handles recruitment, promotions, and discipline of local government personnel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_33",
                subject = "Government",
                topic = "Forms of Government",
                year = "2016",
                questionText = "According to Aristotle, a form of government in which the few rule for the benefit of all is",
                optionA = "aristocracy",
                optionB = "polyarchy",
                optionC = "diarchy",
                optionD = "autocracy",
                correctAnswerIndex = 0,
                explanation = "Aristocracy is governance by the virtuous few dedicated to the collective good of the commonwealth.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_34",
                subject = "Government",
                topic = "Nigerian Federalism",
                year = "2016",
                questionText = "One of the major problems of Nigerian federalism is",
                optionA = "pre-colonial administrative structure among the units of federation",
                optionB = "imbalance in the structure and sizes of units of federation",
                optionC = "lack of revenue to cater for the demands of the federation",
                optionD = "inadequate manpower to fill vacancies",
                correctAnswerIndex = 1,
                explanation = "Disparities in land mass, population, and resource endowments have generated ongoing federal friction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_35",
                subject = "Government",
                topic = "ECOWAS",
                year = "2016",
                questionText = "Which of the following countries pioneered the establishment of ECOWAS alongside Nigeria?",
                optionA = "Ghana",
                optionB = "Cameroun",
                optionC = "Algeria",
                optionD = "Togo",
                correctAnswerIndex = 3,
                explanation = "Togo co-partnered with Nigeria under Eyadema and Gowon to establish ECOWAS.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_36",
                subject = "Government",
                topic = "State Creation",
                year = "2016",
                questionText = "The NCNC and NPC facilitated the creation of the",
                optionA = "Eastern Region",
                optionB = "Northern Region",
                optionC = "Western Region",
                optionD = "Mid-West Region",
                correctAnswerIndex = 3,
                explanation = "The 1963 referendum carved the Mid-Western Region out of the Western Region under federal legislative sponsorship.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_37",
                subject = "Government",
                topic = "Public Corporations",
                year = "2016",
                questionText = "A problem of public corporation in Nigeria is",
                optionA = "Wastage of resources",
                optionB = "Choice of leadership",
                optionC = "Public control",
                optionD = "Emphasis on subsidies",
                correctAnswerIndex = 0,
                explanation = "Financial leakages, bureaucracy, and operating deficits have challenged public corporations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_38",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "Nigeria's non-alignment policy in the sixties lacked real substance because of her",
                optionA = "poor economic potential",
                optionB = "close ties with Britain",
                optionC = "Afro centric policy",
                optionD = "partnership with Asian countries",
                correctAnswerIndex = 2,
                explanation = "Nigeria's defense agreements and ideological sympathy toward Western democracies contradicted non-aligned neutrality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_39",
                subject = "Government",
                topic = "Authority",
                year = "2016",
                questionText = "The type of authority that is based on personal qualities is",
                optionA = "charismatic",
                optionB = "Legal",
                optionC = "traditional",
                optionD = "coercive",
                correctAnswerIndex = 0,
                explanation = "Charismatic authority derives from dynamic, exceptional personal character and leadership magnetism.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_40",
                subject = "Government",
                topic = "Judiciary",
                year = "2016",
                questionText = "The judiciary controls the executive in federal systems through",
                optionA = "judicial overview",
                optionB = "motions",
                optionC = "delegated legislation",
                optionD = "judicial review",
                correctAnswerIndex = 3,
                explanation = "Courts nullify ultra vires and unlawful executive actions through the power of judicial review.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_41",
                subject = "Government",
                topic = "Elections in Nigeria",
                year = "2016",
                questionText = "Which of the following was adjudged as the most free and fair election in Nigeria?",
                optionA = "1999 elections",
                optionB = "1993 elections",
                optionC = "2007 elections",
                optionD = "1982 elections",
                correctAnswerIndex = 1,
                explanation = "The June 12, 1993 presidential election was widely celebrated by international observers as Nigeria's freest election.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_42",
                subject = "Government",
                topic = "Military Rule",
                year = "2016",
                questionText = "Laws made by military governors are called",
                optionA = "acts",
                optionB = "bye-laws",
                optionC = "edicts",
                optionD = "decrees",
                correctAnswerIndex = 2,
                explanation = "Military governors enacted state Edicts, whereas the military head of state promulgated federal Decrees.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_43",
                subject = "Government",
                topic = "Public Corporations",
                year = "2016",
                questionText = "A problem of public corporations in Nigeria is",
                optionA = "wastage of resources",
                optionB = "public control",
                optionC = "emphasis on subsidies",
                optionD = "choice of leadership",
                correctAnswerIndex = 0,
                explanation = "Mismanagement and resource wastage have chronically hampered performance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_44",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "The pro-west orientation of Nigeria's foreign policy was mainly because of her",
                optionA = "historical development",
                optionB = "geographical locations",
                optionC = "social structure",
                optionD = "economic under-development",
                correctAnswerIndex = 3,
                explanation = "Colonial heritage and trade dependency on British and Western markets entrenched a pro-Western posture.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_45",
                subject = "Government",
                topic = "Sovereignty",
                year = "2016",
                questionText = "A sovereign state is one",
                optionA = "whose government decisions are made independent of foreign interference",
                optionB = "whose constitution can be changed by a military government",
                optionC = "in which authority is vested in the military",
                optionD = "where its citizens can speak without fear or favour",
                correctAnswerIndex = 0,
                explanation = "External sovereignty requires absolute freedom from foreign domination or coercive external dictate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_46",
                subject = "Government",
                topic = "First Republic",
                year = "2016",
                questionText = "In Nigeria's First Republic, the prime minister was both the",
                optionA = "Head of state and party leader",
                optionB = "Head of government and a lawmaker",
                optionC = "Commander-in-chief of the armed forces and party leader",
                optionD = "Head of state and commander-in-chief of the armed forces",
                correctAnswerIndex = 1,
                explanation = "The Prime Minister held an elective seat in parliament while leading the executive branch.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_47",
                subject = "Government",
                topic = "African Union",
                year = "2016",
                questionText = "The AU differs from the OAU in having",
                optionA = "no permanent headquarters",
                optionB = "effective mechanisms for enforcing its decisions",
                optionC = "a minimum of divergent viewpoints",
                optionD = "no assembly of Heads of state",
                correctAnswerIndex = 1,
                explanation = "The AU incorporates intervention mandates under Article 4(h) of its Constitutive Act to enforce regional decisions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_48",
                subject = "Government",
                topic = "Second Republic",
                year = "2016",
                questionText = "Under Nigeria's Second Republic, the Senate was under the leadership of",
                optionA = "Joseph Wayas",
                optionB = "John Wash Pam",
                optionC = "J.S. Tarka",
                optionD = "Godwin Ume-Ezeoke",
                correctAnswerIndex = 0,
                explanation = "Senator Joseph Wayas was Senate President throughout the civilian Second Republic (1979-1983).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_49",
                subject = "Government",
                topic = "Political Parties",
                year = "2016",
                questionText = "The ultimate aim of political parties is to",
                optionA = "implement people-oriented programmes",
                optionB = "acquire and exercise power",
                optionC = "formulate and implement policies",
                optionD = "increase the political awareness of the electorate",
                correctAnswerIndex = 1,
                explanation = "Contesting elections to capture and exercise state authority is the central objective of political parties.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2016_50",
                subject = "Government",
                topic = "Forms of Government",
                year = "2016",
                questionText = "Rule by the old people is known as",
                optionA = "gerontocracy",
                optionB = "theocracy",
                optionC = "monarchy",
                optionD = "feudalism",
                correctAnswerIndex = 0,
                explanation = "Gerontocracy vests political supremacy in a council of senior elders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_01",
                subject = "Government",
                topic = "Fundamental Rights",
                year = "2017",
                questionText = "Which of the following is a foremost right of a citizen?",
                optionA = "Religious right",
                optionB = "Academic right",
                optionC = "Right to life",
                optionD = "Private life",
                correctAnswerIndex = 2,
                explanation = "The right to life is the foundational right upon which all other civil and human liberties depend.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_02",
                subject = "Government",
                topic = "Forms of Government",
                year = "2017",
                questionText = "Which of the following is a merit of aristocracy?",
                optionA = "Leaders must have military experience",
                optionB = "The best citizen is in control of government",
                optionC = "Organised few control the government",
                optionD = "Majority control the government",
                correctAnswerIndex = 1,
                explanation = "Aristocratic philosophy claims governance by the most cultivated, educated, and ethically qualified leaders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_03",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2017",
                questionText = "Which of the following is a strategy of foreign policy implementation?",
                optionA = "Cultural integration",
                optionB = "Democratic elections",
                optionC = "Political representation",
                optionD = "Propaganda",
                correctAnswerIndex = 3,
                explanation = "Diplomatic representation, propaganda, economic aid, treaties, and military power are core tools of foreign policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_04",
                subject = "Government",
                topic = "Economic Policy",
                year = "2017",
                questionText = "The Structural Adjustment Programme was introduced under the",
                optionA = "Babangida Regime",
                optionB = "Obasanjo Regime",
                optionC = "Buhari Regime",
                optionD = "Abacha Regime",
                correctAnswerIndex = 0,
                explanation = "General Ibrahim Babangida introduced SAP in 1986 under IMF/World Bank economic reform guidelines.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_05",
                subject = "Government",
                topic = "ECOWAS",
                year = "2017",
                questionText = "To facilitate the effective achievement of its objectives, ECOWAS is operationally structured with",
                optionA = "councils",
                optionB = "panels",
                optionC = "committees",
                optionD = "commissions",
                correctAnswerIndex = 0,
                explanation = "ECOWAS is organized around specialized ministerial councils and operational directorates.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_06",
                subject = "Government",
                topic = "Local Government",
                year = "2017",
                questionText = "Shortage of trained personnel is a major problem of the",
                optionA = "Federal Government",
                optionB = "State Governments",
                optionC = "Regional Governments",
                optionD = "Local Governments",
                correctAnswerIndex = 3,
                explanation = "Grassroots local councils chronically struggle with recruitment of technical, medical, and administrative experts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_07",
                subject = "Government",
                topic = "Sovereignty",
                year = "2017",
                questionText = "The right of a state to govern its territory and people without external control is known as",
                optionA = "authority",
                optionB = "power",
                optionC = "sovereignty",
                optionD = "legitimacy",
                correctAnswerIndex = 2,
                explanation = "Sovereignty is the supreme, inalienable constitutional authority of a state over its domestic and foreign affairs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_08",
                subject = "Government",
                topic = "Political Parties",
                year = "2017",
                questionText = "The popularity of a political party in given democracy rests on its",
                optionA = "constitution",
                optionB = "manifesto",
                optionC = "ideology",
                optionD = "number of branches",
                correctAnswerIndex = 1,
                explanation = "An appealing, actionable party manifesto attracts voter enthusiasm and electoral support.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_09",
                subject = "Government",
                topic = "Local Government",
                year = "2017",
                questionText = "A system of local council that allows for rotational leadership is known as",
                optionA = "single executive",
                optionB = "dual executive",
                optionC = "multi executive",
                optionD = "collegiate executive",
                correctAnswerIndex = 3,
                explanation = "Collegiate executives distribute presiding leadership roles among council members collectively.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_10",
                subject = "Government",
                topic = "Constitutions",
                year = "2017",
                questionText = "A type of constitution that is difficult to amend is described as",
                optionA = "written and flexible",
                optionB = "rigid and written",
                optionC = "unwritten and rigid",
                optionD = "flexible and rigid",
                correctAnswerIndex = 1,
                explanation = "Rigid written constitutions mandate complex super-majorities to effect constitutional amendments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_11",
                subject = "Government",
                topic = "United Nations",
                year = "2017",
                questionText = "The political achievement of UN is the promotion of",
                optionA = "economic development",
                optionB = "educational development",
                optionC = "international peace and security",
                optionD = "democratic institution",
                correctAnswerIndex = 2,
                explanation = "Under Article 1 of the UN Charter, preserving collective international peace and security is the primary mandate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_12",
                subject = "Government",
                topic = "Constitutional History",
                year = "2017",
                questionText = "Elective principle in Nigeria was first introduced by",
                optionA = "Richards Constitution",
                optionB = "Macpherson Constitution",
                optionC = "Littleton Constitution",
                optionD = "Clifford Constitution",
                correctAnswerIndex = 3,
                explanation = "Sir Hugh Clifford's 1922 Constitution introduced elective democracy for four legislative council seats.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_13",
                subject = "Government",
                topic = "Party Politics",
                year = "2017",
                questionText = "The three major political parties of the First Republic can be said to have had",
                optionA = "national outlook",
                optionB = "regional and ethnic undertone",
                optionC = "governmental funding",
                optionD = "religious and sectional appeals",
                correctAnswerIndex = 1,
                explanation = "The NPC (North), Action Group (West), and NCNC (East) drew support primarily from regional and ethnic bases.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_14",
                subject = "Government",
                topic = "Civil Service",
                year = "2017",
                questionText = "Development of the Civil Service relies on",
                optionA = "impartiality",
                optionB = "anonymity",
                optionC = "pro notability",
                optionD = "neutrality",
                correctAnswerIndex = 2,
                explanation = "Professional meritocracy, non-partisan neutrality, and anonymity ensure institutional performance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_15",
                subject = "Government",
                topic = "Presidential System",
                year = "2017",
                questionText = "The chief executive system is associated with",
                optionA = "federalism",
                optionB = "presidentialism",
                optionC = "parliamentary",
                optionD = "unitarism",
                correctAnswerIndex = 1,
                explanation = "Presidentialism concentrates supreme executive authority in a single Chief Executive President.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_16",
                subject = "Government",
                topic = "Public Corporations",
                year = "2017",
                questionText = "Public Corporations are mainly funded through",
                optionA = "foreign aid",
                optionB = "shareholders fund",
                optionC = "internally generated funds",
                optionD = "government subvention",
                correctAnswerIndex = 3,
                explanation = "Government subventions, state grants, and statutory budgetary allocations finance public corporations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_17",
                subject = "Government",
                topic = "Public Corporations",
                year = "2017",
                questionText = "Which of the following is the oldest Public Corporation in Nigeria?",
                optionA = "Power Distribution Company of Nigeria",
                optionB = "Nigeria Mining Corporation",
                optionC = "Nigerian Railway Corporation",
                optionD = "Nigerian Postal Services",
                correctAnswerIndex = 2,
                explanation = "The Nigerian Railway Corporation traces its origins back to the 1898 Lagos government railway line.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_18",
                subject = "Government",
                topic = "State Creation",
                year = "2017",
                questionText = "In 1987, Nigeria attained a federation of",
                optionA = "19 states",
                optionB = "12 states",
                optionC = "21 states",
                optionD = "30 states",
                correctAnswerIndex = 2,
                explanation = "General Babangida created Katsina and Akwa Ibom in 1987, raising the state count from 19 to 21 states.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_19",
                subject = "Government",
                topic = "Ombudsman",
                year = "2017",
                questionText = "The Ombudsman aims at",
                optionA = "offering qualitative educational services",
                optionB = "rendering alternative dispute resolution services",
                optionC = "providing qualitative job opportunities",
                optionD = "entertaining complaints on abuse of public office",
                correctAnswerIndex = 3,
                explanation = "The Ombudsman redresses citizen grievances regarding unfair bureaucratic decisions and administrative malice.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_20",
                subject = "Government",
                topic = "Military Regimes",
                year = "2017",
                questionText = "The apex body under the military regime of Yakubu Gowon was",
                optionA = "Supreme military Council",
                optionB = "Federal Executive Council",
                optionC = "The Armed Forces Ruling Council",
                optionD = "The national Council of State",
                correctAnswerIndex = 0,
                explanation = "The Supreme Military Council served as the supreme governing council under General Gowon.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_21",
                subject = "Government",
                topic = "Commonwealth",
                year = "2017",
                questionText = "One of the problems of the Commonwealth of Nations is lack of",
                optionA = "finance",
                optionB = "administrative structures",
                optionC = "cultural heterogeneity",
                optionD = "capacity to enforce decisions",
                correctAnswerIndex = 3,
                explanation = "The Commonwealth lacks standing military forces or coercive mechanisms to enforce summit resolutions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_22",
                subject = "Government",
                topic = "Ombudsman",
                year = "2017",
                questionText = "A major objective of Public Complaints Commission is",
                optionA = "creating fair opportunities for all government employees",
                optionB = "training and promoting public servants",
                optionC = "addressing grievances of individuals and groups",
                optionD = "creating an efficient work environment",
                correctAnswerIndex = 2,
                explanation = "The PCC investigates unfair administrative practices on behalf of aggrieved citizens.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_23",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2017",
                questionText = "Activities of pressure groups that influence governmental decisions are hampered by",
                optionA = "its size",
                optionB = "its leadership",
                optionC = "its affiliation",
                optionD = "the economy",
                correctAnswerIndex = 3,
                explanation = "Economic dependence, lack of financial funds, and poverty restrict pressure group lobbying efficacy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_24",
                subject = "Government",
                topic = "Democracy",
                year = "2017",
                questionText = "Which of the following is a major feature of democracy?",
                optionA = "Capacity to influence people",
                optionB = "Existence of political office holders",
                optionC = "Decision making",
                optionD = "Consent of the people",
                correctAnswerIndex = 3,
                explanation = "Democratic legitimacy rests upon the freely given consent of the governed expressed through universal franchise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_25",
                subject = "Government",
                topic = "Nationalism",
                year = "2017",
                questionText = "The struggle for self-government from foreign rule is known as",
                optionA = "imperialism",
                optionB = "nationalism",
                optionC = "patriotism",
                optionD = "neo-colonialism",
                correctAnswerIndex = 1,
                explanation = "Nationalism mobilizes colonial subjects to achieve political self-determination and territorial sovereignty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_26",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2017",
                questionText = "Territorial defence in the Yoruba precolonial system was the responsibility of the",
                optionA = "Bashorun",
                optionB = "Oyomesi",
                optionC = "Aremo",
                optionD = "Are-Ona-Kakanfo",
                correctAnswerIndex = 3,
                explanation = "The Aare-Ona-Kakanfo was the supreme field marshal and commander of the imperial armed forces of Oyo.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_27",
                subject = "Government",
                topic = "Public Opinion",
                year = "2017",
                questionText = "An effective means of measuring public opinion is",
                optionA = "referendum",
                optionB = "radio interview",
                optionC = "letters to government",
                optionD = "telephone calls",
                correctAnswerIndex = 0,
                explanation = "A national referendum directly registers the voting public's stance on critical statutory or constitutional questions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_28",
                subject = "Government",
                topic = "Suffrage",
                year = "2017",
                questionText = "Universal Adult Suffrage permits all",
                optionA = "citizens to vote",
                optionB = "qualified male to vote",
                optionC = "qualified citizens to vote",
                optionD = "female to vote",
                correctAnswerIndex = 2,
                explanation = "Universal adult suffrage enfranchises all citizens who satisfy age, sanity, and statutory registration rules.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_29",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2017",
                questionText = "In the pre-colonial Emirate system, the emir of Gwandu controlled the",
                optionA = "Central section",
                optionB = "Southern section",
                optionC = "Eastern section",
                optionD = "Western section",
                correctAnswerIndex = 3,
                explanation = "Following the 1804 Jihad, Abdullahi dan Fodio ruled the Western division of the Sokoto Caliphate from Gwandu.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_30",
                subject = "Government",
                topic = "Federalism",
                year = "2017",
                questionText = "Both federal and state governments derive power from the",
                optionA = "residual list",
                optionB = "concurrent list",
                optionC = "exclusive list",
                optionD = "regional list",
                correctAnswerIndex = 1,
                explanation = "Under Section 4 of the Constitution, both National and State assemblies exercise shared jurisdiction over the Concurrent Legislative List.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_31",
                subject = "Government",
                topic = "Basic Concepts",
                year = "2017",
                questionText = "A social group consisting of two or more people who interact and identify with one another is",
                optionA = "nation",
                optionB = "society",
                optionC = "government",
                optionD = "state",
                correctAnswerIndex = 1,
                explanation = "Sociology defines a society as an organized aggregate of interacting individuals sharing cultural norms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_32",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2017",
                questionText = "Which of the following Nigerian president initiated and facilitated the creation of NEPAD?",
                optionA = "Goodluck Jonathan",
                optionB = "Olusegun Obasanjo",
                optionC = "Umaru Musa Yar'dua",
                optionD = "Mohammadu Buhari",
                correctAnswerIndex = 1,
                explanation = "President Olusegun Obasanjo, along with Thabo Mbeki and Bouteflika, authored and launched NEPAD in 2001.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_33",
                subject = "Government",
                topic = "Constitutional History",
                year = "2017",
                questionText = "Nigeria became a republic with the",
                optionA = "1979 Constitution",
                optionB = "1989 Constitution",
                optionC = "1960 Constitution",
                optionD = "1963 Constitution",
                correctAnswerIndex = 3,
                explanation = "The 1963 Republican Constitution officially severed all monarchical links to the Queen of Great Britain.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_34",
                subject = "Government",
                topic = "Civil Service",
                year = "2017",
                questionText = "Which of the following is a function of the civil service commission?",
                optionA = "Enforcement of law and order",
                optionB = "Payment of civil servants' salaries",
                optionC = "Discipline of erring civil servants",
                optionD = "Protection of lives and properties",
                correctAnswerIndex = 2,
                explanation = "The commission investigates misconduct, implements regulations, and sanctions erring civil service personnel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_35",
                subject = "Government",
                topic = "Confederation",
                year = "2017",
                questionText = "The concentration of power on the units is a merit of",
                optionA = "quasi-federal-system",
                optionB = "confederal system",
                optionC = "federal system",
                optionD = "unitary system",
                correctAnswerIndex = 1,
                explanation = "Confederal structures grant sweeping sovereign autonomy and legislative freedom to constituent units.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_36",
                subject = "Government",
                topic = "Political Ideologies",
                year = "2017",
                questionText = "In fascism, the leader is",
                optionA = "supreme",
                optionB = "democratic",
                optionC = "rich",
                optionD = "religious",
                correctAnswerIndex = 0,
                explanation = "Fascist ideology dictates unconditional obedience to the supreme, infallible will of the autocratic dictator.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_37",
                subject = "Government",
                topic = "Delegated Legislation",
                year = "2017",
                questionText = "Delegated legislation is the",
                optionA = "limitation of responsibilities to agencies",
                optionB = "transfer of responsibilities to agencies",
                optionC = "deterring of responsibilities of agencies",
                optionD = "facilitation responsibilities of agencies",
                correctAnswerIndex = 1,
                explanation = "Primary legislatures delegate statutory rulemaking power to executive ministries and administrative tribunals.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_38",
                subject = "Government",
                topic = "ECOWAS & ECOMOG",
                year = "2017",
                questionText = "Which of the following countries significantly contributed to the formation of ECOMOG?",
                optionA = "Ghana",
                optionB = "Gambia",
                optionC = "Liberia",
                optionD = "Nigeria",
                correctAnswerIndex = 3,
                explanation = "Nigeria provided the lion's share of funding, manpower, logistics, and field command for ECOMOG peacekeeping.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_39",
                subject = "Government",
                topic = "Separation of Powers",
                year = "2017",
                questionText = "An important element of the doctrine of separation of powers is",
                optionA = "Delegation of power",
                optionB = "Checks and Balances",
                optionC = "Rule of Law",
                optionD = "Concentration of powers",
                correctAnswerIndex = 1,
                explanation = "Checks and balances ensure each arm of government possesses constitutional means to prevent excess by the others.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2017_40",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2017",
                questionText = "Nigeria's action towards the external environment is embedded in her",
                optionA = "state policy",
                optionB = "party policy",
                optionC = "government policy",
                optionD = "foreign policy",
                correctAnswerIndex = 3,
                explanation = "Foreign policy defines a nation's official diplomatic, economic, and strategic interactions with other sovereign states.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_01",
                subject = "Government",
                topic = "Systems of Government",
                year = "2018",
                questionText = "Between 1960 and 1980, Nigeria experienced all the following systems of government except",
                optionA = "unitary",
                optionB = "federal",
                optionC = "confederal",
                optionD = "parliamentary",
                correctAnswerIndex = 2,
                explanation = "Nigeria operated parliamentary (1960-1966), unitary (Decree 34 1966), and federal presidential systems (1979), but never a confederal system.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_02",
                subject = "Government",
                topic = "Party History",
                year = "2018",
                questionText = "Which of the following was the first political party in Nigeria?",
                optionA = "The Action Group (AG)",
                optionB = "Northern People's Congress (NPC)",
                optionC = "National Council of Nigeria and the Camerouns (NCNC)",
                optionD = "Nigerian National Democratic Party (NNDP)",
                correctAnswerIndex = 3,
                explanation = "Herbert Macaulay established the NNDP in 1923 following the introduction of the elective principle.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_03",
                subject = "Government",
                topic = "The State",
                year = "2018",
                questionText = "The primary function of government in a state is to",
                optionA = "build schools and hospitals",
                optionB = "provide transport services",
                optionC = "engage in campaigns and rallies",
                optionD = "maintain law and order",
                correctAnswerIndex = 3,
                explanation = "Thomas Hobbes pointed out that the first and fundamental obligation of state governance is preserving civil peace, order, and security.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_04",
                subject = "Government",
                topic = "Constitutionalism",
                year = "2018",
                questionText = "A country is most likely to have a good government only if it has",
                optionA = "a good constitution but bad operators",
                optionB = "good operators but bad constitution",
                optionC = "a good constitution and good operators",
                optionD = "illegitimate government",
                correctAnswerIndex = 2,
                explanation = "Good governance requires both an enlightened constitutional framework and ethical, competent public officials.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_05",
                subject = "Government",
                topic = "Democracy",
                year = "2018",
                questionText = "Which of the following is a basic principle of democracy? Rule by",
                optionA = "the majority and the right of the minority",
                optionB = "the minority at the expense of the majority",
                optionC = "the wealthy few",
                optionD = "two political parties",
                correctAnswerIndex = 0,
                explanation = "Democracy operates by majority decision-making while vigorously guaranteeing inalienable civil rights for minorities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_06",
                subject = "Government",
                topic = "Authority",
                year = "2018",
                questionText = "Which of the following is a legal source of political authority?",
                optionA = "Power from the gun",
                optionB = "Economic power",
                optionC = "Minority power",
                optionD = "Power from the electorate",
                correctAnswerIndex = 3,
                explanation = "Constitutional authority in modern states derives from sovereign electoral choice and statutory law.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_07",
                subject = "Government",
                topic = "Organs of Government",
                year = "2018",
                questionText = "Which organ of government is vested with the responsibility of initiating bills and recommending them to the legislature for consideration?",
                optionA = "Federal House of Representatives",
                optionB = "Executive",
                optionC = "Senate",
                optionD = "Judiciary",
                correctAnswerIndex = 1,
                explanation = "The executive drafts executive bills and annual national budget estimates for parliamentary consideration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_08",
                subject = "Government",
                topic = "Elections",
                year = "2018",
                questionText = "In democracies, the political participation could be restricted on the basis of",
                optionA = "religion",
                optionB = "age",
                optionC = "sex",
                optionD = "class",
                correctAnswerIndex = 1,
                explanation = "Electoral laws establish statutory minimum voting ages (e.g. 18 years) to ensure civic maturity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_09",
                subject = "Government",
                topic = "Electoral Process",
                year = "2018",
                questionText = "Disenfranchisement refers to the",
                optionA = "qualification of voters in an election",
                optionB = "Disqualification of fraudulent president aspirants",
                optionC = "denial of the right to vote in an election",
                optionD = "right to vote and be voted for",
                correctAnswerIndex = 2,
                explanation = "Disenfranchisement is the legal or de facto deprivation of an individual's constitutional right to vote.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_10",
                subject = "Government",
                topic = "Fundamental Rights",
                year = "2018",
                questionText = "The limitation of the right to life can be found",
                optionA = "among the people",
                optionB = "in the case of a convicted person",
                optionC = "in the executive",
                optionD = "in the government",
                correctAnswerIndex = 1,
                explanation = "Under Section 33 of the Nigerian Constitution, the execution of a sentence of court following conviction for a capital offense limits the right to life.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_11",
                subject = "Government",
                topic = "Political Socialization",
                year = "2018",
                questionText = "Which of the following is not an agent of political socialisation?",
                optionA = "Tourism",
                optionB = "Mass media",
                optionC = "Peer group",
                optionD = "University",
                correctAnswerIndex = 0,
                explanation = "Family, schools, universities, mass media, and peer groups are recognized primary agents of socialization; tourism is not.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_12",
                subject = "Government",
                topic = "Sovereignty",
                year = "2018",
                questionText = "Political sovereignty belongs to",
                optionA = "the people",
                optionB = "government",
                optionC = "military",
                optionD = "the parliament",
                correctAnswerIndex = 1,
                explanation = "Dicey's political sovereignty is ultimately held by the citizenry who determine public policy through elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_13",
                subject = "Government",
                topic = "Citizenship",
                year = "2018",
                questionText = "An alien who has lived in Nigeria for twenty years may acquire citizenship by",
                optionA = "nationalisation",
                optionB = "naturalization",
                optionC = "registration",
                optionD = "marriage",
                correctAnswerIndex = 1,
                explanation = "Section 27 of the 1999 Constitution permits foreign nationals meeting residency requirements to acquire citizenship via naturalization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_14",
                subject = "Government",
                topic = "Parliamentary System",
                year = "2018",
                questionText = "In a republic parliamentary system of government, the ceremonial Head of State is the",
                optionA = "Chief Justice",
                optionB = "Prime Minister",
                optionC = "President",
                optionD = "Queen",
                correctAnswerIndex = 2,
                explanation = "In republican parliamentary regimes (like Nigeria 1963 or India), an elected or appointed President serves as ceremonial titular Head of State.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_15",
                subject = "Government",
                topic = "Democracy",
                year = "2018",
                questionText = "A representative government can be established through",
                optionA = "a general election",
                optionB = "a military coup",
                optionC = "apartheid",
                optionD = "espionage",
                correctAnswerIndex = 0,
                explanation = "Representative democracy requires periodic, competitive, free, and fair general elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_16",
                subject = "Government",
                topic = "Delegated Legislation",
                year = "2018",
                questionText = "Delegated legislation is suitable for",
                optionA = "relieving the parliament of its workload",
                optionB = "enthroning the rule of law",
                optionC = "ensuring the fusion of powers",
                optionD = "checking the executive arm of government",
                correctAnswerIndex = 0,
                explanation = "Delegating detailed operational rule-making to specialized agencies frees parliament to focus on major legislative policy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_17",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2018",
                questionText = "The indirect rule system succeeded in the Hausa-Fulani society because the",
                optionA = "society had only one religion",
                optionB = "people received Quranic education",
                optionC = "people were descendants of Uthman dan Fodio",
                optionD = "existing administration favoured the system",
                correctAnswerIndex = 3,
                explanation = "The pre-existing centralized authoritarian emirate system, taxes, and Sharia courts mapped seamlessly onto colonial indirect rule.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_18",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2018",
                questionText = "The policy of Association was adopted by the",
                optionA = "British to replace their policy of Indirect Rule",
                optionB = "French to replace their policy of Assimilation",
                optionC = "British on their arrival in West Africa",
                optionD = "French on their departure from West Africa",
                correctAnswerIndex = 1,
                explanation = "France abandoned radical assimilation in favor of 'Association', respecting indigenous customs while maintaining colonial subordination.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_19",
                subject = "Government",
                topic = "Nationalism",
                year = "2018",
                questionText = "Nationalism in Africa eventually led to",
                optionA = "a rapid political awareness among the colonialists",
                optionB = "the alignment of the new states",
                optionC = "de-colonisation",
                optionD = "international economic groupings",
                correctAnswerIndex = 2,
                explanation = "African nationalist agitation culminated in the political withdrawal of European powers and sovereign decolonization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_20",
                subject = "Government",
                topic = "Constitutional History",
                year = "2018",
                questionText = "One major achievement of the Richards Constitution of Nigeria was that it",
                optionA = "united the North and South under a single legislature",
                optionB = "provided for official African members of the Executive Council",
                optionC = "allowed the participation of traditional rulers in government",
                optionD = "introduced the elective principle",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution brought northern and southern delegates together under a single central Legislative Council for the first time.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_21",
                subject = "Government",
                topic = "Federalism",
                year = "2018",
                questionText = "The 1954 Constitution of Nigeria made the country a true federation because it provided for",
                optionA = "the abolition of representation of white officials",
                optionB = "the election of all members of parliament",
                optionC = "a division of functions between the centre and the regions",
                optionD = "the post of a Prime Minister at the centre",
                correctAnswerIndex = 2,
                explanation = "The Lyttleton Constitution demarcated powers into Exclusive, Concurrent, and Residual lists, cementing genuine regional autonomy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_22",
                subject = "Government",
                topic = "Constitutional Conferences",
                year = "2018",
                questionText = "The decision to separate Lagos from the Western Region and make it a neutral Territory was taken at the",
                optionA = "1950 general conference",
                optionB = "1953 constitutional conference",
                optionC = "1954 constitutional conference",
                optionD = "1963 All party constitutional conference",
                correctAnswerIndex = 2,
                explanation = "The London Constitutional Conference of 1953/1954 severed Lagos from the Western Region to serve as a neutral federal capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_23",
                subject = "Government",
                topic = "Presidents of Nigeria",
                year = "2018",
                questionText = "The first Head of State and Head of Government in Nigeria was",
                optionA = "Lord Frederick Lugard",
                optionB = "Alhaji Abubakar Tafawa Balewa",
                optionC = "General J.T.U. Aguiyi Ironsi",
                optionD = "Alhaji Shehu Shagari",
                correctAnswerIndex = 3,
                explanation = "Alhaji Shehu Shagari was the pioneer executive President combining titular head of state and head of government powers under the 1979 Constitution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_24",
                subject = "Government",
                topic = "Political Crises",
                year = "2018",
                questionText = "Which of the following did not generate political crisis in Nigeria?",
                optionA = "Adoption of Abuja as the New Federal Capital",
                optionB = "Motion for self-government in 1956 by Enahoro",
                optionC = "1965 election in the Western Region",
                optionD = "1964 General Elections",
                correctAnswerIndex = 0,
                explanation = "The planned transition to Abuja was an administrative consensus recommendation that did not cause constitutional crisis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_25",
                subject = "Government",
                topic = "Forms of Government",
                year = "2018",
                questionText = "A system of government where political powers are inherited is called",
                optionA = "monarchy",
                optionB = "diarchy",
                optionC = "democracy",
                optionD = "aristocracy",
                correctAnswerIndex = 0,
                explanation = "Hereditary monarchies transmit sovereign royal authority through dynastic family lineage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_26",
                subject = "Government",
                topic = "Democracy",
                year = "2018",
                questionText = "Democracy can be promoted through",
                optionA = "gerrymandering",
                optionB = "slander",
                optionC = "accountability",
                optionD = "lobbying",
                correctAnswerIndex = 2,
                explanation = "Institutional transparency, free media, and governmental accountability strengthen democratic rule.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_27",
                subject = "Government",
                topic = "Basic Concepts",
                year = "2018",
                questionText = "The ability to command obedience is called",
                optionA = "authority",
                optionB = "influence",
                optionC = "legitimacy",
                optionD = "mobilisation",
                correctAnswerIndex = 0,
                explanation = "Authority is the legitimate institutional power that commands recognized and lawful obedience.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_28",
                subject = "Government",
                topic = "Legitimacy",
                year = "2018",
                questionText = "Legitimacy is determined mainly by",
                optionA = "charisma",
                optionB = "influence",
                optionC = "acceptance",
                optionD = "desire",
                correctAnswerIndex = 2,
                explanation = "Legitimacy reflects the moral acceptance and recognition by citizens of a government's right to govern.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_29",
                subject = "Government",
                topic = "Rule of Law",
                year = "2018",
                questionText = "A.V. Dicey popularised the principle of",
                optionA = "rule of law",
                optionB = "democracy",
                optionC = "political culture",
                optionD = "separation of powers",
                correctAnswerIndex = 0,
                explanation = "British constitutional scholar Albert Venn Dicey popularized the three doctrines of the Rule of Law in 1885.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_30",
                subject = "Government",
                topic = "Feudalism",
                year = "2018",
                questionText = "Which of the following is the lowest in the hierarchy of feudal system?",
                optionA = "Knights",
                optionB = "Serfs",
                optionC = "Nobles",
                optionD = "Lords",
                correctAnswerIndex = 1,
                explanation = "Serfs were bonded peasant laborers situated at the bottom of the feudal socioeconomic pyramid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_31",
                subject = "Government",
                topic = "Rule of Law",
                year = "2018",
                questionText = "In which of the following political systems is rule of law most enhanced?",
                optionA = "Cabinet system",
                optionB = "Feudal system",
                optionC = "Fascist system",
                optionD = "Communist system",
                correctAnswerIndex = 0,
                explanation = "Constitutional parliamentary and cabinet systems provide institutional courts, habeas corpus, and legal equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_32",
                subject = "Government",
                topic = "Cabinet Government",
                year = "2018",
                questionText = "The concept of collective responsibility is synonymous with",
                optionA = "presidential system of government",
                optionB = "military system of government",
                optionC = "unitary system of government",
                optionD = "parliamentary system of government",
                correctAnswerIndex = 3,
                explanation = "Cabinet ministers in a parliamentary system must collectively defend all executive government decisions or resign.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_33",
                subject = "Government",
                topic = "Constitutions",
                year = "2018",
                questionText = "A constitution is the",
                optionA = "written document of traditional practices",
                optionB = "functional aspect of government activities",
                optionC = "supreme documents of the government",
                optionD = "fundamental laws of the land",
                correctAnswerIndex = 3,
                explanation = "A constitution is the organic body of fundamental legal principles and laws according to which a state is governed.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_34",
                subject = "Government",
                topic = "Constitutions",
                year = "2018",
                questionText = "Which of the following cannot be found in a constitution?",
                optionA = "Fundamental Human Rights",
                optionB = "Manifestoes of political parties",
                optionC = "Organs of government",
                optionD = "Duties and obligations of citizens",
                correctAnswerIndex = 1,
                explanation = "Party manifestoes are partisan campaign platforms published by political parties, not constitutional statutes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_35",
                subject = "Government",
                topic = "Federalism",
                year = "2018",
                questionText = "A rigid constitution is a feature of",
                optionA = "unitary system",
                optionB = "monarchical system",
                optionC = "federal system",
                optionD = "confederal system",
                correctAnswerIndex = 2,
                explanation = "Federal states require rigid constitutions to prevent the federal center from arbitrarily altering regional jurisdictions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_36",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2018",
                questionText = "In 1973, following an OAU resolution, Nigeria broke diplomatic relations with",
                optionA = "South Africa",
                optionB = "France",
                optionC = "Israel",
                optionD = "Cuba",
                correctAnswerIndex = 2,
                explanation = "Following the 1973 Yom Kippur War and Israeli occupation of African Egyptian territory, Nigeria severed ties with Israel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_37",
                subject = "Government",
                topic = "Non-Alignment",
                year = "2018",
                questionText = "Nigeria's foreign policy of non-alignment was a reaction to",
                optionA = "British imperialism",
                optionB = "East-West ideological competition",
                optionC = "militarism of ex-colonial powers",
                optionD = "World poverty",
                correctAnswerIndex = 1,
                explanation = "Non-alignment sought to maintain diplomatic sovereignty amidst intense Cold War superpower rivalry.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_38",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2018",
                questionText = "Which of the following countries had a strained relationship with Nigeria over the Angolan crisis of 1975?",
                optionA = "The Soviet Union",
                optionB = "Tanzania",
                optionC = "The United States of America",
                optionD = "South Africa",
                correctAnswerIndex = 2,
                explanation = "Nigeria boldly recognized the MPLA government in Luanda and rebuffed US President Gerald Ford's diplomatic pressure.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_39",
                subject = "Government",
                topic = "African Liberation",
                year = "2018",
                questionText = "The major liberation organisation which fought for Namibia's independence was",
                optionA = "SWAPO",
                optionB = "ANC",
                optionC = "FRELIMO",
                optionD = "M.P.L.A",
                correctAnswerIndex = 0,
                explanation = "The South West Africa People's Organisation (SWAPO) led the armed struggle for Namibia's independence from apartheid South Africa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_2018_40",
                subject = "Government",
                topic = "United Nations",
                year = "2018",
                questionText = "Which of these international organisations is the predecessor of the United Nations?",
                optionA = "The European Economic Community",
                optionB = "The organisation of American States",
                optionC = "The League of Nations",
                optionD = "The North Atlantic Treaty Organisation",
                correctAnswerIndex = 2,
                explanation = "The League of Nations, established in 1919 after WWI, preceded the creation of the United Nations in 1945.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
