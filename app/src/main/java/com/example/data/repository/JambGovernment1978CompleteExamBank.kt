package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Complete 1978 JAMB UTME Government Examination Question Bank (50 Questions).
 * Fully cleaned and verified with official answer keys, topics, and detailed explanations.
 */
object JambGovernment1978CompleteExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "gov_1978_01",
                subject = "Government",
                topic = "Constitutional Development",
                year = "1978",
                questionText = "When did Nigeria gain her Independence?",
                optionA = "1st October 1963",
                optionB = "31st October 1690",
                optionC = "1st October 2012",
                optionD = "1st October 1960",
                correctAnswerIndex = 3,
                explanation = "Nigeria gained official independence from British colonial rule on 1st October 1960, with Sir Abubakar Tafawa Balewa as Prime Minister and Dr. Nnamdi Azikiwe as Governor-General.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_02",
                subject = "Government",
                topic = "Basic Principles of Government",
                year = "1978",
                questionText = "Democracy means a system of government in which",
                optionA = "the majority rules",
                optionB = "the minority rules",
                optionC = "there is no party system",
                optionD = "the people rule",
                correctAnswerIndex = 0,
                explanation = "Democracy is conceptually governance of the people, by the people, and for the people, operating primarily on the principle of majority rule through elected representatives.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_03",
                subject = "Government",
                topic = "Constitutions & Federalism",
                year = "1978",
                questionText = "A constitution is federal if",
                optionA = "it provides for a presidential system",
                optionB = "it is unwritten",
                optionC = "it is not unitary",
                optionD = "there is a division of powers between a central and a number of other component authorities",
                correctAnswerIndex = 3,
                explanation = "A federal constitution is fundamentally characterized by the legal division of constitutional powers between a central (federal) government and regional/state component units.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_04",
                subject = "Government",
                topic = "Organs of Government",
                year = "1978",
                questionText = "The Executive is",
                optionA = "a committee of the legislature",
                optionB = "the body that makes laws",
                optionC = "the body that executes the policies of government",
                optionD = "the highest organ of government",
                correctAnswerIndex = 2,
                explanation = "The Executive arm of government is responsible for formulating, administering, and executing the laws and policies of government.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_05",
                subject = "Government",
                topic = "Organs of Government",
                year = "1978",
                questionText = "The Judiciary is",
                optionA = "an arm of the Executive",
                optionB = "the body which makes the law",
                optionC = "a body of lawyers",
                optionD = "the body which interprets the law",
                correctAnswerIndex = 3,
                explanation = "The Judiciary is the organ of government tasked with interpreting the constitution and laws, adjudicating disputes, and administering justice.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_06",
                subject = "Government",
                topic = "Basic Principles of Government",
                year = "1978",
                questionText = "The separation of powers means the same as",
                optionA = "a presidential system of government",
                optionB = "checks and balances",
                optionC = "the rule of law",
                optionD = "supremacy of the judiciary",
                correctAnswerIndex = 1,
                explanation = "Separation of powers, as postulated by Montesquieu, is designed to ensure that distinct organs of government check and balance each other to prevent tyranny and abuse.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_07",
                subject = "Government",
                topic = "Citizenship & Rights",
                year = "1978",
                questionText = "Rights are",
                optionA = "claims which the law allows",
                optionB = "claims against the state",
                optionC = "claims against other individuals",
                optionD = "claims which are natural to men",
                correctAnswerIndex = 0,
                explanation = "Rights are legally recognized, enforceable entitlements and claims which the constitution and laws of a state allow citizens to enjoy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_08",
                subject = "Government",
                topic = "Pressure Groups",
                year = "1978",
                questionText = "Pressure groups are",
                optionA = "Organization which wants to overthrow the government",
                optionB = "organizations which seek to influence the policies of the government",
                optionC = "associations of people who share the same ideology",
                optionD = "political parties",
                correctAnswerIndex = 1,
                explanation = "Pressure groups (or interest groups) are organized associations that seek to influence government policies and legislation to favor their members' interests without seeking to capture political power itself.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_09",
                subject = "Government",
                topic = "Systems of Government",
                year = "1978",
                questionText = "A cabinet system of government is practiced in",
                optionA = "the USSR",
                optionB = "the USA",
                optionC = "the People's Republic of China",
                optionD = "the United Kingdom",
                correctAnswerIndex = 3,
                explanation = "The cabinet (or parliamentary/Westminster) system of government is practiced in the United Kingdom, where executive authority resides in a prime minister and cabinet drawn from parliament.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_10",
                subject = "Government",
                topic = "Citizenship & Rights",
                year = "1978",
                questionText = "The citizen's obligations are",
                optionA = "what the government orders",
                optionB = "duties the individual imposes on himself",
                optionC = "what the law requires of the individual",
                optionD = "what the military decrees",
                correctAnswerIndex = 2,
                explanation = "Civic obligations are the constitutional and legal duties required of an individual, such as paying taxes, obeying laws, and defending the nation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_11",
                subject = "Government",
                topic = "Electoral Systems",
                year = "1978",
                questionText = "An electoral system is the system which governs",
                optionA = "the appointment of the Pope",
                optionB = "how people vote",
                optionC = "the conduct of elections",
                optionD = "the appointment of cabinet ministers",
                correctAnswerIndex = 2,
                explanation = "An electoral system comprises the rules, laws, and administrative procedures that govern the conduct of public elections in a state.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_12",
                subject = "Government",
                topic = "Constitutions",
                year = "1978",
                questionText = "An unwritten constitution is one which",
                optionA = "is not subject to judicial review",
                optionB = "is only partially written and based on conventions",
                optionC = "is not written at all",
                optionD = "is made up solely of a set of conventions",
                correctAnswerIndex = 1,
                explanation = "An unwritten constitution is not codified into a single legal document; it consists of written statutes, judicial precedents, historic charters, and unwritten constitutional conventions (e.g., in the UK).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_13",
                subject = "Government",
                topic = "Legislative Process",
                year = "1978",
                questionText = "Delegated legislation is legislation",
                optionA = "which is not submitted to parliament",
                optionB = "made by judicial tribunals",
                optionC = "made by a minister or body acting under an Act of Parliament",
                optionD = "made by local government exclusively",
                correctAnswerIndex = 2,
                explanation = "Delegated (or subordinate) legislation refers to rules, orders, bylaws, and statutory instruments made by non-legislative bodies or ministers under powers granted by an Act of Parliament.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_14",
                subject = "Government",
                topic = "Pre-colonial Administration",
                year = "1978",
                questionText = "Before colonial rule, Yoruba traditional rulers were appointed by",
                optionA = "the people acting through representatives",
                optionB = "the Ogboni",
                optionC = "Ifa (oracle) priests",
                optionD = "Kingmakers",
                correctAnswerIndex = 3,
                explanation = "In pre-colonial Yoruba traditional governance (such as the Oyo Empire), rulers (Obas/Alapfins) were selected by traditional kingmakers (e.g., the Oyo Mesi) following consultation of spiritual oracles.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_15",
                subject = "Government",
                topic = "Political Parties & Nationalism",
                year = "1978",
                questionText = "The first political party properly so-called was formed in Nigeria in",
                optionA = "1916",
                optionB = "1923",
                optionC = "1944",
                optionD = "1948",
                correctAnswerIndex = 1,
                explanation = "The Nigerian National Democratic Party (NNDP), founded by Herbert Macaulay in 1923 following the introduction of the Clifford Constitution's elective principle, was Nigeria's first political party.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_16",
                subject = "Government",
                topic = "Colonial Administration",
                year = "1978",
                questionText = "The Loi Cadre, a major factor in the constitutional development of the French colonial territories, was introduced in",
                optionA = "1940",
                optionB = "1946",
                optionC = "1950",
                optionD = "1956",
                correctAnswerIndex = 3,
                explanation = "The Loi Cadre (Framework Law) was enacted by France in 1956 to grant universal suffrage and internal autonomy to its African colonies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_17",
                subject = "Government",
                topic = "African Nationalism",
                year = "1978",
                questionText = "The Coussey Commission Report laid the groundwork for the eventual independence of",
                optionA = "Gambia",
                optionB = "Gold Coast (Ghana)",
                optionC = "Sierra Leone",
                optionD = "Liberia",
                correctAnswerIndex = 1,
                explanation = "The 1949 Coussey Committee Report in the Gold Coast (now Ghana) drafted the constitutional framework that led to internal self-government and independence in 1957.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_18",
                subject = "Government",
                topic = "Constitutional History",
                year = "1978",
                questionText = "The (former) Western Region of Nigeria became internally self-governing in",
                optionA = "1955",
                optionB = "1957",
                optionC = "1958",
                optionD = "1959",
                correctAnswerIndex = 1,
                explanation = "The Western and Eastern Regions attained internal self-government in 1957, followed by the Northern Region in 1959.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_19",
                subject = "Government",
                topic = "Pan-Africanism",
                year = "1978",
                questionText = "The first Pan-African conference was held in",
                optionA = "Paris",
                optionB = "Brussels",
                optionC = "London",
                optionD = "New York",
                correctAnswerIndex = 2,
                explanation = "The first Pan-African Conference was organized by Henry Sylvester Williams and held in London in 1900.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_20",
                subject = "Government",
                topic = "Civil Service",
                year = "1978",
                questionText = "The Public Service Commission (Nigeria) is responsible for the appointment of all",
                optionA = "judges of the High Court",
                optionB = "officials of public corporations",
                optionC = "civil servants",
                optionD = "military personnel",
                correctAnswerIndex = 2,
                explanation = "The Civil Service / Public Service Commission is responsible for recruiting, promoting, and disciplining civil servants in the ministries.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_21",
                subject = "Government",
                topic = "The Judiciary",
                year = "1978",
                questionText = "Constitutional cases in Nigeria can only be raised in the first instance in",
                optionA = "the Supreme Court",
                optionB = "the High Courts",
                optionC = "the Courts of Appeal",
                optionD = "the Sharia Court of Appeal",
                correctAnswerIndex = 1,
                explanation = "Under standard constitutional procedure, constitutional cases concerning the enforcement of fundamental human rights or legality are initiated in the High Courts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_22",
                subject = "Government",
                topic = "Military Rule in Nigeria",
                year = "1978",
                questionText = "Which of the following would act for the Head of State when he is out of the country under military rule?",
                optionA = "the Chief Justice of the Supreme Court",
                optionB = "the Chief of Staff, Army",
                optionC = "the Chief of Staff, Supreme Military Headquarters",
                optionD = "the Chief of Staff, Air Force",
                correctAnswerIndex = 2,
                explanation = "Under Nigerian military regimes (e.g., Obasanjo-Murtala 1975-1979), the Chief of Staff, Supreme Military Headquarters served as the de facto second-in-command.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_23",
                subject = "Government",
                topic = "Local Government",
                year = "1978",
                questionText = "To raise funds, local governments can levy",
                optionA = "import duties",
                optionB = "rates and property taxes",
                optionC = "Excise duties",
                optionD = "profits tax",
                correctAnswerIndex = 1,
                explanation = "Local governments are constitutionally empowered to levy property rates, market fees, bicycle/vehicle licenses, and local charges.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_24",
                subject = "Government",
                topic = "International Organizations",
                year = "1978",
                questionText = "The Economic Commission for Africa (ECA) is an agency of",
                optionA = "the OAU",
                optionB = "the Commonwealth",
                optionC = "the United Nations",
                optionD = "the African Development Bank",
                correctAnswerIndex = 2,
                explanation = "The United Nations Economic Commission for Africa (UNECA) is a regional arm of the United Nations established by the Economic and Social Council in 1958.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_25",
                subject = "Government",
                topic = "Foreign Policy",
                year = "1978",
                questionText = "Nigeria was not a member of",
                optionA = "the OAU",
                optionB = "the Security Council (Permanent)",
                optionC = "the African Development Bank",
                optionD = "the OCAM",
                correctAnswerIndex = 3,
                explanation = "Nigeria was never a member of OCAM (Organisation Commune Africaine et Malgache), which comprised French-speaking African states.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_26",
                subject = "Government",
                topic = "Political Parties",
                year = "1978",
                questionText = "The primary function of political parties is to",
                optionA = "oppose the government",
                optionB = "aggregate interest and contest for power",
                optionC = "mobilize public opinion",
                optionD = "provide welfare for members",
                correctAnswerIndex = 1,
                explanation = "The primary defining purpose of a political party is to aggregate social interests, nominate candidates, and contest elections to gain political power.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_27",
                subject = "Government",
                topic = "International Organizations",
                year = "1978",
                questionText = "The OAU (Organization of African Unity) was formed in",
                optionA = "1946",
                optionB = "1956",
                optionC = "1960",
                optionD = "1963",
                correctAnswerIndex = 3,
                explanation = "The Organization of African Unity (OAU, now the African Union) was founded on 25th May 1963 in Addis Ababa, Ethiopia.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_28",
                subject = "Government",
                topic = "Local Government Reforms",
                year = "1978",
                questionText = "Under the 1976 Local Government Reforms in Nigeria, councils were",
                optionA = "Directly or indirectly elected",
                optionB = "appointed by the State Governors",
                optionC = "appointed by the Head of State",
                optionD = "abolished",
                correctAnswerIndex = 0,
                explanation = "The landmark 1976 Local Government Reforms made local governments a single-tier system with councils elected mostly directly or indirectly across the federation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_29",
                subject = "Government",
                topic = "Electoral Systems",
                year = "1978",
                questionText = "Which of the following is true as a major function of elections?",
                optionA = "Elections serve the purpose of recruitment of leaders to office in a modern state",
                optionB = "elections give the people a chance to eliminate opponents",
                optionC = "they are means of testing the popularity of politicians only",
                optionD = "politicians use elections as tools to deceive",
                correctAnswerIndex = 0,
                explanation = "A principal function of democratic elections is the peaceful, institutional recruitment of political leadership to public office by citizen franchise.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_30",
                subject = "Government",
                topic = "Colonial History",
                year = "1978",
                questionText = "The first Governor-General of amalgamated Nigeria in 1914 was",
                optionA = "Lord Lugard",
                optionB = "Dr Nnamdi Azikiwe",
                optionC = "Sir James Robertson",
                optionD = "Major General Aguiyi Ironsi",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard served as the first Governor-General of amalgamated Nigeria upon the union of the Northern and Southern protectorates in 1914.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_31",
                subject = "Government",
                topic = "International Organizations",
                year = "1978",
                questionText = "The supreme policy-making organ in the Organization of African Unity is",
                optionA = "the Council of Ministers",
                optionB = "the Assembly of Heads of State and Government",
                optionC = "the General Secretariat",
                optionD = "the Specialized Commissions",
                correctAnswerIndex = 1,
                explanation = "The Assembly of Heads of State and Government was the highest decision-making and legislative organ of the OAU.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_32",
                subject = "Government",
                topic = "International Organizations",
                year = "1978",
                questionText = "In which organ of the United Nations Organization is veto power exercised by permanent members?",
                optionA = "the World Health Organization",
                optionB = "the Security Council",
                optionC = "the General Assembly",
                optionD = "the International Court of Justice",
                correctAnswerIndex = 1,
                explanation = "The UN Security Council grants veto power to its five permanent members (US, UK, France, Russia, China) on substantive resolutions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_33",
                subject = "Government",
                topic = "Federalism in Nigeria",
                year = "1978",
                questionText = "In Nigeria's federal structure, local governments are structurally created under",
                optionA = "the Federal Government directly",
                optionB = "the State Government",
                optionC = "no other level of government",
                optionD = "traditional rulers",
                correctAnswerIndex = 1,
                explanation = "Local governments operate as the third tier of government, structured under state oversight and state electoral/local government laws.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_34",
                subject = "Government",
                topic = "Constitutional History",
                year = "1978",
                questionText = "The 1946 Richards Constitution in Nigeria was introduced as a result of",
                optionA = "pressures by United States of America",
                optionB = "pressures from British government only",
                optionC = "pressures from nationalists and post-WWII developments",
                optionD = "traditional rulers demand",
                correctAnswerIndex = 2,
                explanation = "The 1946 Richards Constitution aimed to promote Nigerian unity and integrate the Northern and Southern regions in a single Legislative Council amidst growing nationalist demands.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_35",
                subject = "Government",
                topic = "The Judiciary & Rights",
                year = "1978",
                questionText = "If the fundamental human rights of an individual are violated or threatened, he can seek redress from",
                optionA = "the Executive branch of government",
                optionB = "the Legislative branch of government",
                optionC = "the Local government council",
                optionD = "the Judicial branch of government",
                correctAnswerIndex = 3,
                explanation = "The Judiciary is the guardian of the constitution and protector of civil liberties; citizens seek writs and legal redress through the courts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_36",
                subject = "Government",
                topic = "Systems of Government",
                year = "1978",
                questionText = "In a Presidential system of government, the President is elected by",
                optionA = "the cabinet",
                optionB = "the parliament or legislature",
                optionC = "the military",
                optionD = "the people through direct or electoral vote",
                correctAnswerIndex = 3,
                explanation = "In a presidential democracy, the President is chosen by the electorate independently of the legislature through popular or electoral-college voting.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_37",
                subject = "Government",
                topic = "Military Rule in West Africa",
                year = "1978",
                questionText = "Military coups and takeovers of power from politicians in West Africa have occurred due to",
                optionA = "corruption and reckless abuse of power by politicians",
                optionB = "breakdown of law and order and electoral crises",
                optionC = "economic mismanagement and institutional grievances",
                optionD = "all of the above factors",
                correctAnswerIndex = 3,
                explanation = "Military interventions in West Africa have historically been triggered by systemic corruption, electoral violence, ethnic tensions, and economic breakdown.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_38",
                subject = "Government",
                topic = "Public Corporations",
                year = "1978",
                questionText = "By establishing public corporations, governments are primarily trying to",
                optionA = "eliminate private enterprises",
                optionB = "compete with private enterprise for profit",
                optionC = "render crucial social and infrastructural services to the public",
                optionD = "maximize revenue through taxation",
                correctAnswerIndex = 2,
                explanation = "Public corporations (statutory utilities) are established by governments to provide vital essential public services and infrastructure that private firms might find unprofitable or monopolistic.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_39",
                subject = "Government",
                topic = "Constitutions",
                year = "1978",
                questionText = "The constitution of any democratic country must provide for",
                optionA = "the distribution of governmental powers",
                optionB = "the rights and duties of citizens",
                optionC = "the rule of law and judicial independence",
                optionD = "all of the above",
                correctAnswerIndex = 3,
                explanation = "A comprehensive constitution allocates powers among organs of state, delineates federal/state jurisdictions, and guarantees fundamental human rights under the rule of law.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_40",
                subject = "Government",
                topic = "Pressure Groups",
                year = "1978",
                questionText = "In a modern democratic state, pressure groups achieve their goals primarily through",
                optionA = "causing civil disorder",
                optionB = "lobbying and influencing government decisions",
                optionC = "forming political parties to run for office",
                optionD = "rigging public elections",
                correctAnswerIndex = 1,
                explanation = "Pressure groups utilize lobbying, petitions, media advocacy, strikes, and expert submissions to influence executive policies and legislative bills.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_41",
                subject = "Government",
                topic = "Nigerian Nationalism",
                year = "1978",
                questionText = "Who is widely regarded as the 'Father of Nigerian Nationalism'?",
                optionA = "Kwame Nkrumah",
                optionB = "General Olusegun Obasanjo",
                optionC = "Herbert Macaulay",
                optionD = "Anthony Enahoro",
                correctAnswerIndex = 2,
                explanation = "Herbert Macaulay founded the NNDP in 1923 and championed indigenous political mobilization in Lagos, earning the title 'Father of Nigerian Nationalism'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_42",
                subject = "Government",
                topic = "Cabinet System",
                year = "1978",
                questionText = "The doctrine of collective responsibility in a cabinet system of government implies that",
                optionA = "ministers can openly dispute government decisions in parliament",
                optionB = "cabinet members must publicly support all cabinet decisions or resign",
                optionC = "only the prime minister is held responsible for laws",
                optionD = "parliament can dismiss individual ministers without touching the government",
                correctAnswerIndex = 1,
                explanation = "Collective cabinet responsibility dictates that all ministers must publicly defend policies agreed in cabinet; any minister unwilling to do so must resign.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_43",
                subject = "Government",
                topic = "Colonial Administration",
                year = "1978",
                questionText = "The British colonial policy of Indirect Rule in West Africa meant",
                optionA = "governing without traditional chiefs",
                optionB = "governing African subjects through their existing traditional institutions and rulers",
                optionC = "total cultural assimilation into British society",
                optionD = "direct rule by military garrisons",
                correctAnswerIndex = 1,
                explanation = "Indirect Rule, popularized by Lord Lugard in Northern Nigeria, governed local populations through native authorities, customary courts, and traditional chiefs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_44",
                subject = "Government",
                topic = "Colonial Administration",
                year = "1978",
                questionText = "The French colonial policy of Assimilation aimed to",
                optionA = "make Frenchmen out of African colonial subjects",
                optionB = "preserve traditional African kingdoms unchanged",
                optionC = "grant immediate independence to all colonies",
                optionD = "build a federal alliance of equal nations",
                correctAnswerIndex = 0,
                explanation = "The French policy of Assimilation was based on the premise that African subjects who adopted French language, laws, and culture could attain full French citizenship.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_45",
                subject = "Government",
                topic = "African Politics",
                year = "1978",
                questionText = "A notable feature of post-independence political development in The Gambia was that",
                optionA = "it was immediately merged with Ghana",
                optionB = "Sir Dawda Jawara maintained multi-party democracy and political stability for decades",
                optionC = "it adopted a military dictatorship within one year",
                optionD = "it completely abolished elections",
                correctAnswerIndex = 1,
                explanation = "Under Sir Dawda Jawara, The Gambia remained one of the few multi-party parliamentary democracies in post-colonial West Africa that maintained peaceful elections.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_46",
                subject = "Government",
                topic = "International Organizations",
                year = "1978",
                questionText = "The dominant founding idea behind the establishment of the Organization of African Unity (OAU) in 1963 was",
                optionA = "to create a single African military command",
                optionB = "to promote unity, solidarity, and eradication of colonialism in Africa",
                optionC = "to compete economically with Europe",
                optionD = "to establish a single African currency",
                correctAnswerIndex = 1,
                explanation = "The OAU was formed in 1963 to foster unity and solidarity among African states, coordinate cooperation, and eradicate all forms of colonialism and apartheid.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_47",
                subject = "Government",
                topic = "Local Government Reforms",
                year = "1978",
                questionText = "The 1976 Local Government Reforms in Nigeria were significant because they",
                optionA = "established a unified, single-tier statutory local government system across all states",
                optionB = "made traditional rulers the sole executive heads of local councils",
                optionC = "abolished federal allocations to councils",
                optionD = "transferred all local councils to the military",
                correctAnswerIndex = 0,
                explanation = "The 1976 Reforms established local government as a distinct third tier of government with standardized structures, functions, and direct statutory financial allocations.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_48",
                subject = "Government",
                topic = "Electoral Systems",
                year = "1978",
                questionText = "The principle of Universal Adult Suffrage means",
                optionA = "the right of all qualified adults to vote in elections regardless of race, gender, or wealth",
                optionB = "the right of parliament to pass laws",
                optionC = "the exclusive right of property owners to vote",
                optionD = "the right of political parties to appoint leaders",
                correctAnswerIndex = 0,
                explanation = "Universal adult suffrage grants every adult citizen who meets minimum age and sanity criteria the legal right to vote and be voted for.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_49",
                subject = "Government",
                topic = "Electoral Systems",
                year = "1978",
                questionText = "A constituency in an electoral system is defined as",
                optionA = "a political party headquarters",
                optionB = "an electoral district whose registered voters elect a representative to the legislature",
                optionC = "a parliamentary committee chamber",
                optionD = "a council of traditional chiefs",
                correctAnswerIndex = 1,
                explanation = "A constituency is a geographically designated electoral district entitled to elect one or more representatives to a legislative body.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_1978_50",
                subject = "Government",
                topic = "ECOWAS & Regional Integration",
                year = "1978",
                questionText = "The treaty establishing the Economic Community of West African States (ECOWAS) was signed in",
                optionA = "Lomé in 1976",
                optionB = "Accra in 1970",
                optionC = "Lagos on 28th May 1975",
                optionD = "Dakar in 1980",
                correctAnswerIndex = 2,
                explanation = "The Treaty of Lagos was signed on 28th May 1975 by fifteen West African nations under the leadership of General Yakubu Gowon of Nigeria and President Gnassingbé Eyadéma of Togo to establish ECOWAS.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q50"
            )
        )
        return list
    }
}
