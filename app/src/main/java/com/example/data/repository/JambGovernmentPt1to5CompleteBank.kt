package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Government Question Series (Parts 1 to 5) with Answers and Explanations
 * Total Verified Questions: 59
 */
object JambGovernmentPt1to5CompleteBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_02",
                subject = "Government",
                topic = "Political Culture & Socialization",
                year = "Part 1",
                questionText = "The development of attitudes and beliefs about a political system is _____.",
                optionA = "political emancipation",
                optionB = "political socialization",
                optionC = "political participation",
                optionD = "political orientation",
                correctAnswerIndex = 1,
                explanation = "Political socialization is the process through which individuals acquire political culture, beliefs, and attitudes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_03",
                subject = "Government",
                topic = "Political Culture",
                year = "Part 1",
                questionText = "Political behaviour is governed by _____.",
                optionA = "political socialization",
                optionB = "political ideology",
                optionC = "political economy",
                optionD = "political culture",
                correctAnswerIndex = 3,
                explanation = "Political culture encompasses the shared values, sentiments, and norms that govern political behavior in a society.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_04",
                subject = "Government",
                topic = "Sovereignty",
                year = "Part 1",
                questionText = "In a nation, sovereignty is vested in the _____.",
                optionA = "community",
                optionB = "state",
                optionC = "elite",
                optionD = "electorate",
                correctAnswerIndex = 1,
                explanation = "Sovereignty—the supreme power of lawmaking and enforcement—resides inherently in the State.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_05",
                subject = "Government",
                topic = "Democracy",
                year = "Part 1",
                questionText = "Which of the following is a feature of democracy?",
                optionA = "interdependence of states",
                optionB = "state responsibilities to society",
                optionC = "power vested in minority parties",
                optionD = "popular consultation",
                correctAnswerIndex = 3,
                explanation = "Democracy requires popular consultation and regular citizen participation in governance through elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_06",
                subject = "Government",
                topic = "Economic Systems",
                year = "Part 1",
                questionText = "Private ownership of the means of production is central to _____.",
                optionA = "fascism",
                optionB = "feudalism",
                optionC = "capitalism",
                optionD = "communism",
                correctAnswerIndex = 2,
                explanation = "Capitalism is characterized by private ownership of property, capital, and production with free-market competition.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_07",
                subject = "Government",
                topic = "Feudalism",
                year = "Part 1",
                questionText = "A system based on hierarchies of land ownership is _____.",
                optionA = "feudalism",
                optionB = "totalitarianism",
                optionC = "communism",
                optionD = "fascism",
                correctAnswerIndex = 0,
                explanation = "Feudalism is an agrarian social hierarchy where land is held by lords and farmed by serfs/vassals.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_08",
                subject = "Government",
                topic = "Delegated Legislation",
                year = "Part 1",
                questionText = "Which of the following performs quasi-legislative functions?",
                optionA = "The Judiciary",
                optionB = "The Traditional Institutions",
                optionC = "The Civil Service",
                optionD = "The Executive",
                correctAnswerIndex = 3,
                explanation = "The Executive exercises quasi-legislative powers when issuing delegated legislation (statutory orders, decrees, and regulations).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_09",
                subject = "Government",
                topic = "Confederation",
                year = "Part 1",
                questionText = "A major weakness of confederation is _____.",
                optionA = "over-concentration of authority",
                optionB = "tendency towards secession",
                optionC = "lack of local independence",
                optionD = "lack of common currency",
                correctAnswerIndex = 1,
                explanation = "In a loose confederacy, constituent states hold sovereign power and can secede easily due to a weak central authority.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_10",
                subject = "Government",
                topic = "Legislature",
                year = "Part 1",
                questionText = "Members of a parliament are required to report the proceedings of the house to their _____.",
                optionA = "constituencies",
                optionB = "local government chairmen",
                optionC = "traditional rulers",
                optionD = "political parties",
                correctAnswerIndex = 0,
                explanation = "Lawmakers represent and report legislative proceedings back to their local electoral constituencies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_11",
                subject = "Government",
                topic = "Unitary States",
                year = "Part 1",
                questionText = "Which of the following countries is a unitary state?",
                optionA = "Nigeria",
                optionB = "India",
                optionC = "United States of America",
                optionD = "Ghana",
                correctAnswerIndex = 3,
                explanation = "Ghana operates a unitary constitutional system, whereas Nigeria, USA, and India are federations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_12",
                subject = "Government",
                topic = "Parliamentary Terms",
                year = "Part 1",
                questionText = "Ending a session of parliament by royal proclamation means the _____.",
                optionA = "expiration of parliament",
                optionB = "prorogation of parliament",
                optionC = "adjournment of parliament",
                optionD = "dissolution of parliament",
                correctAnswerIndex = 1,
                explanation = "Prorogation is the formal discontinuance of a parliamentary session without dissolving the assembly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_13",
                subject = "Government",
                topic = "Parliamentary System",
                year = "Part 1",
                questionText = "A main feature of the parliamentary system is that _____.",
                optionA = "the executive consists of all party members",
                optionB = "judges are drawn from the ruling party",
                optionC = "electoral commissioners leave at the end of their tenure",
                optionD = "the executive is appointed by the legislature",
                correctAnswerIndex = 3,
                explanation = "In a parliamentary system, the Prime Minister and Cabinet are drawn from and accountable to the legislature.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_14",
                subject = "Government",
                topic = "Socialism",
                year = "Part 1",
                questionText = "In a socialist economy, private accumulation of wealth is _____.",
                optionA = "prohibited",
                optionB = "regulated",
                optionC = "limited",
                optionD = "encouraged",
                correctAnswerIndex = 0,
                explanation = "Socialism restricts or prohibits private capital accumulation, vesting production in state/public hands.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_15",
                subject = "Government",
                topic = "Constitutional History",
                year = "Part 1",
                questionText = "The earliest classification of constitutions was the work of _____.",
                optionA = "Aristotle",
                optionB = "J.J. Rousseau",
                optionC = "K.C. Wheare",
                optionD = "Plato",
                correctAnswerIndex = 0,
                explanation = "Aristotle classified 158 Greek city-state constitutions based on who rules and for whose benefit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_16",
                subject = "Government",
                topic = "Constitutionalism",
                year = "Part 1",
                questionText = "Constitutionalism refers to _____.",
                optionA = "the process of drafting a constitution",
                optionB = "amendment of an existing constitution",
                optionC = "the process of operating a constitution",
                optionD = "strict adherence to a constitution",
                correctAnswerIndex = 3,
                explanation = "Constitutionalism is the principle that government authority is derived from and limited by the constitution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_17",
                subject = "Government",
                topic = "Delegated Legislation",
                year = "Part 1",
                questionText = "An advantage of delegated legislation is that _____.",
                optionA = "much time is saved in the process",
                optionB = "technical issues are handled by experts",
                optionC = "ministers and lawmakers work together",
                optionD = "it hastens the implementation of policy",
                correctAnswerIndex = 1,
                explanation = "Delegated legislation enables technical, complex administrative regulations to be drafted by subject matter experts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_18",
                subject = "Government",
                topic = "Citizenship Duties",
                year = "Part 1",
                questionText = "One essential duty of a citizen to his state is to _____.",
                optionA = "support the government in power",
                optionB = "recite the pledge",
                optionC = "pay his tax",
                optionD = "encourage other citizens",
                correctAnswerIndex = 2,
                explanation = "Payment of statutory taxes is a fundamental legal obligation of citizenship to fund public administration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_19",
                subject = "Government",
                topic = "Franchise",
                year = "Part 1",
                questionText = "Franchise in an electoral process means the _____.",
                optionA = "right to vote",
                optionB = "ownership of means of production",
                optionC = "the sovereignty of a nation",
                optionD = "rights and duties of a citizen",
                correctAnswerIndex = 0,
                explanation = "Franchise (suffrage) is the constitutional right of eligible citizens to cast their votes in public elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_20",
                subject = "Government",
                topic = "Party Systems",
                year = "Part 1",
                questionText = "The type of party system in practice is defined by the _____.",
                optionA = "relationship between the parties and electorate",
                optionB = "structure of the political parties",
                optionC = "manner in which the parties operate",
                optionD = "number of political parties in a country",
                correctAnswerIndex = 3,
                explanation = "Party systems are classified by number: one-party, two-party, or multi-party systems.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_21",
                subject = "Government",
                topic = "Pressure Groups",
                year = "Part 1",
                questionText = "Pressure groups harmonize different individual concerns through _____.",
                optionA = "interest formulation",
                optionB = "interest manipulation",
                optionC = "interest mobilisation",
                optionD = "interest aggregation",
                correctAnswerIndex = 3,
                explanation = "Interest aggregation is the consolidation of diverse citizen demands into unified policy proposals.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_22",
                subject = "Government",
                topic = "Public Opinion",
                year = "Part 1",
                questionText = "Opinion polls are organized to find out the _____.",
                optionA = "benefits derived by people from government",
                optionB = "people's thought about a particular government policy",
                optionC = "people's expectations from the government",
                optionD = "feelings of people about particular issues and policies",
                correctAnswerIndex = 3,
                explanation = "Opinion polls sample public sentiments, reactions, and preferences regarding specific societal policies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_23",
                subject = "Government",
                topic = "Pre-Colonial Systems",
                year = "Part 1",
                questionText = "In pre-colonial Igboland, autocratic rule was made difficult by the _____.",
                optionA = "fear of dethronement",
                optionB = "absence of a centralized system of authority",
                optionC = "pressure from age grades",
                optionD = "activities of cult societies",
                correctAnswerIndex = 1,
                explanation = "Traditional Igbo society was acephalous (segmentary), featuring direct democratic village assemblies (Oha-na-eze) without centralized kings.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_24",
                subject = "Government",
                topic = "Pre-Colonial Systems",
                year = "Part 1",
                questionText = "The Yoruba traditional system of government was _____.",
                optionA = "republican",
                optionB = "democratic",
                optionC = "monarchical",
                optionD = "egalitarian",
                correctAnswerIndex = 2,
                explanation = "Pre-colonial Yoruba governance was constitutional monarchical, led by the Oba (King) assisted by the council of chiefs (Oyo Mesi).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_25",
                subject = "Government",
                topic = "Sokoto Caliphate",
                year = "Part 1",
                questionText = "Under the pre-colonial Sokoto Caliphate system, the next in command to the sultan was the _____.",
                optionA = "Alkali",
                optionB = "Galadima",
                optionC = "Madaki",
                optionD = "Waziri",
                correctAnswerIndex = 3,
                explanation = "The Waziri (Grand Vizier) was the prime minister and second-in-command to the Sultan of Sokoto.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_26",
                subject = "Government",
                topic = "Acephalous Societies",
                year = "Part 1",
                questionText = "Which of the following societies was classified as acephalous?",
                optionA = "Benin",
                optionB = "Ibibio",
                optionC = "Igbo",
                optionD = "Ijaw",
                correctAnswerIndex = 2,
                explanation = "Traditional Igbo society operated without a centralized political monarch, making it a classic acephalous (stateless) system.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_27",
                subject = "Government",
                topic = "Indirect Rule",
                year = "Part 1",
                questionText = "Indirect rule encouraged _____.",
                optionA = "communal integration",
                optionB = "exploitation and oppression",
                optionC = "inter-communal cooperation",
                optionD = "the rise of nationalism",
                correctAnswerIndex = 3,
                explanation = "The exclusionary nature of British Indirect Rule energized educated Africans to launch nationalist resistance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_28",
                subject = "Government",
                topic = "Nationalism",
                year = "Part 1",
                questionText = "The main achievement of the nationalists in Nigeria was _____.",
                optionA = "registration of political parties",
                optionB = "economic liberation of the nation",
                optionC = "political liberation of the nation",
                optionD = "building the nation",
                correctAnswerIndex = 2,
                explanation = "Nationalist movements successfully ended British colonial rule and secured Nigerian political independence in 1960.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_29",
                subject = "Government",
                topic = "Nationalism",
                year = "Part 1",
                questionText = "The major external factor that promoted nationalism in Nigeria was _____.",
                optionA = "Pan-Africanism",
                optionB = "the Yom-Kippur War",
                optionC = "the Second World War",
                optionD = "Anti-apartheid Movement",
                correctAnswerIndex = 2,
                explanation = "World War II shattered the myth of European invincibility as African veterans returned with military and organizational experience.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_30",
                subject = "Government",
                topic = "Constitutional History",
                year = "Part 1",
                questionText = "The presidential system of government was introduced in Nigeria with the Constitution of _____.",
                optionA = "1989",
                optionB = "1999",
                optionC = "1960",
                optionD = "1979",
                correctAnswerIndex = 3,
                explanation = "The 1979 Second Republic Constitution replaced the Westminster parliamentary system with an executive presidency.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q30)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_31",
                subject = "Government",
                topic = "First Republic Politics",
                year = "Part 1",
                questionText = "The Action Group crisis of 1962/1963 led to the formation of _____.",
                optionA = "UPP",
                optionB = "NEPU",
                optionC = "NPC",
                optionD = "NCNC",
                correctAnswerIndex = 0,
                explanation = "Chief S.L. Akintola broke away from Chief Obafemi Awolowo's Action Group to establish the United Peoples Party (UPP).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q31)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_32",
                subject = "Government",
                topic = "1963 Constitution",
                year = "Part 1",
                questionText = "Under the 1963 Republican Constitution, the power of judicial review was vested in the _____.",
                optionA = "President",
                optionB = "Chief Justice",
                optionC = "Supreme Court",
                optionD = "Parliament",
                correctAnswerIndex = 2,
                explanation = "The Supreme Court became Nigeria's highest apex court, replacing the British Privy Council.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q32)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_33",
                subject = "Government",
                topic = "Civil Service",
                year = "Part 1",
                questionText = "The rules and regulations of the civil service are called _____.",
                optionA = "General Order (Public Service Rules)",
                optionB = "Bureaucratic Order",
                optionC = "Service Order",
                optionD = "Administrative Order",
                correctAnswerIndex = 0,
                explanation = "General Orders (now Public Service Rules) govern civil service conduct, promotions, and discipline.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q33)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_34",
                subject = "Government",
                topic = "Anti-Corruption Bodies",
                year = "Part 1",
                questionText = "The Code of Conduct Bureau was essentially established to _____.",
                optionA = "reduce corruption in public life",
                optionB = "protect the rights of public servants",
                optionC = "enhance probity and accountability in public service",
                optionD = "ensure the independence of the public service",
                correctAnswerIndex = 2,
                explanation = "The Code of Conduct Bureau enforces asset declaration and ethical standards among public officers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q34)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_35",
                subject = "Government",
                topic = "Second Republic Parties",
                year = "Part 1",
                questionText = "Which of the following political parties was the first to be formed when the ban on politics was lifted in 1978?",
                optionA = "NPP",
                optionB = "PRP",
                optionC = "NPN",
                optionD = "UPN",
                correctAnswerIndex = 3,
                explanation = "Chief Obafemi Awolowo launched the Unity Party of Nigeria (UPN) immediately following the lifting of the ban in Sept 1978.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q35)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_36",
                subject = "Government",
                topic = "Federal Character",
                year = "Part 1",
                questionText = "The principle of federal character was adopted in order to promote equitable allocation of _____.",
                optionA = "positions and appointments among people of various regions",
                optionB = "appointments between the North and the South",
                optionC = "opportunities between the males and females",
                optionD = "revenue between groups in the country",
                correctAnswerIndex = 0,
                explanation = "Federal character ensures fair representation of all ethnic and geographical regions in federal appointments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q36)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_37",
                subject = "Government",
                topic = "Nigerian Federation",
                year = "Part 1",
                questionText = "The component units of the Nigerian Federation comprise _____.",
                optionA = "national assembly, military, police and civil service",
                optionB = "constituency, ward, emirate and chiefdom",
                optionC = "federal, state, local government and federal capital territory",
                optionD = "federal capital territory, national assembly, Supreme Court, and civil service",
                correctAnswerIndex = 2,
                explanation = "Nigeria's federal structure consists of three tiers of government (Federal, States, Local Governments) plus the FCT.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q37)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_38",
                subject = "Government",
                topic = "Public Enterprise Reform",
                year = "Part 1",
                questionText = "In Nigeria, privatization and commercialization policies were introduced to _____.",
                optionA = "hand over the control of commercial ventures to citizens",
                optionB = "increase the asset base of government",
                optionC = "divest government major control of commercial ventures and improve efficiency",
                optionD = "allow government control of the private sector",
                correctAnswerIndex = 2,
                explanation = "Privatization relieves fiscal burdens on the state by divesting government shareholdings to market investors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q38)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_39",
                subject = "Government",
                topic = "Public Corporations",
                year = "Part 1",
                questionText = "An example of a public corporation in Nigeria is _____.",
                optionA = "National Universities Commission",
                optionB = "Nigerian Television Authority",
                optionC = "National Population Commission",
                optionD = "First Bank of Nigeria",
                correctAnswerIndex = 1,
                explanation = "NTA (Nigerian Television Authority) is a statutory public enterprise providing public broadcasting.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q39)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_40",
                subject = "Government",
                topic = "Local Government Reforms",
                year = "Part 1",
                questionText = "Following the reform of the Native Authority system in Northern Nigeria, traditional rulers became _____.",
                optionA = "Council",
                optionB = "Chief-and-Council",
                optionC = "Prefects",
                optionD = "Chief-in-Council",
                correctAnswerIndex = 1,
                explanation = "Reforms subordinated traditional emirs to institutionalized Chief-and-Council structures with elected members.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q40)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_41",
                subject = "Government",
                topic = "State Creation",
                year = "Part 1",
                questionText = "Under whose regime were Akwa-Ibom and Katsina States created?",
                optionA = "Gen Murtala Muhammed",
                optionB = "Gen Ibrahim Babangida",
                optionC = "Gen Sani Abacha",
                optionD = "Gen Yakubu Gowon",
                correctAnswerIndex = 1,
                explanation = "General Ibrahim Babangida created Katsina and Akwa Ibom states on September 23, 1987.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q41)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_42",
                subject = "Government",
                topic = "Election Tribunals",
                year = "Part 1",
                questionText = "Under the 1999 Constitution of the Federal Republic of Nigeria, the appointment and posting of members of election tribunals is the responsibility of the _____.",
                optionA = "Chairman, INEC",
                optionB = "President of Nigeria",
                optionC = "Chief Justice of Nigeria",
                optionD = "President, Court of Appeal",
                correctAnswerIndex = 3,
                explanation = "The President of the Court of Appeal possesses constitutional authority to constitute and post election petition tribunal judges.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q42)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_43",
                subject = "Government",
                topic = "African Decolonization",
                year = "Part 1",
                questionText = "Rhodesia was the former colonial name of _____.",
                optionA = "Zimbabwe",
                optionB = "Swaziland",
                optionC = "Zambia",
                optionD = "Namibia",
                correctAnswerIndex = 0,
                explanation = "Southern Rhodesia attained sovereign majority rule independence in 1980 as Zimbabwe.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q43)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_44",
                subject = "Government",
                topic = "Foreign Policy",
                year = "Part 1",
                questionText = "The adoption of non-alignment as a principle of Nigeria's foreign policy was aimed at _____.",
                optionA = "promoting Nigeria's leadership aspiration in Africa",
                optionB = "attaining equal status with the world powers",
                optionC = "fulfilling a basic requirement for acceptance in the UN Security Council",
                optionD = "insulating Nigeria against having to take sides in the Cold War",
                correctAnswerIndex = 3,
                explanation = "Non-alignment ensured Nigeria avoided entanglements in the ideological rivalry between the USA and USSR.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q44)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_46",
                subject = "Government",
                topic = "Non-Aligned Movement",
                year = "Part 1",
                questionText = "Which of the following was the Nigerian Secretary General of OPEC?",
                optionA = "Jibril Aminu",
                optionB = "Aret Adams",
                optionC = "Dalhatu Bayero",
                optionD = "Rilwan Lukwan",
                correctAnswerIndex = 3,
                explanation = "Dr. Rilwanu Lukman served with distinction as Secretary General and President of the OPEC Conference.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q46)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_47",
                subject = "Government",
                topic = "Regional Integration",
                year = "Part 1",
                questionText = "Which of the following countries pioneered the idea of ECOWAS alongside Nigeria?",
                optionA = "Liberia",
                optionB = "Togo",
                optionC = "Cote d'Ivoire",
                optionD = "Mali",
                correctAnswerIndex = 1,
                explanation = "General Yakubu Gowon of Nigeria and President Gnassingbé Eyadéma of Togo co-founded ECOWAS in 1975.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q47)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_48",
                subject = "Government",
                topic = "International Organizations",
                year = "Part 1",
                questionText = "Which of the following international organizations was in existence before the Second World War?",
                optionA = "The UNO",
                optionB = "The OAU",
                optionC = "The League of Nations",
                optionD = "The ECOWAS",
                correctAnswerIndex = 2,
                explanation = "The League of Nations was established in 1919 following World War I, preceding the 1945 UN.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q48)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_49",
                subject = "Government",
                topic = "United Nations",
                year = "Part 1",
                questionText = "The organ of the United Nations responsible for the approval of its annual budget is the _____.",
                optionA = "Secretariat",
                optionB = "Security Council",
                optionC = "General Assembly",
                optionD = "Economic and Social Council",
                correctAnswerIndex = 2,
                explanation = "The General Assembly reviews and votes to approve the United Nations' biennial budget.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q49)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p1_50",
                subject = "Government",
                topic = "OPEC",
                year = "Part 1",
                questionText = "Each member state is represented on the Board of Governors of OPEC for a period of _____.",
                optionA = "2 years",
                optionB = "3 years",
                optionC = "4 years",
                optionD = "1 year",
                correctAnswerIndex = 0,
                explanation = "OPEC Board Governors serve a term of 2 years representing their member nations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 1 (Q50)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p2_02",
                subject = "Government",
                topic = "State Sovereignty",
                year = "Part 2",
                questionText = "The distinctive attribute of a state is the monopoly of _____.",
                optionA = "control",
                optionB = "power",
                optionC = "violence (legitimate force)",
                optionD = "justice",
                correctAnswerIndex = 2,
                explanation = "Max Weber defined the modern state by its monopoly on the legitimate use of physical force/violence within a territory.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 2 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p2_03",
                subject = "Government",
                topic = "State Definition",
                year = "Part 2",
                questionText = "State as a political entity refers to _____.",
                optionA = "An organized group within a definite territory",
                optionB = "An association of men in a given society",
                optionC = "A branch of a nation",
                optionD = "A geographical location",
                correctAnswerIndex = 0,
                explanation = "A state is an organized political community occupying a defined territory under a sovereign government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 2 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p2_06",
                subject = "Government",
                topic = "Judicial Functions",
                year = "Part 2",
                questionText = "One judicial function performed by the executive is _____.",
                optionA = "Granting of amnesty (prerogative of mercy)",
                optionB = "Implementing judicial orders",
                optionC = "Ensuring obedience to the law",
                optionD = "Appointing judges",
                correctAnswerIndex = 0,
                explanation = "The Head of State exercises executive prerogative of mercy to pardon convicts or grant amnesty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 2 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p2_14",
                subject = "Government",
                topic = "Separation of Powers",
                year = "Part 2",
                questionText = "To ensure the rights and freedom of citizens, the powers of the arms of government must be _____.",
                optionA = "fused",
                optionB = "incorporated",
                optionC = "separated",
                optionD = "rotated",
                correctAnswerIndex = 2,
                explanation = "Montesquieu established that liberty is safeguarded when legislative, executive, and judicial powers are strictly separated.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 2 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p3_06",
                subject = "Government",
                topic = "Aristotelian Government",
                year = "Part 3",
                questionText = "According to Aristotle, a form of government in which the few rule for the benefit of all is _____.",
                optionA = "Diarchy",
                optionB = "Aristocracy",
                optionC = "Autocracy",
                optionD = "Polity",
                correctAnswerIndex = 1,
                explanation = "Aristotle defined Aristocracy as virtuous rule by the few for the common welfare of the state.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 3 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p3_07",
                subject = "Government",
                topic = "Government Forms",
                year = "Part 3",
                questionText = "Rule by old people is known as _____.",
                optionA = "Monarchy",
                optionB = "Gerontocracy",
                optionC = "Feudalism",
                optionD = "Theocracy",
                correctAnswerIndex = 1,
                explanation = "Gerontocracy is governance governed predominantly by elders and elderly leaders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 3 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p4_02",
                subject = "Government",
                topic = "State Attributes",
                year = "Part 4",
                questionText = "The necessary attributes of a state are _____.",
                optionA = "police, army, sovereignty and custom",
                optionB = "resources, population, sovereignty and government",
                optionC = "sovereignty, police, army and immigration",
                optionD = "definite territory, population, sovereignty and government",
                correctAnswerIndex = 3,
                explanation = "The four classical constituent elements of a sovereign state are Population, Territory, Government, and Sovereignty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 4 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p4_07",
                subject = "Government",
                topic = "Bicameralism",
                year = "Part 4",
                questionText = "One main advantage of a bicameral legislature is that it _____.",
                optionA = "prevents hasty legislation through double deliberation",
                optionB = "makes for quick deliberation during emergencies",
                optionC = "makes passage of bills easy",
                optionD = "is less cumbersome to pass bills",
                correctAnswerIndex = 0,
                explanation = "A two-chamber legislature prevents hasty, ill-considered legislation through systematic second review.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 4 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p4_08",
                subject = "Government",
                topic = "Constitutional Law",
                year = "Part 4",
                questionText = "The court that has ultimate power to interpret the constitution in Nigeria is the _____.",
                optionA = "Court of Appeal",
                optionB = "Supreme Court",
                optionC = "Magistrate Court",
                optionD = "High Court",
                correctAnswerIndex = 1,
                explanation = "The Supreme Court of Nigeria has final jurisdiction on constitutional interpretation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 4 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p4_39",
                subject = "Government",
                topic = "Electoral Systems",
                year = "Part 4",
                questionText = "The Option A4 open ballot voting model was used in Nigeria during the _____.",
                optionA = "1999 elections",
                optionB = "2007 elections",
                optionC = "1983 elections",
                optionD = "1993 elections",
                correctAnswerIndex = 3,
                explanation = "Option A4 open ballot system was implemented by NEC for the June 12, 1993 presidential elections.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 4 (Q39)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_p5_02",
                subject = "Government",
                topic = "Local Government",
                year = "Part 5",
                questionText = "The 1976 Local Government Reforms made local government the _____.",
                optionA = "Second-tier of government",
                optionB = "first-tier of government",
                optionC = "fourth-tier of government",
                optionD = "Third-tier of government",
                correctAnswerIndex = 3,
                explanation = "The nationwide 1976 reforms established local government councils as the autonomous third tier of the Nigerian federation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • Part 5 (Q2)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
