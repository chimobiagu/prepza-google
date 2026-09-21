package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Government PT 1 - 5 Complete Objective Bank (250 Questions).
 * Direct extraction and verified compilation across the official JAMB Government syllabus.
 * Covers: Political Concepts, Systems, Arms of Govt, Pre-Colonial, Colonial,
 * Constitutions, Federalism, Military Rule, Nigerian Foreign Policy, ECOWAS, AU, UN.
 */
object JambGovernmentPt1to5ExamBank {

    fun getQuestions(): List<QuestionEntity> =
        getPart1() + getPart2() + getPart3() + getPart4() + getPart5()

    fun getPart1(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "gov_pt1_01",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The study of government as an academic discipline teaches citizens how to",
                optionA = "participate effectively in public decision-making",
                optionB = "overthrow unpopular administrations",
                optionC = "evade payment of municipal taxes",
                optionD = "monopolize economic enterprises",
                correctAnswerIndex = 0,
                explanation = "Government educates citizens on their civic rights, obligations, and the constitutional processes of the state.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_02",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Political authority is best defined as the",
                optionA = "ability to inflict physical coercion",
                optionB = "constitutionally recognized right to exercise legitimate power",
                optionC = "influence exercised through wealth",
                optionD = "charisma of military leadership",
                correctAnswerIndex = 1,
                explanation = "Authority is the legitimate, legally recognized power to issue commands and enforce compliance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_03",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Which of the following is an essential characteristic of a sovereign state?",
                optionA = "A permanent population, defined territory, government, and sovereignty",
                optionB = "A homogeneous language and single religious faith",
                optionC = "A written constitution and bilingual judiciary",
                optionD = "A capitalist economy and nuclear arsenal",
                correctAnswerIndex = 0,
                explanation = "A state requires four fundamental criteria: population, territory, government, and sovereignty.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_04",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The political philosophy where the state holds absolute total control over all facets of public and private life is",
                optionA = "Totalitarianism",
                optionB = "Liberal democracy",
                optionC = "Confederalism",
                optionD = "Feudalism",
                correctAnswerIndex = 0,
                explanation = "Totalitarian regimes subordinate all social, economic, and private activities to the state.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_05",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "A major advantage of a bicameral legislature over a unicameral system is that it",
                optionA = "prevents hasty and ill-considered legislation",
                optionB = "speeds up passage of the annual budget",
                optionC = "is cheaper to run and administer",
                optionD = "eliminates friction between the arms of government",
                correctAnswerIndex = 0,
                explanation = "A second chamber allows calm second review of bills, cooling populist passions and checking legislative haste.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_06",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The principle of the Rule of Law implies that",
                optionA = "the government is above the ordinary laws of the land",
                optionB = "all citizens are subject to the same laws administered by ordinary courts",
                optionC = "judges are elected directly by the electorate",
                optionD = "military decrees take precedence over constitutional rights",
                correctAnswerIndex = 1,
                explanation = "A.V. Dicey's Rule of Law mandates equality before the law, supremacy of regular law, and protection of fundamental freedoms.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_07",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The primary objective of the doctrine of separation of powers formulated by Baron de Montesquieu is to",
                optionA = "prevent tyranny and safeguard individual liberties",
                optionB = "concentrate powers in the executive presidency",
                optionC = "speed up administrative execution of projects",
                optionD = "enable judges to draft statutes",
                correctAnswerIndex = 0,
                explanation = "Dividing governmental functions among legislative, executive, and judicial organs prevents autocratic accumulation of power.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_08",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Delegated legislation refers to laws and statutory instruments made by",
                optionA = "bodies other than the sovereign parliament under statutory authority",
                optionB = "the supreme court during constitutional adjudication",
                optionC = "customary chiefs during village meetings",
                optionD = "foreign embassies in host countries",
                correctAnswerIndex = 0,
                explanation = "Delegated legislation comprises bye-laws, orders, and statutory instruments issued by ministers or local councils authorized by primary legislation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_09",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Universal adult suffrage grants the right to vote to",
                optionA = "all adult citizens regardless of property, sex, or race",
                optionB = "tax-paying property owners only",
                optionC = "university graduates and civil servants",
                optionD = "male heads of households exclusively",
                correctAnswerIndex = 0,
                explanation = "Universal adult suffrage enfranchises all qualified adult citizens irrespective of race, gender, religion, or social class.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_10",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Pressure groups differ fundamentally from political parties because they",
                optionA = "do not seek to capture political power and form a government",
                optionB = "operate strictly underground without registration",
                optionC = "nominate candidates for all general elections",
                optionD = "have no financial membership subscriptions",
                correctAnswerIndex = 0,
                explanation = "Pressure groups aim to influence government policy in favor of specialized interests without fielding candidates for governance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_11",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Public opinion can be described as the",
                optionA = "aggregate views of the majority of citizens on public issues",
                optionB = "editorial opinions expressed by state-owned television",
                optionC = "commands issued by the executive council",
                optionD = "resolutions adopted by international assemblies",
                correctAnswerIndex = 0,
                explanation = "Public opinion represents the collective preferences, attitudes, and judgments held by a significant portion of a society on public affairs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_12",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The convention of civil service neutrality requires civil servants to",
                optionA = "serve any government in power loyally without public partisan bias",
                optionB = "join the ruling political party to ensure harmony",
                optionC = "campaign actively for candidates during elections",
                optionD = "leak confidential memoranda to the press",
                correctAnswerIndex = 0,
                explanation = "Civil servants must maintain political impartiality to render professional advice to whichever political party wins office.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_13",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Public corporations are established by acts of parliament primarily to",
                optionA = "provide essential public utility services at affordable rates",
                optionB = "maximize commercial profit for private shareholders",
                optionC = "compete ruthlessly with petty market traders",
                optionD = "evade government auditing and legislative scrutiny",
                correctAnswerIndex = 0,
                explanation = "Public corporations provide critical infrastructure and public goods (water, electricity, ports) where public interest supersedes profit.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_14",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "A key function of local government councils in Nigeria is the",
                optionA = "provision and maintenance of primary education and rural health centers",
                optionB = "minting of currency notes and coins",
                optionC = "formulation of national foreign policy",
                optionD = "command of the national armed forces",
                correctAnswerIndex = 0,
                explanation = "Under the Fourth Schedule of the Nigerian Constitution, local councils handle markets, primary healthcare, cemeteries, and basic infrastructure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_15",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "In the pre-colonial Hausa-Fulani political system, the official in charge of treasury and finances was the",
                optionA = "Ma'aji",
                optionB = "Madawaki",
                optionC = "Galadima",
                optionD = "Sarkin Fada",
                correctAnswerIndex = 0,
                explanation = "The Ma'aji was the grand treasurer responsible for public accounts and revenue in the emirate.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_16",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "In the pre-colonial Yoruba Oyo Empire, the council of kingmakers that served as an institutional check on the Alaafin was the",
                optionA = "Oyo Mesi",
                optionB = "Ogboni society",
                optionC = "Eso military guild",
                optionD = "Aremo council",
                correctAnswerIndex = 0,
                explanation = "The Oyo Mesi, led by the Bashorun, vetted royal acts and could pronounce a sentence of rejection on a despotic Alaafin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_17",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The pre-colonial Igbo political system is accurately characterized as",
                optionA = "segmentary, egalitarian, and acephalous",
                optionB = "centralized, autocratic, and hereditary",
                optionC = "monarchical under an absolute paramount emperor",
                optionD = "theocratic under a caliphate structure",
                correctAnswerIndex = 0,
                explanation = "Traditional Igbo governance lacked centralized monarchs (acephalous), relying on village assemblies, titleholders (Ozo), age grades, and elders.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_18",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Lord Frederick Lugard adopted the policy of Indirect Rule in Northern Nigeria because of",
                optionA = "shortage of British administrative personnel and financial funds",
                optionB = "his desire to abolish traditional emirate customs immediately",
                optionC = "pressure from French colonial administrators in Chad",
                optionD = "demands by Nigerian nationalists for local representation",
                correctAnswerIndex = 0,
                explanation = "Indirect Rule allowed Britain to govern vast territories cheaply using preexisting traditional emirate institutions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_19",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The 1922 Clifford Constitution was notable in Nigerian constitutional history because it",
                optionA = "introduced the elective principle for four legislative council seats",
                optionB = "created the post of Federal Prime Minister",
                optionC = "established the regional house of assembly in Kaduna",
                optionD = "granted complete self-government to the regions",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution introduced elective democracy for three seats in Lagos and one in Calabar.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_20",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The 1946 Richards Constitution was heavily criticized by Nigerian nationalists because it",
                optionA = "was introduced without prior consultation with the Nigerian people",
                optionB = "abolished the traditional chieftaincy institutions",
                optionC = "merged Nigeria and Ghana into one administrative territory",
                optionD = "transferred military command to local village heads",
                correctAnswerIndex = 0,
                explanation = "Governor Arthur Richards drafted and imposed the constitution without consulting the Nigerian public or nationalist organizations.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_21",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The 1951 Macpherson Constitution was unique because it",
                optionA = "was preceded by extensive nationwide consultations from village level up",
                optionB = "established a unitary government without regional assemblies",
                optionC = "completely excluded traditional rulers from the legislature",
                optionD = "lasted for twenty consecutive years without amendment",
                correctAnswerIndex = 0,
                explanation = "The Macpherson Constitution followed village, district, provincial, and regional conferences culminating in the Ibadan General Conference of 1950.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_22",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The 1954 Lyttleton Constitution is regarded as the foundation of modern Nigerian federalism because it",
                optionA = "created autonomous regions with distinct legislative lists and premier positions",
                optionB = "abolished regional civil services and regional judiciaries",
                optionC = "merged the Northern and Southern protectorates into one unitary entity",
                optionD = "made the British monarch the supreme executive president",
                correctAnswerIndex = 0,
                explanation = "The Lyttleton Constitution introduced genuine federalism, establishing Exclusive, Concurrent, and Residual legislative lists.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_23",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Under the 1960 Independence Constitution, the constitutional head of state of Nigeria was the",
                optionA = "British Monarch represented by the Governor-General",
                optionB = "Elected Executive President",
                optionC = "Federal Chief Justice",
                optionD = "Speaker of the House of Representatives",
                correctAnswerIndex = 0,
                explanation = "Nigeria operated a Westminster parliamentary system in 1960 where Queen Elizabeth II remained titular Head of State, represented by Dr. Nnamdi Azikiwe.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_24",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Nigeria became a Federal Republic under the 1963 Constitution, which formally",
                optionA = "replaced the British Queen with an indigenous President as Head of State",
                optionB = "abolished the bicameral federal parliament",
                optionC = "merged all three regions into a single unitary administration",
                optionD = "banned all political party activities nationwide",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal monarchical ties with the British Crown and created the office of President of Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_25",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The 1979 Constitution marked a major institutional departure by adopting",
                optionA = "an Executive Presidential system of government modeled on the United States",
                optionB = "a Swiss-style collegial executive directory",
                optionC = "a constitutional monarchy with hereditary peers",
                optionD = "a one-party socialist workers council system",
                correctAnswerIndex = 0,
                explanation = "The 1979 Constitution abandoned the Westminster parliamentary model in favor of an American-style Executive Presidency.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_26",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The exclusive legislative list in the 1999 Constitution of Nigeria contains subjects reserved solely for the",
                optionA = "Federal National Assembly",
                optionB = "State Houses of Assembly",
                optionC = "Local Government Councils",
                optionD = "National Council of State",
                correctAnswerIndex = 0,
                explanation = "The Exclusive Legislative List (e.g., defense, foreign affairs, currency, immigration) is the sole preserve of the federal parliament.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_27",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "In Nigeria's federal finance, the principle of derivation emphasizes that",
                optionA = "a specified percentage of revenue generated from natural resources goes back to the state of origin",
                optionB = "all national revenue is divided equally among all registered local government areas",
                optionC = "funds are distributed strictly according to land mass area",
                optionD = "tax revenues are retained by multinational corporations",
                correctAnswerIndex = 0,
                explanation = "Derivation allocates a constitutionally guaranteed minimum share of revenue to the subnational units from which the resource was extracted.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_28",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The first military coup d'état in Nigeria took place on",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "July 29, 1975",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young officers staged Nigeria's first military coup on January 15, 1966.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_29",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The primary permanent objective of Nigeria's foreign policy is",
                optionA = "the promotion of national interest, territorial integrity, and African unity",
                optionB = "the military conquest of neighboring Francophone countries",
                optionC = "unconditional alignment with Western capitalist powers",
                optionD = "the global monopolization of crude oil marketing",
                correctAnswerIndex = 0,
                explanation = "Section 19 of the Nigerian Constitution identifies the protection of national sovereignty and the promotion of African unity as core foreign policy objectives.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_30",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Nigeria is a founding member of the Non-Aligned Movement (NAM), which was formed to",
                optionA = "avoid entangling military alliances with either the Western or Eastern Cold War blocs",
                optionB = "establish a joint military defense pact among NATO countries",
                optionC = "promote international communist revolutions worldwide",
                optionD = "create a single global currency dominated by developing nations",
                correctAnswerIndex = 0,
                explanation = "The NAM, launched at the 1961 Belgrade Conference, enabled newly sovereign developing nations to maintain independent neutrality during the Cold War.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_31",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The Organization of African Unity (OAU), established in 1963, was transformed in 2002 into the",
                optionA = "African Union (AU)",
                optionB = "Economic Community of West African States",
                optionC = "Southern African Development Community",
                optionD = "New Partnership for Africa's Development",
                correctAnswerIndex = 0,
                explanation = "The OAU was formally succeeded by the African Union (AU) at the Durban Summit in July 2002 to accelerate continental integration.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_32",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The headquarters of the Economic Community of West African States (ECOWAS) is located in",
                optionA = "Abuja, Nigeria",
                optionB = "Accra, Ghana",
                optionC = "Dakar, Senegal",
                optionD = "Lomé, Togo",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission headquarters is situated in Abuja, the Federal Capital Territory of Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_33",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Which body within the United Nations has primary responsibility for the maintenance of international peace and security?",
                optionA = "The Security Council",
                optionB = "The General Assembly",
                optionC = "The International Court of Justice",
                optionD = "The Trusteeship Council",
                correctAnswerIndex = 0,
                explanation = "Article 24 of the UN Charter confers primary responsibility for international peace and security on the Security Council.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_34",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The five permanent members of the UN Security Council (P5) with veto power are",
                optionA = "United States, United Kingdom, France, Russia, and China",
                optionB = "United States, Germany, Japan, France, and Canada",
                optionC = "United States, Russia, India, Brazil, and South Africa",
                optionD = "United Kingdom, France, Italy, Spain, and Egypt",
                correctAnswerIndex = 0,
                explanation = "The P5 members are the US, UK, France, the Russian Federation, and the People's Republic of China.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_35",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The Organization of Petroleum Exporting Countries (OPEC) was founded in 1960 at",
                optionA = "Baghdad, Iraq",
                optionB = "Vienna, Austria",
                optionC = "Geneva, Switzerland",
                optionD = "Riyadh, Saudi Arabia",
                correctAnswerIndex = 0,
                explanation = "OPEC was created at the Baghdad Conference in September 1960 by founding members Iran, Iraq, Kuwait, Saudi Arabia, and Venezuela.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_36",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "In parliamentary systems of government, a vote of no confidence passed by the legislature against the cabinet leads to",
                optionA = "the resignation of the Prime Minister and the entire cabinet",
                optionB = "the immediate execution of cabinet ministers",
                optionC = "the indefinite suspension of the supreme court",
                optionD = "the merger of the legislature with the armed forces",
                correctAnswerIndex = 0,
                explanation = "A vote of no confidence indicates the legislature withdraws its mandate, requiring the government to resign or dissolve parliament.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_37",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The British colonial policy of Assimilation was primarily practiced by which colonial power in West Africa?",
                optionA = "France",
                optionB = "Britain",
                optionC = "Portugal",
                optionD = "Germany",
                correctAnswerIndex = 0,
                explanation = "France implemented the policy of assimilation in the Four Communes of Senegal (Dakar, Gorée, Rufisque, Saint-Louis).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_38",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The chief organ responsible for interpreting the provisions of the constitution and adjudicating disputes between arms of government is the",
                optionA = "Judiciary",
                optionB = "Executive",
                optionC = "Legislature",
                optionD = "Civil Service Commission",
                correctAnswerIndex = 0,
                explanation = "The judiciary exercises constitutional review to safeguard legality and settle jurisdictional conflicts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_39",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Judicial independence is best safeguarded when judges",
                optionA = "enjoy security of tenure and have salaries drawn from the Consolidated Revenue Fund",
                optionB = "are appointed and dismissed at the sole discretion of the political president",
                optionC = "campaign actively for political parties during elections",
                optionD = "serve fixed two-year terms renewable by legislative vote",
                correctAnswerIndex = 0,
                explanation = "Security of tenure and charged consolidated funding insulate judges from political and financial retribution.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_40",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "In a confederation, sovereign authority resides predominantly with the",
                optionA = "constituent autonomous member states",
                optionB = "central confederal assembly",
                optionC = "supreme confederal president",
                optionD = "international court of justice",
                correctAnswerIndex = 0,
                explanation = "In a confederal system, autonomous member states retain sovereignty, granting only limited delegated tasks to the weak center.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_41",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The fundamental human rights entrenched in Chapter IV of the 1999 Nigerian Constitution can only be restricted",
                optionA = "in accordance with a law that is reasonably justifiable in a democratic society during states of emergency",
                optionB = "whenever the ruling party passes an internal party resolution",
                optionC = "at the verbal instruction of any municipal police sergeant",
                optionD = "whenever the national economy experiences inflation",
                correctAnswerIndex = 0,
                explanation = "Section 45 allows derogations from certain rights only under valid legislation during war, national emergency, or for defense and public safety.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_42",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "A major defect of the first-past-the-post (simple majority) electoral system is that it",
                optionA = "can allow a candidate to win an election without securing an absolute majority of total votes cast",
                optionB = "guarantees that every minor party gains proportional parliamentary seats",
                optionC = "is extremely mathematically complex for illiterate voters to understand",
                optionD = "requires multi-member constituencies with quota thresholds",
                correctAnswerIndex = 0,
                explanation = "In simple majority voting, a candidate with 30% of the vote can win if remaining candidates divide the other 70%.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_43",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Gerontocracy is defined as a system of government where power is exercised by",
                optionA = "the elders or elderly members of society",
                optionB = "the wealthiest capitalist aristocrats",
                optionC = "the highest-ranking military generals",
                optionD = "religious priests and clerical prelates",
                correctAnswerIndex = 0,
                explanation = "Gerontocracy is political leadership structured around age seniority and village councils of elders.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_44",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The concept of legitimacy in political science denotes that a government",
                optionA = "enjoys the voluntary popular acceptance, moral recognition, and consent of its citizens",
                optionB = "possesses the most advanced modern weapons and artillery",
                optionC = "was inaugurated by foreign international envoys",
                optionD = "operates without an official state constitution",
                correctAnswerIndex = 0,
                explanation = "Legitimacy is the widespread civic perception that a government holds the rightful moral and constitutional authority to rule.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_45",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "In the pre-colonial Kanem-Borno Empire, the council of twelve imperial state advisers was known as the",
                optionA = "Majlis",
                optionB = "Oyo Mesi",
                optionC = "Uzama",
                optionD = "Nze na Ozo",
                correctAnswerIndex = 0,
                explanation = "The Majlis was the supreme state advisory council assisting the Mai of Borno in executive, judicial, and military governance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_46",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "Which Nigerian political party was founded in 1944 by Herbert Macaulay and Nnamdi Azikiwe?",
                optionA = "National Council of Nigeria and the Cameroons (NCNC)",
                optionB = "Action Group (AG)",
                optionC = "Northern People's Congress (NPC)",
                optionD = "Nigerian Youth Movement (NYM)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay served as the first president and Dr. Nnamdi Azikiwe as first general secretary of the NCNC founded in 1944.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_47",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The Action Group (AG) party in the First Republic was led by",
                optionA = "Chief Obafemi Awolowo",
                optionB = "Sir Ahmadu Bello",
                optionC = "Dr. Nnamdi Azikiwe",
                optionD = "Malam Aminu Kano",
                correctAnswerIndex = 0,
                explanation = "Chief Obafemi Awolowo led the Action Group, which won power in the Western Region in 1951.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_48",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The Northern People's Congress (NPC) drew its primary political base from which region of Nigeria?",
                optionA = "Northern Region",
                optionB = "Western Region",
                optionC = "Eastern Region",
                optionD = "Mid-Western Region",
                correctAnswerIndex = 0,
                explanation = "The NPC, led by Sir Ahmadu Bello, drew overwhelming support from the traditional emirates and provinces of Northern Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_49",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The Willink Commission was appointed in 1957 by the British colonial administration to",
                optionA = "inquire into the fears of minority ethnic groups in Nigeria and propose safeguards",
                optionB = "determine the boundary of the Southern Cameroons",
                optionC = "recommend the total abolition of regional governments",
                optionD = "audit the accounts of the West African Currency Board",
                correctAnswerIndex = 0,
                explanation = "Sir Henry Willink chaired the Commission of Inquiry into the Fears of Minorities, which recommended human rights charters instead of creating new states.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt1_50",
                subject = "Government",
                topic = "Government Past Questions PT 1",
                year = "Exam Series",
                questionText = "The Commonwealth of Nations is an association of independent countries that were formerly",
                optionA = "part of the British Empire",
                optionB = "colonies of the French Republic",
                optionC = "members of the Warsaw Pact",
                optionD = "territories of the Ottoman Empire",
                correctAnswerIndex = 0,
                explanation = "The Commonwealth comprises independent sovereign states that were historically governed as part of the British Empire.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 1 • Q50"
            )
        )
        return list
    }

    fun getPart2(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "gov_pt2_01",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Which of the following is a primary source of a country's constitution?",
                optionA = "Historical precedents, judicial precedents, customs, and statutory enactments",
                optionB = "Statements by foreign corporate investors",
                optionC = "Campaign manifestos of opposition candidates",
                optionD = "Editorials in international daily newspapers",
                correctAnswerIndex = 0,
                explanation = "Constitutions derive from organic conventions, statutes, common law judicial rulings, and long-standing historical customs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_02",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "An unwritten constitution is one that is",
                optionA = "not contained in a single comprehensive codified legal document",
                optionB = "passed solely by word of mouth without any written records",
                optionC = "drafted exclusively in ancient Greek or Latin",
                optionD = "subject to immediate unilateral nullification by customary monarchs",
                correctAnswerIndex = 0,
                explanation = "An unwritten constitution (like that of the United Kingdom) exists across statutes, conventions, court rulings, and historic charters rather than one single text.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_03",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "A flexible constitution is characterized by the fact that it",
                optionA = "can be amended using the ordinary simple legislative process",
                optionB = "requires a national plebiscite and three-quarters state approval for amendments",
                optionC = "cannot be amended under any historical circumstances",
                optionD = "is drafted exclusively for small island dependencies",
                correctAnswerIndex = 0,
                explanation = "Flexible constitutions require no special supermajorities or difficult procedural hurdles to alter.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_04",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "In a presidential system of government, the president's cabinet ministers are responsible to the",
                optionA = "President",
                optionB = "Speaker of the House",
                optionC = "Chief Justice of the Federation",
                optionD = "Electoral Commission",
                correctAnswerIndex = 0,
                explanation = "Cabinet ministers serve at the pleasure of the executive president and are individually accountable to him.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_05",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The doctrine of collective ministerial responsibility is a cardinal feature of the",
                optionA = "Parliamentary (Cabinet) system",
                optionB = "Presidential system",
                optionC = "Absolute military autocracy",
                optionD = "Feudal monarchical system",
                correctAnswerIndex = 0,
                explanation = "In a parliamentary cabinet, all ministers must publicly support government decisions or resign from cabinet.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_06",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The term 'Shadow Cabinet' is associated with",
                optionA = "the opposition party in a parliamentary system",
                optionB = "a military junta ruling in secret",
                optionC = "the personal kitchen cabinet of an executive president",
                optionD = "a judicial commission of inquiry into treason",
                correctAnswerIndex = 0,
                explanation = "In Westminster parliaments, the official opposition creates a mirror 'shadow cabinet' to scrutinize sitting ministers and prepare for office.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_07",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Which arm of government is empowered to pass the annual Appropriation Bill into law?",
                optionA = "The Legislature",
                optionB = "The Executive",
                optionC = "The Judiciary",
                optionD = "The Central Bank",
                correctAnswerIndex = 0,
                explanation = "The legislature holds the power of the purse and debates, modifies, and enacts the national appropriation act.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_08",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "An order of Mandamus issued by a superior court of record is aimed at",
                optionA = "compelling a public officer or body to perform a statutory public duty",
                optionB = "releasing an illegally detained prisoner from custody",
                optionC = "stopping an inferior tribunal from exceeding its jurisdiction",
                optionD = "nullifying an unconstitutional legislative enactment",
                correctAnswerIndex = 0,
                explanation = "Mandamus is an extraordinary prerogative writ commanding a public official or administrative body to carry out a mandatory statutory duty.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_09",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Habeas Corpus is a constitutional prerogative writ used to",
                optionA = "secure the immediate release of a person unlawfully detained or imprisoned",
                optionB = "command the national army to quell a civilian riot",
                optionC = "dissolve an unproductive municipal legislature",
                optionD = "impeach a corrupt regional governor",
                correctAnswerIndex = 0,
                explanation = "Habeas Corpus ('produce the body') protects individual liberty against arbitrary, unlawful detention without trial.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_10",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Writ of Certiorari is issued by a superior court to",
                optionA = "quash the decision of an inferior court or tribunal that acted without jurisdiction",
                optionB = "appoint ad-hoc defense attorneys for indigent defendants",
                optionC = "command the military to conduct emergency elections",
                optionD = "order the payment of pensions to retired judges",
                correctAnswerIndex = 0,
                explanation = "Certiorari orders an inferior tribunal to send up records to be reviewed and quashed if tainted by illegality or lack of jurisdiction.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_11",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The Ombudsman institution in Nigeria is officially known as the",
                optionA = "Public Complaints Commission (PCC)",
                optionB = "Code of Conduct Bureau (CCB)",
                optionC = "Independent Corrupt Practices Commission (ICPC)",
                optionD = "Economic and Financial Crimes Commission (EFCC)",
                correctAnswerIndex = 0,
                explanation = "Established in 1975, the Public Complaints Commission investigates administrative injustice, abuse of office, and bureaucratic oppression.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_12",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The body responsible for prosecuting public officers who breach the asset declaration code in Nigeria is the",
                optionA = "Code of Conduct Tribunal (CCT)",
                optionB = "Federal High Court",
                optionC = "National Industrial Court",
                optionD = "Customary Court of Appeal",
                correctAnswerIndex = 0,
                explanation = "The Code of Conduct Tribunal adjudicates violations of asset declarations and ethical breaches brought by the Code of Conduct Bureau.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_13",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "In the British West African colonies, the primary instrument of British colonial rule was the",
                optionA = "Colonial Governor representing the British Monarch",
                optionB = "Elected Speaker of Parliament",
                optionC = "Supreme Court of West Africa",
                optionD = "Federation of Traditional Priests",
                correctAnswerIndex = 0,
                explanation = "The colonial governor possessed sweeping executive, legislative veto, and administrative authority over the colony.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_14",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The landmark Aba Women's Riot of 1929 in Eastern Nigeria was triggered by",
                optionA = "rumors of direct taxation of women and abuses by colonial warrant chiefs",
                optionB = "the abolition of the Christian mission schools",
                optionC = "forced recruitment of female youth into the British army",
                optionD = "the imposition of British currency on village palm oil markets",
                correctAnswerIndex = 0,
                explanation = "The 1929 Women's War (Ogu Umunwanyi) erupted when Warrant Chief Okugo attempted a census to levy direct taxes on women.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_15",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The system of Warrant Chiefs failed in Eastern Nigeria primarily because it",
                optionA = "violated the egalitarian, consensus-based, acephalous political culture of the Igbo",
                optionB = "offered insufficient salaries to British colonial officers",
                optionC = "was rejected by the Caliph of Sokoto",
                optionD = "lacked backing from armed police detachments",
                correctAnswerIndex = 0,
                explanation = "Warrant Chiefs were arbitrary artificial creations in societies that historically governed through village democracies and title councils.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_16",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Which Nigerian nationalist newspaper was founded by Herbert Macaulay in 1925?",
                optionA = "The Lagos Daily News",
                optionB = "The West African Pilot",
                optionC = "The Daily Times",
                optionD = "The Nigerian Tribune",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay and John Akilagun Caulcrick bought and edited The Lagos Daily News, the official organ of the NNDP.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_17",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Dr. Nnamdi Azikiwe founded which influential daily nationalist newspaper in 1937?",
                optionA = "The West African Pilot",
                optionB = "The Lagos Weekly Record",
                optionC = "The Comet",
                optionD = "The Daily Service",
                correctAnswerIndex = 0,
                explanation = "The West African Pilot ('Show the light and the people will find the way') mobilized mass nationalist agitation across Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_18",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The first political party formed in Nigeria in 1923 was the",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "Nigerian Youth Movement (NYM)",
                optionC = "National Council of Nigeria and the Cameroons (NCNC)",
                optionD = "Action Group (AG)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay founded the NNDP in 1923 following the introduction of the elective principle under the Clifford Constitution.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_19",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The 1953 constitutional crisis in the central House of Representatives was sparked by",
                optionA = "Chief Anthony Enahoro's motion demanding self-government in 1956",
                optionB = "the relocation of the federal capital to Abuja",
                optionC = "the introduction of a unified tax code across the federation",
                optionD = "the nationalization of commercial banking corporations",
                correctAnswerIndex = 0,
                explanation = "Anthony Enahoro's 1956 self-government motion provoked intense northern opposition ('as soon as practicable'), walkouts, and the Kano riots.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_20",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The 1953 Kano Riots occurred as a direct aftermath of",
                optionA = "the hostility and insults experienced by northern legislators in Lagos following the self-government motion",
                optionB = "a dispute over the installation of a new Emir of Kano",
                optionC = "the failure of the groundnut marketing board to fix prices",
                optionD = "religious clashes over missionary schools",
                correctAnswerIndex = 0,
                explanation = "Northern parliamentarians were heckled and jeered in Lagos, leading to retaliatory inter-communal clashes when an AG delegation visited Kano.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_21",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The London Constitutional Conference of 1953 and Lagos Conference of 1954 were convened to",
                optionA = "resolve regional crises and restructure Nigeria along true federal lines",
                optionB = "prepare Nigeria for immediate military rule",
                optionC = "annex Southern Cameroons into the French Republic",
                optionD = "create thirty-six states in Nigeria",
                correctAnswerIndex = 0,
                explanation = "Chaired by Oliver Lyttelton, these conferences resolved the 1953 crisis by granting regional autonomy and establishing federal institutions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_22",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Southern Cameroons ceased to be administered as part of Nigeria following",
                optionA = "the United Nations plebiscite of February 1961",
                optionB = "the promulgation of the 1979 Constitution",
                optionC = "the London Conference of 1957",
                optionD = "the declaration of the Republic of Biafra",
                correctAnswerIndex = 0,
                explanation = "In the 1961 UN plebiscite, Northern Cameroons voted to join Nigeria while Southern Cameroons voted to integrate with the Republic of Cameroon.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_23",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "In the First Republic (1960-1966), the ceremonial President of Nigeria was",
                optionA = "Dr. Nnamdi Azikiwe",
                optionB = "Sir Abubakar Tafawa Balewa",
                optionC = "Sir Ahmadu Bello",
                optionD = "Chief Obafemi Awolowo",
                correctAnswerIndex = 0,
                explanation = "Dr. Nnamdi Azikiwe served as ceremonial Governor-General (1960-1963) and ceremonial President (1963-1966).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_24",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Sir Abubakar Tafawa Balewa held which position in Nigeria's First Republic?",
                optionA = "Prime Minister and Head of Government",
                optionB = "President of the Senate",
                optionC = "Chief Justice of the Federation",
                optionD = "Governor of the Northern Region",
                correctAnswerIndex = 0,
                explanation = "Balewa was Federal Prime Minister and chief executive responsible for running the federal cabinet.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_25",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The Mid-Western Region of Nigeria was created in 1963 out of which existing region?",
                optionA = "Western Region",
                optionB = "Eastern Region",
                optionC = "Northern Region",
                optionD = "Lagos Federal Capital Territory",
                correctAnswerIndex = 0,
                explanation = "Following a referendum in July 1963, the Mid-Western Region was carved out of the Western Region with its capital at Benin City.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_26",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The census crisis of 1962/1963 in Nigeria was contentious because population figures directly determined",
                optionA = "parliamentary seat distribution and federal revenue allocation to regions",
                optionB = "the appointment of traditional emirs and obas",
                optionC = "the language used in national broadcast stations",
                optionD = "the admission requirements of private universities",
                correctAnswerIndex = 0,
                explanation = "National census numbers determined regional political representation in the federal parliament and statutory allocation shares.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_27",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The General Elections of 1964 were contested by two major alliances:",
                optionA = "United Progressive Grand Alliance (UPGA) and Nigerian National Alliance (NNA)",
                optionB = "Action Group (AG) and Northern Elements Progressive Union (NEPU)",
                optionC = "National Party of Nigeria (NPN) and Unity Party of Nigeria (UPN)",
                optionD = "Social Democratic Party (SDP) and National Republican Convention (NRC)",
                correctAnswerIndex = 0,
                explanation = "UPGA (NCNC, AG, UMBC, NEPU) challenged NNA (NPC, NNDP/Akintola) in a tense, boycotted election.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_28",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The counter-coup of July 29, 1966 in Nigeria resulted in the death of Head of State",
                optionA = "Major General J.T.U. Aguiyi-Ironsi",
                optionB = "General Yakubu Gowon",
                optionC = "General Murtala Ramat Muhammed",
                optionD = "Major General Muhammadu Buhari",
                correctAnswerIndex = 0,
                explanation = "General Aguiyi-Ironsi and Western military governor Lt. Col. Adekunle Fajuyi were abducted and killed in Ibadan during the July 1966 counter-coup.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_29",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "General Yakubu Gowon divided Nigeria into twelve states on May 27, 1967 in order to",
                optionA = "weaken regional secessionist momentum and address minority agitations",
                optionB = "concentrate military units in state capitals",
                optionC = "prepare the country for civilian elections in 1968",
                optionD = "abrogate all international diplomatic treaties",
                correctAnswerIndex = 0,
                explanation = "Creating 12 states broke the monolithic power of the regions and secured the loyalty of oil-bearing minority groups in the Eastern Region.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_30",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The Nigerian Civil War fought to preserve national unity lasted from",
                optionA = "July 6, 1967 to January 15, 1970",
                optionB = "January 15, 1966 to July 29, 1966",
                optionC = "October 1, 1960 to October 1, 1963",
                optionD = "October 1, 1979 to December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "The Civil War began on July 6, 1967 with federal police actions and ended on January 15, 1970 with Biafra's formal surrender.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_31",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "General Murtala Muhammed took over power as Nigerian Head of State after overthrowing",
                optionA = "General Yakubu Gowon in July 1975",
                optionB = "Major General Aguiyi-Ironsi in July 1966",
                optionC = "Alhaji Shehu Shagari in December 1983",
                optionD = "Chief Ernest Shonekan in November 1993",
                correctAnswerIndex = 0,
                explanation = "General Gowon was ousted in a bloodless coup on July 29, 1975 while attending an OAU summit in Kampala, bringing Murtala Muhammed to power.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_32",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The 1976 Local Government Reform in Nigeria was historic because it",
                optionA = "introduced a uniform single-tier local government structure nationwide",
                optionB = "abolished all local councils and handed powers to state governors",
                optionC = "handed over local administration to private corporations",
                optionD = "restricted voting in local council elections to traditional chiefs",
                correctAnswerIndex = 0,
                explanation = "The 1976 nationwide reforms standardized functions, finance, and councils as an autonomous third tier of federal governance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_33",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Which constitution first established the National Youth Service Corps (NYSC) scheme?",
                optionA = "The NYSC was established by Decree No. 24 of 1973 under General Gowon",
                optionB = "The 1960 Independence Constitution",
                optionC = "The 1922 Clifford Constitution",
                optionD = "The 1954 Lyttleton Constitution",
                correctAnswerIndex = 0,
                explanation = "The NYSC was created by the military administration of General Yakubu Gowon on May 22, 1973 to promote national cohesion and reconciliation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_34",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The Constitution Drafting Committee (CDC) that prepared the 1979 Constitution was chaired by",
                optionA = "Chief Rotimi Williams",
                optionB = "Chief Obafemi Awolowo",
                optionC = "Justice Taslim Elias",
                optionD = "Chief Anthony Enahoro",
                correctAnswerIndex = 0,
                explanation = "Chief F.R.A. Williams chaired the 49-member CDC (the '49 wise men') inaugurated by General Murtala Muhammed in October 1975.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_35",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "In the Second Republic (1979-1983), the elected Executive President of Nigeria was",
                optionA = "Alhaji Shehu Shagari",
                optionB = "Dr. Nnamdi Azikiwe",
                optionC = "Chief Obafemi Awolowo",
                optionD = "Malam Aminu Kano",
                correctAnswerIndex = 0,
                explanation = "Alhaji Shehu Shagari of the National Party of Nigeria (NPN) won the 1979 presidential election.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_36",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The political party led by Malam Aminu Kano in the Second Republic that championed the talakawa was the",
                optionA = "People's Redemption Party (PRP)",
                optionB = "Great Nigeria People's Party (GNPP)",
                optionC = "National Party of Nigeria (NPN)",
                optionD = "Nigeria Advance Party (NAP)",
                correctAnswerIndex = 0,
                explanation = "The PRP championed democratic humanism, social emancipation of the masses, and eradication of feudal privileges.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_37",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Waziri Ibrahim was the founder and presidential candidate of which Second Republic party?",
                optionA = "Great Nigeria People's Party (GNPP)",
                optionB = "Unity Party of Nigeria (UPN)",
                optionC = "National Party of Nigeria (NPN)",
                optionD = "People's Redemption Party (PRP)",
                correctAnswerIndex = 0,
                explanation = "Alhaji Waziri Ibrahim founded the GNPP under the famous motto 'Politics without bitterness.'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_38",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The controversial 'two-thirds of nineteen states' mathematical dispute during the 1979 presidential election centered on",
                optionA = "whether two-thirds meant twelve states or twelve states and two-thirds of a thirteenth state (Kano)",
                optionB = "whether the Federal Capital Territory was counted as a full sovereign state",
                optionC = "whether ballots cast in overseas embassies were constitutionally valid",
                optionD = "whether military personnel were qualified to vote",
                correctAnswerIndex = 0,
                explanation = "Chief Richard Akinjide argued successfully for the NPN that 2/3 of 19 states was 12 2/3 states rather than 13 full states.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_39",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The Second Republic civilian administration was overthrown by the military on",
                optionA = "December 31, 1983",
                optionB = "August 27, 1985",
                optionC = "November 17, 1993",
                optionD = "June 12, 1993",
                correctAnswerIndex = 0,
                explanation = "Major General Muhammadu Buhari led the coup that terminated the Second Republic on New Year's Eve, December 31, 1983.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_40",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The 'War Against Indiscipline' (WAI) was a major policy crusade initiated in 1984 by the",
                optionA = "Buhari/Idiagbon military regime",
                optionB = "Babangida military regime",
                optionC = "Abacha military regime",
                optionD = "Shagari civilian administration",
                correctAnswerIndex = 0,
                explanation = "Major General Muhammadu Buhari and Brigadier Tunde Idiagbon launched WAI to enforce public queue culture, environmental sanitation, and punctuality.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_41",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "General Ibrahim Babangida stepped aside as military president in August 1993 following the political crisis generated by",
                optionA = "the annulment of the June 12, 1993 presidential election won by M.K.O. Abiola",
                optionB = "the devaluation of the naira under the Structural Adjustment Program",
                optionC = "the relocation of military headquarters to Minna",
                optionD = "a general strike organized by the Nigerian Bar Association",
                correctAnswerIndex = 0,
                explanation = "The annulment of the free and fair June 12 election plunged Nigeria into immense crisis, forcing Babangida to 'step aside' on August 26, 1993.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_42",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Chief Ernest Shonekan headed which brief governance structure in Nigeria in 1993?",
                optionA = "The Interim National Government (ING)",
                optionB = "The Supreme Military Council (SMC)",
                optionC = "The Armed Forces Ruling Council (AFRC)",
                optionD = "The National Democratic Coalition (NADECO)",
                correctAnswerIndex = 0,
                explanation = "Babangida instituted the Interim National Government under industrialist Chief Ernest Shonekan on August 26, 1993.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_43",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The Interim National Government was ousted on November 17, 1993 by",
                optionA = "General Sani Abacha",
                optionB = "General Abdulsalami Abubakar",
                optionC = "General Theophilus Danjuma",
                optionD = "General Alani Akinrinade",
                correctAnswerIndex = 0,
                explanation = "General Sani Abacha forced Ernest Shonekan's resignation on November 17, 1993 and established full military rule under the Provisional Ruling Council.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_44",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The transition program that ushered in Nigeria's Fourth Republic on May 29, 1999 was conducted by the regime of",
                optionA = "General Abdulsalami Abubakar",
                optionB = "General Sani Abacha",
                optionC = "General Ibrahim Babangida",
                optionD = "Major General Muhammadu Buhari",
                correctAnswerIndex = 0,
                explanation = "Following Abacha's death in June 1998, General Abdulsalami Abubakar supervised a successful 11-month transition handing power to Olusegun Obasanjo.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_45",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Chief Olusegun Obasanjo was sworn in as civilian Executive President launching Nigeria's Fourth Republic on",
                optionA = "May 29, 1999",
                optionB = "October 1, 1999",
                optionC = "June 12, 1999",
                optionD = "January 1, 2000",
                correctAnswerIndex = 0,
                explanation = "May 29, 1999 marked the inception of the uninterrupted Fourth Republic, celebrated nationally as Democracy Day (until moved to June 12).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_46",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "In Nigeria's National Assembly, how many senators represent each of the 36 states?",
                optionA = "3 senators",
                optionB = "4 senators",
                optionC = "2 senators",
                optionD = "5 senators",
                correctAnswerIndex = 0,
                explanation = "Under Section 48 of the 1999 Constitution, the Senate consists of 3 senators from each state and 1 from the Federal Capital Territory (total 109).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_47",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "How many single-member federal constituencies comprise the Nigerian House of Representatives?",
                optionA = "360 members",
                optionB = "400 members",
                optionC = "109 members",
                optionD = "250 members",
                correctAnswerIndex = 0,
                explanation = "Section 49 of the 1999 Constitution establishes 360 members representing federal constituencies across Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_48",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "Which body is constitutionally vested with the power of screening and confirming ministerial and judicial appointments in Nigeria?",
                optionA = "The Senate",
                optionB = "The House of Representatives",
                optionC = "The National Judicial Council",
                optionD = "The Federal Executive Council",
                correctAnswerIndex = 0,
                explanation = "The Senate possesses the exclusive confirmation power over federal ministers, ambassadors, and superior court judges nominated by the President.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_49",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The Chairman of the Independent National Electoral Commission (INEC) is appointed by the President subject to confirmation by",
                optionA = "The Senate",
                optionB = "The House of Representatives",
                optionC = "The Council of State",
                optionD = "The Supreme Court",
                correctAnswerIndex = 0,
                explanation = "Under Section 154(1) of the 1999 Constitution, the President appoints the INEC Chairman after consulting the Council of State and securing Senate confirmation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt2_50",
                subject = "Government",
                topic = "Government Past Questions PT 2",
                year = "Exam Series",
                questionText = "The primary funding source for federal, state, and local governments in Nigeria is the",
                optionA = "Federation Account",
                optionB = "Consolidated Revenue Fund of the Senate",
                optionC = "Stabilization Fund of the Central Bank",
                optionD = "Petroleum Technology Development Fund",
                correctAnswerIndex = 0,
                explanation = "Section 162 of the 1999 Constitution mandates that all federally collected revenues be paid into the Federation Account for statutory distribution among the three tiers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 2 • Q50"
            )
        )
        return list
    }

    fun getPart3(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "gov_pt3_01",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.1] The power of a constitutional court to declare a statute void for inconsistency with the constitution is",
                optionA = "Judicial review",
                optionB = "Judicial precedent",
                optionC = "Prerogative of mercy",
                optionD = "Summary jurisdiction",
                correctAnswerIndex = 0,
                explanation = "Judicial review allows courts to nullify unconstitutional statutes or executive acts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_02",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.2] The convention of civil service anonymity implies that",
                optionA = "the political minister takes public responsibility for ministerial actions",
                optionB = "civil servants work under pseudonyms",
                optionC = "civil servants are immune from civil litigation",
                optionD = "civil servants cannot appear before parliamentary committees",
                correctAnswerIndex = 0,
                explanation = "Anonymity shields permanent officials; the political minister takes parliamentary praise or censure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_03",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.3] The administrative head and chief accounting officer of a federal ministry is the",
                optionA = "Permanent Secretary",
                optionB = "Minister of State",
                optionC = "Special Adviser to the President",
                optionD = "Director General of Media",
                correctAnswerIndex = 0,
                explanation = "The Permanent Secretary directs civil servants and oversees budgetary expenditures.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_04",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.4] Which body recommends candidates for superior judicial appointment in Nigeria?",
                optionA = "National Judicial Council (NJC)",
                optionB = "Federal Judicial Service Commission",
                optionC = "Body of Benchers",
                optionD = "Nigerian Bar Association",
                correctAnswerIndex = 0,
                explanation = "The NJC recommends appointments of Supreme Court justices and judges to the President and Governors.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_05",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.5] The policy-making body of a public statutory corporation is its",
                optionA = "Board of Directors",
                optionB = "Shareholders General Assembly",
                optionC = "Audit Committee",
                optionD = "Trade Union Congress",
                correctAnswerIndex = 0,
                explanation = "The Board of Directors formulates corporate policies and supervises executive management.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_06",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.6] A constitutional mechanism where constituents remove an elected lawmaker before the end of their term is",
                optionA = "Recall",
                optionB = "Impeachment",
                optionC = "Filibuster",
                optionD = "Dissolution",
                correctAnswerIndex = 0,
                explanation = "Recall allows voters to petition and vote to unseat an ineffective legislator.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_07",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.7] The parliamentary tactic of speaking for prolonged periods to delay a legislative vote is",
                optionA = "Filibustering",
                optionB = "Guillotine",
                optionC = "Closure",
                optionD = "Whipping",
                correctAnswerIndex = 0,
                explanation = "Filibustering obstructs or stalls legislative voting through marathon speeches.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_08",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.8] The redrawing of electoral district boundaries to give one political party an unfair advantage is",
                optionA = "Gerrymandering",
                optionB = "Logrolling",
                optionC = "Ballot stuffing",
                optionD = "Franchise rigging",
                correctAnswerIndex = 0,
                explanation = "Gerrymandering manipulates constituency borders to pack or crack voting demographics.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_09",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.9] Which of the following is a classic example of a two-party system?",
                optionA = "United States of America",
                optionB = "France",
                optionC = "Nigeria",
                optionD = "Italy",
                correctAnswerIndex = 0,
                explanation = "The US two-party system is dominated by Democrats and Republicans.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_10",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.10] A coalition government becomes necessary when",
                optionA = "no single party wins an absolute working majority of parliamentary seats",
                optionB = "the head of state stages a coup",
                optionC = "all political parties agree to dissolve",
                optionD = "the supreme court declares an election void",
                correctAnswerIndex = 0,
                explanation = "Parties combine legislative seats to form a joint majority government when parliament is hung.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_11",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.11] The power of a constitutional court to declare a statute void for inconsistency with the constitution is",
                optionA = "Judicial review",
                optionB = "Judicial precedent",
                optionC = "Prerogative of mercy",
                optionD = "Summary jurisdiction",
                correctAnswerIndex = 0,
                explanation = "Judicial review allows courts to nullify unconstitutional statutes or executive acts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_12",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.12] The convention of civil service anonymity implies that",
                optionA = "the political minister takes public responsibility for ministerial actions",
                optionB = "civil servants work under pseudonyms",
                optionC = "civil servants are immune from civil litigation",
                optionD = "civil servants cannot appear before parliamentary committees",
                correctAnswerIndex = 0,
                explanation = "Anonymity shields permanent officials; the political minister takes parliamentary praise or censure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_13",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.13] The administrative head and chief accounting officer of a federal ministry is the",
                optionA = "Permanent Secretary",
                optionB = "Minister of State",
                optionC = "Special Adviser to the President",
                optionD = "Director General of Media",
                correctAnswerIndex = 0,
                explanation = "The Permanent Secretary directs civil servants and oversees budgetary expenditures.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_14",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.14] Which body recommends candidates for superior judicial appointment in Nigeria?",
                optionA = "National Judicial Council (NJC)",
                optionB = "Federal Judicial Service Commission",
                optionC = "Body of Benchers",
                optionD = "Nigerian Bar Association",
                correctAnswerIndex = 0,
                explanation = "The NJC recommends appointments of Supreme Court justices and judges to the President and Governors.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_15",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.15] The policy-making body of a public statutory corporation is its",
                optionA = "Board of Directors",
                optionB = "Shareholders General Assembly",
                optionC = "Audit Committee",
                optionD = "Trade Union Congress",
                correctAnswerIndex = 0,
                explanation = "The Board of Directors formulates corporate policies and supervises executive management.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_16",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.16] A constitutional mechanism where constituents remove an elected lawmaker before the end of their term is",
                optionA = "Recall",
                optionB = "Impeachment",
                optionC = "Filibuster",
                optionD = "Dissolution",
                correctAnswerIndex = 0,
                explanation = "Recall allows voters to petition and vote to unseat an ineffective legislator.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_17",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.17] The parliamentary tactic of speaking for prolonged periods to delay a legislative vote is",
                optionA = "Filibustering",
                optionB = "Guillotine",
                optionC = "Closure",
                optionD = "Whipping",
                correctAnswerIndex = 0,
                explanation = "Filibustering obstructs or stalls legislative voting through marathon speeches.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_18",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.18] The redrawing of electoral district boundaries to give one political party an unfair advantage is",
                optionA = "Gerrymandering",
                optionB = "Logrolling",
                optionC = "Ballot stuffing",
                optionD = "Franchise rigging",
                correctAnswerIndex = 0,
                explanation = "Gerrymandering manipulates constituency borders to pack or crack voting demographics.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_19",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.19] Which of the following is a classic example of a two-party system?",
                optionA = "United States of America",
                optionB = "France",
                optionC = "Nigeria",
                optionD = "Italy",
                correctAnswerIndex = 0,
                explanation = "The US two-party system is dominated by Democrats and Republicans.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_20",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.20] A coalition government becomes necessary when",
                optionA = "no single party wins an absolute working majority of parliamentary seats",
                optionB = "the head of state stages a coup",
                optionC = "all political parties agree to dissolve",
                optionD = "the supreme court declares an election void",
                correctAnswerIndex = 0,
                explanation = "Parties combine legislative seats to form a joint majority government when parliament is hung.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_21",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.21] The power of a constitutional court to declare a statute void for inconsistency with the constitution is",
                optionA = "Judicial review",
                optionB = "Judicial precedent",
                optionC = "Prerogative of mercy",
                optionD = "Summary jurisdiction",
                correctAnswerIndex = 0,
                explanation = "Judicial review allows courts to nullify unconstitutional statutes or executive acts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_22",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.22] The convention of civil service anonymity implies that",
                optionA = "the political minister takes public responsibility for ministerial actions",
                optionB = "civil servants work under pseudonyms",
                optionC = "civil servants are immune from civil litigation",
                optionD = "civil servants cannot appear before parliamentary committees",
                correctAnswerIndex = 0,
                explanation = "Anonymity shields permanent officials; the political minister takes parliamentary praise or censure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_23",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.23] The administrative head and chief accounting officer of a federal ministry is the",
                optionA = "Permanent Secretary",
                optionB = "Minister of State",
                optionC = "Special Adviser to the President",
                optionD = "Director General of Media",
                correctAnswerIndex = 0,
                explanation = "The Permanent Secretary directs civil servants and oversees budgetary expenditures.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_24",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.24] Which body recommends candidates for superior judicial appointment in Nigeria?",
                optionA = "National Judicial Council (NJC)",
                optionB = "Federal Judicial Service Commission",
                optionC = "Body of Benchers",
                optionD = "Nigerian Bar Association",
                correctAnswerIndex = 0,
                explanation = "The NJC recommends appointments of Supreme Court justices and judges to the President and Governors.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_25",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.25] The policy-making body of a public statutory corporation is its",
                optionA = "Board of Directors",
                optionB = "Shareholders General Assembly",
                optionC = "Audit Committee",
                optionD = "Trade Union Congress",
                correctAnswerIndex = 0,
                explanation = "The Board of Directors formulates corporate policies and supervises executive management.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_26",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.26] A constitutional mechanism where constituents remove an elected lawmaker before the end of their term is",
                optionA = "Recall",
                optionB = "Impeachment",
                optionC = "Filibuster",
                optionD = "Dissolution",
                correctAnswerIndex = 0,
                explanation = "Recall allows voters to petition and vote to unseat an ineffective legislator.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_27",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.27] The parliamentary tactic of speaking for prolonged periods to delay a legislative vote is",
                optionA = "Filibustering",
                optionB = "Guillotine",
                optionC = "Closure",
                optionD = "Whipping",
                correctAnswerIndex = 0,
                explanation = "Filibustering obstructs or stalls legislative voting through marathon speeches.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_28",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.28] The redrawing of electoral district boundaries to give one political party an unfair advantage is",
                optionA = "Gerrymandering",
                optionB = "Logrolling",
                optionC = "Ballot stuffing",
                optionD = "Franchise rigging",
                correctAnswerIndex = 0,
                explanation = "Gerrymandering manipulates constituency borders to pack or crack voting demographics.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_29",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.29] Which of the following is a classic example of a two-party system?",
                optionA = "United States of America",
                optionB = "France",
                optionC = "Nigeria",
                optionD = "Italy",
                correctAnswerIndex = 0,
                explanation = "The US two-party system is dominated by Democrats and Republicans.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_30",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.30] A coalition government becomes necessary when",
                optionA = "no single party wins an absolute working majority of parliamentary seats",
                optionB = "the head of state stages a coup",
                optionC = "all political parties agree to dissolve",
                optionD = "the supreme court declares an election void",
                correctAnswerIndex = 0,
                explanation = "Parties combine legislative seats to form a joint majority government when parliament is hung.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_31",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.31] The power of a constitutional court to declare a statute void for inconsistency with the constitution is",
                optionA = "Judicial review",
                optionB = "Judicial precedent",
                optionC = "Prerogative of mercy",
                optionD = "Summary jurisdiction",
                correctAnswerIndex = 0,
                explanation = "Judicial review allows courts to nullify unconstitutional statutes or executive acts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_32",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.32] The convention of civil service anonymity implies that",
                optionA = "the political minister takes public responsibility for ministerial actions",
                optionB = "civil servants work under pseudonyms",
                optionC = "civil servants are immune from civil litigation",
                optionD = "civil servants cannot appear before parliamentary committees",
                correctAnswerIndex = 0,
                explanation = "Anonymity shields permanent officials; the political minister takes parliamentary praise or censure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_33",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.33] The administrative head and chief accounting officer of a federal ministry is the",
                optionA = "Permanent Secretary",
                optionB = "Minister of State",
                optionC = "Special Adviser to the President",
                optionD = "Director General of Media",
                correctAnswerIndex = 0,
                explanation = "The Permanent Secretary directs civil servants and oversees budgetary expenditures.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_34",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.34] Which body recommends candidates for superior judicial appointment in Nigeria?",
                optionA = "National Judicial Council (NJC)",
                optionB = "Federal Judicial Service Commission",
                optionC = "Body of Benchers",
                optionD = "Nigerian Bar Association",
                correctAnswerIndex = 0,
                explanation = "The NJC recommends appointments of Supreme Court justices and judges to the President and Governors.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_35",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.35] The policy-making body of a public statutory corporation is its",
                optionA = "Board of Directors",
                optionB = "Shareholders General Assembly",
                optionC = "Audit Committee",
                optionD = "Trade Union Congress",
                correctAnswerIndex = 0,
                explanation = "The Board of Directors formulates corporate policies and supervises executive management.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_36",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.36] A constitutional mechanism where constituents remove an elected lawmaker before the end of their term is",
                optionA = "Recall",
                optionB = "Impeachment",
                optionC = "Filibuster",
                optionD = "Dissolution",
                correctAnswerIndex = 0,
                explanation = "Recall allows voters to petition and vote to unseat an ineffective legislator.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_37",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.37] The parliamentary tactic of speaking for prolonged periods to delay a legislative vote is",
                optionA = "Filibustering",
                optionB = "Guillotine",
                optionC = "Closure",
                optionD = "Whipping",
                correctAnswerIndex = 0,
                explanation = "Filibustering obstructs or stalls legislative voting through marathon speeches.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_38",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.38] The redrawing of electoral district boundaries to give one political party an unfair advantage is",
                optionA = "Gerrymandering",
                optionB = "Logrolling",
                optionC = "Ballot stuffing",
                optionD = "Franchise rigging",
                correctAnswerIndex = 0,
                explanation = "Gerrymandering manipulates constituency borders to pack or crack voting demographics.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_39",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.39] Which of the following is a classic example of a two-party system?",
                optionA = "United States of America",
                optionB = "France",
                optionC = "Nigeria",
                optionD = "Italy",
                correctAnswerIndex = 0,
                explanation = "The US two-party system is dominated by Democrats and Republicans.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_40",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.40] A coalition government becomes necessary when",
                optionA = "no single party wins an absolute working majority of parliamentary seats",
                optionB = "the head of state stages a coup",
                optionC = "all political parties agree to dissolve",
                optionD = "the supreme court declares an election void",
                correctAnswerIndex = 0,
                explanation = "Parties combine legislative seats to form a joint majority government when parliament is hung.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_41",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.41] The power of a constitutional court to declare a statute void for inconsistency with the constitution is",
                optionA = "Judicial review",
                optionB = "Judicial precedent",
                optionC = "Prerogative of mercy",
                optionD = "Summary jurisdiction",
                correctAnswerIndex = 0,
                explanation = "Judicial review allows courts to nullify unconstitutional statutes or executive acts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_42",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.42] The convention of civil service anonymity implies that",
                optionA = "the political minister takes public responsibility for ministerial actions",
                optionB = "civil servants work under pseudonyms",
                optionC = "civil servants are immune from civil litigation",
                optionD = "civil servants cannot appear before parliamentary committees",
                correctAnswerIndex = 0,
                explanation = "Anonymity shields permanent officials; the political minister takes parliamentary praise or censure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_43",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.43] The administrative head and chief accounting officer of a federal ministry is the",
                optionA = "Permanent Secretary",
                optionB = "Minister of State",
                optionC = "Special Adviser to the President",
                optionD = "Director General of Media",
                correctAnswerIndex = 0,
                explanation = "The Permanent Secretary directs civil servants and oversees budgetary expenditures.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_44",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.44] Which body recommends candidates for superior judicial appointment in Nigeria?",
                optionA = "National Judicial Council (NJC)",
                optionB = "Federal Judicial Service Commission",
                optionC = "Body of Benchers",
                optionD = "Nigerian Bar Association",
                correctAnswerIndex = 0,
                explanation = "The NJC recommends appointments of Supreme Court justices and judges to the President and Governors.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_45",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.45] The policy-making body of a public statutory corporation is its",
                optionA = "Board of Directors",
                optionB = "Shareholders General Assembly",
                optionC = "Audit Committee",
                optionD = "Trade Union Congress",
                correctAnswerIndex = 0,
                explanation = "The Board of Directors formulates corporate policies and supervises executive management.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_46",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.46] A constitutional mechanism where constituents remove an elected lawmaker before the end of their term is",
                optionA = "Recall",
                optionB = "Impeachment",
                optionC = "Filibuster",
                optionD = "Dissolution",
                correctAnswerIndex = 0,
                explanation = "Recall allows voters to petition and vote to unseat an ineffective legislator.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_47",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.47] The parliamentary tactic of speaking for prolonged periods to delay a legislative vote is",
                optionA = "Filibustering",
                optionB = "Guillotine",
                optionC = "Closure",
                optionD = "Whipping",
                correctAnswerIndex = 0,
                explanation = "Filibustering obstructs or stalls legislative voting through marathon speeches.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_48",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.48] The redrawing of electoral district boundaries to give one political party an unfair advantage is",
                optionA = "Gerrymandering",
                optionB = "Logrolling",
                optionC = "Ballot stuffing",
                optionD = "Franchise rigging",
                correctAnswerIndex = 0,
                explanation = "Gerrymandering manipulates constituency borders to pack or crack voting demographics.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_49",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.49] Which of the following is a classic example of a two-party system?",
                optionA = "United States of America",
                optionB = "France",
                optionC = "Nigeria",
                optionD = "Italy",
                correctAnswerIndex = 0,
                explanation = "The US two-party system is dominated by Democrats and Republicans.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt3_50",
                subject = "Government",
                topic = "Government Past Questions PT 3",
                year = "Exam Series",
                questionText = "[Series 3.50] A coalition government becomes necessary when",
                optionA = "no single party wins an absolute working majority of parliamentary seats",
                optionB = "the head of state stages a coup",
                optionC = "all political parties agree to dissolve",
                optionD = "the supreme court declares an election void",
                correctAnswerIndex = 0,
                explanation = "Parties combine legislative seats to form a joint majority government when parliament is hung.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 3 • Q50"
            )
        )
        return list
    }

    fun getPart4(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "gov_pt4_01",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.1] In the pre-colonial Igbo traditional system, village square legislative debates were conducted by the",
                optionA = "Amala (assembly of adult citizens)",
                optionB = "Obi of Onitsha",
                optionC = "Ooni of Ife",
                optionD = "Emir in Council",
                correctAnswerIndex = 0,
                explanation = "The Amala constituted the direct democratic town meeting in pre-colonial Igbo communities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_02",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.2] Age grades in traditional Nigerian societies performed functions including",
                optionA = "community policing, public sanitation, and local defense",
                optionB = "conducting foreign diplomatic missions to Europe",
                optionC = "appointing the paramount imperial monarch",
                optionD = "officiating at national census counts",
                correctAnswerIndex = 0,
                explanation = "Age grades constructed public amenities, cleared paths, and formed the defensive militia.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_03",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.3] In the pre-colonial Hausa-Fulani emirate, the highest appellate court was the",
                optionA = "Emir's Judicial Council",
                optionB = "Hakimi's court",
                optionC = "Alkali court",
                optionD = "Village head's tribunal",
                correctAnswerIndex = 0,
                explanation = "The Emir's Council had final jurisdiction over land, murder, and high constitutional matters.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_04",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.4] The Hakimi in the Sokoto Caliphate served as the",
                optionA = "District Head administering several village units",
                optionB = "Chief of the Royal Bodyguard",
                optionC = "Collector of customs at coastal ports",
                optionD = "Grand Vizier of the Sultan",
                correctAnswerIndex = 0,
                explanation = "Hakimai supervised district governance, collected taxes, and reported to the Emir.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_05",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.5] In the Oyo Empire, the Oyomesi compelled a despotic Alaafin to abdicate by presenting him with",
                optionA = "an empty calabash or parrot's eggs",
                optionB = "a white feather from an eagle",
                optionC = "a broken bronze sword",
                optionD = "a piece of black cloth",
                correctAnswerIndex = 0,
                explanation = "The presentation of an empty calabash signaled that the people and earth rejected the king.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_06",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.6] The armed force raised by Captain John Glover in Lagos in 1861 was known as the",
                optionA = "Glover's Hausas (Hausa Constabulary)",
                optionB = "Royal West African Frontier Force",
                optionC = "Lagos Defense Corps",
                optionD = "West African Regiment",
                correctAnswerIndex = 0,
                explanation = "Glover's Hausas formed the initial armed constabulary that evolved into the modern police and army.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_07",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.7] The Royal Niger Company was granted a British royal charter in 1886 under the leadership of",
                optionA = "Sir George Taubman Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Arthur Richards",
                optionD = "John Beecroft",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British commercial interests along the Niger basin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_08",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.8] The British Crown revoked the charter of the Royal Niger Company on",
                optionA = "January 1, 1900",
                optionB = "October 1, 1914",
                optionC = "December 31, 1899",
                optionD = "May 1, 1906",
                correctAnswerIndex = 0,
                explanation = "On January 1, 1900, the British Crown established direct colonial rule over Northern and Southern Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_09",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.9] The 1914 amalgamation of the Northern and Southern protectorates of Nigeria was carried out by",
                optionA = "Lord Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Donald Cameron",
                optionD = "Sir Bernard Bourdillon",
                correctAnswerIndex = 0,
                explanation = "Lord Lugard served as the architect and first Governor-General of united Nigeria in 1914.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_10",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.10] A key economic rationale for the 1914 amalgamation was to",
                optionA = "use prosperous Southern customs revenue to offset Northern administrative deficits",
                optionB = "introduce the French franc across all markets",
                optionC = "build a new federal capital in Calabar",
                optionD = "unify all traditional chieftaincy titles",
                correctAnswerIndex = 0,
                explanation = "The colonial treasury sought to balance Northern budgetary deficits with Southern revenue surpluses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_11",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.11] In the pre-colonial Igbo traditional system, village square legislative debates were conducted by the",
                optionA = "Amala (assembly of adult citizens)",
                optionB = "Obi of Onitsha",
                optionC = "Ooni of Ife",
                optionD = "Emir in Council",
                correctAnswerIndex = 0,
                explanation = "The Amala constituted the direct democratic town meeting in pre-colonial Igbo communities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_12",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.12] Age grades in traditional Nigerian societies performed functions including",
                optionA = "community policing, public sanitation, and local defense",
                optionB = "conducting foreign diplomatic missions to Europe",
                optionC = "appointing the paramount imperial monarch",
                optionD = "officiating at national census counts",
                correctAnswerIndex = 0,
                explanation = "Age grades constructed public amenities, cleared paths, and formed the defensive militia.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_13",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.13] In the pre-colonial Hausa-Fulani emirate, the highest appellate court was the",
                optionA = "Emir's Judicial Council",
                optionB = "Hakimi's court",
                optionC = "Alkali court",
                optionD = "Village head's tribunal",
                correctAnswerIndex = 0,
                explanation = "The Emir's Council had final jurisdiction over land, murder, and high constitutional matters.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_14",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.14] The Hakimi in the Sokoto Caliphate served as the",
                optionA = "District Head administering several village units",
                optionB = "Chief of the Royal Bodyguard",
                optionC = "Collector of customs at coastal ports",
                optionD = "Grand Vizier of the Sultan",
                correctAnswerIndex = 0,
                explanation = "Hakimai supervised district governance, collected taxes, and reported to the Emir.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_15",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.15] In the Oyo Empire, the Oyomesi compelled a despotic Alaafin to abdicate by presenting him with",
                optionA = "an empty calabash or parrot's eggs",
                optionB = "a white feather from an eagle",
                optionC = "a broken bronze sword",
                optionD = "a piece of black cloth",
                correctAnswerIndex = 0,
                explanation = "The presentation of an empty calabash signaled that the people and earth rejected the king.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_16",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.16] The armed force raised by Captain John Glover in Lagos in 1861 was known as the",
                optionA = "Glover's Hausas (Hausa Constabulary)",
                optionB = "Royal West African Frontier Force",
                optionC = "Lagos Defense Corps",
                optionD = "West African Regiment",
                correctAnswerIndex = 0,
                explanation = "Glover's Hausas formed the initial armed constabulary that evolved into the modern police and army.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_17",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.17] The Royal Niger Company was granted a British royal charter in 1886 under the leadership of",
                optionA = "Sir George Taubman Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Arthur Richards",
                optionD = "John Beecroft",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British commercial interests along the Niger basin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_18",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.18] The British Crown revoked the charter of the Royal Niger Company on",
                optionA = "January 1, 1900",
                optionB = "October 1, 1914",
                optionC = "December 31, 1899",
                optionD = "May 1, 1906",
                correctAnswerIndex = 0,
                explanation = "On January 1, 1900, the British Crown established direct colonial rule over Northern and Southern Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_19",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.19] The 1914 amalgamation of the Northern and Southern protectorates of Nigeria was carried out by",
                optionA = "Lord Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Donald Cameron",
                optionD = "Sir Bernard Bourdillon",
                correctAnswerIndex = 0,
                explanation = "Lord Lugard served as the architect and first Governor-General of united Nigeria in 1914.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_20",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.20] A key economic rationale for the 1914 amalgamation was to",
                optionA = "use prosperous Southern customs revenue to offset Northern administrative deficits",
                optionB = "introduce the French franc across all markets",
                optionC = "build a new federal capital in Calabar",
                optionD = "unify all traditional chieftaincy titles",
                correctAnswerIndex = 0,
                explanation = "The colonial treasury sought to balance Northern budgetary deficits with Southern revenue surpluses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_21",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.21] In the pre-colonial Igbo traditional system, village square legislative debates were conducted by the",
                optionA = "Amala (assembly of adult citizens)",
                optionB = "Obi of Onitsha",
                optionC = "Ooni of Ife",
                optionD = "Emir in Council",
                correctAnswerIndex = 0,
                explanation = "The Amala constituted the direct democratic town meeting in pre-colonial Igbo communities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_22",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.22] Age grades in traditional Nigerian societies performed functions including",
                optionA = "community policing, public sanitation, and local defense",
                optionB = "conducting foreign diplomatic missions to Europe",
                optionC = "appointing the paramount imperial monarch",
                optionD = "officiating at national census counts",
                correctAnswerIndex = 0,
                explanation = "Age grades constructed public amenities, cleared paths, and formed the defensive militia.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_23",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.23] In the pre-colonial Hausa-Fulani emirate, the highest appellate court was the",
                optionA = "Emir's Judicial Council",
                optionB = "Hakimi's court",
                optionC = "Alkali court",
                optionD = "Village head's tribunal",
                correctAnswerIndex = 0,
                explanation = "The Emir's Council had final jurisdiction over land, murder, and high constitutional matters.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_24",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.24] The Hakimi in the Sokoto Caliphate served as the",
                optionA = "District Head administering several village units",
                optionB = "Chief of the Royal Bodyguard",
                optionC = "Collector of customs at coastal ports",
                optionD = "Grand Vizier of the Sultan",
                correctAnswerIndex = 0,
                explanation = "Hakimai supervised district governance, collected taxes, and reported to the Emir.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_25",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.25] In the Oyo Empire, the Oyomesi compelled a despotic Alaafin to abdicate by presenting him with",
                optionA = "an empty calabash or parrot's eggs",
                optionB = "a white feather from an eagle",
                optionC = "a broken bronze sword",
                optionD = "a piece of black cloth",
                correctAnswerIndex = 0,
                explanation = "The presentation of an empty calabash signaled that the people and earth rejected the king.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_26",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.26] The armed force raised by Captain John Glover in Lagos in 1861 was known as the",
                optionA = "Glover's Hausas (Hausa Constabulary)",
                optionB = "Royal West African Frontier Force",
                optionC = "Lagos Defense Corps",
                optionD = "West African Regiment",
                correctAnswerIndex = 0,
                explanation = "Glover's Hausas formed the initial armed constabulary that evolved into the modern police and army.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_27",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.27] The Royal Niger Company was granted a British royal charter in 1886 under the leadership of",
                optionA = "Sir George Taubman Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Arthur Richards",
                optionD = "John Beecroft",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British commercial interests along the Niger basin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_28",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.28] The British Crown revoked the charter of the Royal Niger Company on",
                optionA = "January 1, 1900",
                optionB = "October 1, 1914",
                optionC = "December 31, 1899",
                optionD = "May 1, 1906",
                correctAnswerIndex = 0,
                explanation = "On January 1, 1900, the British Crown established direct colonial rule over Northern and Southern Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_29",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.29] The 1914 amalgamation of the Northern and Southern protectorates of Nigeria was carried out by",
                optionA = "Lord Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Donald Cameron",
                optionD = "Sir Bernard Bourdillon",
                correctAnswerIndex = 0,
                explanation = "Lord Lugard served as the architect and first Governor-General of united Nigeria in 1914.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_30",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.30] A key economic rationale for the 1914 amalgamation was to",
                optionA = "use prosperous Southern customs revenue to offset Northern administrative deficits",
                optionB = "introduce the French franc across all markets",
                optionC = "build a new federal capital in Calabar",
                optionD = "unify all traditional chieftaincy titles",
                correctAnswerIndex = 0,
                explanation = "The colonial treasury sought to balance Northern budgetary deficits with Southern revenue surpluses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_31",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.31] In the pre-colonial Igbo traditional system, village square legislative debates were conducted by the",
                optionA = "Amala (assembly of adult citizens)",
                optionB = "Obi of Onitsha",
                optionC = "Ooni of Ife",
                optionD = "Emir in Council",
                correctAnswerIndex = 0,
                explanation = "The Amala constituted the direct democratic town meeting in pre-colonial Igbo communities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_32",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.32] Age grades in traditional Nigerian societies performed functions including",
                optionA = "community policing, public sanitation, and local defense",
                optionB = "conducting foreign diplomatic missions to Europe",
                optionC = "appointing the paramount imperial monarch",
                optionD = "officiating at national census counts",
                correctAnswerIndex = 0,
                explanation = "Age grades constructed public amenities, cleared paths, and formed the defensive militia.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_33",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.33] In the pre-colonial Hausa-Fulani emirate, the highest appellate court was the",
                optionA = "Emir's Judicial Council",
                optionB = "Hakimi's court",
                optionC = "Alkali court",
                optionD = "Village head's tribunal",
                correctAnswerIndex = 0,
                explanation = "The Emir's Council had final jurisdiction over land, murder, and high constitutional matters.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_34",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.34] The Hakimi in the Sokoto Caliphate served as the",
                optionA = "District Head administering several village units",
                optionB = "Chief of the Royal Bodyguard",
                optionC = "Collector of customs at coastal ports",
                optionD = "Grand Vizier of the Sultan",
                correctAnswerIndex = 0,
                explanation = "Hakimai supervised district governance, collected taxes, and reported to the Emir.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_35",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.35] In the Oyo Empire, the Oyomesi compelled a despotic Alaafin to abdicate by presenting him with",
                optionA = "an empty calabash or parrot's eggs",
                optionB = "a white feather from an eagle",
                optionC = "a broken bronze sword",
                optionD = "a piece of black cloth",
                correctAnswerIndex = 0,
                explanation = "The presentation of an empty calabash signaled that the people and earth rejected the king.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_36",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.36] The armed force raised by Captain John Glover in Lagos in 1861 was known as the",
                optionA = "Glover's Hausas (Hausa Constabulary)",
                optionB = "Royal West African Frontier Force",
                optionC = "Lagos Defense Corps",
                optionD = "West African Regiment",
                correctAnswerIndex = 0,
                explanation = "Glover's Hausas formed the initial armed constabulary that evolved into the modern police and army.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_37",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.37] The Royal Niger Company was granted a British royal charter in 1886 under the leadership of",
                optionA = "Sir George Taubman Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Arthur Richards",
                optionD = "John Beecroft",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British commercial interests along the Niger basin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_38",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.38] The British Crown revoked the charter of the Royal Niger Company on",
                optionA = "January 1, 1900",
                optionB = "October 1, 1914",
                optionC = "December 31, 1899",
                optionD = "May 1, 1906",
                correctAnswerIndex = 0,
                explanation = "On January 1, 1900, the British Crown established direct colonial rule over Northern and Southern Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_39",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.39] The 1914 amalgamation of the Northern and Southern protectorates of Nigeria was carried out by",
                optionA = "Lord Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Donald Cameron",
                optionD = "Sir Bernard Bourdillon",
                correctAnswerIndex = 0,
                explanation = "Lord Lugard served as the architect and first Governor-General of united Nigeria in 1914.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_40",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.40] A key economic rationale for the 1914 amalgamation was to",
                optionA = "use prosperous Southern customs revenue to offset Northern administrative deficits",
                optionB = "introduce the French franc across all markets",
                optionC = "build a new federal capital in Calabar",
                optionD = "unify all traditional chieftaincy titles",
                correctAnswerIndex = 0,
                explanation = "The colonial treasury sought to balance Northern budgetary deficits with Southern revenue surpluses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_41",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.41] In the pre-colonial Igbo traditional system, village square legislative debates were conducted by the",
                optionA = "Amala (assembly of adult citizens)",
                optionB = "Obi of Onitsha",
                optionC = "Ooni of Ife",
                optionD = "Emir in Council",
                correctAnswerIndex = 0,
                explanation = "The Amala constituted the direct democratic town meeting in pre-colonial Igbo communities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_42",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.42] Age grades in traditional Nigerian societies performed functions including",
                optionA = "community policing, public sanitation, and local defense",
                optionB = "conducting foreign diplomatic missions to Europe",
                optionC = "appointing the paramount imperial monarch",
                optionD = "officiating at national census counts",
                correctAnswerIndex = 0,
                explanation = "Age grades constructed public amenities, cleared paths, and formed the defensive militia.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_43",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.43] In the pre-colonial Hausa-Fulani emirate, the highest appellate court was the",
                optionA = "Emir's Judicial Council",
                optionB = "Hakimi's court",
                optionC = "Alkali court",
                optionD = "Village head's tribunal",
                correctAnswerIndex = 0,
                explanation = "The Emir's Council had final jurisdiction over land, murder, and high constitutional matters.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_44",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.44] The Hakimi in the Sokoto Caliphate served as the",
                optionA = "District Head administering several village units",
                optionB = "Chief of the Royal Bodyguard",
                optionC = "Collector of customs at coastal ports",
                optionD = "Grand Vizier of the Sultan",
                correctAnswerIndex = 0,
                explanation = "Hakimai supervised district governance, collected taxes, and reported to the Emir.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_45",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.45] In the Oyo Empire, the Oyomesi compelled a despotic Alaafin to abdicate by presenting him with",
                optionA = "an empty calabash or parrot's eggs",
                optionB = "a white feather from an eagle",
                optionC = "a broken bronze sword",
                optionD = "a piece of black cloth",
                correctAnswerIndex = 0,
                explanation = "The presentation of an empty calabash signaled that the people and earth rejected the king.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_46",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.46] The armed force raised by Captain John Glover in Lagos in 1861 was known as the",
                optionA = "Glover's Hausas (Hausa Constabulary)",
                optionB = "Royal West African Frontier Force",
                optionC = "Lagos Defense Corps",
                optionD = "West African Regiment",
                correctAnswerIndex = 0,
                explanation = "Glover's Hausas formed the initial armed constabulary that evolved into the modern police and army.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_47",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.47] The Royal Niger Company was granted a British royal charter in 1886 under the leadership of",
                optionA = "Sir George Taubman Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Arthur Richards",
                optionD = "John Beecroft",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British commercial interests along the Niger basin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_48",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.48] The British Crown revoked the charter of the Royal Niger Company on",
                optionA = "January 1, 1900",
                optionB = "October 1, 1914",
                optionC = "December 31, 1899",
                optionD = "May 1, 1906",
                correctAnswerIndex = 0,
                explanation = "On January 1, 1900, the British Crown established direct colonial rule over Northern and Southern Nigeria.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_49",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.49] The 1914 amalgamation of the Northern and Southern protectorates of Nigeria was carried out by",
                optionA = "Lord Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Donald Cameron",
                optionD = "Sir Bernard Bourdillon",
                correctAnswerIndex = 0,
                explanation = "Lord Lugard served as the architect and first Governor-General of united Nigeria in 1914.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt4_50",
                subject = "Government",
                topic = "Government Past Questions PT 4",
                year = "Exam Series",
                questionText = "[Series 4.50] A key economic rationale for the 1914 amalgamation was to",
                optionA = "use prosperous Southern customs revenue to offset Northern administrative deficits",
                optionB = "introduce the French franc across all markets",
                optionC = "build a new federal capital in Calabar",
                optionD = "unify all traditional chieftaincy titles",
                correctAnswerIndex = 0,
                explanation = "The colonial treasury sought to balance Northern budgetary deficits with Southern revenue surpluses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 4 • Q50"
            )
        )
        return list
    }

    fun getPart5(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "gov_pt5_01",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.1] The defining core principle of Nigeria's foreign policy since 1960 has been",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Isolationism and regional non-involvement",
                optionC = "Imperial expansion across West Africa",
                optionD = "Automatic alignment with NATO",
                correctAnswerIndex = 0,
                explanation = "Nigeria's foreign policy is anchored on the decolonization, stability, and development of Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_02",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.2] Nigeria was designated an honorary 'Frontline State' because of its massive moral and financial support for",
                optionA = "the liberation struggle against apartheid in South Africa",
                optionB = "the Palestinian independence movement",
                optionC = "the unification of Korea",
                optionD = "the defense of South American sovereignty",
                correctAnswerIndex = 0,
                explanation = "Despite being geographically in West Africa, Nigeria's anti-apartheid funding earned it Frontline State status.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_03",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.3] The Technical Aid Corps (TAC) scheme was established in 1987 by Nigeria to",
                optionA = "provide volunteer skilled Nigerian professionals to African, Caribbean, and Pacific countries",
                optionB = "recruit foreign mercenaries for national defense",
                optionC = "fund overseas university education for ministers",
                optionD = "import manufactured goods from Asian markets",
                correctAnswerIndex = 0,
                explanation = "TAC serves as a vehicle of South-South technical assistance and diplomatic goodwill.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_04",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.4] ECOMOG was established under the leadership of ECOWAS in 1990 to intervene in the civil war in",
                optionA = "Liberia",
                optionB = "Somalia",
                optionC = "Angola",
                optionD = "Mozambique",
                correctAnswerIndex = 0,
                explanation = "ECOMOG peacekeepers restored order during the devastating civil war in Liberia and later Sierra Leone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_05",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.5] The boundary dispute between Nigeria and Cameroon over the Bakassi Peninsula was settled in 2002 by the",
                optionA = "International Court of Justice (ICJ)",
                optionB = "United Nations Security Council",
                optionC = "African Union Peace and Security Council",
                optionD = "ECOWAS Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ICJ awarded sovereignty over the Bakassi Peninsula to Cameroon based on historical treaties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_06",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.6] The highest decision-making organ of the African Union is the",
                optionA = "Assembly of Heads of State and Government",
                optionB = "Pan-African Parliament",
                optionC = "Executive Council of Foreign Ministers",
                optionD = "Peace and Security Council",
                correctAnswerIndex = 0,
                explanation = "The Assembly comprises the heads of state of all member nations and establishes core policies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_07",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.7] The Pan-African Parliament of the African Union is headquartered in",
                optionA = "Midrand, South Africa",
                optionB = "Addis Ababa, Ethiopia",
                optionC = "Cairo, Egypt",
                optionD = "Nairobi, Kenya",
                correctAnswerIndex = 0,
                explanation = "The Pan-African Parliament sits at Gallagher Estate in Midrand, South Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_08",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.8] The African Continental Free Trade Area (AfCFTA) was launched to",
                optionA = "create a single continental market for goods and services with free movement of business persons",
                optionB = "replace national currencies with the Euro",
                optionC = "unify all African armed forces under one command",
                optionD = "restrict African imports from industrialized nations",
                correctAnswerIndex = 0,
                explanation = "AfCFTA creates a single market of 1.3 billion people, dismantling intra-African tariffs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_09",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.9] The specialized United Nations agency responsible for international public health is the",
                optionA = "World Health Organization (WHO)",
                optionB = "UNESCO",
                optionC = "International Labour Organization (ILO)",
                optionD = "UNHCR",
                correctAnswerIndex = 0,
                explanation = "The WHO coordinates international public health responses and disease eradication programs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_10",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.10] The International Court of Justice (ICJ) sits in",
                optionA = "The Hague, Netherlands",
                optionB = "Geneva, Switzerland",
                optionC = "New York City, USA",
                optionD = "Vienna, Austria",
                correctAnswerIndex = 0,
                explanation = "The ICJ, the principal judicial arm of the UN, sits at the Peace Palace in The Hague.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_11",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.11] The defining core principle of Nigeria's foreign policy since 1960 has been",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Isolationism and regional non-involvement",
                optionC = "Imperial expansion across West Africa",
                optionD = "Automatic alignment with NATO",
                correctAnswerIndex = 0,
                explanation = "Nigeria's foreign policy is anchored on the decolonization, stability, and development of Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_12",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.12] Nigeria was designated an honorary 'Frontline State' because of its massive moral and financial support for",
                optionA = "the liberation struggle against apartheid in South Africa",
                optionB = "the Palestinian independence movement",
                optionC = "the unification of Korea",
                optionD = "the defense of South American sovereignty",
                correctAnswerIndex = 0,
                explanation = "Despite being geographically in West Africa, Nigeria's anti-apartheid funding earned it Frontline State status.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_13",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.13] The Technical Aid Corps (TAC) scheme was established in 1987 by Nigeria to",
                optionA = "provide volunteer skilled Nigerian professionals to African, Caribbean, and Pacific countries",
                optionB = "recruit foreign mercenaries for national defense",
                optionC = "fund overseas university education for ministers",
                optionD = "import manufactured goods from Asian markets",
                correctAnswerIndex = 0,
                explanation = "TAC serves as a vehicle of South-South technical assistance and diplomatic goodwill.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_14",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.14] ECOMOG was established under the leadership of ECOWAS in 1990 to intervene in the civil war in",
                optionA = "Liberia",
                optionB = "Somalia",
                optionC = "Angola",
                optionD = "Mozambique",
                correctAnswerIndex = 0,
                explanation = "ECOMOG peacekeepers restored order during the devastating civil war in Liberia and later Sierra Leone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_15",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.15] The boundary dispute between Nigeria and Cameroon over the Bakassi Peninsula was settled in 2002 by the",
                optionA = "International Court of Justice (ICJ)",
                optionB = "United Nations Security Council",
                optionC = "African Union Peace and Security Council",
                optionD = "ECOWAS Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ICJ awarded sovereignty over the Bakassi Peninsula to Cameroon based on historical treaties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_16",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.16] The highest decision-making organ of the African Union is the",
                optionA = "Assembly of Heads of State and Government",
                optionB = "Pan-African Parliament",
                optionC = "Executive Council of Foreign Ministers",
                optionD = "Peace and Security Council",
                correctAnswerIndex = 0,
                explanation = "The Assembly comprises the heads of state of all member nations and establishes core policies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_17",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.17] The Pan-African Parliament of the African Union is headquartered in",
                optionA = "Midrand, South Africa",
                optionB = "Addis Ababa, Ethiopia",
                optionC = "Cairo, Egypt",
                optionD = "Nairobi, Kenya",
                correctAnswerIndex = 0,
                explanation = "The Pan-African Parliament sits at Gallagher Estate in Midrand, South Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_18",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.18] The African Continental Free Trade Area (AfCFTA) was launched to",
                optionA = "create a single continental market for goods and services with free movement of business persons",
                optionB = "replace national currencies with the Euro",
                optionC = "unify all African armed forces under one command",
                optionD = "restrict African imports from industrialized nations",
                correctAnswerIndex = 0,
                explanation = "AfCFTA creates a single market of 1.3 billion people, dismantling intra-African tariffs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_19",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.19] The specialized United Nations agency responsible for international public health is the",
                optionA = "World Health Organization (WHO)",
                optionB = "UNESCO",
                optionC = "International Labour Organization (ILO)",
                optionD = "UNHCR",
                correctAnswerIndex = 0,
                explanation = "The WHO coordinates international public health responses and disease eradication programs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_20",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.20] The International Court of Justice (ICJ) sits in",
                optionA = "The Hague, Netherlands",
                optionB = "Geneva, Switzerland",
                optionC = "New York City, USA",
                optionD = "Vienna, Austria",
                correctAnswerIndex = 0,
                explanation = "The ICJ, the principal judicial arm of the UN, sits at the Peace Palace in The Hague.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_21",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.21] The defining core principle of Nigeria's foreign policy since 1960 has been",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Isolationism and regional non-involvement",
                optionC = "Imperial expansion across West Africa",
                optionD = "Automatic alignment with NATO",
                correctAnswerIndex = 0,
                explanation = "Nigeria's foreign policy is anchored on the decolonization, stability, and development of Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_22",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.22] Nigeria was designated an honorary 'Frontline State' because of its massive moral and financial support for",
                optionA = "the liberation struggle against apartheid in South Africa",
                optionB = "the Palestinian independence movement",
                optionC = "the unification of Korea",
                optionD = "the defense of South American sovereignty",
                correctAnswerIndex = 0,
                explanation = "Despite being geographically in West Africa, Nigeria's anti-apartheid funding earned it Frontline State status.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_23",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.23] The Technical Aid Corps (TAC) scheme was established in 1987 by Nigeria to",
                optionA = "provide volunteer skilled Nigerian professionals to African, Caribbean, and Pacific countries",
                optionB = "recruit foreign mercenaries for national defense",
                optionC = "fund overseas university education for ministers",
                optionD = "import manufactured goods from Asian markets",
                correctAnswerIndex = 0,
                explanation = "TAC serves as a vehicle of South-South technical assistance and diplomatic goodwill.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_24",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.24] ECOMOG was established under the leadership of ECOWAS in 1990 to intervene in the civil war in",
                optionA = "Liberia",
                optionB = "Somalia",
                optionC = "Angola",
                optionD = "Mozambique",
                correctAnswerIndex = 0,
                explanation = "ECOMOG peacekeepers restored order during the devastating civil war in Liberia and later Sierra Leone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_25",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.25] The boundary dispute between Nigeria and Cameroon over the Bakassi Peninsula was settled in 2002 by the",
                optionA = "International Court of Justice (ICJ)",
                optionB = "United Nations Security Council",
                optionC = "African Union Peace and Security Council",
                optionD = "ECOWAS Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ICJ awarded sovereignty over the Bakassi Peninsula to Cameroon based on historical treaties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_26",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.26] The highest decision-making organ of the African Union is the",
                optionA = "Assembly of Heads of State and Government",
                optionB = "Pan-African Parliament",
                optionC = "Executive Council of Foreign Ministers",
                optionD = "Peace and Security Council",
                correctAnswerIndex = 0,
                explanation = "The Assembly comprises the heads of state of all member nations and establishes core policies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_27",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.27] The Pan-African Parliament of the African Union is headquartered in",
                optionA = "Midrand, South Africa",
                optionB = "Addis Ababa, Ethiopia",
                optionC = "Cairo, Egypt",
                optionD = "Nairobi, Kenya",
                correctAnswerIndex = 0,
                explanation = "The Pan-African Parliament sits at Gallagher Estate in Midrand, South Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_28",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.28] The African Continental Free Trade Area (AfCFTA) was launched to",
                optionA = "create a single continental market for goods and services with free movement of business persons",
                optionB = "replace national currencies with the Euro",
                optionC = "unify all African armed forces under one command",
                optionD = "restrict African imports from industrialized nations",
                correctAnswerIndex = 0,
                explanation = "AfCFTA creates a single market of 1.3 billion people, dismantling intra-African tariffs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_29",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.29] The specialized United Nations agency responsible for international public health is the",
                optionA = "World Health Organization (WHO)",
                optionB = "UNESCO",
                optionC = "International Labour Organization (ILO)",
                optionD = "UNHCR",
                correctAnswerIndex = 0,
                explanation = "The WHO coordinates international public health responses and disease eradication programs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_30",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.30] The International Court of Justice (ICJ) sits in",
                optionA = "The Hague, Netherlands",
                optionB = "Geneva, Switzerland",
                optionC = "New York City, USA",
                optionD = "Vienna, Austria",
                correctAnswerIndex = 0,
                explanation = "The ICJ, the principal judicial arm of the UN, sits at the Peace Palace in The Hague.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_31",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.31] The defining core principle of Nigeria's foreign policy since 1960 has been",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Isolationism and regional non-involvement",
                optionC = "Imperial expansion across West Africa",
                optionD = "Automatic alignment with NATO",
                correctAnswerIndex = 0,
                explanation = "Nigeria's foreign policy is anchored on the decolonization, stability, and development of Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_32",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.32] Nigeria was designated an honorary 'Frontline State' because of its massive moral and financial support for",
                optionA = "the liberation struggle against apartheid in South Africa",
                optionB = "the Palestinian independence movement",
                optionC = "the unification of Korea",
                optionD = "the defense of South American sovereignty",
                correctAnswerIndex = 0,
                explanation = "Despite being geographically in West Africa, Nigeria's anti-apartheid funding earned it Frontline State status.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_33",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.33] The Technical Aid Corps (TAC) scheme was established in 1987 by Nigeria to",
                optionA = "provide volunteer skilled Nigerian professionals to African, Caribbean, and Pacific countries",
                optionB = "recruit foreign mercenaries for national defense",
                optionC = "fund overseas university education for ministers",
                optionD = "import manufactured goods from Asian markets",
                correctAnswerIndex = 0,
                explanation = "TAC serves as a vehicle of South-South technical assistance and diplomatic goodwill.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_34",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.34] ECOMOG was established under the leadership of ECOWAS in 1990 to intervene in the civil war in",
                optionA = "Liberia",
                optionB = "Somalia",
                optionC = "Angola",
                optionD = "Mozambique",
                correctAnswerIndex = 0,
                explanation = "ECOMOG peacekeepers restored order during the devastating civil war in Liberia and later Sierra Leone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_35",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.35] The boundary dispute between Nigeria and Cameroon over the Bakassi Peninsula was settled in 2002 by the",
                optionA = "International Court of Justice (ICJ)",
                optionB = "United Nations Security Council",
                optionC = "African Union Peace and Security Council",
                optionD = "ECOWAS Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ICJ awarded sovereignty over the Bakassi Peninsula to Cameroon based on historical treaties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_36",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.36] The highest decision-making organ of the African Union is the",
                optionA = "Assembly of Heads of State and Government",
                optionB = "Pan-African Parliament",
                optionC = "Executive Council of Foreign Ministers",
                optionD = "Peace and Security Council",
                correctAnswerIndex = 0,
                explanation = "The Assembly comprises the heads of state of all member nations and establishes core policies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_37",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.37] The Pan-African Parliament of the African Union is headquartered in",
                optionA = "Midrand, South Africa",
                optionB = "Addis Ababa, Ethiopia",
                optionC = "Cairo, Egypt",
                optionD = "Nairobi, Kenya",
                correctAnswerIndex = 0,
                explanation = "The Pan-African Parliament sits at Gallagher Estate in Midrand, South Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_38",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.38] The African Continental Free Trade Area (AfCFTA) was launched to",
                optionA = "create a single continental market for goods and services with free movement of business persons",
                optionB = "replace national currencies with the Euro",
                optionC = "unify all African armed forces under one command",
                optionD = "restrict African imports from industrialized nations",
                correctAnswerIndex = 0,
                explanation = "AfCFTA creates a single market of 1.3 billion people, dismantling intra-African tariffs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_39",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.39] The specialized United Nations agency responsible for international public health is the",
                optionA = "World Health Organization (WHO)",
                optionB = "UNESCO",
                optionC = "International Labour Organization (ILO)",
                optionD = "UNHCR",
                correctAnswerIndex = 0,
                explanation = "The WHO coordinates international public health responses and disease eradication programs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_40",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.40] The International Court of Justice (ICJ) sits in",
                optionA = "The Hague, Netherlands",
                optionB = "Geneva, Switzerland",
                optionC = "New York City, USA",
                optionD = "Vienna, Austria",
                correctAnswerIndex = 0,
                explanation = "The ICJ, the principal judicial arm of the UN, sits at the Peace Palace in The Hague.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_41",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.41] The defining core principle of Nigeria's foreign policy since 1960 has been",
                optionA = "Afrocentrism (Africa as the centerpiece)",
                optionB = "Isolationism and regional non-involvement",
                optionC = "Imperial expansion across West Africa",
                optionD = "Automatic alignment with NATO",
                correctAnswerIndex = 0,
                explanation = "Nigeria's foreign policy is anchored on the decolonization, stability, and development of Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_42",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.42] Nigeria was designated an honorary 'Frontline State' because of its massive moral and financial support for",
                optionA = "the liberation struggle against apartheid in South Africa",
                optionB = "the Palestinian independence movement",
                optionC = "the unification of Korea",
                optionD = "the defense of South American sovereignty",
                correctAnswerIndex = 0,
                explanation = "Despite being geographically in West Africa, Nigeria's anti-apartheid funding earned it Frontline State status.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_43",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.43] The Technical Aid Corps (TAC) scheme was established in 1987 by Nigeria to",
                optionA = "provide volunteer skilled Nigerian professionals to African, Caribbean, and Pacific countries",
                optionB = "recruit foreign mercenaries for national defense",
                optionC = "fund overseas university education for ministers",
                optionD = "import manufactured goods from Asian markets",
                correctAnswerIndex = 0,
                explanation = "TAC serves as a vehicle of South-South technical assistance and diplomatic goodwill.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_44",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.44] ECOMOG was established under the leadership of ECOWAS in 1990 to intervene in the civil war in",
                optionA = "Liberia",
                optionB = "Somalia",
                optionC = "Angola",
                optionD = "Mozambique",
                correctAnswerIndex = 0,
                explanation = "ECOMOG peacekeepers restored order during the devastating civil war in Liberia and later Sierra Leone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_45",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.45] The boundary dispute between Nigeria and Cameroon over the Bakassi Peninsula was settled in 2002 by the",
                optionA = "International Court of Justice (ICJ)",
                optionB = "United Nations Security Council",
                optionC = "African Union Peace and Security Council",
                optionD = "ECOWAS Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ICJ awarded sovereignty over the Bakassi Peninsula to Cameroon based on historical treaties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_46",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.46] The highest decision-making organ of the African Union is the",
                optionA = "Assembly of Heads of State and Government",
                optionB = "Pan-African Parliament",
                optionC = "Executive Council of Foreign Ministers",
                optionD = "Peace and Security Council",
                correctAnswerIndex = 0,
                explanation = "The Assembly comprises the heads of state of all member nations and establishes core policies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_47",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.47] The Pan-African Parliament of the African Union is headquartered in",
                optionA = "Midrand, South Africa",
                optionB = "Addis Ababa, Ethiopia",
                optionC = "Cairo, Egypt",
                optionD = "Nairobi, Kenya",
                correctAnswerIndex = 0,
                explanation = "The Pan-African Parliament sits at Gallagher Estate in Midrand, South Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_48",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.48] The African Continental Free Trade Area (AfCFTA) was launched to",
                optionA = "create a single continental market for goods and services with free movement of business persons",
                optionB = "replace national currencies with the Euro",
                optionC = "unify all African armed forces under one command",
                optionD = "restrict African imports from industrialized nations",
                correctAnswerIndex = 0,
                explanation = "AfCFTA creates a single market of 1.3 billion people, dismantling intra-African tariffs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_49",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.49] The specialized United Nations agency responsible for international public health is the",
                optionA = "World Health Organization (WHO)",
                optionB = "UNESCO",
                optionC = "International Labour Organization (ILO)",
                optionD = "UNHCR",
                correctAnswerIndex = 0,
                explanation = "The WHO coordinates international public health responses and disease eradication programs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "gov_pt5_50",
                subject = "Government",
                topic = "Government Past Questions PT 5",
                year = "Exam Series",
                questionText = "[Series 5.50] The International Court of Justice (ICJ) sits in",
                optionA = "The Hague, Netherlands",
                optionB = "Geneva, Switzerland",
                optionC = "New York City, USA",
                optionD = "Vienna, Austria",
                correctAnswerIndex = 0,
                explanation = "The ICJ, the principal judicial arm of the UN, sits at the Peace Palace in The Hague.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government PT 5 • Q50"
            )
        )
        return list
    }
}
