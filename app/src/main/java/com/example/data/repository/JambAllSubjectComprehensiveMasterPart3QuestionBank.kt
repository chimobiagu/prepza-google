package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB UTME Comprehensive All-Subjects Master Revision Bank Part 3.
 * Covers: Government, Literature in English, CRK/CRS, Financial Accounting (1983 - 2012 Series).
 */
object JambAllSubjectComprehensiveMasterPart3QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 7. GOVERNMENT (1983 - 2012 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "gov_comp_2010_001",
                subject = "Government",
                topic = "Examination Protocol",
                year = "2010",
                questionText = "Which Government Question Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 0,
                explanation = "Paper types (Type A, B, C, D) are assigned to ensure test security and organize candidate examination materials.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2010_002",
                subject = "Government",
                topic = "Political Concepts: Political Socialization",
                year = "2010",
                questionText = "The lifelong process through which individuals acquire political beliefs, attitudes, and values about a political system is:",
                optionA = "political socialization",
                optionB = "political culture",
                optionC = "political ideology",
                optionD = "political participation",
                correctAnswerIndex = 0,
                explanation = "Political socialization is the developmental learning process through which citizens internalize political orientations and patterns of civic behaviour.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2012_002",
                subject = "Government",
                topic = "Basic Concepts: The State",
                year = "2012",
                questionText = "The distinctive and supreme legal attribute of a sovereign state is:",
                optionA = "population",
                optionB = "territory",
                optionC = "sovereignty",
                optionD = "government",
                correctAnswerIndex = 2,
                explanation = "Sovereignty is the supreme, independent, and unrestricted legal authority possessed by a state to make and enforce laws without external dictation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2012_029",
                subject = "Government",
                topic = "Constitutional Law: Rule of Law",
                year = "2012",
                questionText = "The constitutional principle of the 'Rule of Law' was famously popularized and analyzed by:",
                optionA = "A.V. Dicey",
                optionB = "Baron de Montesquieu",
                optionC = "Jean Bodin",
                optionD = "John Locke",
                correctAnswerIndex = 0,
                explanation = "Professor A.V. Dicey expounded the three cardinal tenets of the Rule of Law: supremacy of regular law, equality before the law, and protection of fundamental rights.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2012_030",
                subject = "Government",
                topic = "Political Systems: Feudalism",
                year = "2012",
                questionText = "Which of the following social classes occupied the lowest rank in the hierarchy of the medieval feudal system?",
                optionA = "Knights",
                optionB = "Serfs (Peasant labourers)",
                optionC = "Nobles",
                optionD = "Barons and Lords",
                correctAnswerIndex = 1,
                explanation = "Serfs were unfree agricultural labourers bound to the lord's manor, occupying the absolute base of the feudal social pyramid.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2012_031",
                subject = "Government",
                topic = "Political Systems: Democratic Governance",
                year = "2012",
                questionText = "In which of the following political systems is the rule of law and judicial independence most systematically enhanced?",
                optionA = "Cabinet democratic system",
                optionB = "Feudal system",
                optionC = "Fascist authoritarian system",
                optionD = "Communist one-party system",
                correctAnswerIndex = 0,
                explanation = "A constitutional democratic cabinet system with parliamentary oversight and independent courts offers the institutional mechanisms to guarantee the Rule of Law.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2012_032",
                subject = "Government",
                topic = "Parliamentary System: Collective Responsibility",
                year = "2012",
                questionText = "The constitutional convention of 'collective ministerial responsibility' is synonymous with a:",
                optionA = "presidential system of government",
                optionB = "military regime",
                optionC = "cabinet (parliamentary) system of government",
                optionD = "confederal system of government",
                correctAnswerIndex = 2,
                explanation = "In a parliamentary cabinet system, all cabinet ministers share collective responsibility for government decisions and must publicly defend them or resign.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2012_033",
                subject = "Government",
                topic = "International Organizations: OAU / AU",
                year = "2012",
                questionText = "The supreme policymaking organ of the Organization of African Unity (now the African Union) is the:",
                optionA = "General Secretariat",
                optionB = "Council of Ministers",
                optionC = "Assembly of Heads of State and Government",
                optionD = "Commission of Mediation, Conciliation and Arbitration",
                correctAnswerIndex = 2,
                explanation = "The Assembly of Heads of State and Government comprises all national leaders of member states and constitutes the highest legislative and policy body of the AU.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1983_001",
                subject = "Government",
                topic = "Basic Concepts: Limitations of Sovereignty",
                year = "1983",
                questionText = "The sovereignty of a state is limited by all of the following factors EXCEPT:",
                optionA = "the written constitution",
                optionB = "customary international law and treaties",
                optionC = "domestic public opinion and civil society",
                optionD = "the numerical size of the civil service",
                correctAnswerIndex = 3,
                explanation = "The civil service is an administrative execution arm of government and does not impose legal or institutional limitations on state sovereignty.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1983_005",
                subject = "Government",
                topic = "Systems of Government: Presidential System",
                year = "1983",
                questionText = "In a presidential system of government, the executive President is:",
                optionA = "chosen directly by and from the legislature",
                optionB = "both the ceremonial Head of State and executive Head of Government",
                optionC = "Head of State only",
                optionD = "Head of Government only",
                correctAnswerIndex = 1,
                explanation = "In presidential democracy, ceremonial and executive functions are fused into the single office of the President, who is directly elected by the national electorate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1983_010",
                subject = "Government",
                topic = "Organs of Government: The Judiciary",
                year = "1983",
                questionText = "The primary constitutional function of the judicial branch of government is to:",
                optionA = "enact statutes and legislative acts",
                optionB = "execute and administer public policies",
                optionC = "interpret the laws and adjudicate legal disputes",
                optionD = "enforce police orders on the streets",
                correctAnswerIndex = 2,
                explanation = "Under the doctrine of separation of powers, the judiciary's mandate is interpreting statutory laws, resolving civil/criminal disputes, and safeguarding the constitution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1983 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1983_015",
                subject = "Government",
                topic = "Nigerian Constitutional Development: Second Republic",
                year = "1983",
                questionText = "The bicameral National Assembly of Nigeria's Second Republic (1979 - 1983) consisted of the:",
                optionA = "House of Representatives and State Houses of Assembly",
                optionB = "House of Representatives and the Senate",
                optionC = "Senate and the Council of Chiefs",
                optionD = "Supreme Military Council and Federal Executive Council",
                correctAnswerIndex = 1,
                explanation = "Under the 1979 Presidential Constitution, Nigeria's federal legislature was bicameral, comprising the Senate (upper chamber) and House of Representatives (lower chamber).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1983 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1984_008",
                subject = "Government",
                topic = "Nigerian Constitutional History: Elective Principle",
                year = "1984",
                questionText = "Which colonial constitution first introduced the elective principle in Nigeria?",
                optionA = "Lyttelton Constitution of 1954",
                optionB = "Clifford Constitution of 1922",
                optionC = "Richards Constitution of 1946",
                optionD = "Macpherson Constitution of 1951",
                correctAnswerIndex = 1,
                explanation = "Sir Hugh Clifford's 1922 Constitution introduced the elective principle, creating 4 elected legislative seats (3 for Lagos, 1 for Calabar) for male taxpayers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1984 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1984_020",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "1984",
                questionText = "The fundamental doctrine of the Rule of Law means that:",
                optionA = "judges and legislators are above the law",
                optionB = "the law is supreme and applies equally to all citizens regardless of status",
                optionC = "the executive arm may override the judiciary during crises",
                optionD = "military decrees supersede natural justice",
                correctAnswerIndex = 1,
                explanation = "Rule of Law denotes the absolute supremacy of regular law over arbitrary power and equal subjection of all classes to the ordinary law of the land.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1984 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1985_012",
                subject = "Government",
                topic = "Federalism: Merits",
                year = "1985",
                questionText = "A major institutional merit of a federal system of government in a multi-ethnic nation is that it:",
                optionA = "dramatically reduces the cost of governance",
                optionB = "eradicates cultural differences across regions",
                optionC = "accommodates diverse ethnic groups and prevents centralized tyranny",
                optionD = "makes parliamentary lawmaking faster and simpler",
                correctAnswerIndex = 2,
                explanation = "Federalism decentralizes political power across tiers, fostering unity in diversity and preserving regional autonomy in heterogeneous societies.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1985 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1985_033",
                subject = "Government",
                topic = "Colonial Administration: French Policy",
                year = "1985",
                questionText = "The colonial administrative policy of 'Assimilation' was associated with the overseas empire of the:",
                optionA = "British",
                optionB = "French",
                optionC = "Portuguese",
                optionD = "Belgians",
                correctAnswerIndex = 1,
                explanation = "France implemented the Policy of Assimilation in French West Africa (e.g., the Four Communes of Senegal), seeking to culturally transform Africans into French citizens.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1985 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1994_002",
                subject = "Government",
                topic = "Public Opinion: Importance",
                year = "1994",
                questionText = "Public opinion is important in democratic governance because it:",
                optionA = "guarantees automatic full employment for citizens",
                optionB = "guides government policy formulation and keeps elected leaders accountable",
                optionC = "empowers judges to write constitutional amendments",
                optionD = "replaces the necessity for periodic general elections",
                correctAnswerIndex = 1,
                explanation = "Public opinion reflects the aggregated attitudes of citizens, acting as a crucial feedback mechanism that guides policymaking and prevents authoritarian overreach.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1994 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_1997_018",
                subject = "Government",
                topic = "Nigerian Political History: Military Rule",
                year = "1997",
                questionText = "The first military coup d'état in Nigeria took place on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "July 29, 1975",
                optionD = "August 27, 1985",
                correctAnswerIndex = 0,
                explanation = "On January 15, 1966, a group of junior army officers led by Major Chukwuma Kaduna Nzeogwu staged Nigeria's first military coup, terminating the First Republic.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 1997 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2001_040",
                subject = "Government",
                topic = "International Organizations: United Nations",
                year = "2001",
                questionText = "The permanent international headquarters of the United Nations Organization is located in:",
                optionA = "London",
                optionB = "Geneva",
                optionC = "New York City",
                optionD = "Paris",
                correctAnswerIndex = 2,
                explanation = "The official headquarters complex of the United Nations has been situated in Manhattan, New York City, USA, since its completion in 1952.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2001 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_comp_2003_025",
                subject = "Government",
                topic = "The Civil Service: Functions",
                year = "2003",
                questionText = "A cardinal constitutional function of the permanent civil service is to:",
                optionA = "pass legislative bills into law in parliament",
                optionB = "adjudicate constitutional disputes in high courts",
                optionC = "implement government policies loyally, impartially, and professionally",
                optionD = "organize election campaigns for the ruling political party",
                correctAnswerIndex = 2,
                explanation = "The civil service forms the permanent, non-partisan bureaucratic administrative body responsible for executing state policies and advising ministers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2003 • Q25"
            )
        )

        // =========================================================================
        // 8. LITERATURE IN ENGLISH (2010 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_comp_2010_001",
                subject = "Literature in English",
                topic = "Examination Paper Protocol",
                year = "2010",
                questionText = "Which Literature in English Question Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 0,
                explanation = "Examination types are coded by letter (Type A, B, C, D) for administrative tracking.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_002",
                subject = "Literature in English",
                topic = "African Drama: Sons and Daughters (J.C. De Graft)",
                year = "2010",
                questionText = "'I simply don't understand what's the matter with everybody today. Everybody let me down...' The speaker in the excerpt above is referring to:",
                optionA = "Fosuwa and Maidservant",
                optionB = "Hannah and George",
                optionC = "Aaron and Maanan",
                optionD = "Lawyer B and Mrs. B",
                correctAnswerIndex = 0,
                explanation = "In De Graft's Sons and Daughters, the exasperated master of the house laments the perceived insolence and failures of Aunt Fosuwa and the domestic maidservant.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_003",
                subject = "Literature in English",
                topic = "African Drama: Sons and Daughters (J.C. De Graft)",
                year = "2010",
                questionText = "In Sons and Daughters, Maanan expresses strong dislike for Lawyer B primarily because of:",
                optionA = "his condemnation of her artistic career choice",
                optionB = "his inappropriate, predatory advances towards her",
                optionC = "the betrayal of her father's financial trust",
                optionD = "his arrogant professional attitude",
                correctAnswerIndex = 1,
                explanation = "Maanan despises Lawyer B after he makes illicit, unsolicited romantic advances toward her while pretending to counsel her on behalf of her father.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_004",
                subject = "Literature in English",
                topic = "African Drama: Sons and Daughters (J.C. De Graft)",
                year = "2010",
                questionText = "The traditional, conservative generational order in the play Sons and Daughters is represented by:",
                optionA = "Mrs. B",
                optionB = "Hannah",
                optionC = "Maanan",
                optionD = "Aunt Fosuwa",
                correctAnswerIndex = 3,
                explanation = "Aunt Fosuwa epitomizes the rigid traditional African customary values, constantly clashing with modern youth aspirations and career choices.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_005",
                subject = "Literature in English",
                topic = "African Drama: Sons and Daughters (J.C. De Graft)",
                year = "2010",
                questionText = "The dramatic spatial setting of the play Sons and Daughters is entirely located:",
                optionA = "On a busy commercial street",
                optionB = "In George's modern studio",
                optionC = "In Aunt Fosuwa's village home",
                optionD = "In Ofosu's residential living room",
                correctAnswerIndex = 3,
                explanation = "The whole domestic conflict in De Graft's play is confined to James Ofosu's spacious living room, highlighting familial claustrophobia.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_006",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "'O deadly sin! O rude unthankfulness! Thy fault our law calls death, but the kind Prince, Taking thy part, hath rushed aside the law And turned that black word...' In this speech, Friar Laurence's reference to 'deadly sin' designates:",
                optionA = "the suicide of Juliet",
                optionB = "the tragic suicide of Romeo",
                optionC = "the murder of Count Paris",
                optionD = "the slaying of Tybalt by Romeo",
                correctAnswerIndex = 3,
                explanation = "Friar Laurence rebukes Romeo for his despair, reminding him that Romeo committed murder by killing Tybalt, a crime legally punishable by death in Verona.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_008",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "'O serpent heart, hid with a flowering face!' The statement above is uttered by Juliet in reference to:",
                optionA = "Juliet herself",
                optionB = "Romeo",
                optionC = "Tybalt",
                optionD = "Benvolio",
                correctAnswerIndex = 1,
                explanation = "Juliet uses this series of oxymorons to describe Romeo when she first hears that he has killed her beloved cousin Tybalt.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_009",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "The primary spatial and geographical setting of Shakespeare's tragedy Romeo and Juliet is the city of:",
                optionA = "Athens",
                optionB = "Verona",
                optionC = "Padua",
                optionD = "Venice",
                correctAnswerIndex = 1,
                explanation = "The tragedy is set in Verona, Italy, with subsequent brief scenes of Romeo's exile taking place in nearby Mantua.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_010",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "Romeo is banished to Mantua by Prince Escalus because he:",
                optionA = "kills Tybalt in a retaliatory street duel",
                optionB = "marries Juliet without parental consent",
                optionC = "crashes the Capulet ball uninvited",
                optionD = "attempts to assassinate Count Paris",
                correctAnswerIndex = 0,
                explanation = "Prince Escalus banishes Romeo from Verona as punishment for slaying Tybalt, who had just slain Romeo's friend Mercutio.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_011",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2010",
                questionText = "In Buchi Emecheta's novel The Joys of Motherhood, the traditional society places supreme cultural value on:",
                optionA = "egalitarianism",
                optionB = "male ascendancy alone",
                optionC = "procreation and childbearing",
                optionD = "gender equity",
                correctAnswerIndex = 2,
                explanation = "The novel depicts an Igbo patriarchal society where a woman's entire social worth, identity, and respect hinge on her ability to bear and raise children (procreation).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_012",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2010",
                questionText = "The native medicine man links the physical lump on the head of Nnu Ego at birth to the:",
                optionA = "possession of rare beauty and wealth",
                optionB = "wound inflicted on the slave woman buried alive with Agbadi’s senior wife",
                optionC = "coming back of Agunwa into the world",
                optionD = "inevitable tragic destiny of the village",
                correctAnswerIndex = 1,
                explanation = "Nnu Ego's personal chi is identified as the aggrieved slave woman who was clubbed on the head and forced into the grave during her mother's funeral.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_013",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2010",
                questionText = "The constant companions of Nnaife's household in urban colonial Lagos are:",
                optionA = "togetherness and prosperity",
                optionB = "poverty and hunger",
                optionC = "chronic disease and unemployment",
                optionD = "social elitism and joy",
                correctAnswerIndex = 1,
                explanation = "Throughout their stay in Lagos, Nnu Ego and Nnaife constantly battle grinding urban poverty, inflation, and hunger to feed their expanding family.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_014",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal (Ferdinand Oyono)",
                year = "2010",
                questionText = "In Ferdinand Oyono's The Old Man and the Medal, the fierce argument between Mvondo and Nti centers on the latter’s claim to have:",
                optionA = "assisted Meka in obtaining the medal",
                optionB = "eaten the entire entrails of a sacrificial sheep",
                optionC = "eaten more than his legitimate communal share of food",
                optionD = "worked closely inside the white District Officer's office",
                correctAnswerIndex = 2,
                explanation = "During the communal feast, tensions flare between Mvondo and Nti over accusations of gluttony and disproportionate sharing of meat.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_015",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2010",
                questionText = "At the opening of the novel, the protagonist Meka can best be characterized as a/an:",
                optionA = "egocentric political revolutionary",
                optionB = "simple-hearted, proud old chief",
                optionC = "impulsive anti-colonial rebel",
                optionD = "submissive, deeply pious old religious devotee of church and state",
                correctAnswerIndex = 3,
                explanation = "Meka begins the novel as a completely loyal, uncritical subject who sacrificed his land to the Catholic mission and his two sons to the colonial war effort.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_016",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2010",
                questionText = "In The Old Man and the Medal, the French colonial administration treats the indigenous African population with:",
                optionA = "diplomatic equality",
                optionB = "condescending disdain and hypocrisy",
                optionC = "unbiased respect",
                optionD = "benevolent brotherhood",
                correctAnswerIndex = 1,
                explanation = "Oyono's satirical masterpiece exposes the racial disdain, segregation, brutality, and empty paternalism of the French colonial apparatus in Cameroon.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_017",
                subject = "Literature in English",
                topic = "Non-African Prose: 1984 (George Orwell)",
                year = "2010",
                questionText = "In George Orwell's dystopian novel 1984, the Ministry of Peace (Minipax) is ironically concerned with:",
                optionA = "scientific discovery",
                optionB = "manufacturing civilian consumer goods",
                optionC = "perpetuating endless warfare",
                optionD = "negotiating international treaties",
                correctAnswerIndex = 2,
                explanation = "Under the regime's doublethink doctrine ('War is Peace'), the Ministry of Peace manages and wages continuous global warfare.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_018",
                subject = "Literature in English",
                topic = "Non-African Prose: 1984 (George Orwell)",
                year = "2010",
                questionText = "The central thematic subject matter of George Orwell's 1984 is the terrifying danger of:",
                optionA = "totalitarian dictatorship and systemic state surveillance",
                optionB = "economic depression",
                optionC = "retributive justice",
                optionD = "feudal class segregation",
                correctAnswerIndex = 0,
                explanation = "1984 is a classic warning against totalitarian governance, ideological brainwashing, mass surveillance, and erasure of individual freedom.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_019",
                subject = "Literature in English",
                topic = "Non-African Prose: 1984 (George Orwell)",
                year = "2010",
                questionText = "How does Winston Smith commit his first conscious act of rebellion against the Party in 1984?",
                optionA = "By detonating a bomb at the Ministry of Truth",
                optionB = "By purchasing and writing in a private, illegal diary",
                optionC = "By openly speaking out at the Two Minutes Hate",
                optionD = "By attempting to assassinate Big Brother",
                correctAnswerIndex = 1,
                explanation = "Winston initiates his defiance by recording individual rebellious thoughts ('DOWN WITH BIG BROTHER') in an antique diary bought in a prole junk shop.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_020",
                subject = "Literature in English",
                topic = "Non-African Prose: 1984 (George Orwell)",
                year = "2010",
                questionText = "In 1984, the inner Party official O'Brien reveals that the Party seeks absolute power for:",
                optionA = "the prosperity of the nation",
                optionB = "power's own sake alone",
                optionC = "the collective welfare of the proles",
                optionD = "religious ideological purity",
                correctAnswerIndex = 1,
                explanation = "O'Brien tells Winston: 'The Party seeks power entirely for its own sake. We are not interested in the good of others; we are interested solely in power.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "lit_comp_2010_028",
                subject = "Literature in English",
                topic = "Non-African Poetry: Bat (D.H. Lawrence)",
                year = "2010",
                questionText = "In D.H. Lawrence's poem 'Bat', the poet persona sitting on the terrace at dusk initially mistakes the flying creatures for:",
                optionA = "nocturnal owls",
                optionB = "graceful swallows",
                optionC = "pipistrello",
                optionD = "wild sparrows",
                correctAnswerIndex = 1,
                explanation = "The speaker watches the silhouette figures dipping in the twilight sky thinking they are swallows, before realizing with visceral disgust that they are bats.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q28"
            )
        )

        // =========================================================================
        // 9. CHRISTIAN RELIGIOUS KNOWLEDGE / STUDIES (1983 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "crk_comp_1983_001",
                subject = "Christian Religious Studies",
                topic = "Prophetic Ministry: Elijah & Drought",
                year = "1983",
                questionText = "Who pronounced this drought to King Ahab: 'As the Lord the God of Israel lives... there shall be neither dew nor rain these years except by my word'?",
                optionA = "Elisha",
                optionB = "Ezekiel",
                optionC = "Elijah the Tishbite",
                optionD = "Obadiah",
                correctAnswerIndex = 2,
                explanation = "In 1 Kings 17:1, Elijah declared a severe multi-year drought across Israel as divine judgment against Ahab and Jezebel's Baal worship.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_002",
                subject = "Christian Religious Studies",
                topic = "Solomon's Wisdom: The Two Harlots",
                year = "1983",
                questionText = "In the legal case brought before King Solomon over the dead and living child, the mother of the dead child supported:",
                optionA = "surrendering the living child to her opponent",
                optionB = "cutting the living child in two with a sword",
                optionC = "joint maternal custody of the child",
                optionD = "king Solomon adopting the baby",
                correctAnswerIndex = 1,
                explanation = "In 1 Kings 3:26, the false mother callously demanded: 'Let it be neither mine nor yours; divide it!', revealing her lack of true maternal affection.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_003",
                subject = "Christian Religious Studies",
                topic = "Leadership: Joshua Succeeded Moses",
                year = "1983",
                questionText = "Before Moses died on Mount Nebo, God commanded him to commission ________ as his successor to lead Israel into Canaan.",
                optionA = "Joshua, son of Nun",
                optionB = "Aaron",
                optionC = "Eleazar the high priest",
                optionD = "Balaam",
                correctAnswerIndex = 0,
                explanation = "In Numbers 27 and Deuteronomy 31, God chose Joshua, son of Nun, laying hands upon him to lead Israel across the Jordan.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_004",
                subject = "Christian Religious Studies",
                topic = "Wilderness Journey: The Bronze Serpent",
                year = "1983",
                questionText = "God provided healing for the Israelites bitten by the fiery serpents in the wilderness by commanding them to:",
                optionA = "drink water drawn from the Red Sea",
                optionB = "look upon a bronze serpent set upon a pole",
                optionC = "fast in penance for seven days",
                optionD = "offer sacrificial doves",
                correctAnswerIndex = 1,
                explanation = "In Numbers 21:8-9, Moses made a bronze serpent and put it on a pole; anyone who was bitten looked at it and lived.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_005",
                subject = "Christian Religious Studies",
                topic = "Patriarchs: Joseph in Egypt",
                year = "1983",
                questionText = "In order to ensure that his brothers brought their youngest brother Benjamin to Egypt, Joseph detained and imprisoned:",
                optionA = "Reuben",
                optionB = "Levi",
                optionC = "Judah",
                optionD = "Simeon",
                correctAnswerIndex = 3,
                explanation = "In Genesis 42:24, Joseph bound Simeon before their eyes and kept him in custody while the others returned home with grain.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_007",
                subject = "Christian Religious Studies",
                topic = "Patriarchs: Covenant Child",
                year = "1983",
                questionText = "In fulfillment of God's covenant promise, Sarah conceived and gave birth in her old age to:",
                optionA = "Joseph",
                optionB = "Isaac",
                optionC = "Jacob",
                optionD = "Simeon",
                correctAnswerIndex = 1,
                explanation = "Genesis 21 records the birth of Isaac to Abraham (100 years old) and Sarah (90 years old) as the designated son of promise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_008",
                subject = "Christian Religious Studies",
                topic = "Covenant with Abraham: Circumcision",
                year = "1983",
                questionText = "As an everlasting physical sign of the covenant between God and Abraham and his offspring, Abraham was commanded to:",
                optionA = "circumcise every male child on the eighth day",
                optionB = "offer burnt offerings on the new moon",
                optionC = "observe the Saturday Sabbath rest",
                optionD = "pray towards Bethel thrice daily",
                correctAnswerIndex = 0,
                explanation = "In Genesis 17:10-12, God established the rite of circumcision for every eight-day-old male as the covenant sign.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_009",
                subject = "Christian Religious Studies",
                topic = "Creation: The Primordial State",
                year = "1983",
                questionText = "According to Genesis 1:2, what was the state of the earth before God commenced the active creation of the universe?",
                optionA = "The earth was without form and void, covered with deep darkness",
                optionB = "There was already a firmament spanning the sky",
                optionC = "Faint light penetrated from surrounding stars",
                optionD = "The heavens were touching the surface of the dry land",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:2 states: 'The earth was without form, and void; and darkness was on the face of the deep.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_011",
                subject = "Christian Religious Studies",
                topic = "The Monarchy: Adonijah and Solomon",
                year = "1983",
                questionText = "Following Solomon's coronation as king, what did Adonijah do to seek sanctuary and show that he feared King Solomon?",
                optionA = "He fled into the wilderness of Judah",
                optionB = "He sent envoys offering to surrender his army",
                optionC = "He caught hold of the horns of the altar in the Tabernacle",
                optionD = "He locked himself inside David's palace chambers",
                correctAnswerIndex = 2,
                explanation = "In 1 Kings 1:50, Adonijah feared Solomon and went and caught hold of the horns of the altar to obtain sacred asylum.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_012",
                subject = "Christian Religious Studies",
                topic = "The Monarchy: Solomon's Temple",
                year = "1983",
                questionText = "King Solomon entered into a trade treaty with King Hiram of Tyre to obtain fine cedar timber from:",
                optionA = "Egypt",
                optionB = "Jerusalem",
                optionC = "Phoenicia",
                optionD = "Lebanon",
                correctAnswerIndex = 3,
                explanation = "1 Kings 5:6 recounts Solomon requesting Hiram to cut majestic cedar trees out of the forests of Lebanon for the Temple.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_013",
                subject = "Christian Religious Studies",
                topic = "Prophetic Books: Jeremiah",
                year = "1983",
                questionText = "According to Jeremiah's prophetic message, the conquest of Judah and neighbouring kingdoms by Nebuchadnezzar of Babylon was:",
                optionA = "against the sovereign will of God",
                optionB = "an integral part of the divine purpose to discipline the nations",
                optionC = "the sole result of Babylonian technological superior weapons",
                optionD = "an accidental historical catastrophe",
                correctAnswerIndex = 1,
                explanation = "In Jeremiah 27:6, God declares: 'I have given all these lands into the hand of Nebuchadnezzar the king of Babylon, my servant.'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_014",
                subject = "Christian Religious Studies",
                topic = "Prophetic Books: Ezekiel's Call",
                year = "1983",
                questionText = "When Ezekiel was commissioned by God at the river Chebar, he was commanded to eat ________ and then go speak to the house of Israel.",
                optionA = "wild honey and locusts",
                optionB = "unleavened bread",
                optionC = "bitter herbs",
                optionD = "a written scroll",
                correctAnswerIndex = 3,
                explanation = "In Ezekiel 3:1-3, God tells Ezekiel: 'Son of man, eat what is before you; eat this scroll, then go and speak to the house of Israel.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_024",
                subject = "Christian Religious Studies",
                topic = "Conquest of Canaan: Fall of Jericho",
                year = "1983",
                questionText = "The fortified city of Jericho fell to the Israelites on the seventh day when:",
                optionA = "the walls were battered down by heavy siege towers",
                optionB = "a violent underground earthquake shattered the gates",
                optionC = "the priests blew their trumpets and the people shouted with a great shout",
                optionD = "famine forced the inhabitants to surrender",
                correctAnswerIndex = 2,
                explanation = "In Joshua 6:20, as the trumpets sounded and the people shouted, the defensive walls of Jericho collapsed flat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_025",
                subject = "Christian Religious Studies",
                topic = "Prophetic Books: Call of Isaiah",
                year = "1983",
                questionText = "Isaiah's dramatic vision in the temple and his prophetic call occurred:",
                optionA = "in the year that King Uzziah died",
                optionB = "during the dedication of the temple by Solomon",
                optionC = "shortly before the Maccabean revolt",
                optionD = "when David defeated the Philistines",
                correctAnswerIndex = 0,
                explanation = "Isaiah 6:1 begins: 'In the year that King Uzziah died, I saw the Lord, high and exalted, seated on a throne.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_026",
                subject = "Christian Religious Studies",
                topic = "Gospel of Luke: Zechariah's Unbelief",
                year = "1983",
                questionText = "When the priest Zechariah expressed doubt concerning the angel Gabriel’s announcement of the birth of John the Baptist, he:",
                optionA = "was struck blind",
                optionB = "was struck dumb (unable to speak) until the child was named",
                optionC = "collapsed and fell unconscious in the Holy Place",
                optionD = "was dismissed from the priestly order",
                correctAnswerIndex = 1,
                explanation = "In Luke 1:20, Gabriel tells Zechariah: 'You will be silent and not able to speak until the day this happens, because you did not believe my words.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_027",
                subject = "Christian Religious Studies",
                topic = "Early Life of Jesus: Herod the Great",
                year = "1983",
                questionText = "King Herod sought to kill the infant Jesus in Bethlehem because:",
                optionA = "he believed Jesus would grow up to be a rebellious desert prophet",
                optionB = "he learned from the Wise Men that Jesus was born 'King of the Jews', threatening his throne",
                optionC = "the Sanhedrin condemned Jesus",
                optionD = "Joseph and Mary refused to pay imperial taxes",
                correctAnswerIndex = 1,
                explanation = "Matthew 2 relates that Herod was troubled when Magi from the East inquired: 'Where is the one who has been born King of the Jews?'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_028",
                subject = "Christian Religious Studies",
                topic = "Parables of Jesus: The Prodigal Son",
                year = "1983",
                questionText = "The central spiritual lesson conveyed by Jesus in the Parable of the Prodigal Son (Luke 15) is that:",
                optionA = "Parents must never divide family property early",
                optionB = "Younger sons should always follow older siblings",
                optionC = "God joyfully receives and forgives any sinner who truly repents",
                optionD = "Wastefulness leads to material poverty",
                correctAnswerIndex = 2,
                explanation = "The unconditional welcoming of the wayward son illustrates God's boundless grace, mercy, and forgiveness toward every repentant sinner.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_029",
                subject = "Christian Religious Studies",
                topic = "Acts of the Apostles: Thessalonica",
                year = "1983",
                questionText = "'These men who have turned the world upside down have come here also, and Jason has received them.' In which city did this event occur?",
                optionA = "Tarsus",
                optionB = "Ephesus",
                optionC = "Corinth",
                optionD = "Thessalonica",
                correctAnswerIndex = 3,
                explanation = "In Acts 17:5-6, an incensed mob in Thessalonica dragged Jason before the city magistrates with this accusation against Paul and Silas.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_030",
                subject = "Christian Religious Studies",
                topic = "Gospel of Luke: The Benedictus",
                year = "1983",
                questionText = "'And you, child, will be called the prophet of the Most High; for you will go before the Lord to prepare his ways.' This prophecy was spoken by Zechariah over:",
                optionA = "Samuel",
                optionB = "Jesus",
                optionC = "John the Baptist",
                optionD = "Timothy",
                correctAnswerIndex = 2,
                explanation = "In Luke 1:76, Zechariah sings his inspired canticle (the Benedictus) upon the circumcision and naming of his infant son, John the Baptist.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "crk_comp_1983_049",
                subject = "Christian Religious Studies",
                topic = "Acts of the Apostles: Conversion of Saul/Paul",
                year = "1983",
                questionText = "The Lord declared to Ananias that Saul was chosen as a special instrument in order to:",
                optionA = "stop persecuting the Church in Jerusalem",
                optionB = "serve as an assistant to Apostle Peter",
                optionC = "write the Torah in Greek",
                optionD = "carry the name of Christ before the Gentiles, kings, and the children of Israel",
                correctAnswerIndex = 3,
                explanation = "In Acts 9:15, the Lord told Ananias: 'Go, for he is a chosen instrument of mine to carry my name before the Gentiles and their kings and before the people of Israel.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 1983 • Q49"
            )
        )

        // =========================================================================
        // 10. FINANCIAL ACCOUNTING / PRINCIPLES OF ACCOUNTS (1994 - 1997 SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "acc_comp_1994_001",
                subject = "Financial Accounting",
                topic = "Accounting Concepts: Accounting Period",
                year = "1994",
                questionText = "The term 'accounting period' is used in financial reporting to refer to the:",
                optionA = "time span during which annual company taxes are assessed and paid",
                optionB = "budget preparation interval relied upon by cost accountants",
                optionC = "specific time span, usually one year, covered by financial statements",
                optionD = "statutory credit period within which trade debtors must settle balances",
                correctAnswerIndex = 2,
                explanation = "The accounting period (periodicity) concept divides the continuous economic life of an enterprise into regular, uniform time segments (typically 12 months) for reporting.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_002",
                subject = "Financial Accounting",
                topic = "Accounting Concepts: Matching Concept",
                year = "1994",
                questionText = "Assigning revenues and matching them directly against the expenses incurred to generate those revenues in the same accounting period is known as the:",
                optionA = "passing of journal entries",
                optionB = "consistency convention",
                optionC = "matching concept (accruals principle)",
                optionD = "historical cost convention",
                correctAnswerIndex = 2,
                explanation = "The matching concept requires expenses incurred in generating particular revenues to be recognized in the exact period in which those revenues are reported.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_003",
                subject = "Financial Accounting",
                topic = "Accounting Conventions: Prudence / Conservatism",
                year = "1994",
                questionText = "The accounting convention which dictates that 'profits must not be anticipated or recognized until realized, while all probable and anticipated losses must be fully provided for' is:",
                optionA = "materiality convention",
                optionB = "objectivity principle",
                optionC = "consistency convention",
                optionD = "conservatism (prudence) convention",
                correctAnswerIndex = 3,
                explanation = "Prudence/Conservatism ensures financial statements do not overstate assets or income by requiring immediate recognition of anticipated liabilities and delaying unrealized revenue.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_004",
                subject = "Financial Accounting",
                topic = "Users of Financial Information",
                year = "1994",
                questionText = "Accounting information is utilized primarily by external investors and prospective creditors to evaluate and predict the:",
                optionA = "future net cash flows and financial viability of the company",
                optionB = "future corporate tax rates set by parliament",
                optionC = "recruitment criteria for junior office staff",
                optionD = "internal factory shop-floor rosters",
                correctAnswerIndex = 0,
                explanation = "Investors and lending institutions analyze financial statements to assess liquidity, profitability, risk, and the timing and certainty of future cash returns.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_005",
                subject = "Financial Accounting",
                topic = "Double Entry Bookkeeping: Fixed Assets",
                year = "1994",
                questionText = "Antics Electronics Company bought six electrical generators for use in running its office operations. What is the correct double entry recording for this transaction?",
                optionA = "Debit Generator (Office Equipment) Account and Credit Cash/Bank Account",
                optionB = "Debit Purchases Account and Credit Cash Account",
                optionC = "Debit Cash Account and Credit Purchases Account",
                optionD = "Debit Cash Account and Credit Generator Account",
                correctAnswerIndex = 0,
                explanation = "Because the generators were acquired as non-current assets for administrative operations and not for trading resale, the specific Asset Account is debited, not Purchases.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_006",
                subject = "Financial Accounting",
                topic = "Capital vs Revenue Expenditure: Installation Costs",
                year = "1994",
                questionText = "When an enterprise incurs direct labour and engineering costs in installing and commissioning a new fixed plant asset, this cost is treated as:",
                optionA = "a capital expenditure added directly to the cost of the asset",
                optionB = "ordinary general business wages and salaries in the profit and loss account",
                optionC = "a miscellaneous office operational expense",
                optionD = "a revenue discount",
                correctAnswerIndex = 0,
                explanation = "Under IAS 16, all directly attributable expenditures necessary to bring an asset to its working location and operational condition must be capitalized into the asset account.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_007",
                subject = "Financial Accounting",
                topic = "Double Entry Principles",
                year = "1994",
                questionText = "What is the cardinal rule of the double-entry bookkeeping system?",
                optionA = "Debit the increasing account and credit the decreasing account",
                optionB = "Debit the receiving account and credit the giving account",
                optionC = "Debit all liability accounts and credit all asset accounts",
                optionD = "Debit all income accounts and credit all expense accounts",
                correctAnswerIndex = 1,
                explanation = "Every transaction has a dual effect: the account that receives value is debited, and the account that parts with or yields value is credited.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_008",
                subject = "Financial Accounting",
                topic = "Correction of Errors: Error of Principle",
                year = "1994",
                questionText = "Malam Gambo bought a commercial deep freezer for his retail shop costing ₦10,500. He mistakenly debited the office running expenses account. What type of accounting error is this?",
                optionA = "Error of commission",
                optionB = "Error of original entry",
                optionC = "Error of principle",
                optionD = "Compensating error",
                correctAnswerIndex = 2,
                explanation = "An error of principle occurs when an entry violates fundamental accounting principles, such as recording a capital expenditure (fixed asset) as a revenue expense.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_009",
                subject = "Financial Accounting",
                topic = "Ledger Accounting: Folio Columns",
                year = "1994",
                questionText = "The primary purpose of the folio column in journals and ledger accounts is for:",
                optionA = "Cross-referencing and audit tracking purposes",
                optionB = "Recording full narrative particulars of the sale",
                optionC = "Writing the official title of the client",
                optionD = "Entering currency exchange rates",
                correctAnswerIndex = 0,
                explanation = "The folio column is used as an index and cross-reference to trace the source journal and destination ledger page for every posted transaction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_011",
                subject = "Financial Accounting",
                topic = "Trial Balance & Suspense Account",
                year = "1994",
                questionText = "A Suspense Account is opened and used to correct bookkeeping errors where the:",
                optionA = "monetary value involved is extremely large",
                optionB = "error does not affect the trial balance totals",
                optionC = "particular supplier is deceased",
                optionD = "error creates a discrepancy that affects the agreement of the trial balance",
                correctAnswerIndex = 3,
                explanation = "A suspense account is a temporary holding account created to balance an uneven trial balance while one-sided errors are investigated and corrected.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_012",
                subject = "Financial Accounting",
                topic = "Cash Book: Discount Columns",
                year = "1994",
                questionText = "The discount columns of a three-column cash book are not balanced off against each other but their periodic totals are transferred because discounts:",
                optionA = "are not important in financial accounting",
                optionB = "represent liquid cash in the till",
                optionC = "do not form part of the cash book's double entry but serve as memorandums for ledger posting",
                optionD = "are required solely for bank reconciliation statements",
                correctAnswerIndex = 2,
                explanation = "Discounts allowed and discounts received are distinct nominal accounts. Their cash book columns are memorandum totals posted separately to the general ledger.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_013",
                subject = "Financial Accounting",
                topic = "Petty Cash: Imprest System",
                year = "1994",
                questionText = "Under the Imprest Petty Cash system, when is the petty cash ledger account debited?",
                optionA = "When the fund is first established and every time petty expenses are paid out",
                optionB = "When the fund is first established and every time the float is replenished",
                optionC = "Only at the end of the fiscal financial year",
                optionD = "Every morning before office trading opens",
                correctAnswerIndex = 1,
                explanation = "The Petty Cash account in the general ledger is debited when the initial float is handed to the petty cashier and when reimbursement cheques are issued to top up the float.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_014",
                subject = "Financial Accounting",
                topic = "Bank Reconciliation Statement",
                year = "1994",
                questionText = "When preparing a bank reconciliation statement starting from the balance per bank statement, which of the following is deducted?",
                optionA = "Direct bank charges and commission",
                optionB = "Uncleared lodgments",
                optionC = "Returned / dishonoured cheques",
                optionD = "Unpresented cheques",
                correctAnswerIndex = 3,
                explanation = "Unpresented cheques have been credited in the cash book but not yet cleared by the bank; to reconcile from bank statement to cash book balance, they are deducted.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1994_015",
                subject = "Financial Accounting",
                topic = "Final Accounts: Statement of Financial Position",
                year = "1994",
                questionText = "The comprehensive financial position, assets, liabilities, and owner's equity of an organization at a particular date can be ascertained from the:",
                optionA = "Statement of sources and application of funds",
                optionB = "Statement of retained earnings",
                optionC = "Balance Sheet (Statement of Financial Position)",
                optionD = "Manufacturing and Profit & Loss account",
                correctAnswerIndex = 2,
                explanation = "The Balance Sheet is a snapshot showing the cumulative assets, liabilities, and capital of a business entity at a specific point in time.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1994 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1995_001",
                subject = "Financial Accounting",
                topic = "History & Evolution of Accounting",
                year = "1995",
                questionText = "Which of the following historical developments significantly accelerated the modern evolution of financial accounting?",
                optionA = "The emergence of modern nation-states",
                optionB = "The discovery of oil and mineral resources in commercial quantities",
                optionC = "The massive growth in size of corporations and the separation of business ownership from management",
                optionD = "The abolition of barter trade",
                correctAnswerIndex = 2,
                explanation = "The rise of joint-stock companies with separation of ownership (shareholders) from day-to-day managerial control made standardized stewardship reporting essential.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1995 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1995_002",
                subject = "Financial Accounting",
                topic = "Accounting Concepts: Accrual Concept",
                year = "1995",
                questionText = "Which accounting concept stipulates that accounting profit is measured as the difference between revenues earned and the related expenses incurred in an accounting period, regardless of cash flow?",
                optionA = "Accrual concept",
                optionB = "Conservation concept",
                optionC = "Prudence concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The accrual concept dictates that revenue is recognized when earned and expenses when incurred, irrespective of whether cash has actually been received or paid.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1995 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1995_003",
                subject = "Financial Accounting",
                topic = "Objectives of Financial Accounting",
                year = "1995",
                questionText = "An effective corporate accounting system should provide reliable quantitative financial information for:",
                optionA = "designing marketing logos and product packages",
                optionB = "monitoring customer complaint queues",
                optionC = "internal managerial decision-making and external statutory reporting to third parties",
                optionD = "arranging staff sporting leagues",
                correctAnswerIndex = 2,
                explanation = "Accounting serves as an information system supplying financial reports to both internal decision-makers (managers) and external stakeholders (investors, creditors, tax authorities).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1995 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1995_004",
                subject = "Financial Accounting",
                topic = "Source Documents",
                year = "1995",
                questionText = "Which of the following pairs of accounting records are prime source documents providing original evidence of commercial transactions?",
                optionA = "Journals and ledgers",
                optionB = "Sales invoice and cash book",
                optionC = "Cash book and debit note",
                optionD = "Sales invoice and debit note",
                correctAnswerIndex = 3,
                explanation = "Invoices, debit notes, credit notes, and payment receipts are source documents. Journals and cash books are books of prime entry.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1995 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1995_005",
                subject = "Financial Accounting",
                topic = "Accounting Equation: Capital Calculation",
                year = "1995",
                questionText = "Given: Motor van ₦3,600, Premises ₦5,000, Bank Loan ₦1,000, Bank balance ₦1,650, Stock ₦4,800, Creditors ₦2,560, Cash ₦250, Debtors ₦6,910. Calculate Capital.",
                optionA = "₦19,650",
                optionB = "₦18,650",
                optionC = "₦17,850",
                optionD = "₦19,850",
                correctAnswerIndex = 1,
                explanation = "Total Assets = ₦3,600 + ₦5,000 + ₦1,650 + ₦4,800 + ₦250 + ₦6,910 = ₦22,210. Total Liabilities = ₦1,000 (Loan) + ₦2,560 (Creditors) = ₦3,560. Capital = Assets - Liabilities = ₦22,210 - ₦3,560 = ₦18,650.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1995 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_comp_1997_001",
                subject = "Financial Accounting",
                topic = "Nature & Scope of Accounting",
                year = "1997",
                questionText = "The most fundamental reason for studying and practicing financial accounting is that:",
                optionA = "the quantitative financial information provided by accounting is essential for making sound economic decisions",
                optionB = "accounting plays a minor role in ancient societies",
                optionC = "it allows companies to avoid all corporate taxation legally",
                optionD = "it replaces all computer programming functions",
                correctAnswerIndex = 0,
                explanation = "Accounting is the language of business; its ultimate value lies in providing objective financial intelligence that enables rational resource allocation and economic decisions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 1997 • Q1"
            )
        )

        return list
    }
}
