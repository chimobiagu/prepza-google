package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Official JAMB Commerce Past Examination Series (1994 - Part 1).
 * Complete, standardized, verified, and deduplicated across syllabus modules.
 */
object JambCommerceMasterRevisionPart1Bank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "comm_1994_001",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Commerce is defined as the study of how",
                optionA = "man utilizes the resources in his physical environment",
                optionB = "man produces, distributes and consumes his goods and services",
                optionC = "man buys, sells and distributes goods and services",
                optionD = "raw materials are changed into finished goods.",
                correctAnswerIndex = 2,
                explanation = "Commerce is the branch of production that deals with the exchange of goods and services, as well as all activities that facilitate this exchange (aids to trade).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_002",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "The type of activity which turns processed raw materials into consumer and industrial goods is described as",
                optionA = "extractive",
                optionB = "manufacturing",
                optionC = "constructive",
                optionD = "processing",
                correctAnswerIndex = 1,
                explanation = "Manufacturing industries convert processed raw materials into finished consumer or industrial goods (e.g., turning flour into bread).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_003",
                subject = "Commerce",
                topic = "Marketing, Promotion & Advertising",
                year = "1994",
                questionText = "The production process that combines two or more raw materials into one end product is",
                optionA = "conditioning",
                optionB = "blending",
                optionC = "merging",
                optionD = "synthesis.",
                correctAnswerIndex = 3,
                explanation = "Synthetic production combines two or more separate chemical or physical materials to form a completely new product (e.g., making cement or plastics).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_004",
                subject = "Commerce",
                topic = "Management Principles & Social Responsibility",
                year = "1994",
                questionText = "A demonstration of social responsibility by a business is the payment of",
                optionA = "taxes to government",
                optionB = "dividends to shareholders",
                optionC = "interest on loans",
                optionD = "premium for insurance.",
                correctAnswerIndex = 0,
                explanation = "Fulfilling legal obligations, such as paying corporate taxes to the government, is a fundamental dimension of a business's social and civic responsibility.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_005",
                subject = "Commerce",
                topic = "Business Units, Combinations & Structure",
                year = "1994",
                questionText = "A distinguishing characteristic of a limited liability company is that it",
                optionA = "is a collection of many sole proprietors",
                optionB = "is a multiple partnership",
                optionC = "can sue and be sued",
                optionD = "has limited resources.",
                correctAnswerIndex = 2,
                explanation = "An incorporated company is a legal entity distinct from its owners; it possesses corporate personality, meaning it can sue and be sued in its own name.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_006",
                subject = "Commerce",
                topic = "Capital & Stock Markets",
                year = "1994",
                questionText = "Which of the following takes place when firms producing at different stages in the same industry combine?",
                optionA = "Conglomeration",
                optionB = "Vertical integration",
                optionC = "Horizontal integration",
                optionD = "Cartel.",
                correctAnswerIndex = 1,
                explanation = "Vertical integration occurs when firms at different, sequential stages of production or distribution in the same industry merge (e.g., a tannery merging with a shoe factory).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_007",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Which of the following groups is paid first when a firm liquidates?",
                optionA = "Preference shareholders.",
                optionB = "Debenture holders",
                optionC = "Ordinary shareholders.",
                optionD = "Cumulative preference shareholders.",
                correctAnswerIndex = 1,
                explanation = "Debenture holders are external creditors of a company. Upon liquidation, all creditors must be paid in full before any class of shareholders receives residual funds.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_008",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Compulsory dissolution of a business can arise from",
                optionA = "an agreement by the owners",
                optionB = "a declaration by a court of law",
                optionC = "the termination of its life",
                optionD = "an unfavourable economic climate.",
                correctAnswerIndex = 1,
                explanation = "A business can be compulsorily wound up or dissolved by an order or declaration issued by a court of competent jurisdiction, often due to insolvency or illegal acts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_009",
                subject = "Commerce",
                topic = "Business Units, Combinations & Structure",
                year = "1994",
                questionText = "Based on the balance sheet of MBV Enterprises, what is the circulating capital of the sole proprietor?",
                optionA = "N27,380",
                optionB = "N34,980",
                optionC = "N36,180",
                optionD = "N51,680",
                correctAnswerIndex = 3,
                explanation = "Circulating capital is another term for current assets. According to the balance sheet, current assets sum up to N51,680.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_010",
                subject = "Commerce",
                topic = "Business Finance, Turnover & Calculations",
                year = "1994",
                questionText = "Based on the balance sheet of MBV Enterprises, what is the working capital as at December 31, 1992?",
                optionA = "N65,250",
                optionB = "N60,000",
                optionC = "N48,650",
                optionD = "N41,950",
                correctAnswerIndex = 3,
                explanation = "Working Capital is calculated as Current Assets minus Current Liabilities: N51,680 (Current Assets) - N9,730 (Creditors / Current Liabilities) = N41,950.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_011",
                subject = "Commerce",
                topic = "Business Units, Combinations & Structure",
                year = "1994",
                questionText = "A company earned a total revenue of N108 million with a total cost of N91 million in 1991. If it paid 45% tax on its gross profit for that year, determine its net profit.",
                optionA = "N24.65 million.",
                optionB = "N17.00 million.",
                optionC = "N9.35 million.",
                optionD = "N7.65 million.",
                correctAnswerIndex = 2,
                explanation = "Gross Profit = N108m - N91m = N17m. Tax is 45% of N17m = N7.65m. Net Profit = N17m - N7.65m = N9.35 million.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_012",
                subject = "Commerce",
                topic = "Business Finance, Turnover & Calculations",
                year = "1994",
                questionText = "What are fixtures and fittings in a balance sheet?",
                optionA = "Liquid capital",
                optionB = "Current assets",
                optionC = "Fixed assets",
                optionD = "Working capital",
                correctAnswerIndex = 2,
                explanation = "Fixtures and fittings are long-term, tangible physical properties owned by a business for ongoing operations and are classified under fixed assets.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_013",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "Governments impose import duties for the following reasons EXCEPT",
                optionA = "to raise revenue for other services",
                optionB = "to act as a retaliatory measure against other governments",
                optionC = "to discourage the redistribution of income at home",
                optionD = "to protect home industries from external competition.",
                correctAnswerIndex = 2,
                explanation = "Import duties protect infant industries, raise state revenue, and retaliate against trade policies, but they are not used to discourage domestic income redistribution.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_014",
                subject = "Commerce",
                topic = "Business Units, Combinations & Structure",
                year = "1994",
                questionText = "A sole enterprise may flourish best in",
                optionA = "a mining business",
                optionB = "a retailing business",
                optionC = "an oil exploration business",
                optionD = "a car assembly business",
                correctAnswerIndex = 1,
                explanation = "Sole proprietorships excel in retailing due to low initial capital requirements, flexibility of operations, and the need for close personal contact with consumers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_015",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "The use of coin-operated machines to sell goods is a form of",
                optionA = "personal selling",
                optionB = "retailing",
                optionC = "wholesaling",
                optionD = "mail-order selling.",
                correctAnswerIndex = 1,
                explanation = "Vending machines are automated retailing mechanisms that sell goods in small quantities directly to final consumers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_016",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "What is a major function of the wholesaler?",
                optionA = "Buying from small-scale producers and selling to exporters.",
                optionB = "Distributing to consumers directly.",
                optionC = "Organizing cooperative retail stores.",
                optionD = "Providing information to manufacturers on market situation.",
                correctAnswerIndex = 3,
                explanation = "Wholesalers act as vital feedback links between retailers and manufacturers, providing valuable market research on consumers' preferences and demand trends.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_017",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "The rate at which a country’s exports exchange for its imports is called",
                optionA = "balance of payments",
                optionB = "balance of trade",
                optionC = "terms of payment",
                optionD = "terms of trade.",
                correctAnswerIndex = 3,
                explanation = "Terms of trade measure the ratio of a country's export price index to its import price index, reflecting the rate of commodity exchange.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_018",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "The difference between the total payments for imports and the receipts from exports within a given period is referred to as",
                optionA = "balance of payments",
                optionB = "balance of trade",
                optionC = "comparative cost advantage",
                optionD = "comparative advantage",
                correctAnswerIndex = 1,
                explanation = "The Balance of Trade is the net difference between the monetary value of a nation's exports and imports of physical, tangible merchandise.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_019",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "A pro forma invoice is NOT required when",
                optionA = "quoting for the supply of goods",
                optionB = "goods are sent on approval",
                optionC = "dealing regularly with a customer",
                optionD = "final prices are uncertain.",
                correctAnswerIndex = 2,
                explanation = "A pro forma invoice acts as a preliminary quotation or for goods on approval; regular customers are billed using standard commercial invoices.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_020",
                subject = "Commerce",
                topic = "Transportation & Logistics",
                year = "1994",
                questionText = "Which of the following statements is TRUE about sea transport?",
                optionA = "All ships have specific routes to ply.",
                optionB = "All ships must be insured at every journey",
                optionC = "All ships are insured separately from the crew",
                optionD = "All ships normally arrive at their destination with goods.",
                correctAnswerIndex = 2,
                explanation = "Under marine insurance law, ship hulls, cargo, and crews are covered under completely separate insurance policies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_021",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "The postal organization which preceded the Nigerian Postal Service was",
                optionA = "Post and Telecommunications",
                optionB = "Post and Telephone",
                optionC = "Post and Teleprinter",
                optionD = "Post and Telegraph.",
                correctAnswerIndex = 0,
                explanation = "Before NIPOST was established, postal and telecommunication services in Nigeria were run by the government department known as Post and Telecommunications (P&T).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_022",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "Goods discharged from ships on which import duties have not been paid are kept in the",
                optionA = "ordinary warehouse",
                optionB = "public warehouse",
                optionC = "private warehouse",
                optionD = "bonded warehouse.",
                correctAnswerIndex = 3,
                explanation = "A bonded warehouse is a secure, customs-controlled storage facility where dutiable goods are kept until import duties are fully paid.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_023",
                subject = "Commerce",
                topic = "Business Units, Combinations & Structure",
                year = "1994",
                questionText = "A sole proprietor insured his goods worth N200,000 for half the value. There was a fire incident in which goods valued at N80,000 were destroyed. The value of compensation expected from the insurer is",
                optionA = "N40,000",
                optionB = "N80,000",
                optionC = "N100,000",
                optionD = "N200,000",
                correctAnswerIndex = 0,
                explanation = "Under the Average Clause rule of insurance, compensation = (Sum Insured / Actual Value) * Actual Loss = (100,000 / 200,000) * 80,000 = N40,000.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_024",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "One of the effects of the devaluation of the Naira is that the",
                optionA = "goods that can be imported with the Naira have become cheaper",
                optionB = "value of other currencies relative to the Naira have become cheaper",
                optionC = "goods that can be exported from Nigeria have become costlier",
                optionD = "imports that can be bought with the Naira have become costlier.",
                correctAnswerIndex = 3,
                explanation = "Devaluation reduces the external value of a national currency, making foreign-produced import commodities far more expensive in domestic terms.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_025",
                subject = "Commerce",
                topic = "Banking, Finance & Commercial Instruments",
                year = "1994",
                questionText = "Drawing two parallel lines across a cheque means that it has to be paid into the account of the",
                optionA = "payee",
                optionB = "drawer",
                optionC = "drawee",
                optionD = "payer.",
                correctAnswerIndex = 0,
                explanation = "Crossing a cheque with two parallel lines serves as an instruction to paying banks that the cheque cannot be cashed over the counter; it must be paid directly into the payee's bank account.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_026",
                subject = "Commerce",
                topic = "Banking, Finance & Commercial Instruments",
                year = "1994",
                questionText = "The specialized bank established by the Federal Government to facilitate international trade is the",
                optionA = "Central Bank of Nigeria",
                optionB = "Federal Savings Bank",
                optionC = "Nigerian Industrial Development Bank",
                optionD = "Nigerian Export-Import Bank.",
                correctAnswerIndex = 3,
                explanation = "The Nigerian Export-Import Bank (NEXIM) provides credit guarantees, export credit insurance, and trade information to support international trade.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_027",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Which of the following is both a direct and indirect credit enterprise?",
                optionA = "Co-operative and thrift society.",
                optionB = "Retail co-operative society.",
                optionC = "Consumer co-operative society.",
                optionD = "Wholesaler co-operative society.",
                correctAnswerIndex = 0,
                explanation = "A cooperative thrift and credit society pools members' savings to directly advance cash loans and indirectly provide credit resources on favorable terms.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_028",
                subject = "Commerce",
                topic = "Capital & Stock Markets",
                year = "1994",
                questionText = "The business in the stock exchange is characterized essentially by",
                optionA = "dealing.",
                optionB = "brokerage",
                optionC = "speculation",
                optionD = "transactions.",
                correctAnswerIndex = 2,
                explanation = "The activities of brokers, bulls, bears, and stags on the stock exchange are highly speculatively oriented around expected future price changes of securities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_029",
                subject = "Commerce",
                topic = "Capital & Stock Markets",
                year = "1994",
                questionText = "The Second-Tier Securities Market is",
                optionA = "an appendage to the Nigerian Stock Exchange",
                optionB = "a member of the Nigeria Stock Exchange",
                optionC = "meant for the shares of the quoted private companies",
                optionD = "a regulating arm of the Nigeria Stock Exchange",
                correctAnswerIndex = 0,
                explanation = "The Second-Tier Securities Market (SSM) was established as an arm or appendage of the NSE to allow small and medium-scale indigenous firms to raise public capital.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_030",
                subject = "Commerce",
                topic = "Marketing, Promotion & Advertising",
                year = "1994",
                questionText = "The elements of the marketing mix are",
                optionA = "product, promotion, place and price.",
                optionB = "personal selling, advertising and research.",
                optionC = "promotion, production, place and price.",
                optionD = "procurement, price, product and place.",
                correctAnswerIndex = 0,
                explanation = "The standard marketing mix (the 4 Ps) comprises: Product, Price, Place (distribution), and Promotion.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_031",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Which of the following items has the shortest effect on the consumer?",
                optionA = "Fashion.",
                optionB = "Innovation.",
                optionC = "Fad",
                optionD = "Attribute.",
                correctAnswerIndex = 2,
                explanation = "A fad is an intense, short-lived consumer enthusiasm or fashion trend that emerges rapidly and declines just as quickly.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_032",
                subject = "Commerce",
                topic = "Marketing, Promotion & Advertising",
                year = "1994",
                questionText = "Which of the following is a form of sales promotion?",
                optionA = "Advertising on radio.",
                optionB = "Offering free samples.",
                optionC = "Distributing printed materials.",
                optionD = "Advertising on Television.",
                correctAnswerIndex = 1,
                explanation = "Sales promotions are short-term incentive schemes (e.g., free samples, discounts, coupons) designed to stimulate immediate consumer purchases.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_033",
                subject = "Commerce",
                topic = "Marketing, Promotion & Advertising",
                year = "1994",
                questionText = "One advantage of personal selling over all other elements of promotion is that",
                optionA = "it can provide instant feedback",
                optionB = "it is very cheap in terms of cost per contract",
                optionC = "it does not need to use mass media",
                optionD = "sales people are well trained.",
                correctAnswerIndex = 0,
                explanation = "Personal selling involves direct, face-to-face interaction, allowing the sales representative to receive and adapt to instant verbal and non-verbal feedback from the buyer.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_034",
                subject = "Commerce",
                topic = "Commercial Law & Government Policy",
                year = "1994",
                questionText = "Which of the following must be present in an agency by agreement?",
                optionA = "Intentions.",
                optionB = "Will.",
                optionC = "Consent.",
                optionD = "Authority.",
                correctAnswerIndex = 2,
                explanation = "An agency relationship created by agreement requires the mutual consent and meeting of minds of both the principal and the agent.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_035",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "An agreement to sell is distinguishable from a sale because in the former, the transfer of goods is",
                optionA = "not anticipated.",
                optionB = "not discussed.",
                optionC = "deferred.",
                optionD = "immediate.",
                correctAnswerIndex = 2,
                explanation = "In a sale, the transfer of ownership of the goods is immediate. In an agreement to sell, the transfer of title is deferred to a future date or subject to some conditions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_036",
                subject = "Commerce",
                topic = "Commercial Law & Government Policy",
                year = "1994",
                questionText = "Mr. Amusa says to Mr Bello 'I will sell you this hat for N30'. And Mr Bello replied 'I will pay N29'. The contract is",
                optionA = "an offer and acceptance",
                optionB = "an implied contract.",
                optionC = "a complete simple contract.",
                optionD = "an offer but no acceptance.",
                correctAnswerIndex = 3,
                explanation = "Mr. Bello's response is a counter-offer, which legally rejects and terminates the original offer. Therefore, there is an offer but no valid acceptance has occurred.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_037",
                subject = "Commerce",
                topic = "Transportation & Logistics",
                year = "1994",
                questionText = "Nationalization of an industry means that its ownership becomes that of",
                optionA = "government.",
                optionB = "shareholders.",
                optionC = "consumers.",
                optionD = "communities.",
                correctAnswerIndex = 0,
                explanation = "Nationalization is a state policy that compulsorily transfers ownership, control, and assets of private industries to the federal government.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_038",
                subject = "Commerce",
                topic = "Transportation & Logistics",
                year = "1994",
                questionText = "The pre-shipment inspection scheme was set up by the federal government in order to",
                optionA = "reverse Nigeria’s unfavourable balance.",
                optionB = "promote fair trade between Nigeria and other countries.",
                optionC = "counteract all fraudulent business deals of Nigerians with other nationals.",
                optionD = "ensure that imports into Nigeria are of the correct quality, value and quantity.",
                correctAnswerIndex = 3,
                explanation = "Pre-shipment inspection protects the economy by physically verifying the quality, technical specifications, value, and volume of foreign imports before shipment.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_039",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Which of the following has powers to order withdrawal of a particular food item from circulation?",
                optionA = "Standards Organisation of Nigeria.",
                optionB = "Federal High Courts in Nigeria.",
                optionC = "Food and Drugs Department of the Federal Ministry of Health.",
                optionD = "Local government health inspectors.",
                correctAnswerIndex = 2,
                explanation = "The Food and Drugs Department (or regulatory successors like NAFDAC) has the legal authority to order public recalls of adulterated, unsafe, or contaminated consumables.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_040",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Which of the following maxims negates the principle of collective bargaining?",
                optionA = "Individual employees have weak bargaining base.",
                optionB = "Individual employees attain strength when they come together in a union.",
                optionC = "Only members of the union can benefit from agreements negotiated by the union.",
                optionD = "Collective bargaining covers the vast majority of employees, whether union members or not.",
                correctAnswerIndex = 2,
                explanation = "Collective bargaining is designed to establish general working frameworks that cover and benefit all employees across the firm, regardless of union membership.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_041",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "NACCIMA stands for",
                optionA = "Nigerian-American Centre for Culture Industries, Mines and Arts",
                optionB = "Nigerian Association for Culture, Civics, Industries, Minerals and Arts",
                optionC = "National Agency for Culture, Civilization, Investments, Manufacturing and Agriculture",
                optionD = "Nigerian Association of Chambers of Commerce, Industries, Mines and Agriculture.",
                correctAnswerIndex = 3,
                explanation = "NACCIMA stands for the Nigerian Association of Chambers of Commerce, Industry, Mines and Agriculture, representing the private sector business voice.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_042",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "For the establishment of a powerful consumers’ association in Nigeria to exist, there must be",
                optionA = "financial and moral support from the public.",
                optionB = "honest and committed leadership.",
                optionC = "allocation of goods from the producers.",
                optionD = "freedom from external influence.",
                correctAnswerIndex = 1,
                explanation = "Developing structured, powerful consumer defense associations requires dedicated, highly principled, and honest leadership to mobilize citizens.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_043",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "Which of the following is the most important business resource?",
                optionA = "Money.",
                optionB = "Management",
                optionC = "Materials",
                optionD = "Manpower.",
                correctAnswerIndex = 3,
                explanation = "Manpower (human capital) is the most critical resource because humans coordinate, manage, and operate all other inanimate resources (money, machinery, materials).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_044",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "The harmonization of all individual and unit efforts in an organization is ensured through",
                optionA = "co-ordination",
                optionB = "motivation",
                optionC = "planning.",
                optionD = "leadership.",
                correctAnswerIndex = 0,
                explanation = "Coordination is the managerial process of unifying and synchronizing diverse organizational activities and objectives to achieve a common goal.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_045",
                subject = "Commerce",
                topic = "Management Principles & Social Responsibility",
                year = "1994",
                questionText = "The principle of span of control stipulates that",
                optionA = "an employee should report to only one superior",
                optionB = "managers must demand accountability from their subordinates",
                optionC = "resources have to be economized within the various divisions",
                optionD = "the number of employees reporting to one superior should be kept to a workable maximum.",
                correctAnswerIndex = 3,
                explanation = "Span of control defines the maximum number of direct subordinates a manager can supervise efficiently and effectively.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_046",
                subject = "Commerce",
                topic = "Nature of Commerce, Production & Trade",
                year = "1994",
                questionText = "Which of the following makes other functions of business its appendages?",
                optionA = "Production.",
                optionB = "Marketing.",
                optionC = "Finance.",
                optionD = "Personnel.",
                correctAnswerIndex = 1,
                explanation = "Under modern marketing philosophy, the business exists to satisfy consumer needs; thus, production, finance, and personnel are aligned around marketing outcomes.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_047",
                subject = "Commerce",
                topic = "Banking, Finance & Commercial Instruments",
                year = "1994",
                questionText = "The use of computers in modern banking industry is a reflection of",
                optionA = "competitive development",
                optionB = "scientific development",
                optionC = "economic development",
                optionD = "technological development",
                correctAnswerIndex = 3,
                explanation = "Adopting information systems, database servers, and computing machines in banking is a direct outcome of global technological development.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_048",
                subject = "Commerce",
                topic = "Business Units, Combinations & Structure",
                year = "1994",
                questionText = "When an oil exploring and mining company builds a health centre in one of the communities where it operates, such a company is",
                optionA = "currying favour from local people",
                optionB = "finding a way to spend excess profits",
                optionC = "fulfilling part of its social responsibility",
                optionD = "investing its idle funds.",
                correctAnswerIndex = 2,
                explanation = "Corporate Social Responsibility (CSR) requires corporate entities to contribute positively to the development and social welfare of host communities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_049",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "The West African Clearing House became legally operational on",
                optionA = "1st July, 1976",
                optionB = "25th June, 1975",
                optionC = "14th March, 1975",
                optionD = "3rd May, 1974",
                correctAnswerIndex = 0,
                explanation = "The West African Clearing House (WACH) was established in Freetown to handle multilateral settlements, becoming operational on July 1, 1976.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_1994_050",
                subject = "Commerce",
                topic = "International Trade & Regional Integration",
                year = "1994",
                questionText = "The Lake Chad Basin Commission was founded to enable member states to",
                optionA = "expand the volume of water in the Lake for fishing activity",
                optionB = "increase navigational activities on the lake",
                optionC = "dam the lake for electricity and agricultural purposes.",
                optionD = "co-ordinate their efforts in managing the use of the lake’s resources.",
                correctAnswerIndex = 3,
                explanation = "The LCBC was founded in 1964 by countries bordering Lake Chad to regulate and manage the scarce ecological, water, and fishery resources of the basin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce Past Question • 1994",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
