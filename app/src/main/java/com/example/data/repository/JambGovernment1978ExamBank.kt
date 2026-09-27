package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Government 1978 Past Questions & Answers Bank
 * Transcribed with 100% source fidelity from verified official JAMB past exam papers (dyplus edition).
 * Contains 50 questions covering constitutional development, organs of government, political concepts, and African politics.
 */
object JambGovernment1978ExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_01",
                subject = "Government",
                topic = "Constitutional Development",
                year = "1978",
                questionText = "When did Nigeria gain her Independence?",
                optionA = "1st October 1963",
                optionB = "31st October 1690",
                optionC = "1st October 2012",
                optionD = "1st October 1960",
                correctAnswerIndex = 3,
                explanation = "Nigeria gained full sovereign independence from Great Britain on October 1, 1960.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_02",
                subject = "Government",
                topic = "Basic Concepts of Government",
                year = "1978",
                questionText = "Democracy means a system of government in which",
                optionA = "the majority rules",
                optionB = "the minority rules",
                optionC = "there is no party system",
                optionD = "the people rule",
                correctAnswerIndex = 0,
                explanation = "Democracy is classically defined as government by the people, primarily exercised through majority rule and democratic representation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_03",
                subject = "Government",
                topic = "Federalism",
                year = "1978",
                questionText = "A constitution is federal if",
                optionA = "it provides for a presidential system",
                optionB = "it is unwritten",
                optionC = "the central and component units are equal",
                optionD = "there is a division of powers between a central and component authorities",
                correctAnswerIndex = 3,
                explanation = "Federalism is defined by constitutional division and distribution of powers between a central national government and coordinate regional/state component units.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_04",
                subject = "Government",
                topic = "Organs of Government",
                year = "1978",
                questionText = "The Executive is",
                optionA = "a committee of the legislature",
                optionB = "the body that makes laws",
                optionC = "the body that executes the policies of government",
                optionD = "the highest organ of government",
                correctAnswerIndex = 2,
                explanation = "The executive branch is responsible for implementing, administering, and enforcing the laws and policies of government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_05",
                subject = "Government",
                topic = "The Judiciary",
                year = "1978",
                questionText = "The Judiciary is",
                optionA = "an arm of the Executive",
                optionB = "the body which makes the law",
                optionC = "a body of lawyers",
                optionD = "the body which interprets the law",
                correctAnswerIndex = 3,
                explanation = "The judiciary functions as the adjudicative organ that interprets the laws and constitution and applies them to disputes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_06",
                subject = "Government",
                topic = "Separation of Powers",
                year = "1978",
                questionText = "The separation of powers means the same as",
                optionA = "a presidential system of government",
                optionB = "checks and balances",
                optionC = "the rule of law",
                optionD = "supremacy of the judiciary",
                correctAnswerIndex = 1,
                explanation = "The doctrine of separation of powers, championed by Montesquieu, divides governmental authority into distinct branches operating with institutional checks and balances.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_07",
                subject = "Government",
                topic = "Citizenship and Rights",
                year = "1978",
                questionText = "Rights are",
                optionA = "claims which the law allows",
                optionB = "claims against the state",
                optionC = "claims against other individuals",
                optionD = "claims which are natural to men",
                correctAnswerIndex = 0,
                explanation = "Fundamental rights are legally recognized and enforceable claims and entitlements that citizens possess under the constitution and laws.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_08",
                subject = "Government",
                topic = "Pressure Groups",
                year = "1978",
                questionText = "Pressure groups are",
                optionA = "Organization which wants to overthrow the government",
                optionB = "organizations which seek to influence the policies of the government",
                optionC = "associations of people who share the same ideology",
                optionD = "political parties",
                correctAnswerIndex = 1,
                explanation = "Pressure groups (interest groups) are organized associations seeking to influence government decisions, legislation, and policies without seeking political office.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_09",
                subject = "Government",
                topic = "Systems of Government",
                year = "1978",
                questionText = "A cabinet system of government is practiced in",
                optionA = "the USSR",
                optionB = "the USA",
                optionC = "the People's Republic of China",
                optionD = "the United Kingdom",
                correctAnswerIndex = 3,
                explanation = "The United Kingdom is the classical model of the Westminster parliamentary cabinet system, where executive power is held by a cabinet headed by the Prime Minister.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_10",
                subject = "Government",
                topic = "Citizenship",
                year = "1978",
                questionText = "The citizen's obligations are",
                optionA = "what the government orders",
                optionB = "duties the individual imposes on himself",
                optionC = "what the law requires of the individual",
                optionD = "what the military decrees",
                correctAnswerIndex = 2,
                explanation = "Civic obligations represent mandatory legal and constitutional duties required of individuals, such as tax payment, law compliance, and national defense.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_11",
                subject = "Government",
                topic = "Elections",
                year = "1978",
                questionText = "An electoral system is the system which governs",
                optionA = "the appointment of the Pope elections",
                optionB = "how people vote",
                optionC = "the conduct of elections",
                optionD = "the appointment of cabinet ministers",
                correctAnswerIndex = 2,
                explanation = "An electoral system comprises the institutional rules, regulations, and procedures governing the conduct of democratic elections and conversion of votes into seats.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_12",
                subject = "Government",
                topic = "Constitutions",
                year = "1978",
                questionText = "An unwritten constitution is one which",
                optionA = "is not subject to judicial review",
                optionB = "is only partially written",
                optionC = "is not written at all",
                optionD = "is made up solely of conventions",
                correctAnswerIndex = 1,
                explanation = "An unwritten constitution (such as that of Great Britain) is not codified into a single organic document, but consists of written statutes, judicial precedents, and unwritten conventions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_13",
                subject = "Government",
                topic = "Legislation",
                year = "1978",
                questionText = "Delegated legislation is legislation",
                optionA = "which is not submitted to parliament",
                optionB = "made by judicial tribunals",
                optionC = "made by a minister acting an Act of Parliament",
                optionD = "made by local government",
                correctAnswerIndex = 2,
                explanation = "Delegated (subordinate) legislation is statutory instruments, orders, and regulations enacted by ministers, departments, or administrative bodies under statutory authority granted by parliament.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_14",
                subject = "Government",
                topic = "Pre-colonial Administration",
                year = "1978",
                questionText = "Before colonial rule, Yoruba traditional rulers were appointed by",
                optionA = "the people acting through their representatives",
                optionB = "the Ogboni",
                optionC = "Ifa (oracle) priests",
                optionD = "Kingmakers",
                correctAnswerIndex = 3,
                explanation = "In traditional Yoruba monarchies (such as the Oyo Empire), the Oyomesi (council of kingmakers) selected and appointed the Oba from eligible royal lineages.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_15",
                subject = "Government",
                topic = "Political Parties",
                year = "1978",
                questionText = "The first political party properly so-called was formed in Nigeria in",
                optionA = "1916",
                optionB = "1923",
                optionC = "1944",
                optionD = "1948",
                correctAnswerIndex = 1,
                explanation = "The Nigerian National Democratic Party (NNDP), founded by Herbert Macaulay in 1923 following the Clifford Constitution, was Nigeria's first political party.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_16",
                subject = "Government",
                topic = "Colonial Administration",
                year = "1978",
                questionText = "The Loi Cadre, a major factor in the constitutional development of the French colonial territories, was introduced in",
                optionA = "1940",
                optionB = "1946",
                optionC = "1950",
                optionD = "1956",
                correctAnswerIndex = 3,
                explanation = "The French Loi Cadre (Enabling Act) of 1956 instituted universal adult suffrage and created semi-autonomous territorial assemblies in French West and Equatorial Africa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_17",
                subject = "Government",
                topic = "West African Nationalism",
                year = "1978",
                questionText = "The Coussey Commission Report laid the groundwork for the eventual independence of",
                optionA = "Gambia",
                optionB = "Gold Coast (Ghana)",
                optionC = "Sierra Leone",
                optionD = "Liberia",
                correctAnswerIndex = 1,
                explanation = "The 1949 Coussey Committee Report in the Gold Coast (Ghana) recommended comprehensive constitutional reforms that led to internal self-government and independence under Kwame Nkrumah.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_18",
                subject = "Government",
                topic = "Constitutional Development",
                year = "1978",
                questionText = "The (former) Western Region of Nigeria became internally self-governing in",
                optionA = "1955",
                optionB = "1957",
                optionC = "1958",
                optionD = "1956",
                correctAnswerIndex = 1,
                explanation = "The Western and Eastern Regions achieved internal self-government in 1957, followed by the Northern Region in 1959.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_19",
                subject = "Government",
                topic = "Pan-Africanism",
                year = "1978",
                questionText = "The first Pan African conference was held in",
                optionA = "Paris",
                optionB = "Brussels",
                optionC = "London",
                optionD = "New York",
                correctAnswerIndex = 2,
                explanation = "The first Pan-African Conference was convened in London in July 1900, organized by Henry Sylvester Williams.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_20",
                subject = "Government",
                topic = "Public Administration",
                year = "1978",
                questionText = "The Public Service Commission (Nigeria) is responsible for the appointment of all",
                optionA = "judges of the High Court",
                optionB = "officials of public corporations",
                optionC = "civil servants",
                optionD = "military personnel",
                correctAnswerIndex = 2,
                explanation = "The Civil Service / Public Service Commission is the constitutional body mandated to recruit, promote, and discipline civil servants in ministries and government departments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_21",
                subject = "Government",
                topic = "Judiciary",
                year = "1978",
                questionText = "Constitutional cases in Nigeria can only be raised in the first instance in",
                optionA = "the Supreme Court",
                optionB = "the High Courts",
                optionC = "the Courts of Appeal",
                optionD = "the Sharia Court of Appeal",
                correctAnswerIndex = 1,
                explanation = "Original jurisdiction for constitutional rights enforcement and initial constitutional challenges lies with the High Courts (Federal or State).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_22",
                subject = "Government",
                topic = "Military Rule",
                year = "1978",
                questionText = "Which of the following would act for the Head of state when he is out of the country?",
                optionA = "the Chief Justice of the Supreme Court",
                optionB = "the Chief of Staff, Army",
                optionC = "the Chief of Staff, Supreme Military Headquarters",
                optionD = "the Chief of Staff, Air Force",
                correctAnswerIndex = 2,
                explanation = "Under Nigerian military regimes (e.g. 1975–1979), the Chief of Staff, Supreme Military Headquarters was the second-in-command and acting head.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_23",
                subject = "Government",
                topic = "Local Government",
                year = "1978",
                questionText = "To raise funds, local governments can levy",
                optionA = "import duties",
                optionB = "income taxes",
                optionC = "rates",
                optionD = "profits tax",
                correctAnswerIndex = 2,
                explanation = "Local governments possess statutory authority to levy tenement rates, market fees, and local community dues.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_24",
                subject = "Government",
                topic = "International Organizations",
                year = "1978",
                questionText = "The Economic Commission for Africa is an agency of",
                optionA = "the OAU",
                optionB = "the Commonwealth",
                optionC = "the United Nations",
                optionD = "the African Development Bank",
                correctAnswerIndex = 2,
                explanation = "The United Nations Economic Commission for Africa (UNECA) is one of the UN's five regional commissions, established in 1958.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_25",
                subject = "Government",
                topic = "Foreign Policy",
                year = "1978",
                questionText = "Nigeria is not a member of",
                optionA = "the OAU",
                optionB = "the Security Council of the UN",
                optionC = "the African Development Bank",
                optionD = "the OCAM",
                correctAnswerIndex = 3,
                explanation = "OCAM (Organisation Commune Africaine et Malgache) was an organization composed almost exclusively of francophone African states; Nigeria was never a member.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_26",
                subject = "Government",
                topic = "Political Parties",
                year = "1978",
                questionText = "The primary function of political parties is to",
                optionA = "oppose the government",
                optionB = "Aggregate interest and contest power",
                optionC = "mobilize public opinion",
                optionD = "provide welfare for their member",
                correctAnswerIndex = 1,
                explanation = "Political parties aggregate societal interests, articulate policy alternatives, and contest elections to gain control of government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_27",
                subject = "Government",
                topic = "OAU and African Unity",
                year = "1978",
                questionText = "The OAU was formed in",
                optionA = "1946",
                optionB = "1956",
                optionC = "1960",
                optionD = "1963",
                correctAnswerIndex = 3,
                explanation = "The Organization of African Unity (OAU) was founded on May 25, 1963, in Addis Ababa, Ethiopia.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_28",
                subject = "Government",
                topic = "Local Government Reforms",
                year = "1978",
                questionText = "All members of the newly constituted local government councils in Nigeria were",
                optionA = "Directly elected",
                optionB = "indirectly elected",
                optionC = "appointed by the State Governors",
                optionD = "appointed by the Head of State",
                correctAnswerIndex = 0,
                explanation = "The 1976 Local Government Reforms introduced representative democratic local government with directly elected councillors across Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_29",
                subject = "Government",
                topic = "Electoral Process",
                year = "1978",
                questionText = "Which of the following is true as a major function of elections?",
                optionA = "Elections serve the purpose of recruitment of the leaders to office in a modern state",
                optionB = "the elections give the people a chance to eliminate opponents who are in office",
                optionC = "they are means of testing the popularity of politicians",
                optionD = "politicians use elections as tools to deceive the populace",
                correctAnswerIndex = 0,
                explanation = "The primary institutional function of democratic elections is the legitimate recruitment and peaceful selection of political leaders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_30",
                subject = "Government",
                topic = "Colonial Administration",
                year = "1978",
                questionText = "The first Governor General of Nigeria was",
                optionA = "Lord Lugard",
                optionB = "Dr Nnamdi Azikiwe",
                optionC = "Sir James Robertson",
                optionD = "Major General Aguiyi Ironsi",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard became the first Governor-General of amalgamated Nigeria in 1914.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_31",
                subject = "Government",
                topic = "OAU",
                year = "1978",
                questionText = "The supreme policy-making organ in the Organization of African Unity is",
                optionA = "the Council of ministers",
                optionB = "the Assembly of Heads of State and Government",
                optionC = "the general secretariat",
                optionD = "the specialized commissions",
                correctAnswerIndex = 1,
                explanation = "The Assembly of Heads of State and Government was the supreme organ and highest decision-making authority of the OAU.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_32",
                subject = "Government",
                topic = "United Nations",
                year = "1978",
                questionText = "In which of these organs of the United Nations Organization is veto power exercised by some countries?",
                optionA = "the world health organization",
                optionB = "the security council",
                optionC = "the general assembly",
                optionD = "the international court of justice",
                correctAnswerIndex = 1,
                explanation = "The five permanent members of the UN Security Council (P5: US, UK, France, Russia, China) hold individual veto power on substantive resolutions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_33",
                subject = "Government",
                topic = "Federalism",
                year = "1978",
                questionText = "In a federal system such as Nigeria the local governments are directly responsible",
                optionA = "to the federal or central government",
                optionB = "to the state government",
                optionC = "to no other level of government",
                optionD = "to the federal and state governments",
                correctAnswerIndex = 1,
                explanation = "In the Nigerian federation, local governments operate within the constitutional administrative framework and oversight of their respective state governments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_34",
                subject = "Government",
                topic = "Constitutional History",
                year = "1978",
                questionText = "The 1946 constitutions in Nigeria and the Gold Coast (Ghana) were the results of",
                optionA = "pressures from nationalists within the colonies",
                optionB = "pressures by united states of America",
                optionC = "pressures from the British government",
                optionD = "pressures from within and from outside these colonies",
                correctAnswerIndex = 3,
                explanation = "The post-WWII Richards Constitution (Nigeria) and Burns Constitution (Gold Coast) resulted from internal nationalist agitation and external global decolonization pressures.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_35",
                subject = "Government",
                topic = "The Judiciary",
                year = "1978",
                questionText = "If the rights of the individual are violated or threatened, where can he go for redress?",
                optionA = "the Executive branch of government",
                optionB = "the Legislative branch of government",
                optionC = "the Local government council",
                optionD = "the Judicial branch of government",
                correctAnswerIndex = 3,
                explanation = "The judiciary serves as the ultimate bastion and constitutional guardian of fundamental human rights, granting judicial review, injunctions, and habeas corpus.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_36",
                subject = "Government",
                topic = "Systems of Government",
                year = "1978",
                questionText = "In the Presidential system of government the president is elected to office by",
                optionA = "the cabinet",
                optionB = "the parliament or legislature",
                optionC = "the military",
                optionD = "the people through direct elections",
                correctAnswerIndex = 3,
                explanation = "In a presidential democracy, the executive president derives democratic legitimacy directly from nationwide popular election by the electorate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_37",
                subject = "Government",
                topic = "Military in Politics",
                year = "1978",
                questionText = "The military take over powers from politicians in West African countries",
                optionA = "when politician have become corrupt and reckless in power",
                optionB = "when there is a breakdown of law and order in the country",
                optionC = "for reasons touching on corporate interest of military",
                optionD = "all of the above",
                correctAnswerIndex = 3,
                explanation = "Military interventions in West Africa historically stem from combinations of political corruption, civilian breakdown of order, and military institutional self-interest.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_38",
                subject = "Government",
                topic = "Public Corporations",
                year = "1978",
                questionText = "By establishing public corporations, governments are trying to",
                optionA = "eliminate private enterprises",
                optionB = "compete with private enterprise",
                optionC = "render crucial services to the public in areas which the civil service cannot effectively handle",
                optionD = "make quick profit at the expense of the people",
                correctAnswerIndex = 2,
                explanation = "Statutory public corporations provide vital public infrastructure, utilities, and commercial amenities with commercial flexibility beyond the bureaucratic civil service.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_39",
                subject = "Government",
                topic = "Constitutional Law",
                year = "1978",
                questionText = "The constitution of any given country must provide for",
                optionA = "the distribution of powers",
                optionB = "the rights and duties of the individual",
                optionC = "the rule of law",
                optionD = "the distribution of powers, rights and duties, and rule of law",
                correctAnswerIndex = 3,
                explanation = "A complete constitutional framework provides for institutional distribution of powers, citizen rights and obligations, and the supremacy of the rule of law.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_40",
                subject = "Government",
                topic = "Pressure Groups",
                year = "1978",
                questionText = "In a modern state, pressure Groups find that the most effective way of achieving their purposes is by",
                optionA = "causing trouble among the populace",
                optionB = "influencing decisions of government",
                optionC = "forming political parties",
                optionD = "rigging elections to offices of the state",
                correctAnswerIndex = 1,
                explanation = "Pressure groups achieve their objectives primarily through lobbying, advocacy, and strategic influence on executive and legislative decision-makers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_41",
                subject = "Government",
                topic = "Nationalist Movement",
                year = "1978",
                questionText = "Which of the following would you consider the most famous among the leaders of nationalist movement in Nigeria?",
                optionA = "Kwame Nkrumah",
                optionB = "General Olusegun Obasanjo",
                optionC = "Herbert Macaulay",
                optionD = "Anthony Enahoro",
                correctAnswerIndex = 2,
                explanation = "Herbert Macaulay is revered as the Father of Nigerian Nationalism, founding the NNDP in 1923 and co-founding the NCNC in 1944.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_42",
                subject = "Government",
                topic = "Cabinet System",
                year = "1978",
                questionText = "The idea of collective responsibility in the Executive branch of government means that",
                optionA = "no single member of the executive can take any responsible decision",
                optionB = "a member of the executive has no way out of decisions made",
                optionC = "a member of the executive cannot publicly criticize decisions collectively made without first resigning",
                optionD = "responsibility within the executive is not unilateral",
                correctAnswerIndex = 2,
                explanation = "Under cabinet collective responsibility, all cabinet ministers must publicly support cabinet decisions or resign their ministerial appointment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_43",
                subject = "Government",
                topic = "Colonial Administration",
                year = "1978",
                questionText = "Indirect Rule as practised by the British in their West African colonies",
                optionA = "did not attempt to reform existing traditional institutions",
                optionB = "was over glorified and expedient nonsense",
                optionC = "satisfied neither the rulers nor the ruled",
                optionD = "meant ruling through existing rulers and attempting to check excesses",
                correctAnswerIndex = 3,
                explanation = "Lord Lugard's system of Indirect Rule governed the native population through their traditional indigenous rulers and institutional frameworks subject to British supervision.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_44",
                subject = "Government",
                topic = "Colonial Policies",
                year = "1978",
                questionText = "The French idea of assimilation as applied in their colonies",
                optionA = "was to make Frenchmen out of African subjects",
                optionB = "would have produced more Frenchmen in colonies than in France",
                optionC = "recognized real value in traditional African culture",
                optionD = "produced nothing but African puppets in the colonies",
                correctAnswerIndex = 0,
                explanation = "The French policy of assimilation aimed to culturally, socially, and legally transform African colonial subjects into French citizens (assimilés).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_45",
                subject = "Government",
                topic = "African Politics",
                year = "1978",
                questionText = "The most remarkable thing about post-independence political development in the Gambia is",
                optionA = "that the country has been swallowed up by Senegal",
                optionB = "the relatively untarnished reputation of Sir Dauda Jawara",
                optionC = "that without reliance on overwhelming force, the government remained in power and tolerated opposition",
                optionD = "the uniquely robust economy established",
                correctAnswerIndex = 2,
                explanation = "Under Sir Dawda Jawara, post-independence Gambia maintained continuous multi-party democracy and civilian governance without a standing army for decades.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_46",
                subject = "Government",
                topic = "OAU",
                year = "1978",
                questionText = "The dominant idea behind the establishment of the Organization of African Unity is",
                optionA = "that Africa must unite",
                optionB = "to show the world that Africa can compete with others",
                optionC = "to provide a framework and opportunities for co-operation on common African problems",
                optionD = "to promote economic development of Africa",
                correctAnswerIndex = 2,
                explanation = "The OAU was formed to promote solidarity, coordinate interstate cooperation, defend sovereignty, and eradicate all forms of colonialism in Africa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_47",
                subject = "Government",
                topic = "Local Government Reforms",
                year = "1978",
                questionText = "The new local government reforms in Nigeria (1976)",
                optionA = "seek to establish uniformity in type, purpose and functions of local authorities",
                optionB = "make traditional rulers more powerful than ever before",
                optionC = "are a waste of time and federal money",
                optionD = "promote diversity in local government structures",
                correctAnswerIndex = 0,
                explanation = "The landmark 1976 Local Government Reform created a standardized single-tier structure of local government across all states in Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_48",
                subject = "Government",
                topic = "Franchise and Elections",
                year = "1978",
                questionText = "The principle of universal adult suffrage refers to",
                optionA = "the right of all adult people to vote",
                optionB = "the structure of political parties",
                optionC = "the legal nature of a constitution",
                optionD = "the right to free speech",
                correctAnswerIndex = 0,
                explanation = "Universal adult suffrage guarantees that all adult citizens, regardless of wealth, gender, or social status, have the constitutional right to vote.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_49",
                subject = "Government",
                topic = "Electoral Process",
                year = "1978",
                questionText = "A constituency is",
                optionA = "an area or district in which the inhabitants can send a representative to parliament",
                optionB = "the same as a legislature",
                optionC = "part of the campaign process",
                optionD = "an important part of every monarchy",
                correctAnswerIndex = 0,
                explanation = "A constituency (electoral district) is a defined geographical area whose registered voters elect a member to the legislative assembly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_1978_50",
                subject = "Government",
                topic = "ECOWAS and Regional Integration",
                year = "1978",
                questionText = "The treaty establishing the Economic Community of West African States (ECOWAS) was",
                optionA = "concluded in Lomé (Togo) in December 1976",
                optionB = "designed as the main pillar of an African common market",
                optionC = "the brainchild of Togo and Ghana",
                optionD = "signed in Lagos in May 1975 to promote trade and economic cooperation",
                correctAnswerIndex = 3,
                explanation = "The Treaty of Lagos was signed on May 28, 1975, by 15 West African nations, establishing ECOWAS to foster regional economic integration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1978 • Q50",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
