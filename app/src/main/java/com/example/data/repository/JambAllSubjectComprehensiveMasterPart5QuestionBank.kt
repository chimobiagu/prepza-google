package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB UTME Comprehensive Master Revision Bank Part 5.
 * Covers: Economics, Government, Literature in English, Christian Religious Studies, Principles of Accounts (100 Questions).
 */
object JambAllSubjectComprehensiveMasterPart5QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 6. ECONOMICS (1983 SERIES)
        // =========================================================================
        list.add(
            q("ecn_comp_1983_01", "Economics", "National Income Accounting", "1983",
                "Which of the following items is NOT included in measuring national income by the income approach?",
                "Wages and salaries of public servants", "Student grants and scholarships", "Profits of companies", "Rents on property",
                1, "Grants and scholarships are transfer payments. Since they are unearned and do not involve direct production of goods/services, they are excluded to avoid double counting.")
        )
        list.add(
            q("ecn_comp_1983_02", "Economics", "Theory of Demand & Supply", "1983",
                "A downward sloping demand curve intersects a fixed supply curve. A shift of this demand curve to the right implies that",
                "both price and quantity will increase", "only price increase", "only quantity increase", "the price falls",
                0, "A rightward shift of the demand curve indicates an increase in demand. With a fixed, upward-sloping supply curve, this bids up both equilibrium price and quantity.")
        )
        list.add(
            q("ecn_comp_1983_03", "Economics", "Location of Industries", "1983",
                "Which of the following items is NOT an argument for locating industries in rural areas?",
                "Rural areas supply agricultural raw material", "The pace of development will be quickened in rural areas", "Employment will be provided for rural inhabitants", "Capital is easily available in rural areas",
                3, "While rural areas offer advantages like raw materials and cheaper land, capital is concentrated in urban financial centers, making capital scarcity a major hurdle.")
        )
        list.add(
            q("ecn_comp_1983_04", "Economics", "Theory of Supply: Subsidies", "1983",
                "The curves S0S0 is the supply curve. What happens when government subsidizes producers in order to boost output?",
                "The supply curve will shift S0S0 to the left", "The supply curve will shift S0S0 to S1S1 (to the right)", "The supply curve remains unchanged", "The demand curve collapses",
                1, "Government subsidies reduce the cost of production for manufacturers. This financial assistance shifts the supply curve to the right (from S0S0 to S1S1).")
        )
        list.add(
            q("ecn_comp_1983_05", "Economics", "Population Economics", "1983",
                "The natural growth rate of a population is the",
                "Sum of the birth rate and the death rate", "Sum of the birth rate and the net migration", "Birth rate minus the death rate", "Birth rate divided by the net migration",
                2, "The natural growth rate measures population change strictly due to biological events (births and deaths), calculated as birth rate minus death rate.")
        )
        list.add(
            q("ecn_comp_1983_06", "Economics", "Factors of Production", "1983",
                "Which of the following sets fully represents factors of production?",
                "Sunlight, machinery, man, land", "Land, labour, capital, enterprise", "Capital, technology, ideas, market", "Money, market, middlemen, trade",
                1, "The four fundamental factors of production required to produce any goods or services are Land, Labour, Capital, and Enterprise.")
        )
        list.add(
            q("ecn_comp_1983_07", "Economics", "Production Possibility Curve & Opportunity Cost", "1983",
                "Based on the production possibilities table (P: 5 shelter, 0 food; Q: 4 shelter, 5 food; R: 3 shelter, 9 food; S: 2 shelter, 12 food; T: 0 shelter, 15 food), the real cost of a unit of food when alternative R is selected is",
                "One unit of shelter", "Three units of shelter", "One third of a unit of shelter", "Two units of shelter",
                2, "Moving from alternative R (3 shelter, 9 food) to alternative S (2 shelter, 12 food) results in gaining 3 units of food by sacrificing 1 unit of shelter. The opportunity (real) cost per unit of food is therefore 1/3 of a unit of shelter.")
        )
        list.add(
            q("ecn_comp_1983_08", "Economics", "Basic Economic Concepts: Efficiency", "1983",
                "The concept of economic efficiency primarily refers to",
                "Obtaining the maximum output from available resources at the lowest possible cost", "Conservation of our petroleum resources", "Equity in the distribution of the nation's wealth", "Producing without any government regulation",
                0, "Economic efficiency is achieved when resources are allocated and utilized to maximize the total output of goods and services at the minimum average cost.")
        )
        list.add(
            q("ecn_comp_1983_09", "Economics", "Theory of Production: Diminishing Returns", "1983",
                "If successive units of labour are added to a piece of land while capital and technology remain constant, a point will be reached in the level of production when each added unit of labour will add less to the output than previous units of labour. This describes",
                "The productivity of labour", "The law of diminishing marginal utility", "The law of diminishing returns", "The concept of factor intensity",
                2, "The Law of Diminishing Returns states that as equal increments of a variable input are added to a fixed factor, a point is reached where the marginal product begins to decline.")
        )
        list.add(
            q("ecn_comp_1983_11", "Economics", "Theory of Demand: Law of Demand", "1983",
                "A Nigerian household's demand curve for semovita is downward sloping because",
                "The demand for semovita is high", "The local markets are flooded with semovita", "It is produced in Nigeria", "Higher prices attract lower quantities while lower prices attract larger quantities",
                3, "The downward slope of a standard demand curve represents the law of demand: an inverse relationship where quantity demanded decreases as price increases.")
        )
        list.add(
            q("ecn_comp_1983_12", "Economics", "Price Determination: Market Equilibrium", "1983",
                "Based on the market schedule for semovita (₦5.00: 10,000 demanded, 6,000 supplied; ₦6.00: 7,000 demanded, 7,000 supplied; ₦7.00: 5,000 demanded, 9,000 supplied), what is the market equilibrium price?",
                "₦5.00", "₦8.00", "₦7.00", "₦6.00",
                3, "Market equilibrium is established at the price where quantity demanded equals quantity supplied. According to the schedule, at ₦6.00, both are exactly 7,000 bags.")
        )
        list.add(
            q("ecn_comp_1983_13", "Economics", "Theory of Costs", "1983",
                "Marginal cost curve intersects average cost curve",
                "From above at its lowest point", "From below before the lowest point", "From below at its lowest point", "From below after the lowest point",
                2, "The mathematical relationship between average cost and marginal cost dictates that MC equals AC only when AC is at its minimum. Thus, the MC curve intersects the AC curve from below at its lowest point.")
        )
        list.add(
            q("ecn_comp_1983_14", "Economics", "Location of Industries: Raw Materials", "1983",
                "Palm oil industry is located in Bendel State because the state",
                "Imports raw material for palm oil industry", "Is a palm tree growing area", "Soil is unsuitable for other crops", "Government bans other industries",
                1, "Industries processing heavy, bulky agricultural raw materials localize near the source of raw materials to minimize transportation costs.")
        )
        list.add(
            q("ecn_comp_1983_15", "Economics", "Inflation & Wage Dynamics", "1983",
                "The meaning of 'wage-price spiral' is",
                "Wages and prices are rising at a proportional rate", "Higher wages lead to higher costs, which raise prices, forcing further wage demands", "Wages rise while prices fall", "Prices rise while wages are frozen",
                1, "A wage-price spiral represents a feedback loop where wage increases drive up production costs, leading firms to raise prices, which in turn leads workers to demand even higher wages.")
        )
        list.add(
            q("ecn_comp_1983_16", "Economics", "Inflation Concepts", "1983",
                "In an inflationary period which of the following statements is NOT true?",
                "Wages rise simultaneously with prices", "The purchasing power of money diminishes", "More money runs after a limited quantity of goods", "Aggregate real demand exceeds aggregate real supply",
                0, "During inflation, wage increases typically lag behind rising prices, which causes real wages and the purchasing power of workers to decline. Wages do not rise simultaneously.")
        )
        list.add(
            q("ecn_comp_1983_17", "Economics", "Channels of Distribution", "1983",
                "Retailers in an economy perform the function of",
                "Production", "Exchange", "Distribution", "Hoarding",
                2, "Retailers are the final link in the channel of distribution. They purchase goods in relatively large quantities from wholesalers and distribute them in small units to final consumers.")
        )
        list.add(
            q("ecn_comp_1983_18", "Economics", "Business Organizations: Sole Proprietorship", "1983",
                "In a sole proprietorship the decisions are made by the",
                "Government", "Board of directors", "Management committee", "Owner",
                3, "A sole proprietorship is owned and managed by a single individual. Consequently, the sole owner enjoys absolute decision-making authority and takes all responsibility.")
        )
        list.add(
            q("ecn_comp_1983_19", "Economics", "Public Corporations & Utilities", "1983",
                "Which of the following enterprises does NOT pursue the sole objective of profit maximization?",
                "Roads Nigeria Ltd.", "Union Bank of Nigeria Ltd.", "Nigerian Electric Power Authority", "Volkswagen (VW) Nigeria Ltd.",
                2, "The Nigerian Electric Power Authority (NEPA) was a public utility corporation established to provide essential utilities, prioritizing public welfare and service over profit.")
        )
        list.add(
            q("ecn_comp_1983_20", "Economics", "Public Finance: Fiscal Policy", "1983",
                "Public expenditure creates expansionary effects in the economy when it is",
                "In excess of government revenue", "Channelled into foreign reserves", "Diverted into imported luxuries", "Completely financed through heavy direct taxes",
                0, "When public expenditure exceeds government revenue (deficit budgeting), it injects extra purchasing power into the economy, boosting aggregate demand.")
        )
        list.add(
            q("ecn_comp_1983_23", "Economics", "Public Finance: Taxation", "1983",
                "Which of the following are direct taxes?",
                "Sales taxes", "Excise duties", "Income and company taxes", "Tariff duties",
                2, "Direct taxes are levied directly on the income or wealth of individuals and corporate organizations, and the tax burden cannot be shifted to another person.")
        )

        // =========================================================================
        // 7. GOVERNMENT (1983 - 2015 SERIES)
        // =========================================================================
        list.add(
            q("gov_comp_2012_02", "Government", "Basic Concepts: The State", "2012",
                "The distinctive attribute of a state is:",
                "population", "territory", "sovereignty", "government",
                2, "Sovereignty is the supreme, independent authority of a state to make, interpret, and enforce laws over its territory free from external interference.")
        )
        list.add(
            q("gov_comp_1983_23", "Government", "Electoral Systems: Direct Democracy", "1983",
                "A system of voting in which voters are asked a direct 'yes' or 'no' question on a major national issue is called a:",
                "referendum", "plebiscite", "run-off election", "primary election",
                0, "A referendum is a direct vote in which an entire electorate is invited to vote on a particular proposal, law, or constitutional issue.")
        )
        list.add(
            q("gov_comp_2010_01", "Government", "Organs of Government: Executive", "2010",
                "The branch of government responsible for the execution of laws is the:",
                "Legislature", "Judiciary", "Executive", "Civil Service",
                2, "The Executive arm of government is constitutionally mandated to implement and enforce laws passed by the legislature.")
        )
        list.add(
            q("gov_comp_2010_05", "Government", "Political Structures: Confederation", "2010",
                "A major feature of a confederation is that:",
                "power is concentrated at the center", "member states retain their sovereignty", "there is no central government", "the constitution is rigid and supreme",
                1, "In a confederation, weak central authority is established by treaty, while the constituent member states retain their sovereignty and independence.")
        )
        list.add(
            q("gov_comp_2010_10", "Government", "Nigerian Constitutional Development", "2010",
                "The first constitution in Nigeria that introduced a federal system of government was the:",
                "Clifford Constitution", "Richards Constitution", "Lyttelton Constitution", "Macpherson Constitution",
                2, "The 1954 Lyttelton Constitution formally established federalism in Nigeria by sharing powers between the central government and the regions.")
        )
        list.add(
            q("gov_comp_2011_15", "Government", "Organs of Government: Judiciary", "2011",
                "The primary role of the judiciary is to:",
                "make laws", "execute laws", "interpret laws", "enforce laws",
                2, "The judiciary is the branch of government empowered to interpret, apply, and explain the meaning of laws in dispute cases.")
        )
        list.add(
            q("gov_comp_2011_18", "Government", "Systems of Government: Presidential System", "2011",
                "A system of government where the head of state is also the head of government is:",
                "Presidential", "Parliamentary", "Monarchy", "Oligarchy",
                0, "In a presidential system (e.g., USA, Nigeria), executive power is concentrated in a president who serves as both Head of State and Head of Government.")
        )
        list.add(
            q("gov_comp_2011_25", "Government", "Decentralization & Devolution", "2011",
                "The delegation of administrative powers to lower levels of government is known as:",
                "centralization", "devolution", "concentration", "nationalization",
                1, "Devolution is the statutory delegation of powers from the central government of a sovereign state to govern at a subnational level, such as a regional or local level.")
        )
        list.add(
            q("gov_comp_2012_30", "Government", "Franchise & Suffrage", "2012",
                "The process of denying an individual the right to vote is called:",
                "enfranchisement", "disenfranchisement", "registration", "gerrymandering",
                1, "Disenfranchisement is the explicit revocation of the right of suffrage (the right to vote) of a person or group of people.")
        )
        list.add(
            q("gov_comp_2012_35", "Government", "Political Ideologies: Socialism", "2012",
                "The system of government based on public ownership of the means of production is:",
                "Capitalism", "Socialism", "Feudalism", "Fascism",
                1, "Socialism is an economic and political system characterized by social or public ownership and democratic control of the means of production.")
        )
        list.add(
            q("gov_comp_2013_01", "Government", "Nigerian Nationalism", "2013",
                "Who is regarded as the father of Nigerian nationalism?",
                "Nnamdi Azikiwe", "Obafemi Awolowo", "Herbert Macaulay", "Ahmadu Bello",
                2, "Herbert Macaulay founded the Nigerian National Democratic Party (NNDP) in 1923 and is widely celebrated as the father of Nigerian nationalism.")
        )
        list.add(
            q("gov_comp_2013_12", "Government", "Rule of Law", "2013",
                "The rule of law implies that:",
                "judges are above the law", "the executive is supreme", "everyone is equal before the law", "military decrees supersede the constitution",
                2, "The principle of the Rule of Law asserts that law is supreme, and all individuals, including rulers and public officials, are equal under it.")
        )
        list.add(
            q("gov_comp_2013_15", "Government", "Systems of Government: Parliamentary", "2013",
                "Which of the following countries practices a parliamentary system of government?",
                "USA", "Nigeria", "Great Britain", "France",
                2, "Great Britain operates a classical parliamentary system, where executive power is held by a Prime Minister selected from the legislature.")
        )
        list.add(
            q("gov_comp_2014_08", "Government", "Party Systems: Multi-Party", "2014",
                "A major disadvantage of a multi-party system is that it:",
                "limits democratic choices", "leads to unstable coalition governments", "encourages dictatorship", "is expensive to operate",
                1, "In multi-party systems, no single party often wins an absolute majority, forcing unstable, fragile coalitions that easily collapse under policy disagreements.")
        )
        list.add(
            q("gov_comp_2014_21", "Government", "Pressure Groups", "2014",
                "The main objective of pressure groups is to:",
                "win elections", "form a cabinet", "influence government policies", "overthrow the government",
                2, "Pressure groups do not contest elections directly; instead, they seek to influence public policy decisions in favor of their specific interest.")
        )
        list.add(
            q("gov_comp_2014_25", "Government", "Electoral Commissions in Nigeria", "2014",
                "The non-partisan body responsible for conducting elections in Nigeria is currently:",
                "FEDECO", "NEC", "INEC", "NECON",
                2, "The Independent National Electoral Commission (INEC) is the statutory body established to oversee and conduct elections in Nigeria.")
        )
        list.add(
            q("gov_comp_2015_30", "Government", "Constitutions: Rigid & Flexible", "2015",
                "A written constitution is said to be rigid if:",
                "it is extremely long", "it cannot be amended at all", "the amendment process is difficult and complicated", "it was written by a military dictator",
                2, "A rigid constitution requires a special, complex, and highly demanding legislative process (such as a two-thirds majority) for any amendments.")
        )
        list.add(
            q("gov_comp_2015_35", "Government", "Political Theory: Sovereignty", "2015",
                "The concept of sovereignty was popularized in political science by:",
                "Thomas Hobbes", "Jean Bodin", "John Locke", "Baron de Montesquieu",
                1, "The French jurist Jean Bodin popularized the modern theory of sovereignty in his 1576 work, 'Six Books of the Commonwealth'.")
        )
        list.add(
            q("gov_comp_2015_40", "Government", "Colonial Administration: Assimilation", "2015",
                "The policy of Assimilation was practiced in West Africa by the:",
                "British", "French", "Portuguese", "Germans",
                1, "The French colonial administration used the Policy of Assimilation to systematically turn West African subjects into French citizens.")
        )
        list.add(
            q("gov_comp_2015_45", "Government", "International Organizations: United Nations", "2015",
                "The primary administrative organ of the United Nations is the:",
                "General Assembly", "Security Council", "Secretariat", "International Court of Justice",
                2, "The Secretariat, headed by the Secretary-General, is the UN's chief administrative organ, running day-to-day operations and executing programs.")
        )

        // =========================================================================
        // 8. LITERATURE IN ENGLISH (2010 - 2015 SERIES)
        // =========================================================================
        list.add(
            q("lit_comp_2010_08", "Literature in English", "Shakespearean Drama: Romeo and Juliet", "2010",
                "\"O serpent heart, hid with a flowering face!\" The statement above refers to:",
                "Juliet", "Romeo", "Tybalt", "Benvolio",
                1, "Juliet uses this oxymoron to describe Romeo upon learning that he has slain her cousin Tybalt, expressing her internal conflict.")
        )
        list.add(
            q("lit_comp_2012_18", "Literature in English", "Non-African Prose: Native Son", "2012",
                "In Richard Wright's Native Son, Bigger Thomas kills Mary Dalton primarily due to:",
                "deep-seated hatred", "fear of being discovered in her room", "political motives", "greed for her family's wealth",
                1, "Bigger smothers Mary with a pillow out of sheer terror of being discovered by Mrs. Dalton (Mary's blind mother) inside Mary's bedroom.")
        )
        list.add(
            q("lit_comp_2012_28", "Literature in English", "Non-African Poetry: Bat by D.H. Lawrence", "2012",
                "In Lawrence's Bat, the poet persona mistakes the bats for",
                "owls", "swallows", "pipistrello", "sparrows",
                1, "In D.H. Lawrence's poem, the speaker sitting on the terrace at evening initially mistakes the flying bats for swallows.")
        )
        list.add(
            q("lit_comp_2012_29", "Literature in English", "Non-African Poetry: Journey of the Magi", "2012",
                "In Eliot's Journey of the Magi, the magi are aided on their journey by",
                "donkeys", "horses", "camels", "chariots",
                2, "T.S. Eliot's poem describes the difficult winter trek of the Magi, explicitly mentioning their 'camels galled, sore-footed, refractory'.")
        )
        list.add(
            q("lit_comp_2012_30", "Literature in English", "Non-African Poetry: Wendy Cope", "2012",
                "According to Cope’s Sonnet VII, poetry is basically _______.",
                "boring", "therapeutic", "philosophical", "inspiring",
                1, "Wendy Cope’s Sonnet VII discusses the comfort and healing that poetry can bring, emphasizing its therapeutic nature.")
        )
        list.add(
            q("lit_comp_2012_31", "Literature in English", "Literary Principles: Drama Forms", "2012",
                "A play which mainly aims at provoking excessive laughter is called:",
                "Tragedy", "Comedy", "Farce", "Melodrama",
                2, "A Farce is a highly exaggerated, lighthearted dramatic work utilizing improbable situations and physical humor designed to provoke immediate laughter.")
        )
        list.add(
            q("lit_comp_2012_39", "Literature in English", "Literary Terms & Genres", "2012",
                "A writer's account of his or her own life is known as:",
                "travelogue", "autobiography", "catalogue", "memoir",
                1, "An autobiography is a comprehensive, self-written chronological biography detailing the life experiences and history of the author.")
        )
        list.add(
            q("lit_comp_2012_40", "Literature in English", "Literary Devices: Satire", "2012",
                "Satirical writing primarily employs _______.",
                "epigram", "synecdoche", "irony", "onomatopoeia",
                2, "Satire exposes folly, hypocrisy, and vice in human nature or society, relying heavily on irony, sarcasm, and wit.")
        )
        list.add(
            q("lit_comp_2012_41_kb", "Literature in English", "African Drama: King Baabu", "2012",
                "\"Basha: You dumb skull of a bone head . . . you will face court martial for this. You look everywhere? You search inside toilet bowl?\" — Wole Soyinka: King Baabu. The person being addressed above is a:",
                "soldier", "student", "domestic servant", "lawyer",
                0, "Basha addresses his subordinates with threats of a 'court martial', indicating the military context and the soldier status of the addressee.")
        )
        list.add(
            q("lit_comp_2013_21", "Literature in English", "African Poetry: Gbemisola Adeoti", "2013",
                "The movement in Adeoti's Naked Soles is characterized by",
                "hope and agreement", "freedom and self-determination", "pricks and tears", "disappointed and disarray",
                2, "In 'Naked Soles', Gbemisola Adeoti writes about the physical and emotional distress of walking barefoot, utilizing imagery of pricks, thorns, and tears.")
        )
        list.add(
            q("lit_comp_2014_42", "Literature in English", "African Poetry: Birago Diop", "2014",
                "\"What eyes will watch our large mouths, / Shaped by the laughter of big children / What eyes will watch our large mouths?\" — Birago Diop: Vanity. The tone of the lines above is one of:",
                "sarcasm", "sacrilege", "chiasmus", "eulogy",
                0, "In 'Vanity', the poet's rhetorical questions mock the foolishness of complaining and self-pity, conveying a sharp, sarcastic, and cynical tone.")
        )
        list.add(
            q("lit_comp_2014_43", "Literature in English", "Poetic Structure & Rhyme Scheme", "2014",
                "Identify the rhyme scheme of the following stanza: 'The old man slept in his favourite chair / The wind ran its fingers through his hair / He looked like a tree gone dry of sap / And his hands were dry upon his lap'",
                "bbaa", "aabb", "abab", "abba",
                1, "'Chair' (A) rhymes with 'hair' (A). 'Sap' (B) rhymes with 'lap' (B). This forms a classical twin-couplet rhyme scheme of AABB.")
        )
        list.add(
            q("lit_comp_2014_20", "Literature in English", "Non-African Prose: The Old Man and the Sea", "2014",
                "Santiago's second dream in Hemingway's The Old Man and the Sea occurs:",
                "the night before his fishing expedition", "in his house", "at the end of the book", "when he sleeps on the boat for a few hours",
                3, "Santiago falls asleep briefly while waiting out the giant marlin on his boat, where he experiences his second recurring dream of lions playing on African beaches.")
        )
        list.add(
            q("lit_comp_2015_19", "Literature in English", "Non-African Prose: Native Son", "2015",
                "Weekly, Bigger Thomas in Native Son is to be paid:",
                "twenty dollars", "twenty-five dollars", "thirty dollars", "thirty-five dollars",
                0, "Mr. Dalton hires Bigger Thomas as his family's chauffeur and offers him a weekly salary of exactly twenty dollars.")
        )
        list.add(
            q("lit_comp_2015_20", "Literature in English", "Non-African Prose: Native Son", "2015",
                "Mr. Dalton is of the opinion that Negroes are happier when they are:",
                "together", "servants in the white family", "educated", "given some respect",
                0, "Mr. Dalton is a white philanthropist who despite supporting black charities, maintains segregated views, believing black people are happier living in their own communities.")
        )
        list.add(
            q("lit_comp_2015_21", "Literature in English", "African Drama: The Wives' Revolt", "2015",
                "In J.P. Clark's Wives Revolt, the central idea is that gender equality is:",
                "both undesirable and unattainable", "desirable but unattainable", "attainable and desirable", "obnoxious but desirable",
                2, "Clark’s satirical comedy highlights the female strike to emphasize that balanced gender roles are attainable and highly desirable for societal progress.")
        )
        list.add(
            q("lit_comp_2015_22", "Literature in English", "African Drama: The Wives' Revolt", "2015",
                "In their flight, the women in Wives Revolt settle at Iyara in order to:",
                "cure cross-piece", "hurt their husbands", "forestall reconciliation", "seek peace",
                2, "The women stage a mass exodus from the village and set up camp in the neighboring village of Iyara to resist early compromise and forestall quick reconciliation.")
        )
        list.add(
            q("lit_comp_2011_19", "Literature in English", "Non-African Prose: Nineteen Eighty-Four", "2011",
                "The designated location Room 101 in George Orwell's Nineteen Eighty-Four symbolises a place of:",
                "rest", "fun", "humiliation", "torture",
                3, "Room 101 is the dreaded torture chamber inside the Ministry of Love where the Party forces prisoners to confront their worst, most visceral nightmares.")
        )
        list.add(
            q("lit_comp_2011_20", "Literature in English", "Non-African Prose: Nineteen Eighty-Four", "2011",
                "Orwell's Nineteen Eighty-Four can best be described as a novel that is:",
                "optimistic", "antagonistic", "persuasive", "pessimistic",
                3, "The novel's dark dystopian themes, total suppression of humanity, and the ultimate, hopeless defeat of Winston Smith render its outlook highly pessimistic.")
        )
        list.add(
            q("lit_comp_2012_41_cer", "Literature in English", "Literary Devices: Figures of Speech", "2012",
                "\"O! Ceremony, show me but thy worth / What is thy soul of adoration?\" The literary device in the lines above is:",
                "antithesis", "invocation", "personification", "apostrophe",
                3, "An apostrophe is a rhetorical figure of speech where a speaker directly addresses an absent person, abstract idea, or non-human entity (such as 'Ceremony').")
        )

        // =========================================================================
        // 9. CHRISTIAN RELIGIOUS STUDIES (1983 SERIES)
        // =========================================================================
        list.add(
            q("crk_comp_1983_01", "Christian Religious Studies", "Old Testament: Elijah & Prophets", "1983",
                "Who said this: ‘there shall be neither dew nor rain these years except by my word?’",
                "Elisha", "Ezekiel", "Elijah", "Obadiah",
                2, "Elijah the Tishbite declared this severe drought to King Ahab of Israel as a direct sign of Yahweh's judgment against Baal worship.")
        )
        list.add(
            q("crk_comp_1983_02", "Christian Religious Studies", "Old Testament: Wisdom of Solomon", "1983",
                "In the case before Solomon over the dead and the living child, the mother of the dead child supported",
                "giving the living child to her opponent", "killing the living child", "joint ownership of the living child", "king Solomon having the living child",
                1, "In 1 Kings 3:26, the mother of the dead child supported dividing the baby, saying, 'It shall be neither mine nor yours; divide it!'")
        )
        list.add(
            q("crk_comp_1983_03", "Christian Religious Studies", "Old Testament: Moses & Joshua", "1983",
                "Before Moses died, God appointed _______ to succeed him.",
                "Joshua", "Aaron", "Eleazar", "Balaam",
                0, "God explicitly commanded Moses to commission Joshua, the son of Nun, as his successor to lead the Israelites into the Promised Land.")
        )
        list.add(
            q("crk_comp_1983_04", "Christian Religious Studies", "Old Testament: Wilderness Journey", "1983",
                "The treatment for those bitten by the fiery serpent in the wilderness was to",
                "drink from the Red Sea", "look at the bronze serpent", "fast for seven days", "call upon Aaron",
                1, "In Numbers 21:9, Moses made a bronze serpent and set it on a pole; everyone who was bitten by a serpent lived after looking at it.")
        )
        list.add(
            q("crk_comp_1983_05", "Christian Religious Studies", "Old Testament: Joseph in Egypt", "1983",
                "In order that Benjamin might be brought to Egypt, Joseph detained",
                "Reuben", "Levi", "Judah", "Simeon",
                3, "Joseph kept Simeon bound in Egypt as collateral to force his brothers to bring their youngest brother, Benjamin, back to Egypt.")
        )
        list.add(
            q("crk_comp_1983_06", "Christian Religious Studies", "Old Testament: Joseph in Egypt", "1983",
                "When Joseph’s brothers came to him in Egypt, he said to them, ‘You are _______.’",
                "spies", "robbers", "traitors", "sinners",
                0, "Joseph accused his brothers of being foreign spies sent to inspect the defenseless areas ('the nakedness') of Egypt.")
        )
        list.add(
            q("crk_comp_1983_07", "Christian Religious Studies", "Old Testament: Abraham & Sarah", "1983",
                "Sarah gave birth to _______ in her old age.",
                "Joseph", "Isaac", "Jacob", "Simeon",
                1, "In accordance with God's promise, Sarah conceived and bore Abraham a son in his old age, whom Abraham named Isaac.")
        )
        list.add(
            q("crk_comp_1983_08", "Christian Religious Studies", "Old Testament: Covenant with Abraham", "1983",
                "As a condition of his covenant with God, Abraham had to",
                "circumcise every male", "sacrifice to God every month", "keep the Sabbath", "pray to God daily",
                0, "In Genesis 17, God instituted the circumcision of every male child on the eighth day as the physical sign of His covenant with Abraham.")
        )
        list.add(
            q("crk_comp_1983_09", "Christian Religious Studies", "Old Testament: Creation Story", "1983",
                "What was the condition of the earth before the creation of the world?",
                "The earth was without form and void.", "There was a firmament above the earth.", "Light infrequently penetrated the earth.", "The earth was inhabited by spirits.",
                0, "Genesis 1:2 states that the earth was formless, empty, and enveloped in deep darkness before God began the active process of creation.")
        )
        list.add(
            q("crk_comp_1983_10", "Christian Religious Studies", "Old Testament: The Great Flood", "1983",
                "God wanted to destroy the world because",
                "Adam and Eve disobeyed him", "Cain killed Abel his brother", "the wickedness of man was great on the earth", "the people made a tower of Babel",
                2, "Genesis 6:5 states that God saw that the wickedness of man was great on the earth, which grieved Him and led to His decree to send the Flood.")
        )
        list.add(
            q("crk_comp_1983_11", "Christian Religious Studies", "Old Testament: Solomon's Accession", "1983",
                "What did Adonijah do to show that he feared Solomon?",
                "begged Solomon for forgiveness", "promised Solomon loyal support", "caught hold of the horns of the altar", "ran into the Temple",
                2, "To secure royal protection and escape execution after his failed attempt to usurp the throne, Adonijah caught hold of the horns of the altar.")
        )
        list.add(
            q("crk_comp_1983_12", "Christian Religious Studies", "Old Testament: Building the Temple", "1983",
                "Where did Solomon get the timber for his building?",
                "Egypt", "Jerusalem", "Phoenicia", "Lebanon",
                3, "Solomon established a trade treaty with King Hiram of Tyre to supply cedar and cypress timber from the forests of Lebanon.")
        )
        list.add(
            q("crk_comp_1983_13", "Christian Religious Studies", "Old Testament: Jeremiah's Prophecies", "1983",
                "According to Jeremiah’s prophecy, the domination of nations by Nebuchadnezzar was",
                "against the wish of God", "part of the divine purpose", "the result of his military might", "the result of the righteousness of nations",
                1, "Jeremiah preached that Nebuchadnezzar served as an instrument of God's sovereign wrath to bring divine judgment upon Israel and neighboring nations.")
        )
        list.add(
            q("crk_comp_1983_14", "Christian Religious Studies", "Old Testament: Call of Ezekiel", "1983",
                "Ezekiel was ordered to eat _______ and then go to speak to the house of Israel.",
                "honey", "locusts", "bread", "a scroll",
                3, "In Ezekiel 3:1-3, God commanded the prophet to eat a written scroll to symbolize digesting and internalizing the divine words of warning.")
        )
        list.add(
            q("crk_comp_1983_15", "Christian Religious Studies", "Old Testament: Faith of Abraham", "1983",
                "The place where Abraham was asked to sacrifice Isaac was",
                "Moriah", "Sinai", "Bethel", "Tabor",
                0, "God tested Abraham's faith by commanding him to travel to the land of Moriah and offer Isaac as a burnt offering on a mountain.")
        )
        list.add(
            q("crk_comp_1983_16", "Christian Religious Studies", "Old Testament: Isaac & Rebekah", "1983",
                "The one who was to be the wife of Isaac was known",
                "by her coming to the well to draw water", "because she was a descendant of Abraham’s brother", "because she said ‘Drink, and I will water your camels’", "because her name was Rebecca",
                2, "Abraham's servant Eliezer prayed for a specific sign of hospitality, which Rebekah fulfilled by offering to water all his thirsty camels.")
        )
        list.add(
            q("crk_comp_1983_17", "Christian Religious Studies", "Old Testament: Joshua & Achan's Sin", "1983",
                "Achan was",
                "one of the spies who visited Rahab in Jericho", "one of the two men who prophesied in the camp", "one of the judges of Israel", "the one who took some of the devoted things when Jericho fell",
                3, "Achan violated Yahweh's ban by stealing gold, silver, and clothing from Jericho, bringing divine anger and military defeat upon Israel.")
        )
        list.add(
            q("crk_comp_1983_18", "Christian Religious Studies", "Old Testament: David & Saul", "1983",
                "‘How is it you were not afraid to put forth your hand to destroy the Lord’s anointed?’ was said by",
                "Elijah to Ahab when Ahab sought to kill him", "David to the Amalekite who claimed to have killed Saul", "Joab to Absalom when the latter rebelled", "David to Saul when Saul attacked him",
                1, "David condemned the Amalekite runner to death because he dared to take credit for executing King Saul, the anointed king of Israel.")
        )
        list.add(
            q("crk_comp_1983_20", "Christian Religious Studies", "Old Testament: The Exodus & Plagues", "1983",
                "What was the last miracle God performed before the Israelites were released from Egypt?",
                "Thick darkness brought about by the hot wind ‘Khamisin’", "The pollution of the Nile", "The plague of locusts", "The slaughter of the first born",
                3, "The tenth plague, which claimed the firstborn of every Egyptian home, finally broke Pharaoh's stubbornness and forced him to release Israel.")
        )
        list.add(
            q("crk_comp_1983_21", "Christian Religious Studies", "Old Testament: Contest on Mount Carmel", "1983",
                "Who was the prophet who proved on Mount Carmel that Yahweh is greater than Baal?",
                "Elijah", "Elisha", "Nathan", "Hosea",
                0, "Elijah challenged the 450 prophets of Baal to a contest on Mount Carmel to demonstrate that Yahweh is the only true living God.")
        )

        // =========================================================================
        // 10. PRINCIPLES OF ACCOUNTS (1994 - 1995 SERIES)
        // =========================================================================
        list.add(
            q("acc_comp_1994_01", "Principles of Accounts", "Accounting Concepts: Time Period", "1994",
                "The term ‘accounting period’ is used to refer to the",
                "time span during which taxes are paid to the Inland Revenue Board", "Budget period, usually one year, relied on by the accountant", "time span, usually one year covered by financial statement", "period within which debtors are expected to settle accounts",
                2, "The accounting period concept divides the continuous life of a business entity into regular, equal time intervals to measure periodic performance.")
        )
        list.add(
            q("acc_comp_1994_02", "Principles of Accounts", "Accounting Concepts: Matching Concept", "1994",
                "Assigning revenues to the accounting period in which goods were sold or services rendered and expenses incurred is known as",
                "passing of entries", "consistency convention", "matching concept", "adjusting for revenue",
                2, "Under the matching concept, revenues earned must be associated and recorded alongside all related expenses incurred to generate them within the same period.")
        )
        list.add(
            q("acc_comp_1994_03", "Principles of Accounts", "Accounting Conventions: Prudence & Conservatism", "1994",
                "The accounting convention which states that ‘profit must not be recognized until realized while all losses should be adequately provided for’ is termed",
                "materiality", "objectivity", "consistency", "conservatism",
                3, "Conservatism (or prudence) requires that accountants play safe by recognizing all anticipated losses immediately while delaying profit recognition until certain.")
        )
        list.add(
            q("acc_comp_1994_04", "Principles of Accounts", "Role & Users of Accounting Information", "1994",
                "Accounting information is used by investors and creditors of a company to predict",
                "future cash flows of the company", "future tax payments of the company", "potential merger candidates for the company", "appropriate remuneration for the company’s staff",
                0, "Investors and creditors depend on financial records to evaluate the capacity of a business to generate positive net cash inflows for future dividends or interest.")
        )
        list.add(
            q("acc_comp_1994_05", "Principles of Accounts", "Double Entry: Non-Current Assets", "1994",
                "Antics Electronics Company recently bought six generators. Which of the following is the correct method of recording this transaction?",
                "Debit generator account and credit cash account.", "Debit purchases account and credit cash account.", "Debit cash account and credit purchases account.", "Debit cash account and credit generator account.",
                0, "Since generators are non-current assets purchased for long-term use rather than resale, the transaction must be recorded by debiting the specific asset (Generator) account and crediting Cash.")
        )
        list.add(
            q("acc_comp_1994_06", "Principles of Accounts", "Capital & Revenue Expenditure", "1994",
                "When a business incurs labour cost in installing a fixed asset, the cost is treated as",
                "additional cost to the asset", "business wages and salaries", "installation cost of the asset", "business cost of the asset",
                0, "Capital expenditure rules dictate that any directly attributable costs, such as installation wages, required to bring a non-current asset to its functional state must be capitalized as part of the asset's cost.")
        )
        list.add(
            q("acc_comp_1994_07", "Principles of Accounts", "Double Entry Principles", "1994",
                "What is the cardinal rule of the double entry system?",
                "Debit the increasing account and credit the decreasing account.", "Debit the receiving account and credit the giving account.", "Debit the asset account and credit the liability account.", "Debit the revenue account and credit the expenditure account.",
                1, "The fundamental pillar of double-entry bookkeeping states that for every transaction, the account that receives value is debited, and the account that gives value is credited.")
        )
        list.add(
            q("acc_comp_1994_08", "Principles of Accounts", "Correction of Errors: Types of Errors", "1994",
                "Malam Gambo bought a freezer for his shop costing ₦10,500. In recording, he debited office expenses account. What type of error is this?",
                "Error of commission", "Error of reversal of entries", "Error of principle", "Compensation error",
                2, "This represents an error of principle because Malam Gambo violated basic accounting standards by treating a capital asset transaction (freezer) as a revenue expenditure (office expense).")
        )
        list.add(
            q("acc_comp_1994_09", "Principles of Accounts", "Ledger Accounts & Folios", "1994",
                "The use of the folio in the ledger is for",
                "Referencing purposes", "Particulars of the transaction", "the account titles", "Only credit items",
                0, "Folio columns in journals and ledgers are utilized exclusively as cross-references to trace ledger entries back to their original journals and vice-versa.")
        )
        list.add(
            q("acc_comp_1994_10", "Principles of Accounts", "Balancing Ledger Accounts", "1994",
                "Account of Tanko Nig Ltd. Dr. Side: 1/10 Bal. b/f 5,000; Sales 10,000. Cr. Side: 2/10 Cash 3,000; 15/10 Bank 6,500. What is the closing balance of the account shown above?",
                "₦5,000", "₦6,500", "₦5,500", "₦15,000",
                2, "Total debits equal ₦15,000 (5,000 + 10,000) and total credits equal ₦9,500 (3,000 + 6,500). Subtracting credits from debits yields a closing debit balance of ₦5,500.")
        )
        list.add(
            q("acc_comp_1994_11", "Principles of Accounts", "Suspense Account & Trial Balance", "1994",
                "The suspense account is used to correct bookkeeping errors where the",
                "amount involved is quite significant", "item involved is not material", "item involved is unknown", "error does not affect the agreement of the trial balance",
                3, "A suspense account is a temporary holding account used only when double-entry records disagree, meaning that errors which do not disrupt trial balance equilibrium cannot be corrected through it.")
        )
        list.add(
            q("acc_comp_1994_12", "Principles of Accounts", "Three-Column Cash Book: Discounts", "1994",
                "The discount column of a three column cashbook is not balanced off but periodically transferred to the discount accounts because discounts:",
                "are not important in cash book", "are cash items only", "do not form part of double entry", "are used for bank reconciliation",
                2, "The discount columns in a cashbook serve merely as a memorandum; their totals are separately transferred to the Discount Allowed and Discount Received ledger accounts to complete the double entry.")
        )
        list.add(
            q("acc_comp_1994_13", "Principles of Accounts", "Petty Cash & Imprest System", "1994",
                "When is a petty cash account debited?",
                "When the fund is established and every time money is spent", "when the fund is established and every time it is replenished", "when the fund is established and when the size of the float is decreased", "Every time money is drawn from the petty cash",
                1, "The petty cash account is debited initially to set up the cash float and subsequently when the fund is replenished back to its original amount.")
        )
        list.add(
            q("acc_comp_1994_14", "Principles of Accounts", "Bank Reconciliation Statement", "1994",
                "When preparing a bank reconciliation statement, which of the following is deducted from the balance per bank statement?",
                "Bank charges", "Uncleared cheques", "returned cheques", "Unpresented cheques",
                3, "Unpresented cheques (cheques issued to creditors but not yet presented for payment) must be deducted from the balance per bank statement to align it with the cash book.")
        )
        list.add(
            q("acc_comp_1994_15", "Principles of Accounts", "Financial Statements: Balance Sheet", "1994",
                "The financial position of an organization at a particular time can be ascertained from the",
                "statement of sources and application of funds", "statement of retained earnings", "balance sheet", "profit and loss account",
                2, "The Balance Sheet (or Statement of Financial Position) lists an organization's assets, liabilities, and equity at a specific point in time to show its financial health.")
        )
        list.add(
            q("acc_comp_1995_01", "Principles of Accounts", "History & Development of Accounting", "1995",
                "Which of the following factors has aided the development of Accounting?",
                "The emergency of nation states", "The discovery of mineral resources in commercial quantity", "The growth in size of businesses and the separation of ownership and management", "The development and management of a sophisticated monetary system",
                2, "As businesses expanded into joint-stock companies, the separation of company owners (shareholders) from day-to-day managers necessitated objective reporting and stewardship auditing.")
        )
        list.add(
            q("acc_comp_1995_02", "Principles of Accounts", "Accounting Concepts: Accruals", "1995",
                "Which of the following concepts stipulates that accounting profit is the difference between revenue and expenses?",
                "Accrual concept", "Conservation Concept", "Prudence Concept", "Materiality concept",
                0, "The accrual concept dictates that revenue and expenses are recognized as they are earned or incurred (rather than when cash is moved), defining accounting profit.")
        )
        list.add(
            q("acc_comp_1995_03", "Principles of Accounts", "Objectives of Accounting Information", "1995",
                "An effective accounting system should provide information",
                "on new products and methods", "for customer feedback and requirements", "on internal and external reporting for managers and third parties", "for promoters, directors, labour unions and distributors",
                2, "The core function of accounting is to serve as an information utility providing relevant reports for both internal governance (managers) and external stakeholders.")
        )
        list.add(
            q("acc_comp_1995_04", "Principles of Accounts", "Source Documents & Books of Prime Entry", "1995",
                "Which of the following accounting records are source documents?",
                "Journals and ledgers", "Sales invoice and cashbook", "Cash book and debit note", "Sales invoice and debit note",
                3, "Invoices and debit notes are original evidence documents generated at the point of sale, whereas cashbooks and journals are books of original entry.")
        )
        list.add(
            q("acc_comp_1995_05", "Principles of Accounts", "Accounting Equation & Balance Sheet", "1995",
                "Given: Motor van ₦3,600, Premises ₦5,000, Loan ₦1,000, Cash at bank ₦1,650, Stock of goods ₦4,800, Creditors ₦2,560, Cash in hand ₦250, and Debtors ₦6,910. Calculate the capital figure.",
                "₦19,650", "₦18,650", "₦17,850", "₦19,850",
                1, "Total Assets = ₦22,210 (3,600 + 5,000 + 1,650 + 4,800 + 250 + 6,910). Total Liabilities = ₦3,560 (1,000 + 2,560). Using Capital = Assets - Liabilities, we get 22,210 - 3,560 = ₦18,650.")
        )

        return list
    }

    private fun q(
        id: String,
        subject: String,
        topic: String,
        year: String,
        text: String,
        a: String,
        b: String,
        c: String,
        d: String,
        correctIdx: Int,
        explanation: String
    ): QuestionEntity {
        return QuestionEntity(
            id = id,
            subject = subject,
            topic = topic,
            year = year,
            questionText = text,
            optionA = a,
            optionB = b,
            optionC = c,
            optionD = d,
            correctAnswerIndex = correctIdx,
            explanation = explanation,
            difficulty = "Medium",
            originType = "JAMB_ORIGINAL",
            originLabel = "JAMB $subject $year"
        )
    }
}
