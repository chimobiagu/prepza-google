package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Commerce Question Series (Parts 1 to 5) with Answers and Explanations
 * Total Verified Questions: 81
 */
object JambCommercePt1to5CompleteBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_com_p1_02",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "Part 1",
                questionText = "The most important function of commerce is in _____.",
                optionA = "enhancing business relationships",
                optionB = "helping people to improve their profits",
                optionC = "facilitating exchange among individuals and firms",
                optionD = "assisting trade through banking and insurance",
                correctAnswerIndex = 2,
                explanation = "The fundamental role of commerce is facilitating the exchange and distribution of goods and services between producers and consumers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_03",
                subject = "Commerce",
                topic = "Occupations",
                year = "Part 1",
                questionText = "The three main classifications of occupation are _____.",
                optionA = "construction, trade and services",
                optionB = "manufacturing, industry and services",
                optionC = "farming, banking and trading",
                optionD = "industry, commerce and services",
                correctAnswerIndex = 3,
                explanation = "Occupations are broadly divided into Industry, Commerce, and Direct/Indirect Services.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_04",
                subject = "Commerce",
                topic = "Occupations",
                year = "Part 1",
                questionText = "An oil exploration company is engaged in _____.",
                optionA = "tertiary production",
                optionB = "constructive occupation",
                optionC = "extractive occupation",
                optionD = "secondary production",
                correctAnswerIndex = 2,
                explanation = "Extractive occupations involve extracting raw materials directly from the earth, soil, or sea.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_05",
                subject = "Commerce",
                topic = "Services",
                year = "Part 1",
                questionText = "Service rendered to the public is provided by _____.",
                optionA = "government",
                optionB = "civil servants",
                optionC = "professionals",
                optionD = "domestic servants",
                correctAnswerIndex = 1,
                explanation = "Civil servants provide direct and indirect public services on behalf of the government.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_06",
                subject = "Commerce",
                topic = "Production",
                year = "Part 1",
                questionText = "The creation of goods and services to satisfy human wants is referred to as _____.",
                optionA = "manufacturing",
                optionB = "commercialization",
                optionC = "production",
                optionD = "entrepreneurship",
                correctAnswerIndex = 2,
                explanation = "Production is the creation of utility (goods and services) to satisfy human needs and wants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_07",
                subject = "Commerce",
                topic = "Division of Labour",
                year = "Part 1",
                questionText = "Which of the following is a limitation of division of labour?",
                optionA = "Decline in craftsmanship",
                optionB = "Monotony of work",
                optionC = "Reduction in output",
                optionD = "Reduction in labour force",
                correctAnswerIndex = 1,
                explanation = "Monotony (boredom from repeating the same repetitive task) is a major limitation of division of labour.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_08",
                subject = "Commerce",
                topic = "Production",
                year = "Part 1",
                questionText = "Resources obtained from the extractive sector that are transformed into finished products are examples of _____.",
                optionA = "primary production",
                optionB = "tertiary production",
                optionC = "direct production",
                optionD = "secondary production",
                correctAnswerIndex = 3,
                explanation = "Secondary production transforms raw materials from primary industries into finished goods.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_09",
                subject = "Commerce",
                topic = "Structure of Commerce",
                year = "Part 1",
                questionText = "[DIAGRAM: Structure of Commerce:\nCommerce branches into:\n- Trade (Home Trade [Retailer, Wholesaler] & Foreign Trade [Export, Import])\n- [I] (Auxiliaries/Aids to Trade: Banking, Insurance, Transport, Warehousing, Advertising, Communication)]\n\nFrom the diagram above, what does I stand for?",
                optionA = "Aids to trade",
                optionB = "Publicity",
                optionC = "Home trade",
                optionD = "Advertising",
                correctAnswerIndex = 0,
                explanation = "Commerce comprises two broad divisions: Trade and Aids to Trade.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_10",
                subject = "Commerce",
                topic = "Channels of Distribution",
                year = "Part 1",
                questionText = "An individual that links the producer with the retailer is _____.",
                optionA = "an agent",
                optionB = "a wholesaler",
                optionC = "an entrepreneur",
                optionD = "a principal",
                correctAnswerIndex = 1,
                explanation = "The wholesaler buys in bulk from producers and resells in smaller lots to retailers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_11",
                subject = "Commerce",
                topic = "Retail Trade",
                year = "Part 1",
                questionText = "One of the functions of a retailer is the _____.",
                optionA = "financing of production activities",
                optionB = "provision of credit facilities to relations",
                optionC = "provision of jobs for customers",
                optionD = "breaking of bulk",
                correctAnswerIndex = 3,
                explanation = "Retailers break bulk by selling products in small, individual unit quantities to consumers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_12",
                subject = "Commerce",
                topic = "Direct Selling",
                year = "Part 1",
                questionText = "The main aim of selling directly to the consumers by manufacturers is to _____.",
                optionA = "reduce transportation cost",
                optionB = "make contact with individual consumers",
                optionC = "discourage the activities of middlemen",
                optionD = "maximize profit margin",
                correctAnswerIndex = 3,
                explanation = "Direct marketing allows manufacturers to retain retailer/wholesaler margins and maximize profit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_13",
                subject = "Commerce",
                topic = "Foreign Trade",
                year = "Part 1",
                questionText = "Balance of payment problems arise if a country's _____.",
                optionA = "exports are more than imports",
                optionB = "imports are more than exports",
                optionC = "currency devaluation",
                optionD = "invisible exports are more than visible exports",
                correctAnswerIndex = 1,
                explanation = "A balance of payments deficit arises when total payments for imports exceed export receipts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_14",
                subject = "Commerce",
                topic = "Foreign Trade",
                year = "Part 1",
                questionText = "The three components of a country's balance of payments are _____.",
                optionA = "current account, capital account and monetary movement account",
                optionB = "capital account, trade account and business record",
                optionC = "sales account, profit and loss account and capital account",
                optionD = "monetary movement account, trade account and sales ledger",
                correctAnswerIndex = 0,
                explanation = "Balance of payments comprises Current Account, Capital/Financial Account, and Monetary Movement Account.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_15",
                subject = "Commerce",
                topic = "Negotiable Instruments",
                year = "Part 1",
                questionText = "A document that indicates obligation that is transferable by delivery and endorsement is a _____.",
                optionA = "bill of lading",
                optionB = "bill of exchange",
                optionC = "documentary evidence",
                optionD = "negotiable instrument",
                correctAnswerIndex = 3,
                explanation = "Negotiable instruments confer rights that can be legally transferred by endorsement and delivery.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_16",
                subject = "Commerce",
                topic = "Shipping Documents",
                year = "Part 1",
                questionText = "The document which can be exchange for a bill of lading is _____.",
                optionA = "freight note",
                optionB = "mate receipt",
                optionC = "export invoice",
                optionD = "ship report",
                correctAnswerIndex = 1,
                explanation = "A Mate's Receipt is issued when cargo is loaded on board and later exchanged for a formal Bill of Lading.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_17",
                subject = "Commerce",
                topic = "Terms of Delivery",
                year = "Part 1",
                questionText = "The price quoted which includes the cost of insurance, freight and all delivery charges to the importer's warehouse is _____.",
                optionA = "Free Alongside Ship",
                optionB = "Franco",
                optionC = "Free on Board",
                optionD = "Free on Rail",
                correctAnswerIndex = 1,
                explanation = "Franco (Free Delivered) includes all transport, insurance, tariff, and handling costs directly to the buyer's warehouse.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_18",
                subject = "Commerce",
                topic = "Terms of Payment",
                year = "Part 1",
                questionText = "The purchase of goods under the CWO system of payment implies that _____.",
                optionA = "money must be enclosed when ordering",
                optionB = "payment must be made on delivery",
                optionC = "payment must be made within few days",
                optionD = "cash must be paid on the spot",
                correctAnswerIndex = 0,
                explanation = "Cash With Order (CWO) mandates full payment at the time an order is submitted.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_19",
                subject = "Commerce",
                topic = "Advertising",
                year = "Part 1",
                questionText = "The most effective but limited medium of advertising in Nigeria is _____.",
                optionA = "billboard",
                optionB = "television",
                optionC = "newspaper",
                optionD = "radio",
                correctAnswerIndex = 1,
                explanation = "Television provides high sensory appeal and impact but is limited by power supply and rural access.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_20",
                subject = "Commerce",
                topic = "Banking",
                year = "Part 1",
                questionText = "A cheque that has been drawn but not presented for payment can still be honoured _____.",
                optionA = "within 6 months",
                optionB = "after 9 months",
                optionC = "within 9 months",
                optionD = "after 6 months",
                correctAnswerIndex = 0,
                explanation = "Cheques remain legally valid for payment for six months from the date indicated on them.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_21",
                subject = "Commerce",
                topic = "Banking",
                year = "Part 1",
                questionText = "The major source of income to commercial banks is _____.",
                optionA = "loans",
                optionB = "deposits",
                optionC = "interest",
                optionD = "overdrafts",
                correctAnswerIndex = 2,
                explanation = "Banks generate their principal revenue from interest charged on loan advances.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_22",
                subject = "Commerce",
                topic = "Communication",
                year = "Part 1",
                questionText = "An ancillary to trade that easily links suppliers with consumers is _____.",
                optionA = "tourism",
                optionB = "banking",
                optionC = "communication",
                optionD = "transportation",
                correctAnswerIndex = 2,
                explanation = "Communication allows buyers and sellers to negotiate, exchange information, and finalize orders rapidly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_23",
                subject = "Commerce",
                topic = "Insurance",
                year = "Part 1",
                questionText = "Mr. Lawal insured his warehouse against burglary but it was later gutted by fire. This implies that _____.",
                optionA = "the loss should be borne by the insurer",
                optionB = "Mr. Lawal is liable only for half of the estimated loss",
                optionC = "the insurer should make a consolation payment for the loss",
                optionD = "the loss should be borne by Mr. Lawal",
                correctAnswerIndex = 3,
                explanation = "Under Proximate Cause, loss is only indemnified if caused by the specifically insured peril.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_24",
                subject = "Commerce",
                topic = "Insurance",
                year = "Part 1",
                questionText = "The agreement of insurers to spread risks among themselves is a major feature of _____.",
                optionA = "reinsurance",
                optionB = "life insurance",
                optionC = "underwriter",
                optionD = "marine insurance",
                correctAnswerIndex = 0,
                explanation = "Reinsurance enables insurers to cede a portion of high-value risks to other insurers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_25",
                subject = "Commerce",
                topic = "Tourism",
                year = "Part 1",
                questionText = "Inbound tourism occurs when _____.",
                optionA = "non-residents of a country travel to other countries",
                optionB = "resident of a country travel to another country",
                optionC = "non-resident of a country travel within it",
                optionD = "resident of a country travel within it",
                correctAnswerIndex = 2,
                explanation = "Inbound tourism consists of non-residents entering and travelling inside a destination country.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_26",
                subject = "Commerce",
                topic = "Transportation",
                year = "Part 1",
                questionText = "One of the major disadvantages of pipeline transportation is its _____.",
                optionA = "high cost of construction",
                optionB = "limitation in scope",
                optionC = "vulnerability to climate changes",
                optionD = "high maintenance cost",
                correctAnswerIndex = 1,
                explanation = "Pipelines are inflexible and limited in scope to transporting liquid/gaseous commodities only.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_27",
                subject = "Commerce",
                topic = "Business Organizations",
                year = "Part 1",
                questionText = "The business organization that can effectively combine management with control is _____.",
                optionA = "private limited liability company",
                optionB = "sole proprietorship",
                optionC = "public limited liability company",
                optionD = "co-operation society",
                correctAnswerIndex = 1,
                explanation = "A sole proprietor exercises absolute direct personal authority over management and business decisions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_28",
                subject = "Commerce",
                topic = "Business Combinations",
                year = "Part 1",
                questionText = "When two or more companies agree to execute a project too large for one to handle, this is referred to as _____.",
                optionA = "an amalgamation",
                optionB = "a cartel",
                optionC = "a merger",
                optionD = "a consortium",
                correctAnswerIndex = 3,
                explanation = "A consortium is formed when multiple firms partner temporarily to undertake massive engineering or commercial projects.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_29",
                subject = "Commerce",
                topic = "Liquidation",
                year = "Part 1",
                questionText = "In the event of voluntary liquidation, the appointment of a liquidator is the responsibility of the _____.",
                optionA = "directors",
                optionB = "creditors",
                optionC = "promoters",
                optionD = "court",
                correctAnswerIndex = 1,
                explanation = "In voluntary winding up, company creditors or members appoint the liquidator to manage asset realization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_30",
                subject = "Commerce",
                topic = "Business Finance",
                year = "Part 1",
                questionText = "A source of business financing which involves pledging of a specific asset is _____.",
                optionA = "bond",
                optionB = "mortgage",
                optionC = "debentures",
                optionD = "loan",
                correctAnswerIndex = 1,
                explanation = "A mortgage is a debt instrument secured by the collateral of specified immovable property.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q30)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_31",
                subject = "Commerce",
                topic = "Trade Associations",
                year = "Part 1",
                questionText = "An example of a trade association is _____.",
                optionA = "ALGON",
                optionB = "NLC",
                optionC = "NURTW",
                optionD = "NULGE",
                correctAnswerIndex = 2,
                explanation = "NURTW is a trade transport union representing commercial road transport workers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q31)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_32",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "Part 1",
                questionText = "A broker is an agent who links a potential investor with _____.",
                optionA = "a shareholder who wants to register a company",
                optionB = "other members of the exchange who want to trade",
                optionC = "government official on the exchange",
                optionD = "a quoted company",
                correctAnswerIndex = 1,
                explanation = "Brokers act as certified intermediaries executing client buy/sell transactions with jobbers/dealers on the exchange floor.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q32)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_33",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "Part 1",
                questionText = "Second-tier Securities Market differ from the First-tier Securities Market in that the former is _____.",
                optionA = "highly restricted",
                optionB = "regulated by the SEC",
                optionC = "regulated by the NIPC",
                optionD = "less restricted",
                correctAnswerIndex = 3,
                explanation = "The Second-Tier Securities Market features relaxed entry conditions to enable smaller firms to raise capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q33)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_34",
                subject = "Commerce",
                topic = "Management Information",
                year = "Part 1",
                questionText = "A communication process providing information for decision-making in an organization is the _____.",
                optionA = "Management information System",
                optionB = "Transmission Control Protocol",
                optionC = "Information Retrieval System",
                optionD = "File Transfer Protocol",
                correctAnswerIndex = 0,
                explanation = "A Management Information System (MIS) provides decision-makers with summarized operational data.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q34)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_35",
                subject = "Commerce",
                topic = "Management",
                year = "Part 1",
                questionText = "The managerial ability of a supervisor in an organization may be underutilized if the _____.",
                optionA = "morale of the supervised is high",
                optionB = "span of control is wide",
                optionC = "span of control is narrow",
                optionD = "morale of the supervisor is low",
                correctAnswerIndex = 2,
                explanation = "When a supervisor oversees too few workers (overly narrow span), their leadership and coordination capability is underutilized.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q35)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_36",
                subject = "Commerce",
                topic = "Organizational Structure",
                year = "Part 1",
                questionText = "The arrangement and interrelationship of the various components and positions of a business is referred to as _____.",
                optionA = "organizational structure",
                optionB = "clarity of objective",
                optionC = "unity of direction",
                optionD = "line structure",
                correctAnswerIndex = 0,
                explanation = "Organizational structure defines roles, reporting channels, and distribution of authority.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q36)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_37",
                subject = "Commerce",
                topic = "Marketing",
                year = "Part 1",
                questionText = "The variety of goods and services which a company offers for sale is its _____.",
                optionA = "place mix",
                optionB = "promotion mix",
                optionC = "price mix",
                optionD = "product mix",
                correctAnswerIndex = 3,
                explanation = "Product mix encompasses the full portfolio of products manufactured and offered by a seller.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q37)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_38",
                subject = "Commerce",
                topic = "Sales Promotion",
                year = "Part 1",
                questionText = "Activities undertaken to create awareness for goods by conducting contest is _____.",
                optionA = "marketing concept",
                optionB = "consumerism",
                optionC = "sales promotion",
                optionD = "marketing mix",
                correctAnswerIndex = 2,
                explanation = "Competitions and consumer contests are promotional incentives to drive prompt product trial and sales.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q38)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_39",
                subject = "Commerce",
                topic = "Advertising",
                year = "Part 1",
                questionText = "The slogan, a wonderful world, used by a communication network is a form of _____.",
                optionA = "product differentiation",
                optionB = "persuasive advertising",
                optionC = "publicity",
                optionD = "packaging",
                correctAnswerIndex = 1,
                explanation = "Persuasive advertising builds strong psychological associations and positive customer perception.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q39)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_40",
                subject = "Commerce",
                topic = "Commercial Law",
                year = "Part 1",
                questionText = "To make a simple contract valid, the intention must be _____.",
                optionA = "legal and written",
                optionB = "legal and binding",
                optionC = "legal and attractive",
                optionD = "legal and harmonious",
                correctAnswerIndex = 1,
                explanation = "Contract law requires a mutual intention to enter into legally enforceable, binding obligations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q40)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_41",
                subject = "Commerce",
                topic = "Law of Agency",
                year = "Part 1",
                questionText = "The major parties to an agency relationship are the _____.",
                optionA = "principal and the creditor",
                optionB = "Bailee and the bailor",
                optionC = "principal and the agent",
                optionD = "shareholder and the creditor",
                correctAnswerIndex = 2,
                explanation = "Agency is founded upon the contract between the Principal and their representative Agent.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q41)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_42",
                subject = "Commerce",
                topic = "Employment Law",
                year = "Part 1",
                questionText = "One of the obligations of an employer to an employee is to _____.",
                optionA = "indemnify him against liabilities incurred on duty",
                optionB = "award scholarship to his children",
                optionC = "terminate his appointment without prior notice",
                optionD = "indemnify him against injuries caused through negligence",
                correctAnswerIndex = 0,
                explanation = "Employers must indemnify employees for costs, damages, or claims sustained while executing authorized duties.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q42)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_43",
                subject = "Commerce",
                topic = "Regulatory Agencies",
                year = "Part 1",
                questionText = "The body charged with the responsibility of regulating foods and drugs in Nigeria is the _____.",
                optionA = "SON",
                optionB = "NDLEA",
                optionC = "NAFDAC",
                optionD = "CAC",
                correctAnswerIndex = 2,
                explanation = "NAFDAC inspects and certifies food, chemicals, and medical items for safety.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q43)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_44",
                subject = "Commerce",
                topic = "Computer Fundamentals",
                year = "Part 1",
                questionText = "The physical components of a computer system refers to the _____.",
                optionA = "system unit",
                optionB = "hardware",
                optionC = "software",
                optionD = "compact disk",
                correctAnswerIndex = 1,
                explanation = "Hardware refers to the physical electronic and mechanical devices making up a computer system.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q44)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_45",
                subject = "Commerce",
                topic = "Operating Systems",
                year = "Part 1",
                questionText = "An example of a computer operating system is _____.",
                optionA = "the PageMaker",
                optionB = "the Word Perfect",
                optionC = "Microsoft Word 2000",
                optionD = "Windows 2000",
                correctAnswerIndex = 3,
                explanation = "Windows 2000 is an operating system; the others are application software packages.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q45)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_46",
                subject = "Commerce",
                topic = "Computer Networks",
                year = "Part 1",
                questionText = "Intranet differs from extranet in that the former _____.",
                optionA = "requires a modem before it could be used",
                optionB = "can generally be accessed by the public",
                optionC = "is restricted to employees of an organization",
                optionD = "requires internet protocols",
                correctAnswerIndex = 2,
                explanation = "An intranet is an internal network restricted exclusively to an enterprise's employees.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q46)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_47",
                subject = "Commerce",
                topic = "Internet & Applications",
                year = "Part 1",
                questionText = "A software application which enables a user to display and interact with texts, images and videos is the _____.",
                optionA = "web server",
                optionB = "Internet Protocol",
                optionC = "CorelDraw",
                optionD = "web browser",
                correctAnswerIndex = 3,
                explanation = "A web browser retrieves and displays web pages and interactive content.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q47)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_48",
                subject = "Commerce",
                topic = "Web Languages",
                year = "Part 1",
                questionText = "A predominant make-up language for web pages is the _____.",
                optionA = "IP",
                optionB = "HTTP",
                optionC = "HTML",
                optionD = "TCP",
                correctAnswerIndex = 2,
                explanation = "HTML is the standard markup language for creating webpage documents.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q48)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_49",
                subject = "Commerce",
                topic = "Email Addressing",
                year = "Part 1",
                questionText = "The symbol @ in an internet mail address is used to _____.",
                optionA = "separate the user name from the machine name",
                optionB = "link the user with other Internet users",
                optionC = "locate the addresses of Internet users",
                optionD = "link the user with the machine",
                correctAnswerIndex = 0,
                explanation = "The '@' sign separates the username from the host domain name.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q49)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p1_50",
                subject = "Commerce",
                topic = "Social Responsibility",
                year = "Part 1",
                questionText = "A business organization is said to be socially responsible when it _____.",
                optionA = "gets involved in issues relating to the society",
                optionB = "rewards its staff for long-term service",
                optionC = "offers discounts to customers",
                optionD = "invites the public to its annual general meetings",
                correctAnswerIndex = 0,
                explanation = "Social responsibility encompasses proactive concern and investment in host communities and society.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 1 (Q50)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_02",
                subject = "Commerce",
                topic = "Government & Commerce",
                year = "Part 2",
                questionText = "One of the major benefits of commerce to government is to _____.",
                optionA = "improve the standard of living",
                optionB = "generate revenue for growth and development",
                optionC = "encourage cooperation among public organisations",
                optionD = "encourage the development of sociocultural values",
                correctAnswerIndex = 1,
                explanation = "Commerce enables governments to generate customs tariffs, corporate taxes, and VAT revenue to finance public infrastructure.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_03",
                subject = "Commerce",
                topic = "Industry",
                year = "Part 2",
                questionText = "An example of an activity in the construction industry is _____.",
                optionA = "blacksmithing",
                optionB = "bricklaying",
                optionC = "car assembling",
                optionD = "shoemaking",
                correctAnswerIndex = 1,
                explanation = "Bricklaying is a core structural activity in the construction sector.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_04",
                subject = "Commerce",
                topic = "Factors of Production",
                year = "Part 2",
                questionText = "One of the inputs in production that can be motivated by remuneration is _____.",
                optionA = "capital",
                optionB = "entrepreneur",
                optionC = "labour",
                optionD = "land",
                correctAnswerIndex = 2,
                explanation = "Labour (human mental and physical effort) responds directly to wage and salary incentives.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_05",
                subject = "Commerce",
                topic = "Division of Labour",
                year = "Part 2",
                questionText = "The allocation of tasks to different skills in a production process is referred to as _____.",
                optionA = "production technique",
                optionB = "production function",
                optionC = "division of labour",
                optionD = "delegation of responsibility",
                correctAnswerIndex = 2,
                explanation = "Division of labour splits production into specialized tasks assigned based on employee skills.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_06",
                subject = "Commerce",
                topic = "Automated Selling",
                year = "Part 2",
                questionText = "The sales of goods through a medium that accepts money and delivers the items to the customer is _____.",
                optionA = "an automated teller machine",
                optionB = "a vending machine",
                optionC = "a counting machine",
                optionD = "a branding machine",
                correctAnswerIndex = 1,
                explanation = "A vending machine dispenses snacks, beverages, and merchandise automatically upon currency insertion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_07",
                subject = "Commerce",
                topic = "Branding",
                year = "Part 2",
                questionText = "The main purpose of branding is to _____.",
                optionA = "create identity for a product",
                optionB = "make a product look attractive",
                optionC = "create product awareness",
                optionD = "increase sales volume",
                correctAnswerIndex = 0,
                explanation = "Branding creates a distinct trademark, name, and identity separating a product from competitors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_08",
                subject = "Commerce",
                topic = "International Trade",
                year = "Part 2",
                questionText = "The basis for international trade is embedded in the principle of _____.",
                optionA = "absolute advantage",
                optionB = "globalization",
                optionC = "deregulation",
                optionD = "comparative advantage",
                correctAnswerIndex = 3,
                explanation = "Comparative advantage (David Ricardo) explains trade specialization based on lower opportunity costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_09",
                subject = "Commerce",
                topic = "International Trade",
                year = "Part 2",
                questionText = "The major problem encountered in international trade is that of _____.",
                optionA = "distance",
                optionB = "differences in culture",
                optionC = "politics",
                optionD = "differences in currency",
                correctAnswerIndex = 3,
                explanation = "Different foreign currencies require foreign exchange conversion and introduce exchange rate volatility risks.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_10",
                subject = "Commerce",
                topic = "Trade Documents",
                year = "Part 2",
                questionText = "The document a seller uses in dispatching goods to a customer by a carrier is _____.",
                optionA = "a bill of landing",
                optionB = "an invoice",
                optionC = "an advice note",
                optionD = "a delivery note",
                correctAnswerIndex = 3,
                explanation = "A delivery note (or dispatch note) accompanies delivered goods to be signed by the receiver.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_11",
                subject = "Commerce",
                topic = "Foreign Orders",
                year = "Part 2",
                questionText = "A document which serves as an order with details of goods required by an intending purchaser is _____.",
                optionA = "a freight note",
                optionB = "an indent",
                optionC = "a bill of landing",
                optionD = "a way bill",
                correctAnswerIndex = 1,
                explanation = "An indent is an order sent to an overseas agent specifying descriptions, quantities, and prices of desired goods.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_12",
                subject = "Commerce",
                topic = "Trade Terms & Discounts",
                year = "Part 2",
                questionText = "If a customer pays within nine days of receiving goods and takes advantage of 3% off the invoice price, this is stated as _____.",
                optionA = "3/9; net 30",
                optionB = "9/27; net 30",
                optionC = "30; net 9/3",
                optionD = "9/30; net 3",
                correctAnswerIndex = 0,
                explanation = "'3/9; net 30' means a 3% cash discount applies if settled within 9 days; otherwise full net amount is due in 30 days.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_13",
                subject = "Commerce",
                topic = "Cheques",
                year = "Part 2",
                questionText = "Which of the following is a characteristic of a bearer cheque?",
                optionA = "it is made with transverse lines",
                optionB = "it is made payable to whoever presents it",
                optionC = "it is made without transverse lines",
                optionD = "it is only payable into the payees account",
                correctAnswerIndex = 1,
                explanation = "A bearer cheque is payable over the bank counter to any individual presenting it without needing endorsement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_14",
                subject = "Commerce",
                topic = "Bills of Exchange",
                year = "Part 2",
                questionText = "A bill of exchange paid before its due date at an amount less than its face value is said to have been _____.",
                optionA = "accepted",
                optionB = "rejected",
                optionC = "discounted",
                optionD = "dishonoured",
                correctAnswerIndex = 2,
                explanation = "Discounting a bill means cashing it at a commercial bank before maturity for a small discount fee.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_15",
                subject = "Commerce",
                topic = "Advertising",
                year = "Part 2",
                questionText = "The most effective type of advertising for branded products is _____.",
                optionA = "mass advertising",
                optionB = "persuasive advertising",
                optionC = "informative advertising",
                optionD = "competitive advertising",
                correctAnswerIndex = 1,
                explanation = "Persuasive advertising emphasizes distinctive features to win brand preference.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_16",
                subject = "Commerce",
                topic = "Banking",
                year = "Part 2",
                questionText = "A current account holder pays fees for services in form of _____.",
                optionA = "bank charges (Commission on Turnover)",
                optionB = "interest rates",
                optionC = "commission on turnover",
                optionD = "minimum lending rate",
                correctAnswerIndex = 0,
                explanation = "Banks charge maintenance and transaction fees known as bank charges / Commission on Turnover (COT).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_19",
                subject = "Commerce",
                topic = "Insurance Subrogation",
                year = "Part 2",
                questionText = "The right of an insurance company to stand in place of an insured against a third party, who is liable for the occurrence of a loss, is the principle of _____.",
                optionA = "proximate cause",
                optionB = "insurable interest",
                optionC = "insurance priority",
                optionD = "subrogation",
                correctAnswerIndex = 3,
                explanation = "Subrogation allows the insurer to step into the insured's shoes and sue the liable third party.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_20",
                subject = "Commerce",
                topic = "Insurance vs Assurance",
                year = "Part 2",
                questionText = "Assurance is different from insurance in that the former is based on _____.",
                optionA = "probability",
                optionB = "possibility",
                optionC = "risk",
                optionD = "uncertainty",
                correctAnswerIndex = 1,
                explanation = "Assurance covers events that are bound to happen (death - a certainty), whereas insurance covers contingent possibilities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_31",
                subject = "Commerce",
                topic = "Business Finance Calculations",
                year = "Part 2",
                questionText = "If the rate of turnover of a company in 1999 was 4 times while the average stock was ₦49,600, determine the turnover.",
                optionA = "₦199,400",
                optionB = "₦198,400",
                optionC = "₦100,200",
                optionD = "₦99,200",
                correctAnswerIndex = 1,
                explanation = "Turnover (Cost of Sales / Sales) = Rate of Turnover × Average Stock = 4 × ₦49,600 = ₦198,400.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q31)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_32",
                subject = "Commerce",
                topic = "Stock Valuation",
                year = "Part 2",
                questionText = "Given:\nOpening Stock: ₦1,800\nPurchases: ₦2,800\nSales: ₦8,000\nClosing Stock: ₦350\nCarriage on Sales: ₦500\n\nCalculate the value of the unused stock.",
                optionA = "₦800",
                optionB = "₦500",
                optionC = "₦350",
                optionD = "₦320",
                correctAnswerIndex = 2,
                explanation = "Unused stock remaining at the end of the trading period is the closing stock = ₦350.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q32)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_38",
                subject = "Commerce",
                topic = "Management Principles",
                year = "Part 2",
                questionText = "The promotion of team spirit in an organization is referred to as _____.",
                optionA = "unity of direction",
                optionB = "esprit de corps",
                optionC = "unity of purpose",
                optionD = "discipline",
                correctAnswerIndex = 1,
                explanation = "Esprit de corps is Henri Fayol's management principle emphasizing harmony and team cohesion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q38)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_42",
                subject = "Commerce",
                topic = "Commercial Law",
                year = "Part 2",
                questionText = "A person who in consideration for an extra commission takes responsibility for goods sold on credit and indemnifies against default is a _____.",
                optionA = "commission agent",
                optionB = "del credere agent",
                optionC = "broker",
                optionD = "factor",
                correctAnswerIndex = 1,
                explanation = "A del credere agent guarantees payment for credit sales in exchange for an additional del credere commission.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q42)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p2_43",
                subject = "Commerce",
                topic = "Hire Purchase Law",
                year = "Part 2",
                questionText = "Yahaya bought furniture on a credit sale agreement from Ahmed and resold it to Ali before all instalments were made. The court upheld that Ahmed could not recover the item from Ali because _____.",
                optionA = "ownership was transferred on completion of instalment",
                optionB = "ownership was transferred on delivery",
                optionC = "Yahaya could not pass title to a third party",
                optionD = "Ali was still indebted to Yahaya",
                correctAnswerIndex = 1,
                explanation = "Under a credit sale agreement, ownership (property title) passes to the buyer immediately upon delivery.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 2 (Q43)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p3_03",
                subject = "Commerce",
                topic = "Production",
                year = "Part 3",
                questionText = "The assembling of products into usable forms is known as _____.",
                optionA = "creation",
                optionB = "manufacturing",
                optionC = "construction",
                optionD = "formation",
                correctAnswerIndex = 1,
                explanation = "Manufacturing converts components and raw materials into finished consumer goods.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 3 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p3_05",
                subject = "Commerce",
                topic = "Balance of Trade",
                year = "Part 3",
                questionText = "A country is said to be experiencing an unfavourable balance of trade if her _____.",
                optionA = "exports exceed imports",
                optionB = "visible exports exceed visible imports",
                optionC = "imports and exports are equal",
                optionD = "visible imports exceed visible exports",
                correctAnswerIndex = 3,
                explanation = "Unfavourable trade balance occurs when visible imports exceed visible exports.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 3 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p3_15",
                subject = "Commerce",
                topic = "Insurance Average Clause",
                year = "Part 3",
                questionText = "Using the table:\nMr. N: Insured Amount = ₦25,000; Actual Value = ₦100,000; Actual Loss = ₦30,000.\n\nIf Mr. N takes a fire insurance policy with an average clause, his compensation will be _____.",
                optionA = "₦5,000",
                optionB = "₦7,500",
                optionC = "₦70,000",
                optionD = "₦75,000",
                correctAnswerIndex = 1,
                explanation = "Compensation = (Insured Amount / Actual Value) × Actual Loss = (25,000 / 100,000) × 30,000 = 1/4 × 30,000 = ₦7,500.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 3 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p3_16",
                subject = "Commerce",
                topic = "Insurance Principles",
                year = "Part 3",
                questionText = "What insurance principle has Mr. P violated if he decides to overstate the actual value of his property?",
                optionA = "Indemnity",
                optionB = "Insurable interest",
                optionC = "Uberrimae fidei (Utmost Good Faith)",
                optionD = "Subrogation",
                correctAnswerIndex = 2,
                explanation = "Uberrimae fidei requires absolute truthful disclosure of all material facts without misrepresentation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 3 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p3_23",
                subject = "Commerce",
                topic = "Turnover Calculation",
                year = "Part 3",
                questionText = "The rate of turnover of a firm in a given year is 5 times while the average stock is ₦12,500. What is the turnover of the firm?",
                optionA = "₦24,000",
                optionB = "₦46,500",
                optionC = "₦62,500",
                optionD = "₦65,000",
                correctAnswerIndex = 2,
                explanation = "Turnover = Rate of Turnover × Average Stock = 5 × ₦12,500 = ₦62,500.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 3 (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p4_22",
                subject = "Commerce",
                topic = "Maritime Law",
                year = "Part 4",
                questionText = "The deliberate effort geared towards discarding some cargoes into the sea in order to lighten a vessel during danger is _____.",
                optionA = "caveat emptor",
                optionB = "uberrimae fidei",
                optionC = "demurrage",
                optionD = "jettison",
                correctAnswerIndex = 3,
                explanation = "Jettison is the intentional throwing overboard of cargo to save a ship in distress (General Average).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 4 (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p4_18",
                subject = "Commerce",
                topic = "Accounting Calculations",
                year = "Part 4",
                questionText = "Given:\nSales: ₦15,000\nOpening stock: ₦5,600\nPurchases: ₦9,700\nClosing stock: ₦4,400\nGross profit: ₦4,500\nNet profit: ₦2,000\n\nCalculate the rate of turnover.",
                optionA = "2.18 times",
                optionB = "3.50 times",
                optionC = "3.00 times",
                optionD = "2.10 times",
                correctAnswerIndex = 0,
                explanation = "Cost of Goods Sold = Opening Stock (5,600) + Purchases (9,700) - Closing Stock (4,400) = ₦10,900.\nAverage Stock = (5,600 + 4,400) / 2 = ₦5,000.\nRate of Turnover = Cost of Sales / Average Stock = 10,900 / 5,000 = 2.18 times.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 4 (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p5_01",
                subject = "Commerce",
                topic = "Invoicing",
                year = "Part 5",
                questionText = "A proforma invoice is not required when _____.",
                optionA = "dealing regularly with a customer",
                optionB = "quoting for the supply of goods",
                optionC = "goods are sent on approval",
                optionD = "final prices are uncertain",
                correctAnswerIndex = 0,
                explanation = "Regular established customers are issued standard invoices rather than advance proforma invoices.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 5 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p5_04",
                subject = "Commerce",
                topic = "Company Documents",
                year = "Part 5",
                questionText = "Which of the following information is contained in the Articles of Association of a limited liability company?",
                optionA = "Objectives of the company",
                optionB = "Rights and obligations of directors",
                optionC = "Amount of share capital",
                optionD = "Limitation of liability of share holders",
                correctAnswerIndex = 1,
                explanation = "Articles of Association govern internal management, including powers, duties, and voting rights of directors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 5 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_p5_16",
                subject = "Commerce",
                topic = "Business Finance",
                year = "Part 5",
                questionText = "In the primary market, new shares are issued through _____.",
                optionA = "personal selling, publicity and advertising",
                optionB = "advertising, a prospectus and a bill of exchange",
                optionC = "a prospectus, an offer for sale and placing",
                optionD = "a prospectus, offer for sale and a bill of exchange",
                correctAnswerIndex = 2,
                explanation = "Public issues in the primary securities market occur via prospectus offer, offer for sale, rights issues, and private placement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce • Part 5 (Q16)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
